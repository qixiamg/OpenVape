/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import manthe.CQ;
import manthe.cy_0;
import manthe.gt_0;
import manthe.ng;
import manthe.on;
import manthe.pb_0;
import manthe.t_0;

class mL
extends Thread {
    final boolean a;
    final on b;

    mL(on on2, boolean bl) {
        this.b = on2;
        this.a = bl;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
            if (on.C) {
                this.b.k();
            }
            CQ.a();
            pb_0.c.clear();
            pb_0.c = null;
            t_0.b_.clear();
            on.a(this.b).b();
            if (!on.c(this.b)) {
                this.b.j.g();
                this.b.j.d();
                this.b.j.b();
                this.b.j.b(gt_0.class.getClassLoader());
                this.b.j.f();
                this.b.j.a(gt_0.class.getClassLoader());
                this.b.j.c();
                this.b.j.e();
            } else {
                on.d(this.b).b();
            }
            Thread.sleep(1000L);
            on.b(this.b).c();
            ng.b();
            cy_0.a = null;
            on.p = null;
            a.a.exit(this.a);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

