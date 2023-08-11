/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Iterator;
import manthe.Ay;
import manthe.D3;
import manthe.D8;
import manthe.ak_0;
import manthe.my_0;
import manthe.ng;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.r6;
import manthe.rf_0;
import manthe.rl_0;
import manthe.sg_0;

public class rX
extends r1 {
    private rf_0 ae;
    private rf_0 af;
    private r6 ag;
    private r6 ah;

    public rX() {
        super("Public Publish Profiles", false);
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.an();
        this.al();
        this.c(90.0);
        this.b(20.0);
        this.a(new D8(this));
    }

    private void a(r6 r62) {
        Iterator<p1> iterator = r62.A().v().iterator();
        while (iterator.hasNext()) {
            p1 p12 = iterator.next();
            if (!(p12 instanceof sg_0)) continue;
            iterator.remove();
        }
    }

    private void an() {
        this.af = new rf_0(false);
        this.af.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 0)));
        this.d(this.af);
        rl_0 rl_02 = new rl_0("Your Private Profiles:", my_0.i, 0.7);
        rl_02.c(85.0);
        rl_02.b(12.0);
        this.af.b(rl_02);
        this.ah = new r6(false);
        this.ah.c(100.0);
        this.ah.b(70.0);
        this.d(this.ah);
    }

    private void al() {
        this.ae = new rf_0(false);
        this.ae.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.d(this.ae);
        rl_0 rl_02 = new rl_0("Your Public Profiles:", my_0.i, 0.7);
        rl_02.b("");
        rl_02.a(new Ay(this, rl_02));
        rl_02.c(85.0);
        rl_02.b(12.0);
        this.ae.b(rl_02);
        this.ag = new r6(false);
        this.ag.c(100.0);
        this.ag.b(70.0);
        this.d(this.ag);
        for (int i = 0; i < 25; ++i) {
            ak_0 ak_02 = new ak_0("public  " + i, "6.9");
            sg_0 sg_02 = new sg_0(ak_02, 85.0);
            this.ag.d(sg_02);
            this.ag.c();
        }
    }

    @Override
    public void c(double d3) {
        super.c(d3);
        for (p1 p12 : this.aj().v()) {
            p12.c(d3);
            if (!(p12 instanceof r6)) continue;
            r6 r62 = (r6)p12;
            for (p1 p13 : r62.A().v()) {
                p13.c(d3 - 4.0);
            }
        }
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.ag.b((d3 -= 24.0) * 0.5);
        this.ah.b(d3 * 0.5);
        this.ae.b(12.0);
        this.af.b(12.0);
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        this.a(ng.d.t() + ng.d.q() + 3.0);
        this.d(ng.d.k());
        this.b(ng.d.b());
        super.c();
    }

    @Override
    public void c(boolean bl) {
        super.c(false);
    }

    public void b(ak_0 ak_02) {
        if (ak_02.r().equalsIgnoreCase("default")) {
            return;
        }
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D3(0.0, 0.0, 1, 1, new pd(1, 2, 1, 2)));
        sg_0 sg_02 = new sg_0(ak_02, 85.0);
        rf_02.b(sg_02);
        if (ak_02.k()) {
            this.ag.d(rf_02);
            this.ag.c();
        } else {
            this.ah.d(rf_02);
            this.ah.c();
        }
    }

    public void a(ak_0 ak_02) {
        sg_0 sg_02;
        rf_0 rf_02;
        p1 p12 = null;
        for (p1 p13 : this.ah.A().v()) {
            if (!(p13 instanceof rf_0) || (rf_02 = (rf_0)p13).v().isEmpty() || !(rf_02.v().get(0) instanceof sg_0) || !(sg_02 = (sg_0)rf_02.v().get(0)).a().l().toString().equalsIgnoreCase(ak_02.l().toString())) continue;
            p12 = p13;
        }
        if (p12 == null) {
            for (p1 p13 : this.ag.A().v()) {
                if (!(p13 instanceof rf_0) || (rf_02 = (rf_0)p13).v().isEmpty() || !(rf_02.v().get(0) instanceof sg_0) || !(sg_02 = (sg_0)rf_02.v().get(0)).a().l().toString().equalsIgnoreCase(ak_02.l().toString())) continue;
                p12 = p13;
            }
        }
        if (p12 != null) {
            this.ah.A().a(p12);
            this.ah.c();
            this.ag.A().a(p12);
            this.ag.c();
        }
    }

    public r6 ao() {
        return this.ag;
    }

    public r6 am() {
        return this.ah;
    }

    static r6 a(rX rX2) {
        return rX2.ag;
    }

    static void a(rX rX2, r6 r62) {
        rX2.a(r62);
    }

    static r6 b(rX rX2) {
        return rX2.ah;
    }
}

