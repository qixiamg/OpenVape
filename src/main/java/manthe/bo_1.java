/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.g2;
import manthe.on;

/*
 * Renamed from manthe.bO
 */
public class bo_1 {
    protected List<g2> a = new ArrayList<g2>();

    public void a() {
        for (g2 g22 : this.a) {
            if (g22.e()) continue;
            try {
                g22.c();
                g22.d();
                g22.a();
            }
            catch (Exception exception) {
                on.a("Error transforming " + g22.f().getName());
                on.a(exception);
            }
        }
    }

    public void b() {
        for (g2 g22 : this.a) {
            g22.b();
        }
    }
}

