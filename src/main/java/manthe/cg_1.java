/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.bp_1;
import manthe.cy_0;

/*
 * Renamed from manthe.cg
 */
public class cg_1 {
    static int h = 0;
    private final bp_1 b;
    private final Class e;
    private boolean a = true;
    private String i = null;
    private String g = "";
    private String f;
    private String c;
    private Class j;
    private static cy_0[] d;

    public cg_1(bp_1 bp_12, Class clazz) {
        this.b = bp_12;
        this.e = clazz;
    }

    public String b() {
        String string;
        String string2 = "event" + ++h;
        String string3 = "res" + string2;
        String string4 = this.e.getName() + " " + string2 + " = new " + this.e.getName() + "(" + (this.i == null ? "" : this.i) + ");\n";
        String string5 = string = "boolean " + string3 + " = " + string2 + ".fire();";
        string5 = string5 + "if(" + string3 + ") { return " + this.g.replace("$event", string2) + "; } ";
        if (this.c != null) {
            string5 = "if (" + this.c + ") { " + string5 + " }";
        }
        string4 = string4 + string5;
        if (this.f != null) {
            string4 = string4 + this.f.replace("$event", string2);
        }
        if (this.j != null) {
            string4 = "if($0 instanceof " + this.j.getName() + ") { " + string4 + " }";
        }
        string4 = "{ " + string4 + " }";
        return string4;
    }

    public void b(String string) {
        this.i = string;
    }

    public void a(String string) {
        this.g = string;
    }

    public void c(String string) {
        this.f = string;
    }

    public boolean c() {
        return this.a;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public Class e() {
        return this.e;
    }

    public bp_1 a() {
        return this.b;
    }

    public void a(Class clazz) {
        this.j = clazz;
    }

    public void d(String string) {
        this.c = string;
    }

    static {
        cg_1.b(new cy_0[3]);
    }

    public static void b(cy_0[] cy_0Array) {
        d = cy_0Array;
    }

    public static cy_0[] d() {
        return d;
    }
}

