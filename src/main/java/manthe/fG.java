/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.d5_0;
import manthe.dl_1;
import manthe.ds_2;
import manthe.f7;
import manthe.fK;
import manthe.ff_0;
import manthe.fk_0;
import manthe.g1;
import manthe.gO;
import manthe.i6;

public class fG
extends cy_0 {
    public fG(Object object) {
        super(object);
    }

    public static fG a(fk_0 fk_02) {
        return new fG(fG.a.M().au.f(fk_02.a()));
    }

    public void a(fK fK2) {
        fG.a.M().au.d(this.b, fK2.a());
    }

    public fK i() {
        return new fK(fG.a.M().au.h(this.b));
    }

    public String g() {
        return fG.a.M().au.g(this.a());
    }

    public fk_0 k() {
        return new fk_0(fG.a.M().au.j(this.b));
    }

    public String j() {
        return i6.c(fG.a.M().au, this.b);
    }

    public int m() {
        return i6.e(fG.a.M().au, this.b);
    }

    public void a(int n6) {
        i6.a(fG.a.M().au, this.b, n6);
    }

    public ff_0 l() {
        return new ff_0(i6.d(fG.a.M().au, this.b));
    }

    public boolean a(fG fG2) {
        return this.b(fG2) && this.j().equals(fG2.j());
    }

    public boolean b(fG fG2) {
        return fG.a.M().au.b(this.b, fG2.a());
    }

    public d5_0 f() {
        if (V.c() >= 23) {
            return new d5_0(i6.b(fG.a.M().au, this.b, f7.g().a()));
        }
        return new d5_0(i6.b(fG.a.M().au, this.b));
    }

    public float a(int n6, int n10, int n11) {
        gO gO2 = ds_2.t();
        if (V.c() >= 23) {
            dl_1 dl_12 = gO2.a(g1.a(n6, n10, n11));
            return i6.a(fG.a.M().au, this.b, dl_12.a());
        }
        return i6.a(fG.a.M().au, this.b, gO2.b(n6, n10, n11).a());
    }

    public int n() {
        return fG.a.M().au.e(this.b);
    }

    public void b(int n6) {
        fG.a.M().au.b(this.b, n6);
    }

    public int h() {
        return i6.a(fG.a.M().au, this.b);
    }

    @Override
    public boolean e() {
        return this.b != null && (this.j().equals("Air") || this.toString().contains("tile.air")) || super.e();
    }
}

