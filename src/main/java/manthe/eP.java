/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.AbstractList;
import manthe.V;
import manthe.cy_0;
import manthe.fG;
import manthe.id_0;

public class eP
extends cy_0 {
    public eP(Object object) {
        super(object);
    }

    public int i() {
        return eP.a.M().br.e(this.b);
    }

    public void a(int n6) {
        eP.a.M().br.a(this.b, n6);
    }

    public Object[] h() {
        if (V.c() >= 23) {
            AbstractList abstractList = eP.a.M().br.f(this.b);
            return abstractList.toArray();
        }
        return eP.a.M().br.c(this.b);
    }

    public Object[] g() {
        if (V.c() >= 23) {
            AbstractList abstractList = id_0.b(eP.a.M().br, this.b);
            return abstractList.toArray();
        }
        return id_0.a(eP.a.M().br, this.b);
    }

    public fG b(int n6) {
        return new fG(eP.a.M().br.b(this.b, n6));
    }

    public fG f() {
        return new fG(id_0.c(eP.a.M().br, this.b));
    }
}

