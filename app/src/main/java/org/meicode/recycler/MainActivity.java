package org.meicode.recycler;

import static org.meicode.recycler.R.id.nav_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MenuItem;

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
    private ProductAdapter productAdapter;
    private List<BoutiqueShop> boutiqueShops;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home as default selected item
        bottomNavigationView.setSelectedItemId(nav_home);


        // RecyclerView setup
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Fetch product data from your data source
        boutiqueShops = DataProvider.getBoutiqueShops(); // Ensure DataProvider is defined and returning data
        productList = new ArrayList<>();

        for (BoutiqueShop shop : boutiqueShops) {
            productList.addAll(shop.getProducts());
        }

        // Setup the RecyclerView Adapter
        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);

        // Firebase Token Handling
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(task -> {
            if (!task.isSuccessful()) {
                Log.w(TAG, "Fetching FCM token failed", task.getException());
                return;
            }

            // Get the new FCM token
            String token = task.getResult();
            Log.d(TAG, "FCM Token: " + token);

            // You can send the token to your server for further use
            sendRegistrationToServer(token);
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_home) {
                    // Handle home action
                    return true;
                } else if (id == R.id.nav_chat) {
                    // Navigate to ChatActivity
                    Intent chatIntent = new Intent(MainActivity.this, ChatActivity.class);
                    startActivity(chatIntent);
                    return true;
                } else if (id == R.id.nav_search) {
                    // Navigate to ProfileActivity
                    Intent profileIntent = new Intent(MainActivity.this, SearchActivity.class);
                    startActivity(profileIntent);
                    return true;
                }
                return false;
            }
        });


    }

    // Method to send FCM token to your app's server
    private void sendRegistrationToServer(String token) {
        // Implement your server communication logic here
        Log.d(TAG, "Sending token to server: " + token);
    }
}
