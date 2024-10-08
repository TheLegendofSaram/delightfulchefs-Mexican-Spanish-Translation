package net.averageanime.delightfulchefs.fabric;

import net.averageanime.delightfulchefs.DelightfulChefs;
import net.averageanime.delightfulchefs.init.ModPOIFabric;
import net.averageanime.delightfulchefs.init.ModProfessionsFabric;
import net.averageanime.delightfulchefs.platform.fabric.DefaultTradeOfferResourceListener;
import net.averageanime.delightfulchefs.platform.fabric.TradeOfferResourceListener;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;

public class DelightfulChefsFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        ModPOIFabric.postInit();
        ModProfessionsFabric.init();


        DelightfulChefs.init();
        DelightfulChefs.postInit();

        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new DefaultTradeOfferResourceListener());
        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new TradeOfferResourceListener());
    }

}
