package backrooms.backrooms;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;

public class Backrooms implements ModInitializer {

    public static final Logger LOGGER = (Logger) LogManager.getLogger("modid");

    @Override
    public void onInitialize() {

        LOGGER.info("Hello user!");
    }
}
