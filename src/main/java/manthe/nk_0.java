/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manthe.Bb;
import manthe.n5;
import manthe.to_0;

/*
 * Renamed from manthe.nk
 */
class nk_0 {
    n5 b;
    HashMap<Integer, HashMap<to_0, Integer>> a = new HashMap();

    public nk_0(n5 n52) {
        this.b = n52;
    }

    private void a(int n6, int n10, int n11) {
        this.a.computeIfAbsent(n6, this::lambda$addBlockToLayer$0);
        HashMap<to_0, Integer> hashMap = this.a.get(n6);
        to_0 to_02 = new to_0(n10, n11, null);
        hashMap.computeIfAbsent(to_02, arg_0 -> nk_0.lambda$addBlockToLayer$1(hashMap, arg_0));
        hashMap.merge(to_02, 1, Integer::sum);
    }

    public List<to_0> a(int n6) {
        ArrayList<to_0> arrayList = new ArrayList<to_0>();
        if (!this.a.containsKey(n6)) {
            return arrayList;
        }
        Object[] objectArray = this.a.get(n6).entrySet().toArray();
        Arrays.sort(objectArray, new Bb(this));
        for (Object object : objectArray) {
            arrayList.add((to_0)((Map.Entry)object).getKey());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public int a(int n6, to_0 to_02) {
        return this.a.get(n6).get(to_02);
    }

    public int b() {
        int n6 = 0;
        for (int n10 : this.a.keySet()) {
            n6 += this.a.get(n10).size();
        }
        return n6;
    }

    public int b(int n6) {
        HashMap<to_0, Integer> hashMap = this.a.get(n6);
        int n10 = 0;
        for (to_0 to_02 : hashMap.keySet()) {
            n10 += hashMap.get(to_02).intValue();
        }
        return n10;
    }

    public n5 a() {
        return this.b;
    }

    public String toString() {
        return "BedData{position=" + this.b + ", layers=" + this.a + '}';
    }

    public void c() {
        this.a.clear();
    }

    private static Integer lambda$addBlockToLayer$1(HashMap hashMap, to_0 to_02) {
        return hashMap.put(to_02, 0);
    }

    private HashMap lambda$addBlockToLayer$0(Integer n6) {
        return this.a.put(n6, new HashMap());
    }

    static void a(nk_0 nk_02, int n6, int n10, int n11) {
        nk_02.a(n6, n10, n11);
    }
}

