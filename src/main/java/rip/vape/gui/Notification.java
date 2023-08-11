/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package rip.vape.gui;

import java.awt.Color;

import manthe.*;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.Al
 */
public class Notification extends aw_0 {
    private final long l;
    private final long k;
    private uV j = new uV();

    public Notification(pJ var1, String var2, u9 var3, double var4, double var6, long var8) {
        super(var1, var2, var3, var4, var6);
        this.l = var8;
        this.k = System.currentTimeMillis() + var8;
    }

    @Override
    public void a(double var1, double var3) {
        float var6 = zu_0.ac();
        if (!zu_0.T.aa.u().booleanValue()) {
            var6 = 1.0f;
        }
        boolean var7 = GL11.glIsEnabled((int)3042);
        float var5 = 1.0f / var6;
        GL11.glScalef((float)var6, (float)var6, (float)var6);
        double var8 = this.a() + var1 + 3.0;
        double var10 = this.h() + var3;
        double var12 = this.b();
        Color var14 = this.k();
        pe_0.a(var8, var10, var12, this.e(), new Color(-1879048192, true), false, 3.0f, 1.0f);
        k9.a(var14, (float)var8 - 4.0f, (float)var10 - 6.0f, this.m(), 1.0f, true);
        if (this.j().equals((Object)pJ.ALERT)) {
            k9.a(var14, (float)var8 - 2.0f, (float)var10, "noti_alert_large", 0.65f, false);
        }
        on.p.a(0.9, true).a(this.i(), var8 + 23.0, var10 + 8.0, this.j().equals((Object)pJ.ALERT) ? new Color(this.j().a()) : this.j.c);
        this.l().a(var8 + 23.0, var10 + 21.0);
        double var15 = Math.max(Math.min((double)(this.k - System.currentTimeMillis()) / (double)this.l, 1.0), 0.0);
        pe_0.a(var8 + 1.0, var10 + this.e() - 1.0, var12 * var15 - 1.0, 0.5, new Color(this.j().a()), false, 1.0f, 1.0f);
        if (var15 <= 0.0) {
            this.c();
        }
        GL11.glScalef((float)var5, (float)var5, (float)var5);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (var7) {
            GL11.glEnable((int)3042);
        }
    }

    @Override
    public void b(double var1, double var3) {
        this.c();
    }

    @Override
    public double b() {
        return Math.max(100.0, super.b()) + 16.0 + 18.0;
    }

    @Override
    public double e() {
        return super.e();
    }

    @Override
    public void c() {
        this.a(5.0);
    }

    @Override
    public boolean g() {
        return this.a() >= 1.0;
    }
}

