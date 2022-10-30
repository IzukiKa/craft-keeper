package net.izuki.craft_keeper.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.izuki.craft_keeper.CraftKeeperMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class CraftKeeperItemGroups {
    public static final ItemGroup CRAFT_KEEPER = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "craft_keeper"), () -> new ItemStack(Items.CRAFTING_TABLE));
    public static final ItemGroup VALUABLES = FabricItemGroupBuilder.build(
            new Identifier(CraftKeeperMod.MOD_ID, "valuables"), () -> new ItemStack(CraftKeeperItems.AMBER_FISH_EGG));
}
