/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import rip.vape.module.Module;
import rip.vape.value.BasicValue;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Renamed from manthe.yp
 */
public class yp_0
extends Module {
    private final DF v = DF.a((Object)this, "Delay", "#", "ms", 1.0, 100.0, 1000.0, 10.0);
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Spoof Ping", false, "Makes it so only your ping is spoofed");
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Advanced Spoof", false, "Delays extra packets used to calculate ping.\nSome servers may require this to Spoof ping.");
    private final List<Object> u = new CopyOnWriteArrayList<Object>();
    private final Queue<uI> y = new ConcurrentLinkedQueue<uI>();

    public yp_0() {
        super("BeanerNet", 8919359, CQ.f, "Delays packets sent, simulates lag and causes high ping");
        this.x.a(new BasicValue[]{this.w});
        this.a(this.v, this.x, this.w);
    }

    @Override
    public void s() {
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(ky_0 ky_02) {
        Object object;
        if (ds_2.n()) {
            return;
        }
        if (ds_2.k().a() == null || ds_2.k().j()) {
            return;
        }
        Object object2 = ky_02.getPacket().a();
        if (this.u.contains(object2)) {
            this.u.remove(object2);
            return;
        }
        while (this.y.peek() != null && (object = this.y.peek()) != null && ((uI)object).a(this.v.a().longValue())) {
            object = this.y.poll();
            this.u.add(((uI)object).a());
            ds_2.k().bp().a(new fn_0(((uI)object).a()));
        }
        if (!(!this.x.u().booleanValue() || A5.W.isInstance(object2) || this.w.u().booleanValue() && A5.j.isInstance(object2))) {
            return;
        }
        if (A5.j.isInstance(object2) && ((fA)(object = new fA(object2))).g() >= 0) {
            return;
        }
        this.y.add(new uI(object2, null));
        ky_02.a(true);
    }
}

