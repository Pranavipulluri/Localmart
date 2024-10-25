package org.meicode.recycler; // Replace with your package name

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SellersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductRequestAdapter productRequestAdapter;
    private List<ProductRequest> productRequests;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellers); // Make sure this matches your layout file

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewProductRequests);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create mock data
        productRequests = new ArrayList<>();
        productRequests.add(new ProductRequest("Need a dress tailored for an event.", "User 1", R.drawable.sample_image));
        productRequests.add(new ProductRequest("Looking for custom furniture design.", "User 2", R.drawable.sample_image));
        productRequests.add(new ProductRequest("Urgent repair needed for my bicycle.", "User 3", R.drawable.sample_image));
        productRequests.add(new ProductRequest("Need a cake for a birthday party.", "User 4", R.drawable.sample_image));
        productRequests.add(new ProductRequest("Seeking a photographer for an event.", "User 5", R.drawable.sample_image));

        // Set up the adapter
        productRequestAdapter = new ProductRequestAdapter(productRequests);
        recyclerView.setAdapter(productRequestAdapter);
    }
}
