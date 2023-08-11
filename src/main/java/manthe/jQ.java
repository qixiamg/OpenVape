/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
package manthe;

import io.netty.util.concurrent.GenericFutureListener;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bp_1;
import manthe.cy_0;
import manthe.gJ;

public class jQ
extends gJ {
    private final BG a = this.b("channel", true, A5.f);
    private final BG k = this.b("outboundPacketsQueue", true, Queue.class);
    private final bp_1 h;
    private final bp_1 j;
    private final bp_1 g;
    public bp_1 e;
    public bp_1 l;
    private BG i;
    private BG f;
    private static cy_0[] d;

    public jQ() {
        super(A5.aU);
        if (V.c() == 13) {
            this.i = this.b("receivedPacketsQueue", true, Queue.class);
            this.l = this.a("func_150725_a", false, Void.TYPE, A5.aH, GenericFutureListener[].class);
        } else {
            this.f = this.b("field_181680_j", cy_0.c, ReentrantReadWriteLock.class);
            this.l = this.a("func_179290_a", cy_0.c, Void.TYPE, A5.aH);
        }
        this.h = this.a("getNetHandler", true, A5.aC, new Class[0]);
        this.j = this.a("flushOutboundQueue", true, Void.TYPE, new Class[0]);
        this.g = this.a("dispatchPacket", true, Void.TYPE, A5.aH, GenericFutureListener[].class);
        this.e = this.a(cy_0.c ? "a" : "channelRead0", false, Void.TYPE, A5.cY, A5.aH);
        if (this.e.a() && cy_0.c) {
            this.e = this.a("channelRead0", true, Void.TYPE, A5.cY, A5.aH);
        }
    }

    private Object b(Object object) {
        return this.a.f(object);
    }

    private Object c(Object object) {
        return this.h.e(object, new Object[0]);
    }

    private Queue a(Object object) {
        return (Queue)this.i.f(object);
    }

    private Queue f(Object object) {
        return (Queue)this.k.f(object);
    }

    private void d(Object object) {
        this.j.p(object, new Object[0]);
    }

    private void a(Object object, Object object2, Object[] objectArray) {
        this.g.p(object, object2, objectArray);
    }

    private ReentrantReadWriteLock e(Object object) {
        return (ReentrantReadWriteLock)this.f.f(object);
    }

    static Object e(jQ jQ2, Object object) {
        return jQ2.b(object);
    }

    static Object b(jQ jQ2, Object object) {
        return jQ2.c(object);
    }

    static Queue a(jQ jQ2, Object object) {
        return jQ2.a(object);
    }

    static Queue d(jQ jQ2, Object object) {
        return jQ2.f(object);
    }

    static void f(jQ jQ2, Object object) {
        jQ2.d(object);
    }

    static void a(jQ jQ2, Object object, Object object2, Object[] objectArray) {
        jQ2.a(object, object2, objectArray);
    }

    static ReentrantReadWriteLock c(jQ jQ2, Object object) {
        return jQ2.e(object);
    }

    public static void b(cy_0[] cy_0Array) {
        d = cy_0Array;
    }

    public static cy_0[] d() {
        return d;
    }

    static {
        if (jQ.d() != null) {
            jQ.b(new cy_0[4]);
        }
    }
}

