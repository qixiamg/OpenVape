/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.aj_0;

class CC
extends Thread {
    final aj_0 a;

    CC(aj_0 aj_02) {
        this.a = aj_02;
    }

    @Override
    public void run() {
        this.a.a.z().a("Loaded");
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.a.z().a("Load states");
    }
}

