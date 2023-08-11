/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.C8;
import manthe.R;
import manthe.p1;
import manthe.rV;
import manthe.rl_0;
import manthe.ya_0;
import org.lwjgl.input.Keyboard;

/*
 * Renamed from manthe.us
 */
class us_0
implements R {
    final ya_0 a;
    final rl_0 b;
    final rV c;

    us_0(rV rV2, ya_0 ya_02, rl_0 rl_02) {
        this.c = rV2;
        this.a = ya_02;
        this.b = rl_02;
    }

    public void a(p1 p12) {
        if (this.a.n() < 0) {
            this.b.a("  Bound to: " + C8.a(this.a.n()));
        } else {
            this.b.a("  Bound to: " + Keyboard.getKeyName((int)this.a.n()));
        }
    }
}

