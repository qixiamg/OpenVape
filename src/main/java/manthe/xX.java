/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.d;
import java.awt.Color;
import manthe.A5;
import manthe.AO;
import manthe.Y;
import manthe.cy_0;
import manthe.ds_2;
import manthe.dt_1;
import manthe.e3;
import manthe.eC;
import manthe.ej_0;
import manthe.fG;
import manthe.gO;
import manthe.gb_0;
import manthe.mq;
import manthe.o7;
import manthe.on;
import manthe.pe_0;
import manthe.qN;
import manthe.rr_0;
import manthe.uW;
import manthe.wM;
import manthe.z3;
import manthe.zf_0;
import manthe.zt_0;
import org.lwjgl.opengl.GL11;

public class xX
extends wM {
    private final Color C = new Color(-2130728448);
    private Object z;
    private ej_0 A;
    private final AO B = new AO();

    public xX() {
        this.a(xX.b.m);
    }

    @Override
    public void a() {
        this.l();
    }

    @Override
    public void k() {
        this.l();
    }

    private void a(ej_0 ej_02, String string, float f10, float f11, float f12) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8 = this.d();
        double d10 = this.c();
        double d11 = 31.0;
        mq mq2 = on.p.a(0.9);
        pe_0.a(this.d(), this.c(), this.e(), this.f(), this.I());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        GL11.glTranslated((double)(d8 + 3.0 + 16.0), (double)(d10 + 3.0 + 30.0), (double)0.0);
        e3.f();
        o7.a(d8 + 3.0, d10 + 4.0, d11, d11);
        e3.f();
        e3.g();
        if (ej_02 != null) {
            dt_1.a(0, 0, 14, -50.0f, 20.0f, ej_02);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3089);
        e3.r();
        GL11.glPopMatrix();
        double d12 = d8 + d11 + 5.0;
        o7.a(d12, d10 + 5.0, this.e() - d11 - 5.0 - 2.0, mq2.a(string) + 3.0);
        mq2.c(string, d12, d10 + 5.0, xX.b.r);
        GL11.glDisable((int)3089);
        double d13 = d10 + 10.0 + mq2.a(string);
        double d14 = this.e() - (d12 - this.d()) - 5.0;
        pe_0.a(d12, d13, d14, 1.5, xX.b.y, false, 1.0f, 1.0f);
        float f13 = f10 / Math.max(f11, 1.0f);
        float f14 = (f10 + f12) / Math.max(f11, 1.0f);
        if (ej_02 == null) {
            f14 = 1.0f;
        }
        Color color = f10 > 0.0f ? o7.a(f14, true) : Color.RED;
        pe_0.a(d12, d13, d14 * (double)f13, 1.5, color, false, 1.0f, 1.0f);
        String string2 = new qN(1).b(f10 + f12);
        string2 = string2.replace(".0", "") + " hp";
        if (f12 > 0.0f) {
            f12 = Math.min(10.0f, f12);
            d7 = Math.max(d12, d12 + d14 * (double)f13 - 2.0);
            d6 = d12 + d14;
            d5 = d12 + d14 * (double)f13;
            d4 = 10.0f * (f12 / 2.0f);
            d3 = d6 - (d5 - 2.0 + d4);
            if (d3 < 0.0) {
                d7 -= Math.abs(d3);
            }
            pe_0.a(d7 - 0.5, d13, d4 + 1.0, 1.5, new Color(80, 80, 80, 100), true, 1.0f, 1.0f, 8.0f, new Color(50, 50, 50, 200));
            pe_0.a(d7, d13, d4, 1.5, this.C, true, 1.0f, 1.0f);
        }
        d7 = mq2.a(string2);
        d6 = this.d() + this.e() - 5.0 - mq2.b(string2) - 1.0;
        d5 = d6 - 20.0;
        d4 = d10 + 5.0 + d7 + 4.0;
        o7.a(new Color(this.I().getRed(), this.I().getGreen(), this.I().getBlue(), 0), this.I(), d6, d4, d6, this.c(), d5, this.c(), d5, d4);
        d3 = this.d() + this.e() - d6;
        pe_0.c(d6, this.c(), d3 - 2.0, 5.0 + d7 + 4.0, this.I());
        mq2.a(string2, this.d() + this.e() - 5.0 - mq2.b(string2), d10 + 5.0, xX.b.s);
        Object[] objectArray = null;
        fG fG2 = null;
        if (ej_02 != null && ej_02.a(A5.cc)) {
            eC eC2 = new eC(ej_02.a());
            objectArray = eC2.aU().g();
            fG2 = eC2.a_();
        }
        int n6 = 0;
        fG[] fGArray = new fG[5];
        double d15 = 0.0;
        double d16 = (this.e() - (d12 - this.d()) - 5.0 - 5.0) / 5.0;
        pe_0.a(d12 + d15, d10 + 22.0, d16, d16, xX.b.k);
        if (fG2 != null && fG2.d()) {
            fGArray[n6++] = fG2;
        }
        d15 += d16 + 1.0;
        for (int i = 3; i >= 0; --i) {
            Object object;
            if (objectArray != null && (object = objectArray[i]) != null) {
                fGArray[n6] = new fG(object);
            }
            ++n6;
            pe_0.a(d12 + d15, d10 + 22.0, d16, d16, xX.b.k);
            d15 += d16 + 1.0;
        }
        d15 = 0.0;
        for (fG fG3 : fGArray) {
            if (fG3 != null) {
                pe_0.a(fG3, 0.7, d12 + d15 + 1.0, d10 + 23.0, true);
            }
            d15 += d16 + 1.0;
        }
    }

    private void l() {
        Object object;
        Object object2;
        ej_0 ej_02;
        if (ds_2.k().e() || ds_2.t().e()) {
            this.A = null;
            return;
        }
        if (this.A != null && !ds_2.t().k().contains(this.A.a())) {
            this.A = null;
        }
        if ((ej_02 = this.A) == null && rr_0.al().ag.u().booleanValue() && ((cy_0)(object2 = ds_2.I())).d() && ((gb_0)object2).h().d() && ((cy_0)(object = ((gb_0)object2).h())).a(A5.cF)) {
            ej_02 = new ej_0(((cy_0)object).a());
        }
        if ((object2 = ds_2.x().a()) != null && object2.equals(d.getGuiObject())) {
            ej_02 = null;
        } else if (ej_02 == null) {
            return;
        }
        object = "Target name";
        float f10 = 14.0f;
        float f11 = 20.0f;
        float f12 = 2.0f;
        if (ej_02 != null) {
            object = ej_02.S();
            f10 = ej_02.a(A5.cc) ? on.p.H().b(zt_0.class).b(new eC(ej_02.a())) : ej_02.aD();
            f11 = ej_02.at();
            f12 = ej_02.aR();
        }
        this.a(ej_02, (String)object, f10, f11, f12);
    }

    @Override
    public void j() {
        zf_0 zf_02;
        z3 z32;
        gO gO2 = ds_2.t();
        if (this.z == null || gO2.d() && !gO2.a().equals(this.z)) {
            this.A = null;
            this.z = ds_2.t().a();
        }
        if (ds_2.k().e() || gO2.e()) {
            this.A = null;
            return;
        }
        if (this.A != null && !ds_2.t().k().contains(this.A.a())) {
            this.A = null;
        }
        if (this.A != null) {
            double d3 = this.A.z() - this.A.T();
            double d4 = this.A.l() - this.A.R();
            double d5 = this.A.g() - this.A.X();
            double d6 = Math.max(Y.e(d3 * d3 + d4 * d4 + d5 * d5), ds_2.k().a(this.A));
            if (!ds_2.t().k().contains(this.A.a()) || d6 > 10.0 || this.B.a(3000L)) {
                this.A = null;
            }
        }
        if ((z32 = on.p.H().b(z3.class)).S() != null) {
            this.A = z32.S();
            this.B.d();
        }
        if (this.A == null && (zf_02 = on.p.H().b(zf_0.class)).S() != null) {
            this.A = zf_02.S();
            this.B.d();
        }
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 40.0;
    }
}

