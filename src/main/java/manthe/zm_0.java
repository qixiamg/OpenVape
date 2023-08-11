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
import java.util.List;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

/*
 * Renamed from manthe.zm
 */
public class zm_0
extends Module {
    private final qR y = new qR();
    private final qB C = new qB();
    private final qs z = new qs(Collections.singleton(A5.af), new Color(173, 12, 255));
    private final qs w = new qs(Collections.singleton(A5.cS), new Color(255, 238, 154));
    private final qs E = new qs(Collections.singleton(A5.cA), new Color(255, 255, 255));
    private final ef_0 B;
    private final BooleanValue u = BooleanValue.createValue(this, "Show Arrows", true);
    private final BooleanValue v = BooleanValue.createValue(this, "Show Pearls", true);
    private final BooleanValue D = BooleanValue.createValue(this, "Show Potions", false);
    private final BooleanValue x = BooleanValue.createValue(this, "Show Eggs", false);
    private final BooleanValue A = BooleanValue.createValue(this, "Show Snowballs", false);

    public zm_0() {
        super("Projectiles", -16535661, CQ.d, "Shows projectile trajectories while in air");
        this.B = ds_2.r();
        this.a(this.u, this.v, this.D, this.x, this.A);
    }

    @Override
    public void a(kx_0 kx_02) {
        gO gO2 = ds_2.t();
        for (Object e10 : gO2.l()) {
            ex_0 ex_02 = new ex_0(e10);
            if (!ex_02.a(A5.bn)) continue;
            eE eE2 = new eE(ex_02.a());
            eX eX2 = new eX(ex_02.a());
            ca_0 ca_02 = this.a(eE2);
            if (ca_02 == null) continue;
            this.a(eX2, ca_02);
        }
    }

    private List<ca_0> S() {
        ArrayList<ca_0> arrayList = new ArrayList<ca_0>();
        if (this.u.u().booleanValue()) {
            arrayList.add(this.y);
        }
        if (this.D.u().booleanValue()) {
            arrayList.add(this.C);
        }
        if (this.v.u().booleanValue()) {
            arrayList.add(this.z);
        }
        if (this.x.u().booleanValue()) {
            arrayList.add(this.w);
        }
        if (this.A.u().booleanValue()) {
            arrayList.add(this.E);
        }
        return arrayList;
    }

    private ca_0 a(eX eX2) {
        if (eX2.v()) {
            return null;
        }
        if (eX2.z() == eX2.T() && eX2.g() == eX2.X()) {
            return null;
        }
        for (ca_0 ca_02 : this.S()) {
            if (!ca_02.a(eX2)) continue;
            return ca_02;
        }
        return null;
    }

    private void a(double d3, double d4, double d5) {
        GL11.glVertex3d((double)(d3 - this.B.m()), (double)(d4 - this.B.n()), (double)(d5 - this.B.j()));
    }

    private void a(eX eX2, ca_0 ca_02) {
        if (!eX2.a(A5.bn)) {
            return;
        }
        eJ eJ2 = ds_2.k();
        gO gO2 = ds_2.t();
        Color color = ca_02.a(eX2.a());
        if (color == null) {
            color = new Color(255, 255, 255);
        }
        GL11.glPushMatrix();
        GL11.glLineWidth((float)1.5f);
        o7.a(color);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glBegin((int)3);
        double d3 = eX2.z();
        double d4 = eX2.l();
        double d5 = eX2.g();
        double d6 = eX2.k();
        double d7 = eX2.D();
        double d8 = eX2.u();
        this.a(d3, d4, d5);
        while (true) {
            gK gK2;
            float f10 = ca_02.b();
            float f11 = ca_02.a();
            fP fP2 = fP.a(d3 - (double)f10, d4, d5 - (double)f10, d3 + (double)f10, d4 + (double)f11, d5 + (double)f10);
            gK gK3 = gK.b(d3, d4, d5);
            gb_0 gb_02 = gO2.a(gK3, gK2 = gK.b(d3 + d6, d4 + d7, d5 + d8), false, eX2.a(A5.c9), false);
            if (gb_02.d()) {
                gK2 = gK.b(gb_02.k().g(), gb_02.k().h(), gb_02.k().f());
            }
            List list = gO2.a(eJ2, fP2.e(d6, d7, d8).d(1.0, 1.0, 1.0));
            double d10 = 0.0;
            for (Object e10 : list) {
                double d11;
                gb_0 gb_03;
                ex_0 ex_02 = new ex_0(e10);
                if (!ex_02.a(A5.cF) || ex_02.a(A5.cI) || !ex_02.V() || ex_02.equals(eJ2) || !(gb_03 = (fP2 = ex_02.s().d(0.3, 0.3, 0.3)).a(gK3, gK2)).d() || !((d11 = gK3.a(gb_03.k())) < d10) && d10 != 0.0) continue;
                d10 = d11;
                gb_03.a(ex_02);
                gb_02 = gb_03;
            }
            d3 += d6;
            d4 += d7;
            d5 += d8;
            if (gb_02.d()) {
                d3 = gb_02.k().g();
                d4 = gb_02.k().h();
                d5 = gb_02.k().f();
                break;
            }
            if (d4 < -128.0) break;
            d7 *= eX2.H() ? 0.8 : 0.99;
            this.a(d3 + (d6 *= eX2.H() ? 0.8 : 0.99), d4 + (d7 -= 0.05), d5 + (d8 *= eX2.H() ? 0.8 : 0.99));
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
    }
}

