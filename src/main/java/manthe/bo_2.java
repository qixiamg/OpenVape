/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.bo
 */
public class bo_2 {
    private float b;
    private float a;
    private float c;

    public float a(float f10, float f11) {
        this.b += f10;
        f10 = (this.b - this.a) * f11;
        this.c += (f10 - this.c) * 0.5f;
        if (f10 > 0.0f && f10 > this.c || f10 < 0.0f && f10 < this.c) {
            f10 = this.c;
        }
        this.a += f10;
        return f10;
    }
}

