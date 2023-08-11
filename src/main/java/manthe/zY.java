/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class zY
extends Module {
    private final Dv A;
    private final DF v = DF.a(this, "Delay", "#", "", 0.0, 110.0, 300.0);
    private final Queue<n3> w = new ConcurrentLinkedQueue<n3>();
    private final AO D = new AO();
    private final HashMap<Class, Comparator> y = new HashMap();
    private final List<Integer> B = new ArrayList<Integer>();
    private final pb_0 u = new pb_0("On Key");
    private final pb_0 E = new pb_0("Toggle");
    private final DX F = DX.a((Object)this, "Activation", this.u, this.u, this.E);
    private final BooleanValue C = BooleanValue.createValue(this, "Open Inventory", true);
    private boolean G = true;
    private boolean z;
    private boolean x = false;

    public zY() {
        super("AutoHotbar", -6656, CQ.a, "Automatically arranges hotbar to your liking.\nDoes not work in creative.");
        this.A = Dv.a(this, "hotbar");
        this.F.a((BasicValue)this.C, this.E);
        this.a(this.F, this.C, this.v, this.A);
        this.U();
    }

    @Override
    public boolean p() {
        return this.F.v() == this.u;
    }

    public boolean V() {
        return this.N() && this.w.size() > 0 && (this.C.u() != false || ds_2.x().e());
    }

    private void U() {
        Ab ab = new Ab(this);
        nw nw2 = new nw(this);
        BA bA = new BA(this);
        cf_0 cf_02 = new cf_0(this);
        qe_0 qe_02 = new qe_0(this);
        this.y.put(A5.bO, ab);
        this.y.put(A5.cW, ab);
        this.y.put(A5.dW, nw2);
        this.y.put(A5.ay, nw2);
        this.y.put(A5.cZ, bA);
        this.y.put(A5.dx, cf_02);
        this.y.put(A5.c0, qe_02);
    }

    @Override
    public void s() {
        if (this.F.v() == this.u) {
            this.G = true;
            this.z = false;
        } else {
            this.G = false;
            this.z = false;
        }
        this.w.clear();
        this.D.d();
        this.B.clear();
    }

    @Override
    public void J() {
        super.J();
        this.G = false;
        this.z = false;
        this.w.clear();
        this.D.d();
        this.B.clear();
    }

    private fQ a(fQ fQ2, U u6) {
        fI fI2;
        Object object;
        if (ds_2.x().a(A5.bt)) {
            object = new de_1(ds_2.x());
            fI2 = ((de_1)object).l();
        } else {
            fI2 = ds_2.k().aY();
        }
        object = new ArrayList();
        if (u6.b(fQ2.f())) {
            object.add(fQ2);
        }
        for (fQ clazz : fI2.f()) {
            if (!u6.b(clazz.f()) || this.B.contains(clazz.g()) || object.contains(clazz)) continue;
            object.add(clazz);
        }
        if (!object.isEmpty()) {
            if (u6.e()) {
                fk_0 fk_02 = u6.g();
                Class<?> clazz = fk_02.a().getClass();
                if (this.y.containsKey(clazz)) {
                    Comparator comparator = this.y.get(clazz);
                    object.sort(comparator);
                    Collections.reverse(object);
                    if (u6.b(fQ2.f()) && comparator.compare(object.get(0), fQ2) == 0) {
                        return null;
                    }
                }
                return (fQ)object.get(0);
            }
            return (fQ)object.get(0);
        }
        return null;
    }

    private boolean e(int n6) {
        fI fI2;
        if (ds_2.x().a(A5.bt)) {
            de_1 de_12 = new de_1(ds_2.x());
            fI2 = de_12.l();
        } else {
            fI2 = ds_2.k().aY();
        }
        for (int i = 0; i < 9; ++i) {
            fQ fQ2 = fI2.a(36 + i);
            if (!fQ2.f().e()) continue;
            return i == n6;
        }
        return false;
    }

    private boolean a(fQ fQ2) {
        fG fG2 = fQ2.f();
        if (fG2.d()) {
            fk_0 fk_02 = fG2.k();
            return fk_02.d();
        }
        return false;
    }

    private List<fQ> a(fI fI2, fQ fQ2, U u6) {
        List<fQ> list = fI2.f();
        ArrayList<fQ> arrayList = new ArrayList<fQ>();
        fG fG2 = fQ2.f();
        if (fG2.d()) {
            for (int i = 9; i < list.size(); ++i) {
                fQ fQ3 = fI2.a(i);
                fG fG3 = fQ3.f();
                if (!fG3.d() || !u6.b(fG3) || this.B.contains(i)) continue;
                arrayList.add(fQ3);
            }
        }
        return arrayList;
    }

    private boolean S() {
        dx_1 dx_12 = ds_2.x();
        if (!dx_12.a(A5.ag)) {
            return false;
        }
        de_1 de_12 = new de_1(dx_12);
        fI fI2 = de_12.l();
        for (int i = 9; i < 36; ++i) {
            fQ fQ2 = fI2.a(i);
            fG fG2 = fQ2.f();
            if (!fG2.e()) continue;
            new py(u3.CLICK, i, 0, null).a(fI2.g(), this.w);
            return true;
        }
        return false;
    }

    private void T() {
        fG fG2 = ds_2.k().aU().f();
        if (fG2.d() && this.S()) {
            this.z = false;
            return;
        }
        if (this.F.v() == this.u) {
            this.d(false);
        }
        if (!ds_2.x().e()) {
            ds_2.k().aX();
            this.z = false;
        }
        this.w.clear();
        this.D.d();
        this.B.clear();
        this.z = false;
        this.x = false;
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        fI fI2;
        Object object;
        if (on.p.H().b(Ag.class).U() || on.p.H().b(z6.class).S() || on.p.H().b(zP.class).S() || on.p.t().c()) {
            this.w.clear();
            this.D.d();
            this.B.clear();
            return;
        }
        if (ds_2.k().a8().g()) {
            return;
        }
        if (this.z) {
            this.T();
            return;
        }
        if (ds_2.x().a(A5.bt) && this.F.v() == this.E && !this.C.u().booleanValue()) {
            return;
        }
        if (!ds_2.x().a(A5.ag) && (this.F.v() == this.u || this.C.u().booleanValue() && this.G)) {
            if (this.G) {
                int n6 = ds_2.s().t().i();
                ei_0.a(n6, true);
                ei_0.a(n6);
                ei_0.a(n6, false);
            } else if (this.F.v() == this.u) {
                this.d(false);
            }
            return;
        }
        this.G = false;
        this.z = false;
        if (this.w.size() > 0) {
            if (this.D.a(this.v.a().intValue())) {
                this.w.poll().a();
                this.D.d();
                this.x = true;
            }
            return;
        }
        if (ds_2.x().a(A5.ag)) {
            object = new de_1(ds_2.x());
            fI2 = ((de_1)object).l();
        } else {
            fI2 = ds_2.k().aY();
        }
        object = this.A.r();
        boolean bl = false;
        if (object.size() == 9) {
            for (int i = 0; i < 9; ++i) {
                boolean bl2;
                U u6 = (U)object.get(i);
                int n10 = 36 + i;
                fQ fQ2 = fI2.a(n10);
                fQ fQ3 = this.a(fQ2, u6);
                if (fQ3 == null) continue;
                fG fG2 = fQ2.f();
                fG fG3 = fQ3.f();
                if (fQ3.equals(fQ2)) {
                    List<fQ> list;
                    this.B.add(n10);
                    if (fG2.d() && fG2.n() < fG2.h() && !(list = this.a(fI2, fQ2, u6)).isEmpty()) {
                        fQ3 = list.get(0);
                    }
                }
                if (fQ3.equals(fQ2)) continue;
                if (this.C.u().booleanValue() && !ds_2.x().a(A5.ag)) {
                    this.G = true;
                    this.z = false;
                    return;
                }
                this.B.add(n10);
                this.B.add(fQ3.g());
                int n11 = 0;
                if (fG2.d()) {
                    n11 += fG2.h();
                }
                boolean bl3 = !this.a(fQ2);
                boolean bl4 = bl2 = this.e(i) && fQ3.g() < 36;
                new py(bl2 ? u3.SHIFTCLICK : (bl3 ? u3.SWAP : u3.MOVE), fQ3.g(), n10, null).a(fI2.g(), this.w);
                if ((n11 += fG3.n()) > fG3.h()) {
                    new py(u3.CLICK, fQ3.g(), n10, null).a(fI2.g(), this.w);
                }
                bl = true;
                break;
            }
        }
        if (!bl && this.F.v() == this.u) {
            this.z = true;
            this.D.d();
        }
        if (this.x && this.F.v() == this.E && this.C.u().booleanValue() && this.w.isEmpty()) {
            this.z = true;
        }
    }
}

