package net.averageanime.delightfulchefs.init;

import net.averageanime.delightfulchefs.DelightfulChefs;
import net.averageanime.delightfulchefs.platform.RegistryHelper;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(DelightfulChefs.MOD_ID, "group"));

    public static void init() {
        RegistryHelper.registerItemGroup(ITEM_GROUP, "group", "logo", ModItems.PREP_TABLE_BLOCK);
    }

}
