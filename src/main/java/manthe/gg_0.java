/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.gf_0;
import manthe.js_0;

/*
 * Renamed from manthe.gg
 */
public class gg_0
extends cy_0 {
    public gg_0(Object object) {
        super(object);
    }

    public static gg_0[] f() {
        Object[] objectArray = V.c() > 13 ? gg_0.a.M().bw.e() : gg_0.a.M().bw.d();
        gg_0[] gg_0Array = new gg_0[6];
        for (int i = 0; i < objectArray.length; ++i) {
            gg_0Array[i] = new gg_0(objectArray[i]);
        }
        return gg_0Array;
    }

    public int h() {
        if (V.c() > 13) {
            return gg_0.a.M().bw.d(this.b);
        }
        return js_0.a(gg_0.a.M().bw, this.b);
    }

    public gg_0 g() {
        if (V.c() > 13) {
            return new gg_0(gg_0.a.M().bw.c(this.b));
        }
        return gg_0.f()[js_0.b(gg_0.a.M().bw, this.b)];
    }

    public gf_0 l() {
        return new gf_0(gg_0.a.M().bw.h(this.b));
    }

    public String m() {
        return String.valueOf(gg_0.a.M().bw.f(this.b));
    }

    public int i() {
        return js_0.e(gg_0.a.M().bw, this.b);
    }

    public int j() {
        return js_0.d(gg_0.a.M().bw, this.b);
    }

    public int k() {
        return js_0.c(gg_0.a.M().bw, this.b);
    }
}

