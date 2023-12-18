package net.Cluckoo.flowermod.item;

import net.Cluckoo.flowermod.FlowerMod;
import net.Cluckoo.flowermod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FlowerMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TAB.register("flower_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OOSQUAI.get()))
            .title(Component.translatable("creativetab.flower_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.SAPPHIRE.get());
                pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                pOutput.accept(ModItems.OOSQUAI.get());
                pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                pOutput.accept(ModBlocks.CUENDILLAR_BLOCK.get());
            })
            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
