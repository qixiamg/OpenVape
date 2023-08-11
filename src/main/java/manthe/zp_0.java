/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

/*
 * Renamed from manthe.zp
 */
public class zp_0
extends Module {
    private DF y = DF.a((Object)this, "Angle Limit", "#", "", 1.0, 45.0, 180.0, 5.0);
    public DF w = DF.a((Object)this, "Angle Speed", "#", "", 10.0, 15.0, 50.0, 1.0);
    public BooleanValue u = BooleanValue.createValue((Object)this, "Stop Movement", false, "Forces you to stand when attacking fireball.");
    public BooleanValue B = BooleanValue.createValue((Object)this, "Move on Finish", false, "Will repress your movement keys after attacking.");
    private BooleanValue A = BooleanValue.createValue((Object)this, "Silent", false, "Silently attacks nearby fireballs.\nWARNING: DOES NOT USE AIM SMOOTHING");
    private AO z = new AO();
    private static boolean v;
    private eB x;

    public zp_0() {
        super("AntiFireball", 0xCD4C4C, CQ.a, "Aims and swings at a fireball to reflect it.\nBy default will only attack fireballs heading towards you.");
        this.A.d(true);
        this.u.a(new BasicValue[]{this.B});
        this.a(this.y, this.w, this.u, this.B, this.A);
    }

    @Override
    public void a(km_0 km_02) {
        if (!this.A.x().booleanValue()) {
            return;
        }
        eJ eJ2 = ds_2.k();
        if (eJ2.e()) {
            return;
        }
        if (km_02.c()) {
            if (this.x == null && this.z.a(500L)) {
                for (Object e10 : ds_2.t().k()) {
                    eB eB2;
                    if (!e10.getClass().isAssignableFrom(A5.dG) || !((double)eJ2.a(eB2 = new eB(e10)) <= 4.5)) continue;
                    float[] fArray = this.a(eB2);
                    float f10 = Math.abs(Y.a(-(eJ2.U() - fArray[0])));
                    float f11 = eJ2.K() - fArray[1];
                    if (!((double)f10 <= this.y.a()) || !((double)f11 <= this.y.a() / 2.0)) continue;
                    km_0.setRotationYaw(eJ2.U() + Y.a(-(eJ2.U() - fArray[0])));
                    km_0.setRotationPitch(fArray[1]);
                    this.x = eB2;
                }
            }
        } else if (this.x != null) {
            boolean bl;
            boolean bl2 = bl = V.c() < 23;
            if (bl) {
                eJ2.aO();
            }
            ds_2.K().a(eJ2, this.x);
            if (!bl) {
                eJ2.aO();
                eJ2.a4();
            }
            this.z.d();
            this.x = null;
        }
    }

    public float[] a(ex_0 ex_02) {
        eJ eJ2 = ds_2.k();
        double d3 = ex_02.z() + ex_02.k() * 1.805 - eJ2.z();
        double d4 = ex_02.g() + ex_02.u() * 1.805 - eJ2.g();
        double d5 = ex_02.s().l() + ex_02.D() * 1.805 + (double)(ex_02.am() / 3.0f) - eJ2.s().l() - 1.2;
        float f10 = d4 < 0.0 && d3 < 0.0 ? (float)(90.0 + Math.toDegrees(Math.atan(d4 / d3))) : (d4 < 0.0 && d3 > 0.0 ? (float)(-90.0 + Math.toDegrees(Math.atan(d4 / d3))) : (float)Math.toDegrees(-Math.atan(d3 / d4)));
        double d6 = Y.e(d3 * d3 + d4 * d4);
        float f11 = (float)(-(Math.atan2(d5, d6) * 180.0 / Math.PI));
        return new float[]{f10, f11};
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        eJ eJ2 = ds_2.k();
        if (eJ2.e() || this.A.x().booleanValue()) {
            return;
        }
        if (this.x == null && this.z.a(500L)) {
            for (Object e10 : ds_2.t().k()) {
                eB eB2;
                if (!e10.getClass().isAssignableFrom(A5.dG) || !(eJ2.a(eB2 = new eB(e10)) <= 6.0f)) continue;
                float[] fArray = this.a(eB2);
                float f10 = Math.abs(Y.a(-(eJ2.U() - fArray[0])));
                float f11 = eJ2.K() - fArray[1];
                if (!((double)f10 <= this.y.a()) || !((double)f11 <= this.y.a() / 2.0) || v) continue;
                v = true;
                this.x = eB2;
                new Thread(new vz_0(this)).start();
                return;
            }
        }
    }

    static eB a(zp_0 zp_02) {
        return zp_02.x;
    }

    static AO b(zp_0 zp_02) {
        return zp_02.z;
    }

    static eB a(zp_0 zp_02, eB eB2) {
        zp_02.x = eB2;
        return zp_02.x;
    }

    static boolean e(boolean bl) {
        v = bl;
        return v;
    }
}

