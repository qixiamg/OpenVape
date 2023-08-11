/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.D7;
import manthe.dr_1;
import manthe.ds_2;
import manthe.pd;
import manthe.rg_0;

/*
 * Renamed from manthe.rk
 */
public class rk_0
extends rg_0 {
    public rk_0(int n6, int n10) {
        super("", false);
        this.a(new D7(2.0, 10.0, n6, n10, new pd(0, 0, 0, 0)));
        this.c(n10 * 16);
        this.b(n6 * 16);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        dr_1 dr_12 = ds_2.m();
    }
}

