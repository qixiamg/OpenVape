/*
 * Decompiled with CFR 0.152.
 */
package manthe;

/*
 * Renamed from manthe.yf
 */
public class yf_0 {
    public BooleanValue e = BooleanValue.createValue((Object)this, "Save to Cloud", false, "Logs into an account in offline mode.");
    public D0 d = new DT(this, this, "alteningKey");
    public BooleanValue a = BooleanValue.createValue((Object)this, "Auto-load module states", false, "Automatically enable saved module states upon loading profiles.\n(You can save module states by shift+right clicking a profile button)");
    public D0 b = new D6(this, this, "alts");
    public D0 c = new D0(this, "selectedprofile");

    public yf_0() {
        this.e.getRuntimeCopyException(new vG(this));
    }
}

