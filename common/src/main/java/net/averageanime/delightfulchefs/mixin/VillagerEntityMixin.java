package net.averageanime.delightfulchefs.mixin;

import net.averageanime.delightfulchefs.DelightfulChefs;
import net.minecraft.entity.passive.VillagerEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;


@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin {

    @ModifyConstant(method = "fillRecipes", constant = @Constant(intValue = 2))
    private int changeTradeOfferPerLevelCount(int value) {
        return DelightfulChefs.CONFIG.trade_offers_per_level;
    }


}
