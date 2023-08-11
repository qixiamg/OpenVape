/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.cX
 */
public enum cx_0 {
    ALPHA(1, true),
    LUMINANCE(1, false),
    LUMINANCE_ALPHA(2, true),
    RGB(3, false),
    RGBA(4, true),
    BGRA(4, true),
    ABGR(4, true);

    final int b;
    final boolean c;

    private cx_0(int n10, boolean bl) {
        this.b = n10;
        this.c = bl;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }
}

