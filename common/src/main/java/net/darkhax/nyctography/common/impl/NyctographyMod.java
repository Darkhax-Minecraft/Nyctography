package net.darkhax.nyctography.common.impl;

import net.darkhax.bookshelf.common.api.function.CachedSupplier;
import net.darkhax.nyctography.common.impl.config.Config;
import net.darkhax.pricklemc.common.api.config.ConfigManager;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NyctographyMod {

    public static final String MOD_ID = "nyctography";
    public static final String MOD_NAME = "Nyctography";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    public static final CachedSupplier<Config> CONFIG = CachedSupplier.cache(() -> ConfigManager.load(MOD_ID, new Config()));

    public static final CachedSupplier<Map<ResourceLocation, Supplier<Boolean>>> PROPERTIES = CachedSupplier.cache(() -> {
        final Map<ResourceLocation, Supplier<Boolean>> properties = new HashMap<>();
        properties.put(id("craftable_banner_pattern"), () -> CONFIG.get().craftable_banner_pattern);
        return properties;
    });

    public static ResourceLocation id(String path) {
        return ResourceLocation.tryBuild(MOD_ID, path);
    }
}