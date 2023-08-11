/*
 * Decompiled with CFR 0.152.
 */
package manthe;

class BW
implements R {
    final rx_0 a;

    BW(rx_0 rx_02) {
        this.a = rx_02;
    }

    public void a(p1 p12) {
        if (rx_0.b(this.a) && rx_0.c(this.a) != null) {
            rx_0.b(this.a, false);
            rx_0.i(this.a).v().clear();
            rx_0.i(this.a).a(!(rx_0.c(this.a) instanceof yU));
            rx_0.i(this.a).b((p1)rx_0.c(this.a).m().getDefaultValue());
            rx_0.i(this.a).b((p1)rx_0.c(this.a).q().getDefaultValue());
            rx_0.i(this.a).b((p1)rx_0.c(this.a).k().getDefaultValue());
            for (p1 p13 : rx_0.i(this.a).v()) {
                p13.c(rx_0.i(this.a).q());
                if (p13 instanceof sk_0) {
                    p13.b(6.0);
                    continue;
                }
                p13.b(10.0);
            }
        }
    }
}

