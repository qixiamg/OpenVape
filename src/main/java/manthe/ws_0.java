/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.DD;
import manthe.am_0;
import manthe.dp_0;
import manthe.mD;
import manthe.oK;
import manthe.rb_0;
import manthe.w3;
import manthe.w8;
import manthe.wM;
import manthe.xG;
import manthe.xM;
import manthe.xN;
import manthe.y_;

/*
 * Renamed from manthe.ws
 */
public class ws_0
extends w8<w3> {
    public ws_0(w3 w32) {
        super(w32);
        this.a(new xM(this, w32.S() ? "blockedicon" : "allowedicon", w32.R()).a(new y_(this, w32)));
        this.ak();
    }

    public void ak() {
        block3: {
            block2: {
                this.J();
                this.a(new wM[]{new xG(this, "Add entry...")});
                if (!(((w3)this.m()).Q() instanceof dp_0)) break block2;
                for (rb_0 rb_02 : ((dp_0)((w3)this.m()).Q()).t()) {
                    this.a((wM)new xN(((w3)this.m()).S() ? ws_0.b.j : ws_0.b.i, rb_02.V()).a(new am_0(this, rb_02)).a(rb_02), new Object[0]);
                }
                break block3;
            }
            if (!(((w3)this.m()).Q() instanceof DD)) break block3;
            for (mD mD2 : ((DD)((w3)this.m()).Q()).s()) {
                String string = mD2.d() + (mD2.b() < 0 ? "" : ":" + mD2.b());
                this.a((wM)new xN(((w3)this.m()).S() ? ws_0.b.j : ws_0.b.i, string).a(new oK(this, mD2)).a(mD2), new Object[0]);
            }
        }
    }
}

