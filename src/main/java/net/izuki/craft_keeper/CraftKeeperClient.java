package net.izuki.craft_keeper;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.izuki.craft_keeper.block.CraftKeeperBlocks;
import net.izuki.craft_keeper.event.KeyInputHandler;
import net.izuki.craft_keeper.networking.CraftKeeperMessages;
import net.minecraft.client.render.RenderLayer;

public class CraftKeeperClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(CraftKeeperBlocks.HEART_BERRY_CROP, RenderLayer.getCutout());

        KeyInputHandler.register();
        CraftKeeperMessages.registerS2CPackets();
    }
}
