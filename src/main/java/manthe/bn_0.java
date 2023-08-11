/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.HashMap;
import manthe.A5;
import manthe.P;
import manthe.bo_1;
import manthe.kl_0;
import manthe.lr_0;
import manthe.t5;
import manthe.tA;
import manthe.tC;
import manthe.tU;
import manthe.t_;
import manthe.ta_0;
import manthe.tc_0;
import manthe.td;
import manthe.te;
import manthe.th_0;
import manthe.tj_0;
import manthe.tt;
import manthe.tu_0;
import manthe.tx_0;
import manthe.uJ;
import manthe.ur_0;
import manthe.ve_0;

/*
 * Renamed from manthe.bN
 */
public class bn_0
extends bo_1 {
    private final HashMap<Class<? extends kl_0>, P> d = new HashMap();
    private boolean c;
    private static int[] b;

    public bn_0() {
        th_0.b(A5.ba);
        th_0.b(A5.bT);
        th_0.b(A5.cC);
        th_0.b(A5.cF);
    }

    public void e() {
        tC tC2 = new tC();
        this.a.add(tC2);
    }

    public void c() {
        this.a.clear();
        this.a.add(new tu_0());
        this.a.add(new uJ());
        this.a.add(new t5());
        this.a.add(new tt());
        this.a.add(new t_());
        this.a.add(new tU());
        this.a.add(new ur_0());
        this.a.add(new tj_0());
        this.a.add(new ta_0());
        this.a.add(new tc_0());
        this.a.add(new tA());
        this.a.add(new te());
        this.a.add(new tx_0());
        this.a.add(new td());
        this.a(lr_0.class, new ve_0());
    }

    public boolean f() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public P a(Class<? extends kl_0> clazz) {
        return this.d.get(clazz);
    }

    public void a(Class<? extends kl_0> clazz, P p) {
        this.d.put(clazz, p);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] d() {
        return b;
    }

    static {
        if (bn_0.d() == null) {
            bn_0.b(new int[3]);
        }
    }
}

