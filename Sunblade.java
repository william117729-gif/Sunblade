package com.example.sunblade;

import net.fabricmc.api.ModInitializer;

public class SunbladeMod implements ModInitializer {
    public static final String MOD_ID = "sunblade";

    @Override
    public void onInitialize() {
        ModItems.register();
    }
}
