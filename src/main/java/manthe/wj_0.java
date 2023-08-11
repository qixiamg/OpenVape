/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import manthe.bz_2;
import manthe.wM;
import manthe.we_0;

/*
 * Renamed from manthe.wj
 */
public abstract class wj_0
extends we_0
implements bz_2 {
    private boolean W = true;
    List<wM> V = new ArrayList<wM>();

    public wj_0() {
        this.a(wj_0.b.k);
        this.c(300.0);
        this.a(100.0);
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
    }

    @Override
    public void n() {
        this.W = !this.W;
        this.ak();
    }

    private void ak() {
        for (wM wM2 : this.al()) {
            wM2.a(!this.W);
        }
        this.M();
    }

    @Override
    public boolean m() {
        return this.W;
    }

    public void b(wM ... wMArray) {
        Collections.addAll(this.al(), wMArray);
        this.a(wMArray);
        this.ak();
    }

    public List<wM> al() {
        return this.V;
    }
}

