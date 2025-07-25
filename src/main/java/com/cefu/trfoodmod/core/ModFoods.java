package com.cefu.trfoodmod.core;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    // Tüm yiyecek özelliklerimizi burada tanımlayacağız.

    // Domates için yiyecek özelliklerini oluşturuyoruz.
    // .nutrition(3) -> 3 açlık puanı (1.5 but) doldurur.
    // .saturationMod(0.3f) -> Düşük bir doygunluk verir. Doygunluk, açlığınızın ne kadar hızlı düşeceğini etkiler.
    // .fast() -> Yeme animasyonunu hızlandırır (isteğe bağlı, meyveler için güzel durur).
    public static final FoodProperties TOMATO = new FoodProperties.Builder()
            .nutrition(1) //1 açlik barında 1 ikon dolduruyor.
            .saturationMod(0.2f)
            .build();
    public static final FoodProperties EGGPLANT = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .build();
    public static final FoodProperties CORN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .build();
    public static final FoodProperties BROCCOLI = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.3f)
            .build();
    public static final FoodProperties ARTICHOKE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .build();

    public static final FoodProperties ASPARAGUS = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .build();

    public static final FoodProperties BLACBERRY = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .build();

    public static final FoodProperties LEEK = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .build();

    public static final FoodProperties BLUEBERRY = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .build();

    public static final FoodProperties CRANBERRY = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .build();

    public static final FoodProperties CURRANT = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.2f)
            .build();

    public static final FoodProperties ELDERBERRY = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .build();

    public static final FoodProperties GRAPE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.1f)
            .build();

    // ModFoods.java içinde
    public static final FoodProperties MELON_SLICES = new FoodProperties.Builder()
            .nutrition(2) // Vanilya karpuz gibi 2 açlık (1 but) doldurur
            .saturationMod(0.3f)
            .build();


}
