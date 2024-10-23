package org.meicode.recycler;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<BoutiqueShop> getBoutiqueShops() {
        List<BoutiqueShop> shops = new ArrayList<>();

        // Fashion Boutique with 5 products
        List<Product> fashionBoutiqueProducts = new ArrayList<>();
        fashionBoutiqueProducts.add(new Product("Floral Maxi Dress", "A beautiful floral pattern maxi dress perfect for summer outings.", 49.99, "https://sycron.in/cdn/shop/files/WhatsAppImage2024-05-27at11.21.30AM_1.jpg?v=1716794440","123 Fashion St, Fashion City, FC 12345"));
        fashionBoutiqueProducts.add(new Product("Little Black Dress", "A classic little black dress suitable for formal occasions.", 39.99, "https://i.etsystatic.com/5998005/r/il/020066/3368094161/il_570xN.3368094161_nze7.jpg","123 Fashion St, Fashion City, FC 12345"));
        fashionBoutiqueProducts.add(new Product("Summer Sundress", "A lightweight sundress ideal for beach days.", 29.99, "https://i5.walmartimages.com/asr/a2cc832e-da70-415d-8ef0-1eca2f274da7.8eb0230778effb167037f7b02f86c3f7.jpeg?odnHeight=768&odnWidth=768&odnBg=FFFFFF","123 Fashion St, Fashion City, FC 12345"));
        fashionBoutiqueProducts.add(new Product("Vintage Midi Dress", "A retro-style midi dress with a modern twist.", 45.00, "https://www.astore.in/cdn/shop/products/product-image-1602813960.jpg?v=1624451049","123 Fashion St, Fashion City, FC 12345"));
        fashionBoutiqueProducts.add(new Product("Casual Shift Dress", "A comfy shift dress perfect for casual wear.", 35.00, "https://i.pinimg.com/736x/66/b7/52/66b75231192c830f19f6b9617fc3a616.jpg","123 Fashion St, Fashion City, FC 12345"));

        shops.add(new BoutiqueShop("Fashion Boutique", "123-456-7890", fashionBoutiqueProducts));

        // Chic Boutique with 5 products
        List<Product> chicBoutiqueProducts = new ArrayList<>();
        chicBoutiqueProducts.add(new Product("Bohemian Style Dress", "A flowing bohemian dress that embodies carefree spirit.", 54.99, "https://m.media-amazon.com/images/I/81TgprQAFHL._AC_UY350_.jpg","123 Fashion St, Fashion City, FC 12345"));
        chicBoutiqueProducts.add(new Product("Elegant Evening Gown", "A stunning gown designed for evening events.", 120.00, "https://i.pinimg.com/736x/b4/4c/eb/b44cebe6b4a31edbe7bddfabd1699e25.jpg","123 Fashion St, Fashion City, FC 12345"));
        chicBoutiqueProducts.add(new Product("Ruffled A-Line Dress", "A playful A-line dress with ruffled detailing.", 42.50, "https://assets.ajio.com/medias/sys_master/root/20240727/7ilW/66a45f036f60443f31c975e8/-473Wx593H-465830121-red-MODEL3.jpg","123 Fashion St, Fashion City, FC 12345"));
        chicBoutiqueProducts.add(new Product("Off-Shoulder Dress", "A stylish off-shoulder dress for summer parties.", 38.00, "https://www.vastranand.in/cdn/shop/files/3_7c689a4e-bb0c-4751-b56a-0bab985e19b2.jpg?v=1723193069","123 Fashion St, Fashion City, FC 12345"));
        chicBoutiqueProducts.add(new Product("Denim Dress", "A trendy denim dress for a casual day out.", 30.00, "https://freakins.com/cdn/shop/products/Image23501-Edit.jpg?v=1668769141&width=1085","123 Fashion St, Fashion City, FC 12345"));

        shops.add(new BoutiqueShop("Chic Boutique", "987-654-3210", chicBoutiqueProducts));

        // Trendy Styles with 5 products
        List<Product> trendyStylesProducts = new ArrayList<>();
        trendyStylesProducts.add(new Product("Bodycon Dress", "A sleek bodycon dress that hugs your curves.", 49.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrHK_TSOxrWu3FgrcCJllCM9SsHGOdiuoMPmZvFcY19KFnjnsuFEKYEmwGfbjVByBB7H8&usqp=CAU","123 Fashion St, Fashion City, FC 12345"));
        trendyStylesProducts.add(new Product("Midi Wrap Dress", "A versatile wrap dress that can be dressed up or down.", 40.00, "https://assets.myntassets.com/w_412,q_60,dpr_2,fl_progressive/assets/images/28619976/2024/4/2/236154db-2b37-4f82-ac5e-15ac15e7784b1712051297291StyleCastxRevolteMidiDress1.jpg","123 Fashion St, Fashion City, FC 12345"));
        trendyStylesProducts.add(new Product("Printed Maxi Dress", "A colorful printed maxi dress for a vibrant look.", 59.99, "https://assets.myntassets.com/h_1440,q_100,w_1080/v1/assets/images/8960855/2024/5/3/4abcb541-aa9a-4f01-af67-df9d2d414da31714731417396-Nayo-Coffee-Brown-Shirt-Cotton-Maxi-Dress-5731714731416896-1.jpg","123 Fashion St, Fashion City, FC 12345"));
        trendyStylesProducts.add(new Product("Sheath Dress", "A tailored sheath dress perfect for the office.", 45.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOiU0wLdj74G9bAmBRVuZ3MjhUtHgDgafALQ&s","123 Fashion St, Fashion City, FC 12345"));
        trendyStylesProducts.add(new Product("High-Low Dress", "A chic high-low dress for special occasions.", 55.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxbk2u6V8Q2vtARfyBU4ghuMGEgXULpxH2CSYx2h-bRnWcekClcka20P_g7nVgEi4Jn7k&usqp=CAU","123 Fashion St, Fashion City, FC 12345"));

        shops.add(new BoutiqueShop("Trendy Styles", "456-789-1234", trendyStylesProducts));

        // Add more shops as necessary...

        return shops;
    }

    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        // You can create a separate list of products here if needed
        return products;
    }
}
