package fr.zomdev.naturalstuff.armors;

import fr.zomdev.naturalstuff.references.NSMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by ZomDev on 22/12/2016.
 */
public class EarthArmor extends NSArmor {

    public EarthArmor(EntityEquipmentSlot equipmentSlotIn, String name) {
        super(NSMaterials.earthArmor, 2, equipmentSlotIn, name);
        setCreativeTab(CreativeTabs.COMBAT);
    }

}
