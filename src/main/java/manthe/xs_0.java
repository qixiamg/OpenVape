/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.xs
 */
public class xs_0
extends wM {
    private w2 z;

    public xs_0(w2 w22) {
        this.z = w22;
    }

    @Override
    public void a() {
        this.f(false);
    }

    @Override
    public void k() {
        this.f(true);
    }

    private void f(boolean bl) {
        mq mq2 = on.p.a(1.0);
        double d3 = this.d();
        double d4 = (float)((double)((float)this.c()) - (bl ? this.z.Y().f() : -2.0));
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        if (gO2.e() || eJ2.e()) {
            return;
        }
        List list = gO2.j();
        rj_0 rj_02 = rj_0.al();
        if (rj_02.aj.v() == rj_02.ak) {
            boolean bl2;
            boolean bl3 = GL11.glIsEnabled((int)3042);
            double d5 = rj_02.at.a();
            double d6 = d5 / 2.0;
            double d7 = rj_02.av.a();
            double d8 = rj_02.aw.a();
            boolean bl4 = bl2 = rj_02.au.v() == rj_02.ax;
            if (rj_02.al.u().booleanValue()) {
                if (bl2) {
                    pe_0.a(d3, d4, d5, d5, new Color(-1877995504, true), false, 3.0f, 1.0f);
                } else {
                    o7.a(d3, d4, 0.0, d5, 0.0, 0.0, 0.0, 0.5);
                }
            }
            if (rj_02.af.u().booleanValue()) {
                o7.a((d3 -= 0.5) + d5 / 2.0 - 0.5, (d4 -= 0.5) + 0.5, d3 + d5 / 2.0 + 0.5, d4 + d5 - 0.5, new Color(-10132123, true));
                o7.a(d3 + 0.5, d4 + d5 / 2.0 - 0.5, d3 + d5 - 0.5, d4 + d5 / 2.0 + 0.5, new Color(-10132123, true));
            }
            if (rj_02.al.u().booleanValue() && bl2) {
                pe_0.a(d3 + 1.0, d4 + 0.5, d5 - 2.0, 1.5, (Color)on.p.t().r.K(), false, 1.0f, 1.0f);
                L l6 = new L(xs_0.b.u);
                l6.d(100);
                pe_0.a(d3, d4, d5, d5, (Color)l6, 3.0f, 1.0f, 1.0f);
            }
            for (Object e10 : list) {
                double d10;
                double d11;
                if (e10 == eJ2.a()) continue;
                eC eC2 = new eC(e10);
                double d12 = eJ2.T() + (eJ2.z() - eJ2.T()) * (double)ds_2.O().g();
                double d13 = eJ2.X() + (eJ2.g() - eJ2.X()) * (double)ds_2.O().g();
                double d14 = eC2.T() + (eC2.z() - eC2.T()) * (double)ds_2.O().g();
                double d15 = eC2.X() + (eC2.g() - eC2.X()) * (double)ds_2.O().g();
                double d16 = d14 - d12;
                double d17 = d15 - d13;
                double d18 = d3 + d6;
                double d19 = d4 + d6;
                float f10 = (float)Math.cos((double)eJ2.U() * (Math.PI / 180));
                float f11 = (float)Math.sin((double)eJ2.U() * (Math.PI / 180));
                double d20 = -(d16 * (double)f10 + d17 * (double)f11) * d7;
                double d21 = -(d17 * (double)f10 - d16 * (double)f11) * d7;
                if (bl2) {
                    d11 = d18 + (rj_02.aq.u() == false ? d20 : Y.a(d20, -d6 + d8 / 2.0, d6 - d8 / 2.0));
                    d10 = d19 + (rj_02.aq.u() == false ? d21 : Y.a(d21, -d6 + d8 / 2.0, d6 - d8 / 2.0));
                    d10 = Math.max(d10, d4 + 4.0);
                } else {
                    if (rj_02.aq.u().booleanValue() && Math.sqrt(d20 * d20 + d21 * d21) > d6) {
                        float f12 = (float)Math.atan2(d21, d20);
                        d20 = (float)((d6 - 0.5) * Math.cos(f12));
                        d21 = (float)((d6 - 0.5) * Math.sin(f12));
                    }
                    d11 = d18 + d20;
                    d10 = d19 + d21;
                }
                Color color = Color.WHITE;
                if (rj_02.aB.v() == rj_02.ag) {
                    color = rj_02.az.K();
                } else if (rj_02.aB.v() == rj_02.aC) {
                    L l10 = on.p.t().a(eC2, true);
                    if (l10 != null) {
                        color = l10;
                    }
                } else if (rj_02.aB.v() == rj_02.am) {
                    Color color2 = color = on.p.t().a((ex_0)eC2) ? rj_02.ar.K() : rj_02.ap.K();
                }
                if (on.p.N().c(eC2.S()) && on.p.N().recolorVisuals.u().booleanValue()) {
                    color = on.p.N().friendsColor.K();
                }
                if (on.p.b().a(eC2.S()) && on.p.b().c.u().booleanValue()) {
                    color = on.p.b().e.K();
                }
                if (rj_02.an.v() == rj_02.ae) {
                    o7.a(d11 - d8 / 2.0, d10 - d8 / 2.0, d11 + d8 / 2.0, d10 + d8 / 2.0, 0.5, color, new Color(0x50000000, true));
                    continue;
                }
                double d22 = d8 / 2.0;
                pe_0.b(d11 - d22, d10 - d22, d8, 0.5, color);
                pe_0.a((float)(d11 - d22), (float)(d10 - d22), (float)d8, 1.0f, 0.75f, new Color(-16777216, true));
            }
            if (bl3 && !GL11.glIsEnabled((int)3042)) {
                GL11.glEnable((int)3042);
            }
        } else {
            List<eC> list2 = new ArrayList<eC>();
            ArrayList arrayList = new ArrayList();
            int n6 = rj_02.aA.a().intValue();
            for (Object e11 : list) {
                if (!A5.cc.isAssignableFrom(e11.getClass()) || e11 == eJ2.a() || arrayList.contains(e11)) continue;
                eC eC3 = new eC(e11);
                if (n6 != 0 && !(eJ2.a(eC3) <= (float)n6) || on.p.t().b((ex_0)eC3)) continue;
                list2.add(eC3);
                arrayList.add(e11);
            }
            if (list2.isEmpty()) {
                return;
            }
            list2.sort(new AR(this, eJ2));
            int n10 = rj_02.ai.a().intValue();
            int n11 = 0;
            if (rj_02.ai.a() != 0.0 && list2.size() > n10) {
                n11 = list2.size() - n10;
                list2 = list2.subList(0, n10);
            }
            int n12 = 0;
            for (eC eC4 : list2) {
                int n13 = (int)eJ2.a(eC4);
                String string = n13 > 100 ? "a" : (n13 > 50 ? "e" : "c");
                String string2 = String.format("\u00a7%s%dm", string, n13);
                if (rj_02.al.u().booleanValue()) {
                    o7.a(d3, d4 + (double)n12, d3 + this.e(), d4 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d3, d4 + (double)n12 + 9.5, d3 + this.e(), d4 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                int n14 = on.p.N().a(eC4) ? on.p.N().friendsColor.s() : (on.p.b().a(eC4) ? on.p.b().e.s() : -1);
                mq2.a(eC4.S(), d3 + 1.0, d4 + 2.0 + (double)n12, n14);
                mq2.a(string2, d3 + this.e() - mq2.b(string2) - 1.0, d4 + 2.0 + (double)n12, -1);
                n12 += 10;
            }
            if (n11 > 0) {
                if (rj_02.al.u().booleanValue()) {
                    o7.a(d3, d4 + (double)n12, d3 + this.e(), d4 + (double)n12 + 10.0, new Color(20, 20, 20, 180));
                    o7.a(d3, d4 + (double)n12 + 9.5, d3 + this.e(), d4 + (double)n12 + 10.0, new Color(25, 25, 25, 65));
                }
                mq2.a(n11 + " more...", d3 + 1.0, d4 + 2.0 + (double)n12, -1);
            }
        }
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
        return 0.0;
    }

    @Override
    public double h() {
        return 0.0;
    }
}

