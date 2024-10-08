package net.averageanime.delightfulchefs;

import net.averageanime.delightfulchefs.config.OmegaConfig;
import net.averageanime.delightfulchefs.config.ModConfig;

import net.averageanime.delightfulchefs.init.*;
import net.averageanime.delightfulchefs.tradeoffers.TradeOfferManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DelightfulChefs {
	public static final String MOD_ID = "delightfulchefs";
	public static final ModConfig CONFIG = OmegaConfig.register(ModConfig.class);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static ModConfig getConfig() {
		return CONFIG;
	}

	public static void init() {

		ModItems.init();
		ModBlocks.init();
		ModItemGroups.init();

		TradeOfferManager.registerTradeOffers();

	}

	public static void postInit() {
		ModItems.addItemsToGroup();
	}

	public static String createStringID(String name) {
		return MOD_ID + ":" + name;
	}

}
