/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

/*
 * Renamed from manthe.hy
 */
public class hy_0
extends gJ {
    private final BG d;
    private BG a;

    public hy_0() {
        super(A5.K);
        if (V.c() > 13) {
            this.a = this.b("particleEmitters", true, List.class);
            this.d = this.a("fxLayers", true, "[[Ljava/util/List;");
        } else {
            this.d = this.a("fxLayers", true, "[Ljava/util/List;");
        }
    }

    public List c(Object object) {
        return (List)this.a.f(object);
    }

    private List[][] a(Object object) {
        if (object == null || this.d == null || this.d.d()) {
            return new List[0][];
        }
        return (List[][])this.d.e(object);
    }

    private List[] b(Object object) {
        return (List[])this.d.e(object);
    }

    static List[][] a(hy_0 hy_02, Object object) {
        return hy_02.a(object);
    }

    static List[] b(hy_0 hy_02, Object object) {
        return hy_02.b(object);
    }
}

