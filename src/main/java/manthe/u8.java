/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.cq_0;
import manthe.ds_2;
import manthe.eJ;
import manthe.fQ;

class u8 {
    private final int b;
    private final int a;
    private final List<Integer> c = new ArrayList<Integer>();

    public u8(int n6, int n10) {
        this.b = n6;
        this.a = n10;
    }

    public void a(int n6) {
        this.c.add(n6);
    }

    public int b() {
        return this.a;
    }

    public List<Integer> a() {
        return this.c;
    }

    public void c() {
        eJ eJ2 = ds_2.k();
        List<fQ> list = eJ2.aY().f();
        cq_0 cq_02 = new cq_0(this, list);
        this.c.sort(cq_02);
    }

    static int a(u8 u82) {
        return u82.a;
    }
}

