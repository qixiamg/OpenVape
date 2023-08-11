/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.C3;
import manthe.D3;
import manthe.DS;
import manthe.ak_0;
import manthe.bg_1;
import manthe.my_0;
import manthe.ob;
import manthe.ol;
import manthe.pd;
import manthe.rQ;
import manthe.rf_0;
import manthe.rl_0;

/*
 * Renamed from manthe.sg
 */
public class sg_0
extends rf_0 {
    private final ak_0 J;
    private static int I;

    public sg_0(ak_0 ak_02, double d3) {
        super(true);
        this.J = ak_02;
        this.c(d3);
        this.b(75.0);
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D3(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 1)));
        rf_02.b(c);
        rf_02.j(false);
        rf_02.c(this.q());
        rf_02.b(20.0);
        rl_0 rl_02 = new rl_0(ak_02.r(), my_0.i, 1.0);
        rl_02.b(10.0);
        rl_02.j(false);
        rf_02.b(rl_02);
        this.b(rf_02);
        if (ak_02.k()) {
            rl_02.c(rf_02.q());
            this.a(new D3(2.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
            rf_0 rf_03 = new rf_0(false);
            rf_03.a(new D3(2.0, 0.0, 5000, 3, new pd(0, 0, 0, 0)));
            rf_03.b(c);
            rf_03.c(this.q());
            rf_03.b(20.0);
            rQ rQ2 = new rQ("upload", 0.5f, 6.0f, -1.0f, true);
            rQ2.b("Update your profile");
            rQ2.d(Color.BLACK);
            rQ2.a(Color.WHITE);
            rQ2.c(this.q() * 0.33);
            rQ2.b(15.0);
            rQ2.a(new ob(this));
            rf_03.b(rQ2);
            rQ rQ3 = new rQ("copy", 0.33f, 8.5f, 2.0f, true);
            rQ3.b("Copy profile UUID");
            rQ3.d(Color.BLACK);
            rQ3.a(Color.WHITE);
            rQ3.c(this.q() * 0.33);
            rQ3.b(15.0);
            rQ3.a(new ol(this, ak_02));
            rf_03.b(rQ3);
            rQ rQ4 = new rQ("delete", 0.5f, 6.0f, -1.0f, true);
            rQ4.b("Make profile private");
            rQ4.d(Color.BLACK);
            rQ4.a(Color.WHITE);
            rQ4.c(this.q() * 0.33);
            rQ4.b(15.0);
            rQ4.a(new bg_1(this, ak_02));
            rf_03.b(rQ4);
            this.b(rf_03);
        } else {
            rl_02.c(rf_02.q() * 0.82);
            this.a(new D3(2.0, 2.0, 1, 2, new pd(2, 2, 2, 2)));
            rf_0 rf_04 = new rf_0(false);
            rf_04.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
            rf_04.b(c);
            rf_04.c(this.q());
            rf_04.b(20.0);
            rQ rQ5 = new rQ("world", 0.28f, 1.6f, 3.5f, true);
            rQ5.b("Make profile public");
            rQ5.d(Color.BLACK);
            rQ5.a(Color.WHITE);
            rQ5.c(13.0);
            rQ5.b(17.0);
            rQ5.a(new DS(this, ak_02, rl_02));
            rQ5.a(new C3(this, ak_02, rl_02));
            rf_04.b(rQ5);
            this.b(rf_04);
        }
    }

    @Override
    public Color f() {
        return c;
    }

    public ak_0 a() {
        return this.J;
    }

    public static void b(int n6) {
        I = n6;
    }

    public static int y() {
        return I;
    }

    public static int x() {
        int n6 = sg_0.y();
        if (n6 == 0) {
            return 106;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (sg_0.x() != 0) {
            sg_0.b(22);
        }
    }
}

