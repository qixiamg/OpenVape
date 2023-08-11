/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.ej_0;
import manthe.ex_0;
import manthe.gS;
import manthe.gb_0;
import manthe.pf_0;

/*
 * Renamed from manthe.Cg
 */
public class cg_0 {
    private final int a;
    private boolean c;
    private double e;
    private gS f;
    private int d;
    private int b;

    public cg_0(int n6) {
        this.a = n6;
    }

    public boolean a() {
        return this.c;
    }

    public void c() {
        this.c = false;
        this.e = -999.0;
        this.f = ds_2.t();
        this.b = 0;
        this.d = 0;
    }

    public void b() {
        this.c = true;
        this.d = this.a;
    }

    public void a(ej_0 ej_02) {
        boolean bl;
        boolean bl2;
        double d3 = ej_02.aD();
        gS gS2 = ej_02.i();
        if (gS2.e() || this.f != null && this.f.d() && !gS2.equals(this.f)) {
            this.c();
            return;
        }
        if (this.c) {
            if (this.d > 0) {
                --this.d;
            } else {
                bl2 = pf_0.a((ex_0)ej_02);
                if (bl2) {
                    ++this.b;
                    if (this.b >= 5) {
                        this.c();
                        return;
                    }
                    if (!pf_0.e(ej_02) && !pf_0.b((ex_0)ej_02)) {
                        this.c();
                        return;
                    }
                    this.b();
                } else {
                    this.b = 0;
                    if (pf_0.a((ex_0)ej_02, 10) == 0) {
                        this.c();
                        return;
                    }
                }
            }
        }
        bl2 = d3 < this.e || ej_02.F() == 20;
        gb_0 gb_02 = ds_2.I();
        boolean bl3 = bl = gb_02.d() && gb_02.h().d() && ej_02.aM();
        if (bl2 || bl) {
            this.b();
        }
        this.f = gS2;
        this.e = d3;
    }
}

