/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.iu
 */
public class iu_0
extends gJ {
    private final BG a;
    private final BG d;

    public iu_0() {
        super(A5.cT);
        if (V.c() >= 23) {
            this.a = this.a("MOVEMENT_SPEED", true, A5.b9);
            this.d = this.a("ATTACK_DAMAGE", true, A5.b9);
        } else {
            this.a = this.a("movementSpeed", true, A5.b9);
            this.d = this.a("attackDamage", true, A5.b9);
        }
    }

    public Object e() {
        return this.a.f(null);
    }

    public Object d() {
        return this.d.f(null);
    }
}

