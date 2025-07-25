package com.cefu.trfoodmod.block;


import com.cefu.trfoodmod.core.init.BlockInit;
import com.cefu.trfoodmod.core.init.ItemInit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StemBlock;
import net.minecraft.world.level.block.StemGrownBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;


public class MelonStemBlock extends StemBlock {
    public static final int MAX_AGE = 3; // Maksimum yaş 3 (0, 1, 2, 3)
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;


    public MelonStemBlock(Properties pProperties) {
        super(() -> (StemGrownBlock)BlockInit.MELON_BLOCK.get(), () -> ItemInit.MELON_SEEDS.get(), pProperties);
    }


    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}