/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bo_0;
import manthe.f;

/*
 * Renamed from manthe.j
 */
public class j_0
extends f<bo_0> {
    private bo_0 g;
    private bo_0 h;
    private int e;
    private int f;

    public j_0(double d3, bo_0 bo_02, bo_0 bo_03) {
        super(d3);
        this.g = bo_02;
        this.h = bo_03;
        this.e = bo_03.a - bo_02.a;
        this.f = bo_03.b - bo_02.b;
    }

    public bo_0 o() {
        double d3 = this.l();
        if (d3 == 0.0) {
            return this.g;
        }
        if (d3 == 100.0) {
            return this.h;
        }
        int n6 = this.g.a + (int)(this.l() * (double)this.e / 100.0);
        int n10 = this.g.b + (int)(this.l() * (double)this.f / 100.0);
        return new bo_0(n6, n10);
    }

    public void b(bo_0 bo_02) {
        this.g = bo_02;
        this.e = this.h.a - bo_02.a;
        this.f = this.h.b - bo_02.b;
    }

    public void a(bo_0 bo_02) {
        this.h = bo_02;
        this.e = bo_02.a - this.g.a;
        this.f = bo_02.b - this.g.b;
    }

    public bo_0 n() {
        return this.g;
    }

    public bo_0 p() {
        return this.h;
    }
}

