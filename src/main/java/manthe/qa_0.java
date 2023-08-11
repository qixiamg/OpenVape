/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.qa
 */
public class qa_0 {
    private String a = null;
    private String b = null;

    public qa_0(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public qa_0(String string) {
        this.a = string;
    }

    public boolean a(String string, String string2) {
        return this.a.equals(string) && (this.b == null || this.b.equals(string2));
    }
}

