/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;

/*
 * Renamed from manthe.rs
 */
public class rs_0
extends r1 {
    private final rf_0 aj = new rf_0(false);
    private final int ah = 200;
    private r6 ag;
    public BooleanValue ai = BooleanValue.createValue((Object)this, "Login Offline Mode", false, "Logs into an account in offline mode.");
    rg_0 af;
    private static int ae;

    public rs_0() {
        super("Alts", false);
        this.aj().e(1.0);
        this.aj().c(new Color(100, 100, 100, 40));
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(this.q());
        rf_02.b(20.0);
        rf_02.a(new D3(2.0, 0.0, 5000, 5, new pd(2, 2, 0, 0)));
        rl_0 rl_02 = new rl_0("Alts", my_0.c, 1.25);
        rl_02.c(48.0);
        rl_02.b(20.0);
        rl_02.j(false);
        rf_02.b(rl_02);
        rQ rQ2 = new rQ("import", 0.35f, 2.0f, 2.0f, true);
        rQ2.b("Import alts from a file, in a username:password format");
        rQ2.c(15.0);
        rQ2.b(15.0);
        rQ2.a(new BL(this));
        rf_02.b(rQ2);
        rQ rQ3 = new rQ("export", 0.35f, 2.0f, 2.0f, true);
        rQ3.b("Export alts to a file, in a username:password format");
        rQ3.c(15.0);
        rQ3.b(15.0);
        rQ3.a(new mB(this));
        rf_02.b(rQ3);
        rQ rQ4 = new rQ("altening-3", 0.35f, 2.0f, 2.0f, true);
        rQ4.b("Generate alts with your Altening subscription");
        rQ4.c(15.0);
        rQ4.b(15.0);
        rQ4.a(new az_0(this));
        rf_02.b(rQ4);
        sb_0 sb_02 = new sb_0();
        sb_02.c(100.0);
        sb_02.b(15.0);
        sb_02.a("Filter");
        sb_02.e(1.0);
        sb_02.c(new Color(100, 100, 100, 40));
        sb_02.a(new DM(this, sb_02));
        rf_02.b(sb_02);
        this.aj().b(rf_02);
        this.am();
    }

    public void a(String string) {
        try {
            String string2;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(string)));
            while ((string2 = bufferedReader.readLine()) != null) {
                if (!string2.contains(":")) continue;
                String[] stringArray = string2.split(":");
                String string3 = stringArray[0];
                String string4 = stringArray[1];
                this.a(new Cj(string3, string4));
            }
            bufferedReader.close();
            on.p.D().b.b(string);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void d(String string) {
        try {
            PrintWriter printWriter = new PrintWriter(new File(string));
            for (p1 p12 : this.ag.A().v()) {
                if (!(p12 instanceof rD)) continue;
                rD rD2 = (rD)p12;
                printWriter.print(rD2.a().c() + ":" + rD2.a().b() + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(sb_0 sb_02) {
        String string = sb_02.z().E().toLowerCase();
        for (p1 p12 : this.ag.A().v()) {
            if (!(p12 instanceof rD)) continue;
            rD rD2 = (rD)p12;
            rD2.a(string.equals("") || rD2.a().c().toLowerCase().contains(string));
        }
    }

    private void am() {
        this.aj.a(new D7(2.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.ag = new r6(false);
        this.ag.c(200.0);
        this.ag.b(150.0);
        D7 d7 = new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0));
        d7.g();
        this.ag.A().a(d7);
        this.aj.b(this.ag);
        rf_0 rf_02 = new rf_0(false);
        rf_02.a(new D7(2.0, 2.0, 2, 2, new pd(0, 0, 0, 0)));
        rg_0 rg_02 = new rg_0("+", true);
        sf_0 sf_02 = new sf_0(this, rg_02);
        sf_02.c(184.0);
        sf_02.b(15.0);
        sf_02.a("username:password");
        sf_02.e(1.0);
        sf_02.c(new Color(100, 100, 100, 40));
        rf_02.b(sf_02);
        rg_02.b(c);
        rg_02.b(15.0);
        rg_02.c(15.0);
        rg_02.e(1.0);
        rg_02.c(new Color(100, 100, 100, 40));
        rf_02.b(rg_02);
        this.aj.b(rf_02);
        rf_0 rf_03 = new rf_0(false);
        rf_03.a(new D7(2.0, 2.0, 1, 1, new pd(0, 0, 0, 0)));
        this.af = new rg_0("Undo Altening Auth", true);
        this.af.b("Disables TheAltening auth servers.\nNOTE: Will break your Altening session.");
        this.af.b(18.0);
        this.af.c(201.0);
        this.af.a(false);
        this.af.a(new na(this));
        rf_03.b(this.af);
        this.aj.b(rf_03);
        this.aj.b((p1)this.ai.getDefaultValue());
        rg_02.a(new A6(this, sf_02));
        this.aj().b(this.aj);
    }

    public void a(Cj cj) {
        rD rD2 = new rD(this.ag, cj, 200);
        this.ag.d(rD2);
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        d0_0 d0_02 = ds_2.p();
        this.a((double)(d0_02.g() / 2) - this.q() / 2.0);
        this.d(d0_02.h() / 2 - 100);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        ds_2.x().i();
        super.c(false);
    }

    public rg_0 ao() {
        return this.af;
    }

    static void a(rs_0 rs_02, String string) {
        rs_02.d(string);
    }

    static void a(rs_0 rs_02, sb_0 sb_02) {
        rs_02.a(sb_02);
    }

    public static void b(int n6) {
        ae = n6;
    }

    public static int al() {
        return ae;
    }

    public static int an() {
        int n6 = rs_0.al();
        if (n6 == 0) {
            return 51;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (rs_0.al() == 0) {
            rs_0.b(8);
        }
    }
}

