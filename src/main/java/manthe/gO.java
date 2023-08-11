/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Set;
import manthe.ex_0;
import manthe.gS;

public class gO
extends gS {
    public gO(Object object) {
        super(object);
    }

    public Set l() {
        return gO.a.M().d.a(this.b);
    }

    @Override
    public ex_0 a(int n6) {
        return new ex_0(gO.a.M().d.a(this.b, n6));
    }

    public void a(int n6, ex_0 ex_02) {
        gO.a.M().d.a(this.b, n6, ex_02);
    }
}

