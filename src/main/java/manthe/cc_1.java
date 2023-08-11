/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.function.Consumer;
import manthe.p1;
import manthe.r5;

/*
 * Renamed from manthe.cc
 */
class cc_1
implements Consumer<p1> {
    final double b;
    final r5 a;

    cc_1(r5 r52, double d3) {
        this.a = r52;
        this.b = d3;
    }

    public void a(p1 p12) {
        p12.c(this.b);
    }
}

