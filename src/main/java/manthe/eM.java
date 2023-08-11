/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.V;
import manthe.cy_0;
import manthe.eA;
import manthe.ed_0;
import manthe.hy_0;

public class eM
extends cy_0 {
    public eM(Object object) {
        super(object);
    }

    public List<ed_0> g() {
        List list = eM.a.M().bm.c(this.b);
        ArrayList<ed_0> arrayList = new ArrayList<ed_0>();
        for (Object e10 : list) {
            arrayList.add(new ed_0(e10));
        }
        return arrayList;
    }

    public List<eA>[][] f() {
        if (V.c() > 13) {
            List[][] listArray = hy_0.a(eM.a.M().bm, this.b);
            ArrayList[][] arrayListArrayArray = new ArrayList[4][];
            int n6 = 0;
            for (List[] listArray2 : listArray) {
                ArrayList[] arrayListArray = new ArrayList[listArray2.length];
                for (int i = 0; i < listArray2.length; ++i) {
                    List list = listArray2[i];
                    ArrayList<eA> arrayList = new ArrayList<eA>();
                    for (Object e10 : list) {
                        arrayList.add(new eA(e10));
                    }
                    arrayListArray[i] = arrayList;
                }
                arrayListArrayArray[n6] = arrayListArray;
                ++n6;
            }
            return arrayListArrayArray;
        }
        ArrayList[][] arrayListArrayArray = new ArrayList[1][];
        List[] listArray = hy_0.b(eM.a.M().bm, this.b);
        int n10 = 0;
        ArrayList[] arrayListArray = new ArrayList[4];
        for (int i = 0; i < listArray.length; ++i) {
            List list = listArray[i];
            ArrayList<eA> arrayList = new ArrayList<eA>();
            for (Object e11 : list) {
                arrayList.add(new eA(e11));
            }
            arrayListArray[i] = arrayList;
        }
        arrayListArrayArray[n10] = arrayListArray;
        return arrayListArrayArray;
    }
}

