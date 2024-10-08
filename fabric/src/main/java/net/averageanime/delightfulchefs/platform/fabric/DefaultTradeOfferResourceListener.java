package net.averageanime.delightfulchefs.platform.fabric;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import net.averageanime.delightfulchefs.DelightfulChefs;
import net.averageanime.delightfulchefs.tradeoffers.TradeOfferManager;
import net.averageanime.delightfulchefs.tradeoffers.TradeOfferRegistryLoader;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.resource.JsonDataLoader;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.village.TradeOffers;

import java.util.Map;

public class DefaultTradeOfferResourceListener extends JsonDataLoader implements IdentifiableResourceReloadListener {

    public DefaultTradeOfferResourceListener() {
        super(new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().setLenient().create(), "default_villager_trades");
    }

    @Override
    public Identifier getFabricId() {
        return new Identifier(DelightfulChefs.MOD_ID,"default_villager_data_loader");
    }

    @Override
    protected void apply(Map<Identifier, JsonElement> loader, ResourceManager manager, Profiler profiler) {
        loader.forEach((identifier, jsonElement) -> {
            if (!jsonElement.isJsonObject()) {
                return;
            }

            DelightfulChefs.LOGGER.info("Deserializing default trades of profession: " + jsonElement.getAsJsonObject().get("profession").getAsString());

            TradeOfferManager.deserializeJson(jsonElement.getAsJsonObject());
        });

        TradeOffers.PROFESSION_TO_LEVELED_TRADE.putAll(TradeOfferRegistryLoader.getRegistryForLoading());
    }
}