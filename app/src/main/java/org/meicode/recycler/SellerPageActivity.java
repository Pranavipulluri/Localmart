package org.meicode.recycler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // Import Button class

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SellerPageActivity extends AppCompatActivity {
    private RecyclerView recyclerViewProductRequests;
    private ProductAdapterForCustomers productAdapter; // Ensure consistent naming
    private List<ProductForSellers> productForSellersList;
    private Button addProductButton; // Declare Button variable

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_page); // Ensure this matches your layout file

        // Initialize RecyclerView for product requests
        recyclerViewProductRequests = findViewById(R.id.recyclerViewProductRequests);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewProductRequests.setLayoutManager(gridLayoutManager);

        // Initialize the product list
        productForSellersList = new ArrayList<>(); // Initialize the list to avoid null issues

        // Populate with sample data if needed
        productForSellersList.add(new ProductForSellers("Product 1", "Description of Product 1", 9.99, Uri.parse("android.resource://org.meicode.recycler/drawable/sample_image")));
        productForSellersList.add(new ProductForSellers("Product 2", "Description of Product 2", 19.99, Uri.parse("android.resource://org.meicode.recycler/drawable/sample_image")));
        productForSellersList.add(new ProductForSellers("Product 3", "Description of Product 3", 29.99, Uri.parse("android.resource://org.meicode.recycler/drawable/sample_image")));

        // Set up the adapter with the initialized list
        productAdapter = new ProductAdapterForCustomers(this, productForSellersList);
        recyclerViewProductRequests.setAdapter(productAdapter);

        // Initialize the Add Product button
        addProductButton = findViewById(R.id.addProductButton);

        // Set onClickListener for the Add Product button
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerPageActivity.this, AddProductActivity.class);
                startActivityForResult(intent, 100);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            // Get the product data from the result
            String name = data.getStringExtra("productName");
            String description = data.getStringExtra("productDescription");
            double price = data.getDoubleExtra("productPrice", 0.0);
            String imageUriString = data.getStringExtra("productImageUri");

            Uri imageUri = Uri.parse(imageUriString);

            // Create a new ProductForSellers object
            ProductForSellers newProduct = new ProductForSellers(name, description, price, imageUri);

            // Add the new product to the list and notify the adapter
            productForSellersList.add(newProduct);
            productAdapter.notifyItemInserted(productForSellersList.size() - 1);
        }
    }

}
;