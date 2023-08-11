/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.List;

public class yR
extends y8 {
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Re-enable", false, "Re-enables all previously enabled modules upon pressing bind a second time");
    private final List<Module> w = new ArrayList<Module>();
    private boolean v = false;

    public yR() {
        super("Panic", "Disables all currently enabled modules");
        this.a(this.u);
    }

    @Override
    public void s() {
        this.d(false);
        if (this.u.u().booleanValue()) {
            boolean bl = this.v = !this.v;
            if (!this.v) {
                for (Module y52 : this.w) {
                    y52.d(true);
                }
                this.w.clear();
                return;
            }
        } else {
            this.v = false;
        }
        for (Module y53 : on.p.H().e()) {
            if (!y53.N() || y53 == this) continue;
            y53.d(false);
            if (!this.u.u().booleanValue()) continue;
            this.w.add(y53);
        }
    }

    @Override
    public void a(Module y52) {
        if (y52 != this) {
            this.v = false;
            this.w.clear();
        }
    }
}

