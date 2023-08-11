/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.fG;
import manthe.fk_0;
import manthe.pe_0;
import manthe.wI;

/*
 * Renamed from manthe.wt
 */
public class wt_0
extends wI {
    private double I = 27.5;
    private Color E;
    private Color D;
    private int H;
    private fG G;
    private boolean F;

    public wt_0(Color color, Color color2, int n6) {
        this.E = color;
        this.D = color2;
        this.a(n6);
    }

    public wt_0(Color color, Color color2, fG fG2) {
        this.E = color;
        this.D = color2;
        if (fG2 != null && fG2.d()) {
            this.G = fG2;
            this.H = fG2.k().h();
            this.a(fG2.j());
        }
    }

    @Override
    public void a() {
        double d3 = this.f() / 2.0;
        if (this.F) {
            pe_0.a(this.d() + 1.0, this.c() + 1.0, this.I - 1.0, this.I - 1.0, wt_0.b.f, 2.0f, 1.0f, 2.0f);
        }
        pe_0.a(this.d() + 1.0, this.c() + 1.0, this.I - 2.0, this.I - 2.0, this.x() ? this.D : this.E);
        if (this.G != null && this.G.d()) {
            double d4 = 1.0;
            double d5 = 8.0 * d4;
            pe_0.a(this.G, d4, this.d() + d3 - d5, this.c() + d3 - d5);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return this.I;
    }

    @Override
    public double h() {
        return this.I;
    }

    public void a(int n6) {
        this.H = n6;
        fk_0 fk_02 = fk_0.a(n6);
        if (fk_02.d()) {
            this.G = fG.a(fk_02);
            this.a(this.G.j());
        }
    }

    public void a(fG fG2) {
        this.G = fG2;
        if (fG2 != null && fG2.d()) {
            this.a(fG2.j());
        }
    }

    public void f(boolean bl) {
        this.F = bl;
    }
}

