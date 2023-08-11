/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.Comparator;

/*
 * Renamed from manthe.b_
 */
class b__0
implements Comparator<Module> {
    private b__0() {
    }

    public int a(Module y52, Module y53) {
        mq mq2 = on.p.j();
        return Double.compare(mq2.b(y53.H() + y53.w()), mq2.b(y52.H() + y52.w()));
    }

    b__0(yM yM2) {
        this();
    }
}

