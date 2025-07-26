package com.cefu.trfoodmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.StemGrownBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public class CustomStemBlock extends CropBlock {
    public static final int MAX_AGE = 3; // 4 AŞAMALI
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    protected static final VoxelShape[] SHAPES = new VoxelShape[]{Block.box(7.0D, 0.0D, 7.0D, 9.0D, 2.0D, 9.0D), Block.box(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D), Block.box(7.0D, 0.0D, 7.0D, 9.0D, 6.0D, 9.0D), Block.box(7.0D, 0.0D, 7.0D, 9.0D, 8.0D, 9.0D)};

    private final Supplier<Block> gourdBlockProvider; // Büyüyecek olan bloğu tutar

    public CustomStemBlock(Supplier<Block> gourdBlock, Properties properties) {
        super(properties);
        this.gourdBlockProvider = gourdBlock;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPES[pState.getValue(this.getAgeProperty())];
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(Blocks.FARMLAND);
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pLevel.getRawBrightness(pPos, 0) >= 9) {
            float f = getGrowthSpeed(this, pLevel, pPos);
            if (pRandom.nextInt((int)(25.0F / f) + 1) == 0) {
                int i = pState.getValue(AGE);
                if (i < MAX_AGE) {
                    pLevel.setBlock(pPos, pState.setValue(AGE, i + 1), 2);
                } else {
                    BlockPos adjacentPos = pPos.relative(pLevel.random.nextBoolean() ? net.minecraft.core.Direction.NORTH : net.minecraft.core.Direction.SOUTH); // Basit bir yön seçimi
                    BlockState groundState = pLevel.getBlockState(adjacentPos.below());
                    if (pLevel.isEmptyBlock(adjacentPos) && (groundState.is(Blocks.FARMLAND) || groundState.is(Blocks.DIRT))) {
                        pLevel.setBlockAndUpdate(adjacentPos, this.gourdBlockProvider.get().defaultBlockState());
                    }
                }
            }
        }
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