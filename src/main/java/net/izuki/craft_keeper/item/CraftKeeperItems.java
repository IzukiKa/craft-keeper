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
    public static final Item AMBER_FISH_EGG = registerItem("amber_fish_egg",
            new AmberFishEggItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item AMMONITE = registerItem("ammonite",
            new AmmoniteItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item ANCIENT_GEM_PLATE = registerItem("ancient_gem_plate",
            new AncientGemPlateItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item ANTIQUE_BOARD_GAME = registerItem("antique_board_game",
            new AntiqueBoardGameItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item BALLOON_SPORE = registerItem("balloon_spore",
            new BalloonSporeItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item BENT_FORK = registerItem("bent_fork",
            new BentForkItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item BLACK_BUBBLE_PEARL = registerItem("black_bubble_pearl",
            new BlackBubblePearlItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item BLOOD_SKULL = registerItem("blood_skull",
            new BloodSkullItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item BLUE_KELP = registerItem("blue_kelp",
            new BlueKelpItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item BONE_CREOLE = registerItem("bone_creole",
            new BoneCreoleItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item BROKEN_CORE_IDOL = registerItem("broken_core_idol",
            new BoneCreoleItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));
    public static final Item GIANT_SQUID_EYE = registerItem("giant_squid_eye",
            new GiantSquidEyeItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES).maxCount(999)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CraftKeeperMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CraftKeeperMod.LOGGER.debug("Registering items for " + CraftKeeperMod.MOD_ID);
    }
}
