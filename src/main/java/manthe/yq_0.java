/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import rip.vape.module.Module;

/*
 * Renamed from manthe.yq
 */
public class yq_0
extends Module {
    public static yq_0 u;
    private I v;
    private static boolean w;

    public yq_0() {
        super("AM", 0, CQ.b);
        u = this;
        new B(this).start();
        this.d(true);
    }

    @Override
    public void getRuntimeCopyException(ke_0 ke_02) {
        if (this.v != null && ds_2.k().d()) {
            this.v.a(ke_02);
        }
    }

    public boolean V() {
        return this.v != null && !this.v.e();
    }

    public I S() {
        return this.v;
    }

    public void a(I i) {
        this.d(true);
        this.v = i;
    }

    static I a(yq_0 yq_02) {
        return yq_02.v;
    }

    static I a(yq_0 yq_02, I i) {
        yq_02.v = i;
        return yq_02.v;
    }

    public static void e(boolean bl) {
        w = bl;
    }

    public static boolean T() {
        return w;
    }

    public static boolean U() {
        boolean bl = yq_0.T();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (yq_0.T()) {
            yq_0.e(true);
        }
    }
}

