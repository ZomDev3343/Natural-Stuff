package fr.zomdev.naturalstuff.blocks;

import net.minecraft.block.material.Material;

/**
 * Created by ZomDev on 29/12/2016.
 */
public class NSBlock extends net.minecraft.block.Block {

    public NSBlock(Material materialIn, String name) {
        super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
    }

}
