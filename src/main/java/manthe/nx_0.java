/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ds_2;
import manthe.e7;
import manthe.et_0;
import manthe.gz_0;

/*
 * Renamed from manthe.nx
 */
public class nx_0 {
    private static final nx_0 d = new nx_0();
    private boolean c;
    public et_0 a;
    public boolean e;
    private static final int b = 18;

    public void f() {
        if (this.c) {
            return;
        }
        if (ds_2.s().w() > 0 || !ds_2.s().z()) {
            return;
        }
        this.e = ds_2.s().f();
        if (this.e) {
            ds_2.s().d(false);
            ds_2.w().a(ds_2.F(), ds_2.H());
            if (!ds_2.M().e()) {
                ds_2.M().a(ds_2.F(), ds_2.H());
            }
            ds_2.G().f();
        }
        this.e();
        this.c = true;
    }

    private void e() {
        this.a = et_0.a(ds_2.l(), ds_2.M().i(), ds_2.w(), new gz_0(e7.j()[18]));
        ds_2.M().a(this.a);
        this.a.a(ds_2.F(), ds_2.H());
        ds_2.M().c(true);
    }

    public void a() {
        if (!this.c) {
            return;
        }
        if (ds_2.s().w() > 0 || !ds_2.s().z()) {
            return;
        }
        if (this.e) {
            ds_2.w().a(ds_2.F(), ds_2.H());
            if (!ds_2.M().e()) {
                ds_2.M().a(ds_2.F(), ds_2.H());
            }
            ds_2.G().f();
            ds_2.s().d(true);
        }
        ds_2.M().c(false);
        ds_2.M().a(new et_0(null));
        this.a = null;
        this.c = false;
    }

    public void b() {
        this.a();
    }

    public void d() {
    }

    public static nx_0 c() {
        return d;
    }
}

