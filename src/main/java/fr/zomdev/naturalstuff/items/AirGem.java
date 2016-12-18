package fr.zomdev.naturalstuff.items;

/**
 * Created by ZomDev on 18/12/2016.
 */

import fr.zomdev.naturalstuff.references.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class AirGem extends NSItem {

    public static String[] subTypes = {"empty", "filled"};

    public AirGem() {
        super(Names.Items.AirGem, CreativeTabs.MATERIALS);
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
        for (int i = 0; i < subTypes.length; i++) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }

    @Override
    public int getMetadata(ItemStack stack) {
        return stack.getItemDamage();
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + "." + subTypes[getMetadata(stack)];
    }
}
