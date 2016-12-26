package fr.zomdev.naturalstuff.init;

import fr.zomdev.naturalstuff.armors.AirArmor;
import fr.zomdev.naturalstuff.armors.EarthArmor;
import fr.zomdev.naturalstuff.armors.FireArmor;
import fr.zomdev.naturalstuff.armors.WaterArmor;
import fr.zomdev.naturalstuff.items.AirGem;
import fr.zomdev.naturalstuff.items.EarthGem;
import fr.zomdev.naturalstuff.items.FireGem;
import fr.zomdev.naturalstuff.items.WaterGem;
import fr.zomdev.naturalstuff.references.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ZomDev on 18/12/2016.
 */
public class ModItems {

    // Item Declarations
    public static Item earthGem, waterGem, fireGem, airGem;

    // Earth Armor Declaration
    public static Item earthHelmet, earthChestplate, earthLeggings, earthBoots;

    // Water Armor Declarations
    public static Item waterHelmet, waterChestplate, waterLeggings, waterBoots;

    //Fire Armor Declarations
    public static Item fireHelmet, fireChestplate, fireLeggings, fireBoots;

    // Air Armor Declarations
    public static Item airHelmet, airChestplate, airLeggings, airBoots;

    private Item[] items = {earthGem, waterGem, fireGem, airGem, earthHelmet, earthChestplate, earthLeggings, earthBoots};

    public ModItems() {
        init();
        registers();
        registerRenders();
    }

    // Items Initialization
    private void init(){

        // Gems

        earthGem = new EarthGem();
        waterGem = new WaterGem();
        fireGem = new FireGem();
        airGem = new AirGem();

        // Earth Armor

        earthHelmet = new EarthArmor(EntityEquipmentSlot.HEAD, "earthHelmet");
        earthChestplate = new EarthArmor(EntityEquipmentSlot.CHEST, "earthChestplate");
        earthLeggings = new EarthArmor(EntityEquipmentSlot.LEGS, "earthLeggings");
        earthBoots = new EarthArmor(EntityEquipmentSlot.FEET, "earthBoots");

        // Water Armor

        waterHelmet = new WaterArmor(EntityEquipmentSlot.HEAD, "waterHelmet");
        waterChestplate = new WaterArmor(EntityEquipmentSlot.CHEST, "waterChestplate");
        waterLeggings = new WaterArmor(EntityEquipmentSlot.LEGS, "waterLeggings");
        waterBoots = new WaterArmor(EntityEquipmentSlot.FEET, "waterBoots");

        // Earth Armor

        fireHelmet = new FireArmor(EntityEquipmentSlot.HEAD, "fireHelmet");
        fireChestplate = new FireArmor(EntityEquipmentSlot.CHEST, "fireChestplate");
        fireLeggings = new FireArmor(EntityEquipmentSlot.LEGS, "fireLeggings");
        fireBoots = new FireArmor(EntityEquipmentSlot.FEET, "fireBoots");

        // Air Armor

        airHelmet = new AirArmor(EntityEquipmentSlot.HEAD, "airHelmet");
        airChestplate = new AirArmor(EntityEquipmentSlot.CHEST, "airChestplate");
        airLeggings = new AirArmor(EntityEquipmentSlot.LEGS, "airLeggings");
        airBoots = new AirArmor(EntityEquipmentSlot.FEET, "airBoots");

    }

    // Items Registering
    private void registers(){

        register(earthGem);
        register(airGem);
        register(fireGem);
        register(waterGem);

        register(earthHelmet);
        register(earthChestplate);
        register(earthLeggings);
        register(earthBoots);

        register(waterHelmet);
        register(waterChestplate);
        register(waterLeggings);
        register(waterBoots);

        register(fireHelmet);
        register(fireChestplate);
        register(fireLeggings);
        register(fireBoots);

        register(airHelmet);
        register(airChestplate);
        register(airLeggings);
        register(airBoots);

    }

    // Item Renders
    @SideOnly(Side.CLIENT)
    private void registerRenders(){

        registerRender(earthGem, 0);
        registerRender(waterGem, 0);
        registerRender(fireGem, 0);
        registerRenderMeta(airGem, 0, "empty");
        registerRenderMeta(airGem, 1, "filled");

        registerRender(earthHelmet, 0);
        registerRender(earthChestplate, 0);
        registerRender(earthLeggings, 0);
        registerRender(earthBoots, 0);

        registerRender(waterHelmet, 0);
        registerRender(waterChestplate, 0);
        registerRender(waterLeggings, 0);
        registerRender(waterBoots, 0);

        registerRender(fireHelmet, 0);
        registerRender(fireChestplate, 0);
        registerRender(fireLeggings, 0);
        registerRender(fireBoots, 0);

        registerRender(airHelmet, 0);
        registerRender(airChestplate, 0);
        registerRender(airLeggings, 0);
        registerRender(airBoots, 0);

    }

    /*---------------------------------------------------------------------------------------------------------------*/


    private void register(Item item){
        GameRegistry.register(item);
    }

    private void registerRender(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    private void registerRenderMeta(Item item, int meta, String metaDiff) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5) + "." + metaDiff), "inventory"));
    }
}
