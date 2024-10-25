package org.meicode.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductRequestAdapter extends RecyclerView.Adapter<ProductRequestAdapter.ViewHolder> {

    private List<ProductRequest> productRequests;

    public ProductRequestAdapter(List<ProductRequest> productRequests) {
        this.productRequests = productRequests;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product_request, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductRequest productRequest = productRequests.get(position);
        holder.productDescription.setText(productRequest.getDescription());
        holder.userDetails.setText(productRequest.getUserDetails());
        holder.productImage.setImageResource(productRequest.getImageResourceId());

        holder.messageCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the message button click
                // You can implement your messaging logic here
            }
        });
    }

    @Override
    public int getItemCount() {
        return productRequests.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productDescription;
        TextView userDetails;
        Button messageCustomerButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productDescription = itemView.findViewById(R.id.productDescription);
            userDetails = itemView.findViewById(R.id.userDetails);
            messageCustomerButton = itemView.findViewById(R.id.messageCustomerButton);
        }
    }
}
