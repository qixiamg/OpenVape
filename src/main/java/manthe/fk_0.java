/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import java.util.Map;
import manthe.V;
import manthe.cy_0;
import manthe.eu_0;
import manthe.fG;
import manthe.gG;
import manthe.iE;

/*
 * Renamed from manthe.fk
 */
public class fk_0
extends cy_0 {
    public fk_0(Object object) {
        super(object);
    }

    public static fk_0 a(String string) {
        Object object = iE.a(fk_0.a.M().bO, string);
        return object == null ? null : new fk_0(object);
    }

    public static int a(fk_0 fk_02) {
        return iE.c(fk_0.a.M().bO, fk_02.a());
    }

    public static fk_0 a(int n6) {
        return new fk_0(iE.a(fk_0.a.M().bO, n6));
    }

    public static gG j() {
        return new gG(iE.b(fk_0.a.M().bO));
    }

    public String g() {
        return iE.b(fk_0.a.M().bO, this.a());
    }

    public String b(fG fG2) {
        return iE.a(fk_0.a.M().bO, this.a(), fG2.a());
    }

    public String a(fG fG2) {
        return iE.b(fk_0.a.M().bO, this.a(), fG2.a());
    }

    public int h() {
        return fk_0.a(this);
    }

    public void a(fk_0 fk_02, List list) {
        iE.a(fk_0.a.M().bO, this.b, fk_02.a(), eu_0.f().a(), list);
    }

    public static Map i() {
        if (V.c() >= 15) {
            return iE.a(fk_0.a.M().bO);
        }
        return null;
    }

    public int f() {
        return iE.a(fk_0.a.M().bO, this.b);
    }
}

