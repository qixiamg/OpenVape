/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.d;
import com.google.common.collect.ImmutableList;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.zu
 */
public class zu_0
extends Module {
    private static final int ai = 2;
    private static final List<Cp> C = new ArrayList<Cp>();
    public static zu_0 T;
    public static Color ae;
    private static boolean N;
    private static rl_0 I;
    private final boolean ac = false;
    public int U = 0;
    public BooleanValue G = BooleanValue.createValue((Object)this, "Blur Background", true, "Blur the background of the GUI");
    public BooleanValue aa = BooleanValue.createValue((Object)this, "Rescale", true, "Rescales the GUI");
    public BooleanValue y = BooleanValue.createValue((Object)this, "Enable Multi-Keybinding", false, "Allows you to set multiple keys to be held together\nto toggle modules");
    public BooleanValue w = BooleanValue.createValue((Object)this, "GUI bind indicator", true, "Displays a message indicating your GUI keybind upon injecting.\nI.E. \"Press RSHIFT to open GUI\"");
    public BooleanValue af = new dm_0(this, this, "Smooth Font", true);
    public BooleanValue v = BooleanValue.createValue((Object)this, "Show Tooltips", true, "Toggles visibility of these");
    public DF X = DF.a(this, "Rainbow speed", "#.#", "", 0.1, 1.0, 10.0, 0.1, "Adjusts the speed of rainbow values");
    public BooleanValue an = BooleanValue.createValue(this, "Discord integration", false);
    public BooleanValue F = BooleanValue.createValue((Object)this, "Notifications", true, "Shows notifications");
    public BooleanValue M = BooleanValue.createValue((Object)this, "Toggle Alert", false, "Notifies you if a module is enabled/disabled.");
    public final pb_0 ao;
    public final pb_0 K;
    public DX aj;
    public final pb_0 O;
    public final pb_0 ad;
    public final pb_0 am;
    public DX R;
    public boolean Q = true;
    private boolean u;
    private int A = -1;
    private boolean J;
    private bz_0 L;
    private bz_0 S;
    public bz_0 B;
    public bz_0 ab;
    private bz_0 Z;
    private bz_0 al;
    private r1 D;
    private r1 x;
    private sb_0 H;
    public static wM W;
    public static xn_0 ah;
    public static boolean E;
    private static List<we_0> V;
    private static we_0 Y;
    private static DU ak;
    private boolean ag = false;
    private static ImmutableList<we_0> P;
    private static String z;

    public static void V() {
        V.clear();
        V.add(new w6());
        V.add(new wT());
        V.add(new wp_0());
        V.add(new wy_0(CQ.c));
        V.add(new wy_0(CQ.f));
        V.add(new wy_0(CQ.d));
        V.add(new wy_0(CQ.a));
        V.add(new wy_0(CQ.e));
        V.add(new wy_0(CQ.h));
        V.add(new w0());
        V.add(new wv_0());
        V.add(new wF());
        V.add(new wX());
        V.add(new wY());
        V.add(new wJ());
        V.add(new wL());
        V.add(new wC());
        V.add(new w2());
        V.add(new wr_0());
        V.add(new wm_0());
        V.add(new wE());
        V.add(new wP());
        P = ImmutableList.copyOf(V);
    }

    public zu_0() {
        super("GUI", 54, 0, CQ.b, "Shift click any module button to bind it to a key.\n(You can shift click this to bind the GUI)\nHold TAB to view modules binds.");
        T = this;
        this.A = ds_2.s().x();
        ((qD)this.af.getDefaultValue()).a(new ax_0(this));
        this.O = new pb_0("Floating", 0.8);
        this.ad = new pb_0("Integrated", 0.8);
        this.am = new pb_0("None", 0.8);
        this.R = DX.a((Object)this, "Search bar style", "Switch between search bar styles", this.O, this.ad, this.am, this.O);
        this.ao = new pb_0("Old theme", 0.8);
        this.K = new pb_0("New theme", 0.8);
        this.aj = DX.a((Object)this, "GUI Theme", "Switch between the old and new gui themes", this.K, this.K, this.ao);
        ((rz_0)this.aj.getDefaultValue()).a(new ae_0(this));
        this.F.a(new BasicValue[]{this.M});
        this.a(this.aj, this.G, this.aa, this.y, this.w, this.af, this.v, this.an, this.F, this.M, this.X, this.R);
    }

    public static void a(rl_0 rl_02) {
        I = rl_02;
    }

    public static void b(rl_0 rl_02) {
        if (I != null && I.equals(rl_02)) {
            I.a(false);
            I = null;
        }
    }

    public static void X() {
        if (I != null && zu_0.T.v.u().booleanValue() && I.e()) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)0.0, (double)300.0);
            o7.b(I.t() - 1.0, I.k() - 2.0, I.t() + I.q() + 4.0, I.k() + I.b() + 2.0, 0.0, 0.0, 0.0, 0.8);
            I.c(true);
            GL11.glPopMatrix();
        }
    }

    public static void a(Cp cp) {
        C.add(cp);
    }

    public void ae() {
        this.a(this.L);
    }

    public void aj() {
        ng.d.an();
        this.a(this.S);
    }

    public void a(ry_0 ry_02) {
        this.a(this.Z);
        ng.h.a(ry_02);
    }

    @Override
    public void z() {
        super.z();
        if (this.N()) {
            if (this.aa.u().booleanValue() && this.Q) {
                this.A = ds_2.s().x();
                ds_2.s().c(2);
            }
            ds_2.a(new dx_1(d.getGuiObject()));
            this.Q = false;
        } else {
            this.Q = true;
            this.g(false);
        }
    }

    public void c(ke_0 ke_02) {
        on.p.t().r.L();
    }

    public void b(kf_0 kf_02) {
        if (ds_2.x().d() && ds_2.x().a(A5.O) && this.d()) {
            this.a(this.ab);
            this.z();
        }
        on.p.I().a(this.an.u());
        on.p.t().g();
        if (W != null && !W.b()) {
            W = null;
        }
        for (we_0 object : V) {
            object.z();
        }
        if (this.aa.u().booleanValue()) {
            if (this.A == -1) {
                this.A = ds_2.s().x();
                ds_2.s().c(2);
            }
        } else if (this.A != -1) {
            ds_2.s().c(this.A);
            this.A = -1;
        }
        if (this.U++ > 20) {
            this.U = 0;
        }
        if (kf_02.a() == da_0.b) {
            for (BasicValue ds_02 : on.p.o().a()) {
                Object object;
                if (!(ds_02 instanceof ColorValue) || !((ColorValue)(object = (ColorValue)ds_02)).J()) continue;
                ((ColorValue)object).y();
            }
            for (Module y52 : on.p.H().e()) {
                for (BasicValue ds_03 : y52.r()) {
                    ColorValue dE;
                    if (!(ds_03 instanceof ColorValue) || !(dE = (ColorValue)ds_03).J()) continue;
                    dE.y();
                }
            }
        }
    }

    public void W() {
        int n6 = GL11.glGetInteger((int)3009);
        float f10 = GL11.glGetFloat((int)3010);
        GL11.glAlphaFunc((int)516, (float)0.0f);
        if (ds_2.x().e() || !ds_2.x().a().getClass().isInstance(d.getGuiObject())) {
            boolean bl = this.aa.u() != false && ng.b.ar.u() != false;
            float f11 = 0.0f;
            if (bl) {
                float f12 = zu_0.ac();
                f11 = 1.0f / f12;
                GL11.glScalef((float)f12, (float)f12, (float)f12);
            }
            this.al();
            if (bl) {
                GL11.glScalef((float)f11, (float)f11, (float)f11);
            }
        }
        GL11.glAlphaFunc((int)n6, (float)f10);
    }

    public static float ac() {
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        int n6 = d0_02.f();
        return (float)(n6 == 5 ? 0.4 : (n6 == 4 ? 0.5 : (n6 == 3 ? 0.66666 : (n6 == 2 ? 1.0 : (n6 == 1 ? 2.0 : (n6 == 0 ? 0.5 : 1.0))))));
    }

    public Color a(Object object) {
        if (!A5.cF.isInstance(object)) {
            return null;
        }
        if (object.equals(ds_2.k())) {
            return null;
        }
        ej_0 ej_02 = new ej_0(object);
        float f10 = ej_02.a(ds_2.k());
        if (A5.L.isInstance(object)) {
            if (on.p.N().c(ej_02.S()) && on.p.N().recolorVisuals.u().booleanValue()) {
                return on.p.N().friendsColor.K();
            }
            if (on.p.b().a(ej_02.S()) && on.p.b().c.u().booleanValue()) {
                return on.p.b().e.K();
            }
            return Color.WHITE;
        }
        return null;
    }

    private void al() {
        nx_0.c().d();
        if (this.ab()) {
            for (we_0 we_02 : V) {
                if (!we_02.b() || !we_02.ai()) continue;
                we_02.B();
            }
        } else {
            for (r1 r12 : on.p.F().d()) {
                if (r12.ai()) {
                    r12.c(true);
                    continue;
                }
                if (!(r12 instanceof r2)) continue;
                ((r2)r12).p(true);
            }
        }
    }

    public List<r1> Y() {
        CopyOnWriteArrayList<r1> copyOnWriteArrayList = new CopyOnWriteArrayList<r1>();
        copyOnWriteArrayList.addAll(this.al.a());
        return copyOnWriteArrayList;
    }

    public void a(d0_0 d0_02) {
        if (this.ab()) {
            this.b(d0_02);
        } else {
            this.c(d0_02);
        }
    }

    public void U() {
        double d3 = 32.0;
        double d4 = 32.0;
        double d5 = 0.0;
        for (we_0 we_02 : P) {
            if (!we_02.ab() || !we_02.ag()) continue;
            if (d3 + we_02.e() > (double)ds_2.p().g()) {
                d3 = 24.0;
                d4 += d5 + 8.0;
                d5 = 0.0;
            }
            if (we_02.f() > d5) {
                d5 = we_02.f();
            }
            we_02.c(d3);
            we_02.a(d4);
            we_02.M();
            d3 += we_02.e() + 2.0;
        }
    }

    private void b(d0_0 d0_02) {
        this.af.setType((Boolean)true);
        CopyOnWriteArrayList<we_0> copyOnWriteArrayList = new CopyOnWriteArrayList<we_0>();
        copyOnWriteArrayList.addAll(V);
        CopyOnWriteArrayList<we_0> copyOnWriteArrayList2 = new CopyOnWriteArrayList<we_0>();
        copyOnWriteArrayList2.addAll(copyOnWriteArrayList);
        Collections.reverse(copyOnWriteArrayList);
        for (we_0 we_02 : copyOnWriteArrayList2) {
            if (!we_02.b()) continue;
            if (we_02.x()) {
                we_0 we_03;
                boolean bl = true;
                Iterator iterator = copyOnWriteArrayList.iterator();
                while (iterator.hasNext() && !(we_03 = (we_0)iterator.next()).equals(we_02)) {
                    if (!we_03.b() || !we_03.x()) continue;
                    bl = false;
                }
                if (bl) {
                    we_02.E();
                }
            }
            we_02.C();
        }
        if (ah != null) {
            ah.C();
        }
        if (W != null) {
            boolean bl = W.y();
            W.e(false);
            W.C();
            W.e(bl);
            if (W.F() != null && W.F().U()) {
                W.F().Z();
            }
        }
        for (we_0 we_02 : copyOnWriteArrayList2) {
            if (we_02.b() && we_02.j(d0_02)) {
                we_02.aj().a(true);
                we_02.aj().C();
                continue;
            }
            we_02.aj().a(false);
        }
    }

    private void c(d0_0 d0_02) {
        List<r1> list = this.Y();
        ArrayList<rg_0> arrayList = new ArrayList<rg_0>();
        for (r1 qp2 : list) {
            if (!qp2.e()) {
                if (!qp2.ae()) continue;
                qp2.c();
                continue;
            }
            qp2.c();
            qp2.c(false);
            boolean bl = qp2.a(d0_02);
            if (bl && Keyboard.isKeyDown((int)62)) {
                qp2.i(d0_02);
                qp2.k(d0_02);
            }
            if (!bl) continue;
            boolean bl2 = qp2.h(d0_02);
            boolean bl3 = qp2.d(d0_02);
            String string = qp2.H();
            double d3 = ds_2.m().c(string);
            double d4 = ds_2.m().b(string);
            double d5 = bl2 ? (double)d0_02.g() - d3 : qp2.t();
            double d6 = bl3 ? (double)d0_02.h() - d4 : qp2.k();
            rg_0 rg_02 = qp2.ab();
            rg_02.a(d5 - 4.0);
            rg_02.d(d6);
            rg_02.c(rg_02.z().H() + 4.0);
            rg_02.b(10.0);
            rg_02.a(true);
            arrayList.add(rg_02);
        }
        for (rg_0 rg_03 : arrayList) {
            rg_03.c();
            rg_03.c(true);
        }
    }

    public void af() {
        for (we_0 we_02 : V) {
            if (!we_02.af() || !we_02.b()) continue;
            d0_0 d0_02 = ds_2.p();
            we_02.a((double)d0_02.g() / 2.0 - we_02.e() / 2.0, (double)d0_02.h() / 2.0 - we_02.f() / 2.0);
        }
        zu_0.b(w6.class).aq();
    }

    public void b(Object object) {
        on.p.M().aA.a(object);
        ng.f.al();
        zu_0.b(I);
        if (this.al.equals(this.ab) || this.al.equals(this.B)) {
            this.ae();
        } else if (!this.al.equals(this.L)) {
            this.ae();
            on.p.c(true);
            return;
        }
        if (this.aa.u().booleanValue() && this.A != -1) {
            ds_2.s().c(this.A);
        }
        if (on.p.H().b(zu_0.class).G.u().booleanValue()) {
            nx_0.c().b();
        }
        if (!on.p.s) {
            this.z();
        }
    }

    public boolean ad() {
        return this.Q;
    }

    public boolean Z() {
        return this.J;
    }

    public void g(boolean bl) {
        this.J = bl;
    }

    @Override
    public void k() {
        N = this.af.u();
        this.al = this.L = new bz_0(on.p.F().d());
        this.S = new bz_0(ng.d, ng.p, ng.r);
        this.B = new bz_0(ng.j);
        this.ab = new bz_0(ng.i);
        this.Z = new bz_0(ng.h);
        this.L.a().addAll(ng.a.am());
    }

    public void am() {
        int i12 = GL11.glGetInteger((int)3009);
        float f22 = GL11.glGetFloat((int)3010);
        GL11.glAlphaFunc((int)516, (float)0.0f);
        if (this.G.u().booleanValue()) {
            nx_0.c().f();
        } else {
            nx_0.c().b();
        }
        nx_0.c().d();
        d0_0 v32 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        dr_1 v4 = ds_2.m();
        String v5 = "";
        v4.d(v5, (double)(v32.g() - v4.c(v5) - 10), (double)(v32.h() - 10), -1);
        DU v62 = new DU(0.0, 0.0, v32.g(), v32.h());
        if (ak != null && (v62.d() != ak.d() || v62.c() != ak.c())) {
            this.af();
        }
        ak = v62;
        this.a(v32);
        ng.f.p(false);
        if (!this.ab()) {
            zu_0.X();
        }
        GL11.glAlphaFunc((int)i12, (float)f22);
    }

    public void f(boolean bl) {
        this.u = bl;
    }

    public boolean ah() {
        return this.u;
    }

    public bz_0 ak() {
        return this.al;
    }

    public void a(bz_0 bz_02) {
        if (this.al != bz_02) {
            zu_0.b(I);
        }
        this.al.a(null);
        this.al = bz_02;
    }

    public void a(r1 r12) {
        if (r12 instanceof rE || this.al == null || this.al.a() == null) {
            return;
        }
        List<r1> list = this.al.a();
        if (!list.contains(r12)) {
            return;
        }
        list.remove(r12);
        list.add(r12);
    }

    public void b(r1 r12) {
        this.x = r12;
    }

    public void a(int n6, int n10, int n11) {
        if (this.ab()) {
            bo_0 bo_02 = o7.b();
            uW uW2 = new uW(bo_02.a, bo_02.b, c2_0.a(n11));
            if (W != null) {
                boolean bl = !(W instanceof x4);
                W.b(uW2);
                if (bl) {
                    return;
                }
            }
            CopyOnWriteArrayList<we_0> copyOnWriteArrayList = new CopyOnWriteArrayList<we_0>(V);
            Collections.reverse(copyOnWriteArrayList);
            for (we_0 we_02 : copyOnWriteArrayList) {
                if (!we_02.b() || !we_02.aj().b() || !we_02.aj().x()) continue;
                we_02.aj().J();
                return;
            }
            for (we_0 we_02 : copyOnWriteArrayList) {
                if (!we_02.b() || !we_02.q().b(uW2.a(), uW2.b())) continue;
                we_02.ac();
                we_02.b(uW2);
                break;
            }
        } else {
            r1 r12 = null;
            List<r1> list = this.Y();
            Collections.reverse(list);
            for (r1 r13 : list) {
                r13.b(n6, n10, n11);
            }
            for (r1 r13 : list) {
                if (!r13.a(n6, n10, n11)) continue;
                r12 = r13;
                break;
            }
            if (r12 != null) {
                if (r12 instanceof rc_0 && this.x != null) {
                    this.a(this.x);
                    this.x = null;
                } else {
                    this.a(r12);
                }
            }
        }
    }

    public static void a(we_0 we_02) {
        V.remove(we_02);
        V.add(we_02);
        Y = we_02;
    }

    public void aa() {
        List<r1> list = this.Y();
        Collections.reverse(list);
        for (r1 r12 : list) {
            if (!r12.e() || !r12.g()) continue;
            this.D = r12;
            break;
        }
    }

    public static List<we_0> T() {
        return V;
    }

    public r1 ao() {
        return this.D;
    }

    public sb_0 S() {
        return this.H;
    }

    public void a(sb_0 sb_02) {
        this.H = sb_02;
    }

    public void a(sb_0 sb_02, boolean bl) {
        if (bl && this.H != null && !this.H.equals(sb_02)) {
            this.H.e(false);
        }
        if (bl) {
            // empty if block
        }
    }

    public static we_0 ap() {
        return Y;
    }

    public static void e(String string) {
        we_0 we_02 = null;
        for (we_0 we_03 : V) {
            if (!(we_03 instanceof wy_0) || !((wy_0)we_03).al().equalsIgnoreCase(string)) continue;
            we_03.a(!we_03.b());
            we_02 = we_03;
        }
        if (we_02 != null) {
            we_02.ac();
        }
    }

    public static void a(Class clazz) {
        Object t = zu_0.b(clazz);
        if (t != null) {
            ((we_0)t).a(!((wM)t).b());
            ((we_0)t).ac();
        }
    }

    public static <T extends we_0> T b(Class<T> clazz) {
        for (we_0 we_02 : V) {
            if (!we_02.getClass().getCanonicalName().equals(clazz.getCanonicalName())) continue;
            return (T)we_02;
        }
        return null;
    }

    public static we_0 f(String string) {
        for (we_0 we_02 : V) {
            if (!(we_02 instanceof wy_0) || !((wy_0)we_02).al().equalsIgnoreCase(string)) continue;
            return we_02;
        }
        return null;
    }

    public static void an() {
        for (we_0 we_02 : V) {
            if (!(we_02 instanceof wy_0) || we_02 instanceof wT) continue;
            int n6 = ((wy_0)we_02).ao();
            if (!(we_02.Y() instanceof xW)) continue;
            ((xW)we_02.Y()).a(n6);
        }
    }

    public static void a(CQ cQ) {
        for (we_0 we_02 : V) {
            if (!zu_0.T.R.v().equals(zu_0.T.ad) && we_02 instanceof wT || !(we_02 instanceof wy_0) || !((wy_0)we_02).an().equals(cQ)) continue;
            int n6 = ((wy_0)we_02).ao();
            if (!(we_02.Y() instanceof xW)) continue;
            ((xW)we_02.Y()).a(n6);
        }
    }

    public static boolean aq() {
        for (we_0 we_02 : V) {
            if (!we_02.af() || !we_02.b()) continue;
            return true;
        }
        return false;
    }

    public boolean ab() {
        if (this.ak() != null && (this.ak().equals(this.ab) || this.ak().equals(this.B))) {
            return false;
        }
        return this.aj == null || this.aj.v().equals(this.K);
    }

    public static boolean ag() {
        return N;
    }

    static boolean e(boolean bl) {
        N = bl;
        return N;
    }

    static boolean a(zu_0 zu_02) {
        return zu_02.ag;
    }

    static boolean a(zu_0 zu_02, boolean bl) {
        zu_02.ag = bl;
        return zu_02.ag;
    }

    static {
        ae = Color.WHITE;
        zu_0.g(null);
        V = new CopyOnWriteArrayList<we_0>();
    }

    public static void g(String string) {
        z = string;
    }

    public static String ai() {
        return z;
    }
}

