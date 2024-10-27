package org.meicode.recycler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SellerPageActivity extends AppCompatActivity {
    private RecyclerView recyclerViewProductRequests;
    private ProductAdapterForCustomers productAdapter;
    private List<ProductForSellers> productForSellersList;
    private Button addProductButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_page);

        recyclerViewProductRequests = findViewById(R.id.recyclerViewProductRequests);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewProductRequests.setLayoutManager(gridLayoutManager);

        productForSellersList = new ArrayList<>();

        // Retrieve products from the database
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        productForSellersList.addAll(dbHelper.getAllProducts()); // Get products from database

        productAdapter = new ProductAdapterForCustomers(this, productForSellersList);
        recyclerViewProductRequests.setAdapter(productAdapter);

        addProductButton = findViewById(R.id.addProductButton);
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
            String name = data.getStringExtra("productName");
            String description = data.getStringExtra("productDescription");
            double price = data.getDoubleExtra("productPrice", 0.0);
            String imageUriString = data.getStringExtra("productImageUri");

            Uri imageUri = Uri.parse(imageUriString);
            ProductForSellers newProduct = new ProductForSellers(name, description, price, imageUri);

            // Add the new product to the list and notify the adapter
            productForSellersList.add(newProduct);
            productAdapter.notifyItemInserted(productForSellersList.size() - 1);
        }
    }
}
