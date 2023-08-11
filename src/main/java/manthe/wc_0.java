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
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.DU;
import manthe.bo_0;
import manthe.by_0;
import manthe.c2_0;
import manthe.o7;
import manthe.pe_0;
import manthe.uW;
import manthe.wM;
import manthe.x2;
import manthe.xg_0;
import manthe.zu_0;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.wc
 */
public abstract class wc_0
extends wM {
    public double K = 300.0;
    private x2 A;
    protected boolean H;
    private DU B;
    private by_0 G;
    private double C;
    protected DU F;
    private boolean z;
    private boolean E;
    private bo_0 L;
    private boolean I;
    private xg_0 D;
    private static int J;

    public wc_0() {
        this.A = new x2(wc_0.b.y);
        this.G = new by_0(this);
        this.F = new DU(0.0, 0.0, 0.0, 0.0);
        this.E = true;
    }

    public abstract void V();

    public abstract void K();

    public abstract void S();

    @Override
    public void a() {
        this.V();
    }

    @Override
    public void C() {
        int n6;
        this.H = this.f() > this.K;
        this.a();
        if (this.B == null) {
            this.f(this.H);
        }
        int n10 = n6 = this.H && this.D != null ? 3 : 0;
        if (this.H) {
            if (this.B != null) {
                o7.a(this.B.a(), this.B.b(), this.B.d(), this.B.c());
            } else {
                o7.a(this.d(), this.c() + (double)n6, this.e(), this.K - (double)n6);
            }
            IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
            GL11.glGetInteger((int)3088, (IntBuffer)intBuffer);
        }
        if (!this.b()) {
            return;
        }
        if (this.B != null) {
            this.f(this.H);
        }
        for (wM wM2 : this.w()) {
            if (!wM2.b()) continue;
            wM2.C();
        }
        if (this.P() != 0.0 && this.H && this.D != null) {
            pe_0.a(this.D.d(), this.D.c() + (double)n6, this.D.e(), this.D.f() - (double)n6, this.I());
            pe_0.c(this.D.d(), this.D.c(), this.D.e(), this.D.f(), this.I());
            this.D.C();
            this.A.c(this.d());
            this.A.a(this.D.c() + this.D.f());
            this.A.C();
        }
        if (this.H) {
            GL11.glDisable((int)3089);
            this.N();
            double d3 = this.D != null ? this.D.f() : 0.0;
            double d4 = this.c() + d3 - this.C / this.f() * (this.K - d3);
            double d5 = (this.K - d3) / this.f() * this.K;
            this.F = new DU(this.d() + this.e() - 3.0, d4, 2.0, d5);
            if (zu_0.W != null) {
                for (wM wM3 : this.w()) {
                    if (!zu_0.W.equals(wM3)) continue;
                    return;
                }
            }
            this.Z();
        }
    }

    public void Z() {
        pe_0.a(this.F.a(), this.F.b(), this.F.d(), this.F.c(), wc_0.b.y, false, 1.0f, 0.5f);
    }

    private void N() {
        if (!this.z) {
            return;
        }
        if (!Mouse.isButtonDown((int)c2_0.LEFT_CLICK.ordinal())) {
            this.z = false;
            return;
        }
        bo_0 bo_02 = o7.b();
        double d3 = bo_02.b - this.L.b;
        this.L = bo_02;
        this.h(this.C - (d3 *= this.f() / this.K));
    }

    @Override
    public void k() {
        this.K();
    }

    public void f(boolean bl) {
        pe_0.a(this.d(), this.c(), this.e(), bl ? this.K + 2.0 : this.f() + 2.0, this.I(), this.Y() != null, 2.0f, 1.0f);
    }

    @Override
    public void j() {
        this.S();
    }

    @Override
    public void i() {
    }

    @Override
    public void E() {
        bo_0 bo_02;
        int n6 = Mouse.getDWheel();
        if (n6 != 0) {
            this.h(this.P() + (double)(n6 / 24));
        }
        if (this.F.a(bo_02 = o7.b())) {
            return;
        }
        super.E();
    }

    @Override
    public void b(uW uW2) {
        if (this.F.b(uW2.a(), uW2.b())) {
            this.L = o7.b();
            this.z = true;
            return;
        }
        super.b(uW2);
    }

    @Override
    public DU q() {
        if (this.H) {
            return new DU(this.d(), this.c(), this.e(), this.L());
        }
        return new DU(this.d(), this.c(), this.e(), this.f());
    }

    public void M() {
        this.W().k();
        this.W().a();
        this.h(this.P());
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wc_0)) continue;
            ((wc_0)wM2).M();
        }
    }

    public void a(wM wM2, Object ... objectArray) {
        wM2.a(this);
        this.G.a(wM2, objectArray);
        this.M();
    }

    @Override
    public void a(wM ... wMArray) {
        for (wM wM2 : wMArray) {
            this.a(wM2, new Object[0]);
        }
    }

    public void a(wM wM2) {
        this.G.b(wM2);
        this.M();
    }

    public void J() {
        CopyOnWriteArrayList<wM> copyOnWriteArrayList = new CopyOnWriteArrayList<wM>(this.w());
        for (wM wM2 : copyOnWriteArrayList) {
            if (wM2 instanceof xg_0) continue;
            this.a(wM2);
        }
    }

    public void R() {
        CopyOnWriteArrayList<wM> copyOnWriteArrayList = new CopyOnWriteArrayList<wM>(this.w());
        for (wM wM2 : copyOnWriteArrayList) {
            this.a(wM2);
        }
    }

    public void a(xg_0 xg_02) {
        this.D = xg_02;
        this.a((wM)xg_02, "wrap");
    }

    public xg_0 Y() {
        return this.D;
    }

    public by_0 W() {
        return this.G;
    }

    @Override
    public List<wM> w() {
        return this.G.b();
    }

    public double P() {
        return this.C;
    }

    public void a(by_0 by_02) {
        this.G = by_02;
    }

    public void i(boolean bl) {
        this.I = bl;
    }

    public void g(boolean bl) {
        this.H = bl;
    }

    public void a(DU dU) {
        this.B = dU;
    }

    public void h(double d3) {
        if (zu_0.W != null || this.f() < this.K || !this.E) {
            return;
        }
        this.f(d3);
    }

    public void f(double d3) {
        if (d3 > 0.0) {
            d3 = 0.0;
        }
        if (d3 < -(this.f() - this.K)) {
            d3 = -(this.f() - this.K);
        }
        this.C = d3;
        for (wM wM2 : this.w()) {
            if (wM2 instanceof xg_0) continue;
            wM2.a(this.W().i().get(wM2).b() + d3);
        }
    }

    public DU Q() {
        return this.F;
    }

    public double L() {
        return this.K;
    }

    public void g(double d3) {
        this.K = d3;
    }

    public void h(boolean bl) {
        this.E = bl;
    }

    public boolean U() {
        return this.H;
    }

    public boolean O() {
        return this.I;
    }

    public static void b(int n6) {
        J = n6;
    }

    public static int X() {
        return J;
    }

    public static int T() {
        int n6 = wc_0.X();
        if (n6 == 0) {
            return 38;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (wc_0.X() == 0) {
            wc_0.b(89);
        }
    }
}

