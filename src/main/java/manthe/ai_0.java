/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package manthe;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import manthe.on;
import manthe.qd_0;

/*
 * Renamed from manthe.ai
 */
public class ai_0 {
    private final Gson b = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    HttpURLConnection a;

    public qd_0 a(String string) {
        try {
            String string2;
            URL uRL = new URL("http://api.thealtening.com/v2/license?key=" + string);
            this.a = (HttpURLConnection)uRL.openConnection();
            this.a.setRequestMethod("GET");
            this.a.setUseCaches(false);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append('\r');
            }
            bufferedReader.close();
            return (qd_0)this.b.fromJson(stringBuffer.toString(), qd_0.class);
        }
        catch (Exception exception) {
            on.a(exception);
            try {
                if (this.a.getResponseCode() == 403) {
                    return null;
                }
                System.out.println("Unhandled error code: " + this.a.getResponseCode());
            }
            catch (IOException iOException) {
                on.a(iOException);
            }
            return null;
        }
    }
}

