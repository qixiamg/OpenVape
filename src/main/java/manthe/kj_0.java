/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.da_0;
import manthe.kd_0;

/*
 * Renamed from manthe.kj
 */
public class kj_0
extends kd_0 {
    private final float f;

    public kj_0(Object object, double d3) {
        super(da_0.a, object);
        this.f = (float)(1.0 + d3);
    }

    @Override
    public double getRealHeight() {
        return this.f;
    }
}

