package com.cefu.trfoodmod;

import com.cefu.trfoodmod.core.init.ItemInit; // ItemInit sınıfımızı import ediyoruz
import com.cefu.trfoodmod.core.init.BlockInit; // BlockInit'i import et
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TRFoodMod.MOD_ID)
public class TRFoodMod {
    public static final String MOD_ID = "trfoodmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TRFoodMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);

        // Client-side olayları dinlemek için bu satırı ekleyin
        modEventBus.addListener(this::clientSetup);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GREENBEAN_CROP.get(), RenderType.cutout());


        // Domates ekininin render tipini "cutout" olarak ayarla
        ItemBlockRenderTypes.setRenderLayer(BlockInit.TOMATO_CROP.get(), RenderType.cutout());
        // Patlıcan ekini
        ItemBlockRenderTypes.setRenderLayer(BlockInit.EGGPLANT_CROP.get(), RenderType.cutout());
        // Mısır ekini
        ItemBlockRenderTypes.setRenderLayer(BlockInit.CORN_CROP.get(), RenderType.cutout());
        // Patlıcan ekini
        ItemBlockRenderTypes.setRenderLayer(BlockInit.BROCCOLI_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ARTICHOKE_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ASPARAGUS_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBERRY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.LEEK_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUEBERRY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CRANBERRY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CURRANT_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ELDERBERRY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.GRAPE_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.PINEAPPLE_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.RASPBERRY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.STRAWBERRY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CABBAGE_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.BELLPEPPER_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CAULIFLOWER_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CELERY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKBEAN_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CUCUMBER_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.KALE_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.GARLIC_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.HOPS_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.CHILE_PEPPER_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.SOYBEAN_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.RUTABAGA_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.RHUBARB_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.RADISH_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ONION_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.LETTUCE_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.SQUASH_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.VANILLA_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.TURMERIC_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.RICE_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.PEPPER_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.PEANUT_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.OAT_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.MUSTARD_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.GINGER_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.BASIL_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.BARLEY_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ZUCCHINI_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.YAM_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.TURNIP_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.TOMATILLO_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.GREENONION_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.SWEETPOTATO_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.SPINACH_CROP.get(), RenderType.cutout());

    }
}

