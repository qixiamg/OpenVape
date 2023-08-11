/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;
import rip.vape.friend.Friend;
import rip.vape.module.Module;

public class yJ
extends yc_0 {
    private final z2 w = (z2)this.S();
    private final List<mT> x = new ArrayList<mT>();
    private static cy_0[] v;

    public yJ(Module y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(kA kA2) {
        if (ds_2.t().e()) {
            return;
        }
        ex_0 ex_02 = kA2.getEntity();
        double d3 = kA2.getX();
        double d4 = kA2.getY();
        double d5 = kA2.getZ();
        Color color = this.w.a(ex_02.a());
        if (color == null) {
            return;
        }
        float f10 = ex_02.r();
        fP fP2 = ex_02.s().d(f10, f10, f10);
        fP fP3 = fP.a(fP2.f() - ex_02.z(), fP2.l() - ex_02.l(), fP2.j() - ex_02.g(), fP2.h() - ex_02.z(), fP2.g() - ex_02.l(), fP2.i() - ex_02.g());
        mT mT2 = new mT(this, d3, d4, d5, fP3, ex_02, color);
        if (mT.c(mT2)) {
            this.x.add(mT2);
            if (this.w.C.u().booleanValue()) {
                kA2.a(true);
            }
        }
    }

    @Override
    public void t() {
        mq mq2 = on.p.a(0.9, true);
        GL11.glPushMatrix();
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        int n6 = d0_02.f();
        float f10 = (float)(n6 == 5 ? 0.4 : (n6 == 4 ? 0.5 : (n6 == 3 ? 0.66666 : (n6 == 2 ? 1.0 : (n6 == 1 ? 2.0 : (n6 == 0 ? 0.5 : 1.0))))));
        GL11.glScalef((float)f10, (float)f10, (float)f10);
        float f11 = g_.f();
        boolean bl = GL11.glIsEnabled((int)3042);
        for (mT mT2 : this.x) {
            boolean bl2;
            float f12 = ds_2.H();
            double d3 = mT.b(mT2) / (double)d0_02.f() / (double)f10 / (double)f11;
            double d4 = mT.e(mT2) / (double)d0_02.f() / (double)f10 / (double)f11;
            double d5 = ((double)f12 - mT.d(mT2) / (double)f11) / (double)d0_02.f() / (double)f10;
            double d6 = ((double)f12 - mT.a(mT2) / (double)f11) / (double)d0_02.f() / (double)f10;
            e3.j();
            GL11.glLineWidth((float)1.0f);
            e3.r();
            String string = mT.g(mT2).S();
            boolean bl3 = on.p.N().c(string);
            boolean bl4 = on.p.b().a(string);
            boolean bl5 = bl2 = bl4 || bl3;
            if (this.w.F.u().booleanValue() && (!this.w.T.u().booleanValue() || bl2)) {
                GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)0.4);
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)d3, (double)d5);
                GL11.glVertex2d((double)d4, (double)d5);
                GL11.glVertex2d((double)d4, (double)d6);
                GL11.glVertex2d((double)d3, (double)d6);
                GL11.glEnd();
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)(d3 + 1.0), (double)(d5 + 1.0));
                GL11.glVertex2d((double)(d4 - 1.0), (double)(d5 + 1.0));
                GL11.glVertex2d((double)(d4 - 1.0), (double)(d6 - 1.0));
                GL11.glVertex2d((double)(d3 + 1.0), (double)(d6 - 1.0));
                GL11.glEnd();
                e3.f();
                o7.a(mT.f(mT2));
                GL11.glBegin((int)2);
                GL11.glVertex2d((double)(d3 + 0.5), (double)(d5 + 0.5));
                GL11.glVertex2d((double)(d4 - 0.5), (double)(d5 + 0.5));
                GL11.glVertex2d((double)(d4 - 0.5), (double)(d6 - 0.5));
                GL11.glVertex2d((double)(d3 + 0.5), (double)(d6 - 0.5));
                GL11.glEnd();
            }
            if (mT.g(mT2).a(A5.cF)) {
                float f13;
                ej_0 ej_02 = new ej_0(mT.g(mT2).a());
                float f14 = f13 = ej_02.a(A5.cc) ? on.p.H().b(zt_0.class).b(new eC(ej_02.a())) : ej_02.aD();
                if (this.w.P.u().booleanValue() && f13 >= 0.0f && ej_02.at() >= 0.0f) {
                    double d7 = Math.min(1.0f, f13 / ej_02.at());
                    e3.r();
                    GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)0.4);
                    GL11.glBegin((int)7);
                    GL11.glVertex2d((double)(d3 - 2.0), (double)(d6 - 0.5));
                    GL11.glVertex2d((double)(d3 - 2.0), (double)(d5 + 0.5));
                    GL11.glVertex2d((double)(d3 - 4.0), (double)(d5 + 0.5));
                    GL11.glVertex2d((double)(d3 - 4.0), (double)(d6 - 0.5));
                    GL11.glEnd();
                    double d8 = d6 - d5 - 1.0;
                    double d10 = d5 + d8 * d7;
                    if (d7 >= 0.9) {
                        GL11.glColor4d((double)0.0, (double)1.0, (double)0.0, (double)1.0);
                    } else if (d7 >= 0.75) {
                        GL11.glColor4d((double)0.9, (double)1.0, (double)0.0, (double)1.0);
                    } else if (d7 >= 0.5) {
                        GL11.glColor4d((double)1.0, (double)1.0, (double)0.0, (double)1.0);
                    } else if (d7 >= 0.25) {
                        GL11.glColor4d((double)1.0, (double)0.5, (double)0.0, (double)1.0);
                    } else if (d7 >= 0.0) {
                        GL11.glColor4d((double)1.0, (double)0.0, (double)0.0, (double)1.0);
                    }
                    GL11.glBegin((int)7);
                    GL11.glVertex2d((double)(d3 - 2.5), (double)d10);
                    GL11.glVertex2d((double)(d3 - 2.5), (double)(d5 + 1.0));
                    GL11.glVertex2d((double)(d3 - 3.5), (double)(d5 + 1.0));
                    GL11.glVertex2d((double)(d3 - 3.5), (double)d10);
                    GL11.glEnd();
                }
                if (this.w.C.u().booleanValue()) {
                    Object object;
                    String string2;
                    String string3 = string2 = this.w.N.u() == false || bl2 ? ej_02.S() : ej_02.h().f();
                    if (this.w.N.u().booleanValue()) {
                        string2 = string2.replaceAll("[^\u00a7^\\x00-\\x7F]", "");
                    }
                    if (bl3 && (object = on.p.N().b(ej_02.S())) != null) {
                        string2 = ((Friend)object).getNameOrAlias();
                    }
                    if (this.w.y.u().booleanValue()) {
                        object = bl2 ? mT.f(mT2) : new Color(0, 0, 0, 95);
                        e3.j();
                        o7.a(d4 + (d3 - d4) / 2.0 - mq2.b(string2, false) / 2.0 - 1.5, d5 - 10.0, d4 + (d3 - d4) / 2.0 + mq2.b(string2, false) / 2.0 + 1.5, d5 - 1.0, 0.5, (Color)object, new Color(0, 0, 0, 102));
                        e3.p();
                    }
                    mq2.b(string2, d4 + (d3 - d4) / 2.0 - mq2.b(string2, false) / 2.0, d5 - 8.0, bl2 ? -1 : mT.f(mT2).getRGB(), false);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                }
            }
            GL11.glDisable((int)2848);
            e3.p();
        }
        if (bl) {
            e3.r();
        } else {
            e3.f();
        }
        GL11.glPopMatrix();
        this.x.clear();
    }

    public static void a(cy_0[] cy_0Array) {
        v = cy_0Array;
    }

    public static cy_0[] T() {
        return v;
    }

    static {
        if (yJ.T() == null) {
            yJ.a(new cy_0[5]);
        }
    }
}

