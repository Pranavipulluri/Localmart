package org.meicode.recycler;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ProductFragment extends Fragment {

    private RecyclerView recyclerView;
    private ProductAdapterForSellers productAdapterForSellers;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Assuming you're using the first boutique's products for now
        productAdapterForSellers = new ProductAdapterForSellers(requireActivity(), DataProvider.getBoutiqueShops().get(0).getProducts());
        recyclerView.setAdapter(productAdapterForSellers);

        return view;
    }
}
