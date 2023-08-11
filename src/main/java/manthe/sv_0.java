/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.of;

/*
 * Renamed from manthe.sv
 */
class sv_0
extends Thread {
    final of a;

    sv_0(of of2) {
        this.a = of2;
    }

    @Override
    public void run() {
        this.a.b.z().a("Saved");
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.a.b.z().a("Save states");
    }
}

