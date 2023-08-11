/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.concurrent.CopyOnWriteArrayList;

public class w0
extends wy_0 {
    private static w0 ab;

    public w0() {
        super(CQ.g);
        ab = this;
    }

    @Override
    public void ap() {
        this.Y = new xW(this, "newfavorites", "Favorites");
        this.a(this.Y);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    public static void ar() {
        ab.J();
        CopyOnWriteArrayList<Module> copyOnWriteArrayList = new CopyOnWriteArrayList<Module>(on.p.A().b());
        for (Module y52 : copyOnWriteArrayList) {
            wz_0 wz_02 = new wz_0(ab, y52);
            ab.a((wM)wz_02, new Object[0]);
            wz_02.R();
        }
    }

    public static wz_0 c(Module y52) {
        for (wM wM2 : ab.w()) {
            if (!(wM2 instanceof wz_0) || !((wz_0)wM2).S().equals(y52)) continue;
            return (wz_0)wM2;
        }
        return null;
    }

    public static w0 aq() {
        return ab;
    }
}

