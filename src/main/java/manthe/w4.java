/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.k9;
import manthe.mq;
import manthe.nu;
import manthe.oV;
import manthe.ok_0;
import manthe.pe_0;
import manthe.wI;
import manthe.yI;
import manthe.yt_0;

public class w4
extends wI {
    private final ok_0 D;
    private yt_0 F;
    private boolean E;
    private Color G = new Color(255, 255, 255, 100);

    public w4(yt_0 yt_02) {
        this.F = yt_02;
        this.c(new nu(this));
        this.D = new oV(this, yt_02, null);
    }

    @Override
    public void a() {
        Color color;
        float f10;
        String string = this.F.a();
        mq mq2 = this.e(0.9);
        double d3 = mq2.a(string);
        double d4 = mq2.b(string);
        Color color2 = yI.a();
        Color color3 = this.E ? w4.b.h : (this.F.j() ? color2 : w4.b.s);
        this.getClass();
        float f11 = 8.0f / 2.0f;
        float f12 = f10 = this.e() != 10.0 ? (float)this.e() - 6.0f : f11;
        if (this.D.c()) {
            this.b(10.0);
            this.a("Click to remove bind");
        } else {
            this.a("Click to bind");
        }
        if (this.x() || this.D.c()) {
            Color color4 = new Color(255, 255, 255, this.F.j() ? 51 : 17);
            pe_0.a(this.d(), this.c(), this.e(), this.f(), color4);
            k9.a(this.F.j() ? color2 : w4.b.r, (float)this.d() + f10 / 2.0f, (float)this.c() + f11 / 2.0f, this.D.c() ? "newclose" : "newedit", f11 * 1.5f, f11 * 1.5f, false);
            return;
        }
        if (string == null || string.length() < 1) {
            Color color5 = new Color(255, 255, 255, this.F.j() ? 51 : 17);
            pe_0.a(this.d(), this.c(), this.e(), this.f(), this.E ? w4.b.q : color5);
            k9.a(this.E ? w4.b.w : (this.F.j() ? color2 : w4.b.s), (float)this.d() + f10 / 2.0f, (float)this.c() + f11 / 2.0f, "newbind", f11 * 1.5f, f11 * 1.5f, false);
            return;
        }
        Color color6 = this.E ? w4.b.q : (color = new Color(255, 255, 255, this.F.j() ? 51 : 17));
        if (string.length() == 1) {
            this.b(10.0);
            pe_0.a(this.d(), this.c(), this.e(), this.f(), color);
        } else {
            this.b(d4 + 5.0);
            pe_0.a(this.d(), this.c(), this.e(), this.f(), color);
        }
        mq2.b(string, this.d() + this.e() / 2.0 + 0.25, this.c() + this.f() / 2.0 - d3 / 2.0, color3);
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
        return 10.0;
    }

    @Override
    public double h() {
        return 10.0;
    }

    public boolean N() {
        return this.D.c();
    }

    public ok_0 O() {
        return this.D;
    }

    public void f(boolean bl) {
        this.E = bl;
    }

    public boolean P() {
        return this.E;
    }

    static ok_0 a(w4 w42) {
        return w42.D;
    }
}

