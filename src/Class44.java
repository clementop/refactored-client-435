/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44 implements Runnable
{
    public static int anInt1029;
    public static int[][] anIntArrayArray1030;
    public static int anInt1031;
    public static RSString aClass1_1032;
    public static RSString aClass1_1033;
    public static RSString aClass1_1034;
    public static int modewhat;
    public static int anInt1036;
    public static int anInt1037;
    public static RSString aClass1_1038;
    public static byte[][] aByteArrayArray1039 = new byte[250][];
    public static int anInt1040;
    public static RSString aClass1_1041;
    public static int modewhere = 0;
    public static RSString aClass1_1043;
    public static int anInt1044;
    public static int anInt1045;
    public static int anInt1046;
    public static IndexedColorSprite aClass40_Sub5_Sub14_Sub2_1047;
    public static int anInt1048;
    public static int anInt1049;
    public static int anInt1050;
    
    public static void method895(int arg0, int arg1, RSString arg2,
				 RSString arg3) {
	try {
	    anInt1029++;
	    if (Class43.anInt1028 == -1)
		Class52.aBoolean1221 = true;
	    if (arg1 == 0 && (Class48.anInt1138 ^ 0xffffffff) != 0) {
		Class62.anInt1470 = 0;
		RSApplet.aClass1_8 = arg2;
	    }
	    for (int i = 99; (i ^ 0xffffffff) < -1; i--) {
		Class66.anIntArray1569[i] = Class66.anIntArray1569[i + -1];
		Class40_Sub5_Sub17.aClass1Array2856[i]
		    = Class40_Sub5_Sub17.aClass1Array2856[-1 + i];
		Class40_Sub5_Sub17_Sub4.aClass1Array3160[i]
		    = Class40_Sub5_Sub17_Sub4.aClass1Array3160[-1 + i];
	    }
	    Class66.anIntArray1569[0] = arg1;
	    Class40_Sub5_Sub17.aClass1Array2856[0] = arg3;
	    if (arg0 >= 60)
		Class40_Sub5_Sub17_Sub4.aClass1Array3160[0] = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("oe.B(" + arg0 + ',' + arg1 + ','
				    + (arg2 != null ? "{...}" : "null") + ','
				    + (arg3 != null ? "{...}" : "null")
				    + ')'));
	}
    }
    
    public void run() {
	try {
	    anInt1031++;
	    try {
		for (;;) {
		    Class40_Sub6 class40_sub6;
		    synchronized (RSCanvas.aClass45_53) {
			class40_sub6
			    = ((Class40_Sub6)
			       RSCanvas.aClass45_53.method902((byte) -90));
		    }
		    if (class40_sub6 == null) {
			Class43.method890(100L, 113);
			synchronized (Class3.anObject162) {
			    if ((Buffer.anInt1987 ^ 0xffffffff) >= -2) {
				Buffer.anInt1987 = 0;
				Class3.anObject162.notifyAll();
				break;
			    }
			    Buffer.anInt1987--;
			}
		    } else {
			if ((class40_sub6.anInt2112 ^ 0xffffffff) != -1) {
			    if (class40_sub6.anInt2112 == 1) {
				class40_sub6.aByteArray2102
				    = (class40_sub6.aClass56_2117.method969
				       ((int) class40_sub6.key,
					(byte) -111));
				synchronized (RSCanvas.aClass45_53) {
				    Class40_Sub5_Sub10.aClass45_2604
					.method904(class40_sub6, 115);
				}
			    }
			} else {
			    class40_sub6.aClass56_2117.method971
				(class40_sub6.aByteArray2102, 1862596560,
				 class40_sub6.aByteArray2102.length,
				 (int) class40_sub6.key);
			    synchronized (RSCanvas.aClass45_53) {
				class40_sub6.method457(-1);
			    }
			}
			synchronized (Class3.anObject162) {
			    if ((Buffer.anInt1987 ^ 0xffffffff) >= -2) {
				Buffer.anInt1987 = 0;
				Class3.anObject162.notifyAll();
				break;
			    }
			    Buffer.anInt1987 = 600;
			}
		    }
		}
	    } catch (Exception exception) {
		Class6.method169(null, (byte) -127, exception);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "oe.run(" + ')');
	}
    }
    
    public static void method896(int arg0) {
	try {
	    aClass1_1034 = null;
	    aClass40_Sub5_Sub14_Sub2_1047 = null;
	    aClass1_1033 = null;
	    aByteArrayArray1039 = null;
	    if (arg0 == -1) {
		aClass1_1041 = null;
		aClass1_1032 = null;
		aClass1_1038 = null;
		anIntArrayArray1030 = null;
		aClass1_1043 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "oe.A(" + arg0 + ')');
	}
    }
    
    public static ItemDefinition method897(int arg0, int arg1) {
	try {
	    anInt1046++;
	    ItemDefinition class40_sub5_sub16
		= ((ItemDefinition)
		   ISAAC.aClass9_516.method231((long) arg0, (byte) 100));
	    if (class40_sub5_sub16 != null)
		return class40_sub5_sub16;
	    byte[] is = Class26.aClass6_632.method172(arg0, 112, arg1);
	    class40_sub5_sub16 = new ItemDefinition();
	    class40_sub5_sub16.anInt2852 = arg0;
	    if (is != null)
		class40_sub5_sub16.readValues(new Buffer(is), -1);
	    class40_sub5_sub16.method741(29216);
	    if ((class40_sub5_sub16.anInt2807 ^ 0xffffffff) != 0)
		class40_sub5_sub16.itemToNote
		    (method897(class40_sub5_sub16.anInt2807, 10), method897(class40_sub5_sub16.anInt2812, 10));
	    if (!Class40_Sub5_Sub10.aBoolean2617
		&& class40_sub5_sub16.aBoolean2849) {
		class40_sub5_sub16.options = null;
		class40_sub5_sub16.anInt2823 = 0;
		class40_sub5_sub16.groundOptions = null;
		class40_sub5_sub16.aClass1_2796
		    = Class40_Sub5_Sub17_Sub3.aClass1_3069;
	    }
	    ISAAC.aClass9_516.method230(arg1 + -7218, (long) arg0,
					  class40_sub5_sub16);
	    return class40_sub5_sub16;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   "oe.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method898(int arg0, Class40_Sub5_Sub17_Sub4 arg1) {
	anInt1037++;
	arg1.anInt3077 = arg1.anInt3126;
	if ((arg1.anInt3109 ^ 0xffffffff) == -1)
	    arg1.anInt3074 = 0;
	else {
	    if ((arg1.anInt3141 ^ 0xffffffff) != 0 && arg1.anInt3122 == 0) {
		Class40_Sub5_Sub7 class40_sub5_sub7
		    = Class68_Sub1.method1050(arg1.anInt3141, 2);
		if ((arg1.anInt3094 ^ 0xffffffff) < -1
		    && class40_sub5_sub7.anInt2470 == 0) {
		    arg1.anInt3074++;
		    return;
		}
		if (arg1.anInt3094 <= 0
		    && (class40_sub5_sub7.anInt2476 ^ 0xffffffff) == -1) {
		    arg1.anInt3074++;
		    return;
		}
	    }
	    int i = arg1.anInt3098;
	    int i_0_ = (arg1.anIntArray3088[-1 + arg1.anInt3109] * 128
			- -(64 * arg1.anInt3096));
	    int i_1_ = arg1.anInt3089;
	    int i_2_ = (64 * arg1.anInt3096
			+ arg1.anIntArray3135[arg1.anInt3109 + -1] * 128);
	    if (-i + i_0_ > 256 || (-i + i_0_ ^ 0xffffffff) > 255
		|| -i_1_ + i_2_ > 256 || i_2_ + -i_1_ < -256) {
		arg1.anInt3098 = i_0_;
		arg1.anInt3089 = i_2_;
	    } else {
		if ((i ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
		    if ((i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
			arg1.anInt3080 = 1280;
		    else if (i_2_ < i_1_)
			arg1.anInt3080 = 1792;
		    else
			arg1.anInt3080 = 1536;
		} else if ((i ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) {
		    if ((i_2_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)) {
			if (i_2_ < i_1_)
			    arg1.anInt3080 = 0;
		    } else
			arg1.anInt3080 = 1024;
		} else if ((i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
		    arg1.anInt3080 = 768;
		else if ((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
		    arg1.anInt3080 = 256;
		else
		    arg1.anInt3080 = 512;
		int i_3_ = arg1.anInt3079;
		int i_4_ = 4;
		if (arg1.anInt3080 != arg1.anInt3118
		    && (arg1.anInt3137 ^ 0xffffffff) == 0
		    && arg1.anInt3113 != 0)
		    i_4_ = 2;
		if (arg1.anInt3109 > 2)
		    i_4_ = 6;
		if (arg1.anInt3109 > 3)
		    i_4_ = 8;
		int i_5_ = 0x7ff & -arg1.anInt3118 + arg1.anInt3080;
		if (i_5_ > 1024)
		    i_5_ -= 2048;
		if ((i_5_ ^ 0xffffffff) > arg0 || (i_5_ ^ 0xffffffff) < -257) {
		    if (i_5_ < 256 || i_5_ >= 768) {
			if ((i_5_ ^ 0xffffffff) <= 767
			    && (i_5_ ^ 0xffffffff) >= 255)
			    i_3_ = arg1.anInt3075;
		    } else
			i_3_ = arg1.anInt3132;
		} else
		    i_3_ = arg1.anInt3131;
		if (i_3_ == -1)
		    i_3_ = arg1.anInt3131;
		arg1.anInt3077 = i_3_;
		if ((arg1.anInt3074 ^ 0xffffffff) < -1
		    && (arg1.anInt3109 ^ 0xffffffff) < -2) {
		    arg1.anInt3074--;
		    i_4_ = 8;
		}
		if (arg1.aBooleanArray3072[-1 + arg1.anInt3109])
		    i_4_ <<= 1;
		if ((i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
		    arg1.anInt3089 += i_4_;
		    if (arg1.anInt3089 > i_2_)
			arg1.anInt3089 = i_2_;
		} else if (i_1_ > i_2_) {
		    arg1.anInt3089 -= i_4_;
		    if ((arg1.anInt3089 ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
			arg1.anInt3089 = i_2_;
		}
		if ((i_4_ ^ 0xffffffff) <= -9
		    && (arg1.anInt3131 ^ 0xffffffff) == (arg1.anInt3077
							 ^ 0xffffffff)
		    && arg1.anInt3082 != -1)
		    arg1.anInt3077 = arg1.anInt3082;
		if (i < i_0_) {
		    arg1.anInt3098 += i_4_;
		    if ((i_0_ ^ 0xffffffff) > (arg1.anInt3098 ^ 0xffffffff))
			arg1.anInt3098 = i_0_;
		} else if (i_0_ < i) {
		    arg1.anInt3098 -= i_4_;
		    if (i_0_ > arg1.anInt3098)
			arg1.anInt3098 = i_0_;
		}
		if (arg1.anInt3098 == i_0_ && i_2_ == arg1.anInt3089) {
		    if ((arg1.anInt3094 ^ 0xffffffff) < -1)
			arg1.anInt3094--;
		    arg1.anInt3109--;
		}
	    }
	}
    }
    
    static {
	anInt1040 = 256;
	aClass1_1034 = Class58.method978(-11538, "System)2Update in: ");
	aClass1_1041 = Class58.method978(-11538, "(U");
	modewhat = 0;
	anInt1049 = 0;
	aClass1_1043 = Class58.method978(-11538, "null");
	aClass1_1033 = Class58.method978(-11538, "Please remove ");
	aClass1_1032 = aClass1_1033;
	aClass1_1038 = aClass1_1033;
	anInt1048 = -1;
    }
}