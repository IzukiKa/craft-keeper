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

public class BloodSkullItem extends Item {
    public BloodSkullItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Valuable").formatted(Formatting.WHITE));
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("The crimson remains of").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("someone meeting a terrible").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("fate.").formatted(Formatting.GRAY));
        } else {
            tooltip.add(Text.literal("Press SHIFT for more info!").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
