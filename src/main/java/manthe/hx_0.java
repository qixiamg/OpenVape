/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;
import manthe.on;

/*
 * Renamed from manthe.hx
 */
public class hx_0
extends gJ {
    private final bp_1 d;
    private final bp_1 f;
    public final BG j;
    private bp_1 a;
    private bp_1 k;
    public bp_1 h;
    public bp_1 e;
    public BG i = this.b("posX", true, Float.TYPE);
    public BG g = this.b("posY", true, Float.TYPE);
    public BG m = this.b("alpha", true, Float.TYPE);
    public BG l;

    public hx_0() {
        super(A5.l);
        if (V.c() == 13) {
            this.a = this.a("drawStringWithShadow", true, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.d = this.a("drawString", true, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        } else {
            this.k = this.a("drawStringWithShadow", true, Integer.TYPE, String.class, Float.TYPE, Float.TYPE, Integer.TYPE);
            this.d = this.a("func_78276_b", on.p.h(), Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        }
        this.j = this.b("locationFontTexture", true, A5.ca);
        this.f = this.a("getStringWidth", true, Integer.TYPE, String.class);
        this.h = this.a("renderStringAtPos", true, Void.TYPE, String.class, Boolean.TYPE);
        this.e = this.a("renderDefaultChar", true, Float.TYPE, Integer.TYPE, Boolean.TYPE);
        this.l = this.b("boldStyle", true, Boolean.TYPE);
    }

    public float c(Object object) {
        return this.i.b(object);
    }

    public float b(Object object) {
        return this.g.b(object);
    }

    public void c(Object object, float f10) {
        this.i.a(object, f10);
    }

    public void a(Object object, float f10) {
        this.g.a(object, f10);
    }

    public void b(Object object, float f10) {
        this.m.a(object, f10);
    }

    public int a(Object object, String string, int n6, int n10, int n11) {
        return this.a.o(object, string, n6, n10, n11);
    }

    public int a(Object object, String string, float f10, float f11, int n6) {
        return this.k.o(object, string, Float.valueOf(f10), Float.valueOf(f11), n6);
    }

    public int b(Object object, String string, int n6, int n10, int n11) {
        return this.d.o(object, string, n6, n10, n11);
    }

    public int a(Object object, String string) {
        return this.f.o(object, string);
    }

    public int d(Object object) {
        return 10;
    }

    public Object a(Object object) {
        return this.j.f(object);
    }
}

