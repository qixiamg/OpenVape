/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

/*
 * Renamed from manthe.yv
 */
public class yv_0
extends Module {
    private final List<oC> E = new CopyOnWriteArrayList<oC>();
    private final pb_0 z = new pb_0("Outgoing only");
    private final pb_0 C = new pb_0("Bi-directional");
    private final DX A = DX.a((Object)this, "Direction", "Outgoing only - only chokes packets that you're sending\nBi-directional - additionally chokes incoming packets from the server", this.z, this.z, this.C);
    private final pb_0 G = new pb_0("All");
    private final pb_0 L = new pb_0("Movement only");
    private final DX K = DX.a((Object)this, "Type", "All - chokes all packets of all types\nMovement only - Only chokes movement related packets", this.G, this.G, this.L);
    private final BooleanValue H = BooleanValue.createValue((Object)this, "Breadcrumbs", false, "Drops breadcrumbs in case you forgot where you came from.");
    private final BooleanValue y = BooleanValue.createValue((Object)this, "Spawn Fake", false, "Spawns a fake player where you started/are on the servers side.");
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Auto send", false, "Automatically sends packets after a limit is reached");
    private final DF J = DF.a(this, "Send threshold", "#", "", 0.0, 50.0, 100.0, 1.0, "Allows you to choke your packets for a custom set limit.\nAfter the limit is reached, all packets will be sent.\nNOTE: 0 = No Limit");
    public ef_0 w;
    private int I;
    private e2 v;
    private final Queue<ck_0> F = new ArrayDeque<ck_0>();
    private boolean D = false;
    private boolean u = false;
    private boolean B = false;

    public yv_0() {
        super("Blink", 8919359, CQ.f, "Chokes packets until disabled.");
        this.w = ds_2.r();
        this.x.a(new BasicValue[]{this.J});
        this.a(this.A, this.K, this.H, this.y, this.x, this.J);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kO kO2) {
        dx_1 dx_12 = kO2.getGuiScreen();
        if (dx_12.a(A5.O) || dx_12.a(A5.cn) || dx_12.a(A5.B)) {
            this.U();
            super.d(false);
        }
    }

    @Override
    public void a(kx_0 kx_02) {
        if (!this.H.u().booleanValue() || this.E.isEmpty()) {
            return;
        }
        ds_2.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d3 = this.w.m();
        double d4 = this.w.n();
        double d5 = this.w.j();
        boolean bl = true;
        for (oC oC2 : this.E) {
            Color color = Color.RED;
            if (bl) {
                color = Color.YELLOW;
                bl = false;
            }
            ac_1.a(oC2.b - 0.1, oC2.a, oC2.d - 0.1, 0.2, 0.0, 0.2, 1.0, Color.BLACK, color, d3, d4, d5);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        ds_2.M().b(1.0);
    }

    @Override
    public void a(ky_0 ky_02) {
        try {
            if (this.u) {
                return;
            }
            fn_0 fn_02 = ky_02.getPacket();
            if (this.a(fn_02)) {
                return;
            }
            if (fn_02.a(A5.bN)) {
                if (this.T() && this.I % 5 == 0) {
                    eJ eJ2 = ds_2.k();
                    boolean bl = this.I % 2 == 0;
                    double d3 = 0.2 * (double)(bl ? -1 : 1) * Math.cos(Math.toRadians(eJ2.U()));
                    double d4 = 0.2 * (double)(bl ? -1 : 1) * Math.sin(Math.toRadians(eJ2.U()));
                    this.E.add(new oC(eJ2.z() + d3, eJ2.l(), eJ2.g() + d4));
                }
            } else if (this.K.v().equals(this.L)) {
                return;
            }
            ++this.I;
            this.a(String.valueOf(this.I));
            if (this.x.u().booleanValue() && this.J.a() > 0.0 && (double)this.I >= this.J.a()) {
                this.D = true;
                this.V();
                this.I = 0;
                this.E.clear();
            }
            this.F.add(new ck_0(fn_02, true, ky_02.getNetworkManager(), null));
            ky_02.a(true);
            this.S();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void a(kF kF2) {
        try {
            fn_0 fn_02 = kF2.getPacket();
            if (fn_02.a(A5.U)) {
                this.d(false);
            }
            if (this.A.v().equals(this.z)) {
                return;
            }
            if (this.u) {
                return;
            }
            ++this.I;
            this.a(String.valueOf(this.I));
            if (this.x.u().booleanValue() && this.J.a() > 0.0 && (double)this.I >= this.J.a()) {
                this.D = true;
                this.V();
                this.I = 0;
                this.E.clear();
            }
            this.F.add(new ck_0(fn_02, false, kF2.getNetworkManager(), null));
            kF2.a(true);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    private void S() {
        if (this.D) {
            this.u = true;
            fS fS2 = ds_2.k().bp();
            while (!this.F.isEmpty()) {
                ck_0 ck_02 = this.F.poll();
                ck_02.a(fS2);
            }
            this.u = false;
            this.D = false;
            if (this.B) {
                super.d(false);
                this.B = false;
            }
        }
    }

    @Override
    public void d(boolean bl) {
        if (bl) {
            super.d(true);
            return;
        }
        this.D = true;
        this.B = true;
    }

    private boolean T() {
        eJ eJ2 = ds_2.k();
        return eJ2.k() != 0.0 || eJ2.u() != 0.0;
    }

    private void V() {
        eJ eJ2 = ds_2.k();
        if (eJ2.d() || this.v.d() || !this.y.u().booleanValue()) {
            return;
        }
        this.v.a(eJ2.z(), cb_0.h ? eJ2.l() : eJ2.l() - 1.5, eJ2.g(), eJ2.U(), eJ2.K());
        this.v.r(eJ2.aP());
    }

    @Override
    public void s() {
        this.U();
        eJ eJ2 = ds_2.k();
        if (this.y.u().booleanValue()) {
            this.v = e2.b(ds_2.t(), ds_2.k().aV());
            this.v.a(eJ2, true);
            this.V();
            this.v.r(eJ2.aP());
            ds_2.t().a(-420, this.v);
        }
    }

    @Override
    public void J() {
        if (ds_2.k().e() || ds_2.t().e()) {
            this.E.clear();
            this.v = null;
            this.I = 0;
        }
        if (this.v != null && ds_2.t().a(-420).d()) {
            ds_2.t().a(this.v);
        }
        this.v = null;
    }

    private void U() {
        this.I = 0;
        this.F.clear();
        this.E.clear();
    }

    private boolean a(fn_0 fn_02) {
        return fn_02.a().getClass().toString().contains("play.server") || fn_02.a().toString().contains("SPacket");
    }
}

