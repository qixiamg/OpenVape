/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class yF
extends y8 {
    private final pb_0 E = new pb_0("Both");
    private final pb_0 G = new pb_0("Pots");
    private final pb_0 y = new pb_0("Soup");
    private final DX F = DX.a((Object)this, "Type", this.E, this.E, this.G, this.y);
    private final pb_0 I = new pb_0("Dynamic");
    private final pb_0 B = new pb_0("Single");
    private final DX w = DX.a((Object)this, "Mode", "Dynamic - uses only as many items as needed to heal as much as possible without over-healing\nSingle - Always uses one item, regardless of health", this.I, this.I, this.B);
    private final DF v = DF.a(this, "Scroll delay", "#", "ms", 0.0, 100.0, 200.0);
    private final dy_0 H = dy_0.createValue(this, "Delay", "#", "ms", 0.0, 80.0, 115.0, 200.0, 1.0);
    private final BooleanValue C = BooleanValue.createValue(this, "Scroll", false);
    private final BooleanValue D = BooleanValue.createValue(this, "Random", false);
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Throw bowls", true, "Throws soup bowls after consuming");
    private final CopyOnWriteArrayList<u_> z = new CopyOnWriteArrayList();
    private int A;
    private boolean x;

    public yF() {
        super("Throwpot", "Throws or consumes healing items upon pressing keybind");
        this.C.a(new BasicValue[]{this.v});
        this.a(this.F, this.w, this.H, this.C, this.v, this.D, this.u);
    }

    @Override
    public void s() {
        if (this.x) {
            this.d(false);
            return;
        }
        eP eP2 = ds_2.k().aU();
        this.A = eP2.i();
        if (this.S()) {
            this.x = true;
            this.a(0L, false);
        } else {
            this.d(false);
        }
    }

    @Override
    public void J() {
        this.z.clear();
    }

    private void e(int n6) {
        if (!this.C.u().booleanValue()) {
            ds_2.k().aU().a(n6);
            return;
        }
        int n10 = ds_2.k().aU().i();
        while (true) {
            ds_2.k().aU().a(n10);
            try {
                Thread.sleep(this.v.a().longValue());
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

    @Override
    public void q() {
        if (!this.x) {
            return;
        }
        try {
            int n6 = ds_2.s().s().i();
            int n10 = ds_2.s().y().i();
            this.z.sort(new yw(this.A));
            for (u_ u_2 : this.z) {
                this.e(u_2.a());
                ei_0.a(n6, true);
                ei_0.a(n6);
                Thread.sleep(51L);
                ei_0.a(n6, false);
                if (this.u.u().booleanValue() && u_2.c().k().a(A5.bU)) {
                    ei_0.a(n10, true);
                    ei_0.a(n10);
                    Thread.sleep(51L);
                    ei_0.a(n10, false);
                }
                Thread.sleep((long)this.H.t());
            }
            this.e(this.A);
        }
        catch (Exception exception) {
            this.x = false;
            exception.printStackTrace();
        }
        this.x = false;
    }

    @Override
    public void a(kf_0 kf_02) {
        if (!this.x && this.N()) {
            this.d(false);
        }
    }

    private boolean S() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 9; ++i) {
            arrayList.add(i);
        }
        if (this.D.u().booleanValue()) {
            Collections.shuffle(arrayList);
        }
        Object[] objectArray = ds_2.k().aU().h();
        int n6 = 0;
        for (Integer n10 : arrayList) {
            boolean bl;
            fk_0 fk_02;
            fG fG2 = new fG(objectArray[n10]);
            if (fG2.e() || (fk_02 = fG2.k()).e()) continue;
            boolean bl2 = this.F.v().equals(this.y) || this.F.v().equals(this.E);
            boolean bl3 = bl = this.F.v().equals(this.G) || this.F.v().equals(this.E);
            if (A5.bU.isInstance(fk_02.a()) && bl2) {
                if (this.w.v().equals(this.B)) {
                    this.z.add(new u_(n10, fG2));
                    break;
                }
                int n11 = 8;
                if ((double)(n6 + n11) + Math.floor(ds_2.k().aD()) > (double)ds_2.k().at()) continue;
                n6 += n11;
                this.z.add(new u_(n10, fG2));
            }
            if (!A5.dx.isInstance(fk_02.a()) || !bl) continue;
            if (this.w.v().equals(this.B)) {
                this.z.add(new u_(n10, fG2));
                break;
            }
            fh_0 fh_02 = new fh_0(fk_02.a());
            if (!nH.a(fG2)) continue;
            int n12 = 0;
            n12 = fh_02.c(fG2).get(0).toString().contains(" x ") ? (n12 += 4 * Integer.parseInt(fh_02.c(fG2).get(0).toString().split(" x ")[1].split(",")[0])) : (n12 += 4);
            if ((double)(n6 + n12) + Math.floor(ds_2.k().aD()) > (double)ds_2.k().at()) continue;
            n6 += n12;
            this.z.add(new u_(n10, fG2));
        }
        return !this.z.isEmpty();
    }
}

