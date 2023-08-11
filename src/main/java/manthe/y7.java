/*
 * Decompiled with CFR 0.152.
 */
package manthe;

class y7 implements vK {
    final sI a;

    y7(sI sI2) {
        this.a = sI2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0) {
            if (this.a.z()) {
                this.a.f(false);
                sI.a(this.a, true);
            } else {
                this.a.f(true);
                sI.a(this.a, false);
            }
        }
    }
}

