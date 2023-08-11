/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.D7;
import manthe.DK;
import manthe.p1;
import manthe.pd;
import manthe.qp;
import manthe.r1;
import manthe.r6;
import manthe.rg_0;
import manthe.s3;

/*
 * Renamed from manthe.rc
 */
public class rc_0
extends r1 {
    private final r6 af;
    private final List<p1> ag = new ArrayList<p1>();
    private final rg_0 ae = new rg_0("test", true);
    private double ah;

    public rc_0() {
        super("GUI", false);
        this.af = new r6(false);
        this.af.b(250.0);
        this.aj().b(this.af);
        this.ae.b(5.0);
        this.ae.z().e(0.5);
        this.ae.a(new DK(this));
        this.aj().b(this.ae);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.ah = 88.0;
        this.c(88.0);
        this.b(20.0);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        double d3 = this.q();
        double d4 = 0.0;
        for (p1 object : this.ag) {
            p1 p12;
            double d5;
            if (!(object instanceof s3) || !((d5 = ((qp)(p12 = (s3)object)).q()) > d4)) continue;
            d4 = d5;
        }
        if (d4 > d3) {
            d3 = d4;
        }
        if (this.af.z()) {
            this.c(this.ah);
        } else {
            this.c(this.ah - 5.0);
        }
        int n6 = 0;
        for (p1 p12 : this.ag) {
            if (p12.e()) continue;
            ++n6;
        }
        if (n6 == 0) {
            this.ae.a(false);
        } else {
            this.ae.a(true);
            this.ae.z().a(n6 + " hidden frames");
        }
        this.ae.c(this.q() - 3.0);
    }

    public void e(p1 p12) {
        this.ag.add(p12);
    }

    public void al() {
        s3 s32;
        double d3 = 0.0;
        for (p1 p12 : this.ag) {
            if (!(p12 instanceof s3)) continue;
            s32 = (s3)p12;
            double d4 = s32.q();
            if (d4 > d3) {
                d3 = d4;
            }
            this.af.d(p12);
        }
        if (d3 > this.ah) {
            this.ah = d3;
        }
        for (p1 p12 : this.ag) {
            if (!(p12 instanceof s3)) continue;
            s32 = (s3)p12;
            s32.c(this.ah - 0.0 + 1.0);
        }
        this.c(this.ah);
    }

    @Override
    public boolean ag() {
        return false;
    }
}

