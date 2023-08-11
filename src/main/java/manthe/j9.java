/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

public class j9
extends gJ {
    private bp_1 d;
    private bp_1 a;

    public j9() {
        super(A5.bH);
        if (V.c() > 13) {
            this.a = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE);
        } else {
            this.d = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE);
        }
    }

    public Object a(double d3, double d4, double d5, double d6, float f10, float f11, boolean bl) {
        return this.d.a(new Object[]{d3, d4, d5, d6, Float.valueOf(f10), Float.valueOf(f11), bl});
    }

    private Object a(double d3, double d4, double d5, float f10, float f11, boolean bl) {
        return this.a.a(new Object[]{d3, d4, d5, Float.valueOf(f10), Float.valueOf(f11), bl});
    }

    static Object a(j9 j92, double d3, double d4, double d5, float f10, float f11, boolean bl) {
        return j92.a(d3, d4, d5, f10, f11, bl);
    }
}

