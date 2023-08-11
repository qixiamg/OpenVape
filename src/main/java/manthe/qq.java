/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.on;
import manthe.pr;
import manthe.r5;
import manthe.vK;

class qq
implements vK {
    final r5 a;

    qq(r5 r52) {
        this.a = r52;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = r5.a(this.a).C().E();
        if (string.isEmpty()) {
            return;
        }
        String[] stringArray = string.split(" ");
        if (string.contains(":")) {
            stringArray = string.split(":");
        }
        string = stringArray[0];
        String string2 = stringArray.length > 1 ? stringArray[1] : stringArray[0];
        r5.a(this.a).C().a("");
        pr pr2 = on.p.b().c(string);
        if (pr2 != null) {
            on.p.b().a(pr2);
        }
        pr2 = new pr(string, string2);
        on.p.b().b(pr2);
    }
}

