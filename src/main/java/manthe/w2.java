/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.pb_0;
import manthe.rj_0;
import manthe.w5;
import manthe.wK;
import manthe.wM;
import manthe.wY;
import manthe.wj_0;
import manthe.xA;
import manthe.xh_0;
import manthe.xs_0;
import manthe.xx_0;
import manthe.zu_0;

public class w2
extends wj_0 {
    private w5<pb_0> ah;
    private w5<pb_0> Z;
    private xA ad;
    private xA aa;
    private xA ab;
    private w5<pb_0> ac;
    private w5<pb_0> ak;
    private xx_0 al;
    private xx_0 af;
    private xx_0 Y;
    private wK ag;
    private xx_0 X;
    private xx_0 ai;
    private wK ae;
    private wK aj;

    public w2() {
        this.ah = new w5(rj_0.al().aj);
        this.Z = new w5(rj_0.al().aB);
        this.ad = new xA(rj_0.al().az);
        this.aa = new xA(rj_0.al().ar);
        this.ab = new xA(rj_0.al().ap);
        this.ac = new w5(rj_0.al().an);
        this.ak = new w5(rj_0.al().au);
        this.al = new xx_0(rj_0.al().aw);
        this.af = new xx_0(rj_0.al().at);
        this.Y = new xx_0(rj_0.al().av);
        this.ag = new wK(rj_0.al().al);
        this.X = new xx_0(rj_0.al().aA);
        this.ai = new xx_0(rj_0.al().ai);
        this.ae = new wK(rj_0.al().af);
        this.aj = new wK(rj_0.al().aq);
        this.a(new xh_0(this, "newradar", "Radar"));
        this.b(this.ah, this.Z, this.ad, this.aa, this.ab, this.ac, this.ak, this.al, this.af, this.Y, this.ag, this.X, this.ai, this.ae, this.aj);
        this.a((wM)new xs_0(this), new Object[0]);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "Radar";
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        zu_0.b(wY.class).n().f(this.b());
    }
}

