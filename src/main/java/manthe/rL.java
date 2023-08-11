/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

public class rL
extends r1 {
    public final pb_0 ai = new pb_0("Alphabetical");
    public final pb_0 ap = new pb_0("Length");
    public final DX ag = DX.a((Object)this, "Sort", this.ai, this.ai, this.ap);
    public final BooleanValue ao = BooleanValue.createValue((Object)this, "Shadow", true, "Renders shadowed text.");
    public final BooleanValue am = BooleanValue.createValue(this, "Use Category Color", false);
    public final BooleanValue aq = BooleanValue.createValue((Object)this, "Watermark", false, "Renders a vape watermark");
    public final BooleanValue ae = BooleanValue.createValue(this, "Render background", false);
    public final BooleanValue al = BooleanValue.createValue((Object)this, "Hide Modules", false, "Allows you to blacklist certain modules from being shown.");
    public final dp_0 an = dp_0.a((Object)this, "module-show-blacklist", "Hidden Modules", "Name of module to hide.", dp_0.r, Arrays.asList("ESP", "NameTags", "StorageESP"));
    public BooleanValue ar = BooleanValue.createValue((Object)this, "Rescale", true, "Rescales text GUI");
    double ah;
    double aj;
    double af;
    private List<Module> ak = new CopyOnWriteArrayList<Module>();
    private static rL as;

    public rL() {
        super("Text GUI", true);
        D7 d7 = new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0));
        d7.g();
        this.aj().a(d7);
        this.g(false);
        this.aj().g(false);
        this.c(100.0);
        this.b(20.0);
        this.f(false);
        this.m(true);
        this.al.a(new BasicValue[]{this.an});
        this.ah().add((p1)this.ag.getDefaultValue());
        this.ah().add((p1)this.ao.getDefaultValue());
        this.ah().add((p1)this.am.getDefaultValue());
        this.ah().add((p1)this.al.getDefaultValue());
        this.ah().add((p1)this.an.getDefaultValue());
        this.ah().add((p1)this.aq.getDefaultValue());
        this.ah().add((p1)this.ar.getDefaultValue());
        this.ah().add((p1)this.ae.getDefaultValue());
        this.n(true);
        this.l(false);
        this.ak.addAll(on.p.H().e());
        this.ag.getRuntimeCopyException(new yM(this));
        as = this;
    }

    public void an() {
        if (this.ag.v() == this.ai) {
            this.ak.sort(new nm_0());
        } else if (this.ag.v() == this.ap) {
            this.ak.sort(new b__0(null));
        }
    }

    @Override
    public mq r() {
        return super.r();
    }

    @Override
    public void c(boolean bl) {
        Object object;
        super.c(bl);
        if (this.z() || !this.e() || !this.ai()) {
            return;
        }
        mq mq2 = on.p.a(1.0);
        this.b(on.p.t().r.K());
        double d3 = this.aj().t();
        double d4 = this.aj().k() + (double)(bl ? -20 : 2);
        boolean bl2 = this.Y();
        float[] fArray = new float[3];
        ColorValue dE = on.p.t().r;
        fArray = Color.RGBtoHSB(dE.K().getRed(), dE.K().getGreen(), dE.K().getBlue(), fArray);
        float f10 = fArray[0];
        if (this.ae.u().booleanValue() && this.af != this.aj) {
            GL11.glDisable((int)3553);
            GL11.glEnable((int)3042);
            o7.a(new Color(20, 20, 20, 180), this.af - 1.0, this.ah - 1.0, this.aj + 1.0, this.ah - 1.0, this.aj + 1.0, d4 - 2.0, this.af - 1.0, d4 - 2.0);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3553);
        }
        double d5 = d3;
        double d6 = this.aj;
        if (this.aq.u().booleanValue()) {
            double d7 = bl2 ? d3 + 17.0 : d3 + 1.0;
            GL11.glPushMatrix();
            if (this.ao.u().booleanValue()) {
                k9.a(new Color(0, 0, 0, 90), (float)d7 + 0.5f, (float)d4 - 1.0f + 0.5f, "vapelogo", 15.0f, 15.0f, false);
                k9.a(new Color(0, 0, 0, 90), (float)d7 + 50.0f + 0.5f, (float)d4 - 1.0f + 0.5f, "v4", 15.0f, 15.0f, false);
            }
            object = Color.WHITE;
            if (dE.J()) {
                object = new Color(Color.HSBtoRGB(f10, 1.0f, 1.0f));
                if ((f10 -= 0.05f) <= 0.0f) {
                    f10 = 1.0f;
                }
                fArray[0] = f10;
                Color color = new Color(Color.HSBtoRGB(f10, 1.0f, 1.0f));
                k9.a((Color)object, color, (float)d7, (float)d4 - 1.0f, "vapelogo", 15.0f, 15.0f, false);
                k9.a((Color)object, color, (float)d7 + 50.0f, (float)d4 - 1.0f, "v4", 15.0f, 15.0f, false);
            } else {
                k9.a((Color)dE.K(), (float)d7, (float)d4 - 1.0f, "vapelogo", 15.0f, 15.0f, false);
                k9.a(Color.WHITE, (float)d7 + 50.0f, (float)d4 - 1.0f, "v4", 15.0f, 15.0f, false);
            }
            GL11.glPopMatrix();
            d4 += 15.0;
            d5 = d3 + 73.0;
            if (d7 < d6) {
                d6 = d7;
            }
        }
        for (Module y52 : this.ak) {
            if (!y52.N() || y52.y() == 0 || this.al.u().booleanValue() && this.an.d(y52.H())) continue;
            object = y52.H() + y52.w();
            double d8 = mq2.b((String)object);
            double d10 = bl2 ? d3 + 87.0 - d8 : d3 + 2.0;
            Color color = new Color(this.am.u() != false ? y52.Q().c() : y52.y());
            if (dE.J()) {
                if ((f10 -= 0.025f) <= 0.0f) {
                    f10 = 1.0f;
                }
                fArray[0] = f10;
                color = new Color(Color.HSBtoRGB(f10, 1.0f, 1.0f));
            }
            if (this.ao.u().booleanValue()) {
                mq2.c((String)object, d10, d4, color);
            } else {
                mq2.a((String)object, d10, d4, color);
            }
            this.a(this.af - 1.0, d4 - 1.5, this.aj - this.af + 2.0);
            d4 += 10.0;
            if (d10 + d8 > d5) {
                d5 = d10 + d8 + 1.0;
            }
            if (!(d10 < d6)) continue;
            d6 = d10 - 1.0;
        }
        this.aj = d5;
        this.ah = d4;
        this.af = d6;
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
    }

    private void a(double d3, double d4, double d5) {
        if (!this.ae.u().booleanValue()) {
            return;
        }
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glColor4d((double)0.1, (double)0.1, (double)0.1, (double)0.25);
        GL11.glLineWidth((float)1.0f);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)(d3 + d5), (double)d4);
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
    }

    @Override
    public void c() {
        super.c();
        this.b(20.0);
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        for (p1 p12 : this.aj().v()) {
            p12.c(d3 - 0.0);
        }
    }

    public String al() {
        CopyOnWriteArrayList<Module> copyOnWriteArrayList = new CopyOnWriteArrayList<Module>(on.p.H().e());
        if (this.ag.v() == this.ai) {
            copyOnWriteArrayList.sort(new nm_0());
        } else if (this.ag.v() == this.ap) {
            copyOnWriteArrayList.sort(new b__0(null));
        }
        String string = "  ";
        for (Module y52 : copyOnWriteArrayList) {
            if (!y52.N() || y52.y() == 0) continue;
            string = string + y52.H() + ", ";
        }
        if (string.length() > 2) {
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }

    public static rL am() {
        return as;
    }
}

