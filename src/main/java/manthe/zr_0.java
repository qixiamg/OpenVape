/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.zr
 */
public class zr_0
extends Module {
    private final pb_0 x = new pb_0("Night Vision");
    private final pb_0 w = new pb_0("Gamma");
    private final DX v = DX.a((Object)this, "Mode", this.x, this.x, this.w);
    private float u = -1.0f;

    public zr_0() {
        super("Fullbright", -256, CQ.d);
        this.a(this.v);
        ((rz_0)this.v.getDefaultValue()).a(new be_1(this));
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (this.v.v().equals(this.x)) {
            ds_2.k().a(fE.a(16, 5220, 0));
        } else {
            ds_2.s().b(100.0f);
        }
    }

    @Override
    public void s() {
        this.u = ds_2.s().p();
    }

    @Override
    public void J() {
        if (this.v.v().equals(this.x)) {
            if (ds_2.k().d()) {
                ds_2.k().f(16);
            }
        } else {
            ds_2.s().b(this.u);
        }
    }

    static pb_0 a(zr_0 zr_02) {
        return zr_02.w;
    }

    static DX b(zr_0 zr_02) {
        return zr_02.v;
    }

    static float c(zr_0 zr_02) {
        return zr_02.u;
    }
}

