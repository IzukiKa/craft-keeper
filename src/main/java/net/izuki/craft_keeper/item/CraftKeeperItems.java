package net.izuki.craft_keeper.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.izuki.craft_keeper.CraftKeeperMod;
import net.izuki.craft_keeper.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftKeeperItems {

    // Register valuables
    public static final Item ADDER_STONE = registerItem("adder_stone",
            new AdderStoneItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item AMBER_CHUNK = registerItem("amber_chunk",
            new AmberChunkItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CraftKeeperMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CraftKeeperMod.LOGGER.debug("Registering items for " + CraftKeeperMod.MOD_ID);
    }
}
