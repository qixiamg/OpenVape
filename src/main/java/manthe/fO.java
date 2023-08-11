/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import manthe.cy_0;
import manthe.f1;
import manthe.fn_0;
import manthe.gN;
import manthe.jQ;

public class fO
extends cy_0 {
    public fO(Object object) {
        super(object);
    }

    public gN j() {
        return new gN(jQ.e(fO.a.M().ao, this.b));
    }

    public f1 k() {
        return new f1(jQ.b(fO.a.M().ao, this.b));
    }

    public Queue f() {
        return jQ.a(fO.a.M().ao, this.b);
    }

    public Queue i() {
        return jQ.d(fO.a.M().ao, this.b);
    }

    public void h() {
        jQ.f(fO.a.M().ao, this.b);
    }

    public void a(fn_0 fn_02, Object[] objectArray) {
        jQ.a(fO.a.M().ao, this.b, fn_02.a(), objectArray);
    }

    public ReentrantReadWriteLock g() {
        return jQ.c(fO.a.M().ao, this.b);
    }
}

