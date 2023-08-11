/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DU;
import manthe.sk_0;

class Dq
extends DU {
    final sk_0 e;

    Dq(sk_0 sk_02, double d3, double d4, double d5, double d6) {
        this.e = sk_02;
        super(d3, d4, d5, d6);
    }

    @Override
    public double a() {
        return sk_0.a(this.e);
    }

    @Override
    public double d() {
        return this.e.q();
    }
}

