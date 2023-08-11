/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

/*
 * Renamed from manthe.ks
 */
public class ks_0
extends kl_0 {
    private double d;
    private double f;
    private double e;

    public ks_0(int n6, double d3, double d22, double d32) {
        this.a = n6;
        this.d = d3;
        this.f = d22;
        this.e = d32;
    }

    public double getX() {
        return this.d;
    }

    public ks_0 setX(double d3) {
        this.d = d3;
        return this;
    }

    public double getY() {
        return this.f;
    }

    public ks_0 setY(double d3) {
        this.f = d3;
        return this;
    }

    public double getZ() {
        return this.e;
    }

    public ks_0 setZ(double d3) {
        this.e = d3;
        return this;
    }

    @Override
    public boolean fire() {
        try {
            for (Module y52 : on.p.H().e()) {
                if (!y52.N()) continue;
                y52.a(this);
            }
        }
        catch (Exception e10) {
            e10.printStackTrace();
        }
        return super.fire();
    }
}

