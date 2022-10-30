package net.izuki.craft_keeper.mixin;

import net.izuki.craft_keeper.CraftKeeperMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class CraftKeeperMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		CraftKeeperMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
