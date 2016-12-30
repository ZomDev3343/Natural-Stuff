package fr.zomdev.naturalstuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by ZomDev on 29/12/2016.
 */
public class GemItemBlock extends ItemBlock {

    private GemBlocks blockstate;

    public GemItemBlock(Block block) {
        super(block);

        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.setRegistryName(block.getRegistryName());
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        blockstate = (GemBlocks) this.block;
        return blockstate.getUnlocalizedName(stack.getMetadata());
    }

}
