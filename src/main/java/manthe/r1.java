/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import manthe.BI;
import manthe.D1;
import manthe.D7;
import manthe.DU;
import manthe.bo_0;
import manthe.bp_2;
import manthe.d0_0;
import manthe.dn_0;
import manthe.ds_2;
import manthe.my_0;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.p_0;
import manthe.pd;
import manthe.qU;
import manthe.r6;
import manthe.rG;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.rw_0;
import manthe.s3;
import manthe.sI;
import manthe.uK;
import manthe.ue_0;
import manthe.yG;
import manthe.yI;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class r1
extends rf_0
implements p_0,
qU,
BI {
    protected static final int T = 0;
    private final boolean Z;
    private final rf_0 O;
    private final rl_0 S;
    private final rf_0 aa;
    private final rf_0 Q;
    private final rf_0 Y;
    private final rw_0 L;
    private final DU P = new DU(0.0, 0.0, 0.0, 0.0);
    private final List<p1> J = new ArrayList<p1>();
    private final int ac = -1;
    private final rg_0 U;
    private final rg_0 ad;
    private boolean ab = true;
    private boolean X = false;
    private boolean N = false;
    private boolean M = true;
    private boolean K;
    private s3 I;
    private rG R;
    private boolean W;
    private static String[] V;

    public r1(String string, boolean bl) {
        super(false);
        this.Z = bl;
        Color color = new Color(30, 30, 30, 240);
        this.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
        this.O = new rf_0(true);
        this.O.b(color);
        this.O.a(new D7(0.0, 0.0, 1, 3, new pd(0, 0, 0, 0)));
        this.S = new rl_0(string, my_0.i, 1.0);
        this.S.d(this.O);
        String string2 = this.S.E();
        this.L = new rw_0(string2, 0.4f, true);
        this.O.b(this.L);
        this.L.a(3.0f);
        this.L.c(3.0f);
        this.O.b(this.S);
        this.aa = new rf_0(false);
        this.aa.a(new D7(1.0, 0.0, 1, 2, new pd(5, 0, 0, 2)));
        this.O.b(this.aa);
        if (this.Z) {
            this.R = new rG("pin", 10.0f, 10.0f, 0.9f, false);
            this.R.a(new D1(this));
            this.R.b(10.0);
            this.R.c(10.0);
            this.aa.b(this.R);
            this.aa.c();
        }
        this.ad = new rg_0("+", false);
        this.ad.a(new dn_0(this));
        this.ad.b(10.0);
        this.ad.c(10.0);
        this.aa.b(this.ad);
        this.aa.c();
        this.O.a(null, new uK(this));
        this.Y = new rf_0(false);
        this.Y.a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.Q = new rf_0(true);
        this.Q.b(color);
        this.Q.a(this.Q.m(), null);
        this.Y.b(this.Q);
        this.b(this.O);
        this.b(this.Y);
        this.f(true);
        this.U = new rg_0(this.H(), true);
        this.U.a(new bp_2(this));
    }

    public boolean ag() {
        this.I = new s3(this);
        return true;
    }

    public s3 ac() {
        return this.I;
    }

    private void af() {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)0.15f, (float)0.15f, (float)0.15f, (float)0.3f);
        GL11.glLineWidth((float)1.0f);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)2);
        GL11.glVertex2d((double)this.O.t(), (double)this.O.k());
        GL11.glVertex2d((double)(this.O.t() + this.O.q()), (double)this.O.k());
        GL11.glVertex2d((double)(this.O.t() + this.O.q()), (double)(this.O.k() + this.O.b()));
        GL11.glVertex2d((double)this.O.t(), (double)(this.O.k() + this.O.b()));
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    @Override
    public void c(boolean bl) {
        if (this.e()) {
            for (p1 p12 : this.v()) {
                if (p12.equals(this.Y)) {
                    if (this.M) {
                        o7.a(0.0, this.k(), 999999.0, this.Y.b() + this.O.b());
                    }
                    IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
                    GL11.glGetInteger((int)3088, (IntBuffer)intBuffer);
                    this.P.a(intBuffer.get());
                    this.P.b(intBuffer.get());
                    this.P.c(intBuffer.get());
                    this.P.d(intBuffer.get());
                    this.Y.c(bl);
                    GL11.glDisable((int)3089);
                    continue;
                }
                p12.c(bl);
            }
        }
        if (this.e()) {
            if (this.O.e()) {
                bo_0 bo_02 = o7.b();
            }
            this.O.a(!bl);
        }
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        if (this.Y.q() != 0.0) {
            d3 = this.Y.q();
        }
        this.S.c(d3 - this.aa.q());
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.O.b(d3);
        this.L.b(d3);
        this.S.b(d3);
        this.aa.a(new D7(0.0, 0.0, 1, 2, new pd((int)(d3 - 10.0) / 2, 0, 0, 2)));
    }

    @Override
    public void c() {
        super.c();
        if (this.x()) {
            double d3 = this.t() + (double)this.O();
            double d4 = this.k() + (double)this.M();
            if (Keyboard.isKeyDown((int)42)) {
                for (r1 r12 : on.p.F().d()) {
                    if (!r12.e() || r12.equals(this) || !(d3 + this.q() >= r12.t()) || !(d3 <= r12.t() + r12.q()) || !(d4 + this.b() >= r12.k()) || !(d4 <= r12.k() + r12.b())) continue;
                    return;
                }
            }
            this.a(d3);
            this.d(d4);
        }
    }

    @Override
    public boolean x() {
        return this.X;
    }

    @Override
    public void d(boolean bl) {
        this.X = bl;
    }

    @Override
    public boolean z() {
        return !this.Q.e();
    }

    @Override
    public void f(boolean bl) {
        if (!this.ab) {
            bl = false;
        }
        this.Q.a(!bl);
        this.Y.a(this.Q.e());
        for (p1 p12 : this.aj().v()) {
            for (ue_0 ue_02 : p12.h()) {
                ue_02.a(!bl);
            }
        }
        this.ad.z().a(this.z() ? "+" : "-");
    }

    public boolean ai() {
        return this.N && this.Z;
    }

    public void m(boolean bl) {
        this.N = bl;
        this.R.d(bl ? Color.WHITE : Color.GRAY);
    }

    public rl_0 X() {
        return this.S;
    }

    public p1 d(p1 p12) {
        this.Q.b(p12);
        return p12;
    }

    public p1[] b(p1[] p1Array) {
        for (p1 p12 : p1Array) {
            this.Q.b(p12);
        }
        return p1Array;
    }

    public rf_0 aj() {
        return this.Q;
    }

    public List<p1> ah() {
        return this.J;
    }

    public rf_0 Z() {
        return this.O;
    }

    public Color a(Color color, p1 p12, boolean bl, float f10) {
        float[] fArray;
        ArrayList<p1> arrayList = new ArrayList<p1>();
        if (p12 instanceof sI) {
            arrayList.addAll(((sI)p12).ab().v());
        } else if (p12 instanceof r1) {
            arrayList.addAll(((r1)p12).aj().v());
        } else if (p12 instanceof r6) {
            arrayList.addAll(((r6)p12).A().v());
        } else if (p12 instanceof yG) {
            arrayList.addAll(((yG)p12).v());
        }
        if (p12 instanceof sI) {
            if (bl) {
                fArray = new float[3];
                fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
                p12.b(yI.a(f10, fArray[1], fArray[2]));
            } else {
                p12.b(color);
            }
            if (bl && ((sI)p12).z()) {
                return color;
            }
        }
        if (arrayList.isEmpty()) {
            return color;
        }
        if (!p12.i() && !(p12 instanceof r6)) {
            return color;
        }
        fArray = new float[3];
        fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
        Color color2 = color;
        for (p1 p13 : arrayList) {
            if (p13.i()) {
                if (bl) {
                    if ((f10 -= 0.025f) <= 0.0f) {
                        f10 = 1.0f + f10;
                    }
                    fArray[0] = f10;
                    color2 = Color.getHSBColor(f10, fArray[1], fArray[2]);
                }
                p13.b(color2);
            }
            color2 = this.a(color2, p13, bl, f10);
        }
        return color2;
    }

    public Color a(Color color, boolean bl) {
        if (this.v().size() <= 0) {
            return color;
        }
        float[] fArray = new float[3];
        fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
        return this.a(color, this, bl, fArray[0]);
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("x") != null && !jsonObject.get("x").isJsonNull()) {
            this.a(jsonObject.get("x").getAsDouble());
        }
        if (jsonObject.get("y") != null && !jsonObject.get("y").isJsonNull()) {
            this.d(jsonObject.get("y").getAsDouble());
        }
        if (jsonObject.get("minimized") != null && !jsonObject.get("minimized").isJsonNull()) {
            this.f(jsonObject.get("minimized").getAsBoolean());
        }
        if (jsonObject.get("visible") != null && !jsonObject.get("visible").isJsonNull() && this.ac() != null) {
            this.ac().g(jsonObject.get("visible").getAsBoolean());
        }
        if (jsonObject.get("pinned") != null && !jsonObject.get("pinned").isJsonNull()) {
            this.m(jsonObject.get("pinned").getAsBoolean());
        }
        if (jsonObject.get("hidden2") != null && !jsonObject.get("hidden2").isJsonNull() && this.I != null) {
            this.I.Y().g(!jsonObject.get("hidden2").getAsBoolean());
        }
    }

    public JsonObject ak() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", this.X().E());
        jsonObject.addProperty("x", (Number)this.t());
        jsonObject.addProperty("y", (Number)this.k());
        jsonObject.addProperty("minimized", Boolean.valueOf(this.z()));
        jsonObject.addProperty("visible", Boolean.valueOf(this.e()));
        if (this.Z) {
            jsonObject.addProperty("pinned", Boolean.valueOf(this.ai()));
        }
        if (this.I != null) {
            jsonObject.addProperty("hidden2", Boolean.valueOf(!this.I.Y().G()));
        }
        return jsonObject;
    }

    @Override
    public String H() {
        return this.X().E();
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        for (p1 p12 : this.aj().v()) {
            for (ue_0 ue_02 : p12.h()) {
                ue_02.a(bl);
            }
        }
    }

    public void o(boolean bl) {
        this.M = bl;
    }

    public boolean ad() {
        return this.K;
    }

    public void k(boolean bl) {
        this.K = bl;
    }

    public double j(d0_0 d0_02) {
        return (double)d0_02.g() - this.q() * 0.25;
    }

    public double c(d0_0 d0_02) {
        return -(this.q() * 0.75);
    }

    public boolean h(d0_0 d0_02) {
        double d3 = this.j(d0_02);
        return this.t() > d3;
    }

    public double f(d0_0 d0_02) {
        double d3 = this.j(d0_02);
        double d4 = this.c(d0_02);
        if (this.t() < d4) {
            return d4;
        }
        if (this.t() > d3) {
            return d3;
        }
        return this.t();
    }

    public void i(d0_0 d0_02) {
        if (this.h(d0_02)) {
            this.a(this.f(d0_02));
        }
    }

    public double e(d0_0 d0_02) {
        return -(this.X().b() * 0.75);
    }

    public double b(d0_0 d0_02) {
        return (double)d0_02.h() - this.X().b() * 0.5;
    }

    public boolean d(d0_0 d0_02) {
        double d3 = this.e(d0_02);
        double d4 = this.b(d0_02);
        return this.k() < d3 || this.k() > d4;
    }

    public double g(d0_0 d0_02) {
        double d3 = this.e(d0_02);
        double d4 = this.b(d0_02);
        if (this.k() < d3) {
            return d3;
        }
        if (this.k() > d4) {
            return d4;
        }
        return this.k();
    }

    public void k(d0_0 d0_02) {
        if (this.d(d0_02)) {
            this.d(this.g(d0_02));
        }
    }

    public rg_0 ab() {
        return this.U;
    }

    public void b(int n6, int n10, int n11) {
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        this.U.a(n6, n10, n11);
        return super.a(n6, n10, n11);
    }

    public boolean ae() {
        return this.W;
    }

    public void n(boolean bl) {
        this.W = bl;
    }

    protected boolean Y() {
        return this.t() >= (double)ds_2.p().g() / 2.0;
    }

    public void l(boolean bl) {
        if (!bl) {
            if (this.aa.c(this.ad)) {
                this.aa.a((p1)this.ad);
                this.aa.c();
            }
        } else if (!this.aa.c(this.ad)) {
            this.aa.b(this.ad);
            this.aa.c();
        }
        this.ab = bl;
    }

    public void W() {
    }

    public boolean a(d0_0 d0_02) {
        boolean bl = this.h(d0_02);
        boolean bl2 = this.d(d0_02);
        return bl || bl2;
    }

    public static void a(String[] stringArray) {
        V = stringArray;
    }

    public static String[] aa() {
        return V;
    }

    static {
        if (r1.aa() != null) {
            r1.a(new String[1]);
        }
    }
}

