package com.example.assignment5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new DummyItem("1", "Khoresh Bademjan",
                "This Persian stew of tomatoes and spiced eggplant is typically made with lamb or beef, but it’s faster and just as savory without meat. If you’re using dried limes, puncture them with a knife to further release their unique tangy and musky flavor into the stew. Lime juice isn’t a perfect substitute, but it adds a hit of much-needed, brightening acidity."));
        addItem(new DummyItem("2", "Piñon",
                "This cheesy layered casserole is often compared to lasagna, but the flavors couldn’t be more different. Ground beef is simmered with soffritto and tomato, then studded with raisins and olives to make a picadillo. Layered with mozzarella and fried sweet plantains and baked, it makes the ultimate sweet- and-savory mash-up."));

        addItem(new DummyItem("3", "Tofu With Soy-Butter Corn",
                "The combination of corn, soy, and butter is as delicious as it is classic. As Hiroko Shimbo writes in her book *Hiroko’s American Kitchen*, corn and butter are a common pair in Hokkaido, the northernmost island of Japan, where both are produced."));
        addItem(new DummyItem("4", "Chicken Tomato Pulao",
                "A classic yakhni pulao is meticulously prepared by simmering basmati rice in an aromatic chicken, lamb, or goat broth. In this version, chicken thighs are simmered in a spiced tomato base along with rice and whole spices like cinnamon and bay leaf. "));
        addItem(new DummyItem("5", "Aloo Paratha",
                "If making bread has long intimidated you, start here. Parathas come in many shapes, textures, and flavors across Asia—they are perfect for dipping into dals and stews or eating alongside assorted condiments. "));
        addItem(new DummyItem("6", "Peras con Alguashte",
                "In the fall, crisp peak-season pears or apples are an undeniably delicious way to enjoy this refreshing fruit salad with a nutty Salvadoran seasoning."));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String recipeName;
        public final String recipeDetails;

        public DummyItem(String id, String recipeName, String recipeDetails) {
            this.id = id;
            this.recipeName = recipeName;
            this.recipeDetails = recipeDetails;
        }

        @Override
        public String toString() {
            return recipeName;
        }
    }
}