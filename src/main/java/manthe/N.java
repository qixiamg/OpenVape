/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import manthe.V;
import manthe.dx_2;
import manthe.fG;
import manthe.fk_0;
import manthe.g9;

public class N {
    private static int a(String string, fk_0 fk_02) {
        Object object;
        if (fk_02.e()) {
            return -1;
        }
        fG fG2 = fG.a(fk_02);
        if (fG2.e()) {
            return -1;
        }
        List list = new ArrayList();
        if (V.c() >= 23) {
            list = (List)g9.f().a();
        }
        fk_02.a(fk_02, list);
        if (list.size() > 0) {
            object = list.iterator();
            while (object.hasNext()) {
                Object e10 = object.next();
                fG fG3 = new fG(e10);
                if (!fG3.j().equalsIgnoreCase(string)) continue;
                return fG3.m();
            }
        }
        if (((String)(object = fG2.j().toLowerCase())).equalsIgnoreCase(string)) {
            return fG2.m();
        }
        return -1;
    }

    public static int[] a(String string) {
        Object object;
        int[] nArray = new int[]{0, 0};
        Map map = fk_0.i();
        if (map != null) {
            object = map.keySet();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Object k = iterator.next();
                Object v = map.get(k);
                dx_2 dx_22 = new dx_2(k);
                fk_0 fk_02 = new fk_0(v);
                int n6 = N.a(string, fk_02);
                if (n6 == -1) continue;
                nArray[0] = dx_2.a(dx_22);
                nArray[1] = n6;
            }
        }
        if ((object = dx_2.a(string.replace(" ", "_"))) != null) {
            nArray[0] = dx_2.a((dx_2)object);
        }
        return nArray;
    }
}

