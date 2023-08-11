/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class A3
extends Module {
    private static boolean u;
    private final BooleanValue w = BooleanValue.createValue(this, "Use buckets", true);
    private final BooleanValue y = BooleanValue.createValue(this, "Use cobwebs", true);
    private boolean v;
    private boolean x;

    public A3() {
        super("MLG", -16764673, CQ.e, "Automatically places water under you when you fall");
        this.a(this.w, this.y);
    }

    @Override
    public void s() {
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (ds_2.x().d()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (eJ2.a8().h()) {
            this.v = false;
            return;
        }
        if (this.v && !eJ2.v()) {
            this.x = true;
        }
        if (this.x && eJ2.t() >= 3.0f && !u) {
            u = true;
            this.x = false;
            new Thread(new vE(this, null)).start();
        }
        if (eJ2.v()) {
            this.x = false;
        }
        this.v = eJ2.v();
    }

    static BooleanValue a(A3 a3) {
        return a3.w;
    }

    static BooleanValue b(A3 a3) {
        return a3.y;
    }

    static boolean e(boolean bl) {
        u = bl;
        return u;
    }
}

