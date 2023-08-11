/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.cy_0;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from manthe.eo
 */
public class eo_0
extends cy_0 {
    public eo_0(Object object) {
        super(object);
    }

    public void f() {
        this.a(false);
    }

    public void g() {
        this.a(true);
    }

    public void a(boolean bl) {
        boolean bl2 = eo_0.a.M().al.a(this.b);
        if (bl != bl2) {
            eo_0.a.M().al.a(this.b, bl);
            if (bl) {
                GL11.glEnable((int)eo_0.a.M().al.b(this.b));
            } else {
                GL11.glDisable((int)eo_0.a.M().al.b(this.b));
            }
        }
    }
}

