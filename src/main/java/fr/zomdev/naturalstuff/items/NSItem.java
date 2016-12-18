package fr.zomdev.naturalstuff.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

/**
 * Created by ZomDev on 18/12/2016.
 */
public class NSItem extends Item {

    public NSItem(String name, CreativeTabs tab) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }

    public NSItem(String registryName, String unlocalizedName, CreativeTabs tab) {
        setRegistryName(registryName);
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(tab);
    }
}
