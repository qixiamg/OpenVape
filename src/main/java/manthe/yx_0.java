/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from manthe.yx
 */
public class yx_0
extends yc_0 {
    private z3 v = (z3)this.S();
    private int w;
    private float z;
    private float A;
    private double E;
    private boolean B;
    private boolean D;
    private boolean x;
    private Map<Integer, Integer> C = new HashMap<Integer, Integer>();
    private static String[] y;

    public yx_0(Module y52, String string) {
        super(y52, string);
        this.E = this.a(5.0E-7, -5.0E-7);
    }

    @Override
    public void s() {
        this.x = false;
        this.D = false;
        this.w = 0;
        eJ eJ2 = ds_2.k();
        if (eJ2.d()) {
            this.z = eJ2.U();
            this.A = eJ2.K();
        }
        this.C.clear();
    }

    @Override
    public void J() {
        this.x = false;
        this.D = false;
        this.w = 0;
        this.C.clear();
    }

    @Override
    public void a(kO kO2) {
        try {
            if (A5.cn.isAssignableFrom(kO2.getGuiScreenObject().getClass())) {
                this.C.clear();
            }
        }
        catch (Exception exception) {
            this.C.clear();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(km_0 km_02) {
        eJ eJ2;
        boolean bl;
        block63: {
            block64: {
                ej_0 ej_02;
                boolean bl2;
                yP yP2;
                block65: {
                    boolean bl3;
                    boolean bl4;
                    zG zG2;
                    cr_0 cr_02 = on.p.H();
                    if (km_02.c()) {
                        this.V();
                    }
                    if ((zG2 = cr_02.b(zG.class)).N() && !zG2.U()) {
                        return;
                    }
                    if (this.v.E.u().booleanValue() && !VapeSettings.f()) {
                        return;
                    }
                    if (this.v.aa.u().booleanValue() && ds_2.x().d()) {
                        return;
                    }
                    bl = V.c() < 23;
                    yP2 = on.p.H().b(yP.class);
                    bl2 = yP2.S() && !cr_02.a(zz_0.class) && !cr_02.a(zM.class) && !cr_02.a(zQ.class);
                    eJ2 = ds_2.k();
                    boolean bl5 = this.v.z.u() == false && !eJ2.aT() && !bl2;
                    boolean bl6 = bl4 = this.v.ae.a().intValue() <= 50;
                    if (km_02.a() == da_0.b) {
                        if (this.v.K.a(this.v.ae.a().intValue()) || bl4) {
                            this.v.T();
                        }
                        if (this.v.Y >= this.v.R.size()) {
                            this.v.Y = 0;
                        }
                        if (this.v.R.size() > 0) {
                            int n6;
                            ej_0 ej_03;
                            if (this.v.K.a(this.v.ae.a().intValue()) || bl4) {
                                this.U();
                                this.v.K.d();
                            }
                            if ((ej_03 = this.v.S()) == null) return;
                            if (!this.v.a(ej_03)) {
                                this.v.T();
                                this.U();
                                return;
                            }
                            double d3 = eJ2.a(ej_03);
                            if (!(d3 <= this.v.am.a())) return;
                            float[] fArray = this.v.c(ej_03);
                            float f10 = Y.a(this.v.a(ej_03.z(), ej_03.g(), this.z) + this.a(-3.0, 3.0), -180.0f, 180.0f);
                            if (f10 > (float)(n6 = 70)) {
                                f10 = n6;
                            } else if (f10 < (float)(-n6)) {
                                f10 = -n6;
                            }
                            float f11 = this.z;
                            float f12 = this.A;
                            if (!yq_0.u.V()) {
                                if (this.v.T.v() != this.v.v) {
                                    if (this.v.T.v() == this.v.I) {
                                        float f13 = ds_2.s().r();
                                        float f14 = f13 * 0.6f + 0.2f;
                                        float f15 = f14 * f14 * f14 * 8.0f;
                                        int n10 = Math.round(f10 / f15);
                                        int n11 = Math.round((fArray[1] - km_02.getRotationPitch()) / f15);
                                        float f16 = (float)n10 * f15;
                                        float f17 = (float)n11 * f15;
                                        km_0.setRotationYaw(this.z += f16);
                                        this.A = km_02.getRotationPitch() + f17;
                                        km_0.setRotationPitch(this.A);
                                    } else {
                                        km_0.setRotationYaw(this.z += f10 / 1.1f);
                                        this.A = fArray[1] / 1.1f;
                                        km_0.setRotationPitch(this.A);
                                    }
                                    if (this.v.T.v() == this.v.L) {
                                        this.z = km_02.getRotationYaw();
                                        eJ2.i(this.z);
                                        this.A = km_02.getRotationPitch();
                                        eJ2.d(this.A);
                                    }
                                } else {
                                    this.z = eJ2.U();
                                    this.A = eJ2.K();
                                }
                            }
                            if (yP2.N()) {
                                if (ej_03.F() <= 15 && bl2 && !eJ2.aQ()) {
                                    if (yP2.z.v() == yP2.y) {
                                        if (this.w == 2) {
                                            this.w = 0;
                                        }
                                        if (this.w == 0) {
                                            if (eJ2.J()) {
                                                this.B = true;
                                                eJ2.e(2);
                                                km_0.setY(km_02.getY() + 0.0672268904 + this.E);
                                                km_0.setOnGround(false);
                                                km_0.setShouldAlwaysSend(true);
                                            }
                                        } else if (this.w == 1) {
                                            if (km_02.getY() == eJ2.l()) {
                                                if (km_02.isOnGround()) {
                                                    km_0.setOnGround(false);
                                                    km_0.setShouldAlwaysSend(true);
                                                }
                                            }
                                        }
                                    } else if (yP2.z.v() == yP2.u) {
                                        boolean bl7 = this.v.U.u().booleanValue() ? eJ2.s(0.5f) == 1.0f : this.v.Q.a(this.v.U());
                                        boolean bl8 = (double)eJ2.a(ej_03) <= (eJ2.c(ej_03) ? this.v.W.a() : 3.25) && bl7;
                                        int n12 = this.C.getOrDefault(ej_03.q(), 0);
                                        if ((ej_03.aN() <= 0 && n12 >= 6 || n12 <= 0 && bl8 && this.T()) && eJ2.v() && eJ2.J()) {
                                            eJ2.e(2);
                                            km_0.setY(km_02.getY() + 0.125 - this.E);
                                            km_0.setOnGround(false);
                                            this.B = true;
                                            this.w = 1;
                                        }
                                    }
                                }
                            } else if (bl5) {
                                boolean bl9;
                                if (this.v.R.size() <= 0) return;
                                if (this.v.S() == null) return;
                                if (this.v.U.u().booleanValue()) {
                                    if (eJ2.s(0.5f) != 1.0f) return;
                                    bl9 = true;
                                } else {
                                    bl9 = this.v.Q.a(this.v.U());
                                }
                                boolean bl10 = bl9;
                                if (!bl10) return;
                                if (bl2 && eJ2.v() && (this.w != 1 || !this.B)) {
                                    if (ej_03.F() <= 15) return;
                                }
                                oC oC2 = this.a(f11, f12);
                                double d4 = yO.a(new oC(eJ2.z(), eJ2.l(), eJ2.g()), eJ2.am(), oC2, ej_03.z(), ej_03.l() + (double)ej_03.n() / 2.0, ej_03.g(), ej_03.A(), ej_03.n(), 0.85);
                                if (this.v.T.v() != this.v.v) {
                                    if (!(d4 <= 0.1)) return;
                                }
                                if (d3 <= this.v.am.a()) {
                                    if (bl) {
                                        eJ2.aO();
                                    }
                                    if (d3 <= this.v.W.a()) {
                                        this.C.put(ej_03.q(), 0);
                                        ds_2.K().a(eJ2, ej_03);
                                        if (!bl) {
                                            eJ2.aO();
                                            eJ2.a4();
                                        }
                                    } else if (!bl) {
                                        eJ2.aO();
                                        eJ2.a4();
                                    }
                                }
                                this.v.Q.d();
                                return;
                            }
                            if (this.v.z.x() == false) return;
                            if (!bl) return;
                            if (!eJ2.a_().d()) return;
                            if (!eJ2.a_().k().d()) return;
                            if (!eJ2.a_().k().a(A5.bO)) return;
                            eJ2.a(eJ2.a_(), 99999);
                            this.x = false;
                            return;
                        } else {
                            this.w = 0;
                            this.z = eJ2.U();
                        }
                        return;
                    }
                    if (km_02.a() != da_0.a) return;
                    if (bl5) {
                        return;
                    }
                    if (this.v.R.size() <= 0 || this.v.S() == null) break block63;
                    ej_02 = this.v.S();
                    boolean bl11 = this.v.U.u().booleanValue() ? eJ2.s(0.5f) == 1.0f : (bl3 = this.v.Q.a(this.v.U()));
                    if (!bl3) break block64;
                    if (!bl2 || !eJ2.v() || this.w == 1 && this.B) break block65;
                    if (ej_02.F() <= 15) break block64;
                }
                oC oC3 = this.a(km_02.getRotationYaw(), km_02.getRotationPitch());
                double d5 = 0.0;
                yO.a(new oC(eJ2.z(), eJ2.l(), eJ2.g()), eJ2.am(), oC3, ej_02.z(), ej_02.l() + (double)ej_02.n() / 2.0, ej_02.g(), ej_02.A(), ej_02.n(), 0.85);
                if (this.v.T.v() == this.v.v || d5 <= 0.1) {
                    double d6 = eJ2.a(ej_02);
                    if (yP2.z.v() == yP2.u) {
                        boolean bl12;
                        int n13 = this.C.getOrDefault(ej_02.q(), 0);
                        boolean bl13 = bl12 = ej_02.aN() <= 0 && n13 >= 6 || n13 <= 0;
                        if (bl2 && eJ2.v() && eJ2.J() && bl12 && this.B) {
                            if (V.c() > 13) {
                                double d7 = -0.0784000015258789;
                                eJ2.bp().a(ft_0.a(eJ2.z(), km_02.getY() + d7, eJ2.g(), false));
                            } else {
                                double d8 = 0.04659999847412109;
                                eJ2.bp().a(ft_0.a(eJ2.z(), eJ2.s().l() + d8, eJ2.l() + d8, eJ2.g(), false));
                            }
                        }
                    }
                    if (this.D && ds_2.k().aT() && bl) {
                        this.x = true;
                        this.D = false;
                        ds_2.K().a(eJ2);
                        this.x = false;
                        eJ2.a(eJ2.a_(), 99999);
                    }
                    if (d6 <= this.v.am.a()) {
                        if (bl) {
                            eJ2.aO();
                        }
                        if (d6 <= this.v.W.a()) {
                            this.C.put(ej_02.q(), 0);
                            ds_2.K().a(eJ2, ej_02);
                            if (!bl) {
                                eJ2.aO();
                                eJ2.a4();
                            }
                            if (!this.D && eJ2.aT() && bl) {
                                try {
                                    ds_2.K().a(eJ2, eJ2.i(), eJ2.a_());
                                }
                                catch (Exception exception) {
                                    // empty catch block
                                }
                                this.D = true;
                            }
                        } else if (!bl) {
                            eJ2.aO();
                            eJ2.a4();
                        }
                    }
                    this.v.Q.d();
                    this.B = false;
                }
            }
            ++this.w;
            if (this.w <= 2) return;
            this.w = 0;
            return;
        }
        if (!this.D) return;
        if (!this.v.Q.a(200L)) return;
        if (!bl) return;
        if (this.v.z.u() == false) return;
        this.x = true;
        ds_2.K().a(eJ2);
        this.x = false;
        this.D = false;
    }

    @Override
    public void a(ky_0 ky_02) {
        if (ky_02.getPacket().a(A5.aB) && this.v.z.x().booleanValue() && V.c() < 23 && !this.x && this.v.R.size() > 0 && this.v.S() != null) {
            ky_02.a(true);
            return;
        }
        if (ky_02.getPacket().a(A5.cp) && this.v.H.u().booleanValue()) {
            ky_02.a(true);
        }
    }

    public oC a(float f10, float f11) {
        double d3 = -Math.sin(Math.toRadians(f11));
        double d4 = Math.cos(Math.toRadians(f11));
        double d5 = -d4 * Math.sin(Math.toRadians(f10));
        double d6 = d4 * Math.cos(Math.toRadians(f10));
        return new oC(d5, d3, d6);
    }

    private float a(double d3, double d4) {
        return (float)(Math.random() * (d3 - d4) + d4);
    }

    private void U() {
        ++this.v.Y;
        if (this.v.Y >= this.v.R.size()) {
            this.v.Y = 0;
        }
    }

    private void V() {
        for (Object e10 : ds_2.t().k()) {
            if (!A5.cF.isAssignableFrom(e10.getClass())) continue;
            ej_0 ej_02 = new ej_0(e10);
            this.C.put(ej_02.q(), this.C.getOrDefault(ej_02.q(), 0) - 1);
        }
    }

    public boolean a(double d3, double d4, double d5) {
        boolean bl = Y.a(d4 - (double)((int)d4), 1) == 0.5;
        dl_1 dl_12 = ds_2.t().a(g1.a(d3, d4 - (bl ? 0.0 : 0.1), d5));
        dx_2 dx_22 = dl_12.f();
        boolean bl2 = bl ? dx_22.h() == dj_0.i() : !dx_22.a(dl_12) || dx_22.h() == dj_0.i();
        return !bl2;
    }

    public boolean T() {
        double[][] dArrayArray;
        boolean bl = false;
        eJ eJ2 = ds_2.k();
        double d3 = eJ2.z() - eJ2.T();
        double d4 = eJ2.g() - eJ2.X();
        for (double[] dArray : dArrayArray = new double[][]{{-0.35, -0.35}, {-0.35, 0.35}, {0.35, 0.35}, {0.35, -0.35}}) {
            double d5;
            double d6;
            double d7 = dArray[0];
            double d8 = dArray[1];
            double d10 = d7 + eJ2.z() + d3;
            if (!this.a(d10, d6 = -0.5 + eJ2.l(), d5 = d8 + eJ2.g() + d4)) continue;
            bl = true;
            break;
        }
        return !this.a(eJ2) || bl;
    }

    private boolean a(eJ eJ2) {
        en_0 en_02 = ds_2.s();
        return en_02.j().h() || en_02.A().h() || en_02.g().h() || en_02.n().h() || eJ2.bg().j() != 0.0f || eJ2.bg().h() != 0.0f;
    }

    public static void b(String[] stringArray) {
        y = stringArray;
    }

    public static String[] W() {
        return y;
    }

    static {
        if (yx_0.W() == null) {
            yx_0.b(new String[3]);
        }
    }
}

