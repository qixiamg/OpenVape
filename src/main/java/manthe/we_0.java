/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.input.Mouse
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import manthe.Dj;
import manthe.bo_0;
import manthe.c2_0;
import manthe.d0_0;
import manthe.ds_2;
import manthe.o7;
import manthe.uW;
import manthe.vh_0;
import manthe.wB;
import manthe.wM;
import manthe.wR;
import manthe.wc_0;
import manthe.wl_0;
import manthe.ws_0;
import manthe.zu_0;
import org.lwjgl.input.Mouse;

/*
 * Renamed from manthe.we
 */
public abstract class we_0
extends wc_0
implements Dj {
    private boolean Q;
    private bo_0 O;
    protected boolean R;
    protected boolean P = true;
    private boolean M;
    private boolean N = true;
    private List<we_0> S;
    private wl_0 U = new wl_0("Frame", this.I());
    private static String[] T;

    public we_0() {
        this.U.c(new vh_0(this));
        this.U.d(10.0);
    }

    public abstract String ad();

    @Override
    public void a() {
        if (!this.b()) {
            return;
        }
        this.ah();
        super.a();
        if (this.Y() != null && this.U.b()) {
            this.U.b(this.ad());
            this.U.b(this.U.e() + 10.0);
            d0_0 d0_02 = ds_2.p();
            this.U.c(this.g(d0_02));
            this.U.a(this.f(d0_02));
        }
    }

    @Override
    public void k() {
        if (!this.ai()) {
            return;
        }
        super.k();
    }

    @Override
    public void a(uW uW2) {
        if (this.Y() == null || !this.b()) {
            return;
        }
        if (this.P && uW2.c().equals((Object)c2_0.LEFT_CLICK) && this.Y().q().b(uW2.a(), uW2.b())) {
            this.O = o7.b();
            this.R = true;
            this.h(false);
        }
    }

    @Override
    public void S() {
    }

    @Override
    public double g() {
        return this.W().d();
    }

    @Override
    public double h() {
        return this.W().c();
    }

    private void ah() {
        if (!this.R || this.M) {
            return;
        }
        if (!Mouse.isButtonDown((int)c2_0.LEFT_CLICK.ordinal())) {
            this.R = false;
            this.h(true);
            this.M();
            return;
        }
        bo_0 bo_02 = o7.b();
        double d3 = bo_02.a - this.O.a;
        double d4 = bo_02.b - this.O.b;
        this.O = bo_02;
        this.b(d3, d4);
    }

    private void b(double d3, double d4) {
        this.c(this.d() + d3);
        this.a(this.c() + d4);
        for (wM wM2 : this.w()) {
            wM2.c(wM2.d() + d3);
            wM2.a(wM2.c() + d4);
            if (!(wM2 instanceof we_0)) continue;
            ((we_0)wM2).b(d3, d4);
        }
    }

    public void a(double d3, double d4) {
        this.c(d3);
        this.a(d4);
        this.M();
    }

    public void ac() {
        zu_0.a(this);
    }

    public void aa() {
        if (this.b()) {
            zu_0.a(this.getClass());
        }
    }

    public double e(d0_0 d0_02) {
        return -(this.Y().f() * 0.75);
    }

    public double k(d0_0 d0_02) {
        return (double)d0_02.h() - this.Y().f() * 0.5;
    }

    public double i(d0_0 d0_02) {
        return (double)d0_02.g() - this.e() * 0.25;
    }

    public double c(d0_0 d0_02) {
        return -(this.e() * 0.75);
    }

    public double g(d0_0 d0_02) {
        double d3 = this.i(d0_02);
        double d4 = this.c(d0_02);
        if (this.d() < d4) {
            return d4;
        }
        if (this.d() > d3) {
            return d3;
        }
        return this.d();
    }

    public double f(d0_0 d0_02) {
        double d3 = this.e(d0_02);
        double d4 = this.k(d0_02);
        if (this.c() < d3) {
            return d3;
        }
        if (this.c() > d4) {
            return d4;
        }
        return this.c();
    }

    public boolean h(d0_0 d0_02) {
        double d3 = this.i(d0_02);
        double d4 = this.c(d0_02);
        return this.d() < d4 || this.d() > d3;
    }

    public boolean a(d0_0 d0_02) {
        double d3 = this.e(d0_02);
        double d4 = this.k(d0_02);
        return this.c() < d3 || this.c() > d4;
    }

    public void b(d0_0 d0_02) {
        if (this.Y() == null) {
            return;
        }
        if (this.h(d0_02)) {
            this.c(this.g(d0_02));
        }
    }

    public void d(d0_0 d0_02) {
        if (this.Y() == null) {
            return;
        }
        if (this.a(d0_02)) {
            this.a(this.f(d0_02));
        }
    }

    public boolean j(d0_0 d0_02) {
        if (this instanceof ws_0 || this instanceof wB || this instanceof wR) {
            return false;
        }
        if (this.Y() == null) {
            return false;
        }
        return this.h(d0_02) || this.a(d0_02);
    }

    public boolean ai() {
        return this.Q;
    }

    public boolean af() {
        return this.M;
    }

    public boolean ab() {
        return this.P;
    }

    public wl_0 aj() {
        return this.U;
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.R = false;
        if (!this.M) {
            return;
        }
        if (!bl && this.S != null) {
            for (we_0 we_02 : this.S) {
                we_02.a(true);
            }
        }
        if (bl) {
            this.S = new ArrayList<we_0>();
            for (we_0 we_02 : zu_0.T()) {
                if (we_02.equals(this) || !we_02.b()) continue;
                this.S.add(we_02);
                we_02.a(false);
            }
        }
        Iterator<we_0> iterator = ds_2.p();
        this.a((double)((d0_0)((Object)iterator)).g() / 2.0 - this.e() / 2.0, (double)((d0_0)((Object)iterator)).h() / 2.0 - this.f() / 2.0);
    }

    public void l(boolean bl) {
        this.Q = bl;
    }

    public void m(boolean bl) {
        this.M = bl;
    }

    public void j(boolean bl) {
        this.N = bl;
    }

    public void k(boolean bl) {
        this.P = bl;
    }

    @Override
    public void c(double d3) {
        super.c(Math.floor(d3));
    }

    @Override
    public void a(double d3) {
        super.a(Math.floor(d3));
    }

    @Override
    public JsonObject l() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", this.ad());
        jsonObject.addProperty("x", (Number)this.d());
        jsonObject.addProperty("y", (Number)this.c());
        jsonObject.addProperty("visible", Boolean.valueOf(this.b()));
        jsonObject.addProperty("pinned", Boolean.valueOf(this.ai()));
        return jsonObject;
    }

    @Override
    public void a(JsonObject jsonObject) {
        if (jsonObject.get("x") != null && !jsonObject.get("x").isJsonNull()) {
            this.c(jsonObject.get("x").getAsDouble());
            this.M();
        }
        if (jsonObject.get("y") != null && !jsonObject.get("y").isJsonNull()) {
            this.a(jsonObject.get("y").getAsDouble());
            this.M();
        }
        if (jsonObject.get("pinned") != null && !jsonObject.get("pinned").isJsonNull()) {
            this.l(jsonObject.get("pinned").getAsBoolean());
        }
        if (!this.N) {
            this.a(false);
        } else if (jsonObject.get("visible") != null && !jsonObject.get("visible").isJsonNull()) {
            this.a(jsonObject.get("visible").getAsBoolean());
        }
    }

    public boolean ag() {
        return this.N;
    }

    public static void b(String[] stringArray) {
        T = stringArray;
    }

    public static String[] ae() {
        return T;
    }

    static {
        if (we_0.ae() == null) {
            we_0.b(new String[2]);
        }
    }
}

