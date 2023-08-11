/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

import java.util.HashMap;
import java.util.Map;

public class DX
extends DR<pb_0, rz_0<pb_0>> {
    private final Map<BasicValue, pb_0> o = new HashMap<BasicValue, pb_0>();
    private pb_0[] p;
    private final String n;

    public DX(Object object, String string, String string2, rz_0<pb_0> rz_02) {
        super(object, string, rz_02);
        this.n = string2;
    }

    public static DX a(Object object, String string, String string2, String string3, pb_0 pb_02, int n6, pb_0[] pb_0Array) {
        rz_0 rz_02 = new rz_0(string2, n6, pb_0Array);
        rz_02.b(10.0);
        DX dX = new DX(object, string, string2, rz_02);
        ((rz_0)dX.getDefaultValue()).b(string3);
        dX.setType(pb_02);
        rz_02.a(dX);
        rz_02.j().add(new AJ());
        for (pb_0 pb_03 : pb_0Array) {
            pb_03.a(dX);
        }
        dX.p = pb_0Array;
        rz_02.a(pb_02);
        return dX;
    }

    public static DX a(Object object, String string, String string2, String string3, pb_0 pb_02, pb_0 ... pb_0Array) {
        return DX.a(object, string, string2, string3, pb_02, 1, pb_0Array);
    }

    public static DX a(Object object, String string, String string2, pb_0 pb_02, pb_0 ... pb_0Array) {
        return DX.a(object, string, string, string2, pb_02, 1, pb_0Array);
    }

    public static DX a(Object object, String string, String string2, pb_0 pb_02, int n6, pb_0 ... pb_0Array) {
        return DX.a(object, string, string, string2, pb_02, n6, pb_0Array);
    }

    public static DX a(Object object, String string, pb_0 pb_02, pb_0 ... pb_0Array) {
        return DX.a(object, string, string, pb_02, pb_0Array);
    }

    public pb_0[] u() {
        return this.p;
    }

    public pb_0 v() {
        return ((rz_0)this.getDefaultValue()).a();
    }

    @Override
    public void setType(pb_0 pb_02) {
        if (this.v().equals(pb_02)) {
            return;
        }
        if (this.b() == null) {
            this.setType(pb_02);
        }
        ((rz_0)this.getDefaultValue()).a(pb_02);
    }

    @Override
    public void a(int n6) {
        this.setType(this.u()[n6]);
    }

    public int w() {
        for (int i = 0; i < this.u().length; ++i) {
            if (!this.v().equals(this.u()[i])) continue;
            return i;
        }
        return 0;
    }

    @Override
    public void getRuntimeCopyException(String string) {
        DX dX = this.v().e();
        if (dX == null) {
            return;
        }
        pb_0 pb_02 = pb_0.a(dX, string);
        if (pb_02 == null) {
            return;
        }
        this.setType(pb_02);
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public boolean b(BasicValue ds_02) {
        return !this.o.containsKey(ds_02) || this.v().equals(this.o.get(ds_02));
    }

    public void a(BasicValue ds_02, pb_0 pb_02) {
        this.o.put(ds_02, pb_02);
    }

    public void a(pb_0 pb_02, BasicValue... ds_0Array) {
        this.a(ds_0Array);
        for (BasicValue ds_02 : ds_0Array) {
            this.o.put(ds_02, pb_02);
        }
    }

    @Override
    public String H() {
        return this.n;
    }
}

