package net.havranec.hgsm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.havranec.hgsm.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final ResourceKey<CreativeModeTab> CHROMA_BLOCKS_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(HavranecsGreenScreenMod.MOD_ID, "chroma_blocks")
    );

    public static final CreativeModeTab CHROMA_BLOCKS = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB, CHROMA_BLOCKS_KEY,
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup." + HavranecsGreenScreenMod.MOD_ID + ".chroma_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.GREEN_SCREEN))
                    .displayItems((displayContext, entries) -> {
                        // ENTRIES
                        entries.accept(ModBlocks.GREEN_SCREEN);
                        entries.accept(ModBlocks.BLUE_SCREEN);
                        entries.accept(ModBlocks.WHITE_SCREEN);
                        entries.accept(ModBlocks.BLACK_SCREEN);
                        entries.accept(ModBlocks.RED_SCREEN);
                        entries.accept(ModBlocks.YELLOW_SCREEN);
                        entries.accept(ModBlocks.MAGENTA_SCREEN);
                    }).build());

    public static void registerItemGroups() {
        HavranecsGreenScreenMod.LOGGER.info("Registration of Creative Tab: Chroma Blocks");
    }
}