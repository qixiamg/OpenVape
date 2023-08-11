/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.pr;
import manthe.wm_0;
import manthe.x4;
import manthe.zu_0;

public class x9
extends x4 {
    public x9(String string) {
        super(string);
        this.e(false);
        this.G = x9.b.j;
    }

    @Override
    public void Q() {
        if (!this.L()) {
            this.c("");
            return;
        }
        String[] stringArray = this.N().split(" ");
        String string = stringArray[0];
        String string2 = stringArray.length > 1 ? stringArray[1] : stringArray[0];
        on.p.b().b(new pr(string, string2));
        zu_0.b(wm_0.class).ak();
        this.c("");
    }

    @Override
    public double l() {
        return this.e() - 35.0;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 20.0;
    }
}

