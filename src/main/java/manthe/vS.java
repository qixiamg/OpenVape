/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import manthe.ba_0;

class vS
implements HostnameVerifier {
    final ba_0 a;

    vS(ba_0 ba_02) {
        this.a = ba_02;
    }

    @Override
    public boolean verify(String string, SSLSession sSLSession) {
        return string.equals("authserver.thealtening.com") || string.equals("sessionserver.thealtening.com");
    }
}

