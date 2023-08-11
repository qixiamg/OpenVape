/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import manthe.cy_0;

public class mv {
    private static final String a = System.getProperty("user.home") + File.separator + "vapeTextures" + File.separator;
    private static cy_0[] b;

    public static byte[] a(String string) {
        File file = new File(a);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            return Files.readAllBytes(new File(a + string + ".png").toPath());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    static {
        mv.b(null);
    }

    public static void b(cy_0[] cy_0Array) {
        b = cy_0Array;
    }

    public static cy_0[] b() {
        return b;
    }
}

