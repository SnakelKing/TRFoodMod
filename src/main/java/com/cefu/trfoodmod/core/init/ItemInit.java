package com.cefu.trfoodmod.core.init;

import com.cefu.trfoodmod.TRFoodMod; // Ana mod sınıfınız
import net.minecraft.world.item.ItemNameBlockItem;
import com.cefu.trfoodmod.core.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    // DeferredRegister, mod yüklenirken öğelerin güvenli bir şekilde sıraya alınmasını sağlar.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TRFoodMod.MOD_ID);

    // Bu metodu ana mod sınıfımızdan çağırarak kayıt işlemini başlatacağız.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO))); // Şimdilik basit, yenmeyen bir öğe.

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(BlockInit.TOMATO_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.EGGPLANT)));

    public static final RegistryObject<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds",
            () -> new ItemNameBlockItem(BlockInit.EGGPLANT_CROP.get(), new Item.Properties()));


    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoods.CORN)));

    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(BlockInit.CORN_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> BROCCOLI = ITEMS.register("broccoli",
            () -> new Item(new Item.Properties().food(ModFoods.BROCCOLI)));

    public static final RegistryObject<Item> BROCCOLI_SEEDS = ITEMS.register("broccoli_seeds",
            () -> new ItemNameBlockItem(BlockInit.BROCCOLI_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> ARTICHOKE = ITEMS.register("artichoke",
            () -> new Item(new Item.Properties().food(ModFoods.ARTICHOKE)));

    public static final RegistryObject<Item> ARTICHOKE_SEEDS = ITEMS.register("artichoke_seeds",
            () -> new ItemNameBlockItem(BlockInit.ARTICHOKE_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> ASPARAGUS = ITEMS.register("asparagus",
            () -> new Item(new Item.Properties().food(ModFoods.ASPARAGUS)));

    public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_seeds",
            () -> new ItemNameBlockItem(BlockInit.ASPARAGUS_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new Item(new Item.Properties().food(ModFoods.BLACBERRY)));

    public static final RegistryObject<Item> BLACKBERRY_SEEDS = ITEMS.register("blackberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.BLACKBERRY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> LEEK = ITEMS.register("leek",
            () -> new Item(new Item.Properties().food(ModFoods.LEEK)));

    public static final RegistryObject<Item> LEEK_SEEDS = ITEMS.register("leek_seeds",
            () -> new ItemNameBlockItem(BlockInit.LEEK_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoods.BLUEBERRY)));

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.BLUEBERRY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> CRANBERRY = ITEMS.register("cranberry",
            () -> new Item(new Item.Properties().food(ModFoods.CRANBERRY)));

    public static final RegistryObject<Item> CRANBERRY_SEEDS = ITEMS.register("cranberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.CRANBERRY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> CURRANT = ITEMS.register("currant",
            () -> new Item(new Item.Properties().food(ModFoods.CURRANT)));

    public static final RegistryObject<Item> CURRANT_SEEDS = ITEMS.register("currant_seeds",
            () -> new ItemNameBlockItem(BlockInit.CURRANT_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> ELDERBERRY = ITEMS.register("elderberry",
            () -> new Item(new Item.Properties().food(ModFoods.ELDERBERRY)));

    public static final RegistryObject<Item> ELDERBERRY_SEEDS = ITEMS.register("elderberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.ELDERBERRY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> GRAPE = ITEMS.register("grape",
            () -> new Item(new Item.Properties().food(ModFoods.GRAPE)));

    public static final RegistryObject<Item> GRAPE_SEEDS = ITEMS.register("grape_seeds",
            () -> new ItemNameBlockItem(BlockInit.GRAPE_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new Item(new Item.Properties().food(ModFoods.RASPBERRY)));
    //
    public static final RegistryObject<Item> RASPBERRY_SEEDS = ITEMS.register("raspberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.RASPBERRY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    //
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.STRAWBERRY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().food(ModFoods.CABBAGE)));
    //
    public static final RegistryObject<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds",
            () -> new ItemNameBlockItem(BlockInit.CABBAGE_CROP.get(), new Item.Properties()));


    //WWW
    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().food(ModFoods.PINEAPPLE)));

    //
    public static final RegistryObject<Item> PINEAPPLE_SEEDS = ITEMS.register("pineapple_seeds",
            () -> new ItemNameBlockItem(BlockInit.PINEAPPLE_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> BELLPEPPER = ITEMS.register("bellpepper",
            () -> new Item(new Item.Properties().food(ModFoods.BELLPEPPER)));
    //
    public static final RegistryObject<Item> BELLPEPPER_SEEDS = ITEMS.register("bellpepper_seeds",
            () -> new ItemNameBlockItem(BlockInit.BELLPEPPER_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> CAULIFLOWER = ITEMS.register("cauliflower",
            () -> new Item(new Item.Properties().food(ModFoods.CAULIFLOWER)));
    //
    public static final RegistryObject<Item> CAULIFLOWER_SEEDS = ITEMS.register("cauliflower_seeds",
            () -> new ItemNameBlockItem(BlockInit.CAULIFLOWER_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> CELERY = ITEMS.register("celery",
            () -> new Item(new Item.Properties().food(ModFoods.CELERY)));
    //
    public static final RegistryObject<Item> CELERY_SEEDS = ITEMS.register("celery_seeds",
            () -> new ItemNameBlockItem(BlockInit.CELERY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> BLACKBEAN = ITEMS.register("blackbean",
            () -> new Item(new Item.Properties().food(ModFoods.BLACKBEAN)));
    //
    public static final RegistryObject<Item> BLACKBEAN_SEEDS = ITEMS.register("blackbean_seeds",
            () -> new ItemNameBlockItem(BlockInit.BLACKBEAN_CROP.get(), new Item.Properties()));


}
