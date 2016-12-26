package fr.zomdev.naturalstuff.armors;

import fr.zomdev.naturalstuff.references.NSMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by ZomDev on 24/12/2016.
 */
public class WaterArmor extends NSArmor {

    public WaterArmor(EntityEquipmentSlot equipmentSlotIn, String name) {
        super(NSMaterials.waterArmor, 2, equipmentSlotIn, name);
    }

}
