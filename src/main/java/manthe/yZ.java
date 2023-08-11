/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import org.lwjgl.opengl.GL11;
import rip.vape.gui.Notification;

public class yZ {
    private final ArrayBlockingQueue<oq> d = new ArrayBlockingQueue(20);
    private long c;
    private static String[] b;

    public void addNotification(String string, String string2, long l6) {
        this.addNotification(new Notification(pJ.INFO, string, new qY(string2), 0.0, 0.0, l6));
    }

    public void addNotification(String string, String string2, pJ pJ2, long l6) {
        this.addNotification(new Notification(pJ2, string, new qY(string2, pJ2), 0.0, 0.0, l6));
    }

    public void addNotification(oq oq2) {
        if (!zu_0.T.F.u().booleanValue()) {
            return;
        }
        double d3 = oq2.e() + 16.0;
        for (oq oq3 : this.d) {
            d3 += oq3.e() + 2.0;
        }
        oq2.c(-d3);
        oq2.d(0.0);
        oq2.a(-oq2.b());
        if (this.d.remainingCapacity() == 0) {
            this.d.remove();
        }
        this.d.add(oq2);
    }

    public void c() {
        int n6 = GL11.glGetInteger((int)3009);
        float f10 = GL11.glGetFloat((int)3010);
        GL11.glAlphaFunc((int)516, (float)0.0f);
        d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
        double d3 = -14.0;
        long l6 = System.currentTimeMillis() - this.c;
        this.c = System.currentTimeMillis();
        ArrayList<oq> arrayList = new ArrayList<oq>();
        float f11 = zu_0.ac();
        if (!zu_0.T.aa.u().booleanValue()) {
            f11 = 1.0f;
        }
        for (oq oq2 : this.d) {
            oq2.b(d3 -= oq2.e() + 2.0);
            int n10 = (int)(Math.abs(oq2.d() - oq2.a()) * 0.3);
            int n11 = (int)(Math.abs(oq2.f() - oq2.h()) * 0.3);
            double d4 = yZ.addNotification(oq2.d(), oq2.a(), l6, n10);
            double d5 = yZ.addNotification(oq2.f(), oq2.h(), l6, n11);
            oq2.d(d4);
            oq2.c(d5);
            oq2.a((float)d0_02.g() / f11, (float)d0_02.h() / f11);
            if (!oq2.g()) continue;
            arrayList.add(oq2);
        }
        for (oq oq2 : arrayList) {
            this.d.remove(oq2);
        }
        GL11.glAlphaFunc((int)n6, (float)f10);
    }

    public static double addNotification(double d3, double d4, long l6, double d5) {
        if (d3 == d4) {
            return d3;
        }
        double d6 = Math.max(d5 * (double)Math.max(1L, l6) / 16.666666666666668, 0.1);
        return d4 + Y.a(d3 - d4, -d6, d6);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    static {
        if (yZ.b() == null) {
            yZ.b(new String[2]);
        }
    }
}

