package net.averageanime.delightfulchefs.init;

import net.averageanime.delightfulchefs.DelightfulChefs;
import com.google.common.collect.ImmutableSet;
import net.averageanime.delightfulchefs.platform.RegistryHelper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class ModProfessionsFabric {

    public static void init() {
    }

    public static Supplier<VillagerProfession> VENDOR;
    public static Supplier<VillagerProfession> PREP_COOK;
    public static Supplier<VillagerProfession> PASTRY_CHEF;
    public static Supplier<VillagerProfession> SOUS_CHEF;
    public static Supplier<VillagerProfession> HEAD_CHEF;

    public static final Predicate<RegistryEntry<PointOfInterestType>> VENDOR_PREDICATE = (registryEntry) -> registryEntry.value() ==
            ModPOIFabric.VENDOR_BAMBOO_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_BAMBOO_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_BIRCH_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_CHERRY_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_CRIMSON_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_DARK_OAK_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_JUNGLE_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_MANGROVE_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_OAK_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_SPRUCE_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_WARPED_POI.get()
            || registryEntry.value() == ModPOIFabric.VENDOR_TABLE_POI.get();

    public static final Predicate<RegistryEntry<PointOfInterestType>> PREP_COOK_PREDICATE = (registryEntry) -> registryEntry.value() ==
            ModPOIFabric.PREP_COOK_POI.get()
            || registryEntry.value() == ModPOIFabric.PREP_COOK_POI.get()
            || registryEntry.value() == ModPOIFabric.PREP_TABLE_POI.get();

    public static final Predicate<RegistryEntry<PointOfInterestType>> PASTRY_CHEF_PREDICATE = (registryEntry) -> registryEntry.value() ==
            ModPOIFabric.PASTRY_CHEF_POI.get()
            || registryEntry.value() == ModPOIFabric.PASTRY_CHEF_POI.get()
            || registryEntry.value() == ModPOIFabric.PASTRY_TABLE_POI.get();

    public static final Predicate<RegistryEntry<PointOfInterestType>> SOUS_CHEF_PREDICATE = (registryEntry) -> registryEntry.value() ==
            ModPOIFabric.SOUS_CHEF_POI.get()
            || registryEntry.value() == ModPOIFabric.SOUS_CHEF_POI.get()
            || registryEntry.value() == ModPOIFabric.SOUS_TABLE_POI.get();

    public static final Predicate<RegistryEntry<PointOfInterestType>> HEAD_CHEF_PREDICATE = (registryEntry) -> registryEntry.value() ==
            ModPOIFabric.HEAD_CHEF_POI.get()
            || registryEntry.value() == ModPOIFabric.HEAD_CHEF_POI.get()
            || registryEntry.value() == ModPOIFabric.HEAD_TABLE_POI.get();

    static {

        VENDOR = RegistryHelper.registerVillagerProfession("vendor", () -> new VillagerProfession(
                DelightfulChefs.createStringID("vendor"), VENDOR_PREDICATE,
                VENDOR_PREDICATE, ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER
        ));


        PREP_COOK = RegistryHelper.registerVillagerProfession("prep_cook", () -> new VillagerProfession(
                DelightfulChefs.createStringID("prep_cook"), PREP_COOK_PREDICATE,
                PREP_COOK_PREDICATE, ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER
        ));

        PASTRY_CHEF = RegistryHelper.registerVillagerProfession("pastry_chef", () -> new VillagerProfession(
                DelightfulChefs.createStringID("pastry_chef"), PASTRY_CHEF_PREDICATE,
                PASTRY_CHEF_PREDICATE, ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER
        ));


        SOUS_CHEF = RegistryHelper.registerVillagerProfession("sous_chef", () -> new VillagerProfession(
                DelightfulChefs.createStringID("sous_chef"), SOUS_CHEF_PREDICATE,
                SOUS_CHEF_PREDICATE, ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER
        ));

        HEAD_CHEF = RegistryHelper.registerVillagerProfession("head_chef", () -> new VillagerProfession(
                DelightfulChefs.createStringID("head_chef"), HEAD_CHEF_PREDICATE,
                HEAD_CHEF_PREDICATE, ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER
        ));


    }
}
