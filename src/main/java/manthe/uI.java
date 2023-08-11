/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.vT;

class uI {
    private final Object b;
    private final long a;

    private uI(Object object) {
        this.b = object;
        this.a = System.currentTimeMillis();
    }

    public Object a() {
        return this.b;
    }

    public boolean a(long l6) {
        long l10 = System.currentTimeMillis();
        return l10 - this.a > l6;
    }

    uI(Object object, vT vT2) {
        this(object);
    }
}

