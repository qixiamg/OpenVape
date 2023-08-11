/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.ds_2;
import manthe.p1;
import manthe.rQ;
import manthe.rg_0;

/*
 * Renamed from manthe.aZ
 */
public class az_1 {
    private final String a;
    private final rg_0 b;
    private final List<p1> c = new ArrayList<p1>();

    public az_1(String string) {
        this.a = string;
        this.b = new rQ(string, "    " + string, 0.25f, 2.0f, 3.5f, true);
        this.b.z().e(0.8);
        this.b.c(ds_2.m().c(string));
        this.b.b(15.0);
    }

    public String a() {
        return this.a;
    }

    public rg_0 c() {
        return this.b;
    }

    public List<p1> b() {
        return this.c;
    }

    public void a(p1 p12) {
        this.c.add(p12);
    }
}

