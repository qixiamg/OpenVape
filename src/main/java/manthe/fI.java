/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.cy_0;
import manthe.fQ;
import manthe.is_0;

public class fI
extends cy_0 {
    public fI(Object object) {
        super(object);
    }

    public List<fQ> f() {
        List list = fI.a.M().h.a(this.b);
        ArrayList<fQ> arrayList = new ArrayList<fQ>();
        for (Object e10 : list) {
            arrayList.add(new fQ(e10));
        }
        return arrayList;
    }

    public int g() {
        return fI.a.M().h.b(this.b);
    }

    public fQ a(int n6) {
        return new fQ(is_0.a(fI.a.M().h, this.b, n6));
    }
}

