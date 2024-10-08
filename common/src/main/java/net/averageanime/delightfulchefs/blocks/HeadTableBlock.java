package net.averageanime.delightfulchefs.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class HeadTableBlock extends TableBlock {

    public HeadTableBlock(Settings settings) {
        super(settings);
    }

    public static VoxelShape TABLE_SHAPE = VoxelShapes.union(

            VoxelShapes.cuboid(0.25, 0.1875, 0.6875, 0.75, 0.25, 0.75),
            VoxelShapes.cuboid(0.25, 0.625, 0.125, 0.75, 0.6875, 0.1875),
            VoxelShapes.cuboid(0.1875, 0.625, 0.1875, 0.25, 0.6875, 0.6875),
            VoxelShapes.cuboid(0.75, 0.625, 0.1875, 0.8125, 0.6875, 0.6875),
            VoxelShapes.cuboid(0.25, 0.625, 0.6875, 0.75, 0.6875, 0.75),
            VoxelShapes.cuboid(0.25, 0.1875, 0.125, 0.75, 0.25, 0.1875),
            VoxelShapes.cuboid(0.75, 0.1875, 0.1875, 0.8125, 0.25, 0.6875),
            VoxelShapes.cuboid(0.1875, 0.1875, 0.1875, 0.25, 0.25, 0.6875),
            VoxelShapes.cuboid(0.25, 0.25, 0.15625, 0.75, 0.5625, 0.71875),
            VoxelShapes.cuboid(0.75, 0.0625, 0.0625, 0.875, 0.9375, 0.1875),
            VoxelShapes.cuboid(0.125, 0.0625, 0.0625, 0.25, 0.9375, 0.1875),
            VoxelShapes.cuboid(0.75, 0.0625, 0.6875, 0.875, 0.9375, 0.8125),
            VoxelShapes.cuboid(0.125, 0.0625, 0.6875, 0.25, 0.9375, 0.8125),
            VoxelShapes.cuboid(0.078125, 0, 0.625, 0.296875, 0.0625, 0.875),
            VoxelShapes.cuboid(0.703125, 0, 0, 0.921875, 0.0625, 0.25),
            VoxelShapes.cuboid(0.703125, 0, 0.625, 0.921875, 0.0625, 0.875),
            VoxelShapes.cuboid(0.078125, 0, 0, 0.296875, 0.0625, 0.25),
            VoxelShapes.cuboid(0.0625, 0.875, 0.0625, 0.9375, 1, 0.9375),
            VoxelShapes.cuboid(0, 0.875, 0.0625, 0.0625, 1.0625, 0.875),
            VoxelShapes.cuboid(0.9375, 0.875, 0.875, 1, 1.0625, 0.9375),
            VoxelShapes.cuboid(0.9375, 1.0625, 0.0625, 1, 1.125, 0.3125),
            VoxelShapes.cuboid(0, 1.0625, 0.0625, 0.0625, 1.125, 0.3125),
            VoxelShapes.cuboid(0, 0.875, 0.875, 0.0625, 1.0625, 0.9375),
            VoxelShapes.cuboid(0.9375, 0.875, 0.0625, 1, 1.0625, 0.875),
            VoxelShapes.cuboid(0.96875, 0.8125, 0.0625, 1, 0.875, 0.9375),
            VoxelShapes.cuboid(0, 0.8125, 0, 1, 1.125, 0.0625),
            VoxelShapes.cuboid(0, 0.8125, 0.0625, 0, 0.875, 0.9375),
            VoxelShapes.cuboid(0.25, 0.5625, 0.15625, 0.75, 0.625, 0.71875),
            VoxelShapes.cuboid(0, 0.8125, 0.0625, 1, 0.875, 0.9375)

    );

    public static VoxelShape TABLE_SHAPE_SOUTH = rotateShape(Direction.NORTH, Direction.SOUTH, TABLE_SHAPE);
    public static VoxelShape TABLE_SHAPE_EAST = rotateShape(Direction.NORTH, Direction.EAST, TABLE_SHAPE);
    public static VoxelShape TABLE_SHAPE_WEST = rotateShape(Direction.NORTH, Direction.WEST, TABLE_SHAPE);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH -> {return TABLE_SHAPE;}
            case SOUTH -> {return TABLE_SHAPE_SOUTH;}
            case WEST -> {return TABLE_SHAPE_WEST;}
            default -> {return TABLE_SHAPE_EAST;}
        }
    }
}
