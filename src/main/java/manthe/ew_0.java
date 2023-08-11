/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.List;
import manthe.d6_0;
import manthe.ej_0;
import manthe.ez_0;
import manthe.ih_0;

/*
 * Renamed from manthe.ew
 */
public class ew_0<T extends ej_0>
extends ez_0<T> {
    public ew_0(Object object) {
        super(object);
    }

    public d6_0 g() {
        return new d6_0(ih_0.b(ew_0.a.M().Q, this.b));
    }

    public List<Object> f() {
        return (List)ih_0.a(ew_0.a.M().Q, this.b);
    }

    public void a(List list) {
        ih_0.a(ew_0.a.M().Q, this.b, list);
    }

    public void h() {
        ih_0.c(ew_0.a.M().Q, this.b);
    }

    public boolean a(ej_0 ej_02, float f10, boolean bl) {
        return ew_0.a.M().Q.a(this.b, ej_02.a(), f10, bl);
    }
}

