package com.pablo67340.guishop.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Bryce
 */
public final class MatLib {

    @Getter
    private static final Map<String, MatLibEntry> MAP = new HashMap<>();

    static {
    	putEntry("PURPLE_STAINED_GLASS", "95:10");
    	putEntry("BLUE_STAINED_GLASS", "95:11");
    	putEntry("BROWN_STAINED_GLASS", "95:12");
    	putEntry("BROWN_MUSHROOM", "39:0");
    	putEntry("CHAINMAIL_LEGGINGS", "304:0");
    	putEntry("LAVA_BUCKET", "327:0");
    	putEntry("COMPARATOR", "150:0");
    	putEntry("ACACIA_DOOR", "196:0");
    	putEntry("CAULDRON", "380:0");
    	putEntry("COAL_ORE", "16:0");
    	putEntry("COAL_BLOCK", "173:0");
    	putEntry("CAKE", "92:0");
    	putEntry("OBSERVER", "218:0");
    	putEntry("WOODEN_AXE", "271:0");
    	putEntry("GOLDEN_HOE", "294:0");
    	putEntry("WHITE_BANNER", "425:0");
    	putEntry("MUSIC_DISK_11", "2266:0");
    	putEntry("DARK_OAK_BOAT", "448:0");
    	putEntry("FIREWORK_STAR", "402:0");
    	putEntry("BRICK_STAIRS", "108:0");
    	putEntry("DARK_OAK_LEAVES", "161:1");
    	putEntry("ACACIA_LEAVES", "161:0");
    	putEntry("PAPER", "339:0");
    	putEntry("GOLDEN_LEGGINGS", "316:0");
    	putEntry("POTATO", "392:0");
    	putEntry("POWERED_RAIL", "27:0");
    	putEntry("BIRCH_FENCE_GATE", "184:0");
    	putEntry("SNOW_BLOCK", "80:0");
    	putEntry("PURPLE_SHULKER_BOX", "229:0");
    	putEntry("MUSHROOM_STEW", "282:0");
    	putEntry("END_STONE_BRICKS", "206:0");
    	putEntry("DRAGON_BREATH", "437:0");
    	putEntry("RABBIT_FOOT", "414:0");
    	putEntry("POPPY", "38:0");
    	putEntry("BLUE_ORCHID", "38:1");
    	putEntry("ALLIUM", "38:2");
    	putEntry("AZURE_BLUET", "38:3");
    	putEntry("RED_TULIP", "38:4");
    	putEntry("WHITE_SHULKER_BOX", "219:0");
    	putEntry("DAYLIGHT_DETECTOR", "151:0");
    	putEntry("PACKED_ICE", "174:0");
    	putEntry("DARK_OAK_DOOR", "197:0");
    	putEntry("MINECART", "328:0");
    	putEntry("ENDER_EYE", "381:0");
    	putEntry("CHAINMAIL_BOOTS", "305:0");
    	putEntry("IRON_ORE", "15:0");
    	putEntry("JACK_O_LANTERN", "91:0");
    	putEntry("STONE_SWORD", "272:0");
    	putEntry("MUSIC_DISK_WARD", "2265:0");
    	putEntry("END_CRYSTAL", "426:0");
    	putEntry("TOTEM_OF_UNDYING", "449:0");
    	putEntry("ENCHANTED_BOOK", "403:0");
    	putEntry("WHEAT_SEEDS", "295:0");
    	putEntry("OBSIDIAN", "49:0");
    	putEntry("ACACIA_WOOD", "162:0");
    	putEntry("JUNGLE_FENCE_GATE", "185:0");
    	putEntry("GOLDEN_BOOTS", "317:0");
    	putEntry("GHAST_TEAR", "370:0");
    	putEntry("BAKED_POTATO", "393:0");
    	putEntry("BED", "26:0");
    	putEntry("DARK_OAK_WOOD", "162:1");
    	putEntry("ORANGE_TULIP", "38:5");
    	putEntry("BEETROOT", "207:0");
    	putEntry("WHITE_TULIP", "38:6");
    	putEntry("STONE_BRICK_STAIRS", "109:0");
    	putEntry("GOLDEN_SWORD", "283:0");
    	putEntry("PINK_TULIP", "38:7");
    	putEntry("OXEYE_DAISY", "38:8");
    	putEntry("APPLE", "260:0");
    	putEntry("SPLASH_POTION", "438:0");
    	putEntry("GREEN_STAINED_GLASS", "95:13");
    	putEntry("RED_STAINED_GLASS", "95:14");
    	putEntry("RABBIT_HIDE", "415:0");
    	putEntry("BLACK_STAINED_GLASS", "95:15");
    	putEntry("DANDELION", "37:0");
    	putEntry("LARGE_FERN", "175:3");
    	putEntry("ROSE_BUSH", "175:4");
    	putEntry("PEONY", "175:5");
    	putEntry("SUNFLOWER", "175:0");
    	putEntry("LILAC", "175:1");
    	putEntry("IRON_HELMET", "306:0");
    	putEntry("TALL_GRASS", "175:2");
    	putEntry("END_ROD", "198:0");
    	putEntry("GLISTERING_MELON_SLICE", "382:0");
    	putEntry("GOLD_ORE", "14:0");
    	putEntry("REDSTONE_BLOCK", "152:0");
    	putEntry("SADDLE", "329:0");
    	putEntry("NETHER_PORTAL", "90:0");
    	putEntry("MUSIC_DISK_STRAD", "2264:0");
    	putEntry("BLACK_GLAZED_TERRACOTTA", "250:0");
    	putEntry("SPRUCE_DOOR", "427:0");
    	putEntry("COMPARATOR", "404:0");
    	putEntry("STONE_SHOVEL", "273:0");
    	putEntry("WHEAT", "296:0");
    	putEntry("MOSSY_COBBLESTONE", "48:0");
    	putEntry("SPECTRAL_ARROW", "439:0");
    	putEntry("GRASS_PATH", "208:0");
    	putEntry("FLOWER_POT", "140:0");
    	putEntry("DARK_OAK_FENCE_GATE", "186:0");
    	putEntry("GOLD_NUGGET", "371:0");
    	putEntry("POISONOUS_POTATO", "394:0");
    	putEntry("NOTE_BLOCK", "25:0");
    	putEntry("ACACIA_STAIRS", "163:0");
    	putEntry("FLINT", "318:0");
    	putEntry("BOW", "261:0");
    	putEntry("ARMOR_STAND", "416:0");
    	putEntry("GOLDEN_SHOVEL", "284:0");
    	putEntry("ELDER_GUARDIAN_SPAWN_EGG", "383:4");
    	putEntry("WITHER_SPAWN_EGG", "383:5");
    	putEntry("WHEAT", "59:0");
    	putEntry("STRAY_SPAWN_EGG", "383:6");
    	putEntry("MELON", "360:0");
    	putEntry("BIRCH_DOOR", "428:0");
    	putEntry("WHITE_BANNER", "176:0");
    	putEntry("CHORUS_PLANT", "199:0");
    	putEntry("ENDER_CHEST", "130:0");
    	putEntry("NETHER_QUARTZ_ORE", "153:0");
    	putEntry("GRAVEL", "13:0");
    	putEntry("PURPLE_WOOL", "35:10");
    	putEntry("LIME_CONCRETE", "251:5");
    	putEntry("YELLOW_CONCRETE", "251:4");
    	putEntry("GRAY_CONCRETE", "251:7");
    	putEntry("PINK_CONCRETE", "251:6");
    	putEntry("CYAN_CONCRETE", "251:9");
    	putEntry("LIGHT_GRAY_CONCRETE", "251:8");
    	putEntry("IRON_CHESTPLATE", "307:0");
    	putEntry("ENVOKER_SPAWN_EGG", "383:34");
    	putEntry("VEX_SPAWN_EGG", "383:35");
    	putEntry("BLACK_WOOL", "35:15");
    	putEntry("VINDICATOR_SPAWN_EGG", "383:36");
    	putEntry("RED_WOOL", "35:14");
    	putEntry("ORANGE_CONCRETE", "251:1");
    	putEntry("NETHER_BRICK", "405:0");
    	putEntry("GREEN_WOOL", "35:13");
    	putEntry("WHITE_CONCRETE", "251:0");
    	putEntry("BREAD", "297:0");
    	putEntry("BROWN_WOOL", "35:12");
    	putEntry("LIGHT_BLUE_CONCRETE", "251:3");
    	putEntry("DONKEY_SPAWN_EGG", "383:31");
    	putEntry("BLUE_WOOL", "35:11");
    	putEntry("MAGENTA_CONCRETE", "251:2");
    	putEntry("STONE_PICKAXE", "274:0");
    	putEntry("MULE_SPAWN_EGG", "383:32");
    	putEntry("MUSIC_DISK_STAL", "2263:0");
    	putEntry("BOOKSHELF", "47:0");
    	putEntry("IRON_HORSE_ARMOR", "417:0");
    	putEntry("ZOMBIE_VILLAGER_SPAWN_EGG", "383:27");
    	putEntry("END_GATEWAY", "209:0");
    	putEntry("SKELETON_HORSE_SPAWN_EGG", "383:28");
    	putEntry("ZOMBIE_HORSE_SPAWN_EGG", "383:29");
    	putEntry("ACACIA_FENCE_GATE", "187:0");
    	putEntry("NETHER_WART", "372:0");
    	putEntry("MAP", "395:0");
    	putEntry("SMOOTH_SANDSTONE", "24:2");
    	putEntry("CHISELED_SANDSTONE", "24:1");
    	putEntry("CARROTS", "141:0");
    	putEntry("DARK_OAK_STAIRS", "164:0");
    	putEntry("SANDSTONE", "24:0");
    	putEntry("PORKCHOP", "319:0");
    	putEntry("HUSK_SPAWN_EGG", "383:23");
    	putEntry("ARROW", "262:0");
    	putEntry("GOLDEN_PICKAXE", "285:0");
    	putEntry("SAND", "12:0");
    	putEntry("CRAFTING_TABLE", "58:0");
    	putEntry("MOSSY_COBBLESTONE_WALL", "139:1");
    	putEntry("BLAZE_ROD", "369:0");
    	putEntry("CAVE_SPIDER_SPAWN_EGG", "383:59");
    	putEntry("ENCHANTING_TABLE", "116:0");
    	putEntry("COBBLESTONE_WALL", "139:0");
    	putEntry("GRAY_WOOL", "35:7");
    	putEntry("PINK_WOOL", "35:6");
    	putEntry("LIME_WOOL", "35:5");
    	putEntry("YELLOW_WOOL", "35:4");
    	putEntry("LIGHT_BLUE_WOOL", "35:3");
    	putEntry("LEATHER_LEGGINGS", "300:0");
    	putEntry("SIGN", "323:0");
    	putEntry("FISHING_ROD", "346:0");
    	putEntry("MAGENTA_WOOL", "35:2");
    	putEntry("ACACIA_FENCE", "192:0");
    	putEntry("ORANGE_WOOL", "35:1");
    	putEntry("RED_SAND", "12:1");
    	putEntry("WHITE_WOOL", "35:0");
    	putEntry("RED_SANDSTONE_STAIRS", "180:0");
    	putEntry("CREEPER_SPAWN_EGG", "383:50");
    	putEntry("MAGENTA_GLAZED_TERRACOTTA", "237:0");
    	putEntry("SLIME_SPAWN_EGG", "383:55");
    	putEntry("GHAST_SPAWN_EGG", "383:56");
    	putEntry("ZOMBIE_PIGMAN_SPAWN_EGG", "383:57");
    	putEntry("ENDERMAN_SPAWN_EGG", "383:58");
    	putEntry("NETHER_WART_BLOCK", "214:0");
    	putEntry("SKELETON_SPAWN_EGG", "383:51");
    	putEntry("SPIDER_SPAWN_EGG", "383:52");
    	putEntry("NAME_TAG", "421:0");
    	putEntry("MUSIC_DISK_MELLOHI", "2262:0");
    	putEntry("ZOMBIE_SPAWN_EGG", "383:54");
    	putEntry("SPRUCE_BOAT", "444:0");
    	putEntry("DISPENSER", "23:0");
    	putEntry("TNT", "46:0");
    	putEntry("LEVER", "69:0");
    	putEntry("PUMPKIN_STEM", "104:0");
    	putEntry("COCOA", "127:0");
    	putEntry("MAP", "358:0");
    	putEntry("MILK_BUCKET", "335:0");
    	putEntry("WATER", "9:0");
    	putEntry("DIAMOND_LEGGINGS", "312:0");
    	putEntry("DARK_OAK_FENCE", "191:0");
    	putEntry("PINK_SHULKER_BOX", "225:0");
    	putEntry("GREEN_GLAZED_TERRACOTTA", "248:0");
    	putEntry("CYAN_WOOL", "35:9");
    	putEntry("LIGHT_GRAY_WOOL", "35:8");
    	putEntry("PRISMARINE_CRYSTALS", "410:0");
    	putEntry("PURPUR_PILLAR", "202:0");
    	putEntry("POPPED_CHORUS_FRUIT", "433:0");
    	putEntry("PISTON_HEAD", "34:0");
    	putEntry("DIAMOND_BLOCK", "57:0");
    	putEntry("LAVA", "11:0");
    	putEntry("BREWING_STAND", "117:0");
    	putEntry("CLOCK", "347:0");
    	putEntry("HAY_BLOCK", "170:0");
    	putEntry("SPRUCE_DOOR", "193:0");
    	putEntry("OAK_DOOR", "324:0");
    	putEntry("LEATHER_BOOTS", "301:0");
    	putEntry("LIGHT_BLUE_GLAZED_TERRACOTTA", "238:0");
    	putEntry("RED_NETHER_BRICKS", "215:0");
    	putEntry("STONE_HOE", "291:0");
    	putEntry("MUSIC_DISK_MALL", "2261:0");
    	putEntry("COMMAND_BLOCK_MINECART", "422:0");
    	putEntry("BIRCH_BOAT", "445:0");
    	putEntry("LAPIS_BLOCK", "22:0");
    	putEntry("SIGN", "68:0");
    	putEntry("DANDELION_YELLOW", "351:11");
    	putEntry("LIME_DYE", "351:10");
    	putEntry("WOODEN_HOE", "290:0");
    	putEntry("MAGENTA_DYE", "351:13");
    	putEntry("MELON_STEM", "105:0");
    	putEntry("LIGHT_BLUE_DYE", "351:12");
    	putEntry("BONE_MEAL", "351:15");
    	putEntry("SANDSTONE_STAIRS", "128:0");
    	putEntry("ORANGE_DYE", "351:14");
    	putEntry("BRICK", "336:0");
    	putEntry("SHEARS", "359:0");
    	putEntry("RED_SANDSTONE_SLAB", "181:0");
    	putEntry("WATER", "8:0");
    	putEntry("DIAMOND_BOOTS", "313:0");
    	putEntry("BRICKS", "45:0");
    	putEntry("SILVERFISH_SPAWN_EGG", "383:60");
    	putEntry("BLAZE_SPAWN_EGG", "383:61");
    	putEntry("GRAY_SHULKER_BOX", "226:0");
    	putEntry("RED_GLAZED_TERRACOTTA", "249:0");
    	putEntry("WITCH_SPAWN_EGG", "383:66");
    	putEntry("ENDERMITE_SPAWN_EGG", "383:67");
    	putEntry("RABBIT", "411:0");
    	putEntry("GUARDIAN_SPAWN_EGG", "383:68");
    	putEntry("SHULKER_SPAWN_EGG", "383:69");
    	putEntry("PURPUR_STAIRS", "203:0");
    	putEntry("MAGMA_CUBE_SPAWN_EGG", "383:62");
    	putEntry("BAT_SPAWN_EGG", "383:65");
    	putEntry("BEETROOT", "434:0");
    	putEntry("PISTON", "33:0");
    	putEntry("ICE", "79:0");
    	putEntry("LAVA", "10:0");
    	putEntry("GRAY_CARPET", "171:7");
    	putEntry("LIGHT_GRAY_CARPET", "171:8");
    	putEntry("CYAN_CARPET", "171:9");
    	putEntry("CAULDRON", "118:0");
    	putEntry("LIGHT_BLUE_CARPET", "171:3");
    	putEntry("YELLOW_CARPET", "171:4");
    	putEntry("LIME_CARPET", "171:5");
    	putEntry("BUCKET", "325:0");
    	putEntry("GLOWSTONE_DUST", "348:0");
    	putEntry("PINK_CARPET", "171:6");
    	putEntry("WHITE_CARPET", "171:0");
    	putEntry("ORANGE_CARPET", "171:1");
    	putEntry("CHAINMAIL_HELMET", "302:0");
    	putEntry("DIAMOND_ORE", "56:0");
    	putEntry("MAGENTA_CARPET", "171:2");
    	putEntry("BIRCH_DOOR", "194:0");
    	putEntry("SHEEP_SPAWN_EGG", "383:91");
    	putEntry("COW_SPAWN_EGG", "383:92");
    	putEntry("CHICKEN_SPAWN_EGG", "383:93");
    	putEntry("SQUID_SPAWN_EGG", "383:94");
    	putEntry("YELLOW_GLAZED_TERRACOTTA", "239:0");
    	putEntry("PIG_SPAWN_EGG", "383:90");
    	putEntry("PUMPKIN_PIE", "400:0");
    	putEntry("JUNGLE_BOAT", "446:0");
    	putEntry("BONE_BLOCK", "216:0");
    	putEntry("IRON_HOE", "292:0");
    	putEntry("WOLF_SPAWN_EGG", "383:95");
    	putEntry("MUSIC_DISK_FAR", "2260:0");
    	putEntry("MOOSHROOM_SPAWN_EGG", "383:96");
    	putEntry("OCELOT_SPAWN_EGG", "383:98");
    	putEntry("MUTTON", "423:0");
    	putEntry("OAK_STAIRS", "44:2");
    	putEntry("COBBLESTONE_SLAB", "44:3");
    	putEntry("LAPIS_ORE", "21:0");
    	putEntry("BRICK_SLAB", "44:4");
    	putEntry("STONE_BRICK_SLAB", "44:5");
    	putEntry("NETHER_BRICK_SLAB", "44:6");
    	putEntry("MELON", "106:0");
    	putEntry("EMERALD_ORE", "129:0");
    	putEntry("QUARTZ_SLAB", "44:7");
    	putEntry("GOLDEN_HELMET", "314:0");
    	putEntry("FLOWER_POT", "390:0");
    	putEntry("CLAY", "337:0");
    	putEntry("BEDROCK", "7:0");
    	putEntry("RED_SANDSTONE_SLAB", "182:0");
    	putEntry("STONE_SLAB", "44:0");
    	putEntry("COBBLESTONE_STAIRS", "67:0");
    	putEntry("SANDSTONE_SLAB", "44:1");
    	putEntry("LIGHT_GRAY_SHULKER_BOX", "227:0");
    	putEntry("COOKED_RABBIT", "412:0");
    	putEntry("BEETROOT_SEEDS", "435:0");
    	putEntry("STICK", "280:0");
    	putEntry("PURPUR_SLAB", "204:0");
    	putEntry("DEAD_BUSH", "32:0");
    	putEntry("END_PORTAL", "119:0");
    	putEntry("RAW_SALMON", "349:1");
    	putEntry("CHAINMAIL_CHESTPLATE", "303:0");
    	putEntry("RAW_FISH", "349:0");
    	putEntry("WATER_BUCKET", "326:0");
    	putEntry("REDSTONE_WIRE", "55:0");
    	putEntry("SNOW", "78:0");
    	putEntry("CONCRETE", "172:0");
    	putEntry("JUNGLE_DOOR", "195:0");
    	putEntry("PUFFERFISH", "349:3");
    	putEntry("TROPICAL_FISH", "349:2");
    	putEntry("FIREWORK_ROCKET", "401:0");
    	putEntry("COOKED_MUTTON", "424:0");
    	putEntry("ACACIA_BOAT", "447:0");
    	putEntry("STRUCTURE_VOID", "217:0");
    	putEntry("DIAMOND_HOE", "293:0");
    	putEntry("WOODEN_PICKAXE", "270:0");
    	putEntry("COBBLESTONE_STAIRS", "43:3");
    	putEntry("BRICK_STAIRS", "43:4");
    	putEntry("CYAN_STAINED_GLASS_PANE", "160:9");
    	putEntry("STONE_BRICK_STAIRS", "43:5");
    	putEntry("LIGHT_GRAY_STAINED_GLASS_PANE", "160:8");
    	putEntry("GLASS", "20:0");
    	putEntry("NETHER_BRICK_STAIRS", "43:6");
    	putEntry("GRAY_STAINED_GLASS_PANE", "160:7");
    	putEntry("QUARTZ_STAIRS", "43:7");
    	putEntry("OAK_FENCE_GATE", "107:0");
    	putEntry("MAGENTA_STAINED_GLASS_PANE", "160:2");
    	putEntry("GOLDEN_CHESTPLATE", "315:0");
    	putEntry("SUGAR_CANE", "338:0");
    	putEntry("CARROT", "391:0");
    	putEntry("ORANGE_STAINED_GLASS_PANE", "160:1");
    	putEntry("WHITE_STAINED_GLASS_PANE", "160:0");
    	putEntry("OAK_SAPLING", "6:0");
    	putEntry("PINK_STAINED_GLASS_PANE", "160:6");
    	putEntry("SPRUCE_SAPLING", "6:1");
    	putEntry("STONE_STAIRS", "43:0");
    	putEntry("GLOWSTONE", "89:0");
    	putEntry("LIME_STAINED_GLASS_PANE", "160:5");
    	putEntry("BIRCH_SAPLING", "6:2");
    	putEntry("SANDSTONE_STAIRS", "43:1");
    	putEntry("YELLOW_STAINED_GLASS_PANE", "160:4");
    	putEntry("SPRUCE_FENCE_GATE", "183:0");
    	putEntry("JUNGLE_SAPLING", "6:3");
    	putEntry("OAK_STAIRS", "43:2");
    	putEntry("RAIL", "66:0");
    	putEntry("LIGHT_BLUE_STAINED_GLASS_PANE", "160:3");
    	putEntry("ACACIA_SAPLING", "6:4");
    	putEntry("DARK_OAK_SAPLING", "6:5");
    	putEntry("CYAN_SHULKER_BOX", "228:0");
    	putEntry("BEETROOT_SOUP", "436:0");
    	putEntry("PURPUR_SLAB", "205:0");
    	putEntry("BOWL", "281:0");
    	putEntry("RABBIT_STEW", "413:0");
    	putEntry("CHEST_MINECART", "342:0");
    	putEntry("RAW_CHICKEN", "365:0");
    	putEntry("FERN", "31:2");
    	putEntry("NETHER_BRICK", "112:0");
    	putEntry("DROPPER", "158:0");
    	putEntry("EMERALD", "388:0");
    	putEntry("GRASS", "31:1");
    	putEntry("TALL_GRASS", "31:0");
    	putEntry("BITCH_STAIRS", "135:0");
    	putEntry("CHEST", "54:0");
    	putEntry("STONE_BUTTON", "77:0");
    	putEntry("REPEATING_COMMAND_BLOCK", "210:0");
    	putEntry("RED_SHULKER_BOX", "233:0");
    	putEntry("IRON_SHOVEL", "256:0");
    	putEntry("DIAMOND_AXE", "279:0");
    	putEntry("TIPPED_ARROW", "440:0");
    	putEntry("SEA_LANTERN", "169:0");
    	putEntry("REDSTONE", "331:0");
    	putEntry("BLAZE_POWDER", "377:0");
    	putEntry("ENCHANTING_TABLE", "123:0");
    	putEntry("TRAPPED_CHEST", "146:0");
    	putEntry("OAK_PLANKS", "5:0");
    	putEntry("SPRUCE_PLANKS", "5:1");
    	putEntry("IRON_BLOCK", "42:0");
    	putEntry("LADDER", "65:0");
    	putEntry("SOUL_SAND", "88:0");
    	putEntry("BIRCH_PLANKS", "5:2");
    	putEntry("JUNGLE_PLANKS", "5:3");
    	putEntry("RED_MUSHROOM_BLOCK", "100:0");
    	putEntry("ACACIA_PLANKS", "5:4");
    	putEntry("CAKE", "354:0");
    	putEntry("DARK_OAK_PLANKS", "5:5");
    	putEntry("IRON_SWORD", "267:0");
    	putEntry("CYAN_GLAZED_TERRACOTTA", "244:0");
    	putEntry("IRON_NUGGET", "452:0");
    	putEntry("MAGENTA_SHULKER_BOX", "221:0");
    	putEntry("NETHER_BRICK_FENCE", "113:0");
    	putEntry("JUNGLE_STAIRS", "136:0");
    	putEntry("CONCRETE", "159:0");
    	putEntry("COOKED_PORKCHOP", "320:0");
    	putEntry("COOKED_CHICKEN", "366:0");
    	putEntry("ITEM_FRAME", "389:0");
    	putEntry("COBWEB", "30:0");
    	putEntry("YELLOW_CONCRETE", "159:4");
    	putEntry("LIGHT_BLUE_CONCRETE", "159:3");
    	putEntry("MAGENTA_CONCRETE", "159:2");
    	putEntry("ORANGE_CONCRETE", "159:1");
    	putEntry("OAK_STAIRS", "53:0");
    	putEntry("REDSTONE_TORCH", "76:0");
    	putEntry("BROWN_MUSHROOM_BLOCK", "99:0");
    	putEntry("FURNACE_MINECART", "343:0");
    	putEntry("BLACK_SHULKER_BOX", "234:0");
    	putEntry("LINGERING_POTION", "441:0");
    	putEntry("IRON_PICKAXE", "257:0");
    	putEntry("LIGHT_GRAY_CONCRETE", "159:8");
    	putEntry("GRAY_CONCRETE", "159:7");
    	putEntry("PINK_CONCRETE", "159:6");
    	putEntry("LIME_CONCRETE", "159:5");
    	putEntry("CYAN_CONCRETE", "159:9");
    	putEntry("CHAIN_COMMAND_BLOCK", "211:0");
    	putEntry("LIGHT_WEIGHTED_PRESSURE_PLATE", "147:0");
    	putEntry("IRON_BARS", "101:0");
    	putEntry("MAGMA_CREAM", "378:0");
    	putEntry("REDSTONE_LAMP", "123:0");
    	putEntry("COBBLESTONE", "4:0");
    	putEntry("GOLD_BLOCK", "41:0");
    	putEntry("OAK_DOOR", "64:0");
    	putEntry("SNOWBALL", "332:0");
    	putEntry("BED", "355:0");
    	putEntry("NETHERRACK", "87:0");
    	putEntry("LIGHT_BLUE_SHULKER_BOX", "222:0");
    	putEntry("PURPLE_GLAZED_TERRACOTTA", "245:0");
    	putEntry("WOODEN_SWORD", "268:0");
    	putEntry("ACACIA_DOOR", "430:0");
    	putEntry("KNOWLEDGE_BOOK", "453:0");
    	putEntry("COMMAND_BLOCK", "137:0");
    	putEntry("CHISELED_STONE_BRICKS", "98:3");
    	putEntry("ROTTEN_FLESH", "367:0");
    	putEntry("NETHER_BRICK_STAIRS", "114:0");
    	putEntry("BLACK_CONCRETE", "251:15");
    	putEntry("SPAWNER", "52:0");
    	putEntry("MOSSY_STONE_BRICKS", "98:1");
    	putEntry("REDSTONE_TORCH", "75:0");
    	putEntry("CRACKED_STONE_BRICKS", "98:2");
    	putEntry("PAINTING", "321:0");
    	putEntry("EGG", "344:0");
    	putEntry("STONE_BRICKS", "98:0");
    	putEntry("WHITE_GLAZED_TERRACOTTA", "235:0");
    	putEntry("IRON_AXE", "258:0");
    	putEntry("BLUE_CONCRETE", "251:11");
    	putEntry("BROWN_CONCRETE", "251:12");
    	putEntry("GREEN_CONCRETE", "251:13");
    	putEntry("RED_CONCRETE", "251:14");
    	putEntry("SHIELD", "442:0");
    	putEntry("FROSTED_ICE", "212:0");
    	putEntry("PURPLE_CONCRETE", "251:10");
    	putEntry("GLASS_PANE", "102:0");
    	putEntry("OAK_SLAB", "125:0");
    	putEntry("SPRUCE_SLAB", "125:1");
    	putEntry("HEAVY_WEIGHTED_PRESSURE_PLATE", "148:0");
    	putEntry("BREWING_STAND", "379:0");
    	putEntry("ACACIA_SLAB", "125:4");
    	putEntry("DARK_OAK_SLAB", "125:5");
    	putEntry("BIRCH_SLAB", "125:2");
    	putEntry("JUNGLE_SLAB", "125:3");
    	putEntry("DIRT", "3:0");
    	putEntry("COARSE_DIRT", "3:1");
    	putEntry("RED_MUSHROOM", "40:0");
    	putEntry("SIGN", "63:0");
    	putEntry("PODZOL", "3:2");
    	putEntry("DIAMOND_HELMET", "310:0");
    	putEntry("REPEATER", "356:0");
    	putEntry("PUMPKIN", "86:0");
    	putEntry("OAK_BOAT", "333:0");
    	putEntry("RABBIT_SPAWN_EGG", "383:101");
    	putEntry("YELLOW_SHULKER_BOX", "223:0");
    	putEntry("WOODEN_SHOVEL", "269:0");
    	putEntry("POLAR_BEAR_SPAWN_EGG", "383:102");
    	putEntry("BLUE_GLAZED_TERRACOTTA", "246:0");
    	putEntry("HORSE_SPAWN_EGG", "383:100");
    	putEntry("PARROT_SPAWN_EGG", "383:105");
    	putEntry("DARK_OAK_DOOR", "431:0");
    	putEntry("LLAMA_SPAWN_EGG", "383:103");
    	putEntry("CHORUS_FLOWER", "200:0");
    	putEntry("INFESTED_CRACKED_STONE_BRICKS", "97:4");
    	putEntry("NETHER_WART", "115:0");
    	putEntry("CHISELED_STONE_BRICKS", "97:5");
    	putEntry("ENDER_PEARL", "368:0");
    	putEntry("BEACON", "138:0");
    	putEntry("FIRE", "51:0");
    	putEntry("REDSTONE_ORE", "74:0");
    	putEntry("INFESTED_STONE_BRICKS", "97:2");
    	putEntry("ENCHANTED_GOLDEN_APPLE", "322:1");
    	putEntry("INFESTED_MOSSY_STONE_BRICKS", "97:3");
    	putEntry("COMPASS", "345:0");
    	putEntry("INFESTED_STONE", "97:0");
    	putEntry("INFESTED_COBBLESTONE", "97:1");
    	putEntry("GOLDEN_APPLE", "322:0");
    	putEntry("ORANGE_GLAZED_TERRACOTTA", "236:0");
    	putEntry("FLINT_AND_STEEL", "259:0");
    	putEntry("LEAD", "420:0");
    	putEntry("ELYTRA", "443:0");
    	putEntry("MAGMA_BLOCK", "213:0");
    	putEntry("OAK_SLAB", "126:0");
    	putEntry("MELON", "103:0");
    	putEntry("JUNGLE_SLAB", "126:3");
    	putEntry("ACACIA_SLAB", "126:4");
    	putEntry("SPRUCE_SLAB", "126:1");
    	putEntry("BIRCH_SLAB", "126:2");
    	putEntry("COMPARATOR", "149:0");
    	putEntry("GRASS", "2:0");
    	putEntry("OAK_FENCE", "85:0");
    	putEntry("FURNACE", "62:0");
    	putEntry("DIAMOND_CHESTPLATE", "311:0");
    	putEntry("LEATHER", "334:0");
    	putEntry("COOKIE", "357:0");
    	putEntry("LIME_SHULKER_BOX", "224:0");
    	putEntry("BROWN_GLAZED_TERRACOTTA", "247:0");
    	putEntry("JUNGLE_FENCE", "190:0");
    	putEntry("DARK_OAK_SLAB", "126:5");
    	putEntry("CHORUS_FRUIT", "432:0");
    	putEntry("PURPUR_BLOCK", "201:0");
    	putEntry("PUMPKIN_SEEDS", "361:0");
    	putEntry("QUARTZ", "406:0");
    	putEntry("JUNGLE_DOOR", "429:0");
    	putEntry("TORCH", "50:0");
    	putEntry("TRAP_DOOR", "96:0");
    	putEntry("REDSTONE_ORE", "73:0");
    	putEntry("WHITE_WALL_BANNER", "177:0");
    	putEntry("HOPPER", "154:0");
    	putEntry("EXPERIENCE_BOTTLE", "384:0");
    	putEntry("TRIPWIRE_HOOK", "131:0");
    	putEntry("YELLOW_CONCRETE_POWDER", "252:4");
    	putEntry("LIGHT_BLUE_CONCRETE_POWDER", "252:3");
    	putEntry("PINK_CONCRETE_POWDER", "252:6");
    	putEntry("LIME_CONCRETE_POWDER", "252:5");
    	putEntry("LIGHT_GRAY_CONCRETE_POWDER", "252:8");
    	putEntry("IRON_LEGGINGS", "308:0");
    	putEntry("GRAY_CONCRETE_POWDER", "252:7");
    	putEntry("CYAN_CONCRETE_POWDER", "252:9");
    	putEntry("WHITE_CONCRETE_POWDER", "252:0");
    	putEntry("STONE_AXE", "275:0");
    	putEntry("LEATHER_HELMET", "298:0");
    	putEntry("MAGENTA_CONCRETE_POWDER", "252:2");
    	putEntry("ORANGE_CONCRETE_POWDER", "252:1");
    	putEntry("COOKED_SALMON", "350:1");
    	putEntry("GOLDEN_HORSE_ARMOR", "418:0");
    	putEntry("COOKED_FISH", "350:0");
    	putEntry("STONE", "1:0");
    	putEntry("GRANITE", "1:1");
    	putEntry("FURNACE", "61:0");
    	putEntry("JUKEBOX", "84:0");
    	putEntry("POLISHED_GRANITE", "1:2");
    	putEntry("DIORITE", "1:3");
    	putEntry("POLISHED_DIORITE", "1:4");
    	putEntry("SPRUCE_FENCE", "188:0");
    	putEntry("ANDESITE", "1:5");
    	putEntry("POLISHED_ANDESITE", "1:6");
    	putEntry("SLIME_BLOCK", "165:0");
    	putEntry("POTION", "373:0");
    	putEntry("POTATOES", "142:0");
    	putEntry("GOLDEN_CARROT", "396:0");
    	putEntry("MUSIC_DISK_CHIRP", "2259:0");
    	putEntry("LIME_GLAZED_TERRACOTTA", "240:0");
    	putEntry("COAL", "263:0");
    	putEntry("GOLDEN_AXE", "286:0");
    	putEntry("CHARCOAL", "263:1");
    	putEntry("LIGHT_GRAY_STAINED_GLASS", "95:8");
    	putEntry("CYAN_STAINED_GLASS", "95:9");
    	putEntry("PINK_STAINED_GLASS", "95:6");
    	putEntry("QUARTZ_PILLAR", "155:2");
    	putEntry("MELON_SEEDS", "362:0");
    	putEntry("TNT_MINECART", "407:0");
    	putEntry("GRAY_STAINED_GLASS", "95:7");
    	putEntry("CHISELED_QUARTZ_BLOCK", "155:1");
    	putEntry("DAYLIGHT_DETECTOR", "178:0");
    	putEntry("WET_SPONGE", "19:1");
    	putEntry("OAK_PRESSURE_PLATE", "72:0");
    	putEntry("WHITE_STAINED_GLASS", "95:0");
    	putEntry("SPONGE", "19:0");
    	putEntry("ORANGE_STAINED_GLASS", "95:1");
    	putEntry("YELLOW_STAINED_GLASS", "95:4");
    	putEntry("TRIPWIRE", "132:0");
    	putEntry("QUARTZ_BLOCK", "155:0");
    	putEntry("LIME_STAINED_GLASS", "95:5");
    	putEntry("MAGENTA_STAINED_GLASS", "95:2");
    	putEntry("FIRE_CHARGE", "385:0");
    	putEntry("LIGHT_BLUE_STAINED_GLASS", "95:3");
    	putEntry("LEATHER_CHESTPLATE", "299:0");
    	putEntry("IRON_BOOTS", "309:0");
    	putEntry("BLUE_SHULKER_BOX", "230:0");
    	putEntry("DIAMOND_SWORD", "276:0");
    	putEntry("CACTUS_GREEN", "351:2");
    	putEntry("ZOMBIE_HEAD", "397:2");
    	putEntry("ROSE_RED", "351:1");
    	putEntry("WITHER_HEAD", "397:1");
    	putEntry("DIAMOND_HORSE_ARMOR", "419:0");
    	putEntry("INK_SAC", "351:0");
    	putEntry("CREEPER_HEAD", "397:4");
    	putEntry("HUMAN_HEAD", "397:3");
    	putEntry("BIRCH_FENCE", "189:0");
    	putEntry("DRAGON_HEAD", "397:5");
    	putEntry("AIR", "0:0");
    	putEntry("FARMLAND", "60:0");
    	putEntry("PINK_DYE", "351:9");
    	putEntry("GRAY_DYE", "351:8");
    	putEntry("SUGAR_CANE", "83:0");
    	putEntry("LIGHT_GRAY_DYE", "351:7");
    	putEntry("END_PORTAL_FRAME", "120:0");
    	putEntry("OAK_BUTTON", "143:0");
    	putEntry("BARRIER", "166:0");
    	putEntry("CYAN_DYE", "351:6");
    	putEntry("PURPLE_DYE", "351:5");
    	putEntry("LAPIS_LAZULI", "351:4");
    	putEntry("GLASS_BOTTLE", "374:0");
    	putEntry("SKELETON_HEAD", "397:0");
    	putEntry("COCOA_BEANS", "351:3");
    	putEntry("MUSIC_DISK_BLOCKS", "2258:0");
    	putEntry("VILLAGER_SPAWN_EGG", "383:120");
    	putEntry("BROWN_CONCRETE_POWDER", "252:12");
    	putEntry("GREEN_CONCRETE_POWDER", "252:13");
    	putEntry("RED_CONCRETE_POWDER", "252:14");
    	putEntry("BLACK_CONCRETE_POWDER", "252:15");
    	putEntry("PINK_GLAZED_TERRACOTTA", "241:0");
    	putEntry("STRING", "287:0");
    	putEntry("PURPLE_CONCRETE_POWDER", "252:10");
    	putEntry("BLUE_CONCRETE_POWDER", "252:11");
    	putEntry("DIAMOND", "264:0");
    	putEntry("HOPPER_MINECART", "408:0");
    	putEntry("BOOK", "340:0");
    	putEntry("QUARTZ_STAIRS", "156:0");
    	putEntry("GREEN_CONCRETE", "159:13");
    	putEntry("BROWN_CONCRETE", "159:12");
    	putEntry("RED_SANDSTONE", "179:0");
    	putEntry("BLUE_CONCRETE", "159:11");
    	putEntry("CHISELED_RED_SANDSTONE", "179:1");
    	putEntry("PURPLE_CONCRETE", "159:10");
    	putEntry("SMOOTH_RED_SANDSTONE", "179:2");
    	putEntry("BIRCH_LEAVES", "18:2");
    	putEntry("BLACK_CARPET", "171:15");
    	putEntry("SPRUCE_LEAVES", "18:1");
    	putEntry("IRON_DOOR", "71:0");
    	putEntry("RED_CARPET", "171:14");
    	putEntry("OAK_LEAVES", "18:0");
    	putEntry("BLACK_CONCRETE", "159:15");
    	putEntry("GREEN_CARPET", "171:13");
    	putEntry("REPEATER", "94:0");
    	putEntry("RED_CONCRETE", "159:14");
    	putEntry("BROWN_CARPET", "171:12");
    	putEntry("EMERALD_BLOCK", "133:0");
    	putEntry("BEEF", "363:0");
    	putEntry("MYCELIUM", "110:0");
    	putEntry("KNOWLEGE_BOOK", "386:0");
    	putEntry("DIAMOND_SHOVEL", "277:0");
    	putEntry("BLUE_CARPET", "171:11");
    	putEntry("PURPLE_CARPET", "171:10");
    	putEntry("BROWN_SHULKER_BOX", "231:0");
    	putEntry("BONE", "352:0");
    	putEntry("CARROT_ON_A_STICK", "398:0");
    	putEntry("IRON_TRAPDOOR", "167:0");
    	putEntry("STICKY_PISTON", "29:0");
    	putEntry("CLAY", "82:0");
    	putEntry("SKULL", "144:0");
    	putEntry("END_STONE", "121:0");
    	putEntry("SPIDER_EYE", "375:0");
    	putEntry("SHULKER_SHELL", "450:0");
    	putEntry("FEATHER", "288:0");
    	putEntry("MUSIC_DISK_CAT", "2257:0");
    	putEntry("JUNGLE_LEAVES", "18:3");
    	putEntry("GRAY_GLAZED_TERRACOTTA", "242:0");
    	putEntry("IRON_INGOT", "265:0");
    	putEntry("WRITTEN_BOOK", "387:0");
    	putEntry("PRISMARINE_SHARD", "409:0");
    	putEntry("SLIME_BALL", "341:0");
    	putEntry("SPRUCE_STAIRS", "134:0");
    	putEntry("ACTIVATOR_RAIL", "157:0");
    	putEntry("JUNGLE_WOOD", "17:3");
    	putEntry("BIRCH_WOOD", "17:2");
    	putEntry("SPRUCE_WOOD", "17:1");
    	putEntry("REPEATER", "93:0");
    	putEntry("OAK_WOOD", "17:0");
    	putEntry("LILY_PAD", "111:0");
    	putEntry("COOKED_BEEF", "364:0");
    	putEntry("STRUCTURE_BLOCK", "255:0");
    	putEntry("DIAMOND_PICKAXE", "278:0");
    	putEntry("STONE_PRESSURE_PLATE", "70:0");
    	putEntry("MUSIC_DISK_WAIT", "2267:0");
    	putEntry("GREEN_SHULKER_BOX", "232:0");
    	putEntry("DARK_PRISMARINE", "168:2");
    	putEntry("IRON_DOOR", "330:0");
    	putEntry("SUGAR", "353:0");
    	putEntry("FERMENTED_SPIDER_EYE", "376:0");
    	putEntry("NETHER_STAR", "399:0");
    	putEntry("PRISMARINE_BRICKS", "168:1");
    	putEntry("ANVIL", "145:0");
    	putEntry("BLUE_STAINED_GLASS_PANE", "160:11");
    	putEntry("PRISMARINE", "168:0");
    	putEntry("PURPLE_STAINED_GLASS_PANE", "160:10");
    	putEntry("DETECTOR_RAIL", "28:0");
    	putEntry("DRAGON_EGG", "122:0");
    	putEntry("GOLD_INGOT", "266:0");
    	putEntry("GUNPOWDER", "289:0");
    	putEntry("CACTUS", "81:0");
    	putEntry("GREEN_STAINED_GLASS_PANE", "160:13");
    	putEntry("MUSIC_DISK_13", "2256:0");
    	putEntry("BROWN_STAINED_GLASS_PANE", "160:12");
    	putEntry("BLACK_STAINED_GLASS_PANE", "160:15");
    	putEntry("ORANGE_SHULKER_BOX", "220:0");
    	putEntry("LIGHT_GRAY_GLAZED_TERRACOTTA", "243:0");
    	putEntry("RED_STAINED_GLASS_PANE", "160:14");
    }
    
    private static void putEntry(String material, String idColonData) {
    	int colonIndex = idColonData.indexOf(':');
		int id = Integer.parseInt(idColonData.substring(0, colonIndex));
		short data = Short.parseShort(idColonData.substring(colonIndex + 1));
		MAP.put(material, new MatLibEntry(id, data));
    }

    public void printRev() {
    	for (Entry<String, MatLibEntry> entry : MAP.entrySet()) {
    		MatLibEntry itemInfo = entry.getValue();
    		System.out.println("putEntry(\"" + entry.getKey() + "\", \"" + itemInfo.getId() + ":" + itemInfo.getData() + "\");");
    	}
    }

    @AllArgsConstructor
    @Getter
    public static class MatLibEntry {
    	
    	private final int id;
    	private final short data;
    	
    }

}
