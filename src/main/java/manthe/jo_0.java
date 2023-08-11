/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

/*
 * Renamed from manthe.jo
 */
public class jo_0
extends gJ {
    private final bp_1 a;
    private bp_1 d;

    public jo_0() {
        super(A5.aH);
        if (V.c() == 13) {
            this.d = this.a("hasPriority", true, Boolean.TYPE, new Class[0]);
        }
        this.a = this.a("processPacket", true, Void.TYPE, A5.aC);
    }

    private boolean a(Object object) {
        return this.d.h(object, new Object[0]);
    }

    private void a(Object object, Object object2) {
        this.a.p(object, object2);
    }

    static boolean a(jo_0 jo_02, Object object) {
        return jo_02.a(object);
    }

    static void a(jo_0 jo_02, Object object, Object object2) {
        jo_02.a(object, object2);
    }
}

