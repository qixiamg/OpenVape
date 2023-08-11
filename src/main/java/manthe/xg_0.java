/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bz_2;
import manthe.c2_0;
import manthe.uW;
import manthe.wM;
import manthe.we_0;

/*
 * Renamed from manthe.xg
 */
public abstract class xg_0
extends wM {
    private we_0 z;
    private static String A;

    public xg_0(we_0 we_02) {
        this.z = we_02;
    }

    public we_0 l() {
        return this.z;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }

    @Override
    public void b(uW uW2) {
        if (uW2.c().equals((Object)c2_0.RIGHT_CLICK) && this.z instanceof bz_2) {
            ((bz_2)((Object)this.z)).n();
            return;
        }
        super.b(uW2);
    }

    public static void b(String string) {
        A = string;
    }

    public static String m() {
        return A;
    }

    static {
        if (xg_0.m() != null) {
            xg_0.b("AnaCTc");
        }
    }
}

