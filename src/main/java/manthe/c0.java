/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.UUID;
import manthe.cy_0;
import manthe.gr_0;

public class c0
extends cy_0 {
    public c0(Object object) {
        super(object);
    }

    public static c0 a(UUID uUID, String string) {
        return new c0(gr_0.a(c0.a.M().cw, uUID, string));
    }

    public UUID g() {
        return gr_0.a(c0.a.M().cw, this.b);
    }

    public String f() {
        return gr_0.b(c0.a.M().cw, this.b);
    }
}

