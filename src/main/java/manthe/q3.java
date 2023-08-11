/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.rd_0;
import manthe.rl_0;

class q3
extends Thread {
    final rl_0 c;
    final String a;
    final long b;
    final String d;
    final rd_0 e;

    q3(rd_0 rd_02, rl_0 rl_02, String string, long l6, String string2) {
        this.e = rd_02;
        this.c = rl_02;
        this.a = string;
        this.b = l6;
        this.d = string2;
    }

    @Override
    public void run() {
        this.c.a(this.a);
        try {
            Thread.sleep(this.b);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.c.a(this.d);
    }
}

