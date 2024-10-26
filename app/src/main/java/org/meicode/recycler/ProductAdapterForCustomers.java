package org.meicode.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide; // Include Glide dependency if using URLs

import java.util.List;

public class ProductAdapterForCustomers extends RecyclerView.Adapter<ProductAdapterForCustomers.ProductViewHolder> {
    private Context context;
    private List<ProductForSellers> productForSellersList;

    public ProductAdapterForCustomers(Context context, List<ProductForSellers> productForSellersList) {
        this.context = context;
        this.productForSellersList = productForSellersList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductForSellers productForSellers = productForSellersList.get(position);
        holder.productName.setText(productForSellers.getName());
        holder.productDescription.setText(productForSellers.getDescription());
        holder.productPrice.setText(String.format("$%.2f", productForSellers.getPrice())); // Format price

        // Load image - use Glide if you have URLs, else use drawable resources
        holder.productImage.setImageResource(productForSellers.getImageResourceId());
        // Glide.with(context).load(productForSellers.getImageUrl()).into(holder.productImage); // Uncomment if using URLs
    }

    @Override
    public int getItemCount() {
        return productForSellersList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView productName, productDescription, productPrice;
        ImageView productImage;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.item_name);
            productDescription = itemView.findViewById(R.id.item_description);
            productPrice = itemView.findViewById(R.id.item_price);
            productImage = itemView.findViewById(R.id.item_image);
        }
    }
}
