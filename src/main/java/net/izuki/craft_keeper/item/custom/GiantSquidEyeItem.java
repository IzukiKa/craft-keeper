package net.izuki.craft_keeper.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GiantSquidEyeItem extends Item {
    public GiantSquidEyeItem(Settings settings) {
        super(settings);
    }
    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable(this.getTranslationKey(stack)).formatted(Formatting.WHITE).formatted(Formatting.BOLD);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient && hand == Hand.MAIN_HAND) {
            int cooldown = getRandomNumber();
            if (cooldown == 1) {
                user.sendMessage(Text.literal("The eye stares at you for " + cooldown + " second..."), true);
            } else {
                user.sendMessage(Text.literal("The eye stares at you for " + cooldown + " seconds..."), true);
            }
            user.getItemCooldownManager().set(this,20*cooldown);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("lore.craft_keeper.valuable").formatted(Formatting.WHITE));
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("A sensory organ of a big sea").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("creature. It was probably lost").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("in a fight to death with").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("something even bigger.").formatted(Formatting.GRAY));
        } else {
            tooltip.add(Text.translatable("lore.craft_keeper.more_info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    private int getRandomNumber() {
        return Random.createLocal().nextInt(10);
    }
}
