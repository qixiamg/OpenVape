/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.jb
 */
public class jb_0
extends gJ {
    private bp_1 a;
    private bp_1 d;

    public jb_0() {
        super(A5.G);
        if (V.c() > 13) {
            this.d = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Boolean.TYPE);
        } else {
            this.a = this.a("<init>", false, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Boolean.TYPE);
        }
    }

    public Object a(double d3, double d4, double d5, double d6, boolean bl) {
        return this.a.a(new Object[]{d3, d4, d5, d6, bl});
    }

    private Object a(double d3, double d4, double d5, boolean bl) {
        return this.d.a(new Object[]{d3, d4, d5, bl});
    }

    static Object a(jb_0 jb_02, double d3, double d4, double d5, boolean bl) {
        return jb_02.a(d3, d4, d5, bl);
    }
}

