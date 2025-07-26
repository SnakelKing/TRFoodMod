package com.cefu.trfoodmod.core.init;

import com.cefu.trfoodmod.TRFoodMod;
import com.cefu.trfoodmod.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
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




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}