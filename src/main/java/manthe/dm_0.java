/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.Dm
 */
class dm_0
extends BooleanValue {
    final zu_0 p;

    dm_0(zu_0 zu_02, Object object, String string, boolean bl) {
        this.p = zu_02;
        super(object, string, bl);
    }

    @Override
    public void setType(Boolean bl) {
        super.setType(bl);
        zu_0.e(this.p.af.u());
    }
}

