/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import rip.vape.friend.Friend;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class z3
extends Module {
    public final DY ag = DY.a(this);
    public final DF am = DF.a(this, "Swing range", "#.#", "", 0.0, 4.0, 6.0);
    public final DF W = DF.a(this, "Attack range", "#.#", "", 0.0, 3.5, 6.0);
    public final DF ae = DF.a((Object)this, "Switch Delay", "#", "", 50.0, 400.0, 1000.0, 50.0);
    public final BooleanValue E = BooleanValue.createValue(this, "Require mouse down", false);
    public final BooleanValue O = BooleanValue.createValue(this, "Disable on Death", false);
    public final BooleanValue J = BooleanValue.createValue(this, "Show target", false);
    public final BooleanValue D = BooleanValue.createValue((Object)this, "Limit to items", false, "Killaura functions only while holding selected items");
    public final BooleanValue z = BooleanValue.createValue((Object)this, "AutoBlock", false, "Automatically blocks").d(true);
    public final BooleanValue aa = BooleanValue.createValue((Object)this, "GUI Check", true, "Does not attack when inside of a GUI.");
    public final BooleanValue M = BooleanValue.createValue((Object)this, "Legit Aura", false, "Use Legit Aura instead of Blatant Aura when blatant is enabled.").d(true);
    public final BooleanValue H = BooleanValue.createValue((Object)this, "No Swing", false, "Prevents you from swinging server side.").d(true);
    public final BooleanValue U = BooleanValue.createValue((Object)this, "Perfect Swing", false, "Attacks perfectly on 1.9+ combat servers.\n(1.12.2 Only)");
    public final dy_0 af = dy_0.createValue(this, "Attacks per Second", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    public final DF ac = DF.a((Object)this, "Max angle", "#", "", 1.0, 90.0, 360.0, 5.0);
    public final DF ad = DF.a((Object)this, "Max targets", "#", "", 1.0, 1.0, 6.0, 1.0);
    private final p4 u = new p4("Switch", new yx_0(this, "Switch"));
    private final p4 x = new p4("Normal", new ye_0(this, "Normal"));
    private final DX V = DX.a((Object)this, "Blatant Mode", "Killaura mode when blatant is enabled.\nSwitch - NCP switch killaura\nNormal - Vanilla Killaura (attacks multiple entities at once)", (pb_0)this.u, this.u, this.x);
    private final pb_0 B = new pb_0("Distance");
    public final pb_0 ai = new pb_0("Yaw");
    public final pb_0 P = new pb_0("Armor");
    public final pb_0 ao = new pb_0("Threat");
    public final pb_0 Z = new pb_0("Health");
    private final DD A = DD.a((Object)this, "killaura-alloweditems", "Allowed Items", DD.m, Collections.emptyList());
    private final Random y = new Random();
    private final Random F = new Random();
    private final Random aj = new Random();
    private final Random ah = new Random();
    private final Color C = new Color(255, 0, 0, 100);
    private final Color S = new Color(255, 112, 112, 100);
    public pb_0 L = new pb_0("Lock View");
    public pb_0 I = new pb_0("Anti-Cheat");
    public pb_0 G = new pb_0("Silent");
    public pb_0 v = new pb_0("None");
    public DX T = DX.a((Object)this, "Aim Mode", "Aim Mode when blatant is enabled.\nSilent - Aims silently for you (server side)\nAnti-Cheat - Silent aim but bypasses\nLock View - Locks your view client side to server side angles\nNone - Does not manipulate your view angles", this.G, this.G, this.I, this.L, this.v);
    public AO K = new AO();
    public AO Q = new AO();
    public List<ej_0> R = new CopyOnWriteArrayList<ej_0>();
    public int Y;
    public DX ab = DX.a((Object)this, "Target Mode", "How Killaura should prioritize targets.\nArmor/Threat will default to Distance for non player targets.", this.B, this.B, this.ai, this.P, this.ao, this.Z);
    private long N;
    private int w;
    private boolean ak;
    private int al;
    private boolean X = false;
    private static cy_0[] an;

    public z3() {
        super("Killaura", -2420426, CQ.f, "Attack players around you\nwithout aiming at them.");
        ((rz_0)this.V.getDefaultValue()).a(new uq(this));
        this.V.a(this.u, this.H, this.z, this.ae);
        this.a(this.ag, this.af, this.ae, this.am, this.W, this.ac, this.ad, this.V, this.ab, this.T);
        if (manthe.V.c() <= 15) {
            this.a(this.z);
        } else {
            this.a(this.U);
        }
        this.a(this.O, this.E, this.aa, this.J, this.M, this.H, this.D.a(new BasicValue[]{this.A}), this.A);
        ((sV)this.am.getDefaultValue()).a(new cs(this));
    }

    public ej_0 S() {
        if (this.R.isEmpty() || this.R.size() - 1 < this.Y) {
            return null;
        }
        return this.R.get(this.Y);
    }

    @Override
    public void s() {
        super.s();
        this.R.clear();
    }

    @Override
    public void J() {
        super.J();
        this.R.clear();
    }

    private boolean V() {
        return this.M.x() != false || ds_2.k().d() && ds_2.k().P();
    }

    @Override
    public void a(kO kO2) {
        ((Module)((p4)this.V.v()).f()).a(kO2);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        boolean bl;
        Object object;
        if (this.am.a() < this.W.a()) {
            this.am.b(this.W.a() + 0.1);
        }
        if (this.O.u().booleanValue()) {
            if (ds_2.k().j() || ds_2.k().aD() <= 0.0f) {
                this.z();
                return;
            }
            dm_2 dm_22 = ds_2.i();
            if (dm_22.d()) {
                object = dm_22.f();
                if (!this.X && object != null && (((String)object).toLowerCase().contains("died") || ((String)object).toLowerCase().contains("dead"))) {
                    this.X = true;
                    this.z();
                    return;
                }
                if (object == null || ((String)object).equals("")) {
                    this.X = false;
                }
            }
        }
        if (!this.V() && a.ib()) {
            return;
        }
        if (this.aa.u().booleanValue() && ds_2.x().d()) {
            return;
        }
        if (ds_2.t().e()) {
            return;
        }
        if (this.E.u().booleanValue() && !VapeSettings.f()) {
            this.R.clear();
            return;
        }
        boolean bl2 = manthe.V.c() < 23;
        object = ds_2.k();
        boolean bl3 = manthe.V.c() > 15 && this.U.u().booleanValue() ? ((eC)object).s(0.5f) == 1.0f : (bl = this.Q.a(this.U()));
        if (!bl) {
            return;
        }
        this.T();
        for (ej_0 ej_02 : this.R) {
            double d3;
            if (!this.a(ej_02) || !((d3 = (double)((ex_0)object).a(ej_02)) <= this.am.a())) continue;
            if (bl2) {
                ((ej_0)object).aO();
            }
            if (d3 <= this.W.a()) {
                ds_2.K().a((eC)object, ej_02);
                if (bl2) continue;
                ((ej_0)object).aO();
                continue;
            }
            if (bl2) continue;
            ((ej_0)object).aO();
            ((eC)object).a4();
        }
        this.Q.d();
    }

    @Override
    public void a(kx_0 kx_02) {
        this.a(this.V.v().H());
        if (this.J.u().booleanValue() && !this.R.isEmpty()) {
            eJ eJ2 = ds_2.k();
            for (ej_0 ej_02 : this.R) {
                ej_0 ej_03 = this.S();
                if ((double)eJ2.a(ej_02) <= this.W.a() && (!a.ib() || ej_03 != null && ej_03.equals(ej_02))) {
                    ac_1.a(ej_02, 0.0, null, this.C, kx_02.getTicks());
                    continue;
                }
                ac_1.a(ej_02, 0.0, null, this.S, kx_02.getTicks());
            }
        }
    }

    @Override
    public void a(km_0 km_02) {
        if (this.V()) {
            return;
        }
        ((Module)((p4)this.V.v()).f()).a(km_02);
    }

    @Override
    public void a(ky_0 ky_02) {
        if (this.V()) {
            return;
        }
        ((Module)((p4)this.V.v()).f()).a(ky_02);
    }

    public long U() {
        int n6;
        int n10;
        int n11 = this.af.v()[0].intValue();
        int n12 = n11 - (n10 = this.af.v()[1].intValue());
        int n13 = n6 = n12 <= 0 ? n10 : this.y.nextInt(n12) + n10 + 1;
        if (n6 == 0) {
            n6 = 1;
        }
        if (!this.ak) {
            this.N = 1000 / n6;
            if (this.ah.nextInt(4) == 1) {
                this.ak = true;
                this.al = 1 + this.ah.nextInt(5);
            } else if (this.ah.nextInt(10) != 1 && this.ah.nextInt(10) == 1) {
                this.ak = true;
                this.al = 5 + this.ah.nextInt(10);
            }
        }
        if (this.ak) {
            ++this.w;
            if (this.w >= this.al) {
                this.w = 0;
                this.ak = false;
            }
        }
        boolean bl = true;
        if (this.F.nextInt(48) % (!bl ? 4 : 10) == 0 && !this.ak) {
            n10 = !bl ? 50 : 25;
            n11 = !bl ? 120 : 70;
            n12 = n11 - n10;
            this.N += (long)(this.aj.nextInt(n12) + n10);
        }
        return this.N;
    }

    public void T() {
        this.R.clear();
        ArrayList arrayList = new ArrayList(ds_2.t().k());
        for (Object e10 : arrayList) {
            ej_0 ej_02;
            ex_0 ex_02 = new ex_0(e10);
            if (VapeSettings.h && ex_02.a(A5.a8) || !ex_02.a(A5.cF) || !this.a(ej_02 = new ej_0(e10))) continue;
            this.R.add(ej_02);
        }
        if (this.ab.v() == this.ai) {
            this.R.sort(new wg_0(this, null));
        } else if (this.ab.v() == this.B) {
            this.R.sort(new np_0(this, null));
        } else if (this.ab.v() == this.ao) {
            this.R.sort(new de_0(this, null));
        } else if (this.ab.v() == this.P) {
            this.R.sort(new ub(this, null));
        } else if (this.ab.v() == this.Z) {
            this.R.sort(new BZ(this, null));
        }
        ArrayList<ej_0> arrayList2 = new ArrayList<ej_0>(this.R);
        this.R.clear();
        for (int i = 0; i < this.ad.a().intValue() && i < arrayList2.size(); ++i) {
            this.R.add((ej_0)arrayList2.get(i));
        }
    }

    private boolean b(ej_0 ej_02) {
        if (this.D.u().booleanValue()) {
            fG fG2 = ds_2.k().a_();
            if (fG2.e()) {
                return false;
            }
            fk_0 fk_02 = fG2.k();
            if (fk_02.e()) {
                return false;
            }
            return this.A.a(fG2, true) && this.ag.a(ej_02);
        }
        return this.ag.a(ej_02);
    }

    public boolean a(ej_0 ej_02) {
        if (ej_02.e()) {
            return false;
        }
        if (ej_02.equals(ds_2.k())) {
            return false;
        }
        if (!this.b(ej_02)) {
            return false;
        }
        if (ej_02.aD() <= 0.0f || ej_02.j()) {
            return false;
        }
        if ((double)ds_2.k().a(ej_02) >= this.am.a()) {
            return false;
        }
        if (pf_0.b(ds_2.k(), ej_02) > this.ac.a().intValue() / 2) {
            return false;
        }
        Friend ab_02 = on.p.N().b(ej_02.S());
        if (ab_02 != null && !ab_02.getTarget()) {
            return false;
        }
        return !ej_02.equals(ds_2.k().m());
    }

    private float[] a(double d3, double d4, double d5) {
        eJ eJ2 = ds_2.k();
        double d6 = d3 - eJ2.z();
        double d7 = d4 - eJ2.g();
        double d8 = d5 - eJ2.s().l() - 1.2;
        double d10 = manthe.Y.e(d6 * d6 + d7 * d7);
        float f10 = (float)(Math.atan2(d7, d6) * 180.0 / Math.PI) - 90.0f;
        float f11 = (float)(-(Math.atan2(d8, d10) * 180.0 / Math.PI));
        return new float[]{f10, f11};
    }

    public float[] c(ej_0 ej_02) {
        double d3 = ej_02.z();
        double d4 = ej_02.g();
        double d5 = ej_02.s().l() + (double)(ej_02.am() / 2.0f);
        return this.a(d3, d4, d5);
    }

    public float a(double d3, double d4, float f10) {
        eJ eJ2 = ds_2.k();
        double d5 = d3 - eJ2.z();
        double d6 = d4 - eJ2.g();
        double d7 = d6 < 0.0 && d5 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d6 / d5)) : (d6 < 0.0 && d5 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d6 / d5)) : Math.toDegrees(-Math.atan(d5 / d6)));
        return manthe.Y.a(-(f10 - (float)d7));
    }

    static DX a(z3 z32) {
        return z32.V;
    }

    public static void a(cy_0[] cy_0Array) {
        an = cy_0Array;
    }

    public static cy_0[] W() {
        return an;
    }

    static {
        if (z3.W() != null) {
            z3.a(new cy_0[3]);
        }
    }
}

