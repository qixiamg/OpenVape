/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

import java.awt.Color;

public class r_
extends ri_0 {
    public r_() {
        super("Settings", 16, 16);
        this.f(true);
        zu_0 zu_02 = on.p.H().b(zu_0.class);
        D7 d7 = new D7(0.0, 1.0, 5000, 1, new pd(0, 2, 2, 2));
        this.aj().a(d7);
        this.aj().b((p1)on.p.D().a.getDefaultValue());
        for (BasicValue object2 : zu_02.r()) {
            if (object2.getDefaultValue() == null) continue;
            this.aj().b((p1)object2.getDefaultValue());
        }
        rg_0 rg_02 = this.a("Reset current profile");
        rg_02.b("This will set your current profile to\nthe default settings of Vape");
        rg_02.a(new pS(this));
        rg_0 rg_03 = this.a("Reset GUI positions");
        rg_03.b("This will reset your GUI back to the default");
        rg_03.a(new vt_0(this));
        rg_0 rg_04 = this.a("Sort GUI");
        rg_04.b("Sorts GUI by size");
        rg_04.a(new pH(this, zu_02));
        rg_0 rg_05 = this.a("Edit GUI");
        rg_05.b("Allows you to hide or show certain components of the GUI");
        rg_05.a(new dk_0(this, zu_02));
        zu_0 zu_03 = on.p.H().b(zu_0.class);
        s7 s72 = new s7(zu_03);
        s72.a("Rebind GUI");
        s72.W().e(0.5);
        s72.b(10.0);
        s72.c(96.0);
        s72.ab().J();
        s72.W().a(new kh_0(this, s72));
        this.aj().b(rg_02);
        this.aj().b(rg_03);
        this.aj().b(rg_04);
        this.aj().b(rg_05);
        this.aj().b(s72);
        this.k(true);
        this.aj().b(new Color(45, 45, 45, 255));
    }

    private rg_0 a(String string) {
        int n6 = 80;
        rg_0 rg_02 = new rg_0(string, true);
        rg_02.z().b(my_0.c);
        rg_02.e(0.5);
        rg_02.c(e);
        rg_02.z().e(0.75);
        ((D7)rg_02.u()).f().c = 2;
        rg_02.b(10.0);
        rg_02.c(n6);
        rg_02.a(new Color(128, 128, 128, 32));
        return rg_02;
    }
}

