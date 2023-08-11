/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.nc_0;

class Cf {
    private Color c;
    private double a = 1.0;
    private boolean b;

    private Cf(Color color) {
        this.c = color;
    }

    public Color c() {
        return this.c;
    }

    public void a(Color color) {
        this.c = color;
    }

    public double a() {
        return this.a;
    }

    public void a(double d3) {
        this.a = d3;
    }

    public boolean b() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    Cf(Color color, nc_0 nc_02) {
        this(color);
    }
}

