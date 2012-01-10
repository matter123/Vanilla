/*
 * This file is part of Vanilla (http://www.spout.org/).
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spout.vanilla;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.spout.api.material.BlockMaterial;
import org.spout.api.material.GenericItemMaterial;
import org.spout.api.material.ItemMaterial;
import org.spout.api.material.Material;
import org.spout.api.material.MaterialData;
import org.spout.vanilla.block.Air;
import org.spout.vanilla.block.DoubleSlabs;
import org.spout.vanilla.block.GenericLiquid;
import org.spout.vanilla.block.Grass;
import org.spout.vanilla.block.LongGrass;
import org.spout.vanilla.block.Sapling;
import org.spout.vanilla.block.Slab;
import org.spout.vanilla.block.Solid;
import org.spout.vanilla.block.StoneBricks;
import org.spout.vanilla.block.Tree;
import org.spout.vanilla.block.Wool;
import org.spout.vanilla.item.Coal;
import org.spout.vanilla.item.Dye;
import org.spout.vanilla.item.GenericArmor;
import org.spout.vanilla.item.GenericFood;
import org.spout.vanilla.item.GenericTool;
import org.spout.vanilla.item.GenericWeapon;

public final class VanillaBlocks {
	public static final BlockMaterial air = new Air("Air");
	public static final BlockMaterial stone = new Solid("Stone", 1);
	public static final BlockMaterial grass = new Grass("Grass");
	public static final BlockMaterial dirt = new Solid("Dirt", 3);
	public static final BlockMaterial cobblestone = new Solid("Cobblestone", 4);
	public static final BlockMaterial wood = new Solid("Wooden Planks", 5);
	public static final BlockMaterial sapling = new Sapling("Sapling", 0);
	public static final BlockMaterial spruceSapling = new Sapling("Spruce Sapling", 1);
	public static final BlockMaterial birchSapling = new Sapling("Birch Sapling", 2);
	public static final BlockMaterial bedrock = new Solid("Bedrock", 7);
	public static final BlockMaterial water = new GenericLiquid("Water", 8, true);
	public static final BlockMaterial stationaryWater = new GenericLiquid("Stationary Water", 9, false);
	public static final BlockMaterial lava = new GenericLiquid("Lava", 10, true);
	public static final BlockMaterial stationaryLava = new GenericLiquid("Stationary Lava", 11, false);
	public static final BlockMaterial sand = new Solid("Sand", 12, true);
	public static final BlockMaterial gravel = new Solid("Gravel", 13, true);
	public static final BlockMaterial goldOre = new Solid("Gold Ore", 14);
	public static final BlockMaterial ironOre = new Solid("Iron Ore", 15);
	public static final BlockMaterial coalOre = new Solid("Coal Ore", 16);
	public static final BlockMaterial log = new Tree("Wood", 17, 0);
	public static final BlockMaterial spruceLog = new Tree("Wood", 17, 1);
	public static final BlockMaterial birchLog = new Tree("Wood", 17, 2);
	public static final BlockMaterial leaves = new Tree("Leaves", 18, 0);
	public static final BlockMaterial spruceLeaves = new Tree("Leaves", 18, 1);
	public static final BlockMaterial birchLeaves = new Tree("Leaves", 18, 2);
	public static final BlockMaterial sponge = new Solid("Sponge", 19);
	public static final BlockMaterial glass = new Solid("Glass", 20);
	public static final BlockMaterial lapisOre = new Solid("Lapis Lazuli Ore", 21);
	public static final BlockMaterial lapisBlock = new Solid("Lapis Lazuli Block", 22);
	public static final BlockMaterial dispenser = new Solid("Dispenser", 23);
	public static final BlockMaterial sandstone = new Solid("Sandstone", 24);
	public static final BlockMaterial noteblock = new Solid("Note Block", 25);
	public static final BlockMaterial bedBlock = new Solid("Bed", 26);
	public static final BlockMaterial poweredRail = new Solid("Powered Rail", 27);
	public static final BlockMaterial detectorRail = new Solid("Detector Rail", 28);
	public static final BlockMaterial pistonStickyBase = new Solid("Sticky Piston", 29);
	public static final BlockMaterial web = new Solid("Cobweb", 30);
	public static final BlockMaterial deadShrub = new LongGrass("Dead Grass", 31, 0);
	public static final BlockMaterial tallGrass = new LongGrass("Tall Grass", 31, 1);
	public static final BlockMaterial fern = new LongGrass("Fern", 31, 2);
	public static final BlockMaterial deadBush = new LongGrass("Dead Shrubs", 32, 0);
	public static final BlockMaterial pistonBase = new Solid("Piston", 33);
	public static final BlockMaterial pistonExtension = new Solid("Piston (Head)", 34);
	public static final BlockMaterial whiteWool = new Wool("Wool", 35, 0);
	public static final BlockMaterial orangeWool = new Wool("Orange Wool", 35, 1);
	public static final BlockMaterial magentaWool = new Wool("Magenta Wool", 35, 2);
	public static final BlockMaterial lightBlueWool = new Wool("Light Blue Wool", 35, 3);
	public static final BlockMaterial yellowWool = new Wool("Yellow Wool", 35, 4);
	public static final BlockMaterial limeWool = new Wool("Light Green Wool", 35, 5);
	public static final BlockMaterial pinkWool = new Wool("Pink Wool", 35, 6);
	public static final BlockMaterial greyWool = new Wool("Grey Wool", 35, 7);
	public static final BlockMaterial lightGreyWool = new Wool("Light Grey Wool", 35, 8);
	public static final BlockMaterial cyanWool = new Wool("Cyan Wool", 35, 9);
	public static final BlockMaterial purpleWool = new Wool("Purple Wool", 35, 10);
	public static final BlockMaterial blueWool = new Wool("Blue Wool", 35, 11);
	public static final BlockMaterial brownWool = new Wool("Brown Wool", 35, 12);
	public static final BlockMaterial greenWool = new Wool("Dark Green Wool", 35, 13);
	public static final BlockMaterial redWool = new Wool("Red Wool", 35, 14);
	public static final BlockMaterial blackWool = new Wool("Black Wool", 35, 15);
	public static final BlockMaterial movedByPiston = new Solid("Moved By Piston", 36);
	public static final BlockMaterial dandelion = new Solid("Dandelion", 37);
	public static final BlockMaterial rose = new Solid("Rose", 38);
	public static final BlockMaterial brownMushroom = new Solid("Brown Mushroom", 39);
	public static final BlockMaterial redMushroom = new Solid("Red Mushroom", 40);
	public static final BlockMaterial goldBlock = new Solid("Gold Block", 41);
	public static final BlockMaterial ironBlock = new Solid("Iron Block", 42);
	public static final BlockMaterial stoneDoubleSlabs = new DoubleSlabs("Stone Double Slab", 43, 0);
	public static final BlockMaterial sandstoneDoubleSlabs = new DoubleSlabs("Sandstone Double Slab", 43, 1);
	public static final BlockMaterial woodenDoubleSlabs = new DoubleSlabs("Wooden Double Slab", 43, 2);
	public static final BlockMaterial cobblestoneDoubleSlabs = new DoubleSlabs("Stone Double Slab", 43, 3);
	public static final BlockMaterial brickDoubleSlabs = new DoubleSlabs("Brick Double Slab", 43, 4);
	public static final BlockMaterial stoneBrickDoubleSlabs = new DoubleSlabs("Stone Brick Double Slab", 43, 5);
	public static final BlockMaterial stoneSlab = new Slab("Stone Slab", 44, 0);
	public static final BlockMaterial sandstoneSlab = new Slab("Sandstone Slab", 44, 1);
	public static final BlockMaterial woodenSlab = new Slab("Wooden Slab", 44, 2);
	public static final BlockMaterial cobblestoneSlab = new Slab("Stone Slab", 44, 3);
	public static final BlockMaterial brickSlab = new Slab("Brick Slab", 44, 4);
	public static final BlockMaterial stoneBrickSlab = new Slab("Stone Brick Slab", 44, 5);
	public static final BlockMaterial brick = new Solid("Brick Block", 45);
	public static final BlockMaterial tnt = new Solid("TNT", 46);
	public static final BlockMaterial bookshelf = new Solid("Bookshelf", 47);
	public static final BlockMaterial mossStone = new Solid("Moss Stone", 48);
	public static final BlockMaterial obsidian = new Solid("Obsidian", 49);
	public static final BlockMaterial torch = new Solid("Torch", 50);
	public static final BlockMaterial fire = new Solid("Fire", 51);
	public static final BlockMaterial monsterSpawner = new Solid("Monster Spawner", 52);
	public static final BlockMaterial woodenStairs = new Solid("Wooden Stairs", 53);
	public static final BlockMaterial chest = new Solid("Chest", 54);
	public static final BlockMaterial redstoneWire = new Solid("Redstone Wire", 55);
	public static final BlockMaterial diamondOre = new Solid("Diamond Ore", 56);
	public static final BlockMaterial diamondBlock = new Solid("Diamond Block", 57);
	public static final BlockMaterial craftingTable = new Solid("Crafting Table", 58);
	public static final BlockMaterial crops = new Solid("Seeds", 59);
	public static final BlockMaterial farmland = new Solid("Farmland", 60);
	public static final BlockMaterial furnace = new Solid("Furance", 61);
	public static final BlockMaterial burningfurnace = new Solid("Burning Furnace", 62);
	public static final BlockMaterial signPost = new Solid("Sign Post", 63);
	public static final BlockMaterial woodenDoorBlock = new Solid("Wooden Door", 64);
	public static final BlockMaterial ladders = new Solid("Ladders", 65);
	public static final BlockMaterial rails = new Solid("Rails", 66);
	public static final BlockMaterial cobblestoneStairs = new Solid("Cobblestone Stairs", 67);
	public static final BlockMaterial wallSign = new Solid("Wall Sign", 68);
	public static final BlockMaterial lever = new Solid("Lever", 69);
	public static final BlockMaterial stonePressurePlate = new Solid("Stone Pressure Plate", 70);
	public static final BlockMaterial ironDoorBlock = new Solid("Iron Door", 71);
	public static final BlockMaterial woodenPressurePlate = new Solid("Wooden Pressure Plate", 72);
	public static final BlockMaterial redstoneOre = new Solid("Redstone Ore", 73);
	public static final BlockMaterial glowingRedstoneOre = new Solid("Glowing Redstone Ore", 74);
	public static final BlockMaterial redstoneTorchOff = new Solid("Redstone Torch", 75);
	public static final BlockMaterial redstoneTorchOn = new Solid("Redstone Torch (On)", 76);
	public static final BlockMaterial stoneButton = new Solid("Stone Button", 77);
	public static final BlockMaterial snow = new Solid("Snow", 78);
	public static final BlockMaterial ice = new Solid("Ice", 79);
	public static final BlockMaterial snowBlock = new Solid("Snow Block", 80);
	public static final BlockMaterial cactus = new Solid("Cactus", 81);
	public static final BlockMaterial clayBlock = new Solid("Clay Block", 82);
	public static final BlockMaterial sugarCaneBlock = new Solid("Sugar Cane", 83);
	public static final BlockMaterial jukebox = new Solid("Jukebox", 84);
	public static final BlockMaterial fence = new Solid("Fence", 85);
	public static final BlockMaterial pumpkin = new Solid("Pumpkin", 86);
	public static final BlockMaterial netherrack = new Solid("Netherrack", 87);
	public static final BlockMaterial soulSand = new Solid("Soul Sand", 88);
	public static final BlockMaterial glowstoneBlock = new Solid("Glowstone Block", 89);
	public static final BlockMaterial portal = new Solid("Portal", 90);
	public static final BlockMaterial jackOLantern = new Solid("Jack 'o' Lantern", 91);
	public static final BlockMaterial cakeBlock = new Solid("Cake Block", 92);
	public static final BlockMaterial redstoneRepeaterOff = new Solid("Redstone Repeater", 93);
	public static final BlockMaterial redstoneRepeaterOn = new Solid("Redstone Repeater (On)", 94);
	public static final BlockMaterial lockedChest = new Solid("Locked Chest", 95);
	public static final BlockMaterial trapdoor = new Solid("Trapdoor", 96);
	public static final BlockMaterial silverfishStone = new Solid("Silverfish Stone", 97);
	public static final BlockMaterial stoneBricks = new StoneBricks("Stone Brick", 98, 0);
	public static final BlockMaterial mossyStoneBricks = new StoneBricks("Mossy Stone Brick", 98, 1);
	public static final BlockMaterial crackedStoneBricks = new StoneBricks("Cracked Stone Brick", 98, 2);
	public static final BlockMaterial hugeBrownMushroom = new Solid("Huge Brown Mushroom", 99);
	public static final BlockMaterial hugeRedMushroom = new Solid("Huge Red Mushroom", 100);
	public static final BlockMaterial ironBars = new Solid("Iron Bars", 101);
	public static final BlockMaterial glassPane = new Solid("Glass Pane", 102);
	public static final BlockMaterial watermelon = new Solid("Watermelon", 103);
	public static final BlockMaterial pumpkinStem = new Solid("Pumpkin Stem", 104);
	public static final BlockMaterial melonStem = new Solid("Melon Stem", 105);
	public static final BlockMaterial vines = new Solid("Vines", 106);
	public static final BlockMaterial fenceGate = new Solid("Fence Gate", 107);
	public static final BlockMaterial brickStairs = new Solid("Brick Stairs", 108);
	public static final BlockMaterial stoneBrickStairs = new Solid("Stone Brick Stairs", 109);
	public static final BlockMaterial mycelium = new Solid("Mycelium", 110);
	public static final BlockMaterial lilyPad = new Solid("Lily Pad", 111);
	public static final BlockMaterial netherBrick = new Solid("Nether Brick", 112);
	public static final BlockMaterial netherBrickFence = new Solid("Nether Brick Fence", 113);
	public static final BlockMaterial netherBrickStairs = new Solid("Nether Brick Stairs", 114);
	public static final BlockMaterial netherWartBlock = new Solid("Nether Wart", 115);
	public static final BlockMaterial enchantmentTable = new Solid("Enchantment Table", 116);
	public static final BlockMaterial brewingStandBlock = new Solid("Brewing Stand", 117);
	public static final BlockMaterial cauldronBlock = new Solid("Cauldron", 118);
	public static final BlockMaterial endPortal = new Solid("End Portal", 119);
	public static final BlockMaterial endPortalFrame = new Solid("End Portal Frame", 120);
	public static final BlockMaterial endStone = new Solid("End Stone", 121);
	public static final BlockMaterial dragonEgg = new Solid("Dragon Egg", 122);

	public static final ItemMaterial ironShovel = new GenericTool("Iron Shovel", 256);
	public static final ItemMaterial ironPickaxe = new GenericTool("Iron Pickaxe", 257);
	public static final ItemMaterial ironAxe = new GenericTool("Iron Axe", 258);
	public static final ItemMaterial flintAndSteel = new GenericTool("Flint and Steel", 259);
	public static final ItemMaterial redApple = new GenericFood("Apple", 260, 4);
	public static final ItemMaterial bow = new GenericWeapon("Bow", 261);
	public static final ItemMaterial arrow = new GenericItemMaterial("Arrow", 262);
	public static final ItemMaterial coal = new Coal("Coal", 263, 0);
	public static final ItemMaterial charcoal = new Coal("Charcoal", 263, 1);
	public static final ItemMaterial diamond = new GenericItemMaterial("Diamond", 264);
	public static final ItemMaterial ironIngot = new GenericItemMaterial("Iron Ingot", 265);
	public static final ItemMaterial goldIngot = new GenericItemMaterial("Gold Ingot", 266);
	public static final ItemMaterial ironSword = new GenericWeapon("Iron Sword", 267);
	public static final ItemMaterial woodenSword = new GenericWeapon("Wooden Sword", 268);
	public static final ItemMaterial woodenShovel = new GenericTool("Wooden Shovel", 269);
	public static final ItemMaterial woodenPickaxe = new GenericTool("Wooden Pickaxe", 270);
	public static final ItemMaterial woodenAxe = new GenericTool("Wooden Axe", 271);
	public static final ItemMaterial stoneSword = new GenericWeapon("Stone Sword", 272);
	public static final ItemMaterial stoneShovel = new GenericTool("Stone Shovel", 273);
	public static final ItemMaterial stonePickaxe = new GenericTool("Stone Pickaxe", 274);
	public static final ItemMaterial stoneAxe = new GenericTool("Stone Axe", 275);
	public static final ItemMaterial diamondSword = new GenericWeapon("Diamond Sword", 276);
	public static final ItemMaterial diamondShovel = new GenericTool("Diamond Shovel", 277);
	public static final ItemMaterial diamondPickaxe = new GenericTool("Diamond Pickaxe", 278);
	public static final ItemMaterial diamondAxe = new GenericTool("Diamond Axe", 279);
	public static final ItemMaterial stick = new GenericItemMaterial("Stick", 280);
	public static final ItemMaterial bowl = new GenericItemMaterial("Bowl", 281);
	public static final ItemMaterial mushroomSoup = new GenericFood("Mushroom Soup", 282, 8);
	public static final ItemMaterial goldSword = new GenericWeapon("Gold Sword", 283);
	public static final ItemMaterial goldShovel = new GenericTool("Gold Shovel", 284);
	public static final ItemMaterial goldPickaxe = new GenericTool("Gold Pickaxe", 285);
	public static final ItemMaterial goldAxe = new GenericTool("Gold Axe", 286);
	public static final ItemMaterial string = new GenericItemMaterial("String", 287);
	public static final ItemMaterial feather = new GenericItemMaterial("Feather", 288);
	public static final ItemMaterial gunpowder = new GenericItemMaterial("Gunpowder", 289);
	public static final ItemMaterial woodenHoe = new GenericTool("Wooden Hoe", 290);
	public static final ItemMaterial stoneHoe = new GenericTool("Stone Hoe", 291);
	public static final ItemMaterial ironHoe = new GenericTool("Iron Hoe", 292);
	public static final ItemMaterial diamondHoe = new GenericTool("Diamond Hoe", 293);
	public static final ItemMaterial goldHoe = new GenericTool("Gold Hoe", 294);
	public static final ItemMaterial seeds = new GenericItemMaterial("Seeds", 295);
	public static final ItemMaterial wheat = new GenericItemMaterial("Wheat", 296);
	public static final ItemMaterial bread = new GenericFood("Bread", 297, 5);
	public static final ItemMaterial leatherCap = new GenericArmor("Leather Cap", 298);
	public static final ItemMaterial leatherTunic = new GenericArmor("Leather Tunic", 299);
	public static final ItemMaterial leatherPants = new GenericArmor("Leather Pants", 300);
	public static final ItemMaterial leatherBoots = new GenericArmor("Leather Boots", 301);
	public static final ItemMaterial chainHelmet = new GenericArmor("Chain Helmet", 302);
	public static final ItemMaterial chainChestplate = new GenericArmor("Chain Chestplate", 303);
	public static final ItemMaterial chainLeggings = new GenericArmor("Chain Leggings", 304);
	public static final ItemMaterial chainBoots = new GenericArmor("Chain Boots", 305);
	public static final ItemMaterial ironHelmet = new GenericArmor("Iron Helmet", 306);
	public static final ItemMaterial ironChestplate = new GenericArmor("Iron Chestplate", 307);
	public static final ItemMaterial ironLeggings = new GenericArmor("Iron Leggings", 308);
	public static final ItemMaterial ironBoots = new GenericArmor("Iron Boots", 309);
	public static final ItemMaterial diamondHelmet = new GenericArmor("Diamond Helmet", 310);
	public static final ItemMaterial diamondChestplate = new GenericArmor("Diamond Chestplate", 311);
	public static final ItemMaterial diamondLeggings = new GenericArmor("Diamond Leggings", 312);
	public static final ItemMaterial diamondBoots = new GenericArmor("Diamond Boots", 313);
	public static final ItemMaterial goldHelmet = new GenericArmor("Gold Helmet", 314);
	public static final ItemMaterial goldChestplate = new GenericArmor("Gold Chestplate", 315);
	public static final ItemMaterial goldLeggings = new GenericArmor("Gold Leggings", 316);
	public static final ItemMaterial goldBoots = new GenericArmor("Gold Boots", 317);
	public static final ItemMaterial flint = new GenericItemMaterial("Flint", 318, 0, true);
	public static final ItemMaterial rawPorkchop = new GenericFood("Raw Porkchop", 319, 3);
	public static final ItemMaterial cookedPorkchop = new GenericFood("Cooked Porkchop", 320, 8);
	public static final ItemMaterial paintings = new GenericItemMaterial("Paintings", 321);
	public static final ItemMaterial goldenApple = new GenericFood("Golden Apple", 322, 10);
	public static final ItemMaterial sign = new GenericItemMaterial("Sign", 323);
	public static final ItemMaterial woodenDoor = new GenericItemMaterial("Wooden Door", 324);
	public static final ItemMaterial bucket = new GenericItemMaterial("Bucket", 325);
	public static final ItemMaterial waterBucket = new GenericItemMaterial("Water Bucket", 326);
	public static final ItemMaterial lavaBucket = new GenericItemMaterial("Lava Bucket", 327);
	public static final ItemMaterial minecart = new GenericItemMaterial("Minecart", 328);
	public static final ItemMaterial saddle = new GenericItemMaterial("Saddle", 329);
	public static final ItemMaterial ironDoor = new GenericItemMaterial("Iron Door", 330);
	public static final ItemMaterial redstone = new GenericItemMaterial("Redstone", 331);
	public static final ItemMaterial snowball = new GenericItemMaterial("Snowball", 332);
	public static final ItemMaterial boat = new GenericItemMaterial("Boat", 333);
	public static final ItemMaterial leather = new GenericItemMaterial("Leather", 334);
	public static final ItemMaterial milk = new GenericItemMaterial("Milk", 335);
	public static final ItemMaterial clayBrick = new GenericItemMaterial("Brick", 336);
	public static final ItemMaterial clay = new GenericItemMaterial("Clay", 337);
	public static final ItemMaterial sugarCane = new GenericItemMaterial("Sugar Cane", 338);
	public static final ItemMaterial paper = new GenericItemMaterial("Paper", 339);
	public static final ItemMaterial book = new GenericItemMaterial("Book", 340);
	public static final ItemMaterial slimeball = new GenericItemMaterial("Slimeball", 341);
	public static final ItemMaterial minecartChest = new GenericItemMaterial("Minecart with Chest", 342);
	public static final ItemMaterial minecartFurnace = new GenericItemMaterial("Minecart with Furnace", 343);
	public static final ItemMaterial egg = new GenericItemMaterial("Egg", 344);
	public static final ItemMaterial compass = new GenericItemMaterial("Compass", 345);
	public static final ItemMaterial fishingRod = new GenericTool("Fishing Rod", 346);
	public static final ItemMaterial clock = new GenericItemMaterial("Clock", 347);
	public static final ItemMaterial glowstoneDust = new GenericItemMaterial("Glowstone Dust", 348);
	public static final ItemMaterial rawFish = new GenericFood("Raw Fish", 349, 2);
	public static final ItemMaterial cookedFish = new GenericFood("Cooked Fish", 350, 5);
	public static final ItemMaterial inkSac = new Dye("Ink Sac", 351, 0);
	public static final ItemMaterial roseRed = new Dye("Rose Red", 351, 1);
	public static final ItemMaterial cactusGreen = new Dye("Cactus Green", 351, 2);
	public static final ItemMaterial cocoaBeans = new Dye("Cocoa Beans", 351, 3);
	public static final ItemMaterial lapisLazuli = new Dye("Lapis Lazuli", 351, 4);
	public static final ItemMaterial purpleDye = new Dye("Purple Dye", 351, 5);
	public static final ItemMaterial cyanDye = new Dye("Cyan Dye", 351, 6);
	public static final ItemMaterial lightGrayDye = new Dye("Light Gray Dye", 351, 7);
	public static final ItemMaterial grayDye = new Dye("Gray Dye", 351, 8);
	public static final ItemMaterial pinkDye = new Dye("Pink Dye", 351, 9);
	public static final ItemMaterial limeDye = new Dye("Lime Dye", 351, 10);
	public static final ItemMaterial dandelionYellow = new Dye("Dandelion Yellow", 351, 11);
	public static final ItemMaterial lightBlueDye = new Dye("Light Blue Dye", 351, 12);
	public static final ItemMaterial magentaDye = new Dye("Magenta Dye", 351, 13);
	public static final ItemMaterial orangeDye = new Dye("Orange Dye", 351, 14);
	public static final ItemMaterial boneMeal = new Dye("Bone Meal", 351, 15);
	public static final ItemMaterial bone = new GenericItemMaterial("Bone", 352);
	public static final ItemMaterial sugar = new GenericItemMaterial("Sugar", 353);
	public static final ItemMaterial cake = new GenericItemMaterial("Cake", 354);
	public static final ItemMaterial bed = new GenericItemMaterial("Bed", 355);
	public static final ItemMaterial redstoneRepeater = new GenericItemMaterial("Redstone Repeater", 356);
	public static final ItemMaterial cookie = new GenericFood("Cookie", 357, 1);
	public static final ItemMaterial map = new GenericItemMaterial("Map", 358);
	public static final ItemMaterial shears = new GenericTool("Shears", 359);
	public static final ItemMaterial melonSlice = new GenericFood("Melon Slice", 360, 2);
	public static final ItemMaterial pumpkinSeeds = new GenericItemMaterial("Pumpkin Seeds", 361);
	public static final ItemMaterial melonSeeds = new GenericItemMaterial("Melon Seeds", 362);
	public static final ItemMaterial rawBeef = new GenericFood("Raw Beef", 363, 3);
	public static final ItemMaterial steak = new GenericFood("Steak", 364, 8);
	public static final ItemMaterial rawChicken = new GenericFood("Raw Chicken", 365, 2);
	public static final ItemMaterial cookedChicken = new GenericFood("Cooked Chicken", 366, 6);
	public static final ItemMaterial rottenFlesh = new GenericFood("Rotten Flesh", 367, 4);
	public static final ItemMaterial enderPearl = new GenericItemMaterial("Ender Pearl", 368);
	public static final ItemMaterial blazeRod = new GenericItemMaterial("Blaze Rod", 369);
	public static final ItemMaterial ghastTear = new GenericItemMaterial("Ghast Tear", 370);
	public static final ItemMaterial goldNugget = new GenericItemMaterial("Gold Nugget", 371);
	public static final ItemMaterial netherWart = new GenericItemMaterial("Nether Wart", 372);
	public static final ItemMaterial potion = new GenericItemMaterial("Potion", 373);
	public static final ItemMaterial glassBottle = new GenericItemMaterial("Glass Bottle", 374);
	public static final ItemMaterial spiderEye = new GenericFood("Spider Eye", 375, 2);
	public static final ItemMaterial fermentedSpiderEye = new GenericItemMaterial("Fermented Spider Eye", 376);
	public static final ItemMaterial blazePowder = new GenericItemMaterial("Blaze Powder", 377);
	public static final ItemMaterial magmaCream = new GenericItemMaterial("Magma Cream", 378);
	public static final ItemMaterial brewingStand = new GenericItemMaterial("Brewing Stand", 379);
	public static final ItemMaterial cauldron = new GenericItemMaterial("Cauldron", 380);
	public static final ItemMaterial eyeOfEnder = new GenericItemMaterial("Eye of Ender", 381);

	public static final ItemMaterial goldMusicDisc = new GenericItemMaterial("Music Disc", 2256);
	public static final ItemMaterial greenMusicDisc = new GenericItemMaterial("Music Disc", 2257);
	public static final ItemMaterial orangeMusicDisc = new GenericItemMaterial("Music Disc", 2258);
	public static final ItemMaterial redMusicDisc = new GenericItemMaterial("Music Disc", 2259);
	public static final ItemMaterial cyanMusicDisc = new GenericItemMaterial("Music Disc", 2260);
	public static final ItemMaterial blueMusicDisc = new GenericItemMaterial("Music Disc", 2261);
	public static final ItemMaterial purpleMusicDisc = new GenericItemMaterial("Music Disc", 2262);
	public static final ItemMaterial blackMusicDisc = new GenericItemMaterial("Music Disc", 2263);
	public static final ItemMaterial whiteMusicDisc = new GenericItemMaterial("Music Disc", 2264);
	public static final ItemMaterial forestGreenMusicDisc = new GenericItemMaterial("Music Disc", 2265);
	public static final ItemMaterial brokenMusicDisc = new GenericItemMaterial("Music Disc", 2266);
	
	protected static void initialize() {
		Field[] fields = VanillaBlocks.class.getFields();
		for (Field f : fields) {
			if (Modifier.isStatic(f.getModifiers())) {
				try {
					Object value = f.get(null);
					if (value instanceof Material) {
						MaterialData.registerMaterial((Material) value);
					}
				} catch (IllegalArgumentException e) {
				} catch (IllegalAccessException e) {
				}
			}
		}
	}

}
