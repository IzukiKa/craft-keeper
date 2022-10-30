package net.izuki.craft_keeper.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.izuki.craft_keeper.CraftKeeperMod;
import net.izuki.craft_keeper.block.CraftKeeperBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class CraftKeeperItemGroups {
    public static final ItemGroup FOODS = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "foods"), () -> new ItemStack(Items.APPLE));
    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "tools"), () -> new ItemStack(Items.IRON_PICKAXE));
    public static final ItemGroup COMBAT = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "combat"), () -> new ItemStack(Items.IRON_SWORD));
    public static final ItemGroup ACCESSORIES = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "accessories"), () -> new ItemStack(Items.TURTLE_HELMET));
    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "materials"), () -> new ItemStack(Items.IRON_INGOT));
    public static final ItemGroup VALUABLES = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "valuables"), () -> new ItemStack(CraftKeeperItems.CAVELING_SKULL));
    public static final ItemGroup CONSUMABLES = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "consumables"), () -> new ItemStack(Items.POTION));
    public static final ItemGroup PLACEMENTS = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "placements"), () -> new ItemStack(CraftKeeperBlocks.STONE_GROUND));
}
