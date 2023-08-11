/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.value.BasicValue;

class vG
implements C4 {
    final yf_0 a;

    vG(yf_0 yf_02) {
        this.a = yf_02;
    }

    @Override
    public void a(BasicValue ds_02) {
        BooleanValue dB = (BooleanValue)ds_02;
        if (dB.u().booleanValue()) {
            this.a.d.b("");
        }
    }
}

