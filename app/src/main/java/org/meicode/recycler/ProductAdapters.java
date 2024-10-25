package org.meicode.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapters extends RecyclerView.Adapter<ProductAdapters.ProductViewHolder> {
    private Context context;
    private List<Product> productList;

    public ProductAdapters(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_product, parent, false); // Ensure this layout file exists
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.productName.setText(product.getName());
        holder.productDescription.setText(product.getDescription());
        holder.productPrice.setText(String.valueOf(product.getPrice()));
        holder.productImage.setImageResource(product.getImageResourceId()); // Ensure this is correct
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView productName, productDescription, productPrice;
        ImageView productImage;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.item_name); // Ensure this ID exists in your item layout
            productDescription = itemView.findViewById(R.id.item_description); // Ensure this ID exists in your item layout
            productPrice = itemView.findViewById(R.id.item_price); // Ensure this ID exists in your item layout
            productImage = itemView.findViewById(R.id.item_image); // Ensure this ID exists in your item layout
        }
    }
}
