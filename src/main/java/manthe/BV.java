/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.DO;
import manthe.ns_0;
import manthe.x4;
import manthe.zu_0;
import org.lwjgl.input.Keyboard;

class BV
implements DO {
    final x4 a;

    BV(x4 x42) {
        this.a = x42;
    }

    @Override
    public void a(char c2, int n6) {
        String string;
        this.a.P().d();
        if (n6 == 1) {
            zu_0.W = null;
            return;
        }
        if (n6 == 28) {
            this.a.Q();
            return;
        }
        if (c2 == '\u0016' && Keyboard.isKeyDown((int)29)) {
            this.a.c(ns_0.a());
            this.a.J = this.a.N().length();
            return;
        }
        if (c2 == '\u0003' && Keyboard.isKeyDown((int)29)) {
            ns_0.a(this.a.N());
            return;
        }
        if (Keyboard.isKeyDown((int)203)) {
            --this.a.J;
            return;
        }
        if (Keyboard.isKeyDown((int)205)) {
            ++this.a.J;
            return;
        }
        if (n6 == 14) {
            if (this.a.N().length() > 0) {
                --this.a.J;
                if (this.a.J < 0) {
                    return;
                }
                String string2 = this.a.N().substring(0, this.a.J) + this.a.N().substring(this.a.J + 1);
                this.a.c(string2);
            }
            return;
        }
        if (this.a.e(0.9).b(this.a.N()) > this.a.l()) {
            return;
        }
        if (c2 != '\u0000' && ((string = this.a.N()).length() > 0 || this.a.J == 0)) {
            String string3 = string.substring(0, this.a.J) + c2 + string.substring(this.a.J);
            this.a.c(string3);
            ++this.a.J;
        }
    }
}

