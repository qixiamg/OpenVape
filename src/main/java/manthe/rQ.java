/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.D7;
import manthe.pd;
import manthe.rg_0;
import manthe.rw_0;

public class rQ
extends rg_0 {
    private final rw_0 J;

    public rQ(String string, float f10, float f11, float f12) {
        this(string, f10, f11, f12, false);
    }

    public rQ(String string, float f10, float f11, float f12, boolean bl) {
        super(bl);
        this.a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.J = new rw_0(string, f10, false, false);
        this.b(this.J);
        this.J.c(f11);
        this.J.a(f12);
    }

    public rQ(String string, String string2, float f10, float f11, float f12, boolean bl) {
        super(bl);
        this.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.J = new rw_0(string, f10, false, false);
        this.b(this.J);
        this.J.c(f11);
        this.J.a(f12);
        this.z().a(string2);
        this.b(this.z());
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        if (this.z().E().equalsIgnoreCase("")) {
            this.J.c(d3);
        }
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.J.b(d3);
    }

    public void d(Color color) {
        this.J.d(color);
    }

    public rw_0 x() {
        return this.J;
    }
}

