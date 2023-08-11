/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import manthe.V;
import manthe.cy_0;
import manthe.e5;
import manthe.ec_0;
import manthe.ee_0;
import manthe.ex_0;
import manthe.ey_0;
import manthe.fG;
import manthe.fp_0;
import manthe.in_0;

/*
 * Renamed from manthe.eq
 */
public class eq_0
extends cy_0 {
    public eq_0(Object object) {
        super(object);
    }

    public static int a(int n6, fG fG2) {
        if (V.c() >= 23) {
            e5 e52 = e5.a(n6);
            return in_0.b(eq_0.a.M().bU, e52.a(), fG2.a());
        }
        return in_0.a(eq_0.a.M().bU, n6, fG2.a());
    }

    public static int a(ex_0 ex_02) {
        return in_0.a(eq_0.a.M().bU, ex_02.a());
    }

    public static float a(fG fG2, ey_0 ey_02) {
        return in_0.a(eq_0.a.M().bU, fG2.a(), ey_02.a());
    }

    public static int a(fG[] fGArray, fp_0 fp_02) {
        if (V.c() >= 23) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (fG fG2 : fGArray) {
                arrayList.add(fG2.a());
            }
            return in_0.a(eq_0.a.M().bU, arrayList, fp_02.a());
        }
        Object[] objectArray = new Object[fGArray.length];
        for (int i = 0; i < fGArray.length; ++i) {
            objectArray[i] = fGArray[i].a();
        }
        return in_0.a(eq_0.a.M().bU, objectArray, fp_02.a());
    }

    public static float b(fG fG2, ey_0 ey_02) {
        return in_0.a(eq_0.a.M().bU, fG2.a(), ey_02.a());
    }

    public static ee_0 f() {
        return new ee_0(in_0.a(eq_0.a.M().bU));
    }

    public static void a(ec_0 ec_02, fG[] fGArray) {
        if (V.c() >= 23) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (fG fG2 : fGArray) {
                arrayList.add(fG2.a());
            }
            in_0.a(eq_0.a.M().bU, ec_02.a(), arrayList);
            return;
        }
        Object[] objectArray = new Object[fGArray.length];
        for (int i = 0; i < fGArray.length; ++i) {
            objectArray[i] = fGArray[i].a();
        }
        in_0.a(eq_0.a.M().bU, ec_02.a(), objectArray);
    }
}

