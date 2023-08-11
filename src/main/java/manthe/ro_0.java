/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.A0;
import manthe.D7;
import manthe.DD;
import manthe.DL;
import manthe.an_0;
import manthe.c7;
import manthe.dr_1;
import manthe.ds_2;
import manthe.fG;
import manthe.fk_0;
import manthe.k9;
import manthe.mD;
import manthe.my_0;
import manthe.o1;
import manthe.o7;
import manthe.pd;
import manthe.rg_0;
import manthe.rl_0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.ro
 */
public class ro_0
extends rg_0
implements o1 {
    private final mD J;
    private final DD K;

    public ro_0(c7 c72, mD mD2, DD dD) {
        super("", false);
        this.K = dD;
        this.J = mD2;
        this.a(new D7(2.0, 10.0, 1, 1, new pd(0, 0, 0, 0)));
        this.b(12.0);
        this.c(c72.q());
        this.a(new DL(this));
        rg_0 rg_02 = new rg_0("x", true);
        rg_02.b(12.0);
        rg_02.c(12.0);
        rg_02.a(new A0(this, dD, mD2));
        c72.b(this);
        c72.b(rg_02);
        rl_0 rl_02 = new rl_0("", my_0.c, 1.0);
        rl_02.b(2.0);
        c72.b(rl_02);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        dr_1 dr_12 = ds_2.m();
        fk_0 fk_02 = null;
        String string = null;
        try {
            fk_02 = fk_0.a(Integer.parseInt(this.J.d()));
        }
        catch (Exception exception) {
            fk_02 = an_0.a(this.J.d());
        }
        if (fk_02 != null && fk_02.d()) {
            string = fk_02.a(fG.a(fk_02));
            if (this.J.b() != -1) {
                string = this.J.d() + ":" + this.J.b();
            }
        }
        o7.a(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), this.g() ? this.K.r().darker() : this.K.r());
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        if (string != null) {
            dr_12.a(string, this.t() + 15.0, this.k() + 4.0, -1, 0.5);
        } else {
            dr_12.a(this.J.d(), this.t() + 15.0, this.k() + 4.0, -1, 0.5);
        }
        if (this.J.f() != -1) {
            dr_12.d(this.J.f() + "", this.t() + this.q() - (double)dr_12.c(this.J.f() + "") - 2.0, this.k() + 2.0, -1);
        }
        o7.a(this.t(), this.k(), this.t() + 12.0, this.k() + 12.0, 0x50000000);
        o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, -16777216);
        if (this.G()) {
            o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, Color.WHITE);
            k9.a(Color.BLACK, (float)this.t() + 2.0f, (float)this.k() + 2.0f, "check", 8.0f, 8.0f, false);
        }
    }

    @Override
    public void F() {
        this.J.a(!this.J.c());
    }

    @Override
    public boolean G() {
        return this.J.c();
    }

    @Override
    public void g(boolean bl) {
        this.J.a(bl);
    }

    public mD H() {
        return this.J;
    }
}

