package org.meicode.recycler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddProductActivity extends AppCompatActivity {
    private static final int IMAGE_REQUEST_CODE = 1; // Define a constant for request code
    private ImageView cameraIcon;
    private EditText productName, productDescription, productPrice;
    private Button uploadProductButton;
    private Uri productImageUri; // To store the image URI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);

        // Initialize views
        cameraIcon = findViewById(R.id.cameraIcon);
        productName = findViewById(R.id.productName);
        productDescription = findViewById(R.id.productDescription);
        productPrice = findViewById(R.id.productPrice);
        uploadProductButton = findViewById(R.id.uploadProductButton);

        // Set onClickListener for the camera icon
        cameraIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open gallery or camera to select an image
                openImageChooser();
            }
        });

        // Set onClickListener for the upload button
        uploadProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadProduct();
            }
        });
    }

    private void openImageChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), IMAGE_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK && data != null && data.getData() != null) {
            productImageUri = data.getData();
            cameraIcon.setImageURI(productImageUri); // Display selected image
        }
    }

    private void uploadProduct() {
        String name = productName.getText().toString().trim();
        String description = productDescription.getText().toString().trim();
        String priceString = productPrice.getText().toString().trim();

        // Check for empty fields and image
        if (name.isEmpty() || description.isEmpty() || priceString.isEmpty() || productImageUri == null) {
            Toast.makeText(this, "Please fill in all fields and select an image", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double price = Double.parseDouble(priceString); // Parse price
            // Create an Intent to hold the product data
            Intent resultIntent = new Intent();
            resultIntent.putExtra("productName", name);
            resultIntent.putExtra("productDescription", description);
            resultIntent.putExtra("productPrice", price);
            resultIntent.putExtra("productImageUri", productImageUri.toString()); // Pass the image URI as a string

            // Set the result and finish the activity
            setResult(RESULT_OK, resultIntent);
            Toast.makeText(this, "Product uploaded successfully!", Toast.LENGTH_SHORT).show();
            finish();
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter a valid price", Toast.LENGTH_SHORT).show();
        }
    }


}
