/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class yE
extends y8 {
    private final CopyOnWriteArrayList<u_> z = new CopyOnWriteArrayList();
    private final pb_0 v = new pb_0("All");
    private final pb_0 B = new pb_0("One of each");
    private final pb_0 x = new pb_0("First");
    private final DX w = DX.a((Object)this, "Mode", "All - Throws all debuffs on hotbar\nOne of each - Throws one of each debuff\nFirst - Throws only first debuff on hotbar", this.B, this.v, this.B, this.x);
    private final BooleanValue[] u = new BooleanValue[]{BooleanValue.createValue(this, "Harming", true), BooleanValue.createValue(this, "Weakness", true), BooleanValue.createValue(this, "Poison", true), BooleanValue.createValue(this, "Slowness", true)};
    private final dy_0 y = dy_0.createValue(this, "Delay", "#.#", "", 0.0, 70.0, 120.0, 200.0);
    private final BooleanValue A = BooleanValue.createValue(this, "Scroll", false);
    private final DF D = DF.a(this, "Scroll delay", "#", "ms", 0.0, 100.0, 200.0);
    private boolean C;

    public yE() {
        super("ThrowDebuff");
        this.a(this.w);
        for (BooleanValue dB : this.u) {
            this.a(dB);
        }
        this.a(this.y);
        this.A.a(new BasicValue[]{this.D});
        this.a(this.A);
        this.a(this.D);
    }

    private void e(int n6) {
        if (!this.A.u().booleanValue()) {
            ds_2.k().aU().a(n6);
            return;
        }
        int n10 = ds_2.k().aU().i();
        while (true) {
            ds_2.k().aU().a(n10);
            try {
                Thread.sleep(this.D.a().longValue());
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (n6 > n10) {
                ++n10;
                continue;
            }
            if (n6 >= n10) break;
            --n10;
        }
    }

    private boolean S() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 9; ++i) {
            arrayList.add(i);
        }
        Object[] objectArray = ds_2.k().aU().h();
        ArrayList<BooleanValue> arrayList2 = new ArrayList<BooleanValue>();
        block1: for (Integer n6 : arrayList) {
            fk_0 fk_02;
            fG fG2 = new fG(objectArray[n6]);
            if (fG2.e() || (fk_02 = fG2.k()).e() || !A5.dx.isInstance(fk_02.a())) continue;
            fh_0 fh_02 = new fh_0(fk_02.a());
            for (BooleanValue dB : this.u) {
                if (this.w.v().equals(this.B) && arrayList2.contains(dB)) continue;
                String string = fh_02.a(fG2).toLowerCase();
                String string2 = dB.H().toLowerCase();
                if (!dB.u().booleanValue() || !string.contains(string2)) continue;
                this.z.add(new u_(n6, fG2));
                arrayList2.add(dB);
                if (!this.w.v().equals(this.x)) continue block1;
                break block1;
            }
        }
        return !this.z.isEmpty();
    }

    @Override
    public void q() {
        eJ eJ2 = ds_2.k();
        eP eP2 = eJ2.aU();
        int n6 = eP2.i();
        for (u_ u_2 : this.z) {
            try {
                this.e(u_2.a());
                int n10 = ds_2.s().s().i();
                ei_0.a(n10, true);
                ei_0.a(n10);
                Thread.sleep(51L);
                ei_0.a(n10, false);
                Thread.sleep((long)this.y.t());
            }
            catch (Exception exception) {}
        }
        this.e(n6);
        this.C = false;
    }

    @Override
    public void a(kf_0 kf_02) {
        if (!this.C && this.N()) {
            this.d(false);
        }
    }

    @Override
    public void s() {
        if (this.S()) {
            this.C = true;
            this.a(0L, false);
        } else {
            this.d(false);
        }
    }

    @Override
    public void J() {
        this.z.clear();
    }
}

