/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.dp_0;
import manthe.pc;
import manthe.rb_0;
import manthe.w3;
import manthe.ws_0;

/*
 * Renamed from manthe.Am
 */
class am_0
implements pc {
    final rb_0 a;
    final ws_0 b;

    am_0(ws_0 ws_02, rb_0 rb_02) {
        this.b = ws_02;
        this.a = rb_02;
    }

    @Override
    public void b() {
        ((w3)this.b.m()).Q().d();
        ((dp_0)((w3)this.b.m()).Q()).a(this.a);
        this.b.ak();
    }
}

