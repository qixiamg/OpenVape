/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
package manthe;

import manthe.vp;
import manthe.y4;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public class y9
extends y4 {
    public y9(int n6, String string) {
        super(n6);
        this.f = string;
    }

    @Override
    public void a(ClassNode classNode, MethodNode methodNode) {
        this.d = new VarInsnNode(vp.b(this.f), this.k);
        this.g.add((AbstractInsnNode)this.d);
        this.h = new VarInsnNode(vp.d(this.f), this.k);
        this.a.add((AbstractInsnNode)this.h);
    }
}

