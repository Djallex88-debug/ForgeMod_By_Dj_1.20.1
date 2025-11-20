package net.djallex.mccourse.block;

import net.djallex.mccourse.MCCourse;
import net.djallex.mccourse.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MCCourse.MOD_ID);


        // Iron alexandrite Blocks
        public static final RegistryObject<Block> ALEXANDRITE_BLOCK = registerBlock("alexandriteblock", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(0.5f, 6.0f).sound(SoundType.METAL)) );
        public static final RegistryObject<Block> RAW_ALEXANDRITE_BLOCK = registerBlock("rawalexandriteblock", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(0.5f, 6.0f).sound(SoundType.METAL)) );


        // Ores
        public static final RegistryObject<Block> ORE_ALEXANDRITE_BLOCK = registerBlock("alexandriteore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5) ));
        public static final RegistryObject<Block> DEEPORE_ALEXANDRITE_BLOCK = registerBlock("deepslatealexandriteore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(4, 5)) );
        public static final RegistryObject<Block> NETHERORE_ALEXANDRITE_BLOCK = registerBlock("netheralexandriteore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)) );
        public static final RegistryObject<Block> ENDORE_ALEXANDRITE_BLOCK = registerBlock("endstonealexandriteore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(5, 12)) );







    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    public static void register(IEventBus eventBus){

        BLOCKS.register(eventBus);

    }



}
