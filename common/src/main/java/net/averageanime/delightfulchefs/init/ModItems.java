package net.averageanime.delightfulchefs.init;

import net.averageanime.delightfulchefs.platform.RegistryHelper;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class ModItems {

    public static final Supplier<Item> SERVING_TABLE_BLOCK = RegistryHelper.registerItem("serving_table_block", () -> new BlockItem(ModBlocks.SERVING_TABLE_BLOCK.get(), new Item.Settings()));

    public static final Supplier<Item> VENDOR_TABLE_BLOCK = RegistryHelper.registerItem("vendor_table_block", () -> new BlockItem(ModBlocks.VENDOR_TABLE_BLOCK.get(), new Item.Settings()));

    public static final Supplier<Item> PREP_TABLE_BLOCK = RegistryHelper.registerItem("prep_table_block", () -> new BlockItem(ModBlocks.PREP_TABLE_BLOCK.get(), new Item.Settings()));

    public static final Supplier<Item> PASTRY_TABLE_BLOCK = RegistryHelper.registerItem("pastry_table_block", () -> new BlockItem(ModBlocks.PASTRY_TABLE_BLOCK.get(), new Item.Settings()));

    public static final Supplier<Item> SOUS_TABLE_BLOCK = RegistryHelper.registerItem("sous_table_block", () -> new BlockItem(ModBlocks.SOUS_TABLE_BLOCK.get(), new Item.Settings()));

    public static final Supplier<Item> HEAD_TABLE_BLOCK = RegistryHelper.registerItem("head_table_block", () -> new BlockItem(ModBlocks.HEAD_TABLE_BLOCK.get(), new Item.Settings()));


    public static void init() {}

    public static void addItemsToGroup() {

        RegistryHelper.addToItemGroup(ModItemGroups.ITEM_GROUP, SERVING_TABLE_BLOCK.get());
        RegistryHelper.addToItemGroup(ModItemGroups.ITEM_GROUP, VENDOR_TABLE_BLOCK.get());
        RegistryHelper.addToItemGroup(ModItemGroups.ITEM_GROUP, PREP_TABLE_BLOCK.get());
        RegistryHelper.addToItemGroup(ModItemGroups.ITEM_GROUP, PASTRY_TABLE_BLOCK.get());
        RegistryHelper.addToItemGroup(ModItemGroups.ITEM_GROUP, SOUS_TABLE_BLOCK.get());
        RegistryHelper.addToItemGroup(ModItemGroups.ITEM_GROUP, HEAD_TABLE_BLOCK.get());

    }
}
