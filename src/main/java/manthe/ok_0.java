/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import manthe.oc_0;
import manthe.p1;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.so_0;
import manthe.ui_0;
import manthe.yt_0;

/*
 * Renamed from manthe.ok
 */
public abstract class ok_0
implements Runnable {
    private final yt_0 c;
    private final p1 b;
    private ui_0 d = new ui_0(this, null);
    private oc_0 a = new oc_0(this, null);

    public ok_0(yt_0 yt_02, p1 p12) {
        this.c = yt_02;
        this.b = p12;
    }

    @Override
    public void run() {
        if (!this.a.isAlive()) {
            this.a = new oc_0(this, null);
            this.a.start();
        } else {
            this.d = new ui_0(this, null);
            this.d.start();
        }
    }

    public boolean c() {
        return this.a.isAlive() || this.d.isAlive();
    }

    public abstract void b();

    public String a() {
        if (this.b == null) {
            return "";
        }
        if (this.b instanceof rg_0) {
            return ((rg_0)this.b).z().E();
        }
        if (this.b instanceof rl_0) {
            return ((rl_0)this.b).E();
        }
        if (this.b instanceof rf_0) {
            return ((rl_0)((rf_0)this.b).v().get(0)).E();
        }
        if (this.b instanceof so_0) {
            return ((so_0)this.b).a().z().E();
        }
        return "";
    }

    public void a(String string) {
        if (this.b == null) {
            return;
        }
        if (this.b instanceof rg_0) {
            ((rg_0)this.b).z().a(string);
        } else if (this.b instanceof rl_0) {
            ((rl_0)this.b).a(string);
        } else if (this.b instanceof rf_0) {
            ((rl_0)((rf_0)this.b).v().get(0)).a(string);
        } else if (this.b instanceof so_0) {
            ((so_0)this.b).a().z().a(string);
        }
    }

    static yt_0 b(ok_0 ok_02) {
        return ok_02.c;
    }

    static oc_0 a(ok_0 ok_02) {
        return ok_02.a;
    }

    static p1 c(ok_0 ok_02) {
        return ok_02.b;
    }
}

