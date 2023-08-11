/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.mq;
import manthe.pe_0;
import manthe.uW;
import manthe.xU;

/*
 * Renamed from manthe.xe
 */
public class xe_0
extends xU {
    private int E;
    private int F;

    public xe_0(String string) {
        super(string);
    }

    @Override
    public void a() {
        this.J();
    }

    @Override
    public void k() {
        this.J();
    }

    private void J() {
        mq mq2 = this.e(0.85);
        int n6 = this.E - this.F;
        int n10 = Math.abs(n6);
        boolean bl = n6 < 0;
        boolean bl2 = n6 > 0;
        String string = (bl2 ? "+" : (bl ? "-" : "")) + n10;
        double d3 = mq2.b(string) + 5.0;
        if (d3 < 10.0) {
            d3 = 10.0;
        }
        pe_0.a(this.d() + 5.0, this.c() + 5.0, d3, 10.0, xe_0.b.y);
        double d4 = this.c() + 5.0 + 2.0;
        mq2.b(string, this.d() + 5.0 + d3 / 2.0, d4, bl2 ? xe_0.b.i : (bl ? xe_0.b.j : xe_0.b.r));
        mq2.a(this.n(), this.d() + 10.0 + d3, d4, xe_0.b.r);
        String string2 = this.E > 9 ? "" + this.E : "0" + this.E;
        String string3 = this.F > 9 ? "" + this.F : "0" + this.F;
        double d5 = mq2.b(string2);
        double d6 = mq2.b(string2);
        double d7 = mq2.b("/");
        double d8 = this.d() + this.e() - 5.0 - d6;
        mq2.a(string3, d8, d4, xe_0.b.s);
        mq2.a("/", d8 - 5.0 - d7, d4, xe_0.b.s);
        mq2.a(string2, d8 - 10.0 - d7 - d5, d4, xe_0.b.r);
        double d10 = this.c() + 22.5;
        double d11 = 6.0;
        pe_0.c(this.d() + 5.0, d10 - 0.5, this.e() - 10.0, 1.0, xe_0.b.y);
        int n11 = this.E + this.F;
        if (n11 == 0) {
            pe_0.a("greenglowsquare", this.d() + this.e() / 2.0, d10, 20.0, 20.0, Color.WHITE);
            return;
        }
        double d12 = (double)n10 / (double)n11;
        double d13 = this.e() / 2.0 - 5.0 - d11;
        double d14 = this.E >= this.F ? this.d() + 5.0 + d13 - d13 * d12 : this.d() + 5.0 + d13 + d11 * 2.0 + d13 * d12;
        if (this.E >= this.F) {
            pe_0.c(d14, d10 - 0.5, this.d() + this.e() / 2.0 - d14, 1.0, xe_0.b.i);
        } else {
            pe_0.c(this.d() + this.e() / 2.0, d10 - 0.5, d14 - this.d() - this.e() / 2.0, 1.0, xe_0.b.j);
        }
        pe_0.a(this.E >= this.F ? "greenglowsquare" : "redglowsquare", this.d() + this.e() / 2.0, d10, 20.0, 20.0, Color.WHITE);
        pe_0.a(this.E >= this.F ? "greenglowsquare" : "redglowsquare", d14, d10, 20.0, 20.0, Color.WHITE);
    }

    public void b(int n6) {
        this.F = n6;
    }

    public void a(int n6) {
        this.E = n6;
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 20.0;
    }

    @Override
    public double h() {
        return 30.0;
    }
}

