/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import a.d;
import java.awt.Color;

import org.lwjgl.input.Keyboard;
import rip.vape.module.Module;

public class zI
extends Module {
    private final BooleanValue x = BooleanValue.createValue((Object)this, "Inventory Only", false, "Only moves you when in inventory/pause screen.\nIgnores any chests/containers.");
    private final BooleanValue w = BooleanValue.createValue((Object)this, "Sneak", false, "Takes sneaking input");
    private final BooleanValue u = BooleanValue.createValue((Object)this, "Rotate", false, "Rotates your head with the arrow keys.");
    private boolean v;

    public zI() {
        super("InvWalk", new Color(193, 113, 0).getRGB(), CQ.f, "Walk and look around in UI's\nUse arrow keys to look around\nDoes not bypass some anti-cheats!");
        this.u.d(true);
        this.a(this.x);
        this.a(this.w);
        this.a(this.u);
    }

    @Override
    public boolean n() {
        return false;
    }

    private boolean S() {
        return ds_2.x().d() && (!Keyboard.areRepeatEventsEnabled() && (this.x.u() == false || !ds_2.x().a(A5.bt) || ds_2.x().a(A5.ag)) || ds_2.x().a().equals(d.getGuiObject())) && !on.p.H().b(zu_0.class).ah();
    }

    @Override
    public void J() {
        if (ds_2.x().d()) {
            en_0 en_02 = ds_2.s();
            this.a(en_02.j(), false);
            this.a(en_02.A(), false);
            this.a(en_02.g(), false);
            this.a(en_02.n(), false);
            this.a(en_02.l(), false);
            this.a(en_02.u(), false);
        } else {
            this.T();
        }
    }

    @Override
    public void a(km_0 km_02) {
        if (km_02.c() && this.u.u().booleanValue()) {
            eJ eJ2 = ds_2.k();
            if (this.S()) {
                if (Keyboard.isKeyDown((int)200) && eJ2.K() - 3.0f > -90.0f) {
                    eJ2.d(Y.a(eJ2.K() - 3.0f, -89.5f, 89.5f));
                }
                if (Keyboard.isKeyDown((int)208) && eJ2.K() + 3.0f < 90.0f) {
                    eJ2.d(Y.a(eJ2.K() + 3.0f, -89.5f, 89.5f));
                }
                if (Keyboard.isKeyDown((int)203)) {
                    eJ2.i(eJ2.U() - 5.0f);
                }
                if (Keyboard.isKeyDown((int)205)) {
                    eJ2.i(eJ2.U() + 5.0f);
                }
            }
        }
    }

    private void a(ei_0 ei_02, boolean bl) {
        ei_0.a(ei_02.i(), bl);
        ei_0.a(ei_02.i());
    }

    private void a(ei_0 ei_02) {
        if (Keyboard.isKeyDown((int)ei_02.i())) {
            this.a(ei_02, true);
        } else if (ei_02.h()) {
            this.a(ei_02, false);
        }
    }

    private void T() {
        en_0 en_02 = ds_2.s();
        this.a(en_02.j());
        this.a(en_02.A());
        this.a(en_02.g());
        this.a(en_02.n());
        this.a(en_02.l());
        this.a(en_02.u());
    }

    @Override
    public void a(kn_0 kn_02) {
        if (kn_02.getEntity().a(A5.u)) {
            if (this.S()) {
                this.v = true;
                en_0 en_02 = ds_2.s();
                this.a(en_02.j());
                this.a(en_02.A());
                this.a(en_02.g());
                this.a(en_02.n());
                this.a(en_02.l());
                if (this.w.u().booleanValue()) {
                    this.a(en_02.u());
                }
            } else {
                if (this.v) {
                    this.T();
                }
                this.v = false;
            }
        }
    }
}

