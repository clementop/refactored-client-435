package com.jagex.runescape.cache.def;

import com.jagex.runescape.*;
import com.jagex.runescape.cache.CacheIndex;
import com.jagex.runescape.cache.CacheIndex_Sub1;
import com.jagex.runescape.cache.media.ImageRGB;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.language.English;
import com.jagex.runescape.media.renderable.Item;
import com.jagex.runescape.media.renderable.actor.Actor;
import com.jagex.runescape.media.renderable.actor.Player;
import com.jagex.runescape.net.ISAAC;
import com.jagex.runescape.scene.SceneCluster;
import com.jagex.runescape.scene.tile.WallDecoration;
import com.jagex.runescape.util.TextUtils;

public class UnderlayDefinition extends SubNode {
    public static int openSecondaryWidgetId = -1;
    public static ImageRGB[] aClass40_Sub5_Sub14_Sub4Array2567;
    public static CacheIndex_Sub1 aClass6_Sub1_2571;
    public static int anInt2576;
    public static int anInt2581;
    public static CacheIndex aCacheIndex_2582;

    public int saturation;
    public int anInt2565;
    public int hueMultiplier;
    public int hue;
    public int color = 0;

    public static int method614(int arg1, int arg2, int arg3) {
        int i_7_ = 256 + -arg3;
        return (arg3 * (0xff00 & arg2) + i_7_ * (0xff00 & arg1) & 0xff0000) + (~0xff00ff & (0xff00ff & arg1) * i_7_ + arg3 * (0xff00ff & arg2)) >> 8;
    }

    public static void method616(CacheIndex arg0) {
        Actor.aCacheIndex_3150 = arg0;
    }

    public static void addFriend(long name) {
        if(name != 0L) {
            if(Item.friendsCount >= 100 && Class44.anInt1049 != 1 || Item.friendsCount >= 200) {
                Class44.addChatMessage("", English.friendsListIsFull, 0);
            } else {
                String username = TextUtils.formatName(TextUtils.longToName(name));
                for(int i = 0; Item.friendsCount > i; i++) {
                    if(Class59.friends[i] == name) {
                        Class44.addChatMessage("", username + English.isAlreadyOnYourFriendList, 0);
                        return;
                    }
                }
                for(int i = 0; Class42.anInt1008 > i; i++) {
                    if(WallDecoration.ignores[i] == name) {
                        Class44.addChatMessage("", English.pleaseRemove + username + English.suffixFromYourIgnoreListFirst, 0);
                        return;
                    }
                }
                if(!username.equals(Player.localPlayer.playerName)) {
                    Class40_Sub11.friendUsernames[Item.friendsCount] = username;
                    Class59.friends[Item.friendsCount] = name;
                    Class40_Sub7.friendWorlds[Item.friendsCount] = 0;
                    Item.friendsCount++;
                    ISAAC.redrawTabArea = true;
                    SceneCluster.packetBuffer.putPacket(114);
                    SceneCluster.packetBuffer.putLongBE(name);
                }
            }
        }
    }

    public static int bitWiseOR(int arg0, int arg1) {
        return arg0 | arg1;
    }



    public void calculateHsl() {
        double r = (double) (color >> 16 & 0xff) / 256.0;
        double g = (double) (color & 0xff) / 256.0;
        double b = (double) ((color & 0xff68) >> 8) / 256.0;
        double cmin = r;
        if(cmin > b) {
            cmin = b;
        }
        if(g < cmin) {
            cmin = g;
        }
        double cmax = r;
        if(cmax < b) {
            cmax = b;
        }
        double d_4_ = 0.0;
        if(cmax < g) {
            cmax = g;
        }
        double d_5_ = (cmax + cmin) / 2.0;
        saturation = (int) (d_5_ * 256.0);
        double d_6_ = 0.0;
        if(cmax != cmin) {
            if(d_5_ < 0.5) {
                d_6_ = (cmax - cmin) / (cmax + cmin);
            }
            if(d_5_ >= 0.5) {
                d_6_ = (-cmin + cmax) / (-cmin + (-cmax + 2.0));
            }
            if(r == cmax) {
                d_4_ = (-g + b) / (-cmin + cmax);
            } else if(cmax == b) {
                d_4_ = 2.0 + (g - r) / (cmax - cmin);
            } else if(cmax == g) {
                d_4_ = (r - b) / (-cmin + cmax) + 4.0;
            }
        }
        d_4_ /= 6.0;
        if(saturation >= 0) {
            if(saturation > 255) {
                saturation = 255;
            }
        } else {
            saturation = 0;
        }
        if(d_5_ > 0.5) {
            hueMultiplier = (int) ((-d_5_ + 1.0) * d_6_ * 512.0);
        } else {
            hueMultiplier = (int) (d_5_ * d_6_ * 512.0);
        }
        hue = (int) (256.0 * d_6_);
        if(hueMultiplier < 1) {
            hueMultiplier = 1;
        }
        anInt2565 = (int) (d_4_ * (double) hueMultiplier);
        if(hue >= 0) {
            if(hue > 255) {
                hue = 255;
            }
        } else {
            hue = 0;
        }
    }


    public void readValues(Buffer buffer) {
        while(true) {
            int opcode = buffer.getUnsignedByte();
            if(opcode == 0) {
                break;
            }
            readValue(buffer, opcode);
        }
    }

    public void readValue(Buffer buffer, int opcode) {
        if(opcode == 1) {
            color = buffer.getMediumBE();
        }
    }
}
