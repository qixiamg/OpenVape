package rip.vape.value;

import com.google.gson.JsonObject;
import manthe.*;
import rip.vape.module.Module;

import java.util.ArrayList;
import java.util.List;


public abstract class BasicValue<T, V extends p1> implements BI {

    private final Object base;
    private final String valueName;
    private V defaultValue;
    private T type;
    private BasicValue baseValue;
    private C4 d;
    private boolean a;
    private wM h;
    private final List<vA> i = new ArrayList<>();

    public BasicValue(Object base, String valueName, V defaultValue) {
        this.base = base;
        this.valueName = valueName;
        this.defaultValue = defaultValue;
        if (base != null) {
            if (base instanceof yf_0) {
                on.p.T().a(this);
            } else if (!(base instanceof Module)) {
                on.p.o().a(this);
            }
        }
    }

    @Override
    public String H() {
        return this.valueName;
    }

    public abstract T n();

    public abstract void b(T var1);

    public abstract void setTypeByString(String var1);

    public void b(boolean bl) {
        this.a = bl;
    }

    public boolean g() {
        return this.a;
    }

    public void d() {
        if (!this.a) {
            on.p.n();
        }
        for (vA vA2 : this.i) {
            vA2.a();
        }
        if (this.d != null) {
            this.d.a(this);
        }
    }

    public T b() {
        return this.type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public V getDefaultValue() {
        return this.defaultValue;
    }

    protected void setDefaultValue(V value) {
        this.defaultValue = value;
    }

    public BasicValue getBaseValue() {
        return this.baseValue;
    }

    public void setBaseValue(BasicValue baseValue) {
        this.baseValue = baseValue;
    }

    public String getValueName() {
        return this.baseValue != null ? this.baseValue.valueName + "-" + this.valueName : this.valueName;
    }

    public Object getBase() {
        return this.base;
    }

    public JsonObject getJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.getValueName());
        if (this.n() != null) {
            jsonObject.addProperty("value", this.n().toString());
        }
        return jsonObject;
    }

    public boolean isCorrectValue(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.getValueName()) && jsonObject.has("value")) {
            this.setTypeByString(jsonObject.get("value").getAsString());
            this.l();
            return true;
        }
        return false;
    }

    public void l() {
        for (vA vA2 : this.i) {
            vA2.a();
        }
    }

    public void getRuntimeCopyException(vA vA2) {
        this.i.add(vA2);
    }

    public void q() {
        this.b(this.b());
    }

    public wM k() {
        return this.h;
    }

    public void getRuntimeCopyException(wM wM2) {
        this.h = wM2;
    }

    public void getRuntimeCopyException(C4 c4) {
        this.d = c4;
    }

    public C4 j() {
        return this.d;
    }
}

