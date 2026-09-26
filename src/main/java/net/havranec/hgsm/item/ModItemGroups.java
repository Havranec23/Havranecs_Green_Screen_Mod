package net.havranec.hgsm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.havranec.hgsm.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {

    public static final CreativeModeTab CHROMA_BLOCKS = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            HavranecsGreenScreenMod.id("chroma_blocks"),
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup." + HavranecsGreenScreenMod.MOD_ID + ".chroma_blocks")) // .displayName se v Mojmap jmenuje .title
                    .icon(() -> new ItemStack(ModBlocks.GREEN_SCREEN))
                    .displayItems((displayContext, output) -> {
                        output.accept(ModBlocks.GREEN_SCREEN);
                        output.accept(ModBlocks.BLUE_SCREEN);
                        output.accept(ModBlocks.WHITE_SCREEN);
                        output.accept(ModBlocks.BLACK_SCREEN);
                        output.accept(ModBlocks.RED_SCREEN);
                        output.accept(ModBlocks.YELLOW_SCREEN);
                        output.accept(ModBlocks.MAGENTA_SCREEN);
                    }).build());

    public static void registerItemGroups() {
        HavranecsGreenScreenMod.LOGGER.info("Registration of Creative Tab: Chroma Blocks");
    }
}