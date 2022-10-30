package net.izuki.craft_keeper.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_CRAFT_KEEPER = "key.category.craft_keeper.craft_keeper";

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {

        });
    }

    public static void register() {
        registerKeyInputs();
    }
}
