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
import java.util.List;
import java.util.Map;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

public class z0
extends Module {
    private final BooleanValue G = BooleanValue.createValue(this, "Enemy Only", false);
    private final BooleanValue I = BooleanValue.createValue(this, "Enemies List Only", false);
    private final BooleanValue K = BooleanValue.createValue(this, "Render Players", true);
    private final BooleanValue C = BooleanValue.createValue(this, "Render Mobs", false);
    private final BooleanValue E = BooleanValue.createValue(this, "Render Animals", false);
    private final BooleanValue J = BooleanValue.createValue(this, "Distance Check", false);
    private final BooleanValue L = BooleanValue.createValue(this, "Distance Check", false);
    private final BooleanValue A = BooleanValue.createValue(this, "Distance Check", false);
    private final BooleanValue u = BooleanValue.createValue(this, "Invisibles", false);
    private final BooleanValue B = BooleanValue.createValue(this, "Color by distance", false);
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Highlight if focusing", false, "If another player is looking at you their tracer will be highlighted");
    private final dy_0 w = dy_0.createValue(this, "Player Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private final dy_0 F = dy_0.createValue(this, "Mob Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private final dy_0 y = dy_0.createValue(this, "Animal Distance", "#", "", 0.0, 0.0, 32.0, 256.0);
    private final ColorValue z = ColorValue.createValue((Object)this, "Player Color", new Color(0, 150, 255));
    private final ColorValue H = ColorValue.createValue((Object)this, "Mob Color", 0.0);
    private final ColorValue M = ColorValue.createValue((Object)this, "Animal Color", 0.0);
    private final Map<ej_0, Cf> v = new HashMap<ej_0, Cf>();
    private double D;
    private List<ej_0> N;

    public z0() {
        super("Tracers", -12274966, CQ.d);
        this.K.a(this.G, this.J, this.z);
        this.C.a(this.L, this.H);
        this.E.a(this.A, this.M);
        this.J.a(new BasicValue[]{this.w});
        this.L.a(new BasicValue[]{this.F});
        this.A.a(new BasicValue[]{this.y});
        this.a(this.u, this.B, this.x, this.K, this.G, this.J, this.w, this.z, this.E, this.A, this.y, this.M, this.C, this.L, this.F, this.H);
    }

    private void U() {
        if (this.B.u().booleanValue()) {
            eJ eJ2 = ds_2.k();
            for (ej_0 ej_02 : this.N) {
                double d3 = eJ2.a(ej_02);
                float f10 = 0.35f;
                double d4 = (double)(Math.round(d3 / 3.0) * 3L) - this.D / 3.0;
                float f11 = (float)((double)f10 * (d4 / this.D));
                if (d3 > this.D) {
                    f11 = f10;
                }
                Color color = new Color(Color.HSBtoRGB(f11, 1.0f, 1.0f));
                int n6 = 255;
                if (d3 > this.D && (n6 = (int)(255.0 / (d3 / this.D))) < 150) {
                    n6 = 150;
                }
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), n6);
                this.v.get(ej_02).a(color);
            }
        }
    }

    private void S() {
        if (this.x.u().booleanValue()) {
            ArrayList<ej_0> arrayList = new ArrayList<ej_0>();
            eJ eJ2 = ds_2.k();
            for (ej_0 ej_02 : this.N) {
                if (!ej_02.c(eJ2) || !(pf_0.d(ej_02, eJ2) < 5.0)) continue;
                arrayList.add(ej_02);
            }
            if (!arrayList.isEmpty()) {
                for (ej_0 ej_02 : this.N) {
                    Cf cf = this.v.get(ej_02);
                    if (arrayList.contains(ej_02)) {
                        cf.a(3.0);
                        cf.a(true);
                        continue;
                    }
                    cf.a(0.75);
                }
            }
        }
    }

    private void T() {
        eJ eJ2 = ds_2.k();
        Collections.sort(this.N, new nc_0(this, eJ2));
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (Map.Entry<ej_0, Cf> entry : this.v.entrySet()) {
            ej_0 ej_02 = entry.getKey();
            arrayList.add(Double.valueOf(eJ2.a(ej_02)));
        }
        Collections.sort(arrayList);
        this.D = (Double)arrayList.get(arrayList.size() / 2);
    }

    @Override
    public void getRuntimeCopyException(kx_0 kx_02) {
        eJ eJ2 = ds_2.k();
        ef_0 ef_02 = ds_2.r();
        this.V();
        if (this.v.size() == 0) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glDisable((int)2929);
        ds_2.M().a(0.0);
        double d3 = ef_02.m();
        double d4 = ef_02.n();
        double d5 = ef_02.j();
        double d6 = V.c() > 13 ? (double)eJ2.am() : 0.0;
        this.N = new ArrayList<ej_0>(this.v.keySet());
        this.T();
        this.U();
        this.S();
        Collections.reverse(this.N);
        for (ej_0 ej_02 : this.N) {
            L l6;
            Cf cf = this.v.get(ej_02);
            Color color = cf.c();
            if (ej_02.a(A5.cc) && (l6 = on.p.t().b(new eC(ej_02))) != null) {
                color = l6;
            }
            this.a(ej_02, color, (float)cf.a(), kx_02.getTicks(), d3, d4, d5, d6, cf.b());
        }
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        ds_2.M().b(0.0);
        GL11.glEnable((int)2929);
        GL11.glPopMatrix();
        this.v.clear();
    }

    private void V() {
        for (Object e10 : ds_2.t().k()) {
            ex_0 ex_02 = new ex_0(e10);
            if (!ex_02.a(A5.cF) || ex_02.equals(ds_2.k())) continue;
            ej_0 ej_02 = new ej_0(ex_02);
            if (!this.u.u().booleanValue() && pf_0.b(ej_02) || on.p.t().b(ej_02) || this.G.u().booleanValue() && (this.I.u() != false ? !on.p.b().a(ex_02.S()) : !on.p.t().a(ex_02, false))) continue;
            float f10 = ej_02.a(ds_2.k());
            if (ex_02.a(A5.L)) {
                if (!this.K.u().booleanValue() || this.J.u().booleanValue() && ((double)f10 < this.w.v()[0] || (double)f10 > this.w.v()[1])) continue;
                if (on.p.N().c(ej_02.S()) && on.p.N().recolorVisuals.u().booleanValue()) {
                    this.v.put(ej_02, new Cf(on.p.N().friendsColor.K(), null));
                    continue;
                }
                if (on.p.b().a(ej_02.S()) && on.p.b().c.u().booleanValue()) {
                    this.v.put(ej_02, new Cf(on.p.b().e.K(), null));
                    continue;
                }
                this.v.put(ej_02, new Cf(this.z.K(), null));
                continue;
            }
            if (ex_02.a(A5.P)) {
                if (!this.C.u().booleanValue() || this.L.u().booleanValue() && ((double)f10 < this.F.v()[0] || (double)f10 > this.F.v()[1])) continue;
                this.v.put(ej_02, new Cf(this.H.K(), null));
                continue;
            }
            if (!this.E.u().booleanValue() || this.A.u().booleanValue() && ((double)f10 < this.y.v()[0] || (double)f10 > this.y.v()[1])) continue;
            this.v.put(ej_02, new Cf(this.M.K(), null));
        }
    }

    private void a(ex_0 ex_02, Color color, float f10, float f11, double d3, double d4, double d5, double d6, boolean bl) {
        double d7 = ex_02.T() + (ex_02.z() - ex_02.T()) * (double)f11 - d3;
        double d8 = ex_02.R() + (ex_02.l() - ex_02.R()) * (double)f11 - d4;
        double d10 = ex_02.X() + (ex_02.g() - ex_02.X()) * (double)f11 - d5;
        boolean bl2 = GL11.glIsEnabled((int)3042);
        boolean bl3 = GL11.glIsEnabled((int)2896);
        GL11.glBlendFunc((int)770, (int)771);
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        if (bl3) {
            GL11.glDisable((int)2896);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)3553);
        double d11 = 0.0;
        double d12 = 0.0;
        if (V.c() >= 23) {
            eJ eJ2 = ds_2.k();
            oC oC2 = new oC(0.0, 0.0, 1.0);
            oC2.a((float)(-Math.toRadians(eJ2.K())));
            oC2.b((float)(-Math.toRadians(eJ2.U())));
            d11 = oC2.a();
            d6 += oC2.b();
            d12 = oC2.d();
        }
        if (bl) {
            GL11.glLineWidth((float)(f10 + f10 * 0.5f));
            GL11.glBegin((int)1);
            o7.a(Color.black);
            GL11.glVertex3d((double)d11, (double)d6, (double)d12);
            GL11.glVertex3d((double)d7, (double)(d8 + (double)ex_02.am()), (double)d10);
            GL11.glEnd();
        }
        GL11.glLineWidth((float)f10);
        GL11.glBegin((int)1);
        o7.a(color);
        GL11.glVertex3d((double)d11, (double)d6, (double)d12);
        GL11.glVertex3d((double)d7, (double)(d8 + (double)ex_02.am()), (double)d10);
        GL11.glEnd();
        if (bl3) {
            GL11.glEnable((int)2896);
        }
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
    }
}

