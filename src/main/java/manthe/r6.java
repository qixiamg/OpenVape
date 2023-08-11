/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.nio.IntBuffer;
import manthe.Cb;
import manthe.D7;
import manthe.DU;
import manthe.o7;
import manthe.p1;
import manthe.p_0;
import manthe.pd;
import manthe.rY;
import manthe.rf_0;
import manthe.rg_0;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class r6
extends rf_0
implements p_0 {
    public static final double J = 5.0;
    private final rg_0 L = new rg_0("", true);
    private final DU O = new DU(0.0, 0.0, 0.0, 0.0);
    private double I = 0.0;
    private double N = 0.0;
    private double P = 0.0;
    private final rf_0 M = new rY(this, false);
    private boolean K = false;

    public r6(boolean bl) {
        super(bl);
        this.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.L.a(c);
        this.L.c(5.0);
        this.L.a(new Cb(this));
        D7 d7 = new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0));
        d7.g();
        this.M.a(d7);
        this.b(this.M);
        this.b(this.L);
    }

    @Override
    public void c(boolean bl) {
        o7.a(this.t(), this.k(), this.q(), this.b());
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
        GL11.glGetInteger((int)3088, (IntBuffer)intBuffer);
        this.O.a(intBuffer.get());
        this.O.b(intBuffer.get());
        this.O.c(intBuffer.get());
        this.O.d(intBuffer.get());
        this.a(this.O);
        super.c(bl);
        GL11.glDisable((int)3089);
    }

    @Override
    public void c() {
        int n6;
        super.c();
        if (this.g() && (n6 = Mouse.getDWheel()) != 0) {
            this.a(n6 > 0 ? -2 : 2);
        }
        double d3 = this.y();
        double d4 = this.b() / d3;
        if (d3 > this.P) {
            double d5 = this.I;
            double d6 = d3 - this.M.b();
            this.I = d5;
            if (this.I > d6) {
                this.I = d6;
            } else if (this.I < 0.0) {
                this.I = 0.0;
            }
        }
        if (d3 > this.P) {
            this.b(this.P);
            this.L.b(d4 * this.b());
            this.L.a(true);
            this.M.b(this.b());
        } else {
            this.I = 0.0;
            this.N = 0.0;
            this.L.b(0.0);
            this.L.a(false);
            this.M.b(d3);
        }
        this.M.d(this.M.k() + this.I);
        this.L.d(this.L.k() + this.N);
        if (this.x()) {
            this.a(this.M());
        }
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        for (p1 p12 : this.M.v()) {
            p12.c(this.q() - 5.0);
        }
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.P = d3;
        this.M.b(d3);
    }

    @Override
    public boolean x() {
        return this.K;
    }

    @Override
    public void d(boolean bl) {
        this.K = bl;
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        return super.a(n6, n10, n11);
    }

    public void d(p1 p12) {
        this.M.b(p12);
        this.c();
    }

    public rf_0 A() {
        return this.M;
    }

    public double y() {
        double d3 = 0.0;
        for (p1 p12 : this.M.v()) {
            if (!p12.e()) continue;
            d3 += p12.b() + this.M.u().c();
        }
        return d3;
    }

    public void a(int n6) {
        double d3 = this.y();
        double d4 = this.b() / d3;
        if (d3 > this.P) {
            double d5 = (double)n6 / d4 + this.I;
            double d6 = d3 - this.M.b();
            this.I = d5;
            if (this.I > d6) {
                this.I = d6;
            } else if (this.I < 0.0) {
                this.I = 0.0;
            }
            double d7 = this.N + (double)n6;
            double d8 = this.b() - this.L.b();
            this.N = d7;
            if (this.N > d8) {
                this.N = d8;
            } else if (this.N < 0.0) {
                this.N = 0.0;
            }
        }
    }

    public boolean z() {
        return this.L.e();
    }

    static double a(r6 r62) {
        return r62.I;
    }
}

