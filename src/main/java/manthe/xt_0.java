/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;

/*
 * Renamed from manthe.xt
 */
public class xt_0
extends xN {
    private Friend H;

    public xt_0(Friend ab_02) {
        super(xt_0.b.i, ab_02.getName());
        this.H = ab_02;
    }

    @Override
    public boolean n() {
        return this.H.getTarget();
    }

    @Override
    public void a(uW uW2) {
        this.H.setAlias(!this.H.getTarget());
    }

    public Friend J() {
        return this.H;
    }

    @Override
    public void a() {
        String string = this.H.getName();
        if (!this.H.getNameOrAlias().equals(this.H.getName()) && !this.l()) {
            string = "*" + this.H.getAlias();
        }
        this.b(string);
        super.a();
    }
}

