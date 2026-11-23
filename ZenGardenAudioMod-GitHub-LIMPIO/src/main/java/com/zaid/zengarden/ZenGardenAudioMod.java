package com.zaid.zengarden;

import com.zaid.zengarden.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ZenGardenAudioMod implements ModInitializer {
    public static final String MOD_ID = "zengarden_audio";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModSounds.initialize();
        LOGGER.info("Zen Garden Audio: sonidos personalizados registrados.");
    }
}
