/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import manthe.A5;
import manthe.U;
import manthe.V;
import manthe.cy_0;
import manthe.fG;
import manthe.fk_0;
import manthe.g9;
import manthe.ga;
import manthe.gz_0;
import manthe.wE;
import manthe.wM;
import manthe.wt_0;
import manthe.wx_0;

public class wA
extends wx_0 {
    private final List<fG> W = Arrays.asList(new U(276).a(), new U(278).a(), new U(279).a(), new U(261).a(), new U(364).a(), new U(368).a(), new U(332).a(), new U(344).a(), new U(346).a(), new U(322).a(), new U(322).a(1).a(), new U(326).a(), new U(327).a(), new U(373).a(16421).a(), new U(373).a(16449).a(), new U(373).a(8258).a(), new U(373).a(8259).a(), new U(373).a(16388).a(), new U(282).a(), new U(1).a());
    private List<fG> X = new ArrayList<fG>();
    private wE V;

    public wA(wE wE2) {
        this.V = wE2;
        this.P = false;
        this.W().e(false);
        this.W().c(false);
        this.W().b(false);
        this.a(false);
        this.ak();
        this.m();
    }

    private void ak() {
        for (Object e10 : fk_0.j().f()) {
            cy_0 cy_02;
            Object object;
            if (manthe.V.c() == 13) {
                object = fk_0.j().a(e10);
            } else {
                cy_02 = new gz_0(e10);
                object = fk_0.j().a(cy_02.a());
            }
            if (!A5.cg.isInstance(object)) continue;
            cy_02 = new fk_0(object);
            List list = new ArrayList();
            if (manthe.V.c() >= 23) {
                list = (List)g9.f().a();
            }
            ((fk_0)cy_02).a((fk_0)cy_02, list);
            for (Object e11 : list) {
                fG fG2 = new fG(e11);
                if (fG2.k().h() == 62) continue;
                this.X.add(fG2);
            }
        }
    }

    public void m() {
        this.J();
        List<fG> list = this.V.n() != null && this.V.n().length() > 0 ? this.n() : this.W;
        for (int i = 0; i < list.size(); ++i) {
            int n6 = i;
            this.a((wM)new wt_0(wA.b.m, wA.b.y, list.get(i)).c(new ga(this, list, n6)), i > 0 && (i + 1) % 9 == 0 ? "wrap" : "");
        }
    }

    public List<fG> n() {
        ArrayList<fG> arrayList = new ArrayList<fG>();
        for (fG fG2 : this.X) {
            if (!fG2.j().toLowerCase(Locale.ROOT).contains(this.V.n().toLowerCase(Locale.ROOT))) continue;
            arrayList.add(fG2);
        }
        return arrayList;
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "hotbarbrowser";
    }

    static wE a(wA wA2) {
        return wA2.V;
    }
}

