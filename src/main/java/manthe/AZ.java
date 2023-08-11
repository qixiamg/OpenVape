/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.AO;

public class AZ
extends AO {
    @Override
    public long c() {
        return System.nanoTime() - this.c;
    }

    @Override
    public boolean a(long l6) {
        return this.c() >= l6;
    }

    @Override
    public void d() {
        this.c = System.nanoTime();
    }
}

