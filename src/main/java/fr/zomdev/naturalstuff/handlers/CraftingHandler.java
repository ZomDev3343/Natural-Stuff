package fr.zomdev.naturalstuff.handlers;

import fr.zomdev.naturalstuff.init.ModBlocks;
import fr.zomdev.naturalstuff.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ZomDev on 29/12/2016.
 */
public class CraftingHandler {

    public static void registerRecipes() {
        makeBlockRecipe(ModBlocks.gemBlock, ModItems.earthGem, 0, 0);
        makeBlockRecipe(ModBlocks.gemBlock, ModItems.waterGem, 1, 0);
        makeBlockRecipe(ModBlocks.gemBlock, ModItems.fireGem, 2, 0);
        makeBlockRecipe(ModBlocks.gemBlock, ModItems.airGem, 3, 1);

    }

    private static void makeBlockRecipe(Block block, Item item, int metaBlock, int metaItem) {
        GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(block), 1, metaBlock), new Object[]{"III", "III", "III", 'I', new ItemStack(item, 1, metaItem)});
    }
}
