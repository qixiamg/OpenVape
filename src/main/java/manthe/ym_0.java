/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import manthe.A5;
import manthe.AO;
import manthe.cb_0;
import manthe.ds_2;
import manthe.dx_2;
import manthe.eD;
import manthe.eJ;
import manthe.ei_0;
import manthe.fG;
import manthe.gS;
import manthe.kt_0;
import manthe.oA;
import manthe.y8;

/*
 * Renamed from manthe.ym
 */
public class ym_0
extends y8 {
    private final AO y = new AO();
    private dx_2 v;
    private float w;
    private int u;
    private int x;
    private int z;
    private int A = 0;

    public ym_0() {
        super("Clutch");
    }

    @Override
    public void s() {
        try {
            List<Integer> list = this.T();
            if (list.isEmpty()) {
                this.z();
                return;
            }
            ds_2.k().aU().a(list.get(0));
            dx_2 dx_22 = this.S();
            if (dx_22 == null) {
                this.z();
                return;
            }
            this.v = dx_22;
            this.A = 1;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void J() {
        this.v = null;
        this.u = -1;
        this.x = -1;
        this.z = -1;
        this.A = 0;
        this.w = 0.0f;
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (this.A == 1) {
            float f10 = ThreadLocalRandom.current().nextFloat() * 1.5f;
            if (ThreadLocalRandom.current().nextFloat() > 0.5f) {
                f10 = -f10;
            }
            float f11 = ThreadLocalRandom.current().nextFloat() * 1.5f;
            oA.a(this.w + f10, 80.0f + f11);
            this.A = 2;
            this.y.d();
        } else if (this.A == 2) {
            ei_0 ei_02 = ds_2.s().s();
            ei_0.a(ei_02.i(), true);
            ei_0.a(ei_02.i());
            if (this.y.a(50L)) {
                ei_0.a(ei_02.i(), false);
                this.z();
            }
        }
    }

    private dx_2 S() {
        eJ eJ2 = ds_2.k();
        gS gS2 = eJ2.i();
        int n6 = (int)eJ2.z();
        int n10 = (int)eJ2.l();
        int n11 = (int)eJ2.g();
        if (!cb_0.h) {
            --n10;
            --n11;
        }
        this.x = n10;
        this.u = n6 + 1;
        this.z = n11;
        dx_2 dx_22 = this.a(gS2, this.u, this.x, this.z);
        if (dx_22 != null) {
            this.w = -90.0f;
            return dx_22;
        }
        this.u = n6 - 1;
        this.z = n11;
        dx_22 = this.a(gS2, this.u, this.x, this.z);
        if (dx_22 != null) {
            this.w = 90.0f;
            return dx_22;
        }
        this.u = n6;
        this.z = n11 + 1;
        dx_22 = this.a(gS2, this.u, this.x, this.z);
        if (dx_22 != null) {
            this.w = 0.0f;
            return dx_22;
        }
        this.u = n6;
        this.z = n11 - 1;
        dx_22 = this.a(gS2, this.u, this.x, this.z);
        if (dx_22 != null) {
            this.w = 180.0f;
            return dx_22;
        }
        return null;
    }

    private dx_2 a(gS gS2, int n6, int n10, int n11) {
        dx_2 dx_22 = gS2.b(n6, n10, n11);
        if (dx_22.e() || dx_22.h().a(eD.h().h().a().getClass())) {
            return null;
        }
        return dx_22;
    }

    private List<Integer> T() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        eJ eJ2 = ds_2.k();
        for (int i = 0; i <= 8; ++i) {
            String string;
            fG fG2 = eJ2.aU().b(i);
            if (fG2.e() || fG2.k().e() || !fG2.k().a(A5.av) || (string = fG2.k().a().toString()).contains("Colored") || string.contains("Lily")) continue;
            arrayList.add(i);
        }
        return arrayList;
    }
}

