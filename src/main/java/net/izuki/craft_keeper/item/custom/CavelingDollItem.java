package net.izuki.craft_keeper.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CavelingDollItem extends Item {
    public CavelingDollItem(Settings settings) {
        super(settings);
    }
    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable(this.getTranslationKey(stack)).formatted(Formatting.WHITE).formatted(Formatting.BOLD);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("lore.craft_keeper.valuable").formatted(Formatting.WHITE));
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("A handmade doll found in a").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("grave. It must once have").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("belonged to a child...").formatted(Formatting.GRAY));
        } else {
            tooltip.add(Text.translatable("lore.craft_keeper.more_info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
