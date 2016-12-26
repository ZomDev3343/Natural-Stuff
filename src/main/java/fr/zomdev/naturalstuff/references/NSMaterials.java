package fr.zomdev.naturalstuff.references;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by ZomDev on 22/12/2016.
 */
public class NSMaterials {

    public static final ItemArmor.ArmorMaterial earthArmor = EnumHelper.addArmorMaterial("earthArmorMat", "naturalstuff:earthArmor", 850, new int[]{3, 7, 5, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f);

    public static final ItemArmor.ArmorMaterial waterArmor = EnumHelper.addArmorMaterial("waterArmorMat", "naturalstuff:waterArmor", 850, new int[]{4, 8, 6, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f);

    public static final ItemArmor.ArmorMaterial fireArmor = EnumHelper.addArmorMaterial("fireArmorMat", "naturalstuff:fireArmor", 850, new int[]{5, 9, 7, 4}, 19, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.7f);

    public static final ItemArmor.ArmorMaterial airArmor = EnumHelper.addArmorMaterial("airArmorMat", "naturalstuff:airArmor", 850, new int[]{6, 10, 8, 5}, 21, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.95f);

}
