/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.ArrayList;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

public class zC
extends Module {
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Hide Bots", false, "Doesn't apply chams on bots.");
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Colored", false, "Colors entities.");
    private final ColorValue z = ColorValue.createValue((Object)this, "Visible Color", new Color(255, 0, 0));
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Color Behind Walls", true, "Renders a different color when\nplayers are behind walls.");
    private final ColorValue B = ColorValue.createValue((Object)this, "Invisible Color", new Color(255, 255, 0));
    private boolean u;
    private ej_0 A;
    private int y;

    public zC() {
        super("Chams", -16711936, CQ.d, "Render players through walls.");
        this.a(this.w, this.v.a(this.z, this.x.a(new BasicValue[]{this.B})), this.z, this.x, this.B);
    }

    @Override
    public void a(kA kA2) {
        if (!this.u) {
            return;
        }
        if (ds_2.t().e()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        ex_0 ex_02 = kA2.getEntity();
        if (ex_02.equals(eJ2)) {
            return;
        }
        kA2.a(true);
    }

    @Override
    public void a(lK lK2) {
        if (lK2.getClientPlayer().a(A5.u)) {
            return;
        }
        dn_1 dn_12 = (dn_1)lK2.getForgeEvent();
        if (!this.u) {
            return;
        }
        if (ds_2.t().e()) {
            return;
        }
        lK2.getForgeEvent().a(true);
        dn_12.c(false);
        dn_12.e(false);
        dn_12.d(false);
    }

    @Override
    public void a(ll_0 ll_02) {
        if (this.u) {
            if (ds_2.t().e()) {
                return;
            }
            dn_2 dn_22 = (dn_2)ll_02.getForgeEvent();
            dn_22.a(0);
        }
    }

    @Override
    public void a(k5 k52) {
        if (k52.getEntity().a(A5.cc) && !k52.getEntity().a(A5.u) && this.v.u().booleanValue() && this.u) {
            if (this.y == 1) {
                o7.a(this.x.u() != false ? this.B.K() : this.z.K());
            }
            if (this.y == 2) {
                o7.a(this.z.K());
            }
        }
    }

    @Override
    public void a(kc_0 kc_02) {
        if (this.w.u().booleanValue() && on.p.t().b((ex_0)kc_02.getEntityPlayer())) {
            return;
        }
        z2 z22 = on.p.H().b(z2.class);
        if (this.u || this.y == 3 || z22.N() && z22.S()) {
            return;
        }
        if (!this.v.u().booleanValue()) {
            if (kc_02.getEntityPlayer().a(A5.cc) && !kc_02.getEntityPlayer().a(A5.u)) {
                GL11.glEnable((int)32823);
                GL11.glPolygonOffset((float)1.0f, (float)-2500000.0f);
            }
        } else if (kc_02.getEntityPlayer().d() && kc_02.getRenderer().d() && !kc_02.getEntityPlayer().a(A5.u)) {
            if (V.c() == 13) {
                kc_02.a(true);
            }
            eC eC2 = kc_02.getEntityPlayer();
            double d3 = kc_02.getX();
            double d4 = kc_02.getY();
            double d5 = kc_02.getZ();
            float f10 = eC2.ag() + (eC2.U() - eC2.ag()) * kc_02.getPartialTicks();
            GL11.glPushMatrix();
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3553);
            e3.l();
            o7.a(this.x.u() != false ? this.B.K() : this.z.K());
            ArrayList arrayList = null;
            if (V.c() > 13) {
                arrayList = Lists.newArrayList(kc_02.getRenderer().f());
                kc_02.getRenderer().f().clear();
            }
            try {
                this.u = true;
                this.y = 1;
                kc_02.getRenderer().a(eC2, d3, d4, d5, f10, kc_02.getPartialTicks());
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.u = false;
            GL11.glEnable((int)2929);
            GL11.glEnable((int)3553);
            if (V.c() == 13) {
                this.y = 3;
                GL11.glPushMatrix();
                GL11.glEnable((int)2896);
                kc_02.getRenderer().a(eC2, d3, d4, d5, f10, kc_02.getPartialTicks());
                GL11.glDepthMask((boolean)false);
                GL11.glDisable((int)2896);
                GL11.glPopMatrix();
            }
            this.u = true;
            o7.a(this.z.K());
            GL11.glDisable((int)3553);
            try {
                this.y = 2;
                kc_02.getRenderer().a(eC2, d3, d4, d5, f10, kc_02.getPartialTicks());
                this.u = false;
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (V.c() > 13) {
                kc_02.getRenderer().a(arrayList);
            }
            GL11.glEnable((int)3553);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            e3.n();
            GL11.glPopMatrix();
            this.y = -1;
            if (!eC2.ae()) {
                this.A = eC2;
                eC2.c(true);
            }
        }
    }

    @Override
    public void a(kq_0 kq_02) {
        if (on.p.t().b((ex_0)kq_02.getEntityPlayer()) && this.w.u().booleanValue()) {
            return;
        }
        if (this.v.u().booleanValue()) {
            if (this.A != null) {
                eC eC2 = kq_02.getEntityPlayer();
                eC2.c(false);
                this.A = null;
            }
            return;
        }
        if (kq_02.getEntityPlayer().a(A5.cc) && !kq_02.getEntityPlayer().a(A5.u)) {
            GL11.glDisable((int)32823);
            GL11.glPolygonOffset((float)1.0f, (float)2500000.0f);
        }
    }
}

