/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.Iterator;
import manthe.AV;
import manthe.rm_0;
import manthe.sb_0;
import manthe.vK;

/*
 * Renamed from manthe.vv
 */
class vv_0
implements vK {
    final sb_0 b;
    final rm_0 a;

    vv_0(rm_0 rm_02, sb_0 sb_02) {
        this.a = rm_02;
        this.b = sb_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (this.b.C().E().length() > 0) {
            ArrayList arrayList = new ArrayList(rm_0.d(this.a));
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                AV aV = (AV)iterator.next();
                String string = this.b.C().E().toLowerCase();
                if (aV.r().toLowerCase().contains(string) || aV.l().toString().toLowerCase().contains(string)) continue;
                iterator.remove();
            }
            if (arrayList.isEmpty()) {
                rm_0.e(this.a).a(false);
                rm_0.b(this.a).a(false);
                rm_0.c(this.a).a(false);
                rm_0.a(this.a).a(false);
            } else {
                rm_0.a(this.a, arrayList, rm_0.c(this.a), rm_0.a(this.a));
                rm_0.e(this.a).a(false);
                rm_0.b(this.a).a(false);
                rm_0.c(this.a).a(true);
                rm_0.a(this.a).a(true);
            }
        } else {
            rm_0.e(this.a).a(true);
            rm_0.b(this.a).a(true);
            rm_0.c(this.a).a(false);
            rm_0.a(this.a).a(false);
        }
    }
}

