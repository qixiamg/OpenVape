/*
 * Decompiled with CFR 0.152.
 */
package a;

import dev.jnic.bHdgem.JNICLoader;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import lgbt.vape.bootstrap.TrueTypeFontRenderer;

public class a {
    private static ConcurrentHashMap<Integer, TrueTypeFontRenderer> fontMap;

    public static native void start();

    public static native void exit(boolean var0);

    public static native void dc();

    public static native void fs();

    public static native Class<?> gc(String var0);

    public static native byte[] gt(String var0) throws IOException;

    public static native int gk();

    public static native String gs();

    public static native void ss(String var0);

    public static native boolean ib();

    public static native void sb();

    public static native void mb(int var0);

    public static native Class<?> gcj(String var0) throws ClassNotFoundException;

    public static native String gcs(Class<?> var0);

    public static native void test();

    public static native String cs(int var0);

    public static native void rl();

    public static native String sp(String var0, String var1);

    public static native Object grh();

    public static native void cpy(String var0);

    public static native void reload();

    public static native void p(String var0);

    public static native short gks(int var0);

    public static native double[] trn(double var0, double var2, double var4);

    public static native byte[] gcb(Class<?> var0) throws Exception;

    public static native int scb(Class<?> var0, byte[] var1) throws Exception;

    public static native int ds(int var0, String var1, double var2, double var4, int var6);

    public static native double gsw(int var0, String var1);

    public static native double gsh(int var0, String var1);

    public static native void smd(int var0, int var1);

    public static native String gp(String var0) throws Exception;

    public static native void su(String var0);

    public static native boolean iv();

    public static native Class<?> gvc(String var0);

    public static native int gmv();

    public static native void rsc();

    public static native int mf(int var0, int var1, String var2);

    public static native void updc(String var0, String var1);

    public static native int dsv2(int var0, String var1, double var2, double var4, int var6, float var7);

    public static native double gswv2(int var0, String var1);

    public static native double gshv2(int var0, String var1);

    public static native int mfv2(int var0, int var1, String var2);

    private static native /* synthetic */ void lambda$start$0();

    static native /* synthetic */ void $jnicClinit();

    public static native /* synthetic */ void $jnicLoader();

    static {
        JNICLoader.init();
        a.$jnicLoader();
        a.$jnicClinit();
    }
}

