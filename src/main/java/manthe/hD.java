/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bp_1;
import manthe.gJ;

public class hD
extends gJ {
    private final BG i = this.b("renderAllFaces", true, Boolean.TYPE);
    public final bp_1 k = this.a("renderBlockByRenderType", true, Boolean.TYPE, A5.F, Integer.TYPE, Integer.TYPE, Integer.TYPE);
    public final bp_1 j = this.a("renderStandardBlock", true, Boolean.TYPE, A5.F, Integer.TYPE, Integer.TYPE, Integer.TYPE);
    public final bp_1 f = this.a("renderStandardBlockWithColorMultiplier", true, Boolean.TYPE, A5.F, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
    public final bp_1 e = this.a("renderFaceXNeg", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bp_1 l = this.a("renderFaceXPos", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bp_1 g = this.a("renderFaceYNeg", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bp_1 h = this.a("renderFaceYPos", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bp_1 d = this.a("renderFaceZNeg", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bp_1 a = this.a("renderFaceZPos", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);

    public hD() {
        super(A5.t);
    }

    public boolean a(Object object, Object object2, int n6, int n10, int n11, float f10, float f11, float f12) {
        return this.f.h(object, object2, n6, n10, n11, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12));
    }

    public void a(Object object, boolean bl) {
        this.i.a(object, bl);
    }
}

