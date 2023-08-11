/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.awt.Color;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.AV;
import manthe.Ce;
import manthe.Cl;
import manthe.D3;
import manthe.bj_0;
import manthe.d0_0;
import manthe.ds_2;
import manthe.kw;
import manthe.my_0;
import manthe.ng;
import manthe.on;
import manthe.pd;
import manthe.q7;
import manthe.qX;
import manthe.qp;
import manthe.qu_0;
import manthe.r1;
import manthe.rQ;
import manthe.rf_0;
import manthe.rg_0;
import manthe.rl_0;
import manthe.sH;
import manthe.sM;
import manthe.vv_0;

/*
 * Renamed from manthe.rm
 */
public class rm_0
extends r1 {
    private final rf_0 af;
    private final rf_0 al;
    private final rf_0 ag;
    private final rf_0 ak;
    private final List<AV> aj = new ArrayList<AV>();
    private final AtomicInteger ae = new AtomicInteger(0);
    private final AtomicInteger ai = new AtomicInteger(0);
    private static int[] ah;

    public rm_0() {
        super("Public Profiles", false);
        this.aj().a(new D3(0.0, 5.0, 5000, 1, new pd(0, 5, 0, 5)));
        this.aj().b(210.0);
        ((D3)this.aj().u()).g();
        this.c(400.0);
        this.b(20.0);
        double d3 = this.q() * 0.3 + 5.0;
        rf_0 rf_02 = new rf_0(false);
        rf_02.c(this.q());
        rf_02.b(20.0);
        rf_02.a(new D3(2.0, 0.0, 5000, 3, new pd(2, 0, 0, 0)));
        rl_0 rl_02 = new rl_0("Public Profiles", my_0.c, 1.5);
        rl_02.c(128.0);
        rl_02.b(20.0);
        rl_02.j(false);
        rf_02.b(rl_02);
        rQ rQ2 = new rQ("magnify", 0.35f, 6.0f, 0.0f, true);
        sH sH2 = new sH(this, 32, rQ2);
        sH2.a("Profile Name/UUID");
        sH2.c(232.0);
        sH2.b(12.0);
        sH2.j(false);
        rf_02.b(sH2);
        ((rg_0)rQ2).c(25.0);
        ((rg_0)rQ2).b(12.0);
        rQ2.z().j(false);
        rQ2.a(new vv_0(this, sH2));
        rf_02.b(rQ2);
        this.aj().b(rf_02);
        this.af = new rf_0(false);
        this.af.c(this.q());
        this.af.j(false);
        this.af.a(new D3(0.0, 5.0, 5000, 1, new pd(5, 0, 0, 0)));
        this.aj().b(this.af);
        this.al = new rf_0(false);
        this.al.c(this.q());
        this.al.j(false);
        this.al.a(false);
        this.al.a(new D3(0.0, 5.0, 5000, 1, new pd(5, 0, 0, 0)));
        this.aj().b(this.al);
        this.ak = new rf_0(false);
        this.ak.a(true);
        this.ag = new rf_0(false);
        this.ag.a(false);
        rf_0 rf_03 = new rf_0(false);
        rf_03.a(new D3(0.0, 0.0, 5000, 1, new pd(0, (int)this.q() / 3, 0, 0)));
        rf_03.c(this.q());
        rf_03.b(20.0);
        rf_03.b(this.ak);
        rf_03.b(this.ag);
        this.aj().b(rf_03);
    }

    public void al() {
        this.a(this.aj, this.af, this.ak);
        this.a(this.aj, this.al, this.ag);
    }

    private void a(List<AV> list, rf_0 rf_02, rf_0 rf_03) {
        rg_0 rg_02;
        rf_02.c(this.q());
        rf_02.b(185.0);
        rf_02.a(new D3(0.0, 5.0, 5000, 1, new pd(5, 0, 0, 0)));
        rf_03.a(new D3(0.0, 0.0, 5000, 7, new pd(0, 0, 0, 0)));
        rf_03.c(this.q() / 3.0);
        rf_03.b(20.0);
        rf_02.v().clear();
        rf_02.c();
        rf_03.v().clear();
        rf_03.c();
        double d3 = this.q() * 0.3;
        if (list == null || list.isEmpty()) {
            return;
        }
        qp qp2 = null;
        for (AV object2 : list) {
            if (qp2 == null || qp2.v().size() >= 9) {
                qp2 = new rf_0(false);
                qp2.c(rf_02.q());
                qp2.b(160.0);
                qp2.a(new D3(5.0, 5.0, 5000, 3, new pd(0, 0, 0, 0)));
                ((D3)qp2.u()).g();
                qp2.a(false);
                rf_02.b(qp2);
            }
            sM i = new sM(object2, d3);
            qp2.b(i);
            qp2.c();
            qp2.u().b();
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList<rg_0> arrayList = new ArrayList<rg_0>();
        for (int atomicInteger2 = 0; atomicInteger2 < rf_02.v().size(); ++atomicInteger2) {
            rg_02 = new rg_0(atomicInteger2 + 1 + "", false);
            arrayList.add(rg_02);
            int rg_03 = atomicInteger2;
            rg_02.a(new qu_0(this, arrayList, rg_02, rf_02, atomicInteger, rg_03));
            rg_02.c(20.0);
            rg_02.b(20.0);
            rf_03.b(rg_02);
            if (atomicInteger2 < 5) continue;
            rg_02.a(false);
        }
        AtomicInteger atomicInteger2 = rf_03 == this.al ? this.ai : this.ae;
        atomicInteger2.set(0);
        if (arrayList.size() >= 5) {
            rg_02 = new rg_0("<", false);
            rg_02.c(20.0);
            rg_02.b(20.0);
            rg_02.a(rf_03);
            rg_02.a(new qX(this, rg_02, arrayList));
            rg_02.a(new Ce(this, arrayList, atomicInteger2));
            rf_03.v().add(0, rg_02);
            rg_0 rg_03 = new rg_0(">", false);
            rg_03.c(20.0);
            rg_03.b(20.0);
            rg_03.a(new Cl(this, rg_03, atomicInteger2, arrayList));
            rg_03.a(new bj_0(this, atomicInteger2, arrayList));
            rf_03.b(rg_03);
            rf_03.a(new kw(this, arrayList, rg_02, rg_03));
        }
        if (!arrayList.isEmpty()) {
            ((rg_0)arrayList.get(0)).a().a(0, 0, 0);
        }
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        d0_0 d0_02 = ds_2.p();
        this.a((double)(d0_02.g() / 2) - this.q() / 2.0 - ng.p.q() / 2.0);
        this.d((double)(d0_02.h() / 2) - this.b() / 2.0);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        super.c(false);
    }

    public void an() {
        String string = on.p.J();
        try {
            if (string.length() == 0) {
                this.aj.clear();
                this.af.v().clear();
                rl_0 rl_02 = new rl_0("Failed to load profiles", my_0.c, 1.0);
                rl_02.b(Color.RED);
                this.af.b(rl_02);
                return;
            }
            this.aj.clear();
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
            if (jsonObject.has("profiles")) {
                JsonObject jsonObject2 = jsonObject.get("profiles").getAsJsonObject();
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    if (!((JsonElement)entry.getValue()).isJsonObject()) continue;
                    JsonObject jsonObject3 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    AV aV = new AV("", "");
                    aV.a(jsonObject3);
                    aV.a(UUID.fromString((String)entry.getKey()));
                    this.aj.add(aV);
                }
                this.aj.sort(new q7(this));
                this.a(this.aj, this.af, this.ak);
            }
        }
        catch (Exception exception) {
            on.a(exception);
            System.out.println(string);
        }
    }

    public List<AV> ao() {
        return this.aj;
    }

    public void a(UUID uUID) {
        Iterator<AV> iterator = this.aj.iterator();
        while (iterator.hasNext()) {
            AV aV = iterator.next();
            if (!aV.l().toString().equalsIgnoreCase(uUID.toString())) continue;
            iterator.remove();
        }
    }

    static List d(rm_0 rm_02) {
        return rm_02.aj;
    }

    static rf_0 e(rm_0 rm_02) {
        return rm_02.af;
    }

    static rf_0 b(rm_0 rm_02) {
        return rm_02.ak;
    }

    static rf_0 c(rm_0 rm_02) {
        return rm_02.al;
    }

    static rf_0 a(rm_0 rm_02) {
        return rm_02.ag;
    }

    static void a(rm_0 rm_02, List list, rf_0 rf_02, rf_0 rf_03) {
        rm_02.a(list, rf_02, rf_03);
    }

    public static void b(int[] nArray) {
        ah = nArray;
    }

    public static int[] am() {
        return ah;
    }

    static {
        if (rm_0.am() != null) {
            rm_0.b(new int[2]);
        }
    }
}

