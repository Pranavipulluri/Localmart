package org.meicode.recycler;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class Seller_page_activity extends AppCompatActivity {
    private RecyclerView recyclerViewProductRequests;
    private RecyclerView productRecyclerView;
        private ProductAdapter productAdapter;
        private List<Product> productList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_seller);

            productRecyclerView = findViewById(R.id.recyclerview);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            recyclerViewProductRequests.setLayoutManager(gridLayoutManager);

            // Initialize the product list and adapter
            productList = new ArrayList<>();
            productAdapter = new ProductAdapter(this, productList);
            recyclerViewProductRequests.setAdapter(productAdapter);

            // Load mock data (or real data from your database)

            productRecyclerView.setLayoutManager(new LinearLayoutManager(this));

            // Initialize product list and populate with sample data
            // Inside your activity or fragment
            productList = new ArrayList<>();
            productList.add(new Product("Product 1", "Description of Product 1", 9.99, R.drawable.sample_image));
            productList.add(new Product("Product 2", "Description of Product 2", 19.99, R.drawable.sample_image));
            productList.add(new Product("Product 3", "Description of Product 3", 29.99, R.drawable.sample_image));
// Add more products as needed

            // Add more products as needed

            // Set up the adapter
            productAdapter = new ProductAdapter(this, productList);
            productRecyclerView.setAdapter(productAdapter);
        }


}
