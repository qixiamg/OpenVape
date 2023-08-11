/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

public class iI
extends gJ {
    private BG e;
    private final BG a = V.c() >= 23 ? this.a("INSTANCE", true, A5.c_) : this.a("instance", true, A5.c_);
    private final bp_1 d;
    private BG k;
    private bp_1 i;
    private bp_1 j;
    private bp_1 f;
    private bp_1 h;
    private bp_1 g;

    public iI() {
        super(A5.c_);
        if (V.c() > 13) {
            this.k = this.b("worldRenderer", true, A5.cu);
            this.d = this.a("draw", true, Void.TYPE, new Class[0]);
        } else {
            this.e = this.b("renderingChunk", true, Boolean.TYPE);
            this.g = this.a("setColorRGBA", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.i = this.a("startDrawingQuads", true, Void.TYPE, new Class[0]);
            this.j = this.a("addVertex", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
            this.d = this.a("draw", true, Integer.TYPE, new Class[0]);
            this.f = this.a("startDrawing", true, Void.TYPE, Integer.TYPE);
            this.h = this.a("addVertexWithUV", true, Void.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
        }
    }

    private Object d() {
        return this.a.f(null);
    }

    private Object b(Object object) {
        return this.k.f(object);
    }

    private void c(Object object) {
        this.d.p(object, new Object[0]);
    }

    private void d(Object object) {
        this.i.p(object, new Object[0]);
    }

    private void a(Object object, double d3, double d4, double d5) {
        this.j.p(object, d3, d4, d5);
    }

    private void a(Object object, double d3, double d4, double d5, double d6, double d7) {
        this.h.p(object, d3, d4, d5, d6, d7);
    }

    private void a(Object object, int n6) {
        this.f.p(object, n6);
    }

    public boolean a(Object object) {
        return this.e.d(object);
    }

    public void a(Object object, int n6, int n10, int n11, int n12) {
        this.g.p(object, n6, n10, n11, n12);
    }

    static Object a(iI iI2) {
        return iI2.d();
    }

    static Object a(iI iI2, Object object) {
        return iI2.b(object);
    }

    static void c(iI iI2, Object object) {
        iI2.c(object);
    }

    static void b(iI iI2, Object object) {
        iI2.d(object);
    }

    static void a(iI iI2, Object object, double d3, double d4, double d5) {
        iI2.a(object, d3, d4, d5);
    }

    static void a(iI iI2, Object object, int n6) {
        iI2.a(object, n6);
    }

    static void a(iI iI2, Object object, double d3, double d4, double d5, double d6, double d7) {
        iI2.a(object, d3, d4, d5, d6, d7);
    }
}

