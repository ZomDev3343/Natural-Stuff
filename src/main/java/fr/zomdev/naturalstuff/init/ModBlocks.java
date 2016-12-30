package fr.zomdev.naturalstuff.init;

import fr.zomdev.naturalstuff.blocks.GemBlocks;
import fr.zomdev.naturalstuff.blocks.GemItemBlock;
import fr.zomdev.naturalstuff.references.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ZomDev on 29/12/2016.
 */
public class ModBlocks {

    public static Block gemBlock;

    public ModBlocks() {
        init();
        registers();
        registerItemBlocks();
        registerRenders();
    }

    private void init() {
        gemBlock = new GemBlocks();
    }

    private void registers() {
        register(gemBlock);
    }

    private void registerRenders() {
        registerRender(gemBlock, 0, "gemsBlock/earth");
        registerRender(gemBlock, 1, "gemsBlock/water");
        registerRender(gemBlock, 2, "gemsBlock/fire");
        registerRender(gemBlock, 3, "gemsBlock/air");
    }

    private void registerItemBlocks() {
        GemItemBlock gib = new GemItemBlock(gemBlock);
        GameRegistry.register(gib);
    }

    private void register(Block block) {
        GameRegistry.register(block);
    }

    private void registerRender(Block block, int meta, String path) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, path + "/" + block.getUnlocalizedName().substring(5)), "inventory"));
    }

    private void registerItemBlock(Block block) {
        ItemBlock ib = new ItemBlock(block);
        ib.setRegistryName(block.getRegistryName());

        GameRegistry.register(ib);
    }

}
