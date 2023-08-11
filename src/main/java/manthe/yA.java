/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import rip.vape.module.Module;

public class yA
extends yc_0 {
    private static boolean v;

    public yA(Module y52, String string) {
        super(y52, string);
    }

    @Override
    public void a(km_0 km_02) {
        if (km_02.c()) {
            eJ eJ2 = ds_2.k();
            if (eJ2.e()) {
                return;
            }
            double d3 = 0.163;
            double d4 = Math.cos(Math.toRadians(eJ2.U() + 90.0f));
            double d5 = Math.sin(Math.toRadians(eJ2.U() + 90.0f));
            double d6 = (double)eJ2.bg().j() * d3 * d4 + (double)eJ2.bg().h() * d3 * d5;
            double d7 = (double)eJ2.bg().j() * d3 * d5 - (double)eJ2.bg().h() * d3 * d4;
            if (eJ2.E() && !eJ2.aQ()) {
                if (V.c() > 13) {
                    eJ2.bp().a(ft_0.a(eJ2.z() + d6, eJ2.l(), eJ2.g() + d7, false));
                    eJ2.bp().a(ft_0.a(eJ2.z(), eJ2.l() - 0.4982374987, eJ2.g(), false));
                } else {
                    eJ2.bp().a(ft_0.a(eJ2.z() + d6, eJ2.s().l(), eJ2.l(), eJ2.g() + d7, false));
                    eJ2.bp().a(ft_0.a(eJ2.z(), eJ2.s().l() - 0.4982374987, eJ2.l() - 0.4982374987, eJ2.g(), false));
                }
            }
        }
    }

    public static void e(boolean bl) {
        v = bl;
    }

    public static boolean U() {
        return v;
    }

    public static boolean T() {
        boolean bl = yA.U();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!yA.U()) {
            yA.e(true);
        }
    }
}

