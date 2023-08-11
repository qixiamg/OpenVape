/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;

/*
 * Renamed from manthe.xz
 */
public class xz_0
extends x4 {
    public xz_0(String string) {
        super(string);
        this.e(false);
        this.G = xz_0.b.i;
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
        on.p.N().b(new Friend(string, string2));
        zu_0.b(wX.class).ak();
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

