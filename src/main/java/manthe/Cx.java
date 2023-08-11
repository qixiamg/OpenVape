/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.function.Consumer;
import manthe.p1;
import manthe.rq_0;

class Cx
implements Consumer<p1> {
    final double b;
    final rq_0 a;

    Cx(rq_0 rq_02, double d3) {
        this.a = rq_02;
        this.b = d3;
    }

    public void a(p1 p12) {
        p12.c(this.b);
    }
}

