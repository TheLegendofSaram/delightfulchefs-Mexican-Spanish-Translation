package net.averageanime.delightfulchefs.fabric;

import net.averageanime.delightfulchefs.DelightfulChefsClient;
import net.fabricmc.api.ClientModInitializer;;


public class DelightfulChefsClientFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        DelightfulChefsClient.init();

    }
}
