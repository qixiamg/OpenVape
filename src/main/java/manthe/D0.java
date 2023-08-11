/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

public class D0
extends BasicValue<String, p1> {
    private String l;

    public D0(Object object, String string) {
        super(object, string, null);
    }

    public String a() {
        return this.l;
    }

    @Override
    public void b(String string) {
        this.l = string;
    }

    @Override
    public void setType(String string) {
        this.l = string;
    }
}

