/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import java.awt.Color;

import org.lwjgl.input.Keyboard;
import rip.vape.module.Module;

/*
 * Renamed from manthe.Cc
 */
class cc_0
implements R {
    final Module b;
    final zu_0 c;
    final s7 a;

    cc_0(s7 s72, Module y52, zu_0 zu_02) {
        this.a = s72;
        this.b = y52;
        this.c = zu_02;
    }

    public void a(p1 p12) {
        if (!s7.c(this.a).c()) {
            if (Keyboard.isKeyDown((int)15)) {
                if (!s7.b(this.a)) {
                    if (this.b.f()) {
                        this.a.W().z().a(this.b.g());
                        this.a.W().z().b(my_0.c);
                    }
                    s7.a(this.a, true);
                }
            } else {
                if (s7.a(this.a)) {
                    if (this.c.Z()) {
                        this.a.W().z().b(my_0.c);
                    } else {
                        this.a.W().z().b(my_0.i);
                    }
                }
                if (s7.b(this.a)) {
                    this.a.W().z().a(this.b.H());
                    s7.a(this.a, false);
                    this.a.W().z().b(my_0.i);
                }
            }
        }
        if (this.a.G()) {
            this.a.W().z().b(yI.a(this.a.W().f(), 45, 240));
        } else if (this.b.n() && !a.a.ib() || this.b.p() && this.b.c().isEmpty()) {
            this.a.W().z().b(Color.GRAY);
        } else {
            this.a.W().z().b(Color.WHITE);
        }
        if (s7.d(this.a)) {
            if (!this.c.Z()) {
                this.a.a(s7.f(this.a).G());
            } else {
                this.a.a(true);
            }
        }
    }
}

