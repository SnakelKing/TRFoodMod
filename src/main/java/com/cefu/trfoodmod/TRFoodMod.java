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


    }
}