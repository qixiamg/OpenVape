/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Collection;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.gJ;

public class j7
extends gJ {
    private final BG d = this.b("doneLoadingTerrain", true, Boolean.TYPE);
    private final bp_1 a = V.c() >= 23 ? this.a("sendPacket", true, Void.TYPE, A5.aH) : this.a("addToSendQueue", true, Void.TYPE, A5.aH);
    private bp_1 e;

    public j7() {
        super(A5.dV);
        if (V.c() > 13) {
            this.e = this.a("getPlayerInfoMap", true, Collection.class, new Class[0]);
        }
    }

    private boolean a(Object object) {
        return this.d.d(object);
    }

    private void a(Object object, Object object2) {
        this.a.p(object, object2);
    }

    private Collection b(Object object) {
        return (Collection)this.e.e(object, new Object[0]);
    }

    static boolean b(j7 j72, Object object) {
        return j72.a(object);
    }

    static void a(j7 j72, Object object, Object object2) {
        j72.a(object, object2);
    }

    static Collection a(j7 j72, Object object) {
        return j72.b(object);
    }
}

