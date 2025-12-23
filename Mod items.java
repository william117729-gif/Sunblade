package com.example.sunblade;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class ModItems {

    public static final Item SUNBLADE = new SunbladeItem(
            Tiers.DIAMOND,
            3,
            -2.4f,
            new Item.Properties().fireResistant()
    );

    public static void register() {
        Registry.register(
                Registries.ITEM,
                new Identifier(SunbladeMod.MOD_ID, "sunblade"),
                SUNBLADE
        );
    }
}
