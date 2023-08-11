/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class pK
implements Runnable {
    private final Module a;
    private final long b;
    private final boolean c;
    private boolean d = true;

    public pK(Module y52, long l6, boolean bl) {
        this.a = y52;
        this.b = l6;
        this.c = bl;
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(this.b);
                if (!this.a.N()) continue;
                this.a.q();
            }
            catch (Exception exception) {
                // empty catch block
            }
        } while (!on.p.x() && this.c && this.d);
    }

    public boolean a() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

