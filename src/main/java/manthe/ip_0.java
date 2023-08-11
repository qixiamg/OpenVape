/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Map;
import java.util.Set;
import manthe.A5;
import manthe.BG;
import manthe.cy_0;
import manthe.gJ;

/*
 * Renamed from manthe.ip
 */
public class ip_0
extends gJ {
    private final BG d = this.a(A5.dU, "classLoader", false, A5.aG);
    private final BG a = this.b("cachedClasses", false, Map.class);
    private final BG f = this.b("invalidClasses", false, Set.class);
    private static cy_0[] e;

    public ip_0() {
        super(A5.aG);
    }

    public Object e() {
        return this.d.f(null);
    }

    public Map a(Object object) {
        return (Map)this.a.f(object);
    }

    private Set b(Object object) {
        return (Set)this.f.f(object);
    }

    static Set a(ip_0 ip_02, Object object) {
        return ip_02.b(object);
    }

    public static void b(cy_0[] cy_0Array) {
        e = cy_0Array;
    }

    public static cy_0[] d() {
        return e;
    }

    static {
        if (ip_0.d() != null) {
            ip_0.b(new cy_0[3]);
        }
    }
}

