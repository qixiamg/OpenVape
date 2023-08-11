/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.FieldInsnNode
 *  org.objectweb.asm.tree.FieldNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
package manthe;

import manthe.y_0;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class pB
implements y_0 {
    private String b;
    private InsnList a = new InsnList();
    private InsnList d = new InsnList();
    private FieldNode c;

    public pB(String string) {
        this.b = string;
    }

    @Override
    public InsnList e() {
        return this.a;
    }

    @Override
    public InsnList b() {
        return this.d;
    }

    @Override
    public void a(ClassNode classNode, MethodNode methodNode) {
        for (FieldNode fieldNode : classNode.fields) {
            if (!fieldNode.name.equals(this.b)) continue;
            this.c = fieldNode;
            this.a.add((AbstractInsnNode)new VarInsnNode(25, 0));
            this.a.add((AbstractInsnNode)new FieldInsnNode(180, classNode.name, fieldNode.name, fieldNode.desc));
            this.d.add((AbstractInsnNode)new VarInsnNode(25, 0));
            this.d.add((AbstractInsnNode)new FieldInsnNode(181, classNode.name, fieldNode.name, fieldNode.desc));
        }
    }

    @Override
    public String c() {
        return this.c.desc;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public y_0 a(Class clazz) {
        return this;
    }

    @Override
    public String d() {
        return null;
    }
}

