package fr.zomdev.naturalstuff;

import fr.zomdev.naturalstuff.proxies.CommonProxy;
import fr.zomdev.naturalstuff.references.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ZomDev on 18/12/2016.
 */
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class NaturalStuff {

    @Mod.Instance(Reference.MODID)
    public static NaturalStuff instance;

    @SidedProxy(clientSide = Reference.ClientProxy,serverSide = Reference.ServerProxy)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
    }
}
