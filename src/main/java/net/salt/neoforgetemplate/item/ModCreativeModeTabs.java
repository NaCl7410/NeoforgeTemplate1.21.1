package net.salt.neoforgetemplate.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.salt.neoforgetemplate.NeoforgeTemplate;
import net.salt.neoforgetemplate.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NeoforgeTemplate.MODID);

    /*
    associated files include:
    lang/en_us.json entry
    */

    public static final Supplier<CreativeModeTab> NEOFORGETEMPLATE_CREATIVE_MODE_TAB = CREATIVE_MODE_TAB.register(
            "neoforgetemplate_creative_mode_tab",
            () -> CreativeModeTab.builder().icon(() ->
                            new ItemStack(ModItems.DEBUG_WAND.get()))
                    .title(Component.translatable("creativetab.neoforgetemplate.creative_tab_name_1"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        //add items to tab here
                        output.accept(ModItems.EXAMPLE_ITEM);
                        output.accept(ModBlocks.EXAMPLE_ORE);
                        output.accept(ModItems.DEBUG_WAND);
                        output.accept(ModBlocks.DEBUG_BLOCK);

                    }).build());

    public static final Supplier<CreativeModeTab> SECOND_NEOFORGETEMPLATE_CREATIVE_MODE_TAB = CREATIVE_MODE_TAB.register(
            "second_neoforgetemplate_creative_mode_tab",
            () -> CreativeModeTab.builder().icon(() ->
                            new ItemStack(ModItems.DEBUG_WAND.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(NeoforgeTemplate.MODID, "neoforgetemplate_creative_mode_tab"))
                    .title(Component.translatable("creativetab.neoforgetemplate.creative_tab_name_2"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        //add items to tab here
                        output.accept(ModItems.DEBUG_WAND);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}

