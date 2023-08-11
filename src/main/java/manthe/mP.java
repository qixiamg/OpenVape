/*
 * Decompiled with CFR 0.152.
 */
package manthe;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.Inflater;
import manthe.cx_0;

public class mP {
    private final byte[] i = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    private final int p = 1229472850;
    private final int o = 1347179589;
    private final int e = 1951551059;
    private final int q = 1229209940;
    private final int l = 1229278788;
    private final byte t = 0;
    private final byte v = (byte)2;
    private final byte h = (byte)3;
    private final byte j = (byte)4;
    private final byte f = (byte)6;
    private final InputStream m;
    private final byte[] b;
    private int g;
    private int w;
    private int r;
    private int c;
    private int s;
    private int k;
    private int n;
    private int d;
    private byte[] u;
    private byte[] x;
    private byte[] a;

    /*
     * Enabled aggressive block sorting
     */
    public mP(InputStream inputStream) throws IOException {
        this.m = inputStream;
        this.b = new byte[4096];
        this.a(this.b, 0, this.i.length);
        if (!this.b(this.b)) {
            throw new IOException("Not a valid PNG file");
        }
        this.b(1229472850);
        this.c();
        this.b();
        block5: while (true) {
            this.j();
            switch (this.w) {
                case 1229209940: {
                    break block5;
                }
                case 1347179589: {
                    this.a();
                    break;
                }
                case 1951551059: {
                    this.f();
                }
            }
            this.b();
        }
        if (this.n == 3 && this.u == null) {
            throw new IOException("Missing PLTE chunk");
        }
    }

    public int h() {
        return this.s;
    }

    public int d() {
        return this.c;
    }

    public boolean i() {
        return this.n == 6 || this.n == 4;
    }

    public boolean g() {
        return this.i() || this.x != null || this.a != null;
    }

    public boolean e() {
        return this.n == 6 || this.n == 2 || this.n == 3;
    }

    public void a(byte by, byte by2, byte by3) {
        if (this.i()) {
            throw new UnsupportedOperationException("image has an alpha channel");
        }
        byte[] byArray = this.u;
        if (byArray == null) {
            this.a = new byte[]{0, by, 0, by2, 0, by3};
        } else {
            this.x = new byte[byArray.length / 3];
            int n6 = 0;
            int n10 = 0;
            while (n6 < byArray.length) {
                if (byArray[n6] != by || byArray[n6 + 1] != by2 || byArray[n6 + 2] != by3) {
                    this.x[n10] = -1;
                }
                n6 += 3;
                ++n10;
            }
        }
    }

    public cx_0 a(cx_0 cx_02) {
        switch (this.n) {
            case 2: {
                switch (cx_02) {
                    case ABGR: 
                    case RGBA: 
                    case BGRA: 
                    case RGB: {
                        return cx_02;
                    }
                }
                return cx_0.RGB;
            }
            case 6: {
                switch (cx_02) {
                    case ABGR: 
                    case RGBA: 
                    case BGRA: 
                    case RGB: {
                        return cx_02;
                    }
                }
                return cx_0.RGBA;
            }
            case 0: {
                switch (cx_02) {
                    case LUMINANCE: 
                    case ALPHA: {
                        return cx_02;
                    }
                }
                return cx_0.LUMINANCE;
            }
            case 4: {
                return cx_0.LUMINANCE_ALPHA;
            }
            case 3: {
                switch (cx_02) {
                    case ABGR: 
                    case RGBA: 
                    case BGRA: {
                        return cx_02;
                    }
                }
                return cx_0.RGBA;
            }
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ByteBuffer byteBuffer, int n6, cx_0 cx_02) throws IOException {
        int n10 = byteBuffer.position();
        int n11 = (this.c * this.k + 7) / 8 * this.d;
        byte[] byArray = new byte[n11 + 1];
        byte[] byArray2 = new byte[n11 + 1];
        byte[] byArray3 = this.k < 8 ? new byte[this.c + 1] : null;
        Inflater inflater = new Inflater();
        try {
            for (int i = 0; i < this.s; ++i) {
                this.a(inflater, byArray, 0, byArray.length);
                this.g(byArray, byArray2);
                byteBuffer.position(n10 + i * n6);
                block1 : switch (this.n) {
                    case 2: {
                        switch (cx_02) {
                            case ABGR: {
                                this.j(byteBuffer, byArray);
                                break block1;
                            }
                            case RGBA: {
                                this.d(byteBuffer, byArray);
                                break block1;
                            }
                            case BGRA: {
                                this.g(byteBuffer, byArray);
                                break block1;
                            }
                            case RGB: {
                                this.b(byteBuffer, byArray);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 6: {
                        switch (cx_02) {
                            case ABGR: {
                                this.e(byteBuffer, byArray);
                                break block1;
                            }
                            case RGBA: {
                                this.b(byteBuffer, byArray);
                                break block1;
                            }
                            case BGRA: {
                                this.i(byteBuffer, byArray);
                                break block1;
                            }
                            case RGB: {
                                this.f(byteBuffer, byArray);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 0: {
                        switch (cx_02) {
                            case LUMINANCE: 
                            case ALPHA: {
                                this.b(byteBuffer, byArray);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 4: {
                        switch (cx_02) {
                            case LUMINANCE_ALPHA: {
                                this.b(byteBuffer, byArray);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    case 3: {
                        switch (this.k) {
                            case 8: {
                                byArray3 = byArray;
                                break;
                            }
                            case 4: {
                                this.f(byArray, byArray3);
                                break;
                            }
                            case 2: {
                                this.a(byArray, byArray3);
                                break;
                            }
                            case 1: {
                                this.b(byArray, byArray3);
                                break;
                            }
                            default: {
                                throw new UnsupportedOperationException("Unsupported bitdepth for this image");
                            }
                        }
                        switch (cx_02) {
                            case ABGR: {
                                this.a(byteBuffer, byArray3);
                                break block1;
                            }
                            case RGBA: {
                                this.h(byteBuffer, byArray3);
                                break block1;
                            }
                            case BGRA: {
                                this.c(byteBuffer, byArray3);
                                break block1;
                            }
                        }
                        throw new UnsupportedOperationException("Unsupported format for this image");
                    }
                    default: {
                        throw new UnsupportedOperationException("Not yet implemented");
                    }
                }
                byte[] byArray4 = byArray;
                byArray = byArray2;
                byArray2 = byArray4;
            }
        }
        finally {
            inflater.end();
        }
    }

    public void b(ByteBuffer byteBuffer, int n6, cx_0 cx_02) throws IOException {
        if (n6 <= 0) {
            throw new IllegalArgumentException("stride");
        }
        int n10 = byteBuffer.position();
        int n11 = (this.s - 1) * n6;
        byteBuffer.position(n10 + n11);
        this.a(byteBuffer, -n6, cx_02);
        byteBuffer.position(byteBuffer.position() + n11);
    }

    private void b(ByteBuffer byteBuffer, byte[] byArray) {
        byteBuffer.put(byArray, 1, byArray.length - 1);
    }

    private void j(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.a != null) {
            byte by = this.a[1];
            byte by2 = this.a[3];
            byte by3 = this.a[5];
            int n6 = byArray.length;
            for (int i = 1; i < n6; i += 3) {
                byte by4 = byArray[i];
                byte by5 = byArray[i + 1];
                byte by6 = byArray[i + 2];
                byte by7 = -1;
                if (by4 == by && by5 == by2 && by6 == by3) {
                    by7 = 0;
                }
                byteBuffer.put(by7).put(by6).put(by5).put(by4);
            }
        } else {
            int n10 = byArray.length;
            for (int i = 1; i < n10; i += 3) {
                byteBuffer.put((byte)-1).put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]);
            }
        }
    }

    private void d(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.a != null) {
            byte by = this.a[1];
            byte by2 = this.a[3];
            byte by3 = this.a[5];
            int n6 = byArray.length;
            for (int i = 1; i < n6; i += 3) {
                byte by4 = byArray[i];
                byte by5 = byArray[i + 1];
                byte by6 = byArray[i + 2];
                byte by7 = -1;
                if (by4 == by && by5 == by2 && by6 == by3) {
                    by7 = 0;
                }
                byteBuffer.put(by4).put(by5).put(by6).put(by7);
            }
        } else {
            int n10 = byArray.length;
            for (int i = 1; i < n10; i += 3) {
                byteBuffer.put(byArray[i]).put(byArray[i + 1]).put(byArray[i + 2]).put((byte)-1);
            }
        }
    }

    private void g(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.a != null) {
            byte by = this.a[1];
            byte by2 = this.a[3];
            byte by3 = this.a[5];
            int n6 = byArray.length;
            for (int i = 1; i < n6; i += 3) {
                byte by4 = byArray[i];
                byte by5 = byArray[i + 1];
                byte by6 = byArray[i + 2];
                byte by7 = -1;
                if (by4 == by && by5 == by2 && by6 == by3) {
                    by7 = 0;
                }
                byteBuffer.put(by6).put(by5).put(by4).put(by7);
            }
        } else {
            int n10 = byArray.length;
            for (int i = 1; i < n10; i += 3) {
                byteBuffer.put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]).put((byte)-1);
            }
        }
    }

    private void e(ByteBuffer byteBuffer, byte[] byArray) {
        int n6 = byArray.length;
        for (int i = 1; i < n6; i += 4) {
            byteBuffer.put(byArray[i + 3]).put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]);
        }
    }

    private void i(ByteBuffer byteBuffer, byte[] byArray) {
        int n6 = byArray.length;
        for (int i = 1; i < n6; i += 4) {
            byteBuffer.put(byArray[i + 2]).put(byArray[i + 1]).put(byArray[i]).put(byArray[i + 3]);
        }
    }

    private void f(ByteBuffer byteBuffer, byte[] byArray) {
        int n6 = byArray.length;
        for (int i = 1; i < n6; i += 4) {
            byteBuffer.put(byArray[i]).put(byArray[i + 1]).put(byArray[i + 2]);
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.x != null) {
            int n6 = byArray.length;
            for (int i = 1; i < n6; ++i) {
                int n10 = byArray[i] & 0xFF;
                byte by = this.u[n10 * 3 + 0];
                byte by2 = this.u[n10 * 3 + 1];
                byte by3 = this.u[n10 * 3 + 2];
                byte by4 = this.x[n10];
                byteBuffer.put(by4).put(by3).put(by2).put(by);
            }
        } else {
            int n11 = byArray.length;
            for (int i = 1; i < n11; ++i) {
                int n12 = byArray[i] & 0xFF;
                byte by = this.u[n12 * 3 + 0];
                byte by5 = this.u[n12 * 3 + 1];
                byte by6 = this.u[n12 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by7).put(by6).put(by5).put(by);
            }
        }
    }

    private void h(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.x != null) {
            int n6 = byArray.length;
            for (int i = 1; i < n6; ++i) {
                int n10 = byArray[i] & 0xFF;
                byte by = this.u[n10 * 3 + 0];
                byte by2 = this.u[n10 * 3 + 1];
                byte by3 = this.u[n10 * 3 + 2];
                byte by4 = this.x[n10];
                byteBuffer.put(by).put(by2).put(by3).put(by4);
            }
        } else {
            int n11 = byArray.length;
            for (int i = 1; i < n11; ++i) {
                int n12 = byArray[i] & 0xFF;
                byte by = this.u[n12 * 3 + 0];
                byte by5 = this.u[n12 * 3 + 1];
                byte by6 = this.u[n12 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by).put(by5).put(by6).put(by7);
            }
        }
    }

    private void c(ByteBuffer byteBuffer, byte[] byArray) {
        if (this.x != null) {
            int n6 = byArray.length;
            for (int i = 1; i < n6; ++i) {
                int n10 = byArray[i] & 0xFF;
                byte by = this.u[n10 * 3 + 0];
                byte by2 = this.u[n10 * 3 + 1];
                byte by3 = this.u[n10 * 3 + 2];
                byte by4 = this.x[n10];
                byteBuffer.put(by3).put(by2).put(by).put(by4);
            }
        } else {
            int n11 = byArray.length;
            for (int i = 1; i < n11; ++i) {
                int n12 = byArray[i] & 0xFF;
                byte by = this.u[n12 * 3 + 0];
                byte by5 = this.u[n12 * 3 + 1];
                byte by6 = this.u[n12 * 3 + 2];
                byte by7 = -1;
                byteBuffer.put(by6).put(by5).put(by).put(by7);
            }
        }
    }

    private void f(byte[] byArray, byte[] byArray2) {
        int n6 = byArray2.length;
        for (int i = 1; i < n6; i += 2) {
            int n10 = byArray[1 + (i >> 1)] & 0xFF;
            switch (n6 - i) {
                default: {
                    byArray2[i + 1] = (byte)(n10 & 0xF);
                }
                case 1: 
            }
            byArray2[i] = (byte)(n10 >> 4);
        }
    }

    private void a(byte[] byArray, byte[] byArray2) {
        int n6 = byArray2.length;
        for (int i = 1; i < n6; i += 4) {
            int n10 = byArray[1 + (i >> 2)] & 0xFF;
            switch (n6 - i) {
                default: {
                    byArray2[i + 3] = (byte)(n10 & 3);
                }
                case 3: {
                    byArray2[i + 2] = (byte)(n10 >> 2 & 3);
                }
                case 2: {
                    byArray2[i + 1] = (byte)(n10 >> 4 & 3);
                }
                case 1: 
            }
            byArray2[i] = (byte)(n10 >> 6);
        }
    }

    private void b(byte[] byArray, byte[] byArray2) {
        int n6 = byArray2.length;
        for (int i = 1; i < n6; i += 8) {
            int n10 = byArray[1 + (i >> 3)] & 0xFF;
            switch (n6 - i) {
                default: {
                    byArray2[i + 7] = (byte)(n10 & 1);
                }
                case 7: {
                    byArray2[i + 6] = (byte)(n10 >> 1 & 1);
                }
                case 6: {
                    byArray2[i + 5] = (byte)(n10 >> 2 & 1);
                }
                case 5: {
                    byArray2[i + 4] = (byte)(n10 >> 3 & 1);
                }
                case 4: {
                    byArray2[i + 3] = (byte)(n10 >> 4 & 1);
                }
                case 3: {
                    byArray2[i + 2] = (byte)(n10 >> 5 & 1);
                }
                case 2: {
                    byArray2[i + 1] = (byte)(n10 >> 6 & 1);
                }
                case 1: 
            }
            byArray2[i] = (byte)(n10 >> 7);
        }
    }

    private void g(byte[] byArray, byte[] byArray2) throws IOException {
        switch (byArray[0]) {
            case 0: {
                break;
            }
            case 1: {
                this.a(byArray);
                break;
            }
            case 2: {
                this.d(byArray, byArray2);
                break;
            }
            case 3: {
                this.e(byArray, byArray2);
                break;
            }
            case 4: {
                this.c(byArray, byArray2);
                break;
            }
            default: {
                throw new IOException("invalide filter type in scanline: " + byArray[0]);
            }
        }
    }

    private void a(byte[] byArray) {
        int n6 = this.d;
        int n10 = byArray.length;
        for (int i = n6 + 1; i < n10; ++i) {
            int n11 = i;
            byArray[n11] = (byte)(byArray[n11] + byArray[i - n6]);
        }
    }

    private void d(byte[] byArray, byte[] byArray2) {
        int n6 = this.d;
        int n10 = byArray.length;
        for (int i = 1; i < n10; ++i) {
            int n11 = i;
            byArray[n11] = (byte)(byArray[n11] + byArray2[i]);
        }
    }

    private void e(byte[] byArray, byte[] byArray2) {
        int n6;
        int n10 = this.d;
        for (n6 = 1; n6 <= n10; ++n6) {
            int n11 = n6;
            byArray[n11] = (byte)(byArray[n11] + (byte)((byArray2[n6] & 0xFF) >>> 1));
        }
        int n12 = byArray.length;
        while (n6 < n12) {
            int n13 = n6;
            byArray[n13] = (byte)(byArray[n13] + (byte)((byArray2[n6] & 0xFF) + (byArray[n6 - n10] & 0xFF) >>> 1));
            ++n6;
        }
    }

    private void c(byte[] byArray, byte[] byArray2) {
        int n6;
        int n10 = this.d;
        for (n6 = 1; n6 <= n10; ++n6) {
            int n11 = n6;
            byArray[n11] = (byte)(byArray[n11] + byArray2[n6]);
        }
        int n12 = byArray.length;
        while (n6 < n12) {
            int n13;
            int n14;
            int n15 = byArray[n6 - n10] & 0xFF;
            int n16 = byArray2[n6] & 0xFF;
            int n17 = byArray2[n6 - n10] & 0xFF;
            int n18 = n15 + n16 - n17;
            int n19 = n18 - n15;
            if (n19 < 0) {
                n19 = -n19;
            }
            if ((n14 = n18 - n16) < 0) {
                n14 = -n14;
            }
            if ((n13 = n18 - n17) < 0) {
                n13 = -n13;
            }
            if (n19 <= n14 && n19 <= n13) {
                n17 = n15;
            } else if (n14 <= n13) {
                n17 = n16;
            }
            int n20 = n6++;
            byArray[n20] = (byte)(byArray[n20] + (byte)n17);
        }
    }

    private void c() throws IOException {
        this.a(13);
        this.b(this.b, 0, 13);
        this.c = this.a(this.b, 0);
        this.s = this.a(this.b, 4);
        this.k = this.b[8] & 0xFF;
        this.n = this.b[9] & 0xFF;
        block0 : switch (this.n) {
            case 0: {
                if (this.k != 8) {
                    throw new IOException("Unsupported bit depth: " + this.k);
                }
                this.d = 1;
                break;
            }
            case 4: {
                if (this.k != 8) {
                    throw new IOException("Unsupported bit depth: " + this.k);
                }
                this.d = 2;
                break;
            }
            case 2: {
                if (this.k != 8) {
                    throw new IOException("Unsupported bit depth: " + this.k);
                }
                this.d = 3;
                break;
            }
            case 6: {
                if (this.k != 8) {
                    throw new IOException("Unsupported bit depth: " + this.k);
                }
                this.d = 4;
                break;
            }
            case 3: {
                switch (this.k) {
                    case 1: 
                    case 2: 
                    case 4: 
                    case 8: {
                        this.d = 1;
                        break block0;
                    }
                }
                throw new IOException("Unsupported bit depth: " + this.k);
            }
            default: {
                throw new IOException("unsupported color format: " + this.n);
            }
        }
        if (this.b[10] != 0) {
            throw new IOException("unsupported compression method");
        }
        if (this.b[11] != 0) {
            throw new IOException("unsupported filtering method");
        }
        if (this.b[12] != 0) {
            throw new IOException("unsupported interlace method");
        }
    }

    private void a() throws IOException {
        int n6 = this.g / 3;
        if (n6 < 1 || n6 > 256 || this.g % 3 != 0) {
            throw new IOException("PLTE chunk has wrong length");
        }
        this.u = new byte[n6 * 3];
        this.b(this.u, 0, this.u.length);
    }

    private void f() throws IOException {
        switch (this.n) {
            case 0: {
                this.a(2);
                this.a = new byte[2];
                this.b(this.a, 0, 2);
                break;
            }
            case 2: {
                this.a(6);
                this.a = new byte[6];
                this.b(this.a, 0, 6);
                break;
            }
            case 3: {
                if (this.u == null) {
                    throw new IOException("tRNS chunk without PLTE chunk");
                }
                this.x = new byte[this.u.length / 3];
                Arrays.fill(this.x, (byte)-1);
                this.b(this.x, 0, this.x.length);
                break;
            }
        }
    }

    private void b() throws IOException {
        if (this.r > 0) {
            this.a((long)(this.r + 4));
        } else {
            this.a(this.b, 0, 4);
        }
        this.r = 0;
        this.g = 0;
        this.w = 0;
    }

    private void j() throws IOException {
        this.a(this.b, 0, 8);
        this.g = this.a(this.b, 0);
        this.w = this.a(this.b, 4);
        this.r = this.g;
    }

    private void b(int n6) throws IOException {
        this.j();
        if (this.w != n6) {
            throw new IOException("Expected chunk: " + Integer.toHexString(n6));
        }
    }

    private void a(int n6) throws IOException {
        if (this.g != n6) {
            throw new IOException("Chunk has wrong size");
        }
    }

    private int b(byte[] byArray, int n6, int n10) throws IOException {
        if (n10 > this.r) {
            n10 = this.r;
        }
        this.a(byArray, n6, n10);
        this.r -= n10;
        return n10;
    }

    private void a(Inflater inflater) throws IOException {
        while (this.r == 0) {
            this.b();
            this.b(1229209940);
        }
        int n6 = this.b(this.b, 0, this.b.length);
        inflater.setInput(this.b, 0, n6);
    }

    private void a(Inflater inflater, byte[] byArray, int n6, int n10) throws IOException {
        try {
            do {
                int n11;
                if ((n11 = inflater.inflate(byArray, n6, n10)) <= 0) {
                    if (inflater.finished()) {
                        throw new EOFException();
                    }
                    if (inflater.needsInput()) {
                        this.a(inflater);
                        continue;
                    }
                    throw new IOException("Can't inflate " + n10 + " bytes");
                }
                n6 += n11;
                n10 -= n11;
            } while (n10 > 0);
        }
        catch (Exception exception) {
            throw new IOException("inflate error", exception);
        }
    }

    private void a(byte[] byArray, int n6, int n10) throws IOException {
        int n11;
        do {
            if ((n11 = this.m.read(byArray, n6, n10)) < 0) {
                throw new EOFException();
            }
            n6 += n11;
        } while ((n10 -= n11) > 0);
    }

    private int a(byte[] byArray, int n6) {
        return byArray[n6] << 24 | (byArray[n6 + 1] & 0xFF) << 16 | (byArray[n6 + 2] & 0xFF) << 8 | byArray[n6 + 3] & 0xFF;
    }

    private void a(long l6) throws IOException {
        while (l6 > 0L) {
            long l10 = this.m.skip(l6);
            if (l10 < 0L) {
                throw new EOFException();
            }
            l6 -= l10;
        }
    }

    private boolean b(byte[] byArray) {
        for (int i = 0; i < this.i.length; ++i) {
            if (byArray[i] == this.i[i]) continue;
            return false;
        }
        return true;
    }
}

