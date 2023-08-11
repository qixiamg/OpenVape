/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.rr
 */
public class rr_0
extends r1 {
    public final BooleanValue ag = BooleanValue.createValue((Object)this, "Show Hovered", false, "Show information on a hovered entity if not attacking.");
    private Object ai;
    private ej_0 af;
    private final AO ae = new AO();
    private static rr_0 ah;

    public rr_0() {
        super("Target Info", true);
        this.ah().add((p1)this.ag.getDefaultValue());
        this.c(123.0);
        this.b(21.0);
        this.o(false);
        this.l(false);
        this.f(false);
        ah = this;
    }

    @Override
    public void W() {
        z3 z32;
        super.W();
        gO gO2 = ds_2.t();
        if (this.ai == null || gO2.d() && !gO2.a().equals(this.ai)) {
            this.af = null;
            this.ai = ds_2.t().a();
        }
        if (!this.ai() || this.z() || !this.e()) {
            this.af = null;
            return;
        }
        if (ds_2.k().e() || gO2.e()) {
            this.af = null;
            return;
        }
        if (this.af != null && !ds_2.t().k().contains(this.af.a())) {
            this.af = null;
        }
        if (this.af != null) {
            double d3 = this.af.z() - this.af.T();
            double d4 = this.af.l() - this.af.R();
            double d5 = this.af.g() - this.af.X();
            double d6 = Math.max(Y.e(d3 * d3 + d4 * d4 + d5 * d5), ds_2.k().a(this.af));
            if (!ds_2.t().k().contains(this.af.a()) || d6 > 10.0 || this.ae.a(3000L)) {
                this.af = null;
            }
        }
        if ((z32 = on.p.H().b(z3.class)).S() != null) {
            this.af = z32.S();
            this.ae.d();
        }
    }

    @Override
    public void c() {
        super.c();
        this.c(123.0);
        this.b(20.0);
    }

    @Override
    public void c(boolean bl) {
        ex_0 ex_02;
        gb_0 gb_02;
        ej_0 ej_02;
        super.c(bl);
        this.b(on.p.t().r.K());
        if (this.z() || !this.e()) {
            return;
        }
        if (ds_2.k().e() || ds_2.t().e()) {
            this.af = null;
            return;
        }
        if (this.af != null && !ds_2.t().k().contains(this.af.a())) {
            this.af = null;
        }
        if ((ej_02 = this.af) == null && this.ag.u().booleanValue() && (gb_02 = ds_2.I()).d() && gb_02.h().d() && (ex_02 = gb_02.h()).a(A5.cF)) {
            ej_02 = new ej_0(ex_02.a());
        }
        if (bl && ej_02 == null) {
            return;
        }
        double d3 = this.aj().t();
        double d4 = this.aj().k();
        mq mq2 = on.p.a(1.0);
        mq mq3 = on.p.a(0.7);
        o7.a(d3, d4, d3 + this.q(), d4 + 37.0, bl ? new Color(30, 30, 30, 191) : new Color(30, 30, 30, 240));
        o7.a(d3 + 2.5, d4 + 2.5, d3 + 34.5, d4 + 34.5, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
        if (ej_02 != null) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d3 + 3.0 + 16.0), (double)(d4 + 3.0 + 30.0), (double)0.0);
            e3.f();
            o7.a(d3 + 3.0, d4 + 4.0, 31.0, 31.0);
            dt_1.a(0, 0, 14, -100.0f, 0.0f, ej_02);
            GL11.glDisable((int)3089);
            e3.r();
            GL11.glPopMatrix();
        }
        String string = ej_02 == null ? "Target Name" : ej_02.S();
        mq2.a(string, d3 + 36.5, d4 + 2.5, -1);
        o7.a(d3 + 36.5, d4 + 12.0, d3 + 36.5 + 50.0, d4 + 16.0, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
        float f10 = 0.0f;
        if (ej_02 != null) {
            f10 = ej_02.a(A5.cc) ? on.p.H().b(zt_0.class).b(new eC(ej_02.a())) : ej_02.aD();
        }
        float f11 = ej_02 == null ? 12.0f : f10;
        float f12 = ej_02 == null ? 20.0f : ej_02.at();
        float f13 = ej_02 == null ? 4.0f : ej_02.aR();
        float f14 = f11 / Math.max(f12 + f13, 1.0f);
        float f15 = f11 / Math.max(f12, 1.0f);
        Color color = f11 > 0.0f ? o7.a(f15, true) : Color.RED;
        o7.a(d3 + 37.0, d4 + 12.6, d3 + 37.0 + (double)(49.0f * f14), d4 + 15.5, color);
        if (f13 > 0.0f) {
            double d5 = 49.0f * (f13 / (f12 + f13));
            o7.a(d3 + 37.0 + (double)(49.0f * f14), d4 + 12.6, d3 + 37.0 + (double)(49.0f * f14) + d5, d4 + 15.5, -2130728448);
        }
        String string2 = new qN(1).b(f11 + f13);
        string2 = string2.replace(".0", "");
        GL11.glPushMatrix();
        GL11.glTranslated((double)(d3 + 88.0), (double)(d4 + 12.0), (double)0.0);
        if (!zu_0.ag()) {
            GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        }
        mq3.a(string2 + " hp", 0.0, 0.0, -1);
        if (!zu_0.ag()) {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        }
        GL11.glPopMatrix();
        if (ej_02 == null) {
            int n6 = 0;
            for (int i = 0; i < 5; ++i) {
                o7.a(d3 + 36.5 + (double)n6, d4 + 18.5, d3 + 52.5 + (double)n6, d4 + 34.5, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
                n6 += 17;
            }
        }
        if (ej_02 != null && ej_02.a(A5.cc)) {
            int n10;
            eC eC2 = new eC(ej_02.a());
            ArrayList<fG> arrayList = new ArrayList<fG>();
            for (n10 = 3; n10 >= 0; --n10) {
                Iterator iterator = eC2.aU().g()[n10];
                if (iterator == null) continue;
                arrayList.add(new fG(iterator));
            }
            if (eC2.a_().d()) {
                arrayList.add(eC2.a_());
            }
            if (arrayList.size() < 1) {
                return;
            }
            n10 = 0;
            for (fG fG2 : arrayList) {
                o7.a(d3 + 36.5 + (double)n10, d4 + 18.5, d3 + 52.5 + (double)n10, d4 + 34.5, 0.5, new Color(60, 60, 60, 127), new Color(180, 180, 180, 127));
                this.a(d3 + 36.5 + (double)n10, d4 + 18.5, fG2);
                n10 += 17;
            }
        }
    }

    public void a(kJ kJ2) {
        if (this.z() || !this.e() || !this.ai()) {
            this.af = null;
            return;
        }
        if (kJ2.getTarget().a(A5.cF) && !kJ2.getTarget().a(A5.a8)) {
            this.af = new ej_0(kJ2.getTarget().a());
            this.ae.d();
        }
    }

    private void a(double d3, double d4, fG fG2) {
        GL11.glPushMatrix();
        eK eK2 = ds_2.J();
        float f10 = eK2.g();
        eK2.a(0.0f);
        GL11.glTranslated((double)d3, (double)d4, (double)0.0);
        eK2.a(ds_2.m(), ds_2.l(), fG2, 0, 0);
        eK2.b(ds_2.m(), ds_2.l(), fG2, 0, 0);
        eK2.a(f10);
        double d5 = 0.0;
        if (fG2.k().a(A5.bO)) {
            int n6 = eq_0.a(e5.f().l(), fG2);
            int n10 = eq_0.a(e5.g().l(), fG2);
            int n11 = eq_0.a(e5.v().l(), fG2);
            int n12 = eq_0.a(e5.r().l(), fG2);
            if (n6 > 0) {
                rr_0.a("Sh" + rr_0.a(n6) + n6, 0.0, d5);
                d5 += 4.5;
            }
            if (n10 > 0) {
                rr_0.a("Fir" + rr_0.a(n10) + n10, 0.0, d5);
                d5 += 4.5;
            }
            if (n11 > 0) {
                rr_0.a("Kb" + rr_0.a(n11) + n11, 0.0, d5);
                d5 += 4.5;
            }
            if (n12 > 0) {
                rr_0.a("Unb" + rr_0.a(n12) + n12, 0.0, d5);
            }
        } else if (fG2.k().a(A5.cN)) {
            int n13 = eq_0.a(e5.m().l(), fG2);
            int n14 = eq_0.a(e5.h().l(), fG2);
            int n15 = eq_0.a(e5.r().l(), fG2);
            if (n13 > 0) {
                rr_0.a("P" + rr_0.a(n13) + n13, 0.0, d5);
                d5 += 4.5;
            }
            if (n14 > 0) {
                rr_0.a("Th" + rr_0.a(n14) + n14, 0.0, d5);
                d5 += 4.5;
            }
            if (n15 > 0) {
                rr_0.a("Unb" + rr_0.a(n15) + n15, 0.0, d5);
            }
        } else if (fG2.k().a(A5.cZ)) {
            int n16 = eq_0.a(e5.t().l(), fG2);
            int n17 = eq_0.a(e5.p().l(), fG2);
            int n18 = eq_0.a(e5.u().l(), fG2);
            if (n16 > 0) {
                rr_0.a("Pow" + rr_0.a(n16) + n16, 0.0, d5);
                d5 += 4.5;
            }
            if (n17 > 0) {
                rr_0.a("Pun" + rr_0.a(n17) + n17, 0.0, d5);
                d5 += 4.5;
            }
            if (n18 > 0) {
                rr_0.a("Fir" + rr_0.a(n18) + n18, 0.0, d5);
            }
        }
        e3.l();
        GL11.glPopMatrix();
    }

    public static void a(String string, double d3, double d4) {
        mq mq2 = on.p.a(1.3);
        GL11.glPushMatrix();
        GL11.glTranslated((double)d3, (double)d4, (double)150.0);
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        mq2.c(string, -1.0, 0.0, -16777216, false);
        mq2.c(string, 1.0, 0.0, -16777216, false);
        mq2.c(string, 0.0, -1.0, -16777216, false);
        mq2.c(string, 0.0, 1.0, -16777216, false);
        mq2.c(string, 0.0, 0.0, -1);
        if (zu_0.ag()) {
            mq2.c(string, 0.0, 0.0, -1);
        }
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glPopMatrix();
    }

    public static String a(int n6) {
        switch (n6) {
            case 1: {
                return "\u00a7f";
            }
            case 2: {
                return "\u00a7a";
            }
            case 3: {
                return "\u00a73";
            }
            case 4: {
                return "\u00a74";
            }
            case 5: {
                return "\u00a76";
            }
        }
        return "\u00a7f";
    }

    private Color a(float[] fArray, Color[] colorArray, float f10) {
        Color color = Color.RED;
        if (fArray != null && colorArray != null && fArray.length == colorArray.length) {
            int[] nArray = this.a(fArray, f10);
            float[] fArray2 = new float[]{fArray[nArray[0]], fArray[nArray[1]]};
            Color[] colorArray2 = new Color[]{colorArray[nArray[0]], colorArray[nArray[1]]};
            float f11 = fArray2[1] - fArray2[0];
            float f12 = f10 - fArray2[0];
            float f13 = f12 / f11;
            color = this.a(colorArray2[0], colorArray2[1], (double)(1.0f - f13));
        }
        return color;
    }

    private int[] a(float[] fArray, float f10) {
        int n6;
        int[] nArray = new int[2];
        for (n6 = 0; n6 < fArray.length && fArray[n6] <= f10; ++n6) {
        }
        if (n6 >= fArray.length) {
            n6 = fArray.length - 1;
        }
        nArray[0] = n6 - 1;
        nArray[1] = n6;
        return nArray;
    }

    private Color a(Color color, Color color2, double d3) {
        Color color3;
        float f10 = (float)d3;
        float f11 = 1.0f - f10;
        float[] fArray = new float[3];
        float[] fArray2 = new float[3];
        color.getColorComponents(fArray);
        color2.getColorComponents(fArray2);
        float f12 = fArray[0] * f10 + fArray2[0] * f11;
        float f13 = fArray[1] * f10 + fArray2[1] * f11;
        float f14 = fArray[2] * f10 + fArray2[2] * f11;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        } else if (f12 > 255.0f) {
            f12 = 255.0f;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        } else if (f13 > 255.0f) {
            f13 = 255.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        } else if (f14 > 255.0f) {
            f14 = 255.0f;
        }
        try {
            color3 = new Color(f12, f13, f14);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Color.RED;
        }
        return color3;
    }

    public static rr_0 al() {
        return ah;
    }
}

