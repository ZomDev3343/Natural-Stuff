package fr.zomdev.naturalstuff.enumerations;

import net.minecraft.util.IStringSerializable;

/**
 * Created by ZomDev on 29/12/2016.
 */
public enum GemBlocksEnumType implements IStringSerializable {

    EARTHBLOCK("earth", 0), WATERBLOCK("water", 1), FIREBLOCK("fire", 2), AIRBLOCK("air", 3);

    private static final GemBlocksEnumType[] metas = new GemBlocksEnumType[values().length];

    static {

        GemBlocksEnumType[] var0 = values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; var2++) {
            GemBlocksEnumType var3 = var0[var2];
            metas[var3.getMeta()] = var3;
        }
    }

    private final String name;
    private final int meta;

    GemBlocksEnumType(String name, int meta) {
        this.name = name;
        this.meta = meta;
    }

    public static GemBlocksEnumType getStateFromMeta(int metadata) {

        if (metadata < 0 || metadata >= metas.length) {
            metadata = 0;
        }

        return metas[metadata];
    }

    @Override
    public String getName() {
        return name;
    }

    public int getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return name;
    }
}
