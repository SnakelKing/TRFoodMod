package com.cefu.trfoodmod.core.init;

import com.cefu.trfoodmod.TRFoodMod; // Ana mod sınıfınız
import net.minecraft.world.item.ItemNameBlockItem;
import com.cefu.trfoodmod.core.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    // DeferredRegister, mod yüklenirken öğelerin güvenli bir şekilde sıraya alınmasını sağlar.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TRFoodMod.MOD_ID);

    // DOMATES ÖĞEMİZİ TANIMLIYORUZ
    // "tomato", öğenin kayıt adıdır. Küçük harfle ve benzersiz olmalıdır.
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO))); // Şimdilik basit, yenmeyen bir öğe.
    // DOMATES TOHUMU
    // ItemNameBlockItem, bu öğeye sağ tıklandığında hangi bloğu ekeceğini belirtir.
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(BlockInit.TOMATO_CROP.get(), new Item.Properties()));

    // Bu metodu ana mod sınıfımızdan çağırarak kayıt işlemini başlatacağız.
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // PATLICAN
    public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.EGGPLANT)));

    // PATLICAN TOHUMU
    public static final RegistryObject<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds",
            () -> new ItemNameBlockItem(BlockInit.EGGPLANT_CROP.get(), new Item.Properties()));

    // Mısır
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoods.CORN)));

    // Mısır TOHUMU
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(BlockInit.CORN_CROP.get(), new Item.Properties()));

    // BROCCOLI
    public static final RegistryObject<Item> BROCCOLI = ITEMS.register("broccoli",
            () -> new Item(new Item.Properties().food(ModFoods.BROCCOLI)));

    // BROCCOLI TOHUMU
    public static final RegistryObject<Item> BROCCOLI_SEEDS = ITEMS.register("broccoli_seeds",
            () -> new ItemNameBlockItem(BlockInit.BROCCOLI_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> ARTICHOKE = ITEMS.register("artichoke",
            () -> new Item(new Item.Properties().food(ModFoods.ARTICHOKE)));

    // TOHUMU
    public static final RegistryObject<Item> ARTICHOKE_SEEDS = ITEMS.register("artichoke_seeds",
            () -> new ItemNameBlockItem(BlockInit.ARTICHOKE_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> ASPARAGUS = ITEMS.register("asparagus",
            () -> new Item(new Item.Properties().food(ModFoods.ASPARAGUS)));

    //  TOHUMU
    // ItemInit.java dosyasının içinde

    public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_seeds",
            () -> new ItemNameBlockItem(BlockInit.ASPARAGUS_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new Item(new Item.Properties().food(ModFoods.BLACBERRY)));

    //  TOHUMU
    public static final RegistryObject<Item> BLACKBERRY_SEEDS = ITEMS.register("blackberry_seeds",
            () -> new ItemNameBlockItem(BlockInit.BLACKBERRY_CROP.get(), new Item.Properties()));

    //
    public static final RegistryObject<Item> LEEK = ITEMS.register("leek",
            () -> new Item(new Item.Properties().food(ModFoods.LEEK)));

    //
    public static final RegistryObject<Item> LEEK_SEEDS = ITEMS.register("leek_seeds",
            () -> new ItemNameBlockItem(BlockInit.LEEK_CROP.get(), new Item.Properties()));
}