/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.gJ;

/*
 * Renamed from manthe.hg
 */
public class hg_0
extends gJ {
    private final BG e = this.b("partialRenderTick", false, Float.TYPE);
    private final BG g = this.b("renderer", false, A5.p);
    private final BG f = this.b("x", false, Double.TYPE);
    private final BG a = this.b("y", false, Double.TYPE);
    private final BG d = this.b("z", false, Double.TYPE);

    public hg_0() {
        super("net/minecraftforge/client/event/RenderPlayerEvent");
    }

    private float e(Object object) {
        return this.e.b(object);
    }

    private Object a(Object object) {
        return this.g.f(object);
    }

    public double b(Object object) {
        return this.f.g(object);
    }

    public double d(Object object) {
        return this.a.g(object);
    }

    public double c(Object object) {
        return this.d.g(object);
    }

    static Object a(hg_0 hg_02, Object object) {
        return hg_02.a(object);
    }

    static float b(hg_0 hg_02, Object object) {
        return hg_02.e(object);
    }
}

