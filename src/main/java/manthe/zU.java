/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.friend.Friend;
import rip.vape.module.Module;

public class zU
extends Module {
    public zU() {
        super("Friends", 0, 0, CQ.b, null);
    }

    @Override
    public void k() {
        this.z();
    }

    @Override
    public void a(kN kN2) {
        if (!on.p.N().spoofAlias.u().booleanValue()) {
            return;
        }
        Friend ab_02 = on.p.N().a(kN2.getUserName(), false);
        if (on.p.N().spoofAlias.u().booleanValue()) {
            if (ab_02 != null && ab_02.getTarget()) {
                kN2.setDisplayName(ab_02.getAlias());
            }
        } else {
            kN2.setDisplayName(kN2.getDisplayName());
        }
    }

    @Override
    public void a(kK kK2) {
        if (!on.p.N().spoofAlias.u().booleanValue()) {
            return;
        }
        for (Friend ab_02 : on.p.N().e()) {
            if (!ab_02.getTarget() || !kK2.getMessage().g().toLowerCase().contains(ab_02.getName().toLowerCase())) continue;
            String string = kK2.getMessage().f();
            int n6 = string.toLowerCase().indexOf(ab_02.getName().toLowerCase());
            while (n6 >= 0) {
                String string2 = string.substring(n6, n6 + ab_02.getName().toLowerCase().length());
                string = string.replaceAll(string2, ab_02.getNameOrAlias());
                n6 = string.toLowerCase().indexOf(ab_02.getName());
            }
            kK2.setMessage(gV.b(string));
        }
    }
}

