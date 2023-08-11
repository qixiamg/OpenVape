/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import a.a;
import manthe.AO;
import manthe.dd_0;
import manthe.ds_2;
import manthe.ng;

/*
 * Renamed from manthe.Dl
 */
public class dl_0 {
    private final AO a = new AO();
    private String d;
    private String b;
    private static String c;

    public void a(boolean bl) {
        String string;
        if (!this.a.a(1000L)) {
            return;
        }
        this.a.d();
        if (!bl) {
            a.a.updc(null, null);
            return;
        }
        dd_0 dd_02 = ds_2.g();
        String string2 = "Not in a server";
        if (dd_02.d()) {
            string2 = "Playing legit on " + dd_02.f();
        }
        if ((string = ng.b.al()).length() >= 128) {
            string = string.substring(0, 128);
        }
        if (!string2.equals(this.d) || !this.b.equals(string)) {
            a.a.updc(string2, string);
        }
        this.d = string2;
        this.b = string;
    }

    public static void b(String string) {
        c = string;
    }

    public static String b() {
        return c;
    }

    static {
        if (dl_0.b() != null) {
            dl_0.b("JQYag");
        }
    }
}

