package org.meicode.recycler;

import java.util.Arrays;
import java.util.List;

public class CosmeticProvider {
    public static List<CosmeticShop> getCosmeticShops() {
        // Creating items for Glamour Glow
        List<CosmeticItem> glamourGlowItems = Arrays.asList(
                new CosmeticItem("Lipstick", "Smooth matte lipstick in various shades.", 15.99, "https://3.bp.blogspot.com/-mHGj5eoNrfY/VqeWKyqZFwI/AAAAAAAABCA/kfI49TIAeU8/s1600/IMG_6115.JPG", "Glamour Glow", "123 Main St"),
                new CosmeticItem("Liquid Foundation", "Full coverage liquid foundation.", 25.99, "https://images.neimanmarcus.com/ca/5/product_assets/C/4/Q/K/5/NMC4QK5_mz.jpg", "Glamour Glow", "123 Main St"),
                new CosmeticItem("Eyeshadow Palette", "12-color eyeshadow palette.", 18.50, "https://th.bing.com/th/id/OIP.dVn5W8VBfXX-MKs7OdwhQgHaFD?rs=1&pid=ImgDetMain", "Glamour Glow", "123 Main St")
        );

        // Creating items for Beauty Bliss
        List<CosmeticItem> beautyBlissItems = Arrays.asList(
                new CosmeticItem("Matte Lip Gloss", "Long-lasting matte lip gloss.", 14.99, "https://www.revolutionbeauty.com/dw/image/v2/BCZJ_PRD/on/demandware.static/-/Sites-revbe-master-catalog/default/dw391e9dc7/images/hi-res/Matte-Lip.jpg", "Beauty Bliss", "456 Elm St"),
                new CosmeticItem("BB Cream", "Lightweight BB cream with SPF.", 19.99, "https://khyrastore.com/wp-content/uploads/2020/09/Emina-Beauty-Bliss-BB-Cream-Light-2.png", "Beauty Bliss", "456 Elm St"),
                new CosmeticItem("Waterproof Mascara", "Long-lasting waterproof mascara.", 11.50, "https://i.pinimg.com/originals/19/c6/7a/19c67a8bcb77e2897afedbc732f2f2ef.jpg", "Beauty Bliss", "456 Elm St")
        );

        // Creating items for Radiance Retreat
        List<CosmeticItem> radianceRetreatItems = Arrays.asList(
                new CosmeticItem("Tinted Moisturizer", "Hydrating tinted moisturizer.", 21.00, "https://wwd.com/wp-content/uploads/2022/04/nars-1.jpg?resize=150", "Radiance Retreat", "789 Oak St"),
                new CosmeticItem("Compact Powder", "Lightweight compact powder.", 15.50, "https://m.media-amazon.com/images/I/61Yoabwbl6L._SY355_.jpg", "Radiance Retreat", "789 Oak St"),
                new CosmeticItem("Blush Palette", "Four-color blush palette.", 17.99, "https://i.pinimg.com/originals/a1/a9/f9/a1a9f9c001422c89c58819ea097be97e.jpg", "Radiance Retreat", "789 Oak St")
        );

        // Creating items for Elegance Emporium
        List<CosmeticItem> eleganceEmporiumItems = Arrays.asList(
                new CosmeticItem("Nail Polish Set", "Set of 5 vibrant nail polishes.", 22.99, "https://i5.walmartimages.com/asr/4cc09f8a-5d52-41e1-b7ef-52dae4ada325.a2bf5883c93df0189a23650083a01c65.jpeg?odnWidth=1000&odnHeight=1000&odnBg=ffffff", "Elegance Emporium", "101 Pine St"),
                new CosmeticItem("Lip Balm", "Moisturizing lip balm with natural ingredients.", 5.99, "https://i.pinimg.com/474x/f1/34/35/f13435f4433c245facfb3171fd3e2551.jpg", "Elegance Emporium", "101 Pine St"),
                new CosmeticItem("Contour Kit", "Complete contouring kit.", 19.49, "https://images-na.ssl-images-amazon.com/images/I/810YyEFcx9L._SL1500_.jpg", "Elegance Emporium", "101 Pine St")
        );

        // Creating items for Chic Charm
        List<CosmeticItem> chicCharmItems = Arrays.asList(
                new CosmeticItem("Liquid Lip Stain", "Long-lasting liquid lip stain.", 13.99, "https://m.media-amazon.com/images/I/71TaqwbTBTL._SL1500_.jpg", "Chic Charm", "202 Cedar St"),
                new CosmeticItem("Cream Blush", "Natural-looking cream blush.", 14.50, "https://th.bing.com/th/id/OIP.AtUYtuyFc8hkhHpP1YKE7QHaJ4?rs=1&pid=ImgDetMain", "Chic Charm", "202 Cedar St"),
                new CosmeticItem("False Eyelashes", "Reusable false eyelashes.", 11.00, "https://th.bing.com/th/id/OIP.xB3SZ7NiDszq1W_qL9Tw5QHaHa?rs=1&pid=ImgDetMain", "Chic Charm", "202 Cedar St")
        );

        // Creating CosmeticShop instances
        CosmeticShop glamourGlow = new CosmeticShop("Glamour Glow", "123 Main St", glamourGlowItems);
        CosmeticShop beautyBliss = new CosmeticShop("Beauty Bliss", "456 Elm St", beautyBlissItems);
        CosmeticShop radianceRetreat = new CosmeticShop("Radiance Retreat", "789 Oak St", radianceRetreatItems);
        CosmeticShop eleganceEmporium = new CosmeticShop("Elegance Emporium", "101 Pine St", eleganceEmporiumItems);
        CosmeticShop chicCharm = new CosmeticShop("Chic Charm", "202 Cedar St", chicCharmItems);

        // List of all shops
        return Arrays.asList(glamourGlow, beautyBliss, radianceRetreat, eleganceEmporium, chicCharm);
    }
}
