package org.meicode.recycler;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity extends AppCompatActivity {

    private ImageView cameraIcon;
    private EditText descriptionEditText;
    private Button searchButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_page); // Ensure this matches your layout file name

        // Initialize UI components
        cameraIcon = findViewById(R.id.camera_icon);
        descriptionEditText = findViewById(R.id.description_edit_text);
        searchButton = findViewById(R.id.search_button);

        // Set click listener for camera icon
        cameraIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });

        // Set click listener for search button
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performSearch();
            }
        });
    }

    private void openCamera() {
        // Intent to open camera (assuming you want to capture an image)
        Intent cameraIntent = new Intent(Intent.ACTION_MANAGE_PACKAGE_STORAGE);
        if (cameraIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(cameraIntent, 1);
        }
    }

    private void performSearch() {
        String description = descriptionEditText.getText().toString().trim();
        if (!description.isEmpty()) {
            // Perform search action (this could involve sending the description to another activity or API)
            // For now, let's just log it
            System.out.println("Searching for: " + description);
            // You could start a new activity here if needed
        } else {
            // Handle empty description (e.g., show a toast)
            Toast.makeText(this, "Please enter a description", Toast.LENGTH_SHORT).show();
        }
    }
}
