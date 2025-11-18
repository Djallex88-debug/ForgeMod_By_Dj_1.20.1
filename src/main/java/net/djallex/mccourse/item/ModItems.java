package net.djallex.mccourse.item;

import net.djallex.mccourse.MCCourse;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCCourse.MOD_ID);
    // DefferedRegister is a list of registered items at a specific time

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));






    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }


}
