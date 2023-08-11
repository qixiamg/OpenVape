/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import com.google.gson.JsonObject;
import java.awt.Color;
import manthe.D7;
import manthe.bq_1;
import manthe.c7;
import manthe.dp_0;
import manthe.dr_1;
import manthe.ds_2;
import manthe.k9;
import manthe.my_0;
import manthe.o1;
import manthe.o7;
import manthe.oe;
import manthe.pd;
import manthe.rg_0;
import manthe.rl_0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.rb
 */
public class rb_0
extends rg_0
implements o1 {
    private final dp_0 K;
    private String L;
    private boolean J = true;

    public rb_0(c7 c72, String string, dp_0 dp_02) {
        super("", false);
        this.K = dp_02;
        this.L = string;
        this.a(new D7(2.0, 10.0, 1, 1, new pd(0, 0, 0, 0)));
        this.b(12.0);
        this.c(c72.q());
        this.a(new oe(this));
        rg_0 rg_02 = new rg_0("x", true);
        rg_02.b(12.0);
        rg_02.c(12.0);
        rg_02.a(new bq_1(this, dp_02));
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
        String string = this.L;
        o7.a(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), this.g() ? this.K.r().darker() : this.K.r());
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        if (string != null) {
            dr_12.a(string, this.t() + 15.0, this.k() + 4.0, -1, 0.5);
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
        this.J = !this.J;
    }

    @Override
    public boolean G() {
        return this.J;
    }

    @Override
    public void g(boolean bl) {
        this.J = bl;
    }

    public String V() {
        return this.L;
    }

    public JsonObject H() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item-id", this.L);
        jsonObject.addProperty("enabled", Boolean.valueOf(this.J));
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("item-id") != null) {
            this.L = jsonObject.get("item-id").getAsString();
        }
        if (jsonObject.get("enabled") != null) {
            this.J = jsonObject.get("enabled").getAsBoolean();
        }
    }

    public String toString() {
        return this.L;
    }
}

