package com.cefu.trfoodmod.core.init;

import com.cefu.trfoodmod.TRFoodMod;
import net.minecraft.world.item.ItemNameBlockItem;
import com.cefu.trfoodmod.core.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    // Greenbean
    public static final RegistryObject<Item> GREENBEAN = ITEMS.register("greenbean",
            () -> new Item(new Item.Properties().food(ModFoods.GREENBEAN)));
    public static final RegistryObject<Item> GREENBEAN_SEEDS = ITEMS.register("greenbean_seeds",
            () -> new ItemNameBlockItem(BlockInit.GREENBEAN_CROP.get(), new Item.Properties()));






    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TRFoodMod.MOD_ID);

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

    //
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

    //
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(ModFoods.CUCUMBER)));
    //
    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(BlockInit.CUCUMBER_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> KALE = ITEMS.register("kale",
            () -> new Item(new Item.Properties().food(ModFoods.KALE)));
    //
    public static final RegistryObject<Item> KALE_SEEDS = ITEMS.register("kale_seeds",
            () -> new ItemNameBlockItem(BlockInit.KALE_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().food(ModFoods.GARLIC)));
    //
    public static final RegistryObject<Item> GARLIC_SEEDS = ITEMS.register("garlic_seeds",
            () -> new ItemNameBlockItem(BlockInit.GARLIC_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> HOPS = ITEMS.register("hops",
            () -> new Item(new Item.Properties().food(ModFoods.HOPS)));
    //
    public static final RegistryObject<Item> HOPS_SEEDS = ITEMS.register("hops_seeds",
            () -> new ItemNameBlockItem(BlockInit.HOPS_CROP.get(), new Item.Properties()));

    // Chile_pepper
    public static final RegistryObject<Item> CHILE_PEPPER = ITEMS.register("chile_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.CHILE_PEPPER)));

    public static final RegistryObject<Item> CHILE_PEPPER_SEEDS = ITEMS.register("chile_pepper_seeds",
            () -> new ItemNameBlockItem(BlockInit.CHILE_PEPPER_CROP.get(), new Item.Properties()));

    // Soybean
    public static final RegistryObject<Item> SOYBEAN = ITEMS.register("soybean",
            () -> new Item(new Item.Properties().food(ModFoods.SOYBEAN)));

    public static final RegistryObject<Item> SOYBEAN_SEEDS = ITEMS.register("soybean_seeds",
            () -> new ItemNameBlockItem(BlockInit.SOYBEAN_CROP.get(), new Item.Properties()));

    // Rutabaga
    public static final RegistryObject<Item> RUTABAGA = ITEMS.register("rutabaga",
            () -> new Item(new Item.Properties().food(ModFoods.RUTABAGA)));

    public static final RegistryObject<Item> RUTABAGA_SEEDS = ITEMS.register("rutabaga_seeds",
            () -> new ItemNameBlockItem(BlockInit.RUTABAGA_CROP.get(), new Item.Properties()));

    // Rhubarb
    public static final RegistryObject<Item> RHUBARB = ITEMS.register("rhubarb",
            () -> new Item(new Item.Properties().food(ModFoods.RHUBARB)));

    public static final RegistryObject<Item> RHUBARB_SEEDS = ITEMS.register("rhubarb_seeds",
            () -> new ItemNameBlockItem(BlockInit.RHUBARB_CROP.get(), new Item.Properties()));

    // Radish
    public static final RegistryObject<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoods.RADISH)));

    public static final RegistryObject<Item> RADISH_SEEDS = ITEMS.register("radish_seeds",
            () -> new ItemNameBlockItem(BlockInit.RADISH_CROP.get(), new Item.Properties()));

    // Onion
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoods.ONION)));

    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new ItemNameBlockItem(BlockInit.ONION_CROP.get(), new Item.Properties()));

    // Lettuce
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoods.LETTUCE)));

    public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds",
            () -> new ItemNameBlockItem(BlockInit.LETTUCE_CROP.get(), new Item.Properties()));

    // Squash
    public static final RegistryObject<Item> SQUASH = ITEMS.register("squash",
            () -> new Item(new Item.Properties().food(ModFoods.SQUASH)));

    public static final RegistryObject<Item> SQUASH_SEEDS = ITEMS.register("squash_seeds",
            () -> new ItemNameBlockItem(BlockInit.SQUASH_CROP.get(), new Item.Properties()));


    // Vanilla
    public static final RegistryObject<Item> VANILLA = ITEMS.register("vanilla",
            () -> new Item(new Item.Properties().food(ModFoods.VANILLA)));
    public static final RegistryObject<Item> VANILLA_SEEDS = ITEMS.register("vanilla_seeds",
            () -> new ItemNameBlockItem(BlockInit.VANILLA_CROP.get(), new Item.Properties()));

    // Turmeric
    public static final RegistryObject<Item> TURMERIC = ITEMS.register("turmeric",
            () -> new Item(new Item.Properties().food(ModFoods.TURMERIC)));
    public static final RegistryObject<Item> TURMERIC_SEEDS = ITEMS.register("turmeric_seeds",
            () -> new ItemNameBlockItem(BlockInit.TURMERIC_CROP.get(), new Item.Properties()));

    // Rice
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().food(ModFoods.RICE)));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new ItemNameBlockItem(BlockInit.RICE_CROP.get(), new Item.Properties()));

    // Pepper
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPER)));
    public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds",
            () -> new ItemNameBlockItem(BlockInit.PEPPER_CROP.get(), new Item.Properties()));

    // Peanut
    public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut",
            () -> new Item(new Item.Properties().food(ModFoods.PEANUT)));
    public static final RegistryObject<Item> PEANUT_SEEDS = ITEMS.register("peanut_seeds",
            () -> new ItemNameBlockItem(BlockInit.PEANUT_CROP.get(), new Item.Properties()));

    // Oat
    public static final RegistryObject<Item> OAT = ITEMS.register("oat",
            () -> new Item(new Item.Properties().food(ModFoods.OAT)));

    public static final RegistryObject<Item> OAT_SEEDS = ITEMS.register("oat_seeds",
            () -> new ItemNameBlockItem(BlockInit.OAT_CROP.get(), new Item.Properties()));

    // Mustard
    public static final RegistryObject<Item> MUSTARD = ITEMS.register("mustard",
            () -> new Item(new Item.Properties().food(ModFoods.MUSTARD)));

    public static final RegistryObject<Item> MUSTARD_SEEDS = ITEMS.register("mustard_seeds",
            () -> new ItemNameBlockItem(BlockInit.MUSTARD_CROP.get(), new Item.Properties()));

    // Ginger
    public static final RegistryObject<Item> GINGER = ITEMS.register("ginger",
            () -> new Item(new Item.Properties().food(ModFoods.GINGER)));

    public static final RegistryObject<Item> GINGER_SEEDS = ITEMS.register("ginger_seeds",
            () -> new ItemNameBlockItem(BlockInit.GINGER_CROP.get(), new Item.Properties()));

    // Basil
    public static final RegistryObject<Item> BASIL = ITEMS.register("basil",
            () -> new Item(new Item.Properties().food(ModFoods.BASIL)));

    public static final RegistryObject<Item> BASIL_SEEDS = ITEMS.register("basil_seeds",
            () -> new ItemNameBlockItem(BlockInit.BASIL_CROP.get(), new Item.Properties()));

    // Barley
    public static final RegistryObject<Item> BARLEY = ITEMS.register("barley",
            () -> new Item(new Item.Properties().food(ModFoods.BARLEY)));

    public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds",
            () -> new ItemNameBlockItem(BlockInit.BARLEY_CROP.get(), new Item.Properties()));

    // Zucchini
    public static final RegistryObject<Item> ZUCCHINI = ITEMS.register("zucchini",
            () -> new Item(new Item.Properties().food(ModFoods.ZUCCHINI)));

    public static final RegistryObject<Item> ZUCCHINI_SEEDS = ITEMS.register("zucchini_seeds",
            () -> new ItemNameBlockItem(BlockInit.ZUCCHINI_CROP.get(), new Item.Properties()));

    // Yam
    public static final RegistryObject<Item> YAM = ITEMS.register("yam",
            () -> new Item(new Item.Properties().food(ModFoods.YAM)));

    public static final RegistryObject<Item> YAM_SEEDS = ITEMS.register("yam_seeds",
            () -> new ItemNameBlockItem(BlockInit.YAM_CROP.get(), new Item.Properties()));

    // Turnip
    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            () -> new Item(new Item.Properties().food(ModFoods.TURNIP)));

    public static final RegistryObject<Item> TURNIP_SEEDS = ITEMS.register("turnip_seeds",
            () -> new ItemNameBlockItem(BlockInit.TURNIP_CROP.get(), new Item.Properties()));

    // Tomatillo
    public static final RegistryObject<Item> TOMATILLO = ITEMS.register("tomatillo",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATILLO)));

    public static final RegistryObject<Item> TOMATILLO_SEEDS = ITEMS.register("tomatillo_seeds",
            () -> new ItemNameBlockItem(BlockInit.TOMATILLO_CROP.get(), new Item.Properties()));

    // Greenonion
    public static final RegistryObject<Item> GREENONION = ITEMS.register("greenonion",
            () -> new Item(new Item.Properties().food(ModFoods.GREENONION)));

    public static final RegistryObject<Item> GREENONION_SEEDS = ITEMS.register("greenonion_seeds",
            () -> new ItemNameBlockItem(BlockInit.GREENONION_CROP.get(), new Item.Properties()));

    // Sweetpotato
    public static final RegistryObject<Item> SWEETPOTATO = ITEMS.register("sweetpotato",
            () -> new Item(new Item.Properties().food(ModFoods.SWEETPOTATO)));

    public static final RegistryObject<Item> SWEETPOTATO_SEEDS = ITEMS.register("sweetpotato_seeds",
            () -> new ItemNameBlockItem(BlockInit.SWEETPOTATO_CROP.get(), new Item.Properties()));

    // Spinach
    public static final RegistryObject<Item> SPINACH = ITEMS.register("spinach",
            () -> new Item(new Item.Properties().food(ModFoods.SPINACH)));

    public static final RegistryObject<Item> SPINACH_SEEDS = ITEMS.register("spinach_seeds",
            () -> new ItemNameBlockItem(BlockInit.SPINACH_CROP.get(), new Item.Properties()));




}
