/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.Cj;
import manthe.D_;
import manthe.n8;
import manthe.ng;
import manthe.on;
import manthe.qd_0;
import manthe.r8;

/*
 * Renamed from manthe.pz
 */
class pz_0
extends Thread {
    final String a;
    final n8 b;

    pz_0(n8 n82, String string) {
        this.b = n82;
        this.a = string;
    }

    @Override
    public void run() {
        block21: {
            try {
                D_ d_ = on.p.w();
                qd_0 qd_02 = d_.a();
                if (qd_02 == null || !qd_02.a()) {
                    String string = this.b.a.ag.z().E();
                    if (string == null || string.equals("") || !r8.a(this.b.a).matcher(string).matches()) {
                        r8.b(this.b.a).z().a("Invalid Key!");
                        try {
                            Thread.sleep(3000L);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        r8.b(this.b.a).z().a(this.a);
                        r8.b(this.b.a).b(false);
                        return;
                    }
                    qd_0 qd_03 = d_.a(string);
                    if (qd_03 == null) {
                        r8.b(this.b.a).z().a("Invalid Key!");
                        try {
                            Thread.sleep(3000L);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                        r8.b(this.b.a).z().a(this.a);
                        r8.b(this.b.a).b(false);
                        return;
                    }
                    if (qd_03.a()) {
                        r8.b(this.b.a).z().a("Generate Alt");
                        this.b.a.ag.b(true);
                        if (on.p.D().e.u().booleanValue()) {
                            on.p.D().d.b(string);
                        }
                        break block21;
                    }
                    r8.b(this.b.a).z().a("No Active License!");
                    try {
                        Thread.sleep(3000L);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    r8.b(this.b.a).z().a(this.a);
                    r8.b(this.b.a).b(false);
                    return;
                }
                r8.b(this.b.a).z().a("Generating alt...");
                Cj cj = d_.b();
                if (cj == null) {
                    r8.b(this.b.a).z().a("Could not generate alt!");
                    try {
                        Thread.sleep(3000L);
                    }
                    catch (Exception exception) {}
                } else {
                    ng.i.a(cj);
                    r8.b(this.b.a).z().a("Generated Alt " + cj.c());
                    try {
                        Thread.sleep(1500L);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                r8.b(this.b.a).z().a("Generate Alt");
            }
            catch (Exception exception) {
                exception.printStackTrace();
                r8.b(this.b.a).z().a("An Exception Occurred!");
                try {
                    Thread.sleep(3000L);
                }
                catch (Exception exception2) {
                    // empty catch block
                }
                r8.b(this.b.a).z().a(this.a);
            }
        }
        r8.b(this.b.a).b(false);
    }
}

