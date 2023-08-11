/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.AM;
import manthe.I;
import manthe.J;
import manthe.bf_0;
import manthe.ds_2;
import manthe.eJ;
import manthe.eP;
import manthe.fG;
import manthe.fk_0;
import manthe.g4;
import manthe.gb_0;
import manthe.on;
import manthe.pf_0;
import manthe.u5;
import manthe.yq_0;

class nl
implements Runnable {
    private final AM a;

    private nl(AM aM) {
        this.a = aM;
    }

    private bf_0 a() {
        eJ eJ2 = ds_2.k();
        double d3 = eJ2.k() * 2.0;
        double d4 = eJ2.D() * 2.0;
        double d5 = eJ2.u() * 2.0;
        return pf_0.a(eJ2.Y().b(d3, d4, d5));
    }

    @Override
    public void run() {
        try {
            eJ eJ2 = ds_2.k();
            eP eP2 = ds_2.k().aU();
            int n6 = eP2.i();
            boolean bl = false;
            for (int i = 0; i < 9; ++i) {
                fk_0 fk_02;
                fG fG2 = new fG(eP2.h()[i]);
                if (fG2.e() || !(fk_02 = fG2.k()).a(A5.av) || !this.a.u.a(fG2)) continue;
                eP2.a(i);
                bl = true;
                break;
            }
            if (!bl) {
                AM.e(false);
                return;
            }
            J j = new J(0.0f, 0.0f);
            j.b(15.0f);
            yq_0.u.a(j);
            int n10 = 0;
            while (!j.e()) {
                Thread.sleep(10L);
                if (++n10 <= 100) continue;
                AM.e(false);
                return;
            }
            boolean bl2 = false;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            for (int i = 0; i < 1000; ++i) {
                bf_0 bf_02 = this.a();
                if (bf_02 != null) {
                    bl2 = true;
                    n11 = bf_02.a();
                    n12 = bf_02.b();
                    n13 = bf_02.c();
                    break;
                }
                if (eJ2.v()) break;
                Thread.sleep(5L);
            }
            if (bl2) {
                gb_0 gb_02;
                for (int i = 0; i < 50; ++i) {
                    gb_0 gb_03;
                    bf_0 bf_03 = this.a();
                    if (bf_03 != null) {
                        n11 = bf_03.a();
                        n12 = bf_03.b();
                        n13 = bf_03.c();
                    }
                    if ((gb_03 = ds_2.I()).g().equals(g4.f()) && n11 == gb_03.l() && n12 == gb_03.m() && n13 == gb_03.j()) {
                        yq_0.u.a((I)null);
                        break;
                    }
                    Thread.sleep(1L);
                }
                if ((gb_02 = ds_2.I()).g().equals(g4.f())) {
                    u5.c();
                    Thread.sleep(51L);
                    u5.b();
                    Thread.sleep(210L);
                }
                eP2.a(n6);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        AM.e(false);
    }
}

