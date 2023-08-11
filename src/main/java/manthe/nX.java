/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.sI;

class nX
implements R<sI> {
    final sI a;

    nX(sI sI2) {
        this.a = sI2;
    }

    @Override
    public void a(sI sI2) {
        if (this.a.ab().v().size() > 0) {
            sI2.V().a(true);
            sI2.W().s().u().b();
            double d3 = 0.0;
            for (p1 p12 : sI.c(this.a).v()) {
                if (!p12.e()) continue;
                d3 += p12.b() + 2.0;
            }
            sI.c(this.a).b(d3 + 2.0);
        } else {
            sI2.V().a(false);
        }
        sI.b(this.a);
    }
}

