package org.meicode.recycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Get the product data from DataProvider
        List<BoutiqueShop> boutiqueShops = DataProvider.getBoutiqueShops();
        List<Product> productList = new ArrayList<>();

        // Loop through each boutique and add its products to the product list
        for (BoutiqueShop shop : boutiqueShops) {
            productList.addAll(shop.getProducts());
        }

        // Set up the adapter with the product list
        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);
    }
}
