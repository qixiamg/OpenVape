/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.LocalVariableNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
package manthe;

import java.util.ListIterator;
import manthe.cm_0;
import manthe.vp;
import manthe.y_0;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/*
 * Renamed from manthe.yb
 */
public class yb_0
implements y_0 {
    private String e;
    protected InsnList g = new InsnList();
    protected InsnList a = new InsnList();
    protected LocalVariableNode b;
    protected VarInsnNode d;
    protected VarInsnNode h;
    protected String f;
    private String j = null;
    private boolean c;
    private String i;

    public yb_0(String string) {
        this.e = string;
    }

    void a(LabelNode labelNode) {
        if (this.b != null) {
            this.b.start = labelNode;
        }
    }

    @Override
    public InsnList e() {
        return this.g;
    }

    @Override
    public InsnList b() {
        return this.a;
    }

    @Override
    public void a(ClassNode classNode, MethodNode methodNode) {
        if (this.e.equals("this") && methodNode.localVariables.size() == 0) {
            AbstractInsnNode abstractInsnNode;
            String string = "L" + classNode.name + ";";
            LabelNode labelNode = null;
            LabelNode labelNode2 = null;
            ListIterator listIterator = methodNode.instructions.iterator();
            block0: while (listIterator.hasNext()) {
                abstractInsnNode = (AbstractInsnNode)listIterator.next();
                if (!(abstractInsnNode instanceof LabelNode)) continue;
                labelNode = (LabelNode)abstractInsnNode;
                while (listIterator.hasNext()) {
                    listIterator.next();
                    if (listIterator.hasNext()) continue;
                    while (listIterator.hasPrevious()) {
                        abstractInsnNode = (AbstractInsnNode)listIterator.previous();
                        if (!(abstractInsnNode instanceof LabelNode)) continue;
                        labelNode2 = (LabelNode)abstractInsnNode;
                        break block0;
                    }
                }
            }
            abstractInsnNode = new LocalVariableNode("this", string, null, labelNode, labelNode2, 0);
            methodNode.localVariables.add(abstractInsnNode);
            this.b = abstractInsnNode;
            this.d = new VarInsnNode(25, 0);
            this.g.add((AbstractInsnNode)this.d);
            this.h = new VarInsnNode(58, 0);
            this.a.add((AbstractInsnNode)this.h);
            this.f = string;
            return;
        }
        for (LocalVariableNode localVariableNode : methodNode.localVariables) {
            if (!localVariableNode.name.equals(this.e)) continue;
            this.b = localVariableNode;
            this.d = new VarInsnNode(vp.b(localVariableNode.desc), localVariableNode.index);
            this.g.add((AbstractInsnNode)this.d);
            this.h = new VarInsnNode(vp.d(localVariableNode.desc), localVariableNode.index);
            this.a.add((AbstractInsnNode)this.h);
            this.f = this.b.desc;
        }
    }

    @Override
    public String c() {
        if (this.j != null) {
            return this.j;
        }
        return this.f;
    }

    @Override
    public boolean a() {
        return this.c;
    }

    @Override
    public y_0 a(Class clazz) {
        this.c = true;
        this.i = clazz.getName().replace(".", "/");
        return this;
    }

    @Override
    public String d() {
        return this.i;
    }

    public yb_0 b(Class clazz) {
        this.j = cm_0.a(clazz);
        return this;
    }
}

