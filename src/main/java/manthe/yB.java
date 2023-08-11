/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manthe.A5;
import manthe.AO;
import manthe.DF;
import manthe.DX;
import manthe.ds_2;
import manthe.eJ;
import manthe.ei_0;
import manthe.f9;
import manthe.fI;
import manthe.fQ;
import manthe.fV;
import manthe.fk_0;
import manthe.kt_0;
import manthe.pb_0;
import manthe.y8;

public class yB
extends y8 {
    private final HashMap<pb_0, f9> A = new HashMap();
    private final DX E;
    private final DX v;
    private final DF z = DF.a(this, "Delay", "#", "", 0.0, 100.0, 200.0);
    private final AO y = new AO();
    private final Map<Integer, Integer> B = new HashMap<Integer, Integer>();
    private boolean F;
    private boolean w;
    private boolean u;
    private f9 D;
    private int C;
    private int x;

    public yB() {
        super("ArmorSwitch", "Switches between armor sets");
        pb_0 pb_02 = new pb_0("Diamond");
        pb_0 pb_03 = new pb_0("Gold");
        pb_0 pb_04 = new pb_0("Iron");
        pb_0 pb_05 = new pb_0("Leather");
        pb_0 pb_06 = new pb_0("Chain");
        this.A.put(pb_02, f9.i());
        this.A.put(pb_03, f9.f());
        this.A.put(pb_04, f9.j());
        this.A.put(pb_05, f9.g());
        this.A.put(pb_06, f9.h());
        this.E = DX.a((Object)this, "Set 1", pb_02, this.A.keySet().toArray(new pb_0[this.A.size()]));
        this.v = DX.a((Object)this, "Set 2", pb_03, this.A.keySet().toArray(new pb_0[this.A.size()]));
        this.a(this.E, this.v, this.z);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2 = ds_2.k();
        if (eJ2.d() && eJ2.a8().g()) {
            this.d(false);
            return;
        }
        if (this.F) {
            this.d(false);
            return;
        }
        if (!ds_2.x().a(A5.ag)) {
            int n6 = ds_2.s().t().i();
            ei_0.a(n6, true);
            ei_0.a(n6);
            ei_0.a(n6, false);
            this.w = true;
            return;
        }
        if (this.u && this.y.a(this.z.a().longValue())) {
            this.y.d();
            int n10 = this.B.get(this.C);
            this.a(this.C, n10);
            if (this.C > 8) {
                this.F = true;
            }
            return;
        }
        boolean bl = this.S();
        if (this.w && bl && !this.u) {
            boolean bl2 = this.D.equals(this.A.get(this.E.v()));
            if (this.a(bl2 ? this.A.get(this.v.v()) : this.A.get(this.E.v()))) {
                this.u = true;
            } else {
                this.d(false);
            }
        }
        if (!bl) {
            this.d(false);
        }
    }

    private void a(int n6, int n10) {
        int n11 = n10;
        if (this.x == 1) {
            n11 = n6;
        }
        ds_2.K().a(ds_2.k().aY().g(), n11, 1, 0, ds_2.k());
        ++this.x;
        if (this.x >= 3) {
            this.x = 0;
            ++this.C;
        }
    }

    private boolean S() {
        eJ eJ2 = ds_2.k();
        fI fI2 = eJ2.aY();
        List<fQ> list = fI2.f();
        for (int i = 5; i < 9; ++i) {
            fQ fQ2 = list.get(i);
            if (!fQ2.h() || !fQ2.f().k().a(A5.cN)) continue;
            fV fV2 = new fV(fQ2.f().k());
            this.D = fV2.l();
            return true;
        }
        return false;
    }

    private boolean a(f9 f92) {
        int n6 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        eJ eJ2 = ds_2.k();
        fI fI2 = eJ2.aY();
        List<fQ> list = fI2.f();
        block6: for (int i = 9; i < 45; ++i) {
            fV fV2;
            fk_0 fk_02;
            fQ fQ2 = list.get(i);
            if (!fQ2.h() || !(fk_02 = fQ2.f().k()).a(A5.cN) || !(fV2 = new fV(fk_02)).l().equals(f92)) continue;
            switch (fV2.k()) {
                case 0: {
                    n6 = i;
                    continue block6;
                }
                case 1: {
                    n10 = i;
                    continue block6;
                }
                case 2: {
                    n11 = i;
                    continue block6;
                }
                case 3: {
                    n12 = i;
                }
            }
        }
        this.B.put(5, n6);
        this.B.put(6, n10);
        this.B.put(7, n11);
        this.B.put(8, n12);
        return n6 != 0 && n10 != 0 && n11 != 0 && n12 != 0;
    }

    @Override
    public void s() {
        eJ eJ2 = ds_2.k();
        if (eJ2.d() && eJ2.a8().g()) {
            this.d(false);
            return;
        }
        this.C = 5;
        this.x = 0;
        this.u = false;
        this.F = false;
        this.w = false;
    }

    @Override
    public void J() {
        if (ds_2.x().a(A5.ag)) {
            ds_2.k().aX();
        }
    }
}

