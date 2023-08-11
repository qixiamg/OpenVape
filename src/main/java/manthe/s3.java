/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.Dg;
import manthe.af_0;
import manthe.on;
import manthe.r1;
import manthe.r2;
import manthe.r4;
import manthe.sI;
import manthe.zu_0;

public class s3
extends sI {
    private final r1 V;

    public s3(r1 r12) {
        super(r12.X().E(), r12.ah());
        this.V = r12;
        this.b(15.0);
        zu_0 zu_02 = on.p.H().b(zu_0.class);
        r4 r42 = this.W();
        r42.a(new Dg(this));
        this.a(new af_0(this, zu_02, r12));
        if (!(r12 instanceof r2)) {
            this.k(true);
        }
        this.l(false);
    }

    public r1 ac() {
        return this.V;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public void F() {
        super.F();
        zu_0 zu_02 = on.p.H().b(zu_0.class);
        if (zu_02 == null) {
            return;
        }
        if (!this.G()) {
            this.V.a(false);
        } else {
            if (this.V.t() < -100.0 || this.V.k() < -100.0) {
                this.V.a(50.0);
                this.V.d(50.0);
            }
            this.V.a(true);
            zu_02.a(this.V);
            if (zu_02.Z()) {
                this.V.a(this.e());
            }
            on.p.F().d().remove(this.V);
            on.p.F().d().add(0, this.V);
        }
        zu_02.b(this.V);
    }
}

