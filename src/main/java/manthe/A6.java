/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.Cj;
import manthe.rs_0;
import manthe.sb_0;
import manthe.vK;

class A6
implements vK {
    final sb_0 b;
    final rs_0 a;

    A6(rs_0 rs_02, sb_0 sb_02) {
        this.a = rs_02;
        this.b = sb_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string;
        if (n11 == 0 && (string = this.b.z().E()).contains(":")) {
            String[] stringArray = string.split(":");
            if (stringArray.length == 2) {
                String string2 = stringArray[0];
                String string3 = stringArray[1];
                this.a.a(new Cj(string2, string3));
            }
            this.b.z().a("");
        }
    }
}

