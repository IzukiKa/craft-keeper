package net.izuki.craft_keeper.block.custom;

import net.izuki.craft_keeper.item.CraftKeeperItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class HeartBerryCropBlock extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age",0,3);

    public HeartBerryCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return CraftKeeperItems.HEART_BERRY_SEED;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
