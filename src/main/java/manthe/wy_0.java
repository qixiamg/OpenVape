/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from manthe.wy
 */
public class wy_0
extends we_0
implements bz_2 {
    private String aa;
    private CQ Z;
    protected xW Y;
    private boolean V;
    private Module X;
    private static int[] W;

    public wy_0(CQ cQ) {
        this.aa = cQ.H();
        this.Z = cQ;
        if (cQ.equals(CQ.b)) {
            return;
        }
        this.a(wy_0.b.k);
        this.c(200.0);
        this.a(100.0);
        this.W().e(false);
        this.W().b("wrap");
        this.ap();
        this.a(false);
    }

    public void ap() {
        this.Y = new xW(this, "new" + this.aa.toLowerCase(), this.aa);
        this.a(this.Y);
        ArrayList<Module> arrayList = new ArrayList<Module>(on.p.H().e());
        Collections.sort(arrayList, new nm_0());
        for (Module y52 : arrayList) {
            if (!y52.Q().equals(this.Z)) continue;
            wz_0 wz_02 = new wz_0(this, y52);
            this.a((wM)wz_02, new Object[0]);
            wz_02.R();
        }
    }

    public int ao() {
        int n6 = 0;
        for (wM wM2 : this.w()) {
            if (wM2 instanceof wz_0) {
                boolean bl = ((wz_0)wM2).S().x();
                ((wz_0)wM2).f(false);
                if (!bl) {
                    ++n6;
                }
                if (zu_0.E) {
                    wM2.a(true);
                    continue;
                }
                wM2.a(bl);
                continue;
            }
            if (wM2 instanceof xg_0) continue;
            wM2.a(false);
        }
        this.M();
        return n6;
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        this.a((Module)null);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    public wz_0 b(Module y52) {
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wz_0) || !((wz_0)wM2).S().equals(y52)) continue;
            return (wz_0)wM2;
        }
        return null;
    }

    public Module ak() {
        return this.X;
    }

    public CQ an() {
        return this.Z;
    }

    public String al() {
        return this.aa;
    }

    public void a(Module y52) {
        if (this.X != null) {
            this.b(this.X).N();
        }
        this.X = y52;
        if (this.Y == null) {
            return;
        }
        if (y52 == null) {
            this.Y.a((Module)null);
            this.Y.b((Module)null);
            return;
        }
        int n6 = -1;
        int n10 = -1;
        block0: for (wM wM2 : this.w()) {
            int n11;
            if (!(wM2 instanceof wz_0) || !((wz_0)wM2).S().equals(y52)) continue;
            for (n11 = this.w().indexOf(wM2) - 1; n11 > 0; --n11) {
                if (!(this.w().get(n11) instanceof wz_0) || !((wz_0)this.w().get(n11)).S().x()) continue;
                n10 = n11;
                break;
            }
            for (n11 = this.w().indexOf(wM2) + 1; n11 < this.w().size(); ++n11) {
                if (!(this.w().get(n11) instanceof wz_0) || !((wz_0)this.w().get(n11)).S().x()) continue;
                n6 = n11;
                break block0;
            }
        }
        this.Y.a(n6 == -1 ? null : ((wz_0)this.w().get(n6)).S());
        this.Y.b(n10 == -1 ? null : ((wz_0)this.w().get(n10)).S());
        this.M();
    }

    @Override
    public String ad() {
        return this.Z.H();
    }

    @Override
    public void n() {
        if (this.Y == null) {
            return;
        }
        this.V = !this.V;
        this.Y.J();
    }

    @Override
    public boolean m() {
        return this.V;
    }

    public static void b(int[] nArray) {
        W = nArray;
    }

    public static int[] am() {
        return W;
    }

    static {
        if (wy_0.am() != null) {
            wy_0.b(new int[3]);
        }
    }
}

