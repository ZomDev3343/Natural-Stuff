package fr.zomdev.naturalstuff.init;

import fr.zomdev.naturalstuff.items.EarthGem;
import fr.zomdev.naturalstuff.references.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ZomDev on 18/12/2016.
 */
public class ModItems {

    // Item Declarations

    public static Item earthGem, waterGem, fireGem, airGem;

    // Items Initialization
    private void init(){
        earthGem = new EarthGem();
    }

    // Items Registering
    private void registers(){

    }

    // Item Renders
    private void registerRenders(){

    }

    /*---------------------------------------------------------------------------------------------------------------*/


    private void register(Item item){
        GameRegistry.register(item);
    }

    private void registerRender(Item item, int meta){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
