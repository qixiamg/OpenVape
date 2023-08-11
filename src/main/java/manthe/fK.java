/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Set;
import manthe.fl_0;
import manthe.jg_0;

public class fK
extends fl_0 {
    public fK(Object object) {
        super(object);
    }

    public short a(String string) {
        return jg_0.a(fK.a.M().H, this.b, string);
    }

    public Set<String> f() {
        return jg_0.a(fK.a.M().H, this.b).keySet();
    }

    public fl_0 b(String string) {
        return new fK(jg_0.b(fK.a.M().H, this.b, string));
    }
}

