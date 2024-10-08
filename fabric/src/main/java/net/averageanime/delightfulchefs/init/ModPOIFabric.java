package net.averageanime.delightfulchefs.init;

import net.averageanime.delightfulchefs.DelightfulChefs;
import net.averageanime.delightfulchefs.platform.RegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import vectorwing.farmersdelight.common.registry.ModBlocks;

import java.util.HashMap;
import java.util.function.Supplier;

import static net.averageanime.delightfulchefs.init.ModBlocks.*;

public class ModPOIFabric {
    private static final HashMap<String, Supplier<PointOfInterestType>> REGISTERED_POINT_OF_INTEREST_TYPES;

    public final static Supplier<PointOfInterestType> VENDOR_ACACIA_POI;
    public final static Supplier<PointOfInterestType> VENDOR_BAMBOO_POI;
    public final static Supplier<PointOfInterestType> VENDOR_BIRCH_POI;
    public final static Supplier<PointOfInterestType> VENDOR_CHERRY_POI;
    public final static Supplier<PointOfInterestType> VENDOR_CRIMSON_POI;
    public final static Supplier<PointOfInterestType> VENDOR_DARK_OAK_POI;
    public final static Supplier<PointOfInterestType> VENDOR_JUNGLE_POI;
    public final static Supplier<PointOfInterestType> VENDOR_MANGROVE_POI;
    public final static Supplier<PointOfInterestType> VENDOR_OAK_POI;
    public final static Supplier<PointOfInterestType> VENDOR_SPRUCE_POI;
    public final static Supplier<PointOfInterestType> VENDOR_WARPED_POI;
    public final static Supplier<PointOfInterestType> VENDOR_TABLE_POI;

    public final static Supplier<PointOfInterestType> PREP_COOK_POI;
    public final static Supplier<PointOfInterestType> PREP_TABLE_POI;

    public final static Supplier<PointOfInterestType> PASTRY_CHEF_POI;
    public final static Supplier<PointOfInterestType> PASTRY_TABLE_POI;

    public final static Supplier<PointOfInterestType> SOUS_CHEF_POI;
    public final static Supplier<PointOfInterestType> SOUS_TABLE_POI;

    public final static Supplier<PointOfInterestType> HEAD_CHEF_POI;
    public final static Supplier<PointOfInterestType> HEAD_TABLE_POI;

    static {

        REGISTERED_POINT_OF_INTEREST_TYPES = new HashMap<>();

        VENDOR_ACACIA_POI = registerPointOfInterest("vendor_acacia", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.ACACIA_CABINET.get()), 1, 1));
        VENDOR_BAMBOO_POI = registerPointOfInterest("vendor_bamboo", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.BAMBOO_CABINET.get()), 1, 1));
        VENDOR_BIRCH_POI = registerPointOfInterest("vendor_birch", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.BIRCH_CABINET.get()), 1, 1));
        VENDOR_CHERRY_POI = registerPointOfInterest("vendor_cherry", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.CHERRY_CABINET.get()), 1, 1));
        VENDOR_CRIMSON_POI = registerPointOfInterest("vendor_crimson", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.CRIMSON_CABINET.get()), 1, 1));
        VENDOR_DARK_OAK_POI = registerPointOfInterest("vendor_dark_oak", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.DARK_OAK_CABINET.get()), 1, 1));
        VENDOR_JUNGLE_POI = registerPointOfInterest("vendor_jungle", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.JUNGLE_CABINET.get()), 1, 1));
        VENDOR_MANGROVE_POI = registerPointOfInterest("vendor_mangrove", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.MANGROVE_CABINET.get()), 1, 1));
        VENDOR_OAK_POI = registerPointOfInterest("vendor_oak", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.OAK_CABINET.get()), 1, 1));
        VENDOR_SPRUCE_POI = registerPointOfInterest("vendor_spruce", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.SPRUCE_CABINET.get()), 1, 1));
        VENDOR_WARPED_POI = registerPointOfInterest("vendor_warped", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.WARPED_CABINET.get()), 1, 1));
        VENDOR_TABLE_POI = registerPointOfInterest("vendor_table", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(VENDOR_TABLE_BLOCK.get()), 1, 1));

        PREP_COOK_POI = registerPointOfInterest("prep_cook_poi", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.CUTTING_BOARD.get()), 1, 1));
        PREP_TABLE_POI = registerPointOfInterest("prep_table", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(PREP_TABLE_BLOCK.get()), 1, 1));

        PASTRY_CHEF_POI = registerPointOfInterest("pastry_chef_poi", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.STOVE.get()), 1, 1));
        PASTRY_TABLE_POI = registerPointOfInterest("pastry_table", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(PASTRY_TABLE_BLOCK.get()), 1, 1));

        SOUS_CHEF_POI = registerPointOfInterest("sous_chef_poi", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.SKILLET.get()), 1, 1));
        SOUS_TABLE_POI = registerPointOfInterest("sous_table", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(SOUS_TABLE_BLOCK.get()), 1, 1));

        HEAD_CHEF_POI = registerPointOfInterest("head_chef_poi", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(ModBlocks.COOKING_POT.get()), 1, 1));
        HEAD_TABLE_POI = registerPointOfInterest("head_table", () -> new PointOfInterestType(PointOfInterestTypes.getStatesOfBlock(HEAD_TABLE_BLOCK.get()), 1, 1));


    }

    public static void init() {
    }

    public static void postInit() {
        fillMissingPointOfInterestMapValues();
    }

    private static Supplier<PointOfInterestType> registerPointOfInterest(String name, Supplier<PointOfInterestType> pointOfInterestType) {
        REGISTERED_POINT_OF_INTEREST_TYPES.put(name, pointOfInterestType);
        return RegistryHelper.registerPointOfInterestType(name, pointOfInterestType);
    }

    private static void fillMissingPointOfInterestMapValues() {
        REGISTERED_POINT_OF_INTEREST_TYPES.forEach((name, pointOfInterestType) -> fillMissingPointOfInterestMapValueForBlock(name, pointOfInterestType.get().blockStates().iterator().next().getBlock()));
    }

    private static void fillMissingPointOfInterestMapValueForBlock(String name, Block pointOfInterestBlock) {
        var blockStates = PointOfInterestTypes.getStatesOfBlock(pointOfInterestBlock);
        blockStates.forEach((state) -> PointOfInterestTypes.POI_STATES_TO_TYPE.put(state, Registries.POINT_OF_INTEREST_TYPE.getEntry(RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(DelightfulChefs.MOD_ID, name))).get()));
    }
}
