/* Class40_Sub5_Sub17_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class40_Sub5_Sub17_Sub3 extends Class40_Sub5_Sub17
{
    public static RSString aClass1_3049
	= Class58.method978(-11538, "Could not complete login)3");
    public static RSString aClass1_3050;
    public static int[] anIntArray3051 = new int[25];
    public static int anInt3052;
    public static int anInt3053;
    public static RSString aClass1_3054;
    public static RSString aClass1_3055
	= (Class58.method978
	   (-11538, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3"));
    public static boolean[] aBooleanArray3056 = new boolean[112];
    public static int anInt3057;
    public int anInt3058;
    public static RSString aClass1_3059;
    public static int anInt3060;
    public static int anInt3061;
    public static RSString aClass1_3062;
    public static int anInt3063;
    public static int anInt3064;
    public static int anInt3065;
    public static RSString aClass1_3066;
    public int anInt3067;
    public static RSString aClass1_3068;
    public static RSString aClass1_3069;
    public static int anInt3070;
    public static RSString aClass1_3071;
    
    public static void method775(boolean arg0) {
	try {
	    anInt3064++;
	    int i = ((Class40_Sub5_Sub13.aClass40_Sub5_Sub17_Sub4_Sub1_2760
		      .anInt3089)
		     + Class48.anInt1126);
	    if (arg0 != false)
		method778(true, null);
	    int i_0_ = (Buffer.anInt1976
			+ (Class40_Sub5_Sub13
			   .aClass40_Sub5_Sub17_Sub4_Sub1_2760.anInt3098));
	    if ((Class40_Sub5_Sub6.anInt2437 - i_0_ ^ 0xffffffff) > 499
		|| -i_0_ + Class40_Sub5_Sub6.anInt2437 > 500
		|| Class34.anInt849 + -i < -500
		|| -i + Class34.anInt849 > 500) {
		Class34.anInt849 = i;
		Class40_Sub5_Sub6.anInt2437 = i_0_;
	    }
	    if (Class40_Sub5_Sub6.anInt2437 != i_0_)
		Class40_Sub5_Sub6.anInt2437
		    += (-Class40_Sub5_Sub6.anInt2437 + i_0_) / 16;
	    if (Class34.anInt849 != i)
		Class34.anInt849 += (-Class34.anInt849 + i) / 16;
	    if (aBooleanArray3056[96])
		Class10.anInt349 += (-24 - Class10.anInt349) / 2;
	    else if (aBooleanArray3056[97])
		Class10.anInt349 += (24 - Class10.anInt349) / 2;
	    else
		Class10.anInt349 /= 2;
	    if (aBooleanArray3056[98])
		Class60.anInt1415 += (12 + -Class60.anInt1415) / 2;
	    else if (aBooleanArray3056[99])
		Class60.anInt1415 += (-12 - Class60.anInt1415) / 2;
	    else
		Class60.anInt1415 /= 2;
	    int i_1_ = Class34.anInt849 >> 736593415;
	    Class58.anInt1373
		= Class10.anInt349 / 2 + Class58.anInt1373 & 0x7ff;
	    int i_2_ = Class40_Sub5_Sub6.anInt2437 >> -470684185;
	    Class65.anInt1537 += Class60.anInt1415 / 2;
	    int i_3_ = 0;
	    if ((Class65.anInt1537 ^ 0xffffffff) > -129)
		Class65.anInt1537 = 128;
	    if (Class65.anInt1537 > 383)
		Class65.anInt1537 = 383;
	    int i_4_
		= Class37.method430((byte) -124,
				    Player.anInt3267,
				    Class40_Sub5_Sub6.anInt2437,
				    Class34.anInt849);
	    if (i_2_ > 3 && (i_1_ ^ 0xffffffff) < -4
		&& (i_2_ ^ 0xffffffff) > -101 && (i_1_ ^ 0xffffffff) > -101) {
		for (int i_5_ = -4 + i_2_;
		     (i_5_ ^ 0xffffffff) >= (4 + i_2_ ^ 0xffffffff); i_5_++) {
		    for (int i_6_ = -4 + i_1_; 4 + i_1_ >= i_6_; i_6_++) {
			int i_7_ = Player.anInt3267;
			if ((i_7_ ^ 0xffffffff) > -4
			    && (0x2 & (Floor
				       .aByteArrayArrayArray2323[1][i_5_]
				       [i_6_])
				^ 0xffffffff) == -3)
			    i_7_++;
			int i_8_
			    = i_4_ + -(Class40_Sub6.anIntArrayArrayArray2099
				       [i_7_][i_5_][i_6_]);
			if ((i_8_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
			    i_3_ = i_8_;
		    }
		}
	    }
	    int i_9_ = i_3_ * 192;
	    if ((i_9_ ^ 0xffffffff) < -98049)
		i_9_ = 98048;
	    if ((i_9_ ^ 0xffffffff) > -32769)
		i_9_ = 32768;
	    if ((Class40_Sub6.anInt2107 ^ 0xffffffff) <= (i_9_ ^ 0xffffffff)) {
		if (Class40_Sub6.anInt2107 > i_9_)
		    Class40_Sub6.anInt2107
			+= (-Class40_Sub6.anInt2107 + i_9_) / 80;
	    } else
		Class40_Sub6.anInt2107
		    += (-Class40_Sub6.anInt2107 + i_9_) / 24;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "je.D(" + arg0 + ')');
	}
    }
    
    public Model method756(int arg0) {
	try {
	    anInt3052++;
	    int i = 58 % ((41 - arg0) / 47);
	    return Class44.method897(anInt3067, 10).method753(true, anInt3058,
							      26910);
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "je.UA(" + arg0 + ')');
	}
    }
    
    public static void method776(byte arg0) {
	anInt3053++;
	if (arg0 > -79)
	    method779(null, false, null, null);
	if (Class27.anInt658 == 0) {
	    if ((Class62.anInt1470 ^ 0xffffffff) == -2) {
		int i = -575 + Class57.anInt1338;
		int i_10_ = -5 + (RSString.anInt1668 - 4);
		if ((i ^ 0xffffffff) <= -1 && (i_10_ ^ 0xffffffff) <= -1
		    && i < 146 && i_10_ < 151) {
		    i_10_ -= 75;
		    i -= 73;
		    int i_11_ = 0x7ff & Class43.anInt1020 + Class58.anInt1373;
		    int i_12_ = R3D.sinetable[i_11_];
		    int i_13_ = R3D.cosinetable[i_11_];
		    i_13_ = (Class51.anInt1187 + 256) * i_13_ >> 1818182472;
		    i_12_ = (Class51.anInt1187 + 256) * i_12_ >> -413658424;
		    int i_14_ = i_10_ * i_12_ - -(i * i_13_) >> 843700395;
		    int i_15_ = i_13_ * i_10_ - i * i_12_ >> -1318258005;
		    int i_16_ = ((Class40_Sub5_Sub13
				  .aClass40_Sub5_Sub17_Sub4_Sub1_2760
				  .anInt3098) - -i_14_
				 >> -2121665369);
		    int i_17_ = (-i_15_ + (Class40_Sub5_Sub13
					   .aClass40_Sub5_Sub17_Sub4_Sub1_2760
					   .anInt3089)
				 >> -208961177);
		    boolean bool = (Class38_Sub1.method448
				    (0, 0,
				     (Class40_Sub5_Sub13
				      .aClass40_Sub5_Sub17_Sub4_Sub1_2760
				      .anIntArray3088[0]),
				     i_16_, (byte) 125, 0, true, 0, 0,
				     (Class40_Sub5_Sub13
				      .aClass40_Sub5_Sub17_Sub4_Sub1_2760
				      .anIntArray3135[0]),
				     i_17_, 1));
		    if (bool) {
			Class32.packetBuffer.put(i,
								 (byte) -128);
			Class32.packetBuffer.put(i_10_,
								 (byte) -128);
			Class32.packetBuffer
			    .method474(Class58.anInt1373, -126);
			Class32.packetBuffer.put(57,
								 (byte) -128);
			Class32.packetBuffer
			    .put(Class43.anInt1020, (byte) -128);
			Class32.packetBuffer
			    .put(Class51.anInt1187, (byte) -128);
			Class32.packetBuffer.put(89,
								 (byte) -128);
			Class32.packetBuffer.method474
			    ((Class40_Sub5_Sub13
			      .aClass40_Sub5_Sub17_Sub4_Sub1_2760.anInt3098),
			     120);
			Class32.packetBuffer.method474
			    ((Class40_Sub5_Sub13
			      .aClass40_Sub5_Sub17_Sub4_Sub1_2760.anInt3089),
			     -125);
			Class32.packetBuffer.put
			    (Class40_Sub5_Sub15.anInt2778, (byte) -128);
			Class32.packetBuffer.put(63,
								 (byte) -128);
		    }
		}
	    }
	}
    }
    
    public static RSString method777(int arg0, int arg1) {
	try {
	    anInt3070++;
	    RSString class1 = new RSString();
	    class1.aByteArray1692 = new byte[arg1];
	    if (arg0 != -18596)
		anInt3065 = 36;
	    class1.anInt1680 = 0;
	    return class1;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   "je.A(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method778(boolean arg0, Class66 arg1) {
	Class40_Sub5_Sub10.aClass66_2590 = arg1;
	anInt3063++;
	if (arg0 != true)
	    method775(true);
    }
    
    public static void method779(Component arg0, boolean arg1, Class6 arg2,
				 Class6 arg3) {
	try {
	    anInt3057++;
	    if (!ISAAC.aBoolean512) {
		Class8.aClass68_298
		    = Class40_Sub5_Sub13.method649(265, 128, arg0, -4875);
		Rasterizer.method663();
		Class40_Sub5_Sub17_Sub2.aClass68_3042
		    = Class40_Sub5_Sub13.method649(265, 128, arg0, -4875);
		Rasterizer.method663();
		Class39.aClass68_907
		    = Class40_Sub5_Sub13.method649(171, 509, arg0, -4875);
		Rasterizer.method663();
		Class51.aClass68_1206
		    = Class40_Sub5_Sub13.method649(132, 360, arg0, -4875);
		Rasterizer.method663();
		Class38.aClass68_887
		    = Class40_Sub5_Sub13.method649(200, 360, arg0, -4875);
		Rasterizer.method663();
		Class17.aClass68_463
		    = Class40_Sub5_Sub13.method649(238, 202, arg0, -4875);
		Rasterizer.method663();
		Class54.aClass68_1285
		    = Class40_Sub5_Sub13.method649(238, 203, arg0, -4875);
		Rasterizer.method663();
		Class40_Sub5_Sub8.aClass68_2524
		    = Class40_Sub5_Sub13.method649(94, 74, arg0, -4875);
		Rasterizer.method663();
		Class68.aClass68_1631
		    = Class40_Sub5_Sub13.method649(94, 75, arg0, -4875);
		Rasterizer.method663();
		byte[] is = arg2.method170(Class22_Sub2.aClass1_1886,
					   Class32.aClass1_772, 1);
		DirectColorSprite class40_sub5_sub14_sub4
		    = new DirectColorSprite(is, arg0);
		Class8.aClass68_298.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(0, 0);
		Class40_Sub5_Sub17_Sub2.aClass68_3042.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-637, 0);
		Class39.aClass68_907.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-128, 0);
		Class51.aClass68_1206.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-202, -371);
		Class38.aClass68_887.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-202, -171);
		Class17.aClass68_463.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(0, -265);
		Class54.aClass68_1285.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-562, -265);
		Class40_Sub5_Sub8.aClass68_2524.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-128, -171);
		Class68.aClass68_1631.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-562, -171);
		int[] is_18_ = new int[class40_sub5_sub14_sub4.anInt2951];
		for (int i = 0; i < class40_sub5_sub14_sub4.anInt2950; i++) {
		    for (int i_19_ = 0;
			 ((i_19_ ^ 0xffffffff)
			  > (class40_sub5_sub14_sub4.anInt2951 ^ 0xffffffff));
			 i_19_++)
			is_18_[i_19_]
			    = (class40_sub5_sub14_sub4.anIntArray2955
			       [(i * class40_sub5_sub14_sub4.anInt2951
				 + class40_sub5_sub14_sub4.anInt2951 + -i_19_
				 - 1)]);
		    for (int i_20_ = 0;
			 ((i_20_ ^ 0xffffffff)
			  > (class40_sub5_sub14_sub4.anInt2951 ^ 0xffffffff));
			 i_20_++)
			class40_sub5_sub14_sub4.anIntArray2955
			    [i_20_ + class40_sub5_sub14_sub4.anInt2951 * i]
			    = is_18_[i_20_];
		}
		Class8.aClass68_298.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(382, 0);
		Class40_Sub5_Sub17_Sub2.aClass68_3042.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-255, 0);
		Class39.aClass68_907.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(254, 0);
		Class51.aClass68_1206.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(180, -371);
		Class38.aClass68_887.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(180, -171);
		Class17.aClass68_463.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(382, -265);
		Class54.aClass68_1285.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-180, -265);
		Class40_Sub5_Sub8.aClass68_2524.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(254, -171);
		Class68.aClass68_1631.method1046((byte) 90);
		class40_sub5_sub14_sub4.method727(-180, -171);
		class40_sub5_sub14_sub4
		    = Class66.method1028(arg3, Main.aClass1_1762, (byte) 21,
					 Class22_Sub2.aClass1_1886);
		Class39.aClass68_907.method1046((byte) 90);
		class40_sub5_sub14_sub4.method721
		    (-128 + (382 + -(class40_sub5_sub14_sub4.anInt2951 / 2)),
		     18);
		Class40_Sub5_Sub15.aClass40_Sub5_Sub14_Sub2_2775
		    = Class27.method359(Class40_Sub5_Sub7.aClass1_2488,
					Class22_Sub2.aClass1_1886, arg3,
					(byte) -64);
		Class59.aClass40_Sub5_Sub14_Sub2_1387
		    = Class27.method359(ISAAC.aClass1_506,
					Class22_Sub2.aClass1_1886, arg3,
					(byte) -64);
		Class22.aClass40_Sub5_Sub14_Sub2Array535
		    = Class40_Sub5_Sub2.method550(arg3, (byte) -114,
						  Class8.aClass1_299,
						  Class22_Sub2.aClass1_1886);
		Class39.aClass40_Sub5_Sub14_Sub4_918
		    = new DirectColorSprite(128, 265);
		Class40_Sub4.aClass40_Sub5_Sub14_Sub4_2043
		    = new DirectColorSprite(128, 265);
		for (int i = 0; i < 33920; i++)
		    Class39.aClass40_Sub5_Sub14_Sub4_918.anIntArray2955[i]
			= Class8.aClass68_298.anIntArray1621[i];
		for (int i = 0; (i ^ 0xffffffff) > -33921; i++)
		    Class40_Sub4.aClass40_Sub5_Sub14_Sub4_2043
			.anIntArray2955[i]
			= (Class40_Sub5_Sub17_Sub2.aClass68_3042.anIntArray1621
			   [i]);
		Class51.anIntArray1198 = new int[256];
		for (int i = 0; i < 64; i++)
		    Class51.anIntArray1198[i] = i * 262144;
		for (int i = 0; i < 64; i++)
		    Class51.anIntArray1198[64 + i] = 1024 * i + 16711680;
		for (int i = 0; i < 64; i++)
		    Class51.anIntArray1198[128 + i] = 16776960 - -(i * 4);
		for (int i = 0; (i ^ 0xffffffff) > -65; i++)
		    Class51.anIntArray1198[i + 192] = 16777215;
		Class40_Sub5_Sub17.anIntArray2865 = new int[256];
		for (int i = 0; (i ^ 0xffffffff) > -65; i++)
		    Class40_Sub5_Sub17.anIntArray2865[i] = i * 1024;
		for (int i = 0; (i ^ 0xffffffff) > -65; i++)
		    Class40_Sub5_Sub17.anIntArray2865[i + 64] = 4 * i + 65280;
		for (int i = 0; i < 64; i++)
		    Class40_Sub5_Sub17.anIntArray2865[128 + i]
			= i * 262144 + 65535;
		if (arg1 != true)
		    method779(null, false, null, null);
		for (int i = 0; i < 64; i++)
		    Class40_Sub5_Sub17.anIntArray2865[i - -192] = 16777215;
		Class40_Sub5_Sub17_Sub6.anIntArray3248 = new int[256];
		for (int i = 0; (i ^ 0xffffffff) > -65; i++)
		    Class40_Sub5_Sub17_Sub6.anIntArray3248[i] = i * 4;
		for (int i = 0; (i ^ 0xffffffff) > -65; i++)
		    Class40_Sub5_Sub17_Sub6.anIntArray3248[64 + i]
			= 255 - -(i * 262144);
		for (int i = 0; i < 64; i++)
		    Class40_Sub5_Sub17_Sub6.anIntArray3248[128 + i]
			= i * 1024 + 16711935;
		for (int i = 0; (i ^ 0xffffffff) > -65; i++)
		    Class40_Sub5_Sub17_Sub6.anIntArray3248[192 + i] = 16777215;
		Class42.anIntArray1013 = new int[256];
		Class61.anIntArray1445 = new int[32768];
		Landscape.anIntArray1168 = new int[32768];
		Class40_Sub13.method879(-4487, null);
		Class40_Sub5_Sub17_Sub6.anIntArray3255 = new int[32768];
		Class22_Sub2.password = Class22_Sub2.aClass1_1886;
		Class22_Sub2.username = Class22_Sub2.aClass1_1886;
		Class4.anIntArray178 = new int[32768];
		Class26.anInt622 = 0;
		if (RSCanvas.anInt60 != 0 && !Class46.aBoolean1112)
		    Class33.method412(false, Class55.aClass6_Sub1_1286, 0,
				      (byte) 66, Class30.aClass1_716, 10,
				      Class22_Sub2.aClass1_1886,
				      RSCanvas.anInt60);
		else
		    Class33.method405(16969, 10);
		RSApplet.method19(false, 24041);
		Class40_Sub5_Sub11.aBoolean2631 = true;
		ISAAC.aBoolean512 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("je.F(" + (arg0 != null ? "{...}" : "null")
				    + ',' + arg1 + ','
				    + (arg2 != null ? "{...}" : "null") + ','
				    + (arg3 != null ? "{...}" : "null")
				    + ')'));
	}
    }
    
    public static void method780(int arg0) {
	try {
	    if (arg0 != 24399)
		method779(null, false, null, null);
	    aBooleanArray3056 = null;
	    aClass1_3054 = null;
	    aClass1_3050 = null;
	    aClass1_3059 = null;
	    aClass1_3069 = null;
	    aClass1_3062 = null;
	    aClass1_3066 = null;
	    aClass1_3068 = null;
	    anIntArray3051 = null;
	    aClass1_3055 = null;
	    aClass1_3049 = null;
	    aClass1_3071 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "je.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass1_3054 = Class58.method978(-11538, "Members object");
	aClass1_3059
	    = Class58.method978(-11538,
				"Too many connections from your address)3");
	anInt3060 = 0;
	aClass1_3050 = aClass1_3059;
	anInt3065 = -1;
	aClass1_3062
	    = Class58.method978(-11538,
				"Lade Eingabe)2Steuerungsprogramm)3)3)3");
	aClass1_3068 = Class58.method978(-11538, " )2> @whi@");
	aClass1_3066 = aClass1_3049;
	aClass1_3069 = aClass1_3054;
	aClass1_3071
	    = Class58.method978(-11538, "Wen m-Ochten Sie hinzuf-Ugen?");
    }
}