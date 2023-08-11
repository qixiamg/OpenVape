/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import manthe.ba_0;

class ni
implements X509TrustManager {
    final ba_0 a;

    ni(ba_0 ba_02) {
        this.a = ba_02;
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
    }
}

