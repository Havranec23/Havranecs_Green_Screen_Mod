package net.havranec.hgsm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.havranec.hgsm.HavranecsGreenScreenMod;
import net.havranec.hgsm.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    @SuppressWarnings("unused")
    public static final ItemGroup CHROMA_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HavranecsGreenScreenMod.MOD_ID, "chroma_blocks"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup." + HavranecsGreenScreenMod.MOD_ID + ".chroma_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.GREEN_SCREEN))
                    .entries((displayContext, entries) -> {
                        // ENTRIES
                        entries.add(ModBlocks.GREEN_SCREEN);
                        entries.add(ModBlocks.BLUE_SCREEN);
                        entries.add(ModBlocks.WHITE_SCREEN);
                        entries.add(ModBlocks.BLACK_SCREEN);
                        entries.add(ModBlocks.RED_SCREEN);
                        entries.add(ModBlocks.YELLOW_SCREEN);
                        entries.add(ModBlocks.MAGENTA_SCREEN);
                    }).build());

    public static void registerItemGroups() {
        HavranecsGreenScreenMod.LOGGER.info("Registration of Creative Tab: Chroma Blocks");
    }
}
