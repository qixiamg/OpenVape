/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class z5
extends Module {
    public static Queue<dk_2> u = new ConcurrentLinkedQueue<dk_2>();
    private final AO A = new AO();
    private ya_0 z;
    private boolean x = false;
    private boolean w = true;
    private boolean v = false;
    private int y = 0;
    private int B = 0;

    public z5() {
        super("Macros", 0, 0, CQ.b, null);
        this.z();
    }

    @Override
    public void z() {
        this.d(true);
        if (!this.v) {
            this.v = true;
            new cq_1(this).start();
        }
    }

    @Override
    public void a(kZ kZ2) {
        if (this.z != null) {
            return;
        }
        if (kZ2.isDown()) {
            return;
        }
        List<ya_0> list = on.p.f().a(kZ2.getKey());
        if (list.isEmpty()) {
            return;
        }
        for (ya_0 ya_02 : list) {
            if (this.z != null) continue;
            this.a(ya_02);
        }
    }

    public void a(ya_0 ya_02) {
        if (ya_02 instanceof yU) {
            ds_2.k().a(ya_02.l());
            return;
        }
        this.z = ya_02;
        if (this.T() == -1) {
            this.z = null;
            return;
        }
        this.B = ds_2.k().aU().i();
        this.y = aa_0.a(this.z.m());
        this.w = true;
        this.V();
    }

    public void W() throws Exception {
        if (this.z == null) {
            return;
        }
        if (!this.x) {
            this.x = true;
            this.U();
            this.A.d();
        }
        if (this.w) {
            if (this.A.a(this.y)) {
                if (this.z.q().u().booleanValue()) {
                    this.y = aa_0.a(this.z.k());
                    this.A.d();
                    this.w = false;
                } else {
                    this.S();
                }
            }
        } else if (this.z instanceof yu_0 && !this.A.a(this.y)) {
            ex_0 ex_02;
            eJ eJ2 = ds_2.k();
            em_0 em_02 = eJ2.aW();
            if (eJ2.d() && em_02.d() && ((ex_02 = eJ2.aW().au()).d() && ex_02.a(A5.L) || em_02.at())) {
                this.U();
                Thread.sleep(aa_0.a(30, 60));
                this.S();
            }
        } else if (this.A.a(this.y)) {
            this.U();
            Thread.sleep(aa_0.a(30, 60));
            this.S();
        }
    }

    private int T() {
        try {
            for (int i = 0; i < 9; ++i) {
                fG fG2 = ds_2.k().aU().b(i);
                if (fG2.a() == null || fG2.k().a() == null) continue;
                if (String.valueOf(fk_0.a(fG2.k())).equals(this.z.l())) {
                    return i;
                }
                if (!fG2.j().equalsIgnoreCase(this.z.l()) && !fG2.k().a(fG2).equalsIgnoreCase(this.z.l())) continue;
                return i;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1;
    }

    private void V() {
        ds_2.k().aU().a(this.T());
    }

    private void U() throws Exception {
        dk_2 dk_22;
        ei_0 ei_02 = ds_2.s().s();
        ei_0.a(ei_02.i(), true);
        ei_0.a(ei_02.i(), false);
        ei_0.a(ei_02.i());
        if (!on.p.h()) {
            de_2.g().put(1, (byte)1);
            dk_22 = dk_2.h();
            dk_22.a(1);
            dk_22.c(true);
            u.add(dk_22);
        }
        Thread.sleep(aa_0.a(10, 100));
        if (!on.p.h()) {
            de_2.g().put(1, (byte)0);
            dk_22 = dk_2.h();
            dk_22.a(1);
            dk_22.c(false);
            u.add(dk_22);
        }
    }

    private void S() {
        this.z = null;
        this.w = true;
        this.x = false;
        ds_2.k().aU().a(this.B);
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        try {
            if (on.p.h()) {
                return;
            }
            while (u.peek() != null) {
                cY.f().a(u.poll());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

