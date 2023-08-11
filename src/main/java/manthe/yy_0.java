/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import rip.vape.module.Module;

/*
 * Renamed from manthe.yy
 */
public class yy_0
extends Module {
    private final BooleanValue C = BooleanValue.createValue((Object)this, "Recast Ground", false, "Automatically recasts if the hook hits the ground.");
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Recast Caught", false, "Automatically recasts if the hook catches onto an Entity.");
    private final BooleanValue y = BooleanValue.createValue((Object)this, "Anti AFK", false, "Strafes and moves your view slightly\nto prevent you from being kicked.");
    private final AO A = new AO();
    private boolean z;
    private Object v;
    private float w;
    private float u;
    private static boolean B;

    public yy_0() {
        super("AutoFish", 12452021, CQ.a, "Automatically fishes for you.");
        this.a(this.C, this.x, this.y);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void s() {
        eJ eJ2 = ds_2.k();
        if (eJ2.e()) {
            return;
        }
        this.w = eJ2.U();
        this.u = eJ2.K();
    }

    @Override
    public void J() {
        if (this.y.u().booleanValue()) {
            en_0 en_02 = ds_2.s();
            ei_0.a(en_02.g().i(), false);
            ei_0.a(en_02.g().i());
            ei_0.a(en_02.n().i(), false);
            ei_0.a(en_02.n().i());
        }
    }

    @Override
    public void a(kF kF2) {
        em_0 em_02;
        fG fG2;
        cy_0 cy_02;
        cy_0 cy_03;
        if (kF2.getPacket().a(A5.cQ) && ((eC)(cy_03 = ds_2.k())).a_().d() && ((eC)cy_03).a_().k().a(A5.cX) && ((eC)cy_03).aW().d() && ((f2)(cy_02 = new f2(kF2.getPacketInstance()))).h() == ((eC)cy_03).aW().q()) {
            int n6 = ((f2)cy_02).j();
            int n10 = ((f2)cy_02).g();
            int n11 = ((f2)cy_02).i();
            if (n6 == 0 && n10 < 0 && n11 == 0 && this.z) {
                fG2 = ((eC)cy_03).a_();
                if (fG2.d()) {
                    ds_2.K().a((eC)cy_03, ((ex_0)cy_03).i(), fG2);
                }
                this.z = false;
                this.A.d();
            }
        }
        if (kF2.getPacket().a(A5.R) && !kF2.getPacket().a(A5.bk)) {
            double d3;
            cy_03 = ds_2.k();
            cy_02 = new fJ(kF2.getPacketInstance());
            ex_0 ex_02 = ((fJ)cy_02).a(ds_2.t());
            if (ex_02.d() && ex_02.equals(((eC)cy_03).aW()) && (d3 = (double)ex_02.G() / 32.0) < ex_02.l() - 0.141 && this.z) {
                fG2 = ((eC)cy_03).a_();
                if (fG2.d()) {
                    ds_2.K().a((eC)cy_03, ((ex_0)cy_03).i(), fG2);
                }
                this.z = false;
                this.A.d();
            }
        }
        if (kF2.getPacket().a(A5.ct) && ((fR)(cy_03 = new fR(kF2.getPacketInstance()))).g().equals("wake") && ((eC)(cy_02 = ds_2.k())).aW().d() && !this.z && (em_02 = ((eC)cy_02).aW()).a(((fR)cy_03).i(), ((fR)cy_03).j(), ((fR)cy_03).h()) < 1.0) {
            this.z = true;
        }
    }

    @Override
    public void a(kn_0 kn_02) {
        if (this.y.u().booleanValue() && kn_02.getEntity().a(A5.u)) {
            en_0 en_02 = ds_2.s();
            eJ eJ2 = new eJ(kn_02.getEntity().a());
            if (eJ2.aW() != null && eJ2.a_().d() && eJ2.a_().k().a(A5.cX)) {
                int n6 = eJ2.ad() % 20;
                if (n6 <= 9) {
                    ei_0.a(en_02.g().i(), true);
                    ei_0.a(en_02.g().i());
                    ei_0.a(en_02.n().i(), false);
                    ei_0.a(en_02.n().i());
                } else {
                    ei_0.a(en_02.n().i(), true);
                    ei_0.a(en_02.n().i());
                    ei_0.a(en_02.g().i(), false);
                    ei_0.a(en_02.g().i());
                }
            }
        }
    }

    @Override
    public void a(km_0 km_02) {
        if (this.y.u().booleanValue()) {
            if (this.v == null || ds_2.t().a() != this.v) {
                this.v = ds_2.t().a();
                if (ds_2.t().a() != this.v) {
                    this.z();
                    return;
                }
            }
            eJ eJ2 = ds_2.k();
            if (km_02.c() && eJ2.aW().d() && eJ2.ad() % 3 == 0) {
                float f10 = ds_2.s().r();
                boolean bl = eJ2.ad() % 2 == 0;
                float f11 = (float)(3.0 * Math.random() * (double)(bl ? -1 : 1));
                float f12 = (float)(3.0 * Math.random() * (double)(bl ? -1 : 1));
                float f13 = f10 * 0.6f + 0.2f;
                float f14 = f13 * f13 * f13 * 8.0f;
                float f15 = f11 * f14;
                float f16 = f12 * f14;
                km_0.setRotationYaw((float)((double)this.w + (double)f15 * 0.15));
                km_0.setRotationPitch(Y.a((float)((double)this.u - (double)f16 * 0.15), -90.0f, 90.0f));
            }
        }
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        cy_0 cy_02;
        eJ eJ2 = ds_2.k();
        if (this.A.a(1000L) && eJ2.aW().e() && eJ2.a_().d() && eJ2.a_().k().a(A5.cX)) {
            cy_02 = eJ2.a_();
            if (cy_02.d()) {
                ds_2.K().a(eJ2, eJ2.i(), (fG)cy_02);
            }
            this.z = false;
            this.A.d();
        }
        if (eJ2.aW().d()) {
            boolean bl;
            cy_02 = eJ2.aW();
            boolean bl2 = bl = ((ex_0)cy_02).k() == 0.0 && ((ex_0)cy_02).D() == 0.0 && ((ex_0)cy_02).u() == 0.0;
            if (((em_0)cy_02).au().d() && this.x.u().booleanValue() || bl && this.C.u().booleanValue()) {
                fG fG2 = eJ2.a_();
                if (fG2.d()) {
                    ds_2.K().a(eJ2, eJ2.i(), fG2);
                }
                this.z = false;
                this.A.d();
            }
        }
    }

    public static void e(boolean bl) {
        B = bl;
    }

    public static boolean S() {
        return B;
    }

    public static boolean T() {
        boolean bl = yy_0.S();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!yy_0.S()) {
            yy_0.e(true);
        }
    }
}

