/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bo_1;
import manthe.t1;
import manthe.t4;
import manthe.t9;
import manthe.tG;
import manthe.tH;
import manthe.tK;
import manthe.tO;
import manthe.tS;
import manthe.tb_0;
import manthe.tf;
import manthe.th_0;
import manthe.tl;
import manthe.tw_0;

/*
 * Renamed from manthe.bZ
 */
public class bz_1
extends bo_1 {
    private boolean c;
    private static String b;

    public bz_1() {
        th_0.b(A5.u);
        th_0.b(A5.ba);
        th_0.b(A5.aH);
        th_0.b(A5.b4);
        th_0.b(A5.bS);
        th_0.b(A5.bd);
        th_0.b(A5.bC);
        th_0.b(A5.b6);
        th_0.b(A5.F);
        if (V.c() > 13) {
            th_0.b(A5.dP);
            th_0.b(A5.b8);
            th_0.b(A5.ao);
            th_0.b(A5.aY);
            th_0.b(A5.b1);
            th_0.b(A5.dg);
            th_0.b(A5.bv);
            th_0.b(A5.aA);
            th_0.b(A5.cu);
            th_0.b(A5.bV);
        } else {
            th_0.b(A5.c_);
            th_0.b(A5.dz);
        }
        this.a.add(new tb_0());
        this.a.add(new t9());
        this.a.add(new tG());
        if (V.c() == 13) {
            this.a.add(new t4(A5.cv));
        } else {
            this.a.add(new t4(A5.u));
        }
    }

    public void e() {
        if (V.c() == 13) {
            this.a.add(new tw_0());
            this.a.add(new tl());
        } else {
            this.a.add(new tS());
            this.a.add(new tO());
            this.a.add(new t1());
            this.a.add(new tH());
            this.a.add(new tK());
            this.a.add(new tf());
        }
        this.a();
        this.c = true;
    }

    public boolean d() {
        return this.c;
    }

    public static void b(String string) {
        b = string;
    }

    public static String c() {
        return b;
    }

    static {
        if (bz_1.c() == null) {
            bz_1.b("kQHkt");
        }
    }
}

