/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class zD
extends Module {
    private final BooleanValue y = BooleanValue.createValue((Object)this, "Swap Weapon", false, "Swaps to the strongest weapon on your hotbar.");
    private final DF F = DF.a(this, "Wait Delay", "#", "ms", 0.0, 0.0, 500.0, 50.0, "How long to wait before swapping to tool.");
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Swap Back", false, "Swaps back to your original item\nwhen not hovering over blocks.");
    private final DF u = DF.a(this, "Swap Delay", "#", "ms", 50.0, 350.0, 1000.0, 50.0, "How long to wait before swapping back.");
    private final BooleanValue z = BooleanValue.createValue((Object)this, "Tool Hover Check", false, "Only swaps if you were hovering over the block.\nHelps prevent accidentally swapping during combat.");
    private final DF w = DF.a(this, "Hover Delay", "#", "ms", 50.0, 550.0, 1500.0, 50.0, "Automatically AutoTools if looking at\na block for the set delay amount.");
    private int v = -1;
    private boolean E;
    private boolean C;
    private final AO B = new AO();
    private final AO D = new AO();
    private final AO A = new AO();

    public zD() {
        super("AutoTool", 6485058, CQ.e, "Automatically swaps your hand to the appropriate tool.");
        this.x.a(new BasicValue[]{this.u});
        this.z.a(new BasicValue[]{this.w});
        this.a(this.y, this.F, this.x, this.u, this.z, this.w);
    }

    @Override
    public void q() {
        if (ds_2.k().e() || ds_2.x().d()) {
            return;
        }
        boolean bl = cb_0.f();
        gb_0 gb_02 = ds_2.I();
        if (bl) {
            if (gb_02.h().e() && !gb_02.g().equals(g4.g())) {
                if (!this.z.u().booleanValue() || this.E) {
                    float f10 = 1.0f;
                    int n6 = -1;
                    fI fI2 = ds_2.k().aY();
                    for (int i = 44; i >= 9; --i) {
                        f4 f42;
                        fG fG2 = fI2.a(i).f();
                        if (fG2.e()) continue;
                        float f11 = fG2.a(gb_02.l(), gb_02.m(), gb_02.j());
                        fk_0 fk_02 = fG2.k();
                        if (fk_02.d() && fk_02.a(A5.aP) && (f42 = new f4(fk_02)).m().equals(fz_0.f())) {
                            f11 = 1.5f;
                        }
                        if (!(f11 > f10)) continue;
                        f10 = f11;
                        n6 = i;
                    }
                    if (n6 >= 36 && n6 <= 44 && this.B.a(this.F.a().longValue())) {
                        this.D.d();
                        if (this.v == -1) {
                            this.v = ds_2.k().aU().i();
                        }
                        ds_2.k().aU().a(n6 - 36);
                    }
                }
            } else if (gb_02.h().d() && this.y.u().booleanValue()) {
                float f12 = 1.0f;
                int n10 = -1;
                fI fI3 = ds_2.k().aY();
                for (int i = 44; i >= 9; --i) {
                    float f13;
                    fG fG3 = fI3.a(i).f();
                    if (fG3.e() || !((f13 = (float)cb_0.c(fG3)) > f12)) continue;
                    f12 = f13;
                    n10 = i;
                }
                if (n10 >= 36 && n10 <= 44 && this.B.a(this.F.a().longValue())) {
                    this.D.d();
                    if (this.v == -1) {
                        this.v = ds_2.k().aU().i();
                    }
                    ds_2.k().aU().a(n10 - 36);
                }
            }
        } else {
            this.B.d();
        }
        if (this.D.a(this.u.a().longValue()) && this.v != -1) {
            if (this.x.u().booleanValue()) {
                ds_2.k().aU().a(this.v);
            }
            this.v = -1;
        }
        if (gb_02.d() && gb_02.g().equals(g4.f())) {
            if (!this.C && bl || this.A.a(this.w.a().longValue())) {
                this.E = true;
            }
        } else {
            if (this.E && !bl) {
                this.E = false;
            }
            this.A.d();
        }
        this.C = bl;
    }

    @Override
    public void s() {
        this.a(50L, true);
    }
}

