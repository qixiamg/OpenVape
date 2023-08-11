/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.pe_0;
import manthe.wV;
import manthe.xL;

/*
 * Renamed from manthe.wb
 */
class wb_0
extends wV {
    final xL I;

    wb_0(xL xL2, String string, double d3) {
        this.I = xL2;
        super(string, d3);
    }

    @Override
    public void a() {
        if (this.x()) {
            pe_0.b(this.d() + 1.5, this.c() + 4.5, 11.0, 1.0, new Color(255, 255, 255, 15));
        }
        super.a();
    }
}

