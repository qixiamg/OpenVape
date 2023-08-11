/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.util.ArrayList;
import java.util.Collections;
import manthe.ok_0;
import manthe.on;
import manthe.uU;
import manthe.zu_0;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Renamed from manthe.oc
 */
class oc_0
extends Thread {
    final ok_0 a;

    private oc_0(ok_0 ok_02) {
        this.a = ok_02;
    }

    @Override
    public void run() {
        zu_0 zu_02 = on.p.H().b(zu_0.class);
        this.a.a("Press a key");
        long l6 = Keyboard.getEventNanoseconds();
        long l10 = Mouse.getEventNanoseconds();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n6 = -1;
        int n10 = -1;
        while (true) {
            int n11;
            if (Thread.interrupted()) {
                return;
            }
            if (n6 != -1 && !Keyboard.isKeyDown((int)n6) || n10 != -1 && !Mouse.isButtonDown((int)n10) || arrayList.size() >= 3) break;
            if (l6 != Keyboard.getEventNanoseconds() && !Keyboard.isRepeatEvent() && Keyboard.getEventKeyState()) {
                l6 = Keyboard.getEventNanoseconds();
                n11 = Keyboard.getEventKey();
                if (arrayList.contains(n11)) continue;
                arrayList.add(n11);
                if (n6 == -1) {
                    n6 = n11;
                }
                if (this.a.a().startsWith("Bound")) {
                    this.a.a(this.a.a() + " + " + Keyboard.getKeyName((int)n11));
                } else {
                    this.a.a("Bound to " + Keyboard.getKeyName((int)n11));
                }
                if (!zu_02.y.u().booleanValue()) break;
                Keyboard.next();
                continue;
            }
            Keyboard.next();
            if (Keyboard.isKeyDown((int)42)) continue;
            if (l10 != Mouse.getEventNanoseconds() && Mouse.getEventButtonState()) {
                l10 = Mouse.getEventNanoseconds();
                if (this.a.a().startsWith("Bound")) {
                    this.a.a(this.a.a() + " + M" + (Mouse.getEventButton() + 1));
                } else {
                    this.a.a("Bound to M" + (Mouse.getEventButton() + 1));
                    if (Mouse.getEventButton() == 0) {
                        ok_0.b(this.a).a(Collections.emptyList());
                        break;
                    }
                }
                n11 = -100 + Mouse.getEventButton();
                if (n10 == -1) {
                    n10 = Mouse.getEventButton();
                }
                if (arrayList.contains(n11)) continue;
                arrayList.add(n11);
                if (!zu_02.y.u().booleanValue()) break;
                Mouse.next();
                continue;
            }
            Mouse.next();
        }
        ok_0.b(this.a).a(arrayList);
        if (ok_0.c(this.a) != null) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }
        this.a.b();
    }

    oc_0(ok_0 ok_02, uU uU2) {
        this(ok_02);
    }
}

