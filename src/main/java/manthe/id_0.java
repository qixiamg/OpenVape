/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.AbstractList;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.cm_0;
import manthe.gJ;

/*
 * Renamed from manthe.id
 */
public class id_0
extends gJ {
    private final BG g = this.b("currentItem", true, Integer.TYPE);
    private final BG f;
    private final BG d;
    private final bp_1 e;
    private final bp_1 a;

    public id_0() {
        super(A5.aj);
        if (V.c() >= 23) {
            this.f = this.b("field_70462_a", true, A5.E);
            this.d = this.b("armorInventory", true, A5.E);
        } else {
            this.f = this.b("mainInventory", true, cm_0.b(A5.bT));
            this.d = this.b("armorInventory", true, cm_0.b(A5.bT));
        }
        this.e = this.a("getStackInSlot", true, A5.bT, Integer.TYPE);
        this.a = this.a("getItemStack", true, A5.bT, new Class[0]);
    }

    public int e(Object object) {
        return this.g.c(object);
    }

    public void a(Object object, int n6) {
        this.g.a(object, n6);
    }

    public Object[] c(Object object) {
        return this.f.e(object);
    }

    private Object[] a(Object object) {
        return this.d.e(object);
    }

    public AbstractList f(Object object) {
        return (AbstractList)this.f.f(object);
    }

    private AbstractList d(Object object) {
        return (AbstractList)this.d.f(object);
    }

    public Object b(Object object, int n6) {
        return this.e.e(object, n6);
    }

    private Object b(Object object) {
        return this.a.e(object, new Object[0]);
    }

    static AbstractList b(id_0 id_02, Object object) {
        return id_02.d(object);
    }

    static Object[] a(id_0 id_02, Object object) {
        return id_02.a(object);
    }

    static Object c(id_0 id_02, Object object) {
        return id_02.b(object);
    }
}

