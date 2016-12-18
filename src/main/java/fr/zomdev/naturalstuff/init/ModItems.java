package fr.zomdev.naturalstuff.init;

import fr.zomdev.naturalstuff.items.AirGem;
import fr.zomdev.naturalstuff.items.EarthGem;
import fr.zomdev.naturalstuff.items.FireGem;
import fr.zomdev.naturalstuff.items.WaterGem;
import fr.zomdev.naturalstuff.references.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by ZomDev on 18/12/2016.
 */
public class ModItems {
    public static Item earthGem, waterGem, fireGem, airGem;

    // Item Declarations

    public ModItems() {
        init();
        registers();
        registerRenders();
    }

    // Items Initialization
    private void init(){
        earthGem = new EarthGem();
        waterGem = new WaterGem();
        fireGem = new FireGem();
        airGem = new AirGem();

    }

    // Items Registering
    private void registers(){
        register(earthGem);
        register(waterGem);
        register(fireGem);
        register(airGem);
    }

    // Item Renders
    @SideOnly(Side.CLIENT)
    private void registerRenders(){
        registerRender(earthGem, 0);
        registerRender(waterGem, 0);
        registerRender(fireGem, 0);
        registerRender(airGem, 0);
    }

    /*---------------------------------------------------------------------------------------------------------------*/


    private void register(Item item){
        GameRegistry.register(item);
    }

    private void registerRender(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
