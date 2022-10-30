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

public class MushroomItem extends Item {
    public MushroomItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("lore.craft_keeper.when_eaten").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("§a+ §r9 food").formatted(Formatting.WHITE));
            tooltip.add(Text.literal("§a+ §r2.1 health every sec for 20 sec").formatted(Formatting.WHITE));
            tooltip.add(Text.translatable("lore.craft_keeper.cookable").formatted(Formatting.WHITE));
            tooltip.add(Text.translatable("lore.craft_keeper.mushroom.line1").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("lore.craft_keeper.mushroom.line2").formatted(Formatting.GRAY));
        } else {
            tooltip.add(Text.translatable("lore.craft_keeper.cookable").formatted(Formatting.WHITE));
            tooltip.add(Text.translatable("lore.craft_keeper.more_info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
