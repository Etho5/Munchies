package com.etho5.munchies.items;

import org.bukkit.Material;

public enum Items {
    MORTAR_AND_PESTLE("Mortar and Pestle", 53661),
    KNIFE("Knife", 53662, Material.STONE_SWORD),
    ALMONDS("Almonds", 53663, Material.COOKIE),
    PECANS("Pecans", 53664, Material.COOKIE),
    TURMERIC("Turmeric", 53665),
    CUMIN("Cumin", 53666),
    CHILI_PEPPER("Chili Pepper", 53667, Material.COOKIE),
    CILANTRO("Cilantro", 53668),
    TURMERIC_POWDER("Turmeric Powder", 53669),
    CHILI_POWDER("Chili Powder", 53670),
    CORIANDER("Coriander", 53671),
    CUMIN_POWDER("Cumin Powder", 53672),
    CURRY_POWDER("Curry Powder", 53673),
    TOMATO("Tomato", 53674, Material.COOKIE),
    TOMATO_PASTE("Tomato Paste", 53675),
    CURRY("Curry", 53676, Material.MUSHROOM_STEW),
    CAN("Can", 53677),
    COLEANS("Coleans", 53678),
    BLUEBERRIES("Blueberries", 53679, Material.SWEET_BERRIES),
    RASPBERRIES("Raspberries", 53680, Material.SWEET_BERRIES),
    GRAPES("Grapes", 53681, Material.SWEET_BERRIES),
    APPLE_PIE("Apple Pie", 53682, Material.PUMPKIN_PIE),
    PECAN_PIE("Pecan Pie", 53683, Material.PUMPKIN_PIE),
    BLUEBERRY_PIE("Blueberry Pie", 53684, Material.PUMPKIN_PIE),
    RASPBERRY_PIE("Raspberry Pie", 53685, Material.PUMPKIN_PIE),
    CORN("Corn", 53686, Material.COOKIE),
    CORN_CHOWDER("Corn Chowder", 53687, Material.MUSHROOM_STEW),
    FLOUR("Flour", 53688),
    DOUGH("Dough", 53689),
    NOODLES("Noodles", 53690),
    SPAGHETTI("Spaghetti", 53691, Material.RABBIT_STEW),
    CHEESE("Cheese", 53692, Material.BREAD),
    CREAM_CHEESE("Cream Cheese", 53693, Material.BREAD),
    BAGEL("Bagel", 53694, Material.BREAD),
    CREAM_CHEESE_BAGEL("Cream Cheese Bagel", 53695, Material.COOKED_PORKCHOP),
    FRENCH_FRIES("French Fries", 53696, Material.BAKED_POTATO),
    FISH_AND_CHIPS("Fish and Chips", 53697, Material.COOKED_PORKCHOP),
    CHEESE_SWORD("Cheese Sword", 53698, Material.STONE_SWORD),
    HAMBURGER("Hamburger", 53699, Material.COOKED_BEEF),
    CHEESEBURGER("Cheeseburger", 536100, Material.COOKED_BEEF),
    SCRAMBLED_EGGS("Scrambled Eggs", 536101, Material.COOKIE),
    CARBONARA("Carbonara", 536102, Material.RABBIT_STEW),
    CHICKEN_NUGGETS("Chicken Nuggets", 536103, Material.COOKED_CHICKEN),
    TOAST("Toast", 536104, Material.BREAD),
    COLENIA_COLA("Colenia Cola", 536105),
    MACARONI_AND_CHEESE("Macaroni and Cheese", 536106, Material.RABBIT_STEW),
    COCOA_POWDER("Cocoa Powder", 536107),
    CHOCOLATE("Chocolate", 536108, Material.COOKIE),
    RAISINS("Raisins", 536109, Material.SWEET_BERRIES),
    TRAIL_MIX("Trail Mix", 536110),
    LEMON("Lemon", 536111)
    ;

    CustomItem item;
    Items(String displayName, int customModelData) {
        item = new CustomItem(displayName, customModelData);
    }

    Items(String displayName, int customModelData, Material baseItem) {
        item = new CustomItem(displayName, customModelData, baseItem);
    }

    public CustomItem getItem() {
        return this.item;
    }
}
