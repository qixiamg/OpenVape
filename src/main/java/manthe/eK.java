/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.V;
import manthe.cy_0;
import manthe.dr_1;
import manthe.eH;
import manthe.fG;
import manthe.ik_0;

public class eK
extends cy_0 {
    public eK(Object object) {
        super(object);
    }

    public static eK f() {
        return new eK(ik_0.a(eK.a.M().cj));
    }

    public void a(dr_1 dr_12, eH eH2, fG fG2, int n6, int n10) {
        if (V.c() == 13) {
            ik_0.a(eK.a.M().cj, this.b, dr_12.a(), eH2.a(), fG2.a(), n6, n10);
        } else {
            ik_0.a(eK.a.M().cj, this.b, fG2.a(), n6, n10);
        }
    }

    public void b(dr_1 dr_12, eH eH2, fG fG2, int n6, int n10) {
        if (V.c() == 13) {
            ik_0.b(eK.a.M().cj, this.b, dr_12.a(), eH2.a(), fG2.a(), n6, n10);
        } else {
            ik_0.a(eK.a.M().cj, this.b, dr_12.a(), fG2.a(), n6, n10);
        }
    }

    public float g() {
        return ik_0.a(eK.a.M().cj, this.b);
    }

    public void a(float f10) {
        ik_0.a(eK.a.M().cj, this.b, f10);
    }
}

