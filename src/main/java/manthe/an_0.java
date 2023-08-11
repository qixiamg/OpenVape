/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Iterator;
import manthe.A5;
import manthe.V;
import manthe.cy_0;
import manthe.e5;
import manthe.eq_0;
import manthe.f4;
import manthe.fG;
import manthe.fV;
import manthe.fb_0;
import manthe.fk_0;
import manthe.gz_0;

/*
 * Renamed from manthe.aN
 */
public class an_0 {
    public static fk_0 a(String string) {
        Iterator iterator = fk_0.j().f().iterator();
        String string2 = "";
        while (iterator.hasNext()) {
            cy_0 cy_02;
            Object object;
            if (V.c() == 13) {
                string2 = (String)iterator.next();
                object = fk_0.j().a(string2);
            } else {
                cy_02 = new gz_0(iterator.next());
                string2 = cy_02.f();
                object = fk_0.j().a(cy_02.a());
            }
            string2 = string2.replace("minecraft:", "");
            string2 = string2.toLowerCase();
            if (!A5.cg.isInstance(object)) continue;
            cy_02 = new fk_0(object);
            if (!string2.equalsIgnoreCase(string)) continue;
            return cy_02;
        }
        return null;
    }

    public static double a(fG fG2) {
        if (fG2.d() && fG2.k().a(A5.cN)) {
            fV fV2 = new fV(fG2.k());
            int n6 = fV2.m();
            return (double)n6 + (double)((100 - n6 * 4) * eq_0.a(0, fG2) * 4) * 0.0075;
        }
        return 0.0;
    }

    public static float b(fG fG2) {
        float f10;
        if (fG2 == null || !fG2.k().a(A5.bO) && !fG2.k().a(A5.aP)) {
            return 0.0f;
        }
        if (fG2.k().a(A5.bO)) {
            fb_0 fb_02 = new fb_0(fG2.k().a());
            f10 = fb_02.l();
        } else {
            f4 f42 = new f4(fG2.k().a());
            f10 = f42.k();
        }
        return (float)eq_0.a(e5.f().l(), fG2) * 1.25f + f10 + (float)eq_0.a(e5.g().l(), fG2) * 0.01f;
    }
}

