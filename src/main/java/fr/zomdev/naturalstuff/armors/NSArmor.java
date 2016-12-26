package fr.zomdev.naturalstuff.armors;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by ZomDev on 22/12/2016.
 */
public class NSArmor extends ItemArmor {

    public NSArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(name);
    }

}
