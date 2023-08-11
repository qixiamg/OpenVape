/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;

class qT
implements vK {
    final rq_0 a;

    qT(rq_0 rq_02) {
        this.a = rq_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        String string = rq_0.b(this.a).C().E();
        if (string.isEmpty()) {
            return;
        }
        String[] stringArray = string.split(" ");
        if (string.contains(":")) {
            stringArray = string.split(":");
        }
        string = stringArray[0];
        String string2 = stringArray.length > 1 ? stringArray[1] : stringArray[0];
        rq_0.b(this.a).C().a("");
        Friend ab_02 = on.p.N().a(string);
        if (ab_02 != null) {
            on.p.N().a(ab_02);
        }
        ab_02 = new Friend(string, string2);
        on.p.N().b(ab_02);
    }
}

