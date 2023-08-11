/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Renamed from manthe.zs
 */
public class zs_0
extends Module {
    private final Queue<String> z = new ConcurrentLinkedQueue<String>();
    private final List<Integer> B = new ArrayList<Integer>();
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Callout", false, "Calls out who the suspected murderer is in chat.");
    private final dp_0 v = dp_0.a((Object)this, "murder-messages", "Messages", "Use %s to use the murderer's name", dp_0.o, Arrays.asList("%s is the murderer!", "i saw that %s!"));
    private final DF u = DF.a((Object)this, "Delay", "#", "ms", 0.0, 3100.0, 5000.0, "Delay between murderer callouts.");
    private final DD x = DD.a((Object)this, "murderer-items", "Murderer Items", DD.n, Arrays.asList(new mD("swords"), new mD("shovels"), new mD("axes"), new mD("pickaxes"), new mD(288), new mD(396), new mD(421), new mD(398), new mD(369), new mD(75), new mD(50), new mD(352)));
    private final AO A = new AO();
    private Object y;

    public zs_0() {
        super("MurdererFinder", -11859, CQ.h, "Shows a list of suspected Murderers.");
        this.w.a(this.u, this.v);
        this.a(this.w, this.u, this.v, this.x);
    }

    @Override
    public void t() {
        if (this.B.size() > 0) {
            d0_0 d0_02 = d0_0.a(new ds_2(), ds_2.F(), ds_2.H());
            int n6 = 25;
            dr_1 dr_12 = ds_2.m();
            dr_12.d("\u00a7nMurderer List", (double)(d0_02.g() / 2 - 20), 15.0, -1);
            for (Object e10 : ds_2.t().k()) {
                eC eC2;
                if (!A5.cc.isAssignableFrom(e10.getClass()) || A5.u.isAssignableFrom(e10.getClass()) || !this.B.contains((eC2 = new eC(e10)).q())) continue;
                dr_12.d(eC2.S(), (double)(d0_02.g() / 2 - 20), (double)n6, -1);
                n6 += 10;
            }
        }
    }

    @Override
    public void getRuntimeCopyException(kt_0 kt_02) {
        if (this.y == null || !ds_2.t().a().equals(this.y)) {
            this.B.clear();
            this.z.clear();
            this.y = ds_2.t().a();
        }
        if (this.z.size() > 0 && this.A.a(this.u.a().longValue())) {
            ds_2.k().a(this.z.poll());
            this.A.d();
        }
        for (Object e10 : ds_2.t().k()) {
            eC eC2;
            if (!A5.cc.isAssignableFrom(e10.getClass()) || A5.u.isAssignableFrom(e10.getClass()) || this.B.contains((eC2 = new eC(e10)).q()) || !eC2.a_().d() || !this.x.a(eC2.a_())) continue;
            this.B.add(eC2.q());
            if (!this.w.u().booleanValue()) continue;
            List<String> list = this.v.s();
            int n6 = (int)Math.round((double)list.size() * Math.random());
            if (n6 >= list.size()) {
                n6 = list.size() - 1;
            }
            String string = list.get(n6).replace("%s", eC2.S());
            this.z.add(string);
        }
    }

    public boolean a(ej_0 ej_02) {
        if (!ej_02.a(A5.cc)) {
            return false;
        }
        return this.B.contains(ej_02.q());
    }
}

