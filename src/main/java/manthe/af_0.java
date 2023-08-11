/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.awt.Color;
import manthe.R;
import manthe.my_0;
import manthe.p1;
import manthe.r1;
import manthe.s3;
import manthe.yI;
import manthe.zu_0;

/*
 * Renamed from manthe.af
 */
class af_0
implements R {
    final zu_0 c;
    final r1 b;
    final s3 a;

    af_0(s3 s32, zu_0 zu_02, r1 r12) {
        this.a = s32;
        this.c = zu_02;
        this.b = r12;
    }

    public void a(p1 p12) {
        if (this.c.Z()) {
            this.a.W().z().b(my_0.c);
            this.a.a(true);
        } else {
            this.a.W().z().b(my_0.i);
            this.a.a(this.a.Y().G());
            if (!this.a.e()) {
                this.b.a(false);
            }
        }
        if (!this.a.W().G()) {
            this.a.W().z().b(Color.WHITE);
        } else {
            this.a.W().z().b(yI.a(this.a.W().f(), 45, 240));
        }
    }
}

