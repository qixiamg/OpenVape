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
import java.util.Iterator;
import java.util.List;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class z8
extends Module {
    private final BooleanValue y = BooleanValue.createValue((Object)this, "Distance", false, "Shows the distance of the item.");
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Group Items", false, "Groups items into easier to read tags.");
    private final BooleanValue B = BooleanValue.createValue((Object)this, "Auto Scale", true, "Automatically scales up tags\nthe further the distance.");
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Whitelist Only", false, "Only renders whitelisted items.");
    private final DD x = DD.a((Object)this, "itemesp-alloweditems", "Allowed Items", DD.m, Collections.emptyList());
    private final DF w = DF.a((Object)this, "Scale", "#.#", "", 0.1, 1.0, 1.5, 0.1);
    private final Color A = new Color(20, 20, 20, 64);
    private final List<v6> z = new ArrayList<v6>();

    public z8() {
        super("ItemESP", 48779, CQ.d, "Renders tags on dropped items.");
        this.v.getRuntimeCopyException(new br_1(this));
        this.u.a(new BasicValue[]{this.x});
        this.a(this.y, this.v, this.B, this.w, this.u, this.x);
    }

    @Override
    public void a(kO kO2) {
        dx_1 dx_12 = kO2.getGuiScreen();
        if (dx_12.a(A5.O) || dx_12.a(A5.cn) || dx_12.a(A5.B)) {
            for (v6 v62 : this.z) {
                v62.a();
            }
            this.z.clear();
        }
    }

    @Override
    public void a(kS kS2) {
        super.a(kS2);
    }

    @Override
    public void a(kf_0 kf_02) {
        if (kf_02.c()) {
            return;
        }
        if (ds_2.k().e() || ds_2.t().e()) {
            for (v6 v62 : this.z) {
                v62.a();
            }
            this.z.clear();
            return;
        }
        List list = ds_2.t().k();
        Iterator<v6> iterator = this.z.iterator();
        while (iterator.hasNext()) {
            v6 v63 = iterator.next();
            v63.a(list);
            if (!v63.d()) continue;
            iterator.remove();
        }
        for (v6 v63 : list) {
            Object object;
            ex_0 ex_02 = new ex_0(v63);
            if (!ex_02.a(A5.ch)) continue;
            e8 e82 = new e8(ex_02);
            if (this.u.u().booleanValue() && !this.x.a(e82.at())) continue;
            v6 v64 = null;
            v6 v65 = null;
            for (v6 v66 : this.z) {
                e8 e83;
                if (v66.a(v63)) {
                    v65 = v66;
                    continue;
                }
                if (!this.v.u().booleanValue() || !((double)e82.a(e83 = new e8(v66.c())) <= 3.0) || v64 != null && v6.b(v66).size() < v6.b(v64).size()) continue;
                v64 = v66;
            }
            if (v64 != null) {
                if (v65 != null) {
                    object = v6.a(v65).iterator();
                    while (object.hasNext()) {
                        v64.b(new e8(object.next()));
                        object.remove();
                    }
                    v65.a();
                    this.z.remove(v65);
                    return;
                }
                v64.b(e82);
                v64.e();
                return;
            }
            if (v65 != null) continue;
            object = new v6(this, e82);
            this.z.add((v6)object);
        }
    }

    @Override
    public void a(kx_0 kx_02) {
        if (ds_2.t().e()) {
            return;
        }
        double d3 = ds_2.r().m();
        double d4 = ds_2.r().n();
        double d5 = ds_2.r().j();
        eJ eJ2 = ds_2.k();
        for (v6 v62 : this.z) {
            Object object = v62.c();
            if (object == null) continue;
            e8 e82 = new e8(object);
            double d6 = e82.T() + (e82.z() - e82.T()) * (double)kx_02.getTicks() - d3;
            double d7 = e82.R() + (e82.l() - e82.R()) * (double)kx_02.getTicks() - d4;
            double d8 = e82.X() + (e82.g() - e82.X()) * (double)kx_02.getTicks() - d5;
            GL11.glPushMatrix();
            this.a(eJ2, v62, d6, d7, d8);
            GL11.glPopMatrix();
        }
    }

    private void a(eJ eJ2, v6 v62, double d3, double d4, double d5) {
        Object object;
        int n6;
        e8 e82 = new e8(v62.c());
        List<fG> list = v62.b();
        int n10 = 0;
        String[] stringArray = new String[list.size()];
        dr_1 dr_12 = ds_2.m();
        for (n6 = 0; n6 < list.size(); ++n6) {
            object = list.get(n6);
            String string = ((fG)object).j();
            if (this.y.u().booleanValue() && n6 == 0) {
                string = VapeSettings.v + "a[" + VapeSettings.v + "f" + (int)eJ2.a(e82) + VapeSettings.v + "a]" + VapeSettings.v + "r " + string;
            }
            if (((fG)object).h() > 1 && ((fG)object).n() > 1) {
                string = string + VapeSettings.v + "r x" + ((fG)object).n();
            }
            n10 = Math.max(dr_12.c(string) / 2, n10);
            stringArray[n6] = string;
        }
        ds_2.M().a(1.0);
        n6 = 0xFFFFFF;
        object = this.A;
        float f10 = (float)(0.03333335 * this.w.a());
        if (this.B.u().booleanValue()) {
            float f11 = eJ2.a(e82);
            float f12 = f11 / 5.0f <= 2.0f ? 2.0f : f11 / 5.0f;
            f10 = (float)(0.01666666753590107 * ((double)f12 * this.w.a()));
        }
        GL11.glPushMatrix();
        eh_0.f();
        GL11.glTranslated((double)(d3 + 0.0), (double)(d4 + 0.25 + 0.5), (double)d5);
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
        int n11 = dr_12.f();
        int n12 = n10;
        int n13 = -(n11 * stringArray.length - 1);
        e3.l();
        o7.a((double)(-n12) - 2.0, (double)n13, (double)n12 + 2.0, 2.0, (Color)object);
        e3.p();
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        for (int i = 0; i < stringArray.length; ++i) {
            int n14 = dr_12.c(stringArray[i]) / 2;
            int n15 = -(dr_12.b(stringArray[i]) - 1);
            dr_12.c(stringArray[i], (double)(-n14), (double)(n15 + 2 - n11 * i), n6);
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

    static List a(z8 z82) {
        return z82.z;
    }
}

