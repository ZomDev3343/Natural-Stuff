package fr.zomdev.naturalstuff.proxies;

import fr.zomdev.naturalstuff.handlers.CraftingHandler;
import fr.zomdev.naturalstuff.init.ModBlocks;
import fr.zomdev.naturalstuff.init.ModItems;

/**
 * Created by ZomDev on 18/12/2016.
 */
public class CommonProxy {

    public void preInit(){
        new ModItems();
        new ModBlocks();
    }

    public void init(){
        CraftingHandler.registerRecipes();
    }

    public void postInit(){

    }
}
