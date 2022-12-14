package net.izuki.craft_keeper.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.izuki.craft_keeper.CraftKeeperMod;
import net.izuki.craft_keeper.block.CraftKeeperBlocks;
import net.izuki.craft_keeper.item.custom.*;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftKeeperItems {

    // Register Crops
    public static final Item HEART_BERRY_SEED = registerItem("heart_berry_seed",
            new AliasedBlockItem(CraftKeeperBlocks.HEART_BERRY_CROP, new FabricItemSettings().group(CraftKeeperItemGroups.FOODS)));
    public static final Item HEART_BERRY = registerItem("heart_berry",
            new HeartBerryItem(new FabricItemSettings().group(CraftKeeperItemGroups.FOODS)
                    .food(new FoodComponent.Builder().hunger(9).saturationModifier(9).build())));
    public static final Item MUSHROOM = registerItem("mushroom",
            new MushroomItem(new FabricItemSettings().group(CraftKeeperItemGroups.FOODS)
                    .food(new FoodComponent.Builder().hunger(9).saturationModifier(9).build())));

    // Register valuables
    public static final Item ADDER_STONE = registerItem("adder_stone",
            new AdderStoneItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item AMBER_CHUNK = registerItem("amber_chunk",
            new AmberChunkItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item AMBER_FISH_EGG = registerItem("amber_fish_egg",
            new AmberFishEggItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item AMMONITE = registerItem("ammonite",
            new AmmoniteItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item ANCIENT_GEM_PLATE = registerItem("ancient_gem_plate",
            new AncientGemPlateItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item ANTIQUE_BOARD_GAME = registerItem("antique_board_game",
            new AntiqueBoardGameItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BALLOON_SPORE = registerItem("balloon_spore",
            new BalloonSporeItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BENT_FORK = registerItem("bent_fork",
            new BentForkItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BLACK_BUBBLE_PEARL = registerItem("black_bubble_pearl",
            new BlackBubblePearlItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BLOOD_SKULL = registerItem("blood_skull",
            new BloodSkullItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BLUE_KELP = registerItem("blue_kelp",
            new BlueKelpItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BONE_CREOLE = registerItem("bone_creole",
            new BoneCreoleItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BROKEN_CORE_IDOL = registerItem("broken_core_idol",
            new BrokenCoreIdolItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item BUBBLE_PEARL = registerItem("bubble_pearl",
            new BubblePearlItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CAVELING_CUP = registerItem("caveling_cup",
            new CavelingCupItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CAVELING_DOLL = registerItem("caveling_doll",
            new CavelingDollItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CAVELING_EFFIGY = registerItem("caveling_effigy",
            new CavelingEffigyItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CAVELING_MEDAL = registerItem("caveling_medal",
            new CavelingMedalItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CAVELING_PERFUME = registerItem("caveling_perfume",
            new CavelingPerfumeItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CAVELING_SKULL = registerItem("caveling_skull",
            new CavelingSkullItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CEREMONIAL_FLUTE = registerItem("ceremonial_flute",
            new CeremonialFluteItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CHIPPED_PLATE = registerItem("chipped_plate",
            new ChippedPlateItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item CRYSTAL_SPHERE = registerItem("crystal_sphere",
            new CrystalSphereItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));
    public static final Item GIANT_SQUID_EYE = registerItem("giant_squid_eye",
            new GiantSquidEyeItem(new FabricItemSettings().group(CraftKeeperItemGroups.VALUABLES)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CraftKeeperMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CraftKeeperMod.LOGGER.debug("Registering items for " + CraftKeeperMod.MOD_ID);
    }
}
