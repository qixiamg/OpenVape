/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Collection;
import manthe.A5;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.hf
 */
public class hf_0
extends gJ {
    public bp_1 d = this.a("size", false, Integer.TYPE, new Class[0]);
    public bp_1 a = this.a("values", false, Collection.class, new Class[0]);

    public hf_0() {
        super(A5.bA);
    }

    public int a(Object object) {
        return this.d.o(object, new Object[0]);
    }

    public Collection b(Object object) {
        return (Collection)this.a.e(object, new Object[0]);
    }
}

