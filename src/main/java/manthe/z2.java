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

public class z2
extends Module {
    private final pb_0 w = new pb_0("3D");
    private final pb_0 x = new pb_0("2D");
    private final pb_0 L = new pb_0("Outline");
    private final pb_0 G = new pb_0("Skeleton");
    private final DX A;
    private final ColorValue v = ColorValue.createValue((Object)this, "Player Color", new Color(-14368924));
    private final BooleanValue B = BooleanValue.createValue((Object)this, "Invisibles", false, "Show invisibles.");
    private final yr_0 D = new yr_0(this, "3D");
    private final yJ R = new yJ(this, "2D");
    private final yL K = new yL(this, "Skeleton");
    public BooleanValue J = BooleanValue.createValue((Object)this, "Enemy Only", false, "Only render enemies.");
    public BooleanValue T = BooleanValue.createValue((Object)this, "Priority Only", false, "Only shows the ESP box on friends/enemies.");
    public BooleanValue u = BooleanValue.createValue(this, "Enemies List Only", false);
    public BooleanValue z = BooleanValue.createValue(this, "Hide Bots", false);
    public BooleanValue M = BooleanValue.createValue((Object)this, "Hitbox", false, "Shows the current entity hitbox size.\n(HitBoxes expansion visible)\n(3D Only)");
    public BooleanValue I = BooleanValue.createValue((Object)this, "Show Normal", false, "Shows the true entity hitbox size.\n(3D Only)");
    public BooleanValue F = BooleanValue.createValue((Object)this, "Bounding Box", true, "Shows an ESP box that wraps around the players BoundingBox.");
    public BooleanValue P = BooleanValue.createValue((Object)this, "Health Bar", false, "Shows a healthbar next to the ESP box");
    public BooleanValue C = BooleanValue.createValue((Object)this, "Name", false, "Shows a nametag above the ESP box");
    public BooleanValue N = BooleanValue.createValue((Object)this, "Use Displayname", false, "Shows the tab list display name.");
    public BooleanValue y = BooleanValue.createValue((Object)this, "Show Background", false, "Renders a box behind the text.");
    public BooleanValue S = BooleanValue.createValue((Object)this, "Damage", false, "Shows enemy damage relative to yours");
    public ef_0 E = ds_2.r();
    private boolean O = false;
    private int H = 0;
    private boolean Q;

    public z2() {
        super("ESP", -16711936, CQ.d, "Extra Sensory Perception\nRenders an ESP on players.");
        this.M.a(new BasicValue[]{this.I});
        this.A = DX.a((Object)this, "Mode", this.w, this.w, this.x, this.G, this.L);
        this.F.a(new BasicValue[]{this.T});
        this.C.a(this.N, this.y);
        this.A.a(this.M, this.F, this.T, this.P, this.C);
        this.A.a((BasicValue)this.F, this.x);
        this.A.a((BasicValue)this.T, this.x);
        this.A.a((BasicValue)this.N, this.x);
        this.A.a((BasicValue)this.y, this.x);
        this.A.a((BasicValue)this.P, this.x);
        this.A.a((BasicValue)this.C, this.x);
        this.A.a((BasicValue)this.M, this.w);
        this.a(this.v, this.A, this.M, this.I, this.F, this.T, this.P, this.C, this.N, this.y, this.B, this.z);
    }

    public boolean S() {
        return this.A.v() == this.L && this.Q;
    }

    @Override
    public void t() {
        if (Cp.e()) {
            return;
        }
        if (this.A.v() == this.x) {
            this.R.t();
        }
    }

    @Override
    public void a(kq_0 kq_02) {
        if (this.A.v() == this.G) {
            this.K.a(kq_02);
        }
    }

    @Override
    public void a(lK lK2) {
        if (Cp.e()) {
            return;
        }
        if (on.p.t().b((ex_0)lK2.getClientPlayer()) && this.z.u().booleanValue()) {
            return;
        }
        if (this.J.u().booleanValue() && (this.u.u() != false ? !on.p.b().a(lK2.getClientPlayer().S()) : !on.p.t().a((ex_0)lK2.getClientPlayer(), false))) {
            return;
        }
        if (this.A.v() == this.L) {
            if (ds_2.t().e()) {
                return;
            }
            if (this.Q) {
                lK2.getForgeEvent().a(true);
                dn_1 dn_12 = (dn_1)lK2.getForgeEvent();
                dn_12.c(false);
                dn_12.e(false);
                dn_12.d(false);
            }
        }
    }

    @Override
    public void a(ll_0 ll_02) {
        if (Cp.e()) {
            return;
        }
        if (on.p.t().b(ll_02.getEntity()) && this.z.u().booleanValue()) {
            return;
        }
        if (this.J.u().booleanValue() && (this.u.u() != false ? !on.p.b().a(ll_02.getEntity().S()) : !on.p.t().a(ll_02.getEntity(), false))) {
            return;
        }
        if (this.A.v() == this.L) {
            if (ds_2.t().e()) {
                return;
            }
            if (this.Q) {
                dn_2 dn_22 = (dn_2)ll_02.getForgeEvent();
                dn_22.a(0);
            }
        }
    }

    @Override
    public void a(kA kA2) {
        if (Cp.e()) {
            return;
        }
        if (on.p.t().b(kA2.getEntity()) && this.z.u().booleanValue()) {
            return;
        }
        if (this.J.u().booleanValue() && (this.u.u() != false ? !on.p.b().a(kA2.getEntity().S()) : !on.p.t().a(kA2.getEntity(), false))) {
            return;
        }
        if (this.A.v() == this.L) {
            if (ds_2.t().e()) {
                return;
            }
            eJ eJ2 = ds_2.k();
            ex_0 ex_02 = kA2.getEntity();
            if (ex_02.equals(eJ2)) {
                return;
            }
            if (this.Q) {
                kA2.a(true);
            }
            return;
        }
        if (this.A.v() == this.x) {
            this.R.a(kA2);
        }
    }

    @Override
    public void a(kx_0 kx_02) {
        if (Cp.e()) {
            return;
        }
        if (this.A.v() == this.x) {
            this.R.a(kx_02);
        }
        if (this.A.v() == this.G) {
            this.K.a(kx_02);
        }
        if (this.A.v() == this.w) {
            this.D.a(kx_02);
        }
        if (this.A.v() != this.L || !this.O || this.H < 10) {
            return;
        }
        ds_2.M().a(0.0);
        eJ eJ2 = ds_2.k();
        gS gS2 = eJ2.i();
        pw_0.j();
        int n6 = GL11.glGenLists((int)1);
        pw_0.b().e();
        GL11.glPushMatrix();
        ds_2.M().a(kx_02.getTicks(), 0);
        GL11.glDisable((int)2929);
        pw_0.b().b(true);
        GL11.glNewList((int)n6, (int)4864);
        GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)1.0);
        o7.a(this.v.K().getRGB());
        for (Object e10 : gS2.k()) {
            ex_0 ex_02 = new ex_0(e10);
            if (on.p.t().b(ex_02) && this.z.u().booleanValue() || this.J.u().booleanValue() && (this.u.u() == false ? !on.p.t().a(ex_02, false) : !on.p.b().a(ex_02.S()))) continue;
            if (ex_02.equals(eJ2) || !ex_02.a(A5.cc)) continue;
            GL11.glPushMatrix();
            GL11.glLineWidth((float)3.0f);
            GL11.glEnable((int)3042);
            GL11.glEnable((int)2848);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3553);
            double d3 = ex_02.T() + (ex_02.z() - ex_02.T()) * (double)kx_02.getTicks() - ds_2.r().m();
            double d4 = ex_02.R() + (ex_02.l() - ex_02.R()) * (double)kx_02.getTicks() - ds_2.r().n();
            double d5 = ex_02.X() + (ex_02.g() - ex_02.X()) * (double)kx_02.getTicks() - ds_2.r().j();
            ew_0 ew_02 = new ew_0(ds_2.r().a(ex_02).a());
            if (ew_02.d()) {
                this.Q = true;
                e3.l();
                ArrayList arrayList = null;
                if (V.c() > 13) {
                    arrayList = Lists.newArrayList(ew_02.f());
                    ew_02.f().clear();
                }
                GL11.glPushMatrix();
                ds_2.M().a(0.0);
                ew_02.a(ex_02, d3, d4, d5, kx_02.getTicks(), kx_02.getTicks());
                o7.a(this.v.K().getRGB());
                GL11.glPopMatrix();
                if (V.c() > 13) {
                    ew_02.a(arrayList);
                }
                e3.n();
                this.Q = false;
            }
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)3008);
            GL11.glPopMatrix();
        }
        ds_2.M().a(0.0);
        GL11.glEndList();
        GL11.glPolygonMode((int)1032, (int)6913);
        GL11.glCallList((int)n6);
        GL11.glPolygonMode((int)1032, (int)6912);
        GL11.glCallList((int)n6);
        pw_0.b().b(false);
        GL11.glPolygonMode((int)1032, (int)6914);
        GL11.glCallList((int)n6);
        pw_0.b().g();
        GL11.glPolygonMode((int)1032, (int)6913);
        GL11.glCallList((int)n6);
        GL11.glPolygonMode((int)1032, (int)6912);
        GL11.glCallList((int)n6);
        GL11.glPolygonMode((int)1032, (int)6914);
        pw_0.b().i();
        GL11.glEnable((int)2929);
        GL11.glDeleteLists((int)n6, (int)1);
        GL11.glPopMatrix();
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        ds_2.M().b(1.0);
    }

    public Color a(Object object) {
        if (Cp.e()) {
            return null;
        }
        if (!A5.cF.isInstance(object)) {
            return null;
        }
        if (object.equals(ds_2.k())) {
            return null;
        }
        if (!this.B.u().booleanValue() && pf_0.b(new ej_0(object))) {
            return null;
        }
        ej_0 ej_02 = new ej_0(object);
        if (on.p.t().b(ej_02) && this.z.u().booleanValue()) {
            return null;
        }
        if (A5.L.isInstance(object)) {
            L l6 = on.p.t().a(new eC(object));
            if (l6 == null) {
                l6 = this.v.K();
            }
            return l6;
        }
        return null;
    }

    @Override
    public void a(k5 k52) {
        if (Cp.e()) {
            return;
        }
        if (this.A.v() != this.L) {
            return;
        }
        if (this.Q && V.c() == 13) {
            o7.a(this.v.K());
            return;
        }
        if (!k52.getEntity().a(A5.u) && k52.getEntity().a(A5.cc)) {
            this.O = true;
            ++this.H;
        }
    }
}

