/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.InsnNode
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.LineNumberNode
 *  org.objectweb.asm.tree.LocalVariableNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.TypeInsnNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import manthe.on;
import manthe.qa_0;
import manthe.y_0;
import manthe.yb_0;
import org.objectweb.asm.Label;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class vp {
    private Class n;
    private ClassNode i;
    private MethodNode q;
    private List<y_0> g = new ArrayList<y_0>();
    private LabelNode j = new LabelNode(new Label());
    private boolean c;
    private y_0 e;
    private Class m;
    private int f;
    private InsnList r;
    private boolean k;
    private String l;
    private int a;
    private String p;
    private static String o;
    private static int d;
    private boolean h;
    private static int[] b;

    public vp(int n6, Class clazz, ClassNode classNode, qa_0 qa_02, boolean bl, y_0 ... y_0Array) {
        for (MethodNode methodNode : classNode.methods) {
            if (!qa_02.a(methodNode.name, methodNode.desc)) continue;
            this.q = methodNode;
        }
        if (this.q == null) {
            on.a("Couldnt find method node");
        }
        this.f = n6;
        this.n = clazz;
        this.i = classNode;
        for (y_0 y_02 : y_0Array) {
            y_02.a(classNode, this.q);
            this.g.add(y_02);
        }
        this.h = bl;
    }

    public void a() {
        y_0 y_0222;
        y_0 y_0322;
        this.p = this.n.getName().replace(".", "/");
        if (this.f == 0) {
            for (y_0 y_0322 : this.g) {
                if (!(y_0322 instanceof yb_0)) continue;
                ((yb_0)y_0322).a(this.j);
            }
        }
        InsnList insnList = new InsnList();
        y_0322 = new LabelNode(new Label());
        this.a = ++this.q.maxLocals;
        TypeInsnNode typeInsnNode = new TypeInsnNode(187, this.p);
        InsnNode insnNode = new InsnNode(89);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (y_0 y_0222 : this.g) {
            stringBuilder.append(y_0222.c());
        }
        stringBuilder.append(")V");
        MethodInsnNode methodInsnNode = new MethodInsnNode(183, this.p, "<init>", stringBuilder.toString(), false);
        y_0222 = new VarInsnNode(58, this.a);
        VarInsnNode varInsnNode = new VarInsnNode(25, this.a);
        MethodInsnNode methodInsnNode2 = new MethodInsnNode(182, this.p, o, "()Z", false);
        insnList.add((AbstractInsnNode)this.j);
        if (this.f == 0 && !this.h) {
            for (LocalVariableNode object : this.q.localVariables) {
                if (object.index != 0) continue;
                object.start = this.j;
            }
        }
        insnList.add((AbstractInsnNode)typeInsnNode);
        insnList.add((AbstractInsnNode)insnNode);
        for (y_0 y_02 : this.g) {
            insnList.add(y_02.e());
        }
        insnList.add((AbstractInsnNode)methodInsnNode);
        insnList.add((AbstractInsnNode)methodInsnNode2);
        this.r = insnList;
    }

    public vp b() {
        if (this.f == 0) {
            for (AbstractInsnNode abstractInsnNode : this.q.instructions) {
                if (!(abstractInsnNode instanceof LabelNode)) continue;
                this.q.instructions.insertBefore(abstractInsnNode, this.r);
            }
        } else if (this.f == -1) {
            ListIterator listIterator = this.q.instructions.iterator();
            while (listIterator.hasNext()) {
                listIterator.next();
                if (listIterator.hasNext()) continue;
                while (listIterator.hasPrevious()) {
                    AbstractInsnNode abstractInsnNode = (AbstractInsnNode)listIterator.previous();
                    if (!(abstractInsnNode instanceof LineNumberNode)) continue;
                    this.q.instructions.insertBefore(abstractInsnNode, this.r);
                    return this;
                }
            }
        } else {
            for (AbstractInsnNode abstractInsnNode : this.q.instructions) {
                if (!(abstractInsnNode instanceof LineNumberNode)) continue;
                LineNumberNode lineNumberNode = (LineNumberNode)abstractInsnNode;
                if (lineNumberNode.line != this.f) continue;
                this.q.instructions.insertBefore((AbstractInsnNode)lineNumberNode, this.r);
                return this;
            }
        }
        return this;
    }

    public static int b(String string) {
        switch (string) {
            case "D": {
                return 24;
            }
            case "I": {
                return 21;
            }
            case "F": {
                return 23;
            }
            case "Z": {
                return 21;
            }
            case "J": {
                return 22;
            }
        }
        return 25;
    }

    public static int d(String string) {
        switch (string) {
            case "D": {
                return 57;
            }
            case "I": {
                return 21;
            }
            case "F": {
                return 56;
            }
            case "Z": {
                return 54;
            }
            case "J": {
                return 55;
            }
        }
        return 58;
    }

    public static int c(String string) {
        int n6 = string.indexOf(")") + 1;
        switch (string = string.substring(n6, n6 + 1)) {
            case "I": 
            case "Z": {
                return 172;
            }
            case "F": {
                return 174;
            }
            case "D": {
                return 175;
            }
            case "V": {
                return 177;
            }
            case "J": {
                return 173;
            }
        }
        return 176;
    }

    public static String e(String string) {
        int n6 = string.indexOf(")") + 1;
        string = string.substring(n6, n6 + 1);
        return string;
    }

    public static List<String> a(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            char c2 = cArray[i];
            if (c2 == '(') continue;
            if (c2 == ')') break;
            if (c2 == 'L') {
                String string2 = "";
                while ((c2 = cArray[i++]) != ';') {
                    string2 = string2 + c2;
                }
                --i;
                arrayList.add(string2);
                continue;
            }
            arrayList.add(Character.toString(c2));
        }
        return arrayList;
    }

    static {
        d = 1;
        o = "fire";
        vp.b(new int[5]);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] c() {
        return b;
    }
}

