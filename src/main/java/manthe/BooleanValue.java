/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import rip.vape.value.BasicValue;

public class BooleanValue extends DR<Boolean, qD> {
    private static String[] n;

    static {
        if (BooleanValue.v() == null) {
            BooleanValue.b(new String[2]);
        }
    }

    private boolean o;

    public BooleanValue(Object object, String string, qD qD2) {
        super(object, string, qD2);
    }

    public BooleanValue(Object object, String string, boolean bl) {
        super(object, string, new qD(string, 10.0));
        ((qD) this.getDefaultValue()).b(10.0);
        ((qD) this.getDefaultValue()).g(bl);
        this.setType(Boolean.valueOf(bl));
        ((qD) this.getDefaultValue()).a(this);
    }

    public BooleanValue(Object object, String string, String string2, boolean bl) {
        super(object, string, new qD(string2, 10.0));
        ((qD) this.getDefaultValue()).b(10.0);
        ((qD) this.getDefaultValue()).g(bl);
        this.setType(Boolean.valueOf(bl));
        ((qD) this.getDefaultValue()).a(this);
    }

    public static BooleanValue createValue(Object object, String string, String string2, boolean bl) {
        qD qD2 = new qD(string2, 10.0);
        qD2.b(10.0);
        qD2.g(bl);
        BooleanValue dB = new BooleanValue(object, string, qD2);
        dB.setType(Boolean.valueOf(bl));
        qD2.a(dB);
        return dB;
    }

    public static BooleanValue createValue(Object object, String string, boolean bl, String string2) {
        BooleanValue dB = BooleanValue.createValue(object, string, string, bl);
        ((qD) dB.getDefaultValue()).b(string2);
        return dB;
    }

    public static BooleanValue createValue(Object object, String string, boolean bl) {
        return BooleanValue.createValue(object, string, string, bl);
    }

    public static void b(String[] stringArray) {
        n = stringArray;
    }

    public static String[] v() {
        return n;
    }

    public Boolean u() {
        return ((qD) this.getDefaultValue()).G();
    }

    @Override
    public void setType(Boolean bl) {
        if (this.b() == null) {
            this.setType(bl);
        }
        ((qD) this.getDefaultValue()).g(bl);
    }

    public Boolean x() {
        if (((qD) this.getDefaultValue()).N()) {
            if (a.ib()) {
                return this.u();
            }
            return false;
        }
        return this.u();
    }

    public boolean w() {
        return ((qD) this.getDefaultValue()).N() && !a.ib();
    }

    public BooleanValue d(boolean bl) {
        ((qD) this.getDefaultValue()).h(bl);
        return this;
    }

    @Override
    public void getRuntimeCopyException(String string) {
        this.setType((Boolean) Boolean.parseBoolean(string));
    }

    @Override
    public boolean s() {
        return this.getDefaultValue().G();
    }

    @Override
    public boolean b(BasicValue ds_02) {
        return this.y();
    }

    public void e(boolean bl) {
        this.o = bl;
    }

    public boolean y() {
        if (zu_0.T.ab()) {
            return this.u();
        }
        return this.o;
    }
}

