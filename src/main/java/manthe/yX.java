/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class yX
extends y8 {
    private final pb_0 D = new pb_0("Both");
    private final pb_0 B = new pb_0("Pots");
    private final pb_0 C = new pb_0("Soup");
    private final DX z = DX.a((Object)this, "Type", this.D, this.D, this.B, this.C);
    private final DD u = DD.a((Object)this, "refill-alloweditems", "Non Junk Items", DD.m, Collections.emptyList());
    private final BooleanValue G = BooleanValue.createValue(this, "Vertical", false);
    private final BooleanValue E = BooleanValue.createValue(this, "Scatter", false);
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Hotbar clear", false, "Clears junk from your hotbar to refill.\nWhitelisted items will not be considered junk\nOnly one stack of each non-junk item is kept");
    private final dy_0 w = dy_0.createValue(this, "Delay", "#", "ms", 0.0, 75.0, 125.0, 200.0, 5.0);
    private final Queue<n3> A = new ConcurrentLinkedQueue<n3>();
    private final Random y = new Random();
    private de_1 F;
    private boolean x;

    public yX() {
        super("Refill", "Refills your hotbar with healing items.");
        this.v.a(new BasicValue[]{this.u});
        this.a(this.G, this.E, this.v, this.u, this.w, this.z);
    }

    @Override
    public void s() {
        if (this.T().size() == 0) {
            this.d(false);
            return;
        }
        if (!this.S()) {
            this.d(false);
            return;
        }
        int n6 = ds_2.s().t().i();
        ei_0.a(n6, true);
        ei_0.a(n6);
        ei_0.a(n6, false);
        this.a(0L, false);
    }

    private void a(int n6, int n10, int n11, int n12) {
        this.A.add(new n3(n6, n10, n11, n12));
    }

    @Override
    public void q() {
        try {
            block17: {
                int n6 = 0;
                do {
                    Thread.sleep(10L);
                    if (++n6 > 5) break block17;
                } while (!ds_2.x().a(A5.bt));
                this.F = new de_1(ds_2.x().a());
            }
            if (!ds_2.x().a(A5.bt)) {
                this.x = true;
                return;
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList arrayList2 = new ArrayList();
            int n10 = 0;
            List<Integer> list = this.T();
            int n11 = 9;
            while (n11 < 36) {
                fk_0 fk_02;
                fQ fQ2 = this.F.l().f().get(n11);
                Object object = fQ2.f();
                if (!((fG)object).e() && !(fk_02 = ((fG)object).k()).e() && nH.a((fG)object, this.z.v().equals(this.C) || this.z.v().equals(this.D))) {
                    arrayList.add(n11);
                }
                if (this.G.u().booleanValue()) {
                    n11 += 9;
                    if (++n10 != 3) continue;
                    ++n11;
                    n11 -= 27;
                    n10 = 0;
                    continue;
                }
                ++n11;
            }
            if (arrayList.isEmpty()) {
                this.x = true;
                return;
            }
            if (this.E.u().booleanValue()) {
                Collections.shuffle(arrayList);
            }
            for (n11 = 0; n11 < list.size() && n11 < arrayList.size(); ++n11) {
                arrayList2.add(arrayList.get(n11));
            }
            n11 = 0;
            for (Object object : arrayList2) {
                if (this.F.e() || !ds_2.x().equals(this.F)) {
                    this.x = true;
                    return;
                }
                boolean bl = false;
                int n12 = 0;
                if (this.v.u().booleanValue()) {
                    fk_0 fk_03;
                    n12 = list.get(n11);
                    fG fG2 = ds_2.k().aU().b(n12);
                    if (fG2.d() && (fk_03 = fG2.k()).d()) {
                        bl = true;
                    }
                }
                if (bl) {
                    this.a(this.F.l().g(), (Integer)object, 0, 0);
                    Thread.sleep((long)this.w.t());
                    this.a(this.F.l().g(), 36 + n12, 0, 0);
                    Thread.sleep((long)this.w.t());
                    this.a(this.F.l().g(), (Integer)object, 0, 0);
                    Thread.sleep((long)this.w.t());
                } else {
                    Thread.sleep((long)this.w.t() + (long)this.y.nextInt(10));
                    this.a(this.F.l().g(), (Integer)object, 0, 1);
                }
                ++n11;
            }
            while (!this.A.isEmpty()) {
                Thread.sleep(5L);
            }
            this.x = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (this.x) {
            if (!ds_2.x().e()) {
                ds_2.k().aX();
            }
            this.x = false;
            this.d(false);
        } else {
            while (!this.A.isEmpty()) {
                n3 n32 = this.A.poll();
                n32.a();
            }
        }
    }

    private boolean S() {
        boolean bl = false;
        for (int i = 9; i < 36; ++i) {
            fk_0 fk_02;
            fG fG2 = ds_2.k().aU().b(i);
            if (fG2.e() || (fk_02 = fG2.k()).e() || !nH.a(fG2, this.z.v().equals(this.C) || this.z.v().equals(this.D))) continue;
            bl = true;
        }
        return bl;
    }

    private List<Integer> T() {
        ArrayList<fG> arrayList = new ArrayList<fG>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Object[] objectArray = ds_2.k().aU().h();
        for (int i = 0; i < 9; ++i) {
            fG fG2 = new fG(objectArray[i]);
            if (fG2.e()) {
                arrayList2.add(i);
                continue;
            }
            if (this.v.u().booleanValue()) {
                if (!this.a(fG2.k(), fG2, arrayList)) continue;
                arrayList2.add(i);
                continue;
            }
            if (!fG2.toString().contains("tile.air")) continue;
            arrayList2.add(i);
        }
        return arrayList2;
    }

    private boolean a(fG fG2, List<fG> list) {
        for (fG fG3 : list) {
            if (fG2.equals(fG3) || !fG2.k().a().getClass().isInstance(fG3.k().a())) continue;
            return true;
        }
        return false;
    }

    private boolean a(fk_0 fk_02, fG fG2, List<fG> list) {
        if (nH.a(fG2, this.z.v().equals(this.C) || this.z.v().equals(this.D))) {
            return false;
        }
        if (this.u.a(fG2)) {
            if (!this.a(fG2, list)) {
                list.add(fG2);
                return false;
            }
            return true;
        }
        return true;
    }
}

