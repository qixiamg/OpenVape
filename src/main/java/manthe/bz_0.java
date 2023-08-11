/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import manthe.r1;
import manthe.ri_0;

/*
 * Renamed from manthe.Bz
 */
public class bz_0 {
    private final List<r1> b = new ArrayList<r1>();
    private ri_0 a;

    public bz_0(r1 ... r1Array) {
        this.b.addAll(Arrays.asList(r1Array));
    }

    public bz_0(List<r1> list) {
        this.b.addAll(list);
    }

    public List<r1> a() {
        return this.b;
    }

    public ri_0 b() {
        return this.a;
    }

    public void a(ri_0 ri_02) {
        this.a = ri_02;
    }
}

