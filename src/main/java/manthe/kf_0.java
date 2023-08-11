/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import a.d;
import org.lwjgl.input.Keyboard;
import rip.vape.module.Module;

/*
 * Renamed from manthe.kf
 */
public class kf_0
extends kl_0 {
    public kf_0(int n6) {
        this.a = n6;
    }

    @Override
    public boolean fire() {
        try {
            if (on.p.m()) {
                ds_2.a(new dx_1(d.getGuiObject()));
                on.p.c(false);
            }
            for (Module bI : on.p.H().e()) {
                if (bI instanceof zu_0) {
                    ((zu_0)bI).b(this);
                }
                if (!bI.N()) continue;
                bI.a(this);
            }
            if (Keyboard.isKeyDown((int)29) && Keyboard.isKeyDown((int)199) && this.a == 1) {
                if (ds_2.x().d() && ds_2.x().a().equals(d.getGuiObject()) && ds_2.t().e()) {
                    ds_2.a(new dx_1(null));
                }
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                on.p.H().b(zx_0.class).d(true);
            }
            if (Keyboard.isKeyDown((int)157) && Keyboard.isKeyDown((int)199) && this.a == 1 && ds_2.x().e()) {
                on.p.H().b(zu_0.class).z();
            }
            if (this.a == da_0.b && !zu_0.T.ab()) {
                for (r1 r12 : on.p.F().d()) {
                    r12.W();
                }
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        return this.d();
    }
}

