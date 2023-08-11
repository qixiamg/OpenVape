/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DR<K, C extends p1> extends BasicValue<K, C> {
    private static cy_0[] l;

    static {
        if (DR.a() == null) {
            DR.b(new cy_0[5]);
        }
    }

    private final List<BasicValue> m = new ArrayList<BasicValue>();

    public DR(Object object, String string, C c2) {
        super(object, string, c2);
        this.getDefaultValue().j().add(new AJ());
    }

    public static void b(cy_0[] cy_0Array) {
        l = cy_0Array;
    }

    public static cy_0[] a() {
        return l;
    }

    public List<BasicValue> t() {
        return this.m;
    }

    public BasicValue r() {
        for (BasicValue ds_02 : this.t()) {
            if (!ds_02.equals(this.t().get(this.t().size() - 1))) continue;
            if (ds_02 instanceof DR) {
                DR dR = (DR) ds_02;
                if (!dR.t().isEmpty() && dR.s()) {
                    BasicValue ds_03 = (BasicValue) dR.t().get(dR.t().size() - 1);
                    if (!dR.t().isEmpty()) {
                        return dR.r();
                    }
                    return ds_03;
                }
                return ds_02;
            }
            return ds_02;
        }
        return null;
    }

    public DR a(BasicValue... ds_0Array) {
        for (BasicValue ds_02 : ds_0Array) {
            ds_02.setBaseValue(this);
        }
        this.m.addAll(Arrays.asList(ds_0Array));
        return this;
    }

    public abstract boolean s();

    public abstract boolean b(BasicValue var1);
}

