/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rl_0;
import manthe.so_0;

class A
extends Thread {
    final rl_0 d;

    final String e;
    final long b;
    final String a;
    final so_0 c;

    A(so_0 so_02, rl_0 rl_02, String string, long l6, String string2) {
        this.c = so_02;
        this.d = rl_02;
        this.e = string;
        this.b = l6;
        this.a = string2;
    }

    @Override
    public void run() {
        this.d.a(this.e);
        try {
            Thread.sleep(this.b);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.d.a(this.a);
    }
}

