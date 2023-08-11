/*
 * Decompiled with CFR 0.152.
 */
package manthe;

class DS
implements vK {
    final ak_0 b;
    final rl_0 a;
    final sg_0 c;

    DS(sg_0 sg_02, ak_0 ak_02, rl_0 rl_02) {
        this.c = sg_02;
        this.b = ak_02;
        this.a = rl_02;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (on.p.l().b() >= 10) {
            return;
        }
        if (!this.b.o()) {
            on.p.t().syncSettingsState.a().a(0, 0, 0);
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (!this.b.o()) {
            this.a.a("Must sync");
            return;
        }
        this.b.b(true);
        on.p.p();
        on.p.l().a(this.b);
        on.p.l().b(this.b);
    }
}

