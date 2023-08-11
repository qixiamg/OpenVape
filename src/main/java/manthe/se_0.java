/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.A5;
import manthe.d__0;
import manthe.fG;
import manthe.fK;
import manthe.fl_0;
import manthe.on;
import manthe.si_0;

/*
 * Renamed from manthe.se
 */
public class se_0
extends si_0 {
    public se_0() {
        super(A5.da, 0);
    }

    @Override
    public void a(Object object) {
        d__0 d__02 = new d__0(object);
        if (on.p.t().f.u().booleanValue()) {
            fG fG2 = d__02.i();
            if (fG2.e() || fG2.i().e() || d__02.j() == null) {
                return;
            }
            for (String string : fG2.i().f()) {
                if (string.equals("display") || string.equals("Unbreakable") || string.equals("HideFlags") || string.equals("overrideMeta") || string.equals("AttributeModifiers")) continue;
                fl_0 fl_02 = fG2.i().b(string);
                d__02.j().add("");
                if (fl_02.a(A5.au)) {
                    fK fK2 = new fK(fl_02);
                    d__02.j().add("\u00a79" + string);
                    for (String string2 : fK2.f()) {
                        fl_0 fl_03 = fK2.b(string2);
                        if (fl_03.a(A5.au) || fl_03.a(A5.dv)) continue;
                        d__02.j().add(string2 + ": " + fl_03.toString());
                    }
                    continue;
                }
                d__02.j().add(string + ": " + fl_02.toString());
            }
        }
    }
}

