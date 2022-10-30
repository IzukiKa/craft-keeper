package net.izuki.craft_keeper.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.izuki.craft_keeper.CraftKeeperMod;
import net.izuki.craft_keeper.block.custom.StoneGroundBlock;
import net.izuki.craft_keeper.item.CraftKeeperItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftKeeperBlocks {
    public static final Block STONE_GROUND = registerBlock("stone_ground",
            new StoneGroundBlock(FabricBlockSettings.of(Material.STONE).strength(4F).requiresTool()), CraftKeeperItemGroups.PLACEMENTS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CraftKeeperMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CraftKeeperMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        CraftKeeperMod.LOGGER.debug("Registering blocks for " + CraftKeeperMod.MOD_ID);
    }
}
