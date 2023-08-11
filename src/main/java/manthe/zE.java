/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import org.lwjgl.opengl.GL11;
import rip.vape.module.Module;

public class zE
extends Module {
    private final List<qw> x = new ArrayList<qw>();
    private final ef_0 u;
    private final CopyOnWriteArrayList<tV> z = new CopyOnWriteArrayList();
    private final DF C = DF.a((Object)this, "Range", "#", "", 1.0, 50.0, 100.0, 1.0);
    private final DF A = DF.a((Object)this, "-", "-", "-", 5.0, 5.0, 5.0, 1.0);
    private final BooleanValue v = BooleanValue.createValue((Object)this, "Only caves", false, "Only looks for ores exposed to air");
    private sT B;
    private sT w;
    private static boolean y;

    public zE() {
        super("Search", -16737793, CQ.d, "Draws outline around selected blocks\nAdd blocks in Search frame");
        this.u = ds_2.r();
        this.a(this.C, this.v);
        ((qD)this.v.getDefaultValue()).a(new AK(this));
    }

    public void a(qw qw2) {
        this.x.add(qw2);
    }

    public void b(qw qw2) {
        this.x.remove(qw2);
        for (tV tV2 : this.z) {
            if (qw2.g() != tV2.g) continue;
            this.z.remove(tV2);
        }
    }

    @Override
    public void a(kx_0 kx_02) {
        ds_2.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        eJ eJ2 = ds_2.k();
        double d3 = this.u.m();
        double d4 = this.u.n();
        double d5 = this.u.j();
        for (tV tV2 : this.z) {
            if (!tV2.a() || tV2.g == 0) continue;
            double d6 = pf_0.b((ex_0)eJ2, (double)tV2.a, (double)tV2.b, tV2.f);
            if (d6 <= this.C.a()) {
                ac_1.a(tV2, d3, d4, d5);
                continue;
            }
            if (!(d6 > this.C.a() + 10.0)) continue;
            this.z.remove(tV2);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        ds_2.M().b(1.0);
    }

    @Override
    public void s() {
        this.B = new sT(this.z, this.x, this.C);
        this.w = new sT(this.z, this.x, this.A);
        this.B.a(this.v.u());
        this.w.a(this.v.u());
        this.B.e();
        this.w.e();
    }

    @Override
    public void J() {
        this.B.f();
        this.w.f();
        this.z.clear();
    }

    static sT a(zE zE2) {
        return zE2.B;
    }

    static BooleanValue b(zE zE2) {
        return zE2.v;
    }

    static sT c(zE zE2) {
        return zE2.w;
    }

    public static void e(boolean bl) {
        y = bl;
    }

    public static boolean S() {
        return y;
    }

    public static boolean T() {
        boolean bl = zE.S();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (zE.T()) {
            zE.e(true);
        }
    }
}

