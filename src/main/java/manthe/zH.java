/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class zH
extends Module {
    private final int E = 281;
    private final int aa = 282;
    private final int L = 39;
    private final int U = 40;
    private final int K = 397;
    private final BooleanValue H = BooleanValue.createValue((Object)this, "Soup", false, "Uses soups to heal.");
    private final BooleanValue C = BooleanValue.createValue((Object)this, "Replace", false, "Refills empty slots with healing items.");
    private final BooleanValue J = BooleanValue.createValue((Object)this, "Inventory Only", false, "Only refills/crafts when your inventory is open.");
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Potions", false, "Uses splash healing potions to heal.").d(true);
    private final BooleanValue W = BooleanValue.createValue((Object)this, "Regen", true, "Uses regeneration potions when available.");
    private final BooleanValue F = BooleanValue.createValue((Object)this, "Speed", false, "Uses speed potions when available.");
    private final BooleanValue S = BooleanValue.createValue((Object)this, "Resistance", false, "Uses resistance potions when available.");
    private final BooleanValue X = BooleanValue.createValue((Object)this, "Use Custom Items", false, "Uses other custom healing items.\nUses the same delay as soup/potion.");
    private final DD w = DD.a((Object)this, "autoheal-customitems", "Healing Items", DD.m, new mD("397:3"));
    private final pb_0 v = new pb_0("Throw");
    private final pb_0 B = new pb_0("Stack");
    private final pb_0 P = new pb_0("None");
    private final DX y = DX.a((Object)this, "Bowl Mode", this.B, this.B, this.v, this.P);
    private final pb_0 T = new pb_0("Silent");
    private final pb_0 Q = new pb_0("Legit");
    private final DX R = DX.a((Object)this, "Mode", this.T, this.T, this.Q);
    private final dy_0 I = dy_0.createValue((Object)this, "Swap Delay", "#", "ms", 0.0, 75.0, 125.0, 200.0, 5.0, "The delay between using the item and swapping back.");
    private final DF Y = DF.a(this, "Delay", "#", "ms", 50.0, 500.0, 1000.0, 50.0, "The delay to wait before healing again.");
    private final DF ab = DF.a((Object)this, "Health", "#", "HP", 1.0, 17.0, 20.0, 1.0);
    private final DF O = DF.a(this, "Slot", "#", "", 1.0, 6.0, 9.0, 1.0, "The slot to fill a potion for autopot.");
    private final AO N = new AO();
    private boolean D;
    private boolean Z;
    private int M;
    private int u;
    private boolean z;
    private int A = -1;
    private final Queue<n3> V = new ConcurrentLinkedQueue<n3>();
    private boolean G;

    public zH() {
        super("AutoHeal", 0, 16711819, CQ.f, "Automatically heals for you when health is under threshold.");
        this.T.a(true);
        this.R.a(this.T, this.x, this.y);
        this.R.a(this.Q, this.I);
        this.X.a(new BasicValue[]{this.w});
        this.H.a(new BasicValue[]{this.y});
        this.x.d(true);
        this.x.a(this.W, this.F, this.S, this.O);
        this.a(this.R, this.H, this.y, this.x, this.W, this.F, this.S, this.O, this.X, this.w, this.C, this.ab, this.Y, this.I);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        boolean bl;
        Object object;
        if (!kt_02.getPlayer().a(A5.u) || on.p.t().c() || ds_2.x().d()) {
            return;
        }
        boolean bl2 = false;
        if (this.R.v() == this.Q) {
            if (this.G) {
                if (!ds_2.x().e()) {
                    ds_2.k().aX();
                }
                this.G = false;
            } else {
                while (!this.V.isEmpty()) {
                    object = this.V.poll();
                    ((n3)object).a();
                    bl2 = true;
                }
            }
        }
        if (this.D || this.Z) {
            return;
        }
        object = ds_2.k();
        int n6 = this.ab.a().intValue();
        boolean bl3 = bl = ((ej_0)object).aD() / Math.max(((ej_0)object).at(), 1.0f) <= (float)n6 / 20.0f && this.N.a(this.Y.a().intValue());
        if (bl) {
            for (int i = 36; i < 45; ++i) {
                fG fG2;
                if (!((eC)object).aY().a(i).h() || !this.b(fG2 = ((eC)object).aY().a(i).f())) continue;
                if (this.R.v() == this.Q) {
                    this.D = true;
                    this.M = i - 36;
                    this.u = ((eC)object).aU().i();
                    this.a(bl2 ? 51L : 0L, false);
                } else {
                    this.M = -1;
                    this.u = -1;
                    ((eJ)object).bp().a(f5.a(i - 36));
                    ds_2.K().a((eC)object, ((ex_0)object).i(), ((eC)object).aY().a(i).f());
                    ((eJ)object).bp().a(f5.a(((eC)object).aU().i()));
                }
                this.N.d();
                return;
            }
        }
        this.M = -1;
    }

    @Override
    public void q() {
        if (!this.D) {
            return;
        }
        try {
            boolean bl;
            int n6 = ds_2.s().s().i();
            ds_2.k().aU().a(this.M);
            boolean bl2 = bl = ds_2.k().bd() && cb_0.a(n6);
            if (bl) {
                ei_0.a(n6, false);
                ei_0.a(n6);
                Thread.sleep(51L);
            }
            ei_0.a(n6, true);
            ei_0.a(n6);
            Thread.sleep(51L);
            ei_0.a(n6, false);
            long l6 = Math.max((long)this.I.t() + (long)(bl ? -35 : 0), 0L);
            Thread.sleep(l6);
            ds_2.k().aU().a(this.u);
            if (cb_0.a(n6)) {
                ei_0.a(n6, true);
                ei_0.a(n6);
            }
        }
        catch (Exception exception) {
            this.D = false;
            this.M = -1;
            this.u = -1;
        }
        this.M = -1;
        this.u = -1;
        this.D = false;
    }

    @Override
    public void a(kt_0 kt_02) {
        if (!kt_02.getPlayer().a(A5.u) || on.p.t().c()) {
            return;
        }
        this.S();
    }

    @Override
    public void a(km_0 km_02) {
        eJ eJ2 = ds_2.k();
        if (!this.x.x().booleanValue()) {
            return;
        }
        if (km_02.c()) {
            int n6 = this.ab.a().intValue();
            boolean bl = (eJ2.aD() <= (float)n6 && (this.W.u() == false || !eJ2.a(fX.f())) || this.F.u() != false && !eJ2.a(fX.q()) || this.S.u() != false && !eJ2.a(fX.l())) && eJ2.v() && eJ2.J();
            int n10 = this.T();
            if (n10 != -1 && bl && this.N.a(this.Y.a().intValue())) {
                if (this.A == -1) {
                    this.z = true;
                    this.A = n10;
                    km_0.setRotationPitch(88.99f);
                }
            } else {
                this.z = false;
            }
        } else if (this.z && this.A != -1 && this.N.a(this.Y.a().intValue())) {
            fG fG2 = eJ2.aY().a(36 + this.A).f();
            if (fG2.d()) {
                int n11 = eJ2.aU().i();
                eJ2.aU().a(this.A);
                eJ2.bp().a(f5.a(this.A));
                ds_2.K().a(eJ2, eJ2.i(), fG2);
                eJ2.aU().a(n11);
                eJ2.bp().a(f5.a(n11));
            }
            this.N.d();
            this.z = false;
            this.A = -1;
        }
    }

    private boolean b(fG fG2) {
        if (fG2.e() || fG2.k().e()) {
            return false;
        }
        fk_0 fk_02 = fG2.k();
        if (this.H.u().booleanValue() && fk_02.h() == this.aa) {
            return true;
        }
        return this.X.u() != false && this.w.a(fG2);
    }

    private int T() {
        eJ eJ2 = ds_2.k();
        int n6 = -1;
        for (int i = 0; i < 45; ++i) {
            fG fG2;
            if (!eJ2.aY().a(i).h() || !this.a(fG2 = eJ2.aY().a(i).f())) continue;
            if (i < 8) {
                n6 = i;
                break;
            }
            if (!this.C.u().booleanValue()) break;
            this.a(i, 36 + this.O.a().intValue() - 1);
            n6 = this.O.a().intValue() - 1;
            break;
        }
        return n6;
    }

    private void a(int n6, int n10, int n11, int n12) {
        this.V.add(new n3(n6, n10, n11, n12));
    }

    private void a(int n6, int n10) {
        n10 -= 36;
        if (this.R.v() == this.Q) {
            this.a(ds_2.k().aY().g(), n6, n10, 2);
        } else {
            ds_2.K().a(ds_2.k().aY().g(), n6, n10, 2, ds_2.k());
        }
    }

    private boolean a(fG fG2) {
        if (fG2.e()) {
            return false;
        }
        if (fG2.k().a(A5.dx) && fh_0.d(fG2)) {
            eJ eJ2 = ds_2.k();
            fh_0 fh_02 = new fh_0(fG2.k().a());
            if (fh_02.c(fG2) != null) {
                for (Object e10 : fh_02.c(fG2)) {
                    boolean bl;
                    fE fE2 = new fE(e10);
                    boolean bl2 = bl = (double)eJ2.aD() <= this.ab.a();
                    if (fE2.g() == fX.m().g() && bl) {
                        return true;
                    }
                    if (fE2.g() == fX.q().g() && this.F.u().booleanValue() && !eJ2.a(fX.q())) {
                        return true;
                    }
                    if (fE2.g() != fX.f().g() || !this.W.u().booleanValue() || !bl || eJ2.a(fX.f())) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private void S() {
        cy_0 cy_02;
        int n6;
        if (this.J.u().booleanValue() && !ds_2.x().a(A5.ag)) {
            return;
        }
        if (this.D) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (!this.Z && this.H.x().booleanValue() && this.y.v() != this.P) {
            for (n6 = 9; n6 < 45; ++n6) {
                boolean bl;
                fG fG2;
                boolean bl2;
                boolean bl3 = bl2 = n6 >= 36;
                if (!eJ2.aY().a(n6).h() || !(cy_02 = (fG2 = eJ2.aY().a(n6).f()).k()).d() || ((fk_0)cy_02).h() != 281) continue;
                if (this.y.v() == this.v) {
                    ds_2.K().a(0, n6, 1, 4, ds_2.k());
                    return;
                }
                if (this.y.v() != this.B || n6 == 17) continue;
                boolean bl4 = bl = !eJ2.aY().a(17).h();
                if (bl || eJ2.aY().a(17).f().k().h() != 281) {
                    if (bl2) {
                        this.a(17, n6);
                    } else {
                        ds_2.K().a(0, n6, 0, 0, ds_2.k());
                        ds_2.K().a(0, 17, 0, 0, ds_2.k());
                        ds_2.K().a(0, n6, 0, 0, ds_2.k());
                    }
                } else if (eJ2.aY().a(17).f().k().h() == 281) {
                    if (bl2) {
                        ds_2.K().a(0, n6, 0, 1, ds_2.k());
                    } else {
                        ds_2.K().a(0, n6, 0, 0, ds_2.k());
                        ds_2.K().a(0, 17, 0, 0, ds_2.k());
                    }
                }
                return;
            }
        }
        if (this.C.u().booleanValue()) {
            for (n6 = 9; n6 < 36; ++n6) {
                fG fG3;
                if (!eJ2.aY().a(n6).h() || !this.b(fG3 = eJ2.aY().a(n6).f())) continue;
                for (int i = 36; i < 45; ++i) {
                    cy_02 = eJ2.aY().a(i).f();
                    if (!((fG)cy_02).e() && !((fG)cy_02).k().e()) continue;
                    if (!this.Z) {
                        int n10 = ds_2.s().t().i();
                        ei_0.a(n10, true);
                        ei_0.a(n10);
                        ei_0.a(n10, false);
                        this.Z = true;
                        return;
                    }
                    this.G = false;
                    this.a(n6, i);
                    return;
                }
            }
            if (this.Z) {
                this.Z = false;
                this.G = true;
            }
        }
    }
}

