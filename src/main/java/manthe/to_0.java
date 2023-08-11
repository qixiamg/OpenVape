/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.Objects;
import manthe.fk_0;
import manthe.vq_0;

/*
 * Renamed from manthe.to
 */
class to_0 {
    int b;
    int a;
    private boolean c;

    private to_0(int n6, int n10) {
        this.b = n6;
        this.a = n10;
        this.c = n6 == 0 || fk_0.a(n6).e();
    }

    boolean a() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        to_0 to_02 = (to_0)object;
        return this.b == to_02.b && this.a == to_02.a;
    }

    public int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public String toString() {
        return "BlockData{id=" + this.b + ", meta=" + this.a + '}';
    }

    to_0(int n6, int n10, vq_0 vq_02) {
        this(n6, n10);
    }
}

