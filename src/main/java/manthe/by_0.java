/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import manthe.DU;
import manthe.cy_0;
import manthe.l0;
import manthe.n9;
import manthe.p0;
import manthe.q6;
import manthe.wM;

/*
 * Renamed from manthe.By
 */
public class by_0
implements l0 {
    private Map<wM, n9> e = new LinkedHashMap<wM, n9>();
    private Map<wM, DU> k = new LinkedHashMap<wM, DU>();
    private String f = null;
    private boolean j = true;
    private boolean o = true;
    private boolean a = true;
    private boolean c = true;
    private boolean i = true;
    private wM p;
    private double b;
    private double d;
    private wM m;
    private wM h;
    private wM n;
    private wM g;
    private static cy_0[] l;

    public by_0(wM wM2) {
        this.p = wM2;
    }

    public by_0() {
    }

    @Override
    public void a() {
        this.n();
        double d3 = this.p.d();
        double d4 = this.p.c();
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (wM object : this.b()) {
            if (!object.b()) continue;
            object.c(d3);
            object.a(d4);
            if (!arrayList.contains(d4)) {
                arrayList.add(d4);
            }
            if (!this.e.containsKey(object)) {
                d3 += object.e();
                continue;
            }
            n9 n92 = this.e.get(object);
            if (n92.a()) {
                d4 += object.f();
                d3 = this.p.d();
            } else {
                d3 += object.e();
            }
            if (!this.c(object)) continue;
            try {
                switch (n92.d()) {
                    case TOP: {
                        if (this.m != null) {
                            throw new q6("Top/north node is already defined");
                        }
                        this.m = object;
                        d3 -= object.e();
                        object.a(-2.0);
                        object.c(this.p.d());
                        break;
                    }
                    case BOTTOM: {
                        if (this.h != null) {
                            throw new q6("Bottom/south node is already defined");
                        }
                        this.h = object;
                        d3 -= object.e();
                        object.a(-1.0);
                        object.c(this.p.d());
                        break;
                    }
                    case LEFT: {
                        if (this.n != null) {
                            throw new q6("Left/west node is already defined");
                        }
                        this.n = object;
                        d3 -= object.e();
                        object.a(-3.0);
                        object.c(-2.0);
                        break;
                    }
                    case RIGHT: {
                        if (this.g != null) {
                            throw new q6("Right/east node is already defined");
                        }
                        this.g = object;
                        d3 -= object.e();
                        object.a(-4.0);
                        object.c(-1.0);
                    }
                }
            }
            catch (q6 q62) {
                q62.printStackTrace();
            }
        }
        for (Double d5 : arrayList) {
            if (this.a) {
                this.a(d5);
            }
            if (!this.c) continue;
            this.d(d5);
        }
        if (this.j) {
            this.m();
        }
        if (this.o) {
            this.l();
        }
        if (this.m != null) {
            for (wM wM2 : this.b()) {
                wM2.a(wM2.c() + this.m.f());
            }
            this.m.c(this.p.d());
            this.m.a(this.p.c());
        }
        if (this.n != null) {
            this.n.c(this.p.d());
            this.n.a(this.m != null ? this.p.c() + this.m.f() : this.p.c());
        }
        if (this.i) {
            this.f();
        }
        this.e();
        this.h();
        for (wM wM3 : this.b()) {
            this.k.put(wM3, new DU(wM3.d(), wM3.c(), wM3.e(), wM3.f()));
            if (!wM3.b()) continue;
            double d6 = this.p.d();
            double d7 = this.p.c();
            double d8 = wM3.d() + wM3.e() - d6;
            double d10 = wM3.c() + wM3.f() - d7;
            if (d8 > this.b) {
                this.b = d8;
            }
            if (!(d10 > this.d)) continue;
            this.d = d10;
        }
    }

    @Override
    public void a(wM wM2, Object ... objectArray) {
        if (objectArray == null || objectArray.length == 0) {
            if (this.f != null) {
                this.a(wM2, this.f);
                return;
            }
            this.a(wM2, "");
            return;
        }
        this.a(wM2, objectArray[0].toString());
    }

    @Override
    public void b(wM wM2) {
        this.g().remove(wM2);
    }

    @Override
    public synchronized List<wM> b() {
        return new ArrayList<wM>(this.e.keySet());
    }

    public void n() {
        this.m = null;
        this.h = null;
        this.n = null;
        this.g = null;
    }

    public void k() {
        this.n();
        this.d = 0.0;
        this.b = 0.0;
        for (wM wM2 : this.b()) {
            wM2.c(0.0);
            wM2.a(0.0);
            wM2.d(0.0);
            wM2.b(0.0);
        }
    }

    private void f() {
        HashMap<Double, Double> hashMap = new HashMap<Double, Double>();
        for (wM wM2 : this.b()) {
            if (!wM2.b() || this.d(wM2).equals((Object)p0.LEFT) || this.d(wM2).equals((Object)p0.RIGHT)) continue;
            if (!hashMap.containsKey(wM2.c())) {
                hashMap.put(wM2.c(), wM2.e());
                continue;
            }
            hashMap.put(wM2.c(), (Double)hashMap.get(wM2.c()) + wM2.e());
        }
        double d3 = 0.0;
        for (Object object : hashMap.values()) {
            if (!((Double)object > d3)) continue;
            d3 = (Double)object;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry object : hashMap.entrySet()) {
            hashMap2.put(object.getKey(), (double)Math.round(d3 / (Double)object.getValue() * 100.0) / 100.0);
        }
        for (wM wM2 : this.b()) {
            if (!wM2.b() || this.d(wM2).equals((Object)p0.LEFT) || this.d(wM2).equals((Object)p0.RIGHT)) continue;
            wM2.b(Math.ceil(wM2.e() * (Double)hashMap2.get(wM2.c())));
            wM2.c(Math.floor((wM2.d() - this.p.d()) * (Double)hashMap2.get(wM2.c()) + this.p.d()));
        }
    }

    private void m() {
        HashMap<Double, Double> hashMap = new HashMap<Double, Double>();
        double d3 = 0.0;
        for (wM object : this.b()) {
            if (!object.b() || this.c(object) || !(object.e() > d3)) continue;
            d3 = object.e();
        }
        for (Map.Entry entry : this.e.entrySet()) {
            if (!((wM)entry.getKey()).b()) continue;
            double d4 = d3;
            if (((n9)entry.getValue()).c() > 0) {
                d4 *= (double)((n9)entry.getValue()).c();
            }
            ((wM)entry.getKey()).b(d4);
            if (!hashMap.containsKey(((wM)entry.getKey()).c())) {
                ((wM)entry.getKey()).c(this.p.d());
            } else {
                ((wM)entry.getKey()).c((Double)hashMap.get(((wM)entry.getKey()).c()));
            }
            hashMap.put(((wM)entry.getKey()).c(), ((wM)entry.getKey()).d() + ((wM)entry.getKey()).e());
        }
    }

    private void l() {
        double d3 = this.p.c();
        double d4 = 0.0;
        wM wM2 = null;
        for (wM object : this.b()) {
            if (!object.b() || !(object.f() > d4)) continue;
            d4 = object.f();
        }
        for (Map.Entry entry : this.e.entrySet()) {
            if (!((wM)entry.getKey()).b()) continue;
            if (this.o) {
                ((wM)entry.getKey()).d(d4);
            }
            ((wM)entry.getKey()).a(d3);
            if (wM2 == null || ((wM)entry.getKey()).c() > wM2.c()) {
                wM2 = (wM)entry.getKey();
            }
            if (!((n9)entry.getValue()).a()) continue;
            d3 += ((wM)entry.getKey()).f();
        }
        if (this.h != null) {
            if (wM2 != null) {
                this.h.a(wM2.c() + wM2.f());
            } else {
                this.h.a(this.p.c());
            }
            this.h.c(this.p.d());
        }
    }

    private void a(double d3) {
        double d4 = 0.0;
        Map<wM, n9> map = this.b(d3);
        for (wM object : map.keySet()) {
            if (!object.b() || !(object.e() > d4)) continue;
            d4 = object.e();
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!((wM)entry.getKey()).b()) continue;
            double d5 = d4;
            if (((n9)entry.getValue()).c() > 0) {
                d5 *= (double)((n9)entry.getValue()).c();
            }
            if (!(((wM)entry.getKey()).e() < d5)) continue;
            ((wM)entry.getKey()).b(d5);
        }
        double d6 = this.p.d();
        for (wM wM2 : map.keySet()) {
            wM2.c(d6);
            d6 += wM2.e();
        }
    }

    private void d(double d3) {
        double d4 = 0.0;
        wM wM2 = null;
        Map<wM, n9> map = this.b(d3);
        for (wM wM3 : map.keySet()) {
            if (!wM3.b() || !(wM3.f() > d4)) continue;
            d4 = wM3.f();
        }
        for (wM wM3 : map.keySet()) {
            if (!wM3.b()) continue;
            if (wM3.f() < d4) {
                wM3.d(d4);
            }
            if (wM2 != null && !(wM3.c() > wM2.c())) continue;
            wM2 = wM3;
        }
        if (this.h != null) {
            if (wM2 != null) {
                this.h.a(wM2.c() + wM2.f());
            } else {
                this.h.a(this.p.c());
            }
            this.h.c(this.p.d());
        }
    }

    private void e() {
        if (this.n == null) {
            return;
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d3 = 0.0;
        for (wM wM2 : this.b()) {
            if (!wM2.b() || this.c(wM2)) continue;
            if (!arrayList.contains(wM2.c())) {
                d3 += wM2.f();
                arrayList.add(wM2.c());
            }
            wM2.c(wM2.d() + this.n.e());
        }
        this.n.d(d3);
        if (this.m != null) {
            this.m.b(this.m.e() + this.n.e());
        }
        if (this.h != null) {
            this.h.b(this.h.e() + this.n.e());
        }
    }

    private void h() {
        if (this.g == null) {
            return;
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        double d3 = 0.0;
        double d4 = 0.0;
        for (wM wM2 : this.b()) {
            if (!wM2.b() || this.c(wM2)) continue;
            double d5 = wM2.d() + wM2.e();
            if (d5 > d4) {
                d4 = d5;
            }
            if (arrayList.contains(wM2.c())) continue;
            d3 += wM2.f();
            arrayList.add(wM2.c());
        }
        this.g.c(d4);
        this.g.d(d3);
        if (this.m != null) {
            this.m.b(this.m.e() + this.g.e());
        }
        if (this.h != null) {
            this.h.b(this.h.e() + this.g.e());
        }
    }

    public n9 a(String string) {
        n9 n92 = new n9();
        if (!(string = string.toLowerCase()).contains(",")) {
            try {
                this.a(n92, string);
            }
            catch (q6 q62) {
                q62.printStackTrace();
            }
            return n92;
        }
        for (String string2 : string.split(",")) {
            while (string2.startsWith(" ")) {
                string2 = string2.substring(1);
            }
            try {
                this.a(n92, string2);
            }
            catch (q6 q63) {
                q63.printStackTrace();
            }
        }
        return n92;
    }

    public void a(n9 n92, String string) throws q6 {
        if (string.equals("")) {
            return;
        }
        switch (string) {
            case "top": 
            case "north": {
                n92.a(p0.TOP);
                break;
            }
            case "bottom": 
            case "south": {
                n92.a(p0.BOTTOM);
                break;
            }
            case "left": 
            case "west": {
                n92.a(p0.LEFT);
                break;
            }
            case "right": 
            case "east": {
                n92.a(p0.RIGHT);
                break;
            }
            case "wrap": {
                n92.a(true);
                break;
            }
            default: {
                if (!string.contains(" ")) {
                    throw new q6("Constraint descriptor not recognized: " + string);
                }
                if (string.startsWith("span ") || string.startsWith("spanX")) {
                    n92.b(Integer.parseInt(string.split(" ")[1]));
                    break;
                }
                if (string.startsWith("spanY")) {
                    n92.a(Integer.parseInt(string.split(" ")[1]));
                    break;
                }
                throw new q6("Constraint descriptor not recognized: " + string);
            }
        }
    }

    public Map<wM, n9> b(double d3) {
        LinkedHashMap<wM, n9> linkedHashMap = new LinkedHashMap<wM, n9>();
        for (wM wM2 : this.b()) {
            if (wM2.c() != d3) continue;
            linkedHashMap.put(wM2, this.e.get(wM2));
        }
        return linkedHashMap;
    }

    public Map<wM, n9> c(double d3) {
        LinkedHashMap<wM, n9> linkedHashMap = new LinkedHashMap<wM, n9>();
        for (wM wM2 : this.b()) {
            if (wM2.d() != d3) continue;
            linkedHashMap.put(wM2, this.e.get(wM2));
        }
        return linkedHashMap;
    }

    public void a(wM wM2, wM wM3, n9 n92) {
        if (this.c(wM2) || !n92.d().equals((Object)p0.NONE)) {
            return;
        }
        LinkedHashMap<wM, n9> linkedHashMap = new LinkedHashMap<wM, n9>(this.e.size());
        this.e.forEach((arg_0, arg_1) -> by_0.lambda$insertBefore$0(wM2, linkedHashMap, wM3, n92, arg_0, arg_1));
        this.e = linkedHashMap;
    }

    public boolean c(wM wM2) {
        return !this.d(wM2).equals((Object)p0.NONE);
    }

    public p0 d(wM wM2) {
        if (!this.e.containsKey(wM2)) {
            return p0.NONE;
        }
        return this.e.get(wM2).d();
    }

    public Map<wM, n9> g() {
        return this.e;
    }

    @Override
    public double d() {
        return this.b;
    }

    @Override
    public double c() {
        return this.d;
    }

    public Map<wM, DU> i() {
        return this.k;
    }

    public void a(wM wM2, String string) {
        this.a(wM2, this.a(string));
    }

    public void a(wM wM2, n9 n92) {
        this.e.put(wM2, n92);
    }

    @Override
    public void a(wM wM2) {
        this.p = wM2;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public void b(String string) {
        this.f = string;
    }

    public void e(boolean bl) {
        this.o = bl;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void c(boolean bl) {
        this.c = bl;
    }

    public void d(boolean bl) {
        this.a = bl;
    }

    private static void lambda$insertBefore$0(wM wM2, Map map, wM wM3, n9 n92, wM wM4, n9 n93) {
        if (wM4.equals(wM2)) {
            map.put(wM3, n92);
        }
        if (wM4.equals(wM3)) {
            return;
        }
        map.put(wM4, n93);
    }

    public static void b(cy_0[] cy_0Array) {
        l = cy_0Array;
    }

    public static cy_0[] j() {
        return l;
    }

    static {
        if (by_0.j() == null) {
            by_0.b(new cy_0[2]);
        }
    }
}

