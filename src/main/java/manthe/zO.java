/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.List;

public class zO
extends Module {
    private final DF w = DF.a((Object)this, "Expand amount", "#.##", "", 0.0, 0.35, 1.0, 0.01);
    public final BooleanValue B = BooleanValue.createValue((Object)this, "Sort Targets", false, "Allows you to sort the hitboxes over your crosshair.\n\u00a7cMay not bypass anti-cheats!");
    private final DF A = DF.a((Object)this, "Minimum Size", "#", "ppl", 2.0, 2.0, 10.0, 1.0);
    public final BooleanValue u = BooleanValue.createValue((Object)this, "Weigh Health", false, "Will weigh Health into your target mode.\nIf two players have the same weights, the lowest health will be prioritized.");
    private final pb_0 z = new pb_0("Distance");
    public final pb_0 y = new pb_0("Yaw");
    public final pb_0 D = new pb_0("Armor");
    public final pb_0 x = new pb_0("Threat");
    public final pb_0 E = new pb_0("Health");
    public DX v = DX.a((Object)this, "Target Mode", "How targets should be filtered.\nArmor/Threat will default to Distance for non player targets.", this.z, this.z, this.y, this.D, this.x, this.E);
    private static String[] C;

    public zO() {
        super("HitBoxes", -16711707, CQ.f, "Expands entities hitboxes");
        this.a(this.w);
        this.B.a(this.v, this.u, this.A);
        this.a(this.B, this.v, this.u, this.A);
    }

    public float S() {
        if (!this.N()) {
            return 0.0f;
        }
        return this.w.a().floatValue();
    }

    public List a(List list, gK gK2, gK gK3) {
        if ((double)list.size() < this.A.a()) {
            return list;
        }
        ArrayList<ex_0> arrayList = new ArrayList<ex_0>();
        for (int i = 0; i < list.size(); ++i) {
            ex_0 ex_02 = new ex_0(list.get(i));
            if (!ex_02.V() || !on.p.t().a(ex_02, false)) continue;
            float f10 = ex_02.r() + this.S();
            fP fP2 = ex_02.s().d(f10, f10, f10);
            gb_0 gb_02 = fP2.a(gK2, gK3);
            if (fP2.a(gK2)) {
                arrayList.add(ex_02);
                continue;
            }
            if (!gb_02.d()) continue;
            arrayList.add(ex_02);
        }
        if ((double)arrayList.size() < this.A.a()) {
            return list;
        }
        if (this.v.v() == this.y) {
            arrayList.sort(new oO(this, null));
        } else if (this.v.v() == this.z) {
            arrayList.sort(new CM(this, null));
        } else if (this.v.v() == this.x) {
            arrayList.sort(new xv_0(this, null));
        } else if (this.v.v() == this.D) {
            arrayList.sort(new b5(this, null));
        } else if (this.v.v() == this.E) {
            arrayList.sort(new tp(this, null));
        }
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        arrayList2.add(((ex_0)arrayList.get(0)).a());
        return arrayList2;
    }

    public static void b(String[] stringArray) {
        C = stringArray;
    }

    public static String[] T() {
        return C;
    }

    static {
        if (zO.T() != null) {
            zO.b(new String[4]);
        }
    }
}

