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

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Context context;
    private List<Product> productList;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        // Set data to the views
        holder.productName.setText(product.getName());
        holder.productDescription.setText(product.getDescription());
        // Inside onBindViewHolder
        Glide.with(context).load(product.getImageUrl()).into(holder.productImage);
        holder.maps_Icon.setOnClickListener(v -> openMap(product.getShopLocation()));




        // Load the product image using Picasso or any other image loading library
        Picasso.get().load(product.getImageUrl()).into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        public View maps_Icon;
        TextView productName, productDescription;
        ImageView productImage;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            productName = itemView.findViewById(R.id.item_name);
            productDescription = itemView.findViewById(R.id.item_description);
            productImage = itemView.findViewById(R.id.item_image);
            maps_Icon=itemView.findViewById(R.id.maps_icon);
        }
    }
    private void openMap(String location) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(mapIntent);
        }
    }

}
