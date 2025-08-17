package com.cefu.trfoodmod.core.init;

import com.cefu.trfoodmod.TRFoodMod;
import com.cefu.trfoodmod.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final RegistryObject<Block> GREENBEAN_CROP = BLOCKS.register("greenbean_crop",
            () -> new GreenbeanCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT))); 





    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TRFoodMod.MOD_ID);

    // Ekinler
    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop",
            () -> new TomatoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> EGGPLANT_CROP = BLOCKS.register("eggplant_crop",
            () -> new EggplantCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop",
            () -> new CornCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BROCCOLI_CROP = BLOCKS.register("broccoli_crop",
            () -> new BroccoliCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> ARTICHOKE_CROP = BLOCKS.register("artichoke_crop",
            () -> new ArtichokeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> ASPARAGUS_CROP = BLOCKS.register("asparagus_crop",
            () -> new AsparagusCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BLACKBERRY_CROP = BLOCKS.register("blackberry_crop",
            () -> new BlackberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> LEEK_CROP = BLOCKS.register("leek_crop",
            () -> new LeekCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BLUEBERRY_CROP = BLOCKS.register("blueberry_crop",
            () -> new BlueberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CRANBERRY_CROP = BLOCKS.register("cranberry_crop",
            () -> new CranberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CURRANT_CROP = BLOCKS.register("currant_crop",
            () -> new CurrantCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> ELDERBERRY_CROP = BLOCKS.register("elderberry_crop",
            () -> new ElderberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> GRAPE_CROP = BLOCKS.register("grape_crop",
            () -> new GrapeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> PINEAPPLE_CROP = BLOCKS.register("pineapple_crop",
            () -> new PineappleCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> RASPBERRY_CROP = BLOCKS.register("raspberry_crop",
            () -> new RaspberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop",
            () -> new StrawberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CABBAGE_CROP = BLOCKS.register("cabbage_crop",
            () -> new CabbageCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BELLPEPPER_CROP = BLOCKS.register("bellpepper_crop",
            () -> new BellpepperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CAULIFLOWER_CROP = BLOCKS.register("cauliflower_crop",
            () -> new CauliflowerCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CELERY_CROP = BLOCKS.register("celery_crop",
            () -> new CeleryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BLACKBEAN_CROP = BLOCKS.register("blackbean_crop",
            () -> new BlackbeanCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CUCUMBER_CROP = BLOCKS.register("cucumber_crop",
            () -> new CucumberCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> KALE_CROP = BLOCKS.register("kale_crop",
            () -> new KaleCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> GARLIC_CROP = BLOCKS.register("garlic_crop",
            () -> new GarlicCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> HOPS_CROP = BLOCKS.register("hops_crop",
            () -> new HopsCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CHILE_PEPPER_CROP = BLOCKS.register("chile_pepper_crop",
            () -> new Chile_pepperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SOYBEAN_CROP = BLOCKS.register("soybean_crop",
            () -> new SoybeanCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> RUTABAGA_CROP = BLOCKS.register("rutabaga_crop",
            () -> new RutabagaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> RHUBARB_CROP = BLOCKS.register("rhubarb_crop",
            () -> new RhubarbCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> RADISH_CROP = BLOCKS.register("radish_crop",
            () -> new RadishCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> ONION_CROP = BLOCKS.register("onion_crop",
            () -> new OnionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> LETTUCE_CROP = BLOCKS.register("lettuce_crop",
            () -> new LettuceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SQUASH_CROP = BLOCKS.register("squash_crop",
            () -> new SquashCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> VANILLA_CROP = BLOCKS.register("vanilla_crop",
            () -> new VanillaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> TURMERIC_CROP = BLOCKS.register("turmeric_crop",
            () -> new TurmericCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> RICE_CROP = BLOCKS.register("rice_crop",
            () -> new RiceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> PEPPER_CROP = BLOCKS.register("pepper_crop",
            () -> new PepperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> PEANUT_CROP = BLOCKS.register("peanut_crop",
            () -> new PeanutCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> OAT_CROP = BLOCKS.register("oat_crop",
            () -> new OatCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> MUSTARD_CROP = BLOCKS.register("mustard_crop",
            () -> new MustardCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> GINGER_CROP = BLOCKS.register("ginger_crop",
            () -> new GingerCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BASIL_CROP = BLOCKS.register("basil_crop",
            () -> new BasilCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> BARLEY_CROP = BLOCKS.register("barley_crop",
            () -> new BarleyCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> ZUCCHINI_CROP = BLOCKS.register("zucchini_crop",
            () -> new ZucchiniCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> YAM_CROP = BLOCKS.register("yam_crop",
            () -> new YamCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> TURNIP_CROP = BLOCKS.register("turnip_crop",
            () -> new TurnipCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> TOMATILLO_CROP = BLOCKS.register("tomatillo_crop",
            () -> new TomatilloCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> GREENONION_CROP = BLOCKS.register("greenonion_crop",
            () -> new GreenonionCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SWEETPOTATO_CROP = BLOCKS.register("sweetpotato_crop",
            () -> new SweetpotatoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SPINACH_CROP = BLOCKS.register("spinach_crop",
            () -> new SpinachCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}