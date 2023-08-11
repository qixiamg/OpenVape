/*
 * Decompiled with CFR 0.152.
 */
package manthe;

public class xS
extends xH {
    private xc_0 R;
    private DC Q;

    public xS(xc_0 xc_02, DC dC) {
        this.R = xc_02;
        this.Q = dC;
        this.I.a(false);
    }

    @Override
    public void a() {
        mq mq2 = this.e(0.75);
        String string = this.S() ? this.N() : this.U();
        mq2.a(string, this.d() + (this.l() - mq2.b(string)), this.c(), xS.b.r);
        if (this.J()) {
            this.J = string.length();
            this.a(mq2, this.d() + this.l(), this.c());
        }
        pe_0.c(this.d(), this.c() + mq2.a(string) + 2.0, this.e(), 1.0, this.T());
    }

    @Override
    public void Q() {
        try {
            double d3 = Double.parseDouble(this.N());
            switch (cj_0.a[this.Q.ordinal()]) {
                case 1: {
                    if (d3 > ((sk_0)this.R.K().getDefaultValue()).z()) {
                        ((sk_0)this.R.K().getDefaultValue()).g(((sk_0)this.R.K().getDefaultValue()).z());
                        ((sk_0)this.R.K().getDefaultValue()).i(d3);
                        break;
                    }
                    ((sk_0)this.R.K().getDefaultValue()).g(d3);
                    break;
                }
                case 2: {
                    if (d3 < ((sk_0)this.R.K().getDefaultValue()).F()) {
                        ((sk_0)this.R.K().getDefaultValue()).i(((sk_0)this.R.K().getDefaultValue()).F());
                        ((sk_0)this.R.K().getDefaultValue()).g(d3);
                        break;
                    }
                    ((sk_0)this.R.K().getDefaultValue()).i(d3);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        zu_0.W = null;
    }

    @Override
    public void R() {
        this.c(this.U());
    }

    public String U() {
        switch (cj_0.a[this.Q.ordinal()]) {
            case 1: {
                return this.R.K().r();
            }
            case 2: {
                return this.R.K().u();
            }
        }
        return null;
    }
}

