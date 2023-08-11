/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.wf
 */
public class wf_0
extends wK {
    private String T;
    private int U;
    private Class S;

    public wf_0(String string, String string2, double d3, int n6) {
        super(string, d3);
        this.T = string2;
        this.U = n6;
        this.g(true);
    }

    public wf_0(String string, String string2) {
        super(string);
        this.T = string2;
        this.g(true);
    }

    public wf_0(BooleanValue dB, String string) {
        super(dB);
        this.T = string;
        this.g(true);
    }

    @Override
    protected void S() {
        if (this.S != null && ((wM)zu_0.b(this.S)).b() != this.T() && !this.P()) {
            this.N();
        }
        super.S();
    }

    @Override
    protected void R() {
        mq mq2 = this.e(this.E);
        double d3 = mq2.a(this.I);
        double d4 = this.c() + this.f() / 2.0 - d3 / 2.0;
        pe_0.a(this.T, this.d() + 5.0 + 4.0, this.c() + this.f() / 2.0, (double)this.U, (double)this.U, this.L);
        mq2.a(this.I, this.d() + (double)this.U + 10.0, d4, this.L);
    }

    @Override
    public double h() {
        return 20.0;
    }

    public void a(Class clazz) {
        this.S = clazz;
        this.c(new as_0(this, clazz));
    }
}

