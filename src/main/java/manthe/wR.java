/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.aq_1;
import manthe.on;
import manthe.qw;
import manthe.uC;
import manthe.w8;
import manthe.wM;
import manthe.wQ;
import manthe.xK;
import manthe.xM;
import manthe.xa_0;

public class wR
extends w8<wQ> {
    public wR(wQ wQ2) {
        super(wQ2);
        this.a(new xM(this, "allowedicon", wQ2.R()).a(new uC(this, wQ2)));
        this.ak();
    }

    public void ak() {
        this.J();
        xK xK2 = new xK("Block name / ID");
        this.a((wM)xK2, new Object[0]);
        for (qw qw2 : on.p.d().c()) {
            xa_0 xa_02 = new xa_0(qw2);
            xa_02.a(new aq_1(this, qw2));
            this.a((wM)xa_02, new Object[0]);
        }
    }
}

