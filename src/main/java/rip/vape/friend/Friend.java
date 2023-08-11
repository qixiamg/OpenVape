package rip.vape.friend;

import com.google.gson.JsonObject;
import manthe.on;

public class Friend {
    private String name;
    private String alias;
    private boolean target = true;

    public Friend(String string, String string2) {
        this.name = string;
        this.alias = string2;
    }

    public String getName() {
        return this.name;
    }

    public String getNameOrAlias() {
        if (on.p.N().useAlias.u()) {
            return this.getAlias();
        }
        return this.name;
    }

    public void setAlias(String string) {
        this.alias = string;
    }

    public String getAlias() {
        return this.alias;
    }

    public boolean getTarget() {
        return this.target;
    }

    public void setAlias(boolean bl) {
        this.target = bl;
        on.p.N().b();
    }

    public Friend setAlias(JsonObject jsonObject) {
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.name = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("alias") != null && !jsonObject.get("alias").isJsonNull()) {
            this.alias = jsonObject.get("alias").getAsString();
        }
        if (jsonObject.get("target") != null && !jsonObject.get("target").isJsonNull()) {
            this.target = jsonObject.get("target").getAsBoolean();
        }
        return this;
    }

    public JsonObject getJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.name);
        jsonObject.addProperty("alias", this.alias);
        jsonObject.addProperty("target", Boolean.valueOf(this.target));
        return jsonObject;
    }
}

