/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A3;
import manthe.I;
import manthe.J;
import manthe.bK;
import manthe.ds_2;
import manthe.eJ;
import manthe.eP;
import manthe.fG;
import manthe.fk_0;
import manthe.g4;
import manthe.gb_0;
import manthe.nO;
import manthe.on;
import manthe.pf_0;
import manthe.u5;
import manthe.yq_0;

class vE
implements Runnable {
    private final A3 a;

    private vE(A3 a3) {
        this.a = a3;
    }

    private bK a() {
        eJ eJ2 = ds_2.k();
        double d3 = eJ2.k() * 2.0;
        double d4 = eJ2.u() * 2.0;
        return pf_0.b(eJ2.Y().b(0.0, -5.0, 0.0));
    }

    @Override
    public void run() {
        try {
            eJ eJ2 = ds_2.k();
            eP eP2 = ds_2.k().aU();
            int n6 = eP2.i();
            boolean bl = false;
            boolean bl2 = false;
            on.a("run");
            for (int i = 0; i < 9; ++i) {
                fG fG2 = new fG(eP2.h()[i]);
                if (fG2.e()) continue;
                fk_0 fk_02 = fG2.k();
                if (A3.a(this.a).u().booleanValue() && fk_0.a(fk_02) == 326) {
                    eP2.a(i);
                    bl = true;
                    break;
                }
                if (!A3.b(this.a).u().booleanValue() || fk_0.a(fk_02) != 30) continue;
                eP2.a(i);
                bl = true;
                bl2 = true;
                break;
            }
            if (!bl) {
                A3.e(false);
                return;
            }
            on.a("a " + eJ2.D());
            if (eJ2.D() >= 0.0) {
                A3.e(false);
                return;
            }
            J j = new J(-999.0f, 90.0f);
            j.b(10.0f);
            yq_0.u.a(j);
            on.a("b");
            int n10 = 0;
            while (!j.e()) {
                Thread.sleep(10L);
                if (++n10 <= 100) continue;
                A3.e(false);
                return;
            }
            on.a("c");
            boolean bl3 = false;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            for (int i = 0; i < 1000; ++i) {
                bK bK2 = this.a();
                if (bK2 != null) {
                    bl3 = true;
                    n11 = bK2.a();
                    n12 = bK2.b();
                    n13 = bK2.c();
                    break;
                }
                if (eJ2.v()) break;
                Thread.sleep(5L);
            }
            float f10 = eJ2.U();
            if (bl3) {
                gb_0 gb_02;
                for (int i = 0; i < 50; ++i) {
                    gb_0 gb_03;
                    bK bK3 = this.a();
                    if (bK3 != null) {
                        n11 = bK3.a();
                        n12 = bK3.b();
                        n13 = bK3.c();
                    }
                    if ((gb_03 = ds_2.I()).g().equals(g4.f())) {
                        yq_0.u.a((I)null);
                        break;
                    }
                    Thread.sleep(1L);
                }
                if ((gb_02 = ds_2.I()).g().equals(g4.f())) {
                    u5.c();
                    Thread.sleep(51L);
                    u5.b();
                    Thread.sleep(10L);
                    Thread.sleep(200L);
                    if (!bl2) {
                        for (int i = 0; i < 100; ++i) {
                            if (eJ2.H()) {
                                Thread.sleep(50L);
                                break;
                            }
                            Thread.sleep(1L);
                        }
                        Thread.sleep(50L);
                        u5.c();
                        Thread.sleep(10L);
                        u5.b();
                        Thread.sleep(100L);
                    } else {
                        Thread.sleep(100L);
                    }
                }
                yq_0.u.a(new J(-999.0f, 0.0f).b(10.0f));
                eP2.a(n6);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        A3.e(false);
    }

    vE(A3 a3, nO nO2) {
        this(a3);
    }
}

