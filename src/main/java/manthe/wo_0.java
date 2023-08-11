/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.DY;
import manthe.k9;
import manthe.mq;
import manthe.pe_0;
import manthe.w7;
import manthe.wB;
import manthe.yV;
import manthe.zu_0;

/*
 * Renamed from manthe.wo
 */
public class wo_0
extends w7 {
    private DY G;
    private wB H;

    public wo_0(DY dY) {
        this.G = dY;
        this.c(new yV(this));
        this.H = new wB(this);
        zu_0.T().add(this.H);
    }

    @Override
    public void a() {
        this.o();
        this.H.n();
        mq mq2 = this.e(0.9);
        mq mq3 = this.e(0.75);
        Color color = wo_0.b.k;
        Color color2 = this.P() ? wo_0.b.c : (this.O() ? wo_0.b.c : wo_0.b.r);
        double d3 = mq2.a("Targets");
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0 - 2.5 - 2.0;
        double d5 = d4 + 7.5 + 1.0;
        pe_0.a(this.d() + 5.0, this.c() + 2.5, this.e() - 10.0, this.f() - 5.0, this.O() ? b.e() : this.N().q());
        pe_0.a(this.d() + 5.0 + 0.5, this.c() + 2.5 + 0.5, this.e() - 10.0 - 1.0, this.f() - 5.0 - 1.0, color);
        double d6 = this.d() + 10.0 - 2.0;
        float f10 = 6.0f;
        mq2.a("Target:", d6, d4 + 1.0, color2);
        d6 += 2.5 + mq2.b("Target:");
        if (this.G.r().e().u().booleanValue()) {
            k9.a(color2, (float)d6, (float)d4, "newplayers", f10, f10, false);
            d6 += (double)(2.5f + f10);
        }
        if (this.G.r().i().u().booleanValue()) {
            k9.a(color2, (float)d6, (float)d4, "newmobs", f10, f10, false);
            d6 += (double)(2.5f + f10);
        }
        if (this.G.r().b().u().booleanValue()) {
            k9.a(color2, (float)d6, (float)d4, "newpeaceful", f10, f10, false);
            d6 += (double)(2.5f + f10);
        }
        if (this.G.r().h().u().booleanValue()) {
            k9.a(color2, (float)d6, (float)d4, "newneutral", f10, f10, false);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.G.r().d().u().booleanValue()) {
            stringBuilder.append("invisible, ");
        }
        if (this.G.r().g().u().booleanValue()) {
            stringBuilder.append("naked, ");
        }
        if (this.G.r().a().u().booleanValue()) {
            stringBuilder.append("behind walls, ");
        }
        String string = stringBuilder.length() < 1 ? "none" : stringBuilder.substring(0, stringBuilder.length() - 2);
        mq3.a("Ignore " + string, this.d() + 10.0 - 2.0, d5, wo_0.b.r);
    }

    public DY Q() {
        return this.G;
    }
}

