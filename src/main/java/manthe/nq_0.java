/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.nq
 */
class nq_0
implements pc {
    final Module a;
    final wz_0 b;

    nq_0(wz_0 wz_02, Module y52) {
        this.b = wz_02;
        this.a = y52;
    }

    @Override
    public void b() {
        if (zu_0.E) {
            if (!wz_0.f(this.b) && wz_0.a(this.b).a(o7.b())) {
                this.a.l().Y().g(!this.a.l().Y().G());
                if (this.a.N() && !this.a.x()) {
                    this.a.d(false);
                }
                if (wz_0.d(this.b)) {
                    wz_0.a(this.b, false);
                }
                zu_0.an();
            }
            return;
        }
        if (this.a.p()) {
            if (!this.a.f()) {
                this.b.b("must be bound");
                wz_0.b(this.b).f(true);
                return;
            }
            this.b.b("use via bind");
            wz_0.b(this.b).f(true);
            return;
        }
        if (this.a.n() && !on.C) {
            wz_0.c(this.b).a(true);
            this.b.b("                                                          ");
            this.b.b(1);
            return;
        }
        this.a.a(!this.a.N(), true);
    }

    @Override
    public void a() {
        wz_0.e(this.b).J();
    }
}

