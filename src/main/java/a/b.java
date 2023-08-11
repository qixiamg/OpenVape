/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
package a;

import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import lgbt.vape.bootstrap.Mappings;
import lgbt.vape.bootstrap.Parameters;

public class b {
    private static final TIntObjectMap<Method> METHODS = new TIntObjectHashMap();
    private static final TIntObjectMap<Field> FIELDS = new TIntObjectHashMap();
    private static final TIntObjectMap<Constructor<?>> CONSTRUCTORS = new TIntObjectHashMap();

    public static void a(int id, Class<?> cls, String name, String desc, boolean remap) throws NoSuchMethodException {
        b.getMethod(id, cls, name, desc, remap, false);
    }

    public static void b(int id, Class<?> cls, String name, String desc, boolean remap) throws NoSuchMethodException {
        b.getMethod(id, cls, name, desc, remap, true);
    }

    private static void getMethod(int id, Class<?> cls, String name, String desc, boolean remap, boolean isStatic) throws NoSuchMethodException {
        if (name.equals("<init>")) {
            b.getConstructor(id, cls, desc);
        } else {
            if (!name.equals("ordinal") && !name.equals("values")) {
                boolean skipParamCheck = name.equals("getEnchantmentModifierDamage");
                for (Method method : cls.getDeclaredMethods()) {
                    if (!Mappings.match(method, name) || !Parameters.checkParameterTypes(method.getParameterTypes(), method.getReturnType(), desc) && !skipParamCheck) continue;
                    method.setAccessible(true);
                    METHODS.put(id, (Object)method);
                    return;
                }
                System.out.println("METHOD NOT FOUND: " + id + " " + name + " IN " + cls.getName());
                throw new NoSuchMethodException();
            }
            METHODS.put(id, (Object)Enum.class.getDeclaredMethod(name, new Class[0]));
        }
    }

    private static void getConstructor(int id, Class<?> cls, String desc) {
        Constructor<?>[] constructors;
        for (Constructor<?> constructor : constructors = cls.getDeclaredConstructors()) {
            if (!Parameters.checkParameterTypes(constructor.getParameterTypes(), Void.TYPE, desc)) continue;
            constructor.setAccessible(true);
            CONSTRUCTORS.put(id, constructor);
            return;
        }
    }

    public static void c(int id, Object instance, Object ... params) throws Exception {
        b.invokeMethod(id, instance, Void.TYPE, params);
    }

    public static boolean d(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Boolean.TYPE, params);
    }

    public static char e(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Character.TYPE, params).charValue();
    }

    public static short f(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Short.TYPE, params);
    }

    public static int g(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Integer.TYPE, params);
    }

    public static long h(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Long.TYPE, params);
    }

    public static float i(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Float.TYPE, params).floatValue();
    }

    public static double j(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Double.TYPE, params);
    }

    public static Object k(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Object.class, params);
    }

    public static boolean[] l(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, boolean[].class, params);
    }

    public static char[] m(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, char[].class, params);
    }

    public static short[] n(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, short[].class, params);
    }

    public static int[] o(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, int[].class, params);
    }

    public static long[] p(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, long[].class, params);
    }

    public static float[] q(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, float[].class, params);
    }

    public static double[] r(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, double[].class, params);
    }

    public static Object[] s(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Object[].class, params);
    }

    private static <T> T invokeMethod(int id, Object instance, Class<T> type, Object ... params) throws Exception {
        return (T)((Method)METHODS.get(id)).invoke(instance, params);
    }

    public static void t(int id, Class<?> cls, String name, String type, boolean remap) throws NoSuchFieldException {
        b.getField(id, cls, name, type, remap, false);
    }

    public static void u(int id, Class<?> cls, String name, String type, boolean remap) throws NoSuchFieldException {
        b.getField(id, cls, name, type, remap, true);
    }

    private static void getField(int id, Class<?> cls, String name, String type, boolean remap, boolean isStatic) throws NoSuchFieldException {
        for (Field field : cls.getDeclaredFields()) {
            if (!Mappings.match(field, name)) continue;
            field.setAccessible(true);
            FIELDS.put(id, (Object)field);
            return;
        }
        System.out.println("FIELD NOT FOUND: " + id + " " + name + " IN " + cls.getName());
        throw new NoSuchFieldException();
    }

    public static boolean v(int id, Object instance) throws Exception {
        return ((Field)FIELDS.get(id)).getBoolean(instance);
    }

    public static char w(int id, Object instance) throws Exception {
        return ((Field)FIELDS.get(id)).getChar(instance);
    }

    public static short x(int id, Object instance) throws Exception {
        return ((Field)FIELDS.get(id)).getShort(instance);
    }

    public static int y(int id, Object instance) throws Exception {
        return ((Field)FIELDS.get(id)).getInt(instance);
    }

    public static long z(int id, Object instance) throws Exception {
        return ((Field)FIELDS.get(id)).getLong(instance);
    }

    public static float aa(int id, Object instance) throws Exception {
        Field field = (Field)FIELDS.get(id);
        return field.getType() == Float.TYPE ? field.getFloat(instance) : (float)field.getDouble(instance);
    }

    public static double bb(int id, Object instance) throws Exception {
        return ((Field)FIELDS.get(id)).getDouble(instance);
    }

    public static Object cc(int id, Object instance) throws Exception {
        return b.getField(id, instance);
    }

    public static boolean[] dd(int id, Object instance) throws Exception {
        return (boolean[])b.getField(id, instance);
    }

    public static char[] ee(int id, Object instance) throws Exception {
        return (char[])b.getField(id, instance);
    }

    public static short[] ff(int id, Object instance) throws Exception {
        return (short[])b.getField(id, instance);
    }

    public static int[] gg(int id, Object instance) throws Exception {
        return (int[])b.getField(id, instance);
    }

    public static long[] hh(int id, Object instance) throws Exception {
        return (long[])b.getField(id, instance);
    }

    public static float[] ii(int id, Object instance) throws Exception {
        return (float[])b.getField(id, instance);
    }

    public static double[] jj(int id, Object instance) throws Exception {
        return (double[])b.getField(id, instance);
    }

    public static Object[] kk(int id, Object instance) throws Exception {
        return (Object[])b.getField(id, instance);
    }

    private static <T> T getField(int id, Object instance) throws Exception {
        try {
            return (T)((Field)FIELDS.get(id)).get(instance);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            throw var4;
        }
    }

    public static void ll(int id, Object instance, boolean value) throws Exception {
        ((Field)FIELDS.get(id)).setBoolean(instance, value);
    }

    public static void mm(int id, Object instance, char value) throws Exception {
        ((Field)FIELDS.get(id)).setChar(instance, value);
    }

    public static void nn(int id, Object instance, short value) throws Exception {
        ((Field)FIELDS.get(id)).setShort(instance, value);
    }

    public static void oo(int id, Object instance, int value) throws Exception {
        ((Field)FIELDS.get(id)).setInt(instance, value);
    }

    public static void pp(int id, Object instance, long value) throws Exception {
        ((Field)FIELDS.get(id)).setLong(instance, value);
    }

    public static void qq(int id, Object instance, float value) throws Exception {
        ((Field)FIELDS.get(id)).setFloat(instance, value);
    }

    public static void rr(int id, Object instance, double value) throws Exception {
        ((Field)FIELDS.get(id)).setDouble(instance, value);
    }

    public static void ss(int id, Object instance, Object value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void tt(int id, Object instance, boolean[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void uu(int id, Object instance, char[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void vv(int id, Object instance, short[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void ww(int id, Object instance, int[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void xx(int id, Object instance, long[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void yy(int id, Object instance, float[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void zz(int id, Object instance, double[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    public static void aaa(int id, Object instance, Object[] value) throws Exception {
        b.setObjectField(id, instance, value);
    }

    private static void setObjectField(int id, Object instance, Object value) throws Exception {
        ((Field)FIELDS.get(id)).set(instance, value);
    }

    public static void bbb(int id, Object instance, Object ... params) throws Exception {
        b.invokeMethod(id, instance, Void.TYPE, params);
    }

    public static Object ccc(int id, Class<?> cls, Object ... params) throws Exception {
        return b.invokeConstructor(id, params);
    }

    private static <T> T invokeConstructor(int id, Object ... params) throws Exception {
        return ((Constructor)CONSTRUCTORS.get(id)).newInstance(params);
    }

    public static byte ddd(int id, Object instance, Object ... params) throws Exception {
        return b.invokeMethod(id, instance, Byte.TYPE, params);
    }

    public static String gfn(int id) {
        return ((Field)FIELDS.get(id)).getName();
    }

    public static String gmn(int id) {
        return ((Method)METHODS.get(id)).getName();
    }
}

