/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.List;

public class rA
extends r1 {
    private final CQ ah;
    private final r6 ae;
    private final List<Module> ai = new ArrayList<Module>();
    private final rg_0 ag = new rg_0("test", true);
    private double af;

    public rA(CQ cQ) {
        super(cQ.H(), false);
        this.ah = cQ;
        this.ae = new r6(false);
        this.ae.b(250.0);
        this.aj().b(this.ae);
        this.ag.b(5.0);
        this.ag.z().e(0.5);
        this.ag.a(new no_0(this));
        this.aj().b(this.ag);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(82.0);
        this.b(20.0);
        this.X().b(cQ.d());
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        if (this.ae.z()) {
            this.c(this.af + 5.0);
        } else {
            this.c(this.af);
        }
        int n6 = 0;
        for (Module y52 : this.ai) {
            if (y52.x()) continue;
            ++n6;
            if (!y52.N()) continue;
            y52.d(false);
        }
        if (n6 == 0) {
            this.ag.a(false);
        } else {
            this.ag.a(true);
            this.ag.z().a(n6 + " hidden modules");
        }
        this.ag.c(this.q() - 3.0);
    }

    public CQ am() {
        return this.ah;
    }

    public void a(Module y52) {
        this.ai.add(y52);
    }

    public void al() {
        double d3 = this.q();
        double d4 = 0.0;
        for (Module y52 : this.ai) {
            s7 s72 = new s7(y52);
            y52.a(s72);
            s72.m(y52.v());
            s72.k(true);
            s72.b(14.0);
            double d5 = s72.q();
            if (d5 > d4) {
                d4 = d5;
            }
            for (BasicValue ds_02 : y52.r()) {
                if (ds_02.getDefaultValue() == null) continue;
                s72.d((p1)ds_02.getDefaultValue());
            }
            if (y52.getClass().equals(zE.class)) continue;
            this.ae.d(s72);
        }
        if (d4 > d3) {
            d3 = d4;
        }
        d3 += 2.0;
        for (Module y52 : this.ai) {
            y52.l().c(d3 - 4.0);
        }
        this.c(d3);
        this.af = this.q();
    }
}

