/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.ra_0;
import manthe.wK;
import manthe.wM;
import manthe.wY;
import manthe.wj_0;
import manthe.xJ;
import manthe.xR;
import manthe.xh_0;
import manthe.xx_0;
import manthe.zu_0;

public class wJ
extends wj_0 {
    private xx_0 Y;
    private xx_0 aa;
    private xx_0 X;
    private wK Z;

    public wJ() {
        this.Y = new xx_0(ra_0.al().ae);
        this.aa = new xx_0(ra_0.al().ah);
        this.X = new xx_0(ra_0.al().af);
        this.Z = new wK(ra_0.al().ai);
        this.a(new xh_0(this, "newrearview", "Rearview"));
        this.Y.a(wJ.b.u);
        this.aa.a(wJ.b.u);
        this.X.a(wJ.b.u);
        this.Z.a(wJ.b.u);
        this.b(this.Y, this.aa, this.X, this.Z, new xJ(this, wJ.b.y));
        this.a((wM)new xR(this), new Object[0]);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "Rearview";
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        zu_0.b(wY.class).am().f(this.b());
    }
}

