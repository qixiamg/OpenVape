/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Comparator;
import manthe.ej_0;
import manthe.ex_0;
import manthe.me_0;
import manthe.zO;

class tp
implements Comparator<ex_0> {
    final zO a;

    private tp(zO zO2) {
        this.a = zO2;
    }

    private float a(ex_0 ex_02) {
        ej_0 ej_02 = new ej_0(ex_02.a());
        float f10 = ej_02.aD();
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        if (this.a.u.u().booleanValue() && ej_02.aN() > 4) {
            f10 += (float)ej_02.aN();
        }
        return f10;
    }

    public int a(ex_0 ex_02, ex_0 ex_03) {
        return Float.compare(this.a(ex_02), this.a(ex_03));
    }

    tp(zO zO2, me_0 me_02) {
        this(zO2);
    }
}

