/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import manthe.c2_0;
import manthe.cy_0;
import manthe.pc;
import manthe.uW;
import manthe.wM;

public abstract class wI
extends wM {
    private Color B;
    private Color C;
    private List<pc> A = new ArrayList<pc>();
    private static cy_0[] z;

    @Override
    public void a(uW uW2) {
        if (this.b()) {
            if (uW2.c().equals((Object)c2_0.LEFT_CLICK)) {
                this.J();
            }
            if (uW2.c().equals((Object)c2_0.RIGHT_CLICK)) {
                this.l();
            }
        }
    }

    public void J() {
        for (pc pc2 : this.A) {
            pc2.b();
        }
    }

    public void l() {
        for (pc pc2 : this.A) {
            pc2.a();
        }
    }

    public wI c(pc pc2) {
        this.A.add(pc2);
        return this;
    }

    public void b(pc pc2) {
        this.A = new ArrayList<pc>();
        this.A.add(pc2);
    }

    public void m() {
        this.A.clear();
    }

    public void a(pc pc2) {
        this.A.remove(pc2);
    }

    public List<pc> L() {
        return this.A;
    }

    public Color M() {
        return this.B;
    }

    public Color K() {
        return this.C;
    }

    public void b(Color color) {
        this.B = color;
    }

    public void c(Color color) {
        this.C = color;
    }

    public static void b(cy_0[] cy_0Array) {
        z = cy_0Array;
    }

    public static cy_0[] n() {
        return z;
    }

    static {
        if (wI.n() != null) {
            wI.b(new cy_0[4]);
        }
    }
}

