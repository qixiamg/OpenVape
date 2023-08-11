/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.lwjgl.input.Mouse;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;

public class z1
extends Module {
    private final dy_0 N = dy_0.createValue(this, "CPS", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    private final BooleanValue H = BooleanValue.createValue((Object)this, "Inventory Fill", false, "AutoClicker functions while in inventory for refilling items");
    private final BooleanValue B = BooleanValue.createValue(this, "Blockhit", false);
    private final BooleanValue y = BooleanValue.createValue(this, "Right Click Mode", false);
    private final BooleanValue C = BooleanValue.createValue((Object)this, "Break Blocks", false, "Allows you to break blocks");
    private final BooleanValue M = BooleanValue.createValue((Object)this, "Disable click delay", true, "Disables Minecraft's delay between attacks upon missing hits");
    private final DD v = DD.a((Object)this, "autoclicker-alloweditems", "Allowed Items", DD.m, new mD("swords"));
    private final dy_0 x = dy_0.createValue(this, "Right CPS", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    private final BooleanValue G = BooleanValue.createValue((Object)this, "Limit to items", false, "AutoClicker functions only while holding selected items");
    private final BooleanValue I = BooleanValue.createValue((Object)this, "Limit to items", false, "AutoClicker functions only while holding selected items");
    private final DD E = DD.a((Object)this, "autoclicker-alloweditems-right", "Allowed Items", DD.m, new mD("blocks"));
    private final uu_0 w = new uu_0(this, 0, true, true);
    private final uu_0 D = new uu_0(this, 1, false, false);
    private final Queue<nQ> L = new ConcurrentLinkedQueue<nQ>();
    boolean J = false;
    boolean z = false;
    int K;
    private int u;
    private boolean A;
    private boolean F = false;

    public z1() {
        super("AutoClicker", -62703, CQ.c, "Hold attack button to automatically click");
        this.G.a(new BasicValue[]{this.E});
        this.I.a(new BasicValue[]{this.v});
        this.y.a(this.x, this.G);
        this.a(this.H, this.B, this.C);
        if (V.c() >= 15) {
            this.a(this.M);
        }
        this.a(this.N, this.y, this.x, this.G, this.E, this.I, this.v);
    }

    private List<Integer> X() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Object[] objectArray = ds_2.k().aU().h();
        for (int i = 0; i < 9; ++i) {
            fG fG2 = new fG(objectArray[i]);
            if (!fG2.e()) continue;
            arrayList.add(i);
        }
        return arrayList;
    }

    @Override
    public void a(kf_0 kf_02) {
        if (V.c() >= 15 && this.M.u().booleanValue() && VapeSettings.f() && ds_2.x().e()) {
            ds_2.b(0);
        }
        if (this.C.u().booleanValue() && ds_2.x().e() && ds_2.k().a8().m()) {
            gb_0 gb_02 = ds_2.I();
            if (gb_02.d() && gb_02.g().equals(g4.f())) {
                if (VapeSettings.f()) {
                    ei_0 ei_02 = ds_2.s().m();
                    if (!ei_02.h()) {
                        uu_0.a(this.w);
                    }
                    if (this.z) {
                        uu_0.b(this.w);
                        this.z = false;
                    }
                }
                if (!this.H.u().booleanValue() || !ds_2.x().a(A5.bt)) {
                    this.J = true;
                    return;
                }
            } else if (VapeSettings.f()) {
                ei_0 ei_03 = ds_2.s().m();
                this.z = ei_03.h();
            }
        }
        this.J = false;
    }

    private boolean W() {
        return this.J;
    }

    @Override
    public void J() {
        ei_0 ei_02 = ds_2.s().m();
        ei_0 ei_03 = ds_2.s().s();
        ei_0.a(ei_02.i(), VapeSettings.f());
        if (VapeSettings.d()) {
            uu_0.a(this.D);
        }
    }

    @Override
    public void s() {
        if (!this.A) {
            this.A = true;
            new oG(this).start();
            new b2(this).start();
        }
    }

    private boolean V() {
        if (ds_2.x().d()) {
            return true;
        }
        if (!this.U()) {
            return true;
        }
        fG fG2 = ds_2.k().a_();
        return this.v.a(fG2, true);
    }

    private boolean U() {
        return this.I.u();
    }

    public boolean T() {
        if (ds_2.k().e()) {
            return false;
        }
        return this.V();
    }

    private boolean S() {
        if (ds_2.k().e()) {
            return false;
        }
        if (!this.G.u().booleanValue()) {
            return true;
        }
        fG fG2 = ds_2.k().a_();
        return this.E.a(fG2, true);
    }

    private void b(de_1 de_12) {
        int n6 = Mouse.getEventX() * de_12.h() / ds_2.F();
        int n10 = de_12.f() - Mouse.getEventY() * de_12.f() / ds_2.H() - 1;
        this.L.add(new nQ(n6, n10, null));
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        try {
            dx_1 dx_12 = ds_2.x();
            if (!dx_12.a(A5.bt)) {
                return;
            }
            if (!this.L.isEmpty()) {
                nQ nQ2 = this.L.poll();
                de_1 de_12 = new de_1(dx_12);
                this.a(de_12);
                this.L.clear();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(de_1 de_12) {
        boolean bl;
        int n6 = -1;
        int n10 = Mouse.getEventX() * de_12.h() / ds_2.F();
        int n11 = de_12.f() - Mouse.getEventY() * de_12.f() / ds_2.H() - 1;
        fQ fQ2 = de_12.a(n10, n11);
        int n12 = de_12.m();
        int n13 = de_12.p();
        boolean bl2 = bl = n10 < n12 || n11 < n13 || n10 >= n12 + de_12.n() || n11 >= n13 + de_12.j();
        if (fQ2.d()) {
            n6 = fQ2.g();
        }
        if (bl) {
            n6 = -1;
        }
        if (n6 >= 0) {
            boolean bl3 = false;
            fG fG2 = ds_2.k().aU().f();
            if (fG2.e()) {
                bl3 = true;
            }
            if (bl3) {
                int n14 = this.X().size();
                if (this.K != n6 && (n14 > 0 || n6 >= 36)) {
                    u5.a();
                    u5.d();
                    this.K = n6;
                }
            }
        }
    }

    static boolean a(z1 z12) {
        return z12.W();
    }

    static boolean f(z1 z12) {
        return z12.U();
    }

    static boolean l(z1 z12) {
        return z12.V();
    }

    static boolean c(z1 z12) {
        return z12.F;
    }

    static boolean a(z1 z12, boolean bl) {
        z12.F = bl;
        return z12.F;
    }

    static BooleanValue j(z1 z12) {
        return z12.H;
    }

    static uu_0 b(z1 z12) {
        return z12.w;
    }

    static BooleanValue h(z1 z12) {
        return z12.y;
    }

    static uu_0 k(z1 z12) {
        return z12.D;
    }

    static boolean g(z1 z12) {
        return z12.S();
    }

    static List i(z1 z12) {
        return z12.X();
    }

    static void a(z1 z12, de_1 de_12) {
        z12.b(de_12);
    }

    static BooleanValue m(z1 z12) {
        return z12.B;
    }

    static dy_0 d(z1 z12) {
        return z12.N;
    }

    static dy_0 e(z1 z12) {
        return z12.x;
    }
}

