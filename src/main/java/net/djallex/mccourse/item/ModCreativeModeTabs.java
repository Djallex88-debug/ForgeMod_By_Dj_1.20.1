package net.djallex.mccourse.item;

import net.djallex.mccourse.MCCourse;
import net.djallex.mccourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourse.MOD_ID);


    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TAB.register("course_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
            .title(Component.translatable("creativetab.course_tab")).displayItems(((pParameters, pOutput) -> {
                pOutput.accept(ModItems.ALEXANDRITE.get());
                pOutput.accept(ModItems.RAW_ALEXANDRITE.get());
                pOutput.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                pOutput.accept(ModBlocks.ORE_ALEXANDRITE_BLOCK.get());
                pOutput.accept(ModBlocks.NETHERORE_ALEXANDRITE_BLOCK.get());
                pOutput.accept(ModBlocks.DEEPORE_ALEXANDRITE_BLOCK.get());
                pOutput.accept(ModBlocks.ENDORE_ALEXANDRITE_BLOCK.get());
                pOutput.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

            })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
