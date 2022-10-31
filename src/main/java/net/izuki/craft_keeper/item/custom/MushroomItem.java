package net.izuki.craft_keeper.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.Texts;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MushroomItem extends Item {
    public MushroomItem(Settings settings) {
        super(settings);
    }
    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable(this.getTranslationKey(stack)).formatted(Formatting.WHITE).formatted(Formatting.BOLD);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("lore.craft_keeper.when_eaten").formatted(Formatting.GOLD));
            tooltip.add(Text.literal("+ ").formatted(Formatting.GREEN).append(Text.translatable("lore.craft_keeper.food", 9).formatted(Formatting.WHITE)));
            tooltip.add(Text.literal("+ ").formatted(Formatting.GREEN).append(Text.translatable("lore.craft_keeper.health_per_sec", 2.1, 20).formatted(Formatting.WHITE)));
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
