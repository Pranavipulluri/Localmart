package org.meicode.recycler;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SellcustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellcustom);

        // Button for Sellers
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button sellersButton = findViewById(R.id.button);
        sellersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("SellcustomActivity", "Sellers button clicked");
                Intent intent = new Intent(SellcustomActivity.this, SellersActivity.class);
                startActivity(intent);
            }
        });


        // Button for Customers
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button customersButton = findViewById(R.id.button2);
        customersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellcustomActivity.this, MainActivity.class); // Or your CustomerActivity
                startActivity(intent);
            }
        });


    }
}

