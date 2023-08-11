/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.na;
import manthe.ng;

/*
 * Renamed from manthe.Bs
 */
class bs_0
extends Thread {
    final String a;
    final na b;

    bs_0(na na2, String string) {
        this.b = na2;
        this.a = string;
    }

    @Override
    public void run() {
        this.b.a.af.z().a("Undone!");
        try {
            Thread.sleep(1000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.b.a.af.z().a(this.a);
        this.b.a.af.a(false);
        ng.i.u().b();
        this.b.a.af.b(false);
    }
}

