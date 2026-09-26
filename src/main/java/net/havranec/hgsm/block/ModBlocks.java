package net.havranec.hgsm.block;

import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    // BLOCKS
    public static final Block GREEN_SCREEN = registerBlock("green_screen",
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.3f)
                    .explosionResistance(1.0f)
                    .emissiveRendering((state, level, pos) -> true)
            )
    );

    public static final Block BLUE_SCREEN = registerBlock("blue_screen",
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.3f)
                    .explosionResistance(1.0f)
                    .emissiveRendering((state, level, pos) -> true)
            )
    );

    public static final Block WHITE_SCREEN = registerBlock("white_screen",
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.3f)
                    .explosionResistance(1.0f)
                    .emissiveRendering((state, level, pos) -> true)
            )
    );

    public static final Block BLACK_SCREEN = registerBlock("black_screen",
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.3f)
                    .explosionResistance(1.0f)
                    .emissiveRendering((state, level, pos) -> true)
            )
    );

    public static final Block RED_SCREEN = registerBlock("red_screen",
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.3f)
                    .explosionResistance(1.0f)
                    .emissiveRendering((state, level, pos) -> true)
            )
    );

    public static final Block YELLOW_SCREEN = registerBlock("yellow_screen",
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.3f)
                    .explosionResistance(1.0f)
                    .emissiveRendering((state, level, pos) -> true)
            )
    );

    public static final Block MAGENTA_SCREEN = registerBlock("magenta_screen",
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.3f)
                    .explosionResistance(1.0f)
                    .emissiveRendering((state, level, pos) -> true)
            )
    );

    // REGISTRATION METHODS
    private static Block registerBlock(String name, Block block) {
        ResourceLocation id = HavranecsGreenScreenMod.id(name);
        registerBlockItem(id, block);
        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    private static void registerBlockItem(ResourceLocation id, Block block) {
        Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties()));
    }

    public static void registerModBlocks() {
        HavranecsGreenScreenMod.LOGGER.info("Registration of chroma blocks for 1.21.1");
    }
}