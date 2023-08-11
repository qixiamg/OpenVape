/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DU;
import manthe.pe_0;
import manthe.we_0;

/*
 * Renamed from manthe.wx
 */
public abstract class wx_0
extends we_0 {
    @Override
    public void b(double d3) {
        super.b(d3 - 10.0);
    }

    @Override
    public void c(double d3) {
        super.c(d3 + 5.0);
    }

    @Override
    public void f(boolean bl) {
        pe_0.a(this.d() - 5.0, this.c(), this.e() + 10.0, bl ? this.K + 2.0 : this.f() + 2.0, this.I());
    }

    @Override
    public DU q() {
        if (this.H) {
            return new DU(this.d() - 5.0, this.c(), this.e() + 10.0, this.L());
        }
        return new DU(this.d() - 5.0, this.c(), this.e() + 10.0, this.f());
    }

    @Override
    public void Z() {
        this.F = new DU(this.F.a() + 5.0, this.F.b(), this.F.d(), this.F.c());
        super.Z();
    }
}

