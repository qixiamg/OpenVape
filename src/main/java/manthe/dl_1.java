/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package manthe;

import com.google.common.collect.ImmutableMap;
import manthe.cy_0;
import manthe.dr_2;
import manthe.dx_2;

/*
 * Renamed from manthe.dL
 */
public class dl_1
extends cy_0 {
    public dl_1(Object object) {
        super(object);
    }

    public dx_2 f() {
        return new dx_2(dl_1.a.M().bY.b(this.b));
    }

    public Object a(dr_2 dr_22) {
        ImmutableMap immutableMap = dl_1.a.M().bY.a(this.b);
        if (immutableMap.containsKey(dr_22.a())) {
            return immutableMap.get(dr_22.a());
        }
        return null;
    }
}

