/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.lwjgl.opengl.GL11;
import rip.vape.friend.Friend;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class zR
extends Module {
    private final String x = cb_0.v + "r";
    private final String z = cb_0.v + "e=";
    private final String V = cb_0.v + "c-";
    private final String ab = cb_0.v + "a+";
    private final Color O = new Color(20, 20, 20, 128);
    private final Color L = new Color(115, 0, 4, 128);
    private final BooleanValue K = BooleanValue.createValue((Object)this, "Ignore Invisibles", false, "Determines if we draw a nametag\nfor invisible entities");
    private final BooleanValue P = BooleanValue.createValue((Object)this, "Auto Scale", true, "Automatically scales up nametags\nthe further the distance.");
    private final BooleanValue Q = BooleanValue.createValue((Object)this, "Hide bots", true, "Hides bots if you're using antibot");
    private final BooleanValue aa = BooleanValue.createValue(this, "Render Players", true);
    private final BooleanValue Z = BooleanValue.createValue(this, "Health", false);
    private final BooleanValue y = BooleanValue.createValue(this, "Distance", false);
    private final BooleanValue T = BooleanValue.createValue(this, "Equipment", false);
    private final BooleanValue G = BooleanValue.createValue(this, "Effects", false);
    private final DF D = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 250.0, 1.0, "Maximum distance allowed to render.\nUse 0 to render at any distance.");
    private final BooleanValue B = BooleanValue.createValue((Object)this, "Strength Indicator", false, "Gives you an indicator of your enemies\npossible damage relative to yours.\n    " + cb_0.v + "a+ " + this.x + "Enemy deals less damage than you\n    " + cb_0.v + "e= " + this.x + "Enemy deals equal damage to you\n    " + cb_0.v + "c- " + this.x + "Enemy deals more damage than you");
    private final BooleanValue U = BooleanValue.createValue((Object)this, "Calculate Effects", false, "Calculates potion effects to determine\ntotal possible damage. (Strength)");
    private final BooleanValue H = BooleanValue.createValue(this, "Render Animals", false);
    private final BooleanValue u = BooleanValue.createValue(this, "Health", false);
    private final BooleanValue w = BooleanValue.createValue(this, "Distance", false);
    private final BooleanValue v = BooleanValue.createValue(this, "Effects", false);
    private final DF R = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 250.0, 1.0, "Maximum distance allowed to render.\nUse 0 to render at any distance.");
    private final BooleanValue I = BooleanValue.createValue(this, "Render Mobs", false);
    private final BooleanValue C = BooleanValue.createValue(this, "Health", false);
    private final BooleanValue W = BooleanValue.createValue(this, "Distance", false);
    private final BooleanValue Y = BooleanValue.createValue(this, "Effects", false);
    private final DF S = DF.a(this, "Max Distance", "#", "m", 0.0, 0.0, 250.0, 1.0, "Maximum distance allowed to render.\nUse 0 to render at any distance.");
    private final DF E = DF.a((Object)this, "Scale", "#.#", "", 0.1, 1.0, 1.5, 0.1);
    private final DF X = DF.a(this, "Opacity", "#.#", "", 0.0, 1.0, 1.0);
    private final qN N = new qN(1);
    private final e5[] J = new e5[]{e5.m(), e5.r(), e5.f(), e5.g(), e5.s(), e5.i(), e5.t(), e5.u(), e5.p(), e5.q(), e5.o(), e5.h(), e5.v()};
    private final e5[] F = e5.k();
    private final HashMap<Integer, fG> A = new HashMap();
    private Object M;

    public zR() {
        super("NameTags", -16711936, CQ.d, "Renders nametags on entities through walls.");
        this.aa.a(this.Z, this.y, this.G, this.D, this.T, this.B);
        this.H.a(this.u, this.w, this.v, this.R);
        this.I.a(this.C, this.W, this.Y, this.S);
        this.B.a(new BasicValue[]{this.U});
        this.a(this.K, this.P, this.E, this.Q, this.aa, this.Z, this.y, this.G, this.D, this.T, this.B, this.U, this.H, this.u, this.w, this.v, this.R, this.I, this.C, this.W, this.Y, this.S);
    }

    @Override
    public void a(kA kA2) {
        if (ds_2.t().e()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        ex_0 ex_02 = kA2.getEntity();
        if (!this.a(ex_02, ds_2.t(), eJ2)) {
            return;
        }
        kA2.a(true);
    }

    @Override
    public void a(kf_0 kf_02) {
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        if (eJ2.d() && this.aa.u().booleanValue() && this.B.u().booleanValue()) {
            if (this.M == null || gO2.a() != this.M) {
                this.A.clear();
                this.M = gO2.a();
            }
            if (gO2.d()) {
                for (Object e10 : gO2.l()) {
                    fG fG2;
                    eC eC2;
                    ex_0 ex_02 = new ex_0(e10);
                    if (!this.a(ex_02, gO2, eJ2) || !ex_02.a(A5.cc) || !(eC2 = new eC(e10)).aG().d() || !(fG2 = eC2.aG()).k().a(A5.bO) && !fG2.k().a(A5.aP)) continue;
                    if (this.A.containsKey(eC2.q())) {
                        if (this.a(fG2) >= this.a(this.A.get(eC2.q()))) {
                            this.A.put(eC2.q(), eC2.aG());
                        }
                        return;
                    }
                    this.A.put(eC2.q(), eC2.aG());
                }
            }
        } else if (!this.A.isEmpty()) {
            this.A.clear();
        }
    }

    private boolean a(ex_0 ex_02, gS gS2, eJ eJ2) {
        if (gS2.e()) {
            return false;
        }
        if (A5.a8 != null && ex_02.a(A5.a8)) {
            return false;
        }
        if (eJ2.a().equals(ex_02.a())) {
            return false;
        }
        if (on.p.t().b(ex_02) && this.Q.u().booleanValue()) {
            return false;
        }
        if (!gS2.k().contains(ex_02.a())) {
            return false;
        }
        if (ex_02.e()) {
            return false;
        }
        if (!ex_02.a(A5.cF)) {
            return false;
        }
        if (this.K.u().booleanValue() && ex_02.ae()) {
            return false;
        }
        if (ex_02.a(A5.cc)) {
            if (!this.aa.u().booleanValue()) {
                return false;
            }
            if (this.D.a() != 0.0 && (double)eJ2.a(ex_02) > this.D.a()) {
                return false;
            }
        }
        if (pf_0.f(ex_02)) {
            if (!this.H.u().booleanValue()) {
                return false;
            }
            if (this.R.a() != 0.0 && (double)eJ2.a(ex_02) > this.R.a()) {
                return false;
            }
        }
        if (pf_0.d(ex_02)) {
            if (!this.I.u().booleanValue()) {
                return false;
            }
            return this.S.a() == 0.0 || !((double)eJ2.a(ex_02) > this.S.a());
        }
        return true;
    }

    void a(String string, int n6, int n10, double d3, double d4) {
        int n11 = ((int)d4 & 0xFF) << 24 | 0xFFFFFF;
        double d5 = 1.0 / d3;
        GL11.glPushMatrix();
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        GL11.glScaled((double)d3, (double)d3, (double)d3);
        ds_2.m().d(string, (double)n6, (double)n10, n11);
        GL11.glScaled((double)d5, (double)d5, (double)d5);
        if (bl) {
            GL11.glEnable((int)2896);
        }
        GL11.glPopMatrix();
    }

    private void a(fG fG2, int n6, int n10, double d3) {
        double d4;
        double d5;
        int n11;
        try {
            ff_0 ff_02 = fG2.l();
            if (ff_02.d()) {
                int n12 = 0;
                block2: for (int i = 0; i < ff_02.f(); ++i) {
                    e5 e52;
                    short s10 = ff_02.a(i).a("id");
                    short s11 = ff_02.a(i).a("lvl");
                    if (s10 >= this.F.length - 1 || (e52 = this.F[s10]).e()) continue;
                    for (e5 e53 : this.J) {
                        if (!e52.equals(e53)) continue;
                        String string = e52.b(s11).substring(0, 1).toLowerCase();
                        string = s11 > 99 ? string + "99+" : string + s11;
                        double d6 = 0.7;
                        double d7 = 1.0 / d6;
                        this.a(string, (int)((double)n6 * d7), (int)((double)(-2 + (n10 + n12)) * d7), d6, d3);
                        n12 += 6;
                        continue block2;
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((n11 = fG2.k().f()) > 0 && (d5 = 1.0 - (d4 = (double)fG2.m() / (double)n11)) < 1.0) {
            int n13 = (int)Math.round(255.0 - d4 * 255.0);
            pe_0.a(n6 + 2, n10 + 13, 13.0f, 2.0f, Color.BLACK);
            pe_0.a(n6 + 2, n10 + 13, 12.0f, 1.0f, new Color((255 - n13) / 4, 64, 0, 255));
            pe_0.c(n6 + 2, n10 + 13, 13.0 * d5, 1.0, o7.a((float)d5));
        }
    }

    @Override
    public void a(kx_0 kx_02) {
        ex_0 ex_02;
        if (this.B.u().booleanValue() && (this.M == null || ds_2.t().a() != this.M)) {
            this.A.clear();
            this.M = ds_2.t().a();
        }
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        double d3 = ds_2.r().m();
        double d4 = ds_2.r().n();
        double d5 = ds_2.r().j();
        double d6 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)kx_02.getTicks() - d3;
        double d7 = eJ2.R() + (eJ2.l() - eJ2.R()) * (double)kx_02.getTicks() - d4;
        double d8 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)kx_02.getTicks() - d5;
        ArrayList<ex_0> arrayList = new ArrayList<ex_0>();
        for (Object object : gO2.k()) {
            ex_02 = new ex_0(object);
            if (!this.a(ex_02, gO2, eJ2)) continue;
            arrayList.add(ex_02);
        }
        Collections.sort(arrayList, new BC(this, eJ2));
        for (ex_0 ex_03 : arrayList) {
            if (!ex_03.a(A5.cF)) continue;
            GL11.glPushMatrix();
            ex_02 = new ej_0(ex_03);
            double d10 = ex_02.T() + (ex_02.z() - ex_02.T()) * (double)kx_02.getTicks() - d3;
            double d11 = ex_02.R() + (ex_02.l() - ex_02.R()) * (double)kx_02.getTicks() - d4;
            double d12 = ex_02.X() + (ex_02.g() - ex_02.X()) * (double)kx_02.getTicks() - d5;
            double d13 = pf_0.a(d10, d11, d12, d6, d7, d8);
            try {
                if (ex_03.a(A5.cc) && this.aa.u().booleanValue()) {
                    this.a(eJ2, (ej_0)ex_02, d10, d11, d12, this.Z.u(), this.y.u(), this.T.u(), this.B.u(), this.G.u(), d13);
                } else if (pf_0.f(ex_03) && this.H.u().booleanValue()) {
                    this.a(eJ2, (ej_0)ex_02, d10, d11, d12, this.u.u(), this.w.u(), false, false, this.v.u(), d13);
                } else if (pf_0.d(ex_03) && this.I.u().booleanValue()) {
                    this.a(eJ2, (ej_0)ex_02, d10, d11, d12, this.C.u(), this.W.u(), false, false, this.Y.u(), d13);
                }
            }
            catch (Exception exception) {
                on.a(exception);
            }
            GL11.glPopMatrix();
        }
    }

    public void a(eC eC2, double d3) {
        Object[] objectArray;
        ds_2.M().a(1.0);
        double d4 = 1.1;
        double d5 = 1.0 / d4;
        GL11.glPushMatrix();
        GL11.glScaled((double)d4, (double)d4, (double)d4);
        int n6 = -5;
        int n10 = -26;
        for (Object object : objectArray = eC2.aU().g()) {
            if (object == null) continue;
            n6 -= 10;
        }
        e3.l();
        if (!eC2.aG().e()) {
            n6 += 5;
            if (!eC2.aG().k().e()) {
                manthe.E.a(eC2.aG(), (float)n6, (float)n10, 16, 16, (float)d3);
                this.a(eC2.aG(), n6, n10, d3);
            }
        }
        n6 += 5;
        for (int i = objectArray.length - 1; i > -1; --i) {
            fG fG2 = new fG(objectArray[i]);
            if (fG2.e()) continue;
            fG fG3 = fG.a(fG2.k());
            manthe.E.a(fG3, (float)(n6 += 15), (float)n10, 16, 16, (float)d3);
            this.a(fG2, n6, n10, d3);
        }
        GL11.glScaled((double)d5, (double)d5, (double)d5);
        GL11.glPopMatrix();
        ds_2.M().b(1.0);
    }

    private void a(eC eC2) {
        Object[] objectArray = eC2.aU().g();
        if (!eC2.aG().e()) {
            fG fG2 = eC2.aG();
            manthe.E.a(fG2.k().h(), fG2.m());
        }
        for (int i = objectArray.length - 1; i > -1; --i) {
            fG fG3 = new fG(objectArray[i]);
            if (fG3.e()) continue;
            manthe.E.a(fG3.k().h(), fG3.m());
        }
    }

    private String a(eJ eJ2, ej_0 ej_02, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        String string = xp_0.a(ej_02);
        String string2 = cb_0.v + "a" + cb_0.v + "r" + string;
        ds_2.M().a(1.0);
        boolean bl5 = ej_02.a(A5.cc);
        if (bl) {
            string2 = cb_0.v + "a[" + cb_0.v + "f" + (int)eJ2.a(ej_02) + cb_0.v + "a]" + cb_0.v + "r " + string2;
        }
        if (bl5) {
            double d3;
            float f10;
            double d4;
            double d5;
            Object object;
            Friend ab_02 = on.p.N().b(ej_02.S());
            if (ab_02 != null) {
                string2 = ab_02.getNameOrAlias();
                if (!on.p.N().recolorVisuals.u().booleanValue() && !on.p.N().recolorVisuals.u().booleanValue()) {
                    int n6;
                    object = string.toCharArray();
                    for (int i = n6 = string.indexOf(string2); i > 0; --i) {
                        Object object2 = object[i];
                        if (object2 != 167) continue;
                        object2 = object[i + 1];
                        String string3 = new String(new char[]{(char)object2});
                        string2 = '\u00a7' + string3 + string2;
                        break;
                    }
                }
            }
            if (ej_02.a(A5.cc) && ((eC)(object = new eC(ej_02))).a8().g()) {
                string2 = cb_0.v + "a[C] " + cb_0.v + "r" + string2;
            }
            String string4 = (d5 = 100.0 * ((d4 = (double)((f10 = ej_02.a(A5.cc) ? on.p.H().b(zt_0.class).b(new eC(ej_02.a())) : ej_02.aD()) / 2.0f)) / (d3 = (double)(ej_02.at() / 2.0f)))) > 75.0 ? "2" : (d5 > 50.0 ? "e" : (d5 > 25.0 ? "6" : "4"));
            String string5 = this.N.b(Math.floor((d4 + 0.25) / 0.5) * 0.5);
            if (bl2) {
                string2 = String.format("%s %s%s%s", string2, cb_0.v, string4, string5);
            }
            if (bl4 && ej_02.aR() > 0.0f) {
                String string6 = this.N.b(Math.floor(((double)ej_02.aR() + 0.25) / 0.5) * 0.5);
                string2 = String.format("%s %s%s%s", string2, cb_0.v, "6", string6);
            }
            if (bl3) {
                string2 = String.format("%s %s", string2, this.a(eJ2, ej_02));
            }
        }
        return string2;
    }

    private void a(eJ eJ2, ej_0 ej_02, double d3, double d4, double d5, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, double d6) {
        Object object;
        Object object2;
        Object object3;
        double d7 = this.X.a();
        if (eJ2.c(ej_02)) {
            d7 = 1.0;
        }
        dr_1 dr_12 = ds_2.m();
        boolean bl6 = ej_02.a(A5.cc);
        if (bl3 && ej_02.a(A5.cc)) {
            object3 = new eC(ej_02);
            this.a((eC)object3);
        }
        object3 = this.a(eJ2, ej_02, bl2, bl, bl4, bl5);
        L l6 = new L(ej_02.af() ? this.L : this.O);
        L l10 = new L(l6);
        int n6 = 0xFFFFFF;
        if ((on.p.t().a(ej_02) || on.p.N().a(ej_02)) && on.p.N().recolorVisuals.u().booleanValue()) {
            n6 = -12417292;
            l10 = new L(36, 255, 255, (int)(64.0 * d7));
        }
        if (on.p.b().a(ej_02) && on.p.b().c.u().booleanValue()) {
            n6 = -12417292;
            l10 = new L(255, 29, 29, (int)(128.0 * d7));
        }
        if (on.p.H().b(zs_0.class).a(ej_02)) {
            n6 = -59882;
        }
        if (ej_02.ae()) {
            n6 = 65530;
        }
        if (bl6 && (object2 = on.p.N().b(ej_02.S())) != null) {
            object3 = ((Friend)object2).getNameOrAlias();
            if (on.p.N().recolorVisuals.u().booleanValue() && !on.p.N().recolorVisuals.u().booleanValue()) {
                n6 = on.p.N().friendsColor.s();
            }
        }
        l6.d((int)((double)l6.getAlpha() * d7));
        l10.d((int)((double)l10.getAlpha() * d7));
        object2 = new L(n6);
        ((L)object2).d((int)((double)((L)object2).getAlpha() * d7));
        n6 = ((L)object2).a();
        float f10 = (float)(0.03333335 * this.E.a());
        if (this.P.u().booleanValue()) {
            float f11 = (float)d6;
            float f12 = (double)f11 / 5.0 <= 2.0 ? 2.0f : (float)((double)f11 / 5.0);
            f10 = (float)(0.01666666753590107 * ((double)f12 * this.E.a()));
        }
        int n10 = dr_12.c((String)object3) / 2;
        int n11 = -(dr_12.b((String)object3) - 1);
        GL11.glPushMatrix();
        eh_0.f();
        GL11.glTranslated((double)(d3 + 0.0), (double)(d4 + (double)ej_02.n() + 0.5), (double)d5);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        if (ds_2.s().i() == 2) {
            GL11.glRotatef((float)(-ds_2.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds_2.r().g(), (float)-1.0f, (float)0.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)(-ds_2.r().i()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ds_2.r().g(), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glScalef((float)(-f10), (float)(-f10), (float)f10);
        e3.l();
        e3.a(false);
        e3.u();
        e3.r();
        e3.a(770, 771, 1, 0);
        o7.a((double)(-n10) - 2.0, (double)n11, (double)n10 + 2.0, 2.0, 1.0, l6, l10);
        e3.p();
        dr_12.c((String)object3, (double)(-n10), (double)(n11 + 2), n6);
        boolean bl7 = false;
        if (bl5) {
            object = ej_02.aJ();
            int n12 = -((int)object.stream().filter(zR::lambda$renderNametag$0).count() * 10) - 5;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object e10 = iterator.next();
                fE fE2 = new fE(e10);
                if (fE2.f() <= 0) continue;
                fX fX2 = fX.i()[fE2.g()];
                e3.a(1.0f, 1.0f, 1.0f, 1.0f);
                ds_2.l().a(de_1.q());
                GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
                if (fX2.p()) {
                    int n13 = fX2.j();
                    o7.a(n12 + 6, n11 - 30, n13 % 8 * 18, 198 + n13 / 8 * 18, 18, 18);
                    dr_12.d(this.e(fE2.h() + 1), (double)(n12 + 6), (double)(n11 - 30), -1);
                    n12 += 20;
                    bl7 = true;
                }
                GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
            }
        }
        if (bl3) {
            GL11.glPushMatrix();
            if (ej_02.a(A5.cc)) {
                object = new eC(ej_02);
                if (bl7) {
                    GL11.glTranslated((double)0.0, (double)-8.0, (double)0.0);
                }
                this.a((eC)object, d7);
            }
            GL11.glPopMatrix();
        }
        e3.n();
        e3.g();
        e3.a(true);
        e3.n();
        e3.f();
        e3.a(1.0f, 1.0f, 1.0f, 1.0f);
        eh_0.h();
        GL11.glPopMatrix();
        ds_2.M().b(1.0);
    }

    private String e(int n6) {
        String[] stringArray = new String[]{"", "M", "MM", "MMM"};
        String[] stringArray2 = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] stringArray3 = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] stringArray4 = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String string = stringArray[n6 / 1000];
        String string2 = stringArray2[n6 % 1000 / 100];
        String string3 = stringArray3[n6 % 100 / 10];
        String string4 = stringArray4[n6 % 10];
        return string + string2 + string3 + string4;
    }

    private float a(fG fG2) {
        float f10;
        if (fG2 == null || !fG2.k().a(A5.bO) && !fG2.k().a(A5.aP)) {
            return 0.0f;
        }
        if (fG2.k().a(A5.bO)) {
            fb_0 fb_02 = new fb_0(fG2.k().a());
            f10 = fb_02.l();
        } else {
            f4 f42 = new f4(fG2.k().a());
            f10 = f42.k();
        }
        return (float)eq_0.a(e5.f().l(), fG2) * 1.25f + f10 + (float)eq_0.a(e5.g().l(), fG2) * 0.01f;
    }

    private double b(fG fG2) {
        if (fG2.d() && fG2.k().a(A5.cN)) {
            fV fV2 = new fV(fG2.k());
            return (double)fV2.m() + (double)((100 - fV2.m()) * eq_0.a(e5.m().l(), fG2)) * 0.0075;
        }
        return 0.0;
    }

    private float a(eJ eJ2) {
        float f10 = 0.0f;
        for (int i = 0; i < 45; ++i) {
            fG fG2;
            float f11;
            if (!eJ2.aY().a(i).h() || !((f11 = this.a(fG2 = eJ2.aY().a(i).f())) > f10)) continue;
            f10 = f11;
        }
        return f10;
    }

    private String a(eJ eJ2, ej_0 ej_02) {
        String string = this.z;
        eC eC2 = new eC(ej_02.a());
        if (eJ2.d() && eC2.d()) {
            fE fE2;
            fG fG2 = this.A.getOrDefault(eC2.q(), null);
            float f10 = 0.0f;
            if (fG2 != null && fG2.d()) {
                Object object;
                f10 += this.a(fG2);
                if (eC2.a(fX.o()) && ((fE)(object = eC2.b(fX.o()))).f() > 0) {
                    f10 = (float)((double)f10 * (1.375 * (double)((fE)object).h()));
                }
            }
            for (Object object : eC2.aU().g()) {
                Object object2 = new fG(object);
                f10 = (float)((double)f10 + this.b((fG)object2));
            }
            float f11 = this.a(eJ2);
            if (this.U.u().booleanValue() && eJ2.a(fX.o()) && (fE2 = eJ2.b(fX.o())).f() > 0) {
                f11 = (float)((double)f11 * (1.375 * (double)fE2.h()));
            }
            for (Object object2 : eJ2.aU().g()) {
                fG fG3 = new fG(object2);
                f11 = (float)((double)f11 + this.b(fG3));
            }
            if (f11 > f10) {
                string = this.ab;
            } else if (f11 < f10) {
                string = this.V;
            }
        }
        return string;
    }

    private static boolean lambda$renderNametag$0(Object object) {
        return new fE(object).f() > 0;
    }
}

