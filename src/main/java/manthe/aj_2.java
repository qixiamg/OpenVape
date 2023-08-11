/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;

/*
 * Renamed from manthe.aj
 */
public class aj_2 {
    private DY g;
    private BooleanValue i;
    private BooleanValue c;
    private BooleanValue d;
    private BooleanValue f;
    private BooleanValue e;
    private BooleanValue j;
    private BooleanValue h;
    private static boolean b;

    public aj_2(DY dY, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.g = dY;
        this.i = BooleanValue.createValue((Object)dY, "Players" + dY.getValueName(), "Players", bl);
        this.c = BooleanValue.createValue((Object)dY, "Mobs" + dY.getValueName(), "Mobs", bl2);
        this.d = BooleanValue.createValue((Object)dY, "Peaceful" + dY.getValueName(), "Peaceful", bl3);
        this.f = BooleanValue.createValue((Object)dY, "Neutral" + dY.getValueName(), "Neutral", bl4);
        this.e = BooleanValue.createValue((Object)dY, "Ignore Naked" + dY.getValueName(), "Ignore naked", bl5);
        this.j = BooleanValue.createValue((Object)dY, "Ignore invisible" + dY.getValueName(), "Ignore invisible", bl6);
        this.h = BooleanValue.createValue((Object)dY, "Ignore behind walls" + dY.getValueName(), "Ignore behind walls", bl7);
    }

    public BooleanValue a() {
        return this.h;
    }

    public BooleanValue d() {
        return this.j;
    }

    public BooleanValue g() {
        return this.e;
    }

    public BooleanValue i() {
        return this.c;
    }

    public BooleanValue h() {
        return this.f;
    }

    public BooleanValue b() {
        return this.d;
    }

    public BooleanValue e() {
        return this.i;
    }

    public boolean a(ex_0 ex_02) {
        if (ex_02.e()) {
            return false;
        }
        if (ex_02.a(A5.dj)) {
            return false;
        }
        if (ex_02.equals(ds_2.k())) {
            return false;
        }
        if (!ex_02.a(A5.cF)) {
            return false;
        }
        if (V.c() > 13 && ex_02.a(A5.a8)) {
            return false;
        }
        ej_0 ej_02 = new ej_0(ex_02.a());
        if (ej_02.aD() <= 0.0f) {
            return false;
        }
        if (this.j.u().booleanValue() && pf_0.b(ej_02)) {
            return false;
        }
        if (this.h.u().booleanValue() && !ds_2.k().c(ex_02)) {
            return false;
        }
        if (on.p.N().a(ej_02)) {
            return false;
        }
        String string = ex_02.a().getClass().getName();
        boolean bl = ex_02.a(A5.L);
        boolean bl2 = ex_02.a(A5.P) || ex_02.a(A5.dK) || ex_02.a(A5.dI) || ex_02.a(A5.aV);
        boolean bl3 = ex_02.a(A5.ah) || string.contains(".passive.");
        boolean bl4 = ex_02.a(A5.cs);
        if (bl) {
            if (!this.i.u().booleanValue()) {
                return false;
            }
            if (on.p.b().a(ex_02.S())) {
                return true;
            }
        }
        if (bl2 && !this.c.u().booleanValue()) {
            return false;
        }
        if (bl3 && !this.d.u().booleanValue()) {
            return false;
        }
        if (bl4 && !this.f.u().booleanValue()) {
            return false;
        }
        if (this.e.u().booleanValue() && pf_0.a(ej_02)) {
            return false;
        }
        if (on.p.t().a(ej_02)) {
            return false;
        }
        return !on.p.t().b(ej_02);
    }

    public void a(String string) {
        BooleanValue[] dBArray = new BooleanValue[]{this.i, this.c, this.d, this.f, this.e, this.j, this.h};
        for (int i = 0; i < string.toCharArray().length; ++i) {
            if (dBArray.length <= i) {
                on.a("something went horribly wrong when deserializing target value");
                break;
            }
            dBArray[i].setType((Boolean)(string.charAt(i) == '1' ? 1 : 0));
        }
    }

    public String toString() {
        boolean[] blArray = new boolean[]{this.i.u(), this.c.u(), this.d.u(), this.f.u(), this.e.u(), this.j.u(), this.h.u()};
        StringBuilder stringBuilder = new StringBuilder();
        for (boolean bl : blArray) {
            stringBuilder.append(bl ? "1" : "0");
        }
        return stringBuilder.toString();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean f() {
        return b;
    }

    public static boolean c() {
        boolean bl = aj_2.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!aj_2.f()) {
            aj_2.b(true);
        }
    }
}

