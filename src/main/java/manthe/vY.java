/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.awt.Color;

class vY
implements R {
    final Module b;
    final s7 a;

    vY(s7 s72, Module y52) {
        this.a = s72;
        this.b = y52;
    }

    public void a(p1 p12) {
        if (this.b.L()) {
            this.a.H.d(Color.WHITE);
        } else {
            this.a.H.d(Color.GRAY);
        }
    }
}

