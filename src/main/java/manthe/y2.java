/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.List;

public class y2
extends yc_0 {
    private final zz_0 v = (zz_0)this.S();
    private static int[] w;

    public y2(Module y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(km_0 km_02) {
        if (this.v.x == 3) {
            eJ eJ2 = ds_2.k();
            double d3 = 0.42f;
            if (eJ2.a(fX.k())) {
                d3 = (float)(eJ2.b(fX.k()).h() + 1) * 0.1f;
            }
            km_0.setY(km_0.getY() + d3);
        }
    }

    @Override
    public void a(ks_0 ks_02) {
        eJ eJ2;
        if (!ks_02.c()) {
            return;
        }
        if (this.v.x < 1) {
            ++this.v.x;
            this.v.C = 0.0;
        }
        if ((eJ2 = ds_2.k()).H()) {
            return;
        }
        if (eJ2.v() || eJ2.J() || this.v.x == 3) {
            if (!eJ2.E() && eJ2.aF() != 0.0f || eJ2.ay() != 0.0f) {
                if (this.v.x == 2) {
                    this.v.z *= 2.149;
                    this.v.x = 3;
                } else if (this.v.x == 3) {
                    this.v.x = 2;
                    double d3 = 0.66 * (this.v.C - this.v.S());
                    this.v.z = this.v.C - d3;
                } else {
                    fP fP2 = null;
                    fP2 = V.c() == 13 ? eJ2.s().k().b(0.0, eJ2.D(), 0.0) : eJ2.s().b(0.0, eJ2.D(), 0.0);
                    List list = ds_2.t().b(eJ2, fP2);
                    if ((list.size() > 0 || eJ2.J()) && this.v.x > 0) {
                        this.v.x = 1;
                    }
                }
            }
            this.v.z = Math.max(this.v.z, this.v.S());
            this.v.a(ks_02, this.v.z, eJ2);
        }
    }

    public static void b(int[] nArray) {
        w = nArray;
    }

    public static int[] T() {
        return w;
    }

    static {
        if (y2.T() == null) {
            y2.b(new int[1]);
        }
    }
}

