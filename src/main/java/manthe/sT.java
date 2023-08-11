/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Arrays;
import java.util.List;
import manthe.DF;
import manthe.ds_2;
import manthe.dx_2;
import manthe.eJ;
import manthe.ex_0;
import manthe.gO;
import manthe.on;
import manthe.pf_0;
import manthe.qw;
import manthe.tV;

public class sT
implements Runnable {
    private final int[][] f = new int[][]{{0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}};
    private final List<Integer> a = Arrays.asList(0, 8, 9, 30);
    private final List<tV> e;
    private final List<qw> c;
    private final DF b;
    private boolean g;
    private boolean d;

    public sT(List<tV> list, List<qw> list2, DF dF) {
        this.e = list;
        this.c = list2;
        this.b = dF;
    }

    public tV a(int n6, int n10, int n11) {
        for (tV tV2 : this.e) {
            if (tV2.a != n6 || tV2.b != n10 || tV2.f != n11) continue;
            return tV2;
        }
        return null;
    }

    public boolean b(int n6, int n10, int n11) {
        gO gO2 = ds_2.t();
        for (int[] nArray : this.f) {
            dx_2 dx_22 = gO2.b(n6 + nArray[0], n10 + nArray[1], n11 + nArray[2]);
            int n12 = dx_2.a(dx_22);
            if (!this.a.contains(n12)) continue;
            return true;
        }
        return false;
    }

    public qw a(int n6, int n10) {
        for (qw qw2 : this.c) {
            if (!qw2.a(n6, n10)) continue;
            return qw2;
        }
        return null;
    }

    @Override
    public void run() {
        block11: {
            try {
                block4: while (this.g) {
                    try {
                        Thread.sleep(50L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                    if (ds_2.t().e() || ds_2.k().e()) continue;
                    eJ eJ2 = ds_2.k();
                    gO gO2 = ds_2.t();
                    int n6 = this.b.a().intValue();
                    this.b(0, 0, 0);
                    for (int i = -n6; i < n6; ++i) {
                        for (int j = -n6; j < n6; ++j) {
                            for (int k = -n6; k < n6; ++k) {
                                if (this.g) {
                                    boolean bl;
                                    if (ds_2.t().e() || !ds_2.t().equals(gO2) || ds_2.k().e() || !ds_2.k().equals(eJ2)) {
                                        this.e.clear();
                                        continue block4;
                                    }
                                    int n10 = (int)eJ2.z() + i;
                                    int n11 = (int)eJ2.l() + k;
                                    int n12 = (int)eJ2.g() + j;
                                    dx_2 dx_22 = gO2.b(n10, n11, n12);
                                    int n13 = dx_2.a(dx_22);
                                    int n14 = dx_22.a(n10, n11, n12);
                                    tV tV2 = this.a(n10, n11, n12);
                                    boolean bl2 = bl = tV2 != null;
                                    if (!bl) {
                                        qw qw2 = this.a(n13, n14);
                                        if (qw2 == null || this.d && !this.b(n10, n11, n12)) continue;
                                        this.e.add(new tV(n10, n11, n12, n13, qw2.b(), qw2.k()));
                                        continue;
                                    }
                                    if (n13 == tV2.g && !(pf_0.b((ex_0)eJ2, (double)n10, (double)n11, n12) > 200.0)) continue;
                                    this.e.remove(tV2);
                                    continue;
                                }
                                break block11;
                            }
                        }
                    }
                }
            }
            catch (Exception exception) {
                on.a(exception);
            }
        }
    }

    public void e() {
        this.g = true;
        new Thread(this).start();
    }

    public void f() {
        this.g = false;
    }

    public boolean a() {
        return this.g;
    }

    public DF b() {
        return this.b;
    }

    public List<tV> c() {
        return this.e;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

