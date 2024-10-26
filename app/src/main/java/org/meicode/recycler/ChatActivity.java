package org.meicode.recycler;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;
    private List<Chat> chatList;  // List of chats with customers

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize chat list
        chatList = new ArrayList<>();
        // Add sample chats (ensure Chat class has appropriate constructor)
        chatList.add(new Chat("1", "Customer 1", "Hi, is this item available?"));
        chatList.add(new Chat("2", "Customer 2", "Can I get a discount on this?"));

        // Set up adapter
        chatAdapter = new ChatAdapter(this, chatList);
        recyclerView.setAdapter(chatAdapter);

        // Set up item click listener
        chatAdapter.setOnItemClickListener(new ChatAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Chat clickedChat = chatList.get(position);
                Intent intent = new Intent(ChatActivity.this, MessageActivity.class);
                intent.putExtra("customerId", clickedChat.getCustomerId());
                startActivity(intent);
            }
        });

        // Set up search functionality
        EditText searchInput = findViewById(R.id.searchInput);
        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterChats(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void filterChats(String query) {
        List<Chat> filteredList = new ArrayList<>();
        for (Chat chat : chatList) {
            if (chat.getCustomerName().toLowerCase().contains(query.toLowerCase()) ||
                    chat.getLastMessage().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(chat);
            }
        }
        chatAdapter.updateChatList(filteredList); // Ensure this method exists in your adapter
    }
}
