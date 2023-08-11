/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from manthe.Ao
 */
public class ao_0
extends Module {
    private final dp_0 z = dp_0.a((Object)this, "xray-blocks", "Xray Blocks", dp_0.q, "Gold Ore", "Iron Ore", "Diamond Ore", "Emerald Ore", "Lapis Lazuli Ore", "Gold Block", "Iron Block", "Diamond Block", "Emerald Block");
    private final DF y = DF.a((Object)this, "Opacity", "#", "", 0.0, 60.0, 255.0, 1.0);
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Cave Mode", false, "Only shows ores that are exposed to air.");
    private float v = 1.0f;
    private double x = 0.0;
    private final List<Integer> A = new ArrayList<Integer>();
    private static int[] u;

    public ao_0() {
        super("Xray", 65535, CQ.e, "Renders whitelisted blocks through walls.");
        this.a(this.y, this.w, this.z);
        this.y.getRuntimeCopyException(new u7(this));
    }

    @Override
    public boolean n() {
        return true;
    }

    private void U() {
        if (ds_2.k().e() || this.y.a() == this.x) {
            return;
        }
        int n6 = 4000;
        eJ eJ2 = ds_2.k();
        int n10 = (int)eJ2.z();
        int n11 = (int)eJ2.g();
        ds_2.t().a(n10 - n6, 0, n11 - n6, n10 + n6, 300, n11 + n6);
        this.x = this.y.a();
    }

    @Override
    public void a(kf_0 kf_02) {
        this.A.clear();
        for (String string : this.z.s()) {
            dx_2 dx_22 = dx_2.a(string.replace(" ", "_").toLowerCase());
            if (dx_22 == null || this.A.contains(dx_2.a(dx_22))) continue;
            this.A.add(dx_2.a(dx_22));
        }
    }

    @Override
    public void s() {
        if (!on.p.s().d()) {
            on.p.s().e();
        }
        ds_2.G().f();
        this.v = ds_2.s().p();
        ds_2.s().b(10.0f);
        this.U();
    }

    @Override
    public void J() {
        ds_2.G().f();
        ds_2.s().b(this.v);
    }

    public int S() {
        return this.y.a().intValue();
    }

    public boolean a(dx_2 dx_22) {
        return this.A.contains(dx_2.a(dx_22));
    }

    public void a(l4 l42) {
        if (!this.N()) {
            return;
        }
        if (this.a(l42.getBlock())) {
            l42.a(this.w.u() == false);
        }
    }

    public void a(lb_0 lb_02) {
        if (!this.N()) {
            return;
        }
        lb_02.a(true);
    }

    public void a(lo_0 lo_02) {
        if (!this.N()) {
            return;
        }
        lo_02.a(true);
        if (this.a(lo_02.getBlock())) {
            lo_02.setShouldRender(true);
        }
    }

    public void a(lh_0 lh_02) {
        lh_02.setOpacity(this.y.a().intValue());
    }

    public void a(lQ lQ2) {
        if (this.a(lQ2.getBlock())) {
            lQ2.a(true);
            if (lQ2.getEnumWorldBlockLayer().equals(g7.g())) {
                lQ2.setShouldRender(true);
            } else {
                lQ2.setShouldRender(false);
            }
        }
    }

    public void a(kY kY2) {
        if (!this.N()) {
            return;
        }
        kY2.a(true);
    }

    public void a(l3 l32) {
        if (!this.N()) {
            return;
        }
        l32.a(true);
    }

    public void a(kv kv2) {
        if (!this.N()) {
            return;
        }
        kv2.getRenderBlocks().a(this.a(kv2.getBlock()));
    }

    static void a(ao_0 ao_02) {
        ao_02.U();
    }

    public static void b(int[] nArray) {
        u = nArray;
    }

    public static int[] T() {
        return u;
    }

    static {
        if (ao_0.T() == null) {
            ao_0.b(new int[5]);
        }
    }
}

