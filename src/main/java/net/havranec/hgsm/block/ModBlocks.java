package net.havranec.hgsm.block;

import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {

    // BLOCKS
    public static final Block GREEN_SCREEN = registerBlock("green_screen",
            settings -> new Block(settings.strength(0.3f, 1.0f).sound(SoundType.WOOL).emissiveRendering((state, world, pos) -> true)));

    public static final Block BLUE_SCREEN = registerBlock("blue_screen",
            settings -> new Block(settings.strength(0.3f, 1.0f).sound(SoundType.WOOL).emissiveRendering((state, world, pos) -> true)));

    public static final Block WHITE_SCREEN = registerBlock("white_screen",
            settings -> new Block(settings.strength(0.3f, 1.0f).sound(SoundType.WOOL).emissiveRendering((state, world, pos) -> true)));

    public static final Block BLACK_SCREEN = registerBlock("black_screen",
            settings -> new Block(settings.strength(0.3f, 1.0f).sound(SoundType.WOOL).emissiveRendering((state, world, pos) -> true)));

    public static final Block RED_SCREEN = registerBlock("red_screen",
            settings -> new Block(settings.strength(0.3f, 1.0f).sound(SoundType.WOOL).emissiveRendering((state, world, pos) -> true)));

    public static final Block YELLOW_SCREEN = registerBlock("yellow_screen",
            settings -> new Block(settings.strength(0.3f, 1.0f).sound(SoundType.WOOL).emissiveRendering((state, world, pos) -> true)));

    public static final Block MAGENTA_SCREEN = registerBlock("magenta_screen",
            settings -> new Block(settings.strength(0.3f, 1.0f).sound(SoundType.WOOL).emissiveRendering((state, world, pos) -> true)));

    // REGISTRATION METHODS
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> blockFactory) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath("hgsm", name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        BlockBehaviour.Properties settings = BlockBehaviour.Properties.of().setId(blockKey);
        Block block = blockFactory.apply(settings);
        registerBlockItem(id, block);
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static void registerBlockItem(ResourceLocation id, Block block) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);
        Item.Properties itemSettings = new Item.Properties().setId(itemKey);
        Registry.register(BuiltInRegistries.ITEM, itemKey, new BlockItem(block, itemSettings));
    }

    public static void registerModBlocks() {
        HavranecsGreenScreenMod.LOGGER.info("Registration of chroma blocks for 1.21.3");
    }
}