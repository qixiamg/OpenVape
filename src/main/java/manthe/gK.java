/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.cy_0;
import manthe.oC;

public class gK
extends cy_0 {
    public gK(Object object) {
        super(object);
    }

    public static gK b(double d3, double d4, double d5) {
        return new gK(gK.a.M().a_.a(d3, d4, d5));
    }

    public gK a(double d3) {
        return gK.b(this.g() * d3, this.h() * d3, this.f() * d3);
    }

    public gK c(gK gK2) {
        return this.a(gK2.g(), gK2.h(), gK2.f());
    }

    public gK a(double d3, double d4, double d5) {
        return new gK(gK.a.M().a_.a(this.b, d3, d4, d5));
    }

    public double g() {
        return gK.a.M().a_.c(this.b);
    }

    public double h() {
        return gK.a.M().a_.a(this.b);
    }

    public double f() {
        return gK.a.M().a_.b(this.b);
    }

    public double a(gK gK2) {
        return gK.a.M().a_.a(this.b, gK2.a());
    }

    public double b(gK gK2) {
        return gK.a.M().a_.b(this.b, gK2.a());
    }

    @Override
    public String toString() {
        return "[" + this.g() + "," + this.h() + "," + this.f() + "]";
    }

    public oC i() {
        return new oC(this.g(), this.h(), this.f());
    }
}

