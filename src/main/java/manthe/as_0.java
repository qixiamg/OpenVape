/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.wf_0;
import manthe.zu_0;

/*
 * Renamed from manthe.As
 */
class as_0
implements pc {
    final Class b;
    final wf_0 a;

    as_0(wf_0 wf_02, Class clazz) {
        this.a = wf_02;
        this.b = clazz;
    }

    @Override
    public void b() {
        zu_0.a(this.b);
    }
}

