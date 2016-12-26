package fr.zomdev.naturalstuff.armors;

import fr.zomdev.naturalstuff.references.NSMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by ZomDev on 26/12/2016.
 */
public class AirArmor extends NSArmor {

    public AirArmor(EntityEquipmentSlot equipmentSlotIn, String name) {
        super(NSMaterials.airArmor, 3, equipmentSlotIn, name);
    }

}
