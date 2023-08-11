/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.ra
 */
public class ra_0
extends r1 {
    public final DF ae = DF.a(this, "Size", "#.#", "", 0.5, 1.0, 2.0);
    public final DF ah = DF.a(this, "FPS", "#", "", 1.0, 30.0, 60.0);
    public final DF af = DF.a(this, "FOV", "#", "", 50.0, 90.0, 150.0);
    public final BooleanValue ai = BooleanValue.createValue(this, "Level view", true);
    public CD aj;
    private static ra_0 ag;

    public ra_0() {
        super("Rearview", true);
        this.aj().a(new D7(0.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.c(130.0);
        this.b(20.0);
        this.l(false);
        this.m(false);
        this.ah().add((p1)this.ae.getDefaultValue());
        this.ah().add((p1)this.ah.getDefaultValue());
        this.ah().add((p1)this.af.getDefaultValue());
        this.ah().add((p1)this.ai.getDefaultValue());
        ag = this;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        try {
            this.c(130.0);
            if (!this.e()) {
                return;
            }
            if (this.aj == null) {
                return;
            }
            if (ds_2.s().w() > 0) {
                on.p.j().c("Disable Optifine AA to use this feature", this.t(), this.k() + 20.0, -65536);
                return;
            }
            if (!ds_2.s().z()) {
                return;
            }
            if (ds_2.s().f() || ds_2.s().f()) {
                on.p.j().c("Disable fast render to use this feature", this.t(), this.k() + 20.0, -65536);
                return;
            }
            if (this.aj.g()) {
                double d3 = 73.0;
                double d4 = 130.0;
                d3 *= this.ae.a().doubleValue();
                d4 *= this.ae.a().doubleValue();
                boolean bl2 = GL11.glIsEnabled((int)3553);
                boolean bl3 = GL11.glIsEnabled((int)3008);
                boolean bl4 = GL11.glIsEnabled((int)3042);
                if (bl2) {
                    e3.j();
                }
                if (!bl3) {
                    e3.k();
                }
                if (!bl4) {
                    e3.r();
                }
                GL11.glColor4f((float)0.1f, (float)0.1f, (float)0.1f, (float)0.2f);
                o7.a((float)this.t(), (float)(this.k() + 19.5), (float)(this.t() + d4), (float)(this.k() + 19.5 + d3));
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                this.aj.a(true, this.t() + 0.5, this.k() + 19.5 + 0.5, this.t() + d4 - 0.5, this.k() + 19.5 + d3 - 0.5);
                if (bl2) {
                    e3.p();
                }
                if (!bl3) {
                    e3.i();
                }
                if (!bl4) {
                    e3.f();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void am() {
        if (!this.e() || !this.ai() && !d.getGuiObject().equals(ds_2.x().a())) {
            return;
        }
        if (ds_2.k().e() || ds_2.t().e()) {
            return;
        }
        if (this.aj != null) {
            this.aj.a((int)(1000.0 / this.ah.a()));
            this.aj.d(this.ai.u());
            this.aj.b(this.af.a().intValue());
            this.aj.f();
        } else {
            this.aj = new CD();
        }
    }

    public static ra_0 al() {
        return ag;
    }
}

