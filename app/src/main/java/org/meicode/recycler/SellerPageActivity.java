package org.meicode.recycler;

import android.content.Intent;
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
    private ProductAdapters productAdapter; // Ensure consistent naming
    private List<Product> productList;
    private Button addProductButton; // Declare Button variable

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_page); // Ensure this matches your layout file

        // Initialize RecyclerView for product requests
        recyclerViewProductRequests = findViewById(R.id.recyclerViewProductRequests);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewProductRequests.setLayoutManager(gridLayoutManager);

        // Initialize product list and populate with sample data
        productList = new ArrayList<>();
        productList.add(new Product("Product 1", "Description of Product 1", 9.99, R.drawable.sample_image));
        productList.add(new Product("Product 2", "Description of Product 2", 19.99, R.drawable.sample_image));
        productList.add(new Product("Product 3", "Description of Product 3", 29.99, R.drawable.sample_image));
        // Add more products as needed

        // Set up the adapter
        productAdapter = new ProductAdapters(this, productList); // Ensure consistent naming
        recyclerViewProductRequests.setAdapter(productAdapter);

        // Initialize the Add Product button
        addProductButton = findViewById(R.id.addProductButton); // Ensure this ID matches your layout

        // Set onClickListener for the Add Product button
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerPageActivity.this, AddProductActivity.class);
                startActivity(intent);
            }
        });
    }
}
