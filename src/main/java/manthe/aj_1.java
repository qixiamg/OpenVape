/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Objects;

/*
 * Renamed from manthe.aJ
 */
class aj_1 {
    private int b;
    private int a;

    public aj_1(int n6, int n10) {
        this.b = n6;
        this.a = n10;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof aj_1) {
            return ((aj_1)object).b() == this.b() && ((aj_1)object).a() == this.a();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.b(), this.a());
    }
}

