package net.havranec.hgsm.block;

import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {

    // BLOCKS
    @SuppressWarnings("unused")
    public static final Block GREEN_SCREEN = registerBlock("green_screen",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)
                    .emissiveLighting((BlockState state, BlockView world, BlockPos pos) -> true)
            )
    );

    @SuppressWarnings("unused")
    public static final Block BLUE_SCREEN = registerBlock("blue_screen",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)
                    .emissiveLighting((BlockState state, BlockView world, BlockPos pos) -> true)
            )
    );

    @SuppressWarnings("unused")
    public static final Block WHITE_SCREEN = registerBlock("white_screen",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)
                    .emissiveLighting((BlockState state, BlockView world, BlockPos pos) -> true)
            )
    );

    @SuppressWarnings("unused")
    public static final Block BLACK_SCREEN = registerBlock("black_screen",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)
                    .emissiveLighting((BlockState state, BlockView world, BlockPos pos) -> true)
            )
    );

    @SuppressWarnings("unused")
    public static final Block RED_SCREEN = registerBlock("red_screen",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_WOOL)
                    .emissiveLighting((BlockState state, BlockView world, BlockPos pos) -> true)
            )
    );

    @SuppressWarnings("unused")
    public static final Block YELLOW_SCREEN = registerBlock("yellow_screen",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)
                    .emissiveLighting((BlockState state, BlockView world, BlockPos pos) -> true)
            )
    );

    @SuppressWarnings("unused")
    public static final Block MAGENTA_SCREEN = registerBlock("magenta_screen",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)
                    .emissiveLighting((BlockState state, BlockView world, BlockPos pos) -> true)
            )
    );

    // REGISTRATION METHODS
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier("hgsm", name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier("hgsm", name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerModBlocks() {
        HavranecsGreenScreenMod.LOGGER.info("Registration of chroma blocks");
    }
}