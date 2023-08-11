/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

public class kN
extends kl_0 {
    private final String d;
    private String e;

    public kN(String string, String string2) {
        this.d = string;
        this.e = string2;
    }

    @Override
    public boolean fire() {
        for (Module y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public String getUserName() {
        return this.d;
    }

    public String getDisplayName() {
        return this.e;
    }

    public void setDisplayName(String string) {
        this.e = string;
    }
}

