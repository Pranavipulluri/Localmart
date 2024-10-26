package org.meicode.recycler;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChatsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<User> userList;  // List of users

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);  // Make sure this layout exists

        recyclerView = findViewById(R.id.userRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize user list
        userList = new ArrayList<>();
        // Add sample users (replace with dynamic data later)
        userList.add(new User("1", "John Doe", "john@example.com"));
        userList.add(new User("2", "Jane Smith", "jane@example.com"));

        // Set up adapter
        userAdapter = new UserAdapter(userList);
        recyclerView.setAdapter(userAdapter);

        // Handle item click
        userAdapter.setOnItemClickListener(position -> {
            User clickedUser = userList.get(position);
            if (clickedUser != null) {  // Check for null to avoid crashes
                // Navigate to MessageActivity, passing user ID or details
                Intent intent = new Intent(ChatsActivity.this, MessageActivity.class);
                intent.putExtra("userId", clickedUser.getId()); // Pass the user ID to the message activity
                startActivity(intent);
            }
        });
    }
}
