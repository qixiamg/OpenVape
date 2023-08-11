/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.pc;
import manthe.wT;
import manthe.zu_0;

/*
 * Renamed from manthe.Ad
 */
public class ad_0
implements pc {
    private Class b;
    final wT a;

    public ad_0(wT wT2, Class clazz) {
        this.a = wT2;
        this.b = clazz;
    }

    @Override
    public void b() {
        zu_0.a(this.b);
    }

    public Class c() {
        return this.b;
    }
}

