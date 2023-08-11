/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.ak_0;
import manthe.pe_0;
import manthe.wM;
import manthe.wa_0;
import manthe.we_0;
import manthe.xZ;

public class wD
extends we_0 {
    public static wD V;

    public wD() {
        this.P = false;
        this.W().e(false);
        this.W().b("wrap");
        this.a(new wM[]{new xZ("YOUR PROFILES")});
        V = this;
    }

    @Override
    public void V() {
    }

    @Override
    public void C() {
        super.C();
        pe_0.c(this.d(), this.c(), this.e() - 0.5, 0.5, wD.b.y);
    }

    @Override
    public void K() {
    }

    public void b(ak_0 ak_02) {
        this.a(new wM[]{new wa_0(ak_02)});
    }

    public void a(ak_0 ak_02) {
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wa_0) || !((wa_0)wM2).N().l().equals(ak_02.l())) continue;
            this.a(wM2);
        }
    }

    @Override
    public String ad() {
        return "privateprofiles";
    }
}

