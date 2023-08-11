/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import org.lwjgl.input.Keyboard;
import rip.vape.module.Module;

class bD
implements vK {
    final Module c;
    final vK b;
    final s7 a;

    bD(s7 s72, Module y52, vK vK2) {
        this.a = s72;
        this.c = y52;
        this.b = vK2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (this.c.p() && n11 == 0) {
            if (this.c.c().isEmpty()) {
                s7.a(this.a, "Must be bound", 1500L);
            } else {
                s7.a(this.a, "Must use bind", 1500L);
            }
        }
        if (Keyboard.isKeyDown((int)42)) {
            s7.c(this.a).run();
        } else if (this.a.Y().G()) {
            this.b.a(n6, n10, n11);
        }
    }
}

