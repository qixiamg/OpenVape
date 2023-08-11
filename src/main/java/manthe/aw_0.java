/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.on;
import manthe.oq;
import manthe.pJ;
import manthe.u9;
import manthe.uV;
import manthe.zu_0;

/*
 * Renamed from manthe.Aw
 */
public abstract class aw_0
implements oq {
    private double e;
    private double c;
    private double h;
    private double d;
    private final String g;
    private final u9 f;
    private final pJ i;
    private final Color b;
    private uV a = new uV();

    public aw_0(pJ pJ2, String string, u9 u92, double d3, double d4) {
        this.e = this.h = d3;
        this.c = this.d = d4;
        this.g = string;
        this.f = u92;
        this.i = pJ2;
        this.b = new Color(pJ2.a());
    }

    public String i() {
        return this.g;
    }

    public u9 l() {
        return this.f;
    }

    public pJ j() {
        return this.i;
    }

    @Override
    public double b() {
        double d3 = on.p.j().b(this.g) + 2.0;
        return Math.max(d3, this.f.b());
    }

    @Override
    public double e() {
        return 25.0 + this.f.a();
    }

    @Override
    public double a() {
        return this.e;
    }

    @Override
    public void d(double d3) {
        this.e = d3;
    }

    @Override
    public double h() {
        return this.c;
    }

    @Override
    public void c(double d3) {
        this.c = d3;
    }

    @Override
    public double d() {
        return this.h;
    }

    @Override
    public void a(double d3) {
        this.h = d3;
    }

    @Override
    public double f() {
        return this.d;
    }

    @Override
    public void b(double d3) {
        this.d = d3;
    }

    public Color k() {
        if (!zu_0.T.ab()) {
            return this.b;
        }
        return Color.WHITE;
    }

    public String m() {
        if (!zu_0.T.ab()) {
            return "noti_info";
        }
        return this.i.c();
    }
}

