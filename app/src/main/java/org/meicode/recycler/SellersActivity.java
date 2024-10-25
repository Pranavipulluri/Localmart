package org.meicode.recycler;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SellersActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductRequestAdapter productRequestAdapter;
    private List<ProductRequest> productRequests;
    private EditText messageEditText;
    private ImageButton sendMessageButton;
    private ImageView profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellers); // Ensure you create activity_sellers.xml

        recyclerView = findViewById(R.id.recyclerViewProductRequests);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data for product requests
        productRequests = new ArrayList<>();
        productRequests.add(new ProductRequest("Sample Product 1", "User 1", R.drawable.sample_image));
        productRequests.add(new ProductRequest("Sample Product 2", "User 2", R.drawable.sample_image));
        productRequests.add(new ProductRequest("Sample Product 3", "User 3", R.drawable.sample_image));

        // Initialize adapter and set it to RecyclerView
        productRequestAdapter = new ProductRequestAdapter(productRequests);
        recyclerView.setAdapter(productRequestAdapter);

        // Initialize UI elements
        sendMessageButton = findViewById(R.id.messageButton);
        profileImageView = findViewById(R.id.profileButton);

        // Set up send message button click listener
        sendMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageEditText.getText().toString().trim();
                if (!message.isEmpty()) {
                    // Handle sending the message (you can add your logic here)
                    messageEditText.setText(""); // Clear the message box
                }
            }
        });

        // Set up profile image click listener
        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle profile icon click (you can navigate to the profile activity)
            }
        });
    }
}
