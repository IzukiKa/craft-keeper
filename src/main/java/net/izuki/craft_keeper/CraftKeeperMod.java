package net.izuki.craft_keeper;

import net.fabricmc.api.ModInitializer;
import net.izuki.craft_keeper.item.CraftKeeperItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftKeeperMod implements ModInitializer {
	public static final String MOD_ID = "craft_keeper";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CraftKeeperItems.registerModItems();
	}
}
