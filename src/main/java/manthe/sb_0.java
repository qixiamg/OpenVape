/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.util.regex.Pattern;
import manthe.AO;
import manthe.D7;
import manthe.be_0;
import manthe.ds_2;
import manthe.my_0;
import manthe.o7;
import manthe.on;
import manthe.pd;
import manthe.qp;
import manthe.rl_0;
import manthe.s6;
import manthe.yQ;
import manthe.zu_0;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.sb
 */
public class sb_0
extends qp
implements s6,
be_0 {
    private static final int I = 2;
    private final Color F = new Color(250, 50, 56);
    private final rl_0 O = new rl_0("", my_0.c, 1.0);
    private final rl_0 G = new rl_0("_", my_0.c, 1.0);
    private final AO L = new AO();
    private final AO N = new AO();
    private final AO P = new AO();
    private boolean Q = false;
    private Pattern M;
    private String J = "";
    private int R;
    private double H = 0.0;
    private boolean K = false;

    public sb_0(int n6) {
        this.R = n6;
        D7 d7 = new D7(0.0, 0.0, 1, 3, new pd(0, 2, 0, 2));
        d7.h();
        this.a(d7);
        this.O.j(false);
        this.b(this.O);
        this.G.c(this.r().b("_"));
        this.G.j(false);
        this.b(this.G);
        this.a(null, new yQ(this));
    }

    public sb_0() {
        this(1000);
    }

    public rl_0 z() {
        return this.O;
    }

    @Override
    public void c(boolean bl) {
        if (this.e()) {
            o7.a(this.t(), this.k(), this.q(), this.b());
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            o7.a(this.y() ? c.darker() : c.brighter().brighter().brighter(), this);
            o7.a(!this.a() ? this.F : (this.P() != null ? this.P() : this.f()), this.A(), this, 4);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            super.c(bl);
            if (!this.J.isEmpty() && !this.y() && this.O.E().isEmpty()) {
                this.O.a(this.J, this.O.t(), this.O.k(), Color.LIGHT_GRAY);
            }
            GL11.glDisable((int)3089);
        }
    }

    @Override
    public void c() {
        super.c();
        if (this.d()) {
            return;
        }
        if (this.y()) {
            String string;
            if (this.L.a(600L)) {
                this.L.d();
                string = this.G.E();
                this.G.a(string.equals("_") ? "" : "_");
            }
            if (Keyboard.isKeyDown((int)14)) {
                if (!this.Q || this.P.a(25L) && this.N.a(500L)) {
                    this.G.a("_");
                    this.P.d();
                    string = this.O.E();
                    if (string.length() > 0) {
                        this.O.a(string.substring(0, string.length() - 1));
                    }
                }
                this.Q = true;
            } else {
                this.Q = false;
                this.N.d();
            }
        } else {
            this.G.a("");
        }
        double d3 = zu_0.T.aa.u() != false ? 1.0 : (double)ds_2.s().x();
        this.O.c(this.r().b(this.O.E()) * this.O.V() * d3);
        double d4 = this.O.q() - this.q();
        if (d4 > 0.0) {
            this.O.a(this.t() - d4);
        }
    }

    @Override
    public void b(double d3) {
        super.b(d3);
        this.O.b(d3);
        this.G.b(d3);
    }

    @Override
    public boolean a(char c2, int n6) {
        if (this.d()) {
            return false;
        }
        if (this.y()) {
            Object object;
            if (n6 == 1) {
                this.e(false);
                return true;
            }
            if (c2 == '\u0016' && Keyboard.isKeyDown((int)29) && (object = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null)) != null && object.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                try {
                    this.O.a((String)object.getTransferData(DataFlavor.stringFlavor));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            if ((c2 == '\u00a7' || c2 < ' ' || c2 == '\u007f') && n6 != 0) {
                return true;
            }
            object = this.O.E();
            if (((String)object).length() < this.R && n6 != 14 && c2 != '\u0000') {
                this.O.a((String)object + c2);
            }
            return true;
        }
        return super.a(c2, n6);
    }

    @Override
    public boolean a(int n6, int n10, int n11) {
        if (this.d()) {
            return false;
        }
        if (!this.g()) {
            this.e(false);
        }
        if (this.g() && n11 == 1) {
            this.O.a("");
        }
        return super.a(n6, n10, n11);
    }

    @Override
    public double A() {
        return this.H;
    }

    @Override
    public void e(double d3) {
        this.H = d3;
    }

    public void a(Pattern pattern) {
        this.M = pattern;
    }

    public boolean a() {
        String string = this.z().E();
        return string == null || string.equals("") || this.M == null || this.M.matcher(this.z().E()).matches();
    }

    public rl_0 C() {
        return this.O;
    }

    public int B() {
        return this.R;
    }

    public void a(int n6) {
        this.R = n6;
    }

    @Override
    public boolean y() {
        return this.K;
    }

    @Override
    public void e(boolean bl) {
        this.K = bl;
        on.p.H().b(zu_0.class).f(bl);
        zu_0.T.a(this, bl);
    }

    public String x() {
        return this.J;
    }

    public void a(String string) {
        this.J = string;
    }
}

