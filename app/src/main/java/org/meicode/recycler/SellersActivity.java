package org.meicode.recycler;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SellersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductRequestAdapter productRequestAdapter;
    private List<ProductRequest> productRequests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellers); // Ensure this matches your layout file

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewProductRequests);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create mock data
        productRequests = createMockData();

        // Set up the adapter
        productRequestAdapter = new ProductRequestAdapter(productRequests);
        recyclerView.setAdapter(productRequestAdapter);

        // Initialize buttons
        View profileButton = findViewById(R.id.profileButton);
        ImageButton messageButton = findViewById(R.id.messageButton);

        // Set click listener on profileButton
        profileButton.setOnClickListener(v -> {
            // Start SellerPageActivity
            Intent intent = new Intent(SellersActivity.this, SellerPageActivity.class);
            startActivity(intent);
        });

        // Set click listener on messageButton
        messageButton.setOnClickListener(v -> {
            Log.d("SellersActivity", "Message button clicked!");
            Intent intent = new Intent(SellersActivity.this, ChatActivity.class);
            startActivity(intent);
        });
    }

    private List<ProductRequest> createMockData() {
        List<ProductRequest> requests = new ArrayList<>();
        requests.add(new ProductRequest("Need a dress tailored for an event.", "User 1", R.drawable.sample_image));
        requests.add(new ProductRequest("Looking for custom furniture design.", "User 2", R.drawable.sample_image));
        requests.add(new ProductRequest("Urgent repair needed for my bicycle.", "User 3", R.drawable.sample_image));
        requests.add(new ProductRequest("Need a cake for a birthday party.", "User 4", R.drawable.sample_image));
        requests.add(new ProductRequest("Seeking a photographer for an event.", "User 5", R.drawable.sample_image));
        return requests;
    }
}
