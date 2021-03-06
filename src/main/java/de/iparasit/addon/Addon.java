package de.iparasit.addon;

import de.iparasit.addon.block.ModBlocks;
import de.iparasit.addon.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(Addon.MOD_ID)
public class Addon {
    public static final String MOD_ID = "addon";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Addon() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("Der Drops ist gelutscht!");
        LOGGER.info("Dust , Nuggets, Ingots wurden hinzugefügt!");


    }
}
