package org.meicode.recycler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private Context context;
    private List<Item> itemList;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView, mapsIcon;
        public TextView nameView, descriptionView, shopNameView, phoneNumberView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_image);
            nameView = itemView.findViewById(R.id.item_name);
            descriptionView = itemView.findViewById(R.id.item_description);
            shopNameView = itemView.findViewById(R.id.shop_name);
            phoneNumberView = itemView.findViewById(R.id.phone_number);
            mapsIcon = itemView.findViewById(R.id.maps_icon);
        }
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        final Item currentItem = itemList.get(position);

        // Set data to views
        holder.imageView.setImageResource(currentItem.getImageResId());
        holder.nameView.setText(currentItem.getName());
        holder.descriptionView.setText(currentItem.getDescription());
        holder.shopNameView.setText(currentItem.getShopName());
        holder.phoneNumberView.setText(currentItem.getPhoneNumber());

        // Set the maps icon click listener
        holder.mapsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open map using Intent
                Uri gmmIntentUri = Uri.parse(currentItem.getMapUrl());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                context.startActivity(mapIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
