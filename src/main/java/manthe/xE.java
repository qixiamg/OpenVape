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
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

public class xE
extends wM {
    private wL z;

    public xE(wL wL2) {
        this.z = wL2;
    }

    @Override
    public void a() {
        this.f(false);
    }

    @Override
    public void k() {
        this.f(true);
    }

    private void f(boolean bl) {
        double d3;
        mq mq2 = this.e(1.0);
        double d4 = mq2.a("e");
        float f10 = (float)(this.d() + 5.0);
        float f11 = (float)((double)((float)this.c()) - (bl ? this.z.Y().f() : -5.0));
        boolean bl2 = this.d() + this.e() / 2.0 >= (double)((float)ds_2.p().g() / 2.0f);
        boolean bl3 = on.p.t().r.J();
        if (bl2) {
            f10 += 30.0f;
        }
        double d5 = 10.0;
        rL rL2 = rL.am();
        CopyOnWriteArrayList<Module> copyOnWriteArrayList = new CopyOnWriteArrayList<Module>(on.p.H().e());
        this.a(copyOnWriteArrayList);
        ArrayList<Module> arrayList = new ArrayList<Module>();
        for (Module y52 : copyOnWriteArrayList) {
            if (!y52.N() || y52.y() == 0 || rL2.al.u().booleanValue() && rL2.an.d(y52.H())) continue;
            arrayList.add(y52);
            d3 = mq2.b(y52.H() + y52.w()) + 6.0;
            d5 = Math.max(d5, d3);
        }
        if (rL2.aq.u().booleanValue()) {
            d5 = Math.max(d5, 75.0);
        }
        double d6 = bl2 ? this.d() + this.e() - d5 : this.d();
        d3 = (double)arrayList.size() * (d4 + 4.0);
        if (rL2.ae.u().booleanValue()) {
            if (rL2.aq.u().booleanValue()) {
                d3 += 17.0;
            }
            pe_0.c(d6, f11 - 2.0f, d5, d3, new Color(0, 0, 0, 100));
        }
        if (rL2.aq.u().booleanValue()) {
            k9.a(b.e(), (float)d6, f11, "vapelogo", 15.0f, 15.0f, (boolean)rL2.ao.u());
            k9.a(Color.WHITE, (float)(d6 + 50.0), f11, "v4", 15.0f, 15.0f, (boolean)rL2.ao.u());
            f11 += 17.0f;
        }
        Color color = b.e();
        float[] fArray = new float[3];
        fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), fArray);
        float f12 = fArray[0];
        for (Module y53 : arrayList) {
            String string = y53.H() + y53.w();
            Color color2 = new Color(rL2.am.u() != false ? y53.Q().c() : y53.y());
            if (bl3) {
                if ((f12 -= 0.025f) <= 0.0f) {
                    f12 = 1.0f;
                }
                fArray[0] = f12;
                color2 = new Color(Color.HSBtoRGB(f12, fArray[1], fArray[2]));
            }
            double d7 = mq2.b(string);
            float f13 = f10 = bl2 ? (float)(this.d() + this.e() - 3.0 - d7) : (float)(this.d() + 3.0);
            if (rL2.ao.u().booleanValue()) {
                mq2.c(string, (double)f10, (double)f11, color2);
            } else {
                mq2.a(string, (double)f10, (double)f11, color2);
            }
            if (rL2.ae.u().booleanValue()) {
                pe_0.b(d6, (double)f11 + d4 + 2.0, d5, 1.0f, new Color(30, 30, 30, 50));
            }
            f11 = (float)((double)f11 + (d4 + 4.0));
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void a(List<Module> list) {
        mq mq2 = this.e(1.0);
        switch (rL.am().ag.v().H()) {
            case "Alphabetical": {
                list.sort(new nm_0());
                break;
            }
            case "Length": {
                list.sort(new vc_0(this, mq2));
            }
        }
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 0.0;
    }
}

