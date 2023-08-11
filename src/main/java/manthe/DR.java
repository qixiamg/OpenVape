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

    private final List<BasicValue> values = new ArrayList<>();

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

    public List<BasicValue> getValues() {
        return this.values;
    }

    public BasicValue r() {
        for (BasicValue value : this.getValues()) {
            if (!value.equals(this.getValues().get(this.getValues().size() - 1))) continue;
            if (value instanceof DR) {
                DR dR = (DR) value;
                if (!dR.getValues().isEmpty() && dR.s()) {
                    BasicValue ds_03 = (BasicValue) dR.getValues().get(dR.getValues().size() - 1);
                    if (!dR.getValues().isEmpty()) {
                        return dR.r();
                    }
                    return ds_03;
                }
                return value;
            }
            return value;
        }
        return null;
    }

    public DR a(BasicValue... ds_0Array) {
        for (BasicValue ds_02 : ds_0Array) {
            ds_02.setBaseValue(this);
        }
        this.values.addAll(Arrays.asList(ds_0Array));
        return this;
    }

    public abstract boolean s();

    public abstract boolean b(BasicValue var1);
}

