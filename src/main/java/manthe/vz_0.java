/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.A5;
import manthe.I;
import manthe.J;
import manthe.ds_2;
import manthe.ei_0;
import manthe.en_0;
import manthe.gb_0;
import manthe.on;
import manthe.u5;
import manthe.yq_0;
import manthe.zp_0;
import org.lwjgl.input.Keyboard;

/*
 * Renamed from manthe.vz
 */
class vz_0
extends Thread {
    private boolean e;
    private boolean a;
    private boolean c;
    private boolean d;
    private zp_0 b;

    public vz_0(zp_0 zp_02) {
        this.b = zp_02;
    }

    @Override
    public void run() {
        this.b();
    }

    private void b() {
        try {
            gb_0 gb_02;
            en_0 en_02 = ds_2.s();
            if (this.b.u.u().booleanValue()) {
                ei_0.a(en_02.j().i(), false);
                ei_0.a(en_02.j().i());
                ei_0.a(en_02.A().i(), false);
                ei_0.a(en_02.A().i());
                ei_0.a(en_02.g().i(), false);
                ei_0.a(en_02.g().i());
                ei_0.a(en_02.n().i(), false);
                ei_0.a(en_02.n().i());
            }
            float[] fArray = this.b.a(zp_0.a(this.b));
            J j = new J(fArray[0], fArray[1]);
            j.b(this.b.w.a().intValue());
            yq_0.u.a(j);
            int n6 = 0;
            while (!j.e()) {
                Thread.sleep(10L);
                if (++n6 <= 100) continue;
                this.a();
                return;
            }
            for (int i = 0; i < 100; ++i) {
                gb_0 gb_03 = ds_2.I();
                if (gb_03.h().d() && gb_03.h().a(A5.dG)) {
                    yq_0.u.a((I)null);
                    break;
                }
                Thread.sleep(1L);
            }
            if ((gb_02 = ds_2.I()).h().d() && gb_02.h().a(A5.dG)) {
                u5.a();
                Thread.sleep(51L);
                u5.d();
                Thread.sleep(10L);
            }
            if (this.b.u.u().booleanValue() && this.b.B.u().booleanValue()) {
                ei_0.a(en_02.j().i(), Keyboard.isKeyDown((int)en_02.j().i()));
                ei_0.a(en_02.j().i());
                ei_0.a(en_02.A().i(), Keyboard.isKeyDown((int)en_02.A().i()));
                ei_0.a(en_02.A().i());
                ei_0.a(en_02.g().i(), Keyboard.isKeyDown((int)en_02.g().i()));
                ei_0.a(en_02.g().i());
                ei_0.a(en_02.n().i(), Keyboard.isKeyDown((int)en_02.n().i()));
                ei_0.a(en_02.n().i());
            }
            zp_0.b(this.b).d();
        }
        catch (Exception exception) {
            on.a(exception);
        }
        this.a();
    }

    private void a() {
        zp_0.a(this.b, null);
        zp_0.e(false);
    }
}

