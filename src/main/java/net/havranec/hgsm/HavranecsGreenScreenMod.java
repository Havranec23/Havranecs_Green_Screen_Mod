package net.havranec.hgsm;

import net.fabricmc.api.ModInitializer;
import net.havranec.hgsm.block.ModBlocks;
import net.havranec.hgsm.item.ModItemGroups;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HavranecsGreenScreenMod implements ModInitializer {
	public static final String MOD_ID = "hgsm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialization of mod {}", MOD_ID);
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}

	public static ResourceLocation id(String path) {
		// V moderních verzích (1.21+) se používá metoda .fromNamespaceAndPath
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}