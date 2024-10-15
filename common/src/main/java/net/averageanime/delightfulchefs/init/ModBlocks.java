package net.averageanime.delightfulchefs.init;

import net.averageanime.delightfulchefs.blocks.*;
import net.averageanime.delightfulchefs.platform.RegistryHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

import java.util.function.Supplier;

public class ModBlocks {

    public static final Supplier<Block> SERVING_TABLE_BLOCK = RegistryHelper.registerBlock("serving_table_block", () -> new ServingTableBlock(AbstractBlock.Settings.create().strength(0.5F).luminance((state) -> 1).nonOpaque()));

    public static final Supplier<Block> VENDOR_TABLE_BLOCK = RegistryHelper.registerBlock("vendor_table_block", () -> new VendorTableBlock(AbstractBlock.Settings.create().strength(0.5F).luminance((state) -> 1).nonOpaque()));

    public static final Supplier<Block> PREP_TABLE_BLOCK = RegistryHelper.registerBlock("prep_table_block", () -> new PrepTableBlock(AbstractBlock.Settings.create().strength(0.5F).luminance((state) -> 1).nonOpaque()));

    public static final Supplier<Block> PASTRY_TABLE_BLOCK = RegistryHelper.registerBlock("pastry_table_block", () -> new PastryTableBlock(AbstractBlock.Settings.create().strength(0.5F).luminance((state) -> 1).nonOpaque()));

    public static final Supplier<Block> SOUS_TABLE_BLOCK = RegistryHelper.registerBlock("sous_table_block", () -> new SousTableBlock(AbstractBlock.Settings.create().strength(0.5F).luminance((state) -> 1).nonOpaque()));

    public static final Supplier<Block> HEAD_TABLE_BLOCK = RegistryHelper.registerBlock("head_table_block", () -> new HeadTableBlock(AbstractBlock.Settings.create().strength(0.5F).luminance((state) -> 1).nonOpaque()));


    public static void init() {

    }

}
