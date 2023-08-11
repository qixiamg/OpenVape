/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.kZ;
import manthe.si_0;
import org.lwjgl.input.Keyboard;

/*
 * Renamed from manthe.sx
 */
public class sx_0
extends si_0 {
    public sx_0() {
        super(A5.cM, V.c() == 13 ? 3 : 0);
    }

    @Override
    public void a(Object object) {
        if (Keyboard.isRepeatEvent()) {
            return;
        }
        kZ kZ2 = new kZ(Keyboard.getEventKey(), Keyboard.getEventKeyState());
        kZ2.fire();
    }
}

