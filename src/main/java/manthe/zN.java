/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;

import org.lwjgl.input.Keyboard;
import rip.vape.module.Module;

public class zN
extends Module {
    private final dy_0 u = dy_0.createValue((Object)this, "Active distance", "#.#", "", 0.0, 1.0, 3.5, 6.0, 0.1, "WTap will function only if targets distance is between these values");
    private final DF A = DF.a((Object)this, "Delay", "#", "", 0.0, 50.0, 1000.0, 1.0);
    private final DF w = DF.a((Object)this, "Post delay", "#", "", 0.0, 200.0, 1000.0, 1.0);
    private Queue<Boolean> v = new LinkedBlockingDeque<Boolean>();
    private boolean z = false;
    private boolean x;
    private Random y = new Random();

    public zN() {
        super("WTap", -5632000, CQ.c);
        this.a(this.u, this.A, this.w);
        this.a(50L, true);
    }

    @Override
    public void a(kn_0 kn_02) {
        if (!this.v.isEmpty()) {
            if (ds_2.x().d()) {
                while (!this.v.isEmpty()) {
                    this.v.poll();
                }
                return;
            }
            ei_0 ei_02 = ds_2.s().j();
            boolean bl = this.v.poll();
            ei_0.a(ei_02.i(), bl);
            ei_0.a(ei_02.i());
        }
    }

    boolean a(eJ eJ2, ex_0 ex_02) {
        double d3 = eJ2.a(ex_02);
        return d3 < this.u.w() && d3 > this.u.s();
    }

    @Override
    public void q() {
        ei_0 ei_02 = ds_2.s().j();
        eJ eJ2 = ds_2.k();
        if (ds_2.x().d()) {
            return;
        }
        if (!eJ2.v()) {
            return;
        }
        ej_0 ej_02 = pf_0.a(this.u.w(), 0.0f);
        if (ej_02 == null || ej_02.e()) {
            return;
        }
        if (!ej_02.a(A5.L)) {
            return;
        }
        e2 e22 = new e2(ej_02);
        if (on.p.N().a(e22)) {
            return;
        }
        if (!pf_0.a(eJ2, e22, 60.0)) {
            return;
        }
        if (this.a(eJ2, e22)) {
            if (this.z) {
                if (Keyboard.isKeyDown((int)17)) {
                    this.v.add(false);
                }
                try {
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    this.v.add(true);
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    this.v.add(false);
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    this.v.add(true);
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    if (!Keyboard.isKeyDown((int)17)) {
                        this.v.add(false);
                    }
                    Thread.sleep(this.w.a().longValue());
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.z = false;
            } else if (eJ2.aM()) {
                this.z = true;
            }
        }
    }
}

