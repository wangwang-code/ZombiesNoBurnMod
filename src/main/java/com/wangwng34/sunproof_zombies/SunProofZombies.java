package com.wangwng34.sunproof_zombies;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SunProofZombies.MODID, name = SunProofZombies.NAME, version = SunProofZombies.VERSION)
public class SunProofZombies
{
    public static final String MODID = "zombiesnoburn";
    public static final String NAME = "Zombies Don't Burn";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("zombiesnoburn is loaded!");
    }
}
