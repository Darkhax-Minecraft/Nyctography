package net.darkhax.nyctography.common.impl;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NyctographyMod {

    public static final String MOD_ID = "nyctography";
    public static final String MOD_NAME = "Nyctography";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static Identifier id(String path) {
        return Identifier.tryBuild(MOD_ID, path);
    }
}