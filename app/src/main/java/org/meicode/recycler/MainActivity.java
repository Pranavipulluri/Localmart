package org.meicode.recycler;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private RecyclerView recyclerView;
    private ProductAdapterForSellers productAdapterForSellers;
    private List<BoutiqueShop> boutiqueShops;
    private List<ProductForCustomers> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // RecyclerView setup
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Fetch product data from DataProvider (assuming DataProvider is correctly set up)
        boutiqueShops = DataProvider.getBoutiqueShops();  // Ensure DataProvider is defined and returns data
        productList = new ArrayList<>();

        for (BoutiqueShop shop : boutiqueShops) {
            productList.addAll(shop.getProducts());  // Ensure getProducts() returns List<Products>
        }

        // Setup the RecyclerView Adapter
        productAdapterForSellers = new ProductAdapterForSellers(this, productList);
        recyclerView.setAdapter(productAdapterForSellers);

        // Firebase Token Handling
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(task -> {
            if (!task.isSuccessful()) {
                Log.w(TAG, "Fetching FCM token failed", task.getException());
                return;
            }

            // Get the new FCM token
            String token = task.getResult();
            Log.d(TAG, "FCM Token: " + token);

            // Send token to your server
            sendRegistrationToServer(token);
        });
        View addButton = findViewById(R.id.icon2);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to AddActivity
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });

        // Bottom Navigation item selection handling

    }

    // Method to send FCM token to your app's server
    private void sendRegistrationToServer(String token) {
        // Implement server communication logic here
        Log.d(TAG, "Sending token to server: " + token);
    }
}
