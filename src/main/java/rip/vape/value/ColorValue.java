/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package rip.vape.value;

import com.google.gson.JsonObject;
import manthe.*;

import java.awt.Color;
import java.util.Random;

public class ColorValue extends BasicValue<Double, sW> {
    public static final int r = 96;
    private final DF n;
    private final DF q;
    private final DF o;
    private final BooleanValue p;
    private final Random l = new Random();
    private Color m;
    private boolean s = false;

    public ColorValue(Object object, String string, sW sW2) {
        super(object, string, sW2);
        ((sW)this.getDefaultValue()).b("Double click for rainbow\nShift click to switch between hue, brightness, and saturation");
        this.n = DF.a(object, string + " hue", string + " hue", sW2.E(), sW2.D(), 255.0, sW2.C());
        this.q = DF.a(object, string + " brightness", string + " brightness", sW2.E(), sW2.D(), 87.0, sW2.C());
        this.o = DF.a(object, string + " saturation", string + " saturation", sW2.E(), sW2.D(), 255.0, sW2.C());
        this.p = BooleanValue.createValue(object, string + " rainbow", string + " rainbow", false);
    }

    public static ColorValue createValue(Object object, String string, double d3) {
        sW sW2 = new sW(96.0, 0.0, "", "", string);
        sW2.c(92.0);
        sW2.b(7.0);
        ColorValue dE = new ColorValue(object, string, sW2);
        dE.setType(d3);
        sW2.a(dE);
        sW2.f(d3);
        double d4 = sW2.B() / 96.0;
        dE.u().setType(d4 * 100.0);
        return dE;
    }

    public static ColorValue createValue(Object object, String string, Color color) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f10 = fArray[0];
        float f11 = fArray[1];
        float f12 = fArray[2];
        ColorValue dE = ColorValue.createValue(object, string, f10 * 96.0f);
        dE.I().b((double)f11 * 96.0);
        dE.z().b((double)f12 * 96.0);
        dE.I().setType((double)(f11 * 96.0f) * 100.0);
        dE.z().setType((double)(f12 * 96.0f) * 100.0);
        dE.m = color;
        return dE;
    }

    @Override
    public void q() {
        super.q();
        if (this.m != null) {
            float[] fArray = Color.RGBtoHSB(this.m.getRed(), this.m.getGreen(), this.m.getBlue(), null);
            float f10 = fArray[0];
            float f11 = fArray[1];
            float f12 = fArray[2];
            this.u().b((double)f10 * 96.0);
            this.I().b((double)f11 * 96.0);
            this.z().b((double)f12 * 96.0);
            this.s = false;
        }
    }

    public Double x() {
        return ((sW)this.getDefaultValue()).B();
    }


    @Override
    public void b(Double colorHax) {
        Color color = new Color(colorHax.intValue());
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        ((sW)this.getDefaultValue()).f(fArray[0] * 96.0f);
        this.o.b((double)fArray[1] * 96.0);
        this.q.b((double)fArray[2] * 96.0);
        return 0;
    }

    @Override
    public void b(boolean bl) {
        if (!((sW)this.getDefaultValue()).p().equals(this)) {
            ((sW)this.getDefaultValue()).p().b(bl);
        }
        super.b(bl);
        this.n.b(bl);
        this.q.b(bl);
        this.o.b(bl);
    }

    @Override
    public void setType(Double d3) {
        if (this.b() == null) {
            this.setType(d3);
        }
        ((sW)this.getDefaultValue()).f(d3);
        this.d();
    }

    public void t() {
        this.setType(Y.a(this.l, ((sW)this.getDefaultValue()).D(), ((sW)this.getDefaultValue()).C()));
    }

    @Override
    public void setTypeByString(String string) {
        this.setType(Double.parseDouble(string));
    }

    public L K() {
        return ((sW)this.getDefaultValue()).X();
    }

    public int s() {
        return Color.HSBtoRGB(this.w(), this.v(), this.r());
    }

    public boolean J() {
        return this.p.u();
    }

    public void d(boolean bl) {
        this.p.setType((Boolean)bl);
    }

    public void y() {
        this.setType(this.x() + zu_0.T.X.a());
        if (this.x() >= ((sW)this.getDefaultValue()).C()) {
            this.setType(((sW)this.getDefaultValue()).D());
        }
    }

    public void L() {
        if (this.s && this.J()) {
            double d3 = this.n.a();
            this.b((double) yI.a(this.w(), this.r(), this.v()).getRGB());
            this.n.b(d3);
        }
    }

    public float w() {
        return this.n.a().floatValue() / (float)((sV)this.n.getDefaultValue()).C();
    }

    public float v() {
        return this.o.a().floatValue() / (float)((sV)this.o.getDefaultValue()).C();
    }

    public float r() {
        return this.q.a().floatValue() / (float)((sV)this.q.getDefaultValue()).C();
    }

    public DF u() {
        return this.n;
    }

    public DF z() {
        return this.q;
    }

    public DF I() {
        return this.o;
    }

    @Override
    public JsonObject getJson() {
        JsonObject jsonObject = super.getJson();
        jsonObject.addProperty("hue", (Number)this.n.a());
        jsonObject.addProperty("saturation", (Number)this.o.a());
        jsonObject.addProperty("brightness", this.q.a());
        jsonObject.addProperty("rainbow", this.p.u());
        return jsonObject;
    }

    @Override
    public boolean isCorrectValue(JsonObject jsonObject) {
        if (super.isCorrectValue(jsonObject)) {
            if (jsonObject.has("hue")) {
                this.n.b(jsonObject.get("hue").getAsDouble());
            }
            if (jsonObject.has("saturation")) {
                this.o.b(jsonObject.get("saturation").getAsDouble());
            }
            if (jsonObject.has("brightness")) {
                this.q.b(jsonObject.get("brightness").getAsDouble());
            }
            if (jsonObject.has("rainbow")) {
                this.p.setType((Boolean)jsonObject.get("rainbow").getAsBoolean());
            }
            return true;
        }
        return false;
    }

    public boolean createValue(Color color) {
        return Math.abs(color.getRed() - this.K().getRed()) < 2 && Math.abs(color.getGreen() - this.K().getGreen()) < 2 && Math.abs(color.getBlue() - this.K().getBlue()) < 2;
    }

    public void e(boolean bl) {
        this.s = bl;
    }

    public boolean createValue() {
        return this.s;
    }
}

