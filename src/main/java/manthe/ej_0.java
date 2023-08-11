/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Collection;
import manthe.V;
import manthe.e6;
import manthe.eY;
import manthe.ev_0;
import manthe.ex_0;
import manthe.fE;
import manthe.fG;
import manthe.fX;
import manthe.gK;
import manthe.gM;
import manthe.gS;
import manthe.gb_0;
import manthe.it_0;

/*
 * Renamed from manthe.ej
 */
public class ej_0
extends ex_0 {
    private static int[] f;

    public ej_0(Object object) {
        super(object);
    }

    public static e6 aI() {
        return new e6(it_0.a(ej_0.a.M().aL));
    }

    public static ej_0 b(gS gS2) {
        return new ej_0(it_0.p(ej_0.a.M().aL, gS2.a()));
    }

    public float az() {
        return it_0.m(ej_0.a.M().aL, this.b);
    }

    public void aC() {
        it_0.s(ej_0.a.M().aL, this.b);
    }

    public float aD() {
        return it_0.t(ej_0.a.M().aL, this.b);
    }

    public float aR() {
        return ej_0.a.M().aL.x(this.b);
    }

    public int aK() {
        return it_0.e(ej_0.a.M().aL, this.b);
    }

    public int aN() {
        return it_0.k(ej_0.a.M().aL, this.b);
    }

    public void e(int n6) {
        it_0.b(ej_0.a.M().aL, this.b, n6);
    }

    public gK m(float f10) {
        return new gK(ej_0.a.M().aL.d(this.b, f10));
    }

    public gK o(float f10) {
        return new gK(ej_0.a.M().aL.g(this.b, f10));
    }

    public boolean c(ex_0 ex_02) {
        return ej_0.a.M().aL.f(this.b, ex_02.a());
    }

    public gb_0 a(double d3, float f10) {
        return new gb_0(ej_0.a.M().aL.a(this.b, d3, f10));
    }

    public boolean a(fX fX2) {
        return it_0.a(ej_0.a.M().aL, this.b, fX2.a());
    }

    public fE b(fX fX2) {
        return new fE(it_0.b(ej_0.a.M().aL, this.b, fX2.a()));
    }

    public void aE() {
    }

    public float ay() {
        return it_0.c(ej_0.a.M().aL, this.b);
    }

    public void k(float f10) {
        it_0.f(ej_0.a.M().aL, this.b, f10);
    }

    public float aF() {
        return it_0.r(ej_0.a.M().aL, this.b);
    }

    public void n(float f10) {
        it_0.d(ej_0.a.M().aL, this.b, f10);
    }

    public fG aG() {
        return new fG(it_0.l(ej_0.a.M().aL, this.b));
    }

    public void aO() {
        if (V.c() >= 23) {
            it_0.e(ej_0.a.M().aL, this.b, gM.f().a());
            return;
        }
        it_0.i(ej_0.a.M().aL, this.b);
    }

    public ev_0 a(eY eY2) {
        return new ev_0(it_0.d(ej_0.a.M().aL, this.b, eY2.a()));
    }

    public Object aw() {
        return it_0.h(ej_0.a.M().aL, this.b);
    }

    public float aP() {
        return it_0.b(ej_0.a.M().aL, this.b);
    }

    public void r(float f10) {
        it_0.c(ej_0.a.M().aL, this.b, f10);
    }

    public float av() {
        return ej_0.a.M().aL.s(this.b);
    }

    public float ax() {
        return ej_0.a.M().aL.b(this.b);
    }

    public void a(fE fE2) {
        it_0.f(ej_0.a.M().aL, this.b, fE2.a());
    }

    public void f(int n6) {
        if (V.c() >= 23) {
            it_0.c(ej_0.a.M().aL, this.b, fX.a(n6).a());
            return;
        }
        it_0.a(ej_0.a.M().aL, this.b, n6);
    }

    public boolean aM() {
        return it_0.n(ej_0.a.M().aL, this.b);
    }

    public boolean aQ() {
        return it_0.o(ej_0.a.M().aL, this.b);
    }

    public float at() {
        return it_0.j(ej_0.a.M().aL, this.b);
    }

    public float aA() {
        return it_0.q(ej_0.a.M().aL, this.b);
    }

    public void l(float f10) {
        it_0.e(ej_0.a.M().aL, this.b, f10);
    }

    public float aL() {
        return it_0.d(ej_0.a.M().aL, this.b);
    }

    public void p(float f10) {
        it_0.a(ej_0.a.M().aL, this.b, f10);
    }

    public float au() {
        return it_0.a(ej_0.a.M().aL, this.b);
    }

    public void q(float f10) {
        it_0.b(ej_0.a.M().aL, this.b, f10);
    }

    public float aH() {
        return it_0.g(ej_0.a.M().aL, this.b);
    }

    public Collection aJ() {
        return (Collection)it_0.f(ej_0.a.M().aL, this.b);
    }

    public static void a(int[] nArray) {
        f = nArray;
    }

    public static int[] aB() {
        return f;
    }

    static {
        if (ej_0.aB() == null) {
            ej_0.a(new int[4]);
        }
    }
}

