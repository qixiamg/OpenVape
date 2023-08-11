/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.ak_0;
import manthe.ok_0;
import manthe.on;
import manthe.so_0;
import manthe.vK;
import org.lwjgl.input.Keyboard;

class pF
implements vK {
    final ok_0 b;
    final ak_0 c;
    final so_0 a;

    pF(so_0 so_02, ok_0 ok_02, ak_0 ak_02) {
        this.a = so_02;
        this.b = ok_02;
        this.c = ak_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 1) {
            if (!this.b.c()) {
                on.a("loaded modules");
                this.c.x();
                so_0.a(this.a, so_0.c(this.a).z(), "Loaded enabled", this.c.r(), 1000L);
            }
        } else if (n11 == 0) {
            if (Keyboard.isKeyDown((int)42)) {
                this.b.run();
            } else {
                on.a("Changed profile");
                on.p.l().d(this.c);
            }
        }
    }
}

