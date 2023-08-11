/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package a;

import lgbt.vape.bootstrap.Parameters;
import manthe.DO;
import manthe.nx_0;
import manthe.on;
import manthe.r1;
import manthe.zu_0;
import org.lwjgl.input.Keyboard;

public class d {
    public static Object getGuiObject() {
        return Parameters.getGuiObject();
    }

    public static void initGui(Object object) {
        Keyboard.enableRepeatEvents((boolean)true);
        on.p.M().aA.e(object);
        zu_0 zu2 = on.p.H().b(zu_0.class);
        if (zu2.G.u().booleanValue()) {
            nx_0.c().f();
        }
    }

    public static void onGuiClosed(Object object) {
        Keyboard.enableRepeatEvents((boolean)false);
        zu_0 zu2 = on.p.H().b(zu_0.class);
        zu2.b(object);
    }

    public static void updateScreen(Object object) {
        on.p.M().aA.f(object);
    }

    public static void keyTyped(Object object, char c2, int n6) {
        zu_0 zu2 = on.p.H().b(zu_0.class);
        for (r1 object2 : zu2.Y()) {
            if (!object2.a(c2, n6)) continue;
            return;
        }
        if (zu_0.W != null) {
            for (DO dO : zu_0.W.r()) {
                dO.a(c2, n6);
            }
        }
        on.p.M().aA.a(object, c2, n6);
    }

    public static void mouseClicked(Object object, int n6, int n22, int n32) {
        zu_0 zu2 = on.p.H().b(zu_0.class);
        zu2.a(n6, n22, n32);
        on.p.M().aA.a(object, n6, n22, n32);
    }

    public static void mouseMovedOrUp(Object object, int n6, int n22, int n32) {
        on.p.M().aA.b(object, n6, n22, n32);
    }

    public static void handleMouseInput(Object object) {
        zu_0 zu2 = on.p.H().b(zu_0.class);
        zu2.aa();
        on.p.M().aA.h(object);
    }

    public static void drawScreen(Object object, int n6, int n22, float f10) {
        on.p.M().aA.a(object, n6, n22, f10);
        zu_0 zu2 = on.p.H().b(zu_0.class);
        zu2.am();
    }
}

