package org.meicode.recycler;

import java.util.Arrays;
import java.util.List;

public class GeneralProvider {
    public static List<GeneralStore> getGeneralStores() {
        // Creating items for Store A
        List<GeneralItem> storeAItems = Arrays.asList(
                new GeneralItem("Notebook", "A5 spiral-bound notebook.", 5.99, "https://th.bing.com/th/id/R.c5b52737a653c921d80fa6634c6e65ca?rik=D8DFtH6865LD7A&riu=http%3a%2f%2fg-ecx.images-amazon.com%2fimages%2fG%2f01%2faplusautomation%2fvendorimages%2ffddc79ee-7b83-49b2-8699-75fa60c97bd0.jpg._CB316418626_.jpg&ehk=GZ52rdUuNkl14iIZy4i8VszGts781pQpfNpBIYFmmWg%3d&risl=&pid=ImgRaw&r=0", "Store A", "123 Main St"),
                new GeneralItem("Pen", "Blue ink ballpoint pen.", 1.99, "https://th.bing.com/th/id/OIP.iQNcT69NsTNT5mWAwXwVEAAAAA?rs=1&pid=ImgDetMain", "Store A", "123 Main St"),
                new GeneralItem("Eraser", "Soft rubber eraser.", 0.99, "https://upload.wikimedia.org/wikipedia/commons/e/e8/Office-pink-erasers.jpg", "Store A", "123 Main St")
        );

        // Creating items for Store B
        List<GeneralItem> storeBItems = Arrays.asList(
                new GeneralItem("Shampoo", "Hydrating shampoo for dry hair.", 12.99, "https://i5.walmartimages.com/asr/6518ee99-5914-4788-850b-dd74a760f4af.585ee92a94d078307efdbab8a80ad769.jpeg", "Store B", "456 Elm St"),
                new GeneralItem("Conditioner", "Moisturizing conditioner.", 13.99, "https://th.bing.com/th/id/OIP.vcazoHUO2UdefQTRYny2PAHaHa?rs=1&pid=ImgDetMain", "Store B", "456 Elm St"),
                new GeneralItem("Body Wash", "Gentle body wash.", 8.99, "https://i5.walmartimages.com/asr/6ef2df7c-6e5d-42ff-ab23-99d45f1b8ec3.e32b8c2950e1ed0ba16c7065a4dd7cf6.jpeg", "Store B", "456 Elm St")
        );

        // Creating items for Store C
        List<GeneralItem> storeCItems = Arrays.asList(
                new GeneralItem("T-shirt", "Cotton t-shirt in various sizes.", 19.99, "https://th.bing.com/th/id/OIP.DSjZPk9uy01_f2ox4Q5QPgAAAA?rs=1&pid=ImgDetMain", "Store C", "789 Oak St"),
                new GeneralItem("Jeans", "Classic blue jeans.", 39.99, "https://handcmediastorage.blob.core.windows.net/productimages/WB/WBPZW001-Z33-137779-1400px-1820px.jpg", "Store C", "789 Oak St"),
                new GeneralItem("Jacket", "Stylish denim jacket.", 49.99, "https://th.bing.com/th/id/OIP.vlA-xZTnqxU2Z5XVYEaf-wAAAA?rs=1&pid=ImgDetMain", "Store C", "789 Oak St")
        );

        // Creating items for Store D
        List<GeneralItem> storeDItems = Arrays.asList(
                new GeneralItem("Coffee Maker", "12-cup coffee maker.", 59.99, "https://m.media-amazon.com/images/S/aplus-media/vc/77adf756-b940-4934-9919-0e87b1f80681.jpg", "Store D", "101 Pine St"),
                new GeneralItem("Toaster", "2-slice toaster.", 29.99, "https://m.media-amazon.com/images/I/71n-oeNV6BL.jpg", "Store D", "101 Pine St"),
                new GeneralItem("Blender", "High-speed blender.", 79.99, "https://assets.macysassets.com/dyn_img/creativepages/105-14Q7100006.jpg", "Store D", "101 Pine St")
        );

        // Creating items for Store E
        List<GeneralItem> storeEItems = Arrays.asList(
                new GeneralItem("Fiction Book", "Best-selling fiction novel.", 14.99, "https://th.bing.com/th/id/OIP._Ot9QXnESCkCo3Ir8E4DJgHaLL?rs=1&pid=ImgDetMain", "Store E", "202 Cedar St"),
                new GeneralItem("Non-Fiction Book", "Informative non-fiction book.", 16.99, "https://i0.wp.com/www.geekguruji.com/wp-content/uploads/2017/11/best-novels-of-the-21st-century.jpg?resize=300%2C442", "Store E", "202 Cedar St"),
                new GeneralItem("Magazine", "Latest issue of popular magazine.", 4.99, "https://i.pinimg.com/originals/bc/f8/79/bcf879b5c6627c6edacb89c13e55d765.jpg", "Store E", "202 Cedar St")
        );

        // Creating GeneralStore instances
        GeneralStore storeA = new GeneralStore("Store A", "123 Main St", storeAItems);
        GeneralStore storeB = new GeneralStore("Store B", "456 Elm St", storeBItems);
        GeneralStore storeC = new GeneralStore("Store C", "789 Oak St", storeCItems);
        GeneralStore storeD = new GeneralStore("Store D", "101 Pine St", storeDItems);
        GeneralStore storeE = new GeneralStore("Store E", "202 Cedar St", storeEItems);

        // List of all stores
        return Arrays.asList(storeA, storeB, storeC, storeD, storeE);
    }
}
