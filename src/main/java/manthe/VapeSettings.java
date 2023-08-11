/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javassist.bytecode.CodeAttribute;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import rip.vape.module.Module;
import rip.vape.value.BasicValue;
import rip.vape.value.ColorValue;

/*
 * Renamed from manthe.cB
 */
public class VapeSettings {
    private static final HashMap<Character, Color> L = new HashMap<>();
    public static boolean h;
    public static boolean C;
    public static String v;
    public final rg_0 syncSettingsState = new rg_0("Sync Settings", false);
    public final BooleanValue teamsByServer = BooleanValue.createValue(this, "Teams by server", false, "Ignore players on your team designated by the server\n§cThis is not guaranteed to be accurate, as server teams are assigned by the server");
    public final BooleanValue teamsByColor = BooleanValue.createValue(this, "Teams by color", false, "Ignore players with the selected name color");
    public final BooleanValue recolorVisuals = BooleanValue.createValue(this, "Recolor visuals", false, "Changes colors of visuals(Tracers, ESP) to their according team color");
    private final HashMap<pb_0, Character> j = new HashMap<>();
    private final pb_0 p;
    private final pb_0 l;
    private final pb_0 I;
    private final pb_0 o;
    private final pb_0 G;
    private final pb_0 c;
    private final pb_0 F;
    private final pb_0 D;
    private final pb_0 m;
    private final pb_0 b;
    private final pb_0 B;
    private final pb_0 M;
    private final pb_0 g;
    private final pb_0 H;
    private final pb_0 w;
    private final pb_0 q;
    public final BooleanValue O = BooleanValue.createValue(this, "Auto-Detect color", true, "Automatically detects your team color\n§cThis is not guaranteed to be accurate, this relies on the server giving you the same name color as your teammates");
    private final List<BasicValue> J;
    public ColorValue r = ColorValue.createValue(this, "Gui Color", new Color(5, 134, 105));
    public BooleanValue y = BooleanValue.createValue(this, "MiddleClick friends", true, "Click middle mouse button to add the player you are hovering over as a friend");
    public BooleanValue x = BooleanValue.createValue(this, "Blatant mode", false, "Required for certain features.\nThis may make your client detectable(via screenshare) until you restart Minecraft.\nThis cannot be disabled once enabled.");
    public y0 E;
    public BooleanValue f = BooleanValue.createValue(this, "Show NBT Tags", false, "Shows NBT tags set by the server.\nUseful for servers with custom items.");
    public BooleanValue n = BooleanValue.createValue(this, "Enable on load", false, "Enable blatant mode upon injecting vape");
    public BooleanValue N = BooleanValue.createValue(this, "Speed Check", false, "Disables any active movement modules\nwhen enabling another.");
    public BooleanValue z = BooleanValue.createValue(this, "Lobby Check", false, "Temporarily disables certain features in server lobbies.");
    public BooleanValue a = BooleanValue.createValue(this, "Sanity Check", false, "Disables all modules when you connect/disconnect from a server.");
    public BooleanValue k = BooleanValue.createValue(this, "Health prediction", false, "Estimates player health on pvp servers\nBy default attacks and health pots will be estimated\nNOTE: This feature may not always be accurate!");
    public BooleanValue i = BooleanValue.createValue(this, "Estimate Food", true, "Automatically estimates food + healing from food.");
    public BooleanValue A = BooleanValue.createValue(this, "Estimate Fall", true, "Automatically estimates damage from falling.");
    public DX d;
    private static int e;

    public VapeSettings() {
        this.p = new pb_0("§aGreen", 0.8);
        this.j.put(this.p, Character.valueOf('a'));
        this.l = new pb_0("§2Dark Green", 0.8);
        this.j.put(this.l, Character.valueOf('2'));
        this.I = new pb_0("§cRed", 0.8);
        this.j.put(this.I, Character.valueOf('c'));
        this.o = new pb_0("§4Dark Red", 0.8);
        this.j.put(this.o, Character.valueOf('4'));
        this.G = new pb_0("§eYellow", 0.8);
        this.j.put(this.G, Character.valueOf('e'));
        this.c = new pb_0("§6Gold", 0.8);
        this.j.put(this.c, Character.valueOf('6'));
        this.F = new pb_0("§9Blue", 0.8);
        this.j.put(this.F, Character.valueOf('9'));
        this.D = new pb_0("§1Dark Blue", 0.8);
        this.j.put(this.D, Character.valueOf('1'));
        this.m = new pb_0("§bAqua", 0.8);
        this.j.put(this.m, Character.valueOf('b'));
        this.b = new pb_0("§3Dark Aqua", 0.8);
        this.j.put(this.b, Character.valueOf('3'));
        this.B = new pb_0("§dPurple", 0.8);
        this.j.put(this.B, Character.valueOf('d'));
        this.M = new pb_0("§5Dark Purple", 0.8);
        this.j.put(this.M, Character.valueOf('5'));
        this.g = new pb_0("§7Gray", 0.8);
        this.j.put(this.g, Character.valueOf('7'));
        this.H = new pb_0("§8Dark Gray", 0.8);
        this.j.put(this.H, '8');
        this.w = new pb_0("§fWhite", 0.8);
        this.j.put(this.w, 'f');
        this.q = new pb_0("§0Black", 0.8);
        this.j.put(this.q, Character.valueOf('0'));
        this.d = DX.a(this, "Your team color", "Uses this color to determine your team", this.p, 2, this.o, this.I, this.c, this.G, this.l, this.p, this.m, this.b, this.D, this.F, this.B, this.M, this.w, this.g, this.H, this.q);
        this.teamsByColor.a(this.recolorVisuals, this.O, this.d);
        this.r.e(true);
        this.J = new ArrayList<BasicValue>(Arrays.asList(this.r, this.teamsByServer, this.teamsByColor, this.recolorVisuals, this.O, this.d, this.y, this.z, this.a, this.f, this.x, this.n, this.N, this.k, this.i, this.A));
        this.k.a(this.i, this.A);
        if (on.C()) {
            this.x.getDefaultValue().a().a(new oj(this));
            this.x.getDefaultValue().a().a(new uz(this));
        } else {
            this.x.getDefaultValue().a().b(true);
            this.x.getDefaultValue().b(true);
            this.x.getDefaultValue().b("Blatant mode not yet available for this Minecraft version");
        }
        this.n.getDefaultValue().a().a(new B0(this));
        this.N.getDefaultValue().a().a(new B3(this));
        this.x.setTypeByString(String.valueOf(false));
        this.x.a(this.n);
        this.x.a(this.N);
    }

    public static boolean f() {
        int n6 = ds_2.s().m().i();
        int n10 = 100 + n6;
        if (n10 == 0) {
            return u5.e();
        }
        return u5.f();
    }

    public static boolean d() {
        int n6 = ds_2.s().s().i();
        int n10 = 100 + n6;
        if (n10 == 1) {
            return u5.f();
        }
        return u5.e();
    }

    public static boolean a(ei_0 ei_02) {
        int n6 = ei_02.i();
        return n6 > 0 ? Keyboard.isKeyDown(n6) : Mouse.isButtonDown(100 + n6);
    }

    public static double c(fG fG2) {
        double d3 = 0.0;
        d5_0 d5_02 = fG2.f();
        if (d5_02.f() > 0) {
            e6 e62 = new e6(d5_02.g().toArray()[0]);
            d3 = e62.g();
        }
        d3 += eq_0.a(fG2, ey_0.f());
        return d3 += (float)eq_0.a(e5.g().l(), fG2) * 0.01f;
    }

    public static double a(fG fG2) {
        double d3 = 0.0;
        d5_0 d5_02 = fG2.f();
        if (d5_02.f() > 0) {
            e6 e62 = new e6(d5_02.g().toArray()[0]);
            d3 = e62.g();
        }
        return d3 += eq_0.a(fG2, ey_0.f());
    }

    public static double b(fG fG2) {
        double d3 = 0.0;
        d5_0 d5_02 = fG2.f();
        if (d5_02.f() > 0) {
            e6 e62 = new e6(d5_02.g().toArray()[0]);
            d3 = e62.g();
        }
        return d3 += eq_0.a(fG2, ey_0.f());
    }

    public static boolean a(int n6) {
        if (n6 < 0) {
            return Mouse.isButtonDown(100 + n6);
        }
        return Keyboard.isKeyDown(n6);
    }

    private static Color a(char c2) {
        if (L.containsKey(Character.valueOf(c2))) {
            return L.get(Character.valueOf(c2));
        }
        double[] dArray = new double[4];
        if (c2 == '4') {
            dArray[0] = 1.0;
            dArray[1] = 0.0;
            dArray[2] = 0.0;
        }
        if (c2 == 'c') {
            dArray[0] = 1.0;
            dArray[1] = 0.33;
            dArray[2] = 0.33;
        }
        if (c2 == '6') {
            dArray[0] = 1.0;
            dArray[1] = 0.66;
            dArray[2] = 0.0;
        }
        if (c2 == 'e') {
            dArray[0] = 1.0;
            dArray[1] = 1.0;
            dArray[2] = 0.33;
        }
        if (c2 == '2') {
            dArray[0] = 0.0;
            dArray[1] = 0.66;
            dArray[2] = 0.0;
        }
        if (c2 == 'a') {
            dArray[0] = 0.33;
            dArray[1] = 1.0;
            dArray[2] = 0.33;
        }
        if (c2 == 'b') {
            dArray[0] = 0.33;
            dArray[1] = 1.0;
            dArray[2] = 1.0;
        }
        if (c2 == '3') {
            dArray[0] = 0.0;
            dArray[1] = 0.66;
            dArray[2] = 0.66;
        }
        if (c2 == '1') {
            dArray[0] = 0.0;
            dArray[1] = 0.0;
            dArray[2] = 0.66;
        }
        if (c2 == '9') {
            dArray[0] = 0.33;
            dArray[1] = 0.33;
            dArray[2] = 1.0;
        }
        if (c2 == 'd') {
            dArray[0] = 1.0;
            dArray[1] = 0.33;
            dArray[2] = 1.0;
        }
        if (c2 == '5') {
            dArray[0] = 0.66;
            dArray[1] = 0.0;
            dArray[2] = 0.66;
        }
        if (c2 == 'f') {
            dArray[0] = 1.0;
            dArray[1] = 1.0;
            dArray[2] = 1.0;
        }
        if (c2 == '7') {
            dArray[0] = 0.66;
            dArray[1] = 0.66;
            dArray[2] = 0.66;
        }
        if (c2 == '8') {
            dArray[0] = 0.33;
            dArray[1] = 0.33;
            dArray[2] = 0.33;
        }
        if (c2 == '0') {
            dArray[0] = 0.0;
            dArray[1] = 0.0;
            dArray[2] = 0.0;
        }
        Color color = new Color((int)(dArray[0] * 255.0), (int)(dArray[1] * 255.0), (int)(dArray[2] * 255.0));
        L.put(Character.valueOf(c2), color);
        return color;
    }

    public p1[] e() {
        p1[] p1Array = new p1[this.J.size()];
        for (int i = 0; i < p1Array.length; ++i) {
            p1Array[i] = this.J.get(i).getDefaultValue();
        }
        return p1Array;
    }

    public void g() {
        if (this.teamsByColor.u().booleanValue() && this.O.u().booleanValue()) {
            eJ eJ2 = ds_2.k();
            if (eJ2.e()) {
                return;
            }
            String string = xp_0.a(eJ2);
            if (string.startsWith(v) && string.length() > 3) {
                int n6 = string.charAt(1) == 'r' ? 3 : 1;
                char c2 = string.charAt(n6);
                for (pb_0 pb_02 : this.j.keySet()) {
                    char c3 = this.j.get(pb_02).charValue();
                    if (c2 != c3) continue;
                    this.d.b(true);
                    this.d.setType(pb_02);
                    this.d.b(false);
                }
            }
        }
    }

    public boolean a(ex_0 ex_02) {
        if (!ex_02.a(A5.L)) {
            return false;
        }
        e2 e22 = new e2(ex_02);
        if (this.teamsByColor.u().booleanValue()) {
            String string = xp_0.a(e22);
            char c2 = this.j.get(this.d.v()).charValue();
            if (string.startsWith(v) && string.length() > 3) {
                int n6;
                int n10 = n6 = string.charAt(1) == 'r' ? 3 : 1;
                if (c2 == string.charAt(n6)) {
                    return true;
                }
            }
        }
        if (this.teamsByServer.u().booleanValue()) {
            if (e22.a9().e() || ds_2.k().a9().e()) {
                return false;
            }
            return ds_2.k().a9().a(e22.a9());
        }
        return false;
    }

    public boolean b(ex_0 ex_02) {
        if (V.c() == 13) {
            return false;
        }
        if (this.E.N()) {
            if (ds_2.k().e()) {
                return false;
            }
            return this.E.a(ex_02);
        }
        return false;
    }

    public boolean a(ex_0 ex_02, boolean bl) {
        eJ eJ2 = ds_2.k();
        if (ex_02.e()) {
            return false;
        }
        if (ex_02.a(A5.dj)) {
            return false;
        }
        if (ex_02.equals(eJ2)) {
            return false;
        }
        if (!ex_02.a(A5.cF)) {
            return false;
        }
        if (V.c() > 13 && ex_02.a(A5.a8)) {
            return false;
        }
        ej_0 ej_02 = new ej_0(ex_02.a());
        if (ej_02.aD() <= 0.0f) {
            return false;
        }
        if (bl && pf_0.b(ej_02)) {
            return false;
        }
        if (on.p.N().a(ej_02)) {
            return false;
        }
        if (this.a(ej_02)) {
            return false;
        }
        return !this.b(ej_02);
    }

    public boolean c() {
        return this.z.u() && !ds_2.k().a8().m();
    }

    public void a(Module y52) {
        if (this.N.u().booleanValue()) {
            zG zG2 = on.p.H().b(zG.class);
            zM zM2 = on.p.H().b(zM.class);
            zz_0 zz_02 = on.p.H().b(zz_0.class);
            zQ zQ2 = on.p.H().b(zQ.class);
            List<Module> list = Arrays.asList(zG2, zM2, zz_02, zQ2);
            for (Module y53 : list) {
                if (y53 == null || y53.equals(y52) || !y53.N()) continue;
                y53.z();
            }
        }
    }

    public L a(eC eC2, boolean bl) {
        if (!(bl || this.teamsByColor.u().booleanValue() && this.recolorVisuals.u().booleanValue())) {
            return null;
        }
        String string = xp_0.a(eC2);
        if (string.startsWith(v) && string.length() > 3) {
            int n6 = string.charAt(1) == 'r' ? 3 : 1;
            char c2 = string.charAt(n6);
            return new L(VapeSettings.a(c2));
        }
        return null;
    }

    public L b(eC eC2) {
        return this.a(eC2, false);
    }

    public L a(eC eC2) {
        if (on.p.N().c(eC2.S()) && on.p.N().recolorVisuals.u().booleanValue()) {
            return on.p.N().friendsColor.K();
        }
        if (on.p.b().a(eC2.S()) && on.p.b().c.u().booleanValue()) {
            return on.p.b().e.K();
        }
        return this.b(eC2);
    }

    static {
        VapeSettings.b(0);
        h = V.c() > 13;
        C = false;
        v = String.valueOf('§');
    }

    public static void b(int n6) {
        e = n6;
    }

    public static int b() {
        return e;
    }

    public static int a() {
        int n6 = VapeSettings.b();
        if (n6 == 0) {
            return 29;
        }
        return 0;
    }

    private static CodeAttribute.RuntimeCopyException getRuntimeCopyException(CodeAttribute.RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

