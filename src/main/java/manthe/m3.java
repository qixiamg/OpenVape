/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.function.Consumer;
import manthe.p1;
import manthe.rx_0;

class m3
implements Consumer<p1> {
    final double a;
    final rx_0 b;

    m3(rx_0 rx_02, double d3) {
        this.b = rx_02;
        this.a = d3;
    }

    public void a(p1 p12) {
        if (p12.equals(this.b.aj())) {
            return;
        }
        p12.c(this.a - 2.0);
    }
}

