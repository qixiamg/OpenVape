/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.cv_0;

/*
 * Renamed from manthe.dk
 */
public class dk_2
extends cv_0 {
    public dk_2(Object object) {
        super(object);
    }

    public static dk_2 h() {
        try {
            return new dk_2(A5.dH.newInstance());
        }
        catch (Exception exception) {
            return null;
        }
    }

    public int g() {
        return dk_2.a.M().a1.a(this.b);
    }

    public void a(int n6) {
        dk_2.a.M().a1.a(this.b, n6);
    }

    public boolean i() {
        return dk_2.a.M().a1.b(this.b);
    }

    public void c(boolean bl) {
        dk_2.a.M().a1.a(this.b, bl);
    }
}

