/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.Comparator;

/*
 * Renamed from manthe.vc
 */
class vc_0
implements Comparator<Module> {
    final mq b;
    final xE a;

    vc_0(xE xE2, mq mq2) {
        this.a = xE2;
        this.b = mq2;
    }

    public int a(Module y52, Module y53) {
        return Double.compare(this.b.b(y53.H() + y53.w()), this.b.b(y52.H() + y52.w()));
    }
}

