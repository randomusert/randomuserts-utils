package io.github.randomusert.mods.rstsutils.init;

import io.github.randomusert.mods.rstsutils.api.LoggingHelper;
import lombok.extern.java.Log;
import net.fabricmc.loader.api.FabricLoader;

public class ModInit {

    public static void detectMods() {
        if (FabricLoader.getInstance().isModLoaded("refinedstorage")) {
            LoggingHelper.info("Refined Storage Found. Initializing  storage disks and storage parts");
            initRSCompat();
            LoggingHelper.info("Refined Storage Disks and Item Storage Parts initialized");
        }
    }

    private static void initRSCompat() {
        ModRSItemStorage.initialize();
    }
}
