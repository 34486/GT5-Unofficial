package gregtech.api.enums.material;

import gregtech.api.enums.Dyes;
import gregtech.api.enums.Element;
import gregtech.api.enums.material.types.DustMaterial;
import gregtech.api.enums.material.types.FluidMaterial;
import gregtech.api.enums.material.types.GemMaterial;
import gregtech.api.enums.material.types.MarkerMaterial;
import gregtech.api.enums.material.types.Material;
import gregtech.api.enums.material.types.MetalMaterial;
import gregtech.api.enums.material.types.RoughMaterial;
import gregtech.api.enums.material.types.SolidMaterial;
import gregtech.api.objects.MaterialStack;
import net.minecraft.init.Enchantments;

import static com.google.common.collect.ImmutableList.of;
import static gregtech.api.enums.material.types.DustMaterial.MatFlags.GENERATE_ORE;
import static gregtech.api.enums.material.types.DustMaterial.MatFlags.GENERATE_PLATE;
import static gregtech.api.enums.material.types.FluidMaterial.MatFlags.GENERATE_PLASMA;
import static gregtech.api.enums.material.types.FluidMaterial.MatFlags.STATE_GAS;
import static gregtech.api.enums.material.types.GemMaterial.MatFlags.GENERATE_LENSE;
import static gregtech.api.enums.material.types.MetalMaterial.MatFlags.*;
import static gregtech.api.enums.material.types.SolidMaterial.MatFlags.*;
import static gregtech.api.enums.material.MaterialIconSet.*;

public class Materials {

    private static final int STD_SOLID = GENERATE_PLATE | GENERATE_ROD | GENERATE_BOLT_SCREW;
	private static final int STD_GEM =  GENERATE_ORE | STD_SOLID | GENERATE_LENSE;
	private static final int STD_METAL = GENERATE_PLATE;
	private static final int EXT_METAL = STD_METAL | GENERATE_ROD | GENERATE_BOLT_SCREW;
	private static final int EXT2_METAL = EXT_METAL | GENERATE_GEAR | GENERATE_FOIL | GENERATE_FINE_WIRE;

    /**
     * Direct Elements
     */
    public static MetalMaterial Aluminium = new MetalMaterial(1, "aluminium", "Aluminium", 0xCCCCFF, DULL, of(), EXT2_METAL | GENERATE_SMALL_GEAR | GENERATE_ORE, Element.Al, 10.0F, 2, 128, 1700);
    public static MetalMaterial Americium = new MetalMaterial(2, "americium", "Americium", 0xDDDDDD, METALLIC, of(), 0, Element.Am);
    public static MetalMaterial Antimony = new MetalMaterial(3, "antimony", "Antimony", 0xCCCCDD, SHINY, of(), EXT_METAL, Element.Sb);
    public static FluidMaterial Argon = new FluidMaterial(4, "argon", "Argon", 0xBBBB00, FLUID, of(), STATE_GAS | GENERATE_PLASMA, Element.Ar);
    public static DustMaterial Arsenic = new DustMaterial(5, "arsenic", "Arsenic", 0xFFFFFF, DULL, of(), 0, Element.As);
    public static MetalMaterial Barium = new MetalMaterial(6, "barium", "Barium", 0xFFFFFF, SHINY, of(), 0, Element.Ba);
    public static MetalMaterial Beryllium = new MetalMaterial(7, "beryllium", "Beryllium", 0xAAFFAA, METALLIC, of(), STD_METAL | GENERATE_ORE, Element.Be, 14.0F, 2, 64);
    public static MetalMaterial Bismuth = new MetalMaterial(8, "bismuth", "Bismuth", 0xAADDDD, METALLIC, of(), GENERATE_ORE, Element.Bi, 6.0F, 1, 64);
    public static DustMaterial Boron = new DustMaterial(9, "boron", "Boron", 0xFCFCFC, DULL, of(), 0, Element.B);
    public static MetalMaterial Caesium = new MetalMaterial(10, "caesium", "Caesium", 0xFFFFFC, DULL, of(), 0, Element.Cs);
    public static MetalMaterial Calcium = new MetalMaterial(11, "calcium", "Calcium", 0xDDDDAA, METALLIC, of(), 0, Element.Ca);
    public static MetalMaterial Carbon = new MetalMaterial(12, "carbon", "Carbon", 0x555555, DULL, of(), 0, Element.C, 1.0F, 2, 64);
    public static MetalMaterial Cadmium = new MetalMaterial(13, "cadmium", "Cadmium", 0x505060, SHINY, of(), 0, Element.Ca);
    public static MetalMaterial Cerium = new MetalMaterial(14, "cerium", "Cerium", 0xEEEEEE, METALLIC, of(), 0, Element.Ce, 1068);
    public static FluidMaterial Chlorine = new FluidMaterial(15, "chlorine", "Chlorine", 0xEEEECC, GAS, of(), STATE_GAS, Element.Cl);
    public static MetalMaterial Chrome = new MetalMaterial(16, "chrome", "Chrome", 0xFFAAAB, SHINY, of(), STD_METAL, Element.Cr, 11.0F, 3, 256, 1700);
    public static MetalMaterial Cobalt = new MetalMaterial(17, "cobalt", "Cobalt", 0xAAAAFF, METALLIC, of(), STD_METAL | GENERATE_ORE, Element.Co, 8.0F, 3, 512);
    public static MetalMaterial Copper = new MetalMaterial(18, "copper", "Copper", 0xFF8000, SHINY, of(), EXT2_METAL | GENERATE_ORE, Element.Cu);
    public static FluidMaterial Deuterium = new FluidMaterial(19, "deuterium", "Deuterium", 0xEEEE00, FLUID, of(), STATE_GAS | GENERATE_PLASMA, Element.D);
    public static MetalMaterial Dysprosium = new MetalMaterial(20, "dysprosium", "Dysprosium", 0xFFFFEE, SHINY, of(), 0, Element.Dy, 1680);
    public static MetalMaterial Erbium = new MetalMaterial(21, "erbium", "Erbium", 0xEEEEEE, METALLIC, of(), STD_METAL, Element.Er, 1802);
    public static MetalMaterial Europium = new MetalMaterial(22, "europium", "Europium", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Eu, 1099);
    public static FluidMaterial Fluorine = new FluidMaterial(23, "fluorine", "Fluorine", 0xFFFFAA, GAS, of(), STATE_GAS, Element.F);
    public static MetalMaterial Gadolinium = new MetalMaterial(24, "gadolinium", "Gadolinium", 0xDDDDFF, METALLIC, of(), 0, Element.Gd, 1585);
    public static MetalMaterial Gallium = new MetalMaterial(25, "gallium", "Gallium", 0xEEEEFF, SHINY, of(), 0, Element.Ga, 1.0F, 2, 64);
    public static MetalMaterial Gold = new MetalMaterial(26, "gold", "Gold", 0xFFFF00, SHINY, of(), EXT2_METAL | GENERATE_ORE, Element.Au, 12.0F, 2, 64);
    public static MetalMaterial Holmium = new MetalMaterial(27, "holmium", "Holmium", 0xFFFFFF, METALLIC, of(), 0, Element.Ho, 1734);
    public static FluidMaterial Hydrogen = new MetalMaterial(28, "hydrogen", "Hydrogen", 0x00FFAA, GAS, of(), STATE_GAS, Element.H);
    public static FluidMaterial Helium = new FluidMaterial(29, "helium", "Helium", 0xDDDD00, GAS, of(), STATE_GAS, Element.He);
    public static FluidMaterial Helium3 = new FluidMaterial(30, "helium3", "Helium 3", 0xDDDD00, GAS, of(), STATE_GAS, Element.He_3);
    public static MetalMaterial Indium = new MetalMaterial(31, "indium", "Indium", 0x6600BB, METALLIC, of(), 0, Element.In);
    public static MetalMaterial Iridium = new MetalMaterial(32, "iridium", "Iridium", 0xFFFFFF, DULL, of(), STD_METAL | GENERATE_ORE, Element.Ir, 6.0F, 3, 2560, 2719);
    public static MetalMaterial Iron = new MetalMaterial(33, "iron", "Iron", 0xAAAAAA, METALLIC, of(), EXT2_METAL | GENERATE_ORE, Element.Fe, 6.0F, 2, 256);
    public static MetalMaterial Lanthanum = new MetalMaterial(34, "lanthanum", "Lanthanum", 0xFFFFFF, METALLIC, of(), 0, Element.La, 1193);
    public static MetalMaterial Lead = new MetalMaterial(35, "lead", "Lead", 0x770077, DULL, of(), STD_METAL | GENERATE_ORE, Element.Pb, 8.0F, 1, 64);
    public static MetalMaterial Lithium = new MetalMaterial(36, "lithium", "Lithium", 0x553355, DULL, of(), STD_METAL | GENERATE_ORE, Element.Li);
    public static MetalMaterial Lutetium = new MetalMaterial(37, "lutetium", "Lutetium", 0xFFFFFF, METALLIC, of(), 0, Element.Lu, 1925);
    public static MetalMaterial Magnesium = new MetalMaterial(38, "magnesium", "Magnesium", 0xFFBBBB, METALLIC, of(), 0, Element.Mg);
    public static MetalMaterial Manganese = new MetalMaterial(39, "manganese", "Manganese", 0xEEEEEE, DULL, of(), 0, Element.Mn, 7.0F, 2, 512);
    public static FluidMaterial Mercury = new FluidMaterial(40, "mercury", "Mercury", 0xFFDDDD, FLUID, of(), 0, Element.Hg);
    public static MetalMaterial Molybdenum = new MetalMaterial(41, "molybdenum", "Molybdenum", 0xAAAADD, DULL, of(), 0, Element.Mo, 7.0F, 512, 2);
    public static MetalMaterial Neodymium = new MetalMaterial(42, "neodymium", "Neodymium", 0x999999, METALLIC, of(), STD_METAL, Element.Nd, 7.0F, 2, 512, 1297);
    public static MetalMaterial Darmstadtium = new MetalMaterial(43, "darmstadtium", "Darmstadtium", 0xAAAAAA, METALLIC, of(), STD_METAL, Element.Ds, 24.0F, 6, 655360);
    public static MetalMaterial Nickel = new MetalMaterial(44, "nickel", "Nickel", 0xAAAAFF, METALLIC, of(), STD_METAL | GENERATE_ORE, Element.Ni, 6.0F, 2, 64);
    public static MetalMaterial Niobium = new MetalMaterial(45, "niobium", "Niobium", 0x9486AA, METALLIC, of(), STD_METAL | GENERATE_ORE, Element.Nb, 2750);
    public static FluidMaterial Nitrogen = new FluidMaterial(46, "nitrogen", "Nitrogen", 0x7090AF, FLUID, of(), STATE_GAS, Element.N);
    public static MetalMaterial Osmium = new MetalMaterial(47, "osmium", "Osmium", 0x5050FF, METALLIC, of(), STD_METAL, Element.Os, 16.0F, 4, 1280, 3306);
    public static FluidMaterial Oxygen = new FluidMaterial(48, "oxygen", "Oxygen", 0x90AAEE, FLUID, of(), STATE_GAS, Element.O);
    public static MetalMaterial Palladium = new MetalMaterial(49, "palladium", "Palladium", 0xCED0DD, METALLIC, of(), EXT2_METAL | GENERATE_ORE, Element.Pd, 8.0f, 2, 512, 1228);
    public static DustMaterial Phosphor = new DustMaterial( 50, "phosphorus", "Phosphorus", 0xD1E682, DULL, of(), 0, Element.P);
    public static MetalMaterial Platinum = new MetalMaterial(51, "platinum", "Platinum", 0xE5E4E2, SHINY, of(), EXT2_METAL | GENERATE_ORE, Element.Pt, 12.0F, 2, 64);
    public static MetalMaterial Plutonium = new MetalMaterial(52, "plutonium", "Plutonium 244", 0xF03232, METALLIC, of(), EXT_METAL, Element.Pu, 6.0F, 3, 512);
    public static MetalMaterial Plutonium241 = new MetalMaterial(53, "plutonium241", "Plutonium 241", 0xFA4646, SHINY, of(), EXT_METAL, Element.Pu_241, 6.0F, 3, 512);
    public static MetalMaterial Potassium = new MetalMaterial(54, "potassium", "Potassium", 0xCECECE, METALLIC, of(), EXT_METAL, Element.K);
    public static MetalMaterial Praseodymium = new MetalMaterial(55, "praseodymium", "Praseodymium", 0xCECECE, METALLIC, of(), EXT_METAL, Element.Pr, 1208);
    public static MetalMaterial Promethium = new MetalMaterial(56, "promethium", "Promethium", 0xFFFFFF, METALLIC, of(), EXT_METAL, Element.Pm, 1315);
    public static FluidMaterial Radon = new FluidMaterial(57, "radon", "Radon", 0xFF00FF, FLUID, of(), STATE_GAS | GENERATE_PLASMA, Element.Rn);
    public static MetalMaterial Rubidium = new MetalMaterial(58, "rubidium", "Rubidium", 0xF01E1E, METALLIC, of(), STD_METAL, Element.Rb);
    public static MetalMaterial Samarium = new MetalMaterial(59, "samarium", "Samarium", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Sm, 1345);
    public static MetalMaterial Scandium = new MetalMaterial(60, "scandium", "Scandium", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Sc, 1814);
    public static MetalMaterial Silicon = new MetalMaterial(61, "silicon", "Silicon", 0x3C3C50, METALLIC, of(), STD_METAL, Element.Si, 1687);
    public static MetalMaterial Silver = new MetalMaterial(62, "silver", "Silver", 0xDCDCFF, SHINY, of(), EXT2_METAL | GENERATE_ORE, Element.Ag, 10.0F, 2, 64);
    public static MetalMaterial Sodium = new MetalMaterial(63, "sodium", "Sodium", 0x000096, METALLIC, of(), STD_METAL, Element.Na);
    public static MetalMaterial Strontium = new MetalMaterial(64, "strontium", "Strontium", 0xC8C896, METALLIC, of(), STD_METAL, Element.Sr);
    public static DustMaterial Sulfur = new DustMaterial(65, "sulfur", "Sulfur", 0xC8C800, DULL, of(), 0, Element.S);
    public static MetalMaterial Tantalum = new MetalMaterial(66, "tantalum", "Tantalum", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Ta);
    public static MetalMaterial Tellurium = new MetalMaterial(67, "tellurium", "Tellurium", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Te);
    public static MetalMaterial Terbium = new MetalMaterial(68, "terbium", "Terbium", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Tb, 1629);
    public static MetalMaterial Thorium = new MetalMaterial(69, "thorium", "Thorium", 0x001E00, SHINY, of(), STD_METAL | GENERATE_ORE, Element.Th, 6.0F, 2, 512);
    public static MetalMaterial Thulium = new MetalMaterial(70, "thulium", "Thulium", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Tm, 1818);
    public static MetalMaterial Tin = new MetalMaterial(71, "tin", "Tin", 0xDCDCDC, DULL, of(), EXT2_METAL, Element.Sn, 505);
    public static MetalMaterial Titanium = new MetalMaterial(72, "titanium", "Titanium", 0xDCA0F0, METALLIC, of(), EXT2_METAL, Element.Ti, 7.0F, 3, 1600, 1941);
    public static FluidMaterial Tritium = new FluidMaterial(73, "tritium", "Tritium", 0xFF0000, METALLIC, of(), STATE_GAS, Element.T);
    public static MetalMaterial Tungsten = new MetalMaterial(74, "tungsten", "Tungsten", 0x323232, METALLIC, of(), EXT2_METAL, Element.W, 7.0F, 3, 2560, 3000);
    public static MetalMaterial Uranium = new MetalMaterial(75, "uranium", "Uranium 238", 0x32F032, METALLIC, of(), STD_METAL | GENERATE_ORE, Element.U, 6.0F, 3, 512);
    public static MetalMaterial Uranium235 = new MetalMaterial(76, "uranium235", "Uranium 235", 0x46FA46, SHINY, of(), STD_METAL | GENERATE_ORE, Element.U_235, 6.0F, 3, 512);
    public static MetalMaterial Vanadium = new MetalMaterial(77, "vanadium", "Vanadium", 0x323232, METALLIC, of(), STD_METAL, Element.V, 2183);
    public static MetalMaterial Ytterbium = new MetalMaterial(77, "ytterbium", "Ytterbium", 0xFFFFFF, METALLIC, of(), STD_METAL, Element.Yb, 1097);
    public static MetalMaterial Yttrium = new MetalMaterial(78, "yttrium", "Yttrium", 0xDCFADC, METALLIC, of(), STD_METAL, Element.Y, 1799);
    public static MetalMaterial Zinc = new MetalMaterial(79, "zinc", "Zinc", 0xFAF0F0, METALLIC, of(), STD_METAL | GENERATE_ORE, Element.Zn);

    /**
     * First Degree Compounds
     */
    public static FluidMaterial Methane = new FluidMaterial(80, "methane", "Methane", 0xFFFFFF, FLUID, of(new MaterialStack(Carbon, 1), new MaterialStack(Hydrogen, 4)), 0);
    public static FluidMaterial CarbonDioxide = new FluidMaterial(81, "carbon_dioxide", "Carbon Dioxide", 0xA9D0F5, FLUID, of(new MaterialStack(Carbon, 1), new MaterialStack(Oxygen, 2)), GENERATE_PLASMA);
    public static FluidMaterial NobleGases = new FluidMaterial(82, "noble_gases", "Noble Gases", 0xA9D0F5, FLUID, of(new MaterialStack(CarbonDioxide, 21), new MaterialStack(Helium, 9), new MaterialStack(Methane, 3), new MaterialStack(Deuterium, 1)), GENERATE_PLASMA);
    public static FluidMaterial Air = new FluidMaterial(83, "air", "Air", 0xA9D0F5, FLUID, of(new MaterialStack(Nitrogen, 40), new MaterialStack(Oxygen, 11), new MaterialStack(Argon, 1), new MaterialStack(NobleGases, 1)), GENERATE_PLASMA);
    public static FluidMaterial LiquidAir = new FluidMaterial(84, "liquid_air", "Liquid Air", 0xA9D0F5, FLUID, of(new MaterialStack(Nitrogen, 40), new MaterialStack(Oxygen, 11), new MaterialStack(Argon, 1), new MaterialStack(NobleGases, 1)), GENERATE_PLASMA);
    public static GemMaterial Almandine = new GemMaterial(85, "almandine", "Almandine", 0xFF0000, ROUGH, of(new MaterialStack(Aluminium, 2), new MaterialStack(Iron, 3), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 12)), GENERATE_ORE);
    public static DustMaterial Andradite = new DustMaterial(86, "andradite", "Andradite", 0x967800, ROUGH, of(new MaterialStack(Calcium, 3), new MaterialStack(Iron, 2), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 12)), 0);
    public static MetalMaterial AnnealedCopper = new MetalMaterial(87, "annealed_copper", "Annealed Copper", 0xFF7814, SHINY, of(new MaterialStack(Copper, 1)), EXT2_METAL);
    public static SolidMaterial Asbestos = new SolidMaterial(88, "asbestos", "Asbestos", 0xE6E6E6, DULL, of(new MaterialStack(Magnesium, 3), new MaterialStack(Silicon, 2), new MaterialStack(Hydrogen, 4), new MaterialStack(Oxygen, 9)), 0);
    public static DustMaterial Ash = new DustMaterial(89, "ash", "Ashes", 0x969696, DULL, of(new MaterialStack(Carbon, 1)), 0);
    public static MetalMaterial BandedIron = new MetalMaterial(90, "banded_iron", "Banded Iron", 0x915A5A, DULL, of(new MaterialStack(Iron, 2), new MaterialStack(Oxygen, 3)), STD_METAL | GENERATE_ORE);
    public static MetalMaterial BatteryAlloy = new MetalMaterial(91, "battery_alloy", "Battery Alloy", 0x9C7CA0, DULL, of(new MaterialStack(Lead, 4), new MaterialStack(Antimony, 1)), EXT_METAL);
    public static GemMaterial BlueTopaz = new GemMaterial(92, "blue_topaz", "Blue Topaz", 0x0000FF, GEM_HORIZONTAL, of(new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 1), new MaterialStack(Fluorine, 2), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 6)), GENERATE_LENSE | GENERATE_ORE, 7.0F, 3, 256);
    public static SolidMaterial Bone = new SolidMaterial(93, "bone", "Bone", 0xFFFFFF, DULL, of(new MaterialStack(Calcium, 1)), 0);
    public static MetalMaterial Brass = new MetalMaterial(94, "brass", "Brass", 0xFFB400, METALLIC, of(new MaterialStack(Zinc, 1), new MaterialStack(Copper, 3)), EXT2_METAL, 7.0F, 1, 96);
    public static MetalMaterial Bronze = new MetalMaterial(95, "bronze", "Bronze", 0xFF8000, METALLIC, of(new MaterialStack(Tin, 1), new MaterialStack(Copper, 3)), EXT2_METAL, 6.0F, 2, 192);
    public static DustMaterial BrownLimonite = new DustMaterial(96, "brown_limonite", "Brown Limonite", 0xC86400, METALLIC, of(new MaterialStack(Iron, 1), new MaterialStack(Hydrogen, 1), new MaterialStack(Oxygen, 2)), GENERATE_ORE);
    public static DustMaterial Calcite = new DustMaterial(97, "calcite", "Calcite", 0xFAE6DC, DULL, of(new MaterialStack(Calcium, 1), new MaterialStack(Carbon, 1), new MaterialStack(Oxygen, 3)), GENERATE_ORE);
    public static DustMaterial Cassiterite = new DustMaterial(98, "cassiterite", "Cassiterite", 0xDCDCDC, METALLIC, of(new MaterialStack(Tin, 1), new MaterialStack(Oxygen, 2)), GENERATE_ORE);
    public static DustMaterial CassiteriteSand = new DustMaterial(99, "cassiterite_sand", "Cassiterite Sand", 0xDCDCDC, SAND, of(new MaterialStack(Tin, 1), new MaterialStack(Oxygen, 2)), GENERATE_ORE);
    public static DustMaterial Chalcopyrite = new DustMaterial(100, "chalcopyrite", "Chalcopyrite", 0xA07828, DULL, of(new MaterialStack(Copper, 1), new MaterialStack(Iron, 1), new MaterialStack(Sulfur, 2)), GENERATE_ORE);
    public static RoughMaterial Charcoal = new RoughMaterial(101, "charcoal", "Charcoal", 0x644646, FINE, of(new MaterialStack(Carbon, 1)), 0);
    public static MetalMaterial Chromite = new MetalMaterial(102, "chromite", "Chromite", 0x23140F, METALLIC, of(new MaterialStack(Iron, 1), new MaterialStack(Chrome, 2), new MaterialStack(Oxygen, 4)), GENERATE_ORE, null, 1700);
    public static MetalMaterial ChromiumDioxide  = new MetalMaterial(103, "chromium_dioxide", "Chromium Dioxide", 0xE6C8C8, DULL, of(new MaterialStack(Chrome, 1), new MaterialStack(Oxygen, 2)), EXT_METAL, null, 11.0F, 3, 256, 650);
    public static RoughMaterial Cinnabar = new RoughMaterial(103, "cinnabar", "Cinnabar", 0x960000, ROUGH, of(new MaterialStack(Mercury, 1), new MaterialStack(Sulfur, 1)), GENERATE_ORE);
    public static FluidMaterial Water = new FluidMaterial(104, "water", "Water", 0x0000FF, FLUID, of(new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 1)), 0);
    public static RoughMaterial Clay = new RoughMaterial(105, "clay", "Clay", 0xC8C8DC, ROUGH, of(new MaterialStack(Sodium, 2), new MaterialStack(Lithium, 1), new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 2), new MaterialStack(Water, 6)), 0);
    public static RoughMaterial Coal = new RoughMaterial(106, "coal", "Coal", 0x464646, ROUGH, of(new MaterialStack(Carbon, 1)), 0);
    public static DustMaterial Cobaltite = new DustMaterial(107, "cobaltite", "Cobaltite", 0x5050FA, METALLIC, of(new MaterialStack(Cobalt, 1), new MaterialStack(Arsenic, 1), new MaterialStack(Sulfur, 1)), GENERATE_ORE);
    public static DustMaterial Cooperite = new DustMaterial(108, "cooperite", "Sheldonite", 0xFFFFC8, METALLIC, of(new MaterialStack(Platinum, 3), new MaterialStack(Nickel, 1), new MaterialStack(Sulfur, 1), new MaterialStack(Palladium, 1)), GENERATE_ORE);
    public static MetalMaterial Cupronickel = new MetalMaterial(109, "cupronickel", "Cupronickel", 0xE39680, METALLIC, of(new MaterialStack(Copper, 1), new MaterialStack(Nickel, 1)), EXT_METAL,  6.0F, 1, 64);
    public static DustMaterial DarkAsh = new DustMaterial(110, "dark_ash", "Dark Ashes", 0x323232, DULL, of(new MaterialStack(Carbon, 1)), 0);
    public static GemMaterial Diamond = new GemMaterial(111, "diamond", "Diamond", 0xC8FFFF, DIAMOND, of(new MaterialStack(Carbon, 1)), GENERATE_ROD | GENERATE_BOLT_SCREW | GENERATE_LENSE | GENERATE_GEAR, 8.0F, 3, 1280);
    public static MetalMaterial Electrum = new MetalMaterial(112, "electrum", "Electrum", 0xFFFF64, SHINY, of(new MaterialStack(Silver, 1), new MaterialStack(Gold, 1)), EXT2_METAL, 12.0F, 2, 64);
    public static GemMaterial Emerald = new GemMaterial(113, "emerald", "Emerald", 0x50FF50, EMERALD, of(new MaterialStack(Beryllium, 3), new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 6), new MaterialStack(Oxygen, 18)), GENERATE_ORE, 7.0F, 2, 256);
    public static DustMaterial Galena = new DustMaterial(114, "galena", "Galena", 0x643C64, DULL, of(new MaterialStack(Lead, 3), new MaterialStack(Silver, 3), new MaterialStack(Sulfur, 2)), GENERATE_ORE);
    public static DustMaterial Garnierite = new DustMaterial(115, "garnierite", "Garnierite", 0x32C846, METALLIC, of(new MaterialStack(Nickel, 1), new MaterialStack(Oxygen, 1)), GENERATE_ORE);
    public static FluidMaterial Glyceryl = new FluidMaterial(116, "glyceryl", "Glyceryl Trinitrate", 0x009696, FLUID, of(new MaterialStack(Carbon, 3), new MaterialStack(Hydrogen, 5), new MaterialStack(Nitrogen, 3), new MaterialStack(Oxygen, 9)), 0);
    public static GemMaterial GreenSapphire = new GemMaterial(117, "green_sapphire", "Green Sapphire", 0x64C882, GEM_HORIZONTAL, of(new MaterialStack(Aluminium, 2), new MaterialStack(Oxygen, 3)), GENERATE_ORE, 7.0F, 2, 256);
    public static DustMaterial Grossular = new DustMaterial(118, "grossular", "Grossular", 0xC86400, ROUGH, of(new MaterialStack(Calcium, 3), new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 12)), GENERATE_ORE);
    public static FluidMaterial HolyWater = new FluidMaterial(119, "holy_water", "Holy Water", 0x0000FF, FLUID, of(new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 1)), 0);
    public static SolidMaterial Ice = new SolidMaterial(120, "ice", "Ice", 0xC8C8FF, SHINY, of(new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 1)), 0);
    public static DustMaterial Ilmenite = new DustMaterial(121, "ilmenite", "Ilmenite", 0x463732, METALLIC, of(new MaterialStack(Iron, 1), new MaterialStack(Titanium, 1), new MaterialStack(Oxygen, 3)), GENERATE_ORE);
    public static GemMaterial Rutile = new GemMaterial(122, "rutile", "Rutile", 0xD40D5C, GEM_HORIZONTAL, of(new MaterialStack(Titanium, 1), new MaterialStack(Oxygen, 2)), 0);
    public static DustMaterial Bauxite = new DustMaterial(123, "bauxite", "Bauxite", 0xC86400, DULL, of(new MaterialStack(Rutile, 2), new MaterialStack(Aluminium, 16), new MaterialStack(Hydrogen, 10), new MaterialStack(Oxygen, 11)), GENERATE_ORE);
    public static FluidMaterial Titaniumtetrachloride = new FluidMaterial(124, "titaniumtetrachloride", "Titaniumtetrachloride", 0xD40D5C, FLUID, of(new MaterialStack(Titanium, 1), new MaterialStack(Carbon, 2), new MaterialStack(Chlorine, 2)), 0);
    public static DustMaterial Magnesiumchloride = new DustMaterial(125, "magnesiumchloride", "Magnesiumchloride", 0xD40D5C, DULL, of(new MaterialStack(Magnesium, 1), new MaterialStack(Chlorine, 2)), 0);
    public static MetalMaterial Invar = new MetalMaterial(126, "invar", "Invar", 0xB4B478, METALLIC, of(new MaterialStack(Iron, 2), new MaterialStack(Nickel, 1)), EXT2_METAL, 6.0F, 2, 256);
    public static MetalMaterial Kanthal = new MetalMaterial(127, "kanthal", "Kanthal", 0xC2D2DF, METALLIC, of(new MaterialStack(Iron, 1), new MaterialStack(Aluminium, 1), new MaterialStack(Chrome, 1)), EXT_METAL, null, 6.0F, 2, 64, 1800);
    public static GemMaterial Lazurite = new GemMaterial(128, "lazurite", "Lazurite", 0x6478FF, LAPIS, of(new MaterialStack(Aluminium, 6), new MaterialStack(Silicon, 6), new MaterialStack(Calcium, 8), new MaterialStack(Sodium, 8)), GENERATE_ORE);
    public static MetalMaterial Magnalium = new MetalMaterial(129, "magnalium", "Magnalium", 0xC8BEFF, DULL, of(new MaterialStack(Magnesium, 1), new MaterialStack(Aluminium, 2)), EXT2_METAL, 6.0F, 2, 256);
    public static DustMaterial Magnesite = new DustMaterial(130, "magnesite", "Magnesite", 0xFAFAB4, METALLIC, of(new MaterialStack(Magnesium, 1), new MaterialStack(Carbon, 1), new MaterialStack(Oxygen, 3)), GENERATE_ORE);
    public static DustMaterial Magnetite = new DustMaterial(131, "magnetite", "Magnetite", 0x1E1E1E, METALLIC, of(new MaterialStack(Iron, 3), new MaterialStack(Oxygen, 4)), GENERATE_ORE);
    public static DustMaterial Molybdenite = new DustMaterial(132, "molybdenite", "Molybdenite", 0x191919, METALLIC, of(new MaterialStack(Molybdenum, 1), new MaterialStack(Sulfur, 2)), GENERATE_ORE);
    public static MetalMaterial Nichrome = new MetalMaterial(133, "nichrome", "Nichrome", 0xCDCEF6, METALLIC, of(new MaterialStack(Nickel, 4), new MaterialStack(Chrome, 1)), EXT_METAL, null, 6.0F, 2, 64, 2700);
    public static MetalMaterial NiobiumNitride = new MetalMaterial(134, "niobium_nitride", "Niobium Nitride", 0x1D291D, DULL, of(new MaterialStack(Niobium, 1), new MaterialStack(Nitrogen, 1)), EXT_METAL, null, 2573);
    public static MetalMaterial NiobiumTitanium = new MetalMaterial(135, "niobium_titanium", "Niobium-Titanium", 0x1D1D29, DULL, of(new MaterialStack(Niobium, 1), new MaterialStack(Titanium, 1)), EXT2_METAL, null, 4500);
    public static FluidMaterial NitroCarbon = new FluidMaterial(136, "nitro_carbon", "Nitro-Carbon", 0x004B64, FLUID, of(new MaterialStack(Nitrogen, 1), new MaterialStack(Carbon, 1)), 0);
    public static FluidMaterial NitrogenDioxide = new FluidMaterial(137, "nitrogen_dioxide", "Nitrogen Dioxide", 0x64AFFF, FLUID, of(new MaterialStack(Nitrogen, 1), new MaterialStack(Oxygen, 2)), 0);
    public static DustMaterial Obsidian = new DustMaterial(138, "obsidian", "Obsidian", 0x503264, DULL, of(new MaterialStack(Magnesium, 1), new MaterialStack(Iron, 1), new MaterialStack(Silicon, 2), new MaterialStack(Oxygen, 8)), 0);
    public static DustMaterial Phosphate = new DustMaterial(139, "phosphate", "Phosphate", 0xFFFF00, DULL, of(new MaterialStack(Phosphor, 1), new MaterialStack(Oxygen, 4)), GENERATE_ORE);
    public static MetalMaterial PigIron = new MetalMaterial(140, "pig_iron", "Pig Iron", 0xC8B4B4, METALLIC, of(new MaterialStack(Iron, 1)), EXT_METAL, 6.0F, 2, 384);
    public static SolidMaterial Plastic = new SolidMaterial(141, "plastic", "Polyethylene", 0xC8C8C8, DULL, of(new MaterialStack(Carbon, 1), new MaterialStack(Hydrogen, 2)), STD_SOLID | GENERATE_GEAR | GENERATE_FOIL, null, 3.0F, 1, 32);
    public static MetalMaterial Epoxid = new MetalMaterial(142, "epoxid", "Epoxid", 0xC88C14, DULL, of(new MaterialStack(Carbon, 2), new MaterialStack(Hydrogen, 4), new MaterialStack(Oxygen, 1)), EXT2_METAL, 3.0F, 1, 32);
    public static SolidMaterial Silicone = new SolidMaterial(143, "silicone", "Polysiloxane", 0xDCDCDC, DULL, of(new MaterialStack(Carbon, 1), new MaterialStack(Hydrogen, 1), new MaterialStack(Silicon, 2), new MaterialStack(Oxygen, 1)), STD_SOLID | GENERATE_GEAR | GENERATE_FOIL, null, 3.0F, 1, 128);
    public static SolidMaterial Polycaprolactam = new SolidMaterial(144, "polycaprolactam", "Polycaprolactam", 0x323232, DULL, of(new MaterialStack(Carbon, 6), new MaterialStack(Hydrogen, 11), new MaterialStack(Nitrogen, 1), new MaterialStack(Oxygen, 1)), STD_SOLID | GENERATE_GEAR | GENERATE_FOIL, null, 3.0F, 1, 32);
    public static SolidMaterial Polytetrafluoroethylene = new SolidMaterial(145, "polytetrafluoroethylene", "Polytetrafluoroethylene", 0x646464, DULL, of(new MaterialStack(Carbon, 2), new MaterialStack(Fluorine, 4)), STD_SOLID | GENERATE_GEAR | GENERATE_FOIL, null, 3.0F, 1, 32);
    public static DustMaterial Powellite = new DustMaterial(146, "powellite", "Powellite", 0xFFFF00, DULL, of(new MaterialStack(Calcium, 1), new MaterialStack(Molybdenum, 1), new MaterialStack(Oxygen, 4)), GENERATE_ORE);
    public static DustMaterial Pumice = new DustMaterial(147, "pumice", "Pumice", 0xE6B9B9, DULL, of(new MaterialStack(Stone, 1)), 0);
    public static DustMaterial Pyrite = new DustMaterial(148, "pyrite", "Pyrite", 0x967828, ROUGH, of(new MaterialStack(Iron, 1), new MaterialStack(Sulfur, 2)), GENERATE_ORE);
    public static DustMaterial Pyrolusite = new DustMaterial(149, "pyrolusite", "Pyrolusite", 0x9696AA, DULL, of(new MaterialStack(Manganese, 1), new MaterialStack(Oxygen, 2)), GENERATE_ORE);
    public static DustMaterial Pyrope = new DustMaterial(150, "pyrope", "Pyrope", 0x783264, METALLIC, of(new MaterialStack(Aluminium, 2), new MaterialStack(Magnesium, 3), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 12)), GENERATE_ORE);
    public static DustMaterial RockSalt = new DustMaterial(151, "rock_salt", "Rock Salt", 0xF0C8C8, FINE, of(new MaterialStack(Potassium, 1), new MaterialStack(Chlorine, 1)), GENERATE_ORE);
    public static SolidMaterial Rubber = new SolidMaterial(152, "rubber", "Rubber", 0x000000, SHINY, of(new MaterialStack(Carbon, 5), new MaterialStack(Hydrogen, 8)), STD_SOLID | GENERATE_GEAR | GENERATE_FOIL, null, 1.5F, 0, 16);
    public static DustMaterial RawRubber = new DustMaterial(153, "raw_rubber", "Raw Rubber", 0xCCC789, DULL, of(new MaterialStack(Carbon, 5), new MaterialStack(Hydrogen, 8)), 0);
    public static GemMaterial Ruby = new GemMaterial(154, "ruby", "Ruby", 0xFF6464, RUBY, of(new MaterialStack(Chrome, 1), new MaterialStack(Aluminium, 2), new MaterialStack(Oxygen, 3)), STD_GEM, 7.0F, 2, 256);
    public static DustMaterial Salt = new DustMaterial(155, "salt", "Salt", 0xFFFFFF, FINE, of(new MaterialStack(Sodium, 1), new MaterialStack(Chlorine, 1)), GENERATE_ORE);
    public static DustMaterial Saltpeter = new DustMaterial(156, "saltpeter", "Saltpeter", 0xE6E6E6, FINE, of(new MaterialStack(Potassium, 1), new MaterialStack(Nitrogen, 1), new MaterialStack(Oxygen, 3)), GENERATE_ORE);
    public static GemMaterial Sapphire = new GemMaterial(157, "sapphire", "Sapphire", 0x6464C8, GEM_VERTICAL, of(new MaterialStack(Aluminium, 2), new MaterialStack(Oxygen, 3)), STD_GEM, null, 7.0F, 2, 256);
    public static DustMaterial Scheelite = new DustMaterial(158, "scheelite", "Scheelite", 0xC88C14, DULL, of(new MaterialStack(Tungsten, 1), new MaterialStack(Calcium, 2), new MaterialStack(Oxygen, 4)), GENERATE_ORE);
    public static DustMaterial SiliconDioxide = new DustMaterial(159, "silicon_dioxide", "Silicon Dioxide", 0xC8C8C8, QUARTZ, of(new MaterialStack(Silicon, 1), new MaterialStack(Oxygen, 2)), 0);
    public static RoughMaterial Snow = new RoughMaterial(160, "snow", "Snow", 0xFFFFFF, FINE, of(new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 1)), 0);
    public static GemMaterial Sodalite = new GemMaterial(161, "sodalite", "Sodalite", 0x1414FF, LAPIS, of(new MaterialStack(Aluminium, 3), new MaterialStack(Silicon, 3), new MaterialStack(Sodium, 4), new MaterialStack(Chlorine, 1)), GENERATE_ORE | GENERATE_PLATE | GENERATE_ROD);
    public static FluidMaterial SodiumPersulfate = new FluidMaterial(162, "sodium_persulfate", "Sodium Persulfate", 0xFFFFFF, FLUID, of(new MaterialStack(Sodium, 1), new MaterialStack(Sulfur, 1), new MaterialStack(Oxygen, 4)), 0);
    public static FluidMaterial SodiumSulfide = new FluidMaterial(163, "sodium_sulfide", "Sodium Sulfide", 0xFFFFFF, FLUID, of(new MaterialStack(Sodium, 2), new MaterialStack(Sulfur, 1)), 0);
    public static FluidMaterial HydricSulfide = new FluidMaterial(164, "hydric_sulfide", "Hydrogen Sulfide", 0xFFFFFF, FLUID, of(new MaterialStack(Hydrogen, 2), new MaterialStack(Sulfur, 1)), 0);

    public static FluidMaterial OilHeavy = new FluidMaterial(165, "oil_heavy", "Heavy Oil", 0x0A0A0A, FLUID, of(), 0);
    public static FluidMaterial OilMedium = new FluidMaterial(166, "oil_medium", "Raw Oil", 0x0A0A0A, FLUID, of(), 0);
    public static FluidMaterial OilLight = new FluidMaterial(167, "oil_light", "Light Oil", 0x0A0A0A, FLUID, of(), 0);
    public static FluidMaterial NaturalGas = new FluidMaterial(168, "natural_gas", "Natural Gas", 0xFFFFFF, FLUID, of(), STATE_GAS);
    public static FluidMaterial SulfuricGas = new FluidMaterial(169, "sulfuric_gas", "Sulfuric Gas", 0xFFFFFF, FLUID, of(), STATE_GAS);
    public static FluidMaterial Gas = new FluidMaterial(170, "gas", "Refinery Gas", 0xFFFFFF, FLUID, of(), STATE_GAS);
    public static FluidMaterial SulfuricNaphtha = new FluidMaterial(171, "sulfuric_naphtha", "Sulfuric Naphtha", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial SulfuricLightFuel = new FluidMaterial(172, "sulfuric_ligh_fuel", "Sulfuric Light Fuel", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial SulfuricHeavyFuel = new FluidMaterial(173, "sulfuric_heavy_fuel", "Sulfuric Heavy Fuel", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial Naphtha = new FluidMaterial(174, "naphtha", "Naphtha", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial LightFuel = new FluidMaterial(175, "light_fuel", "Light Fuel", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial HeavyFuel = new FluidMaterial(176, "heavy_fuel", "Heavy Fuel", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial LPG = new FluidMaterial(177, "lpg", "LPG", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial CrackedLightFuel = new FluidMaterial(178, "cracked_light_fuel", "Cracked Light Fuel", 0xFFFF00, FLUID, of(), 0);
    public static FluidMaterial CrackedHeavyFuel = new FluidMaterial(179, "cracked_heavy_fuel", "Cracked Heavy Fuel", 0xFFFF00, FLUID, of(), 0);

    public static MetalMaterial SolderingAlloy = new MetalMaterial(180, "soldering_alloy", "Soldering Alloy", 0xDCDCE6, DULL, of(new MaterialStack(Tin, 9), new MaterialStack(Antimony, 1)), EXT_METAL, null, 400);
    public static DustMaterial Spessartine = new DustMaterial(181, "spessartine", "Spessartine", 0xFF6464, DULL, of(new MaterialStack(Aluminium, 2), new MaterialStack(Manganese, 3), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 12)), GENERATE_ORE);
    public static DustMaterial Sphalerite = new DustMaterial(182, "sphalerite", "Sphalerite", 0xFFFFFF, DULL, of(new MaterialStack(Zinc, 1), new MaterialStack(Sulfur, 1)), GENERATE_ORE);
    public static MetalMaterial StainlessSteel = new MetalMaterial(183, "stainless_steel", "Stainless Steel", 0xC8C8DC, SHINY, of(new MaterialStack(Iron, 6), new MaterialStack(Chrome, 1), new MaterialStack(Manganese, 1), new MaterialStack(Nickel, 1)), EXT2_METAL, null, 7.0F, 2, 480, 1700);
    public static MetalMaterial Steel = new MetalMaterial(184, "steel", "Steel", 0x808080, METALLIC, of(new MaterialStack(Iron, 50), new MaterialStack(Carbon, 1)), EXT2_METAL, null, 6.0F, 2, 512, 1000);
    public static DustMaterial Stibnite = new DustMaterial(185, "stibnite", "Stibnite", 0x464646, METALLIC, of(new MaterialStack(Antimony, 2), new MaterialStack(Sulfur, 3)), GENERATE_ORE);
    public static FluidMaterial SulfuricAcid = new FluidMaterial(186, "sulfuric_acid", "Sulfuric Acid", 0xFF8000, FLUID, of(new MaterialStack(Hydrogen, 2), new MaterialStack(Sulfur, 1), new MaterialStack(Oxygen, 4)), 0);
    public static GemMaterial Tanzanite = new GemMaterial(187, "tanzanite", "Tanzanite", 0x4000C8, GEM_VERTICAL, of(new MaterialStack(Calcium, 2), new MaterialStack(Aluminium, 3), new MaterialStack(Silicon, 3), new MaterialStack(Hydrogen, 1), new MaterialStack(Oxygen, 13)), EXT_METAL | GENERATE_ORE, null, 7.0F, 2, 256);
    public static DustMaterial Tetrahedrite = new DustMaterial(188, "tetrahedrite", "Tetrahedrite", 0xC82000, DULL, of(new MaterialStack(Copper, 3), new MaterialStack(Antimony, 1), new MaterialStack(Sulfur, 3), new MaterialStack(Iron, 1)), GENERATE_ORE);
    public static MetalMaterial TinAlloy = new MetalMaterial(189, "tin_alloy", "Tin Alloy", 0xC8C8C8, METALLIC, of(new MaterialStack(Tin, 1), new MaterialStack(Iron, 1)), EXT2_METAL, null, 6.5F, 2, 96);
    public static GemMaterial Topaz = new GemMaterial(190, "topaz", "Topaz", 0xFF8000, GEM_HORIZONTAL, of(new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 1), new MaterialStack(Fluorine, 2), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 6)), STD_GEM, null, 7.0F, 3, 256);
    public static MetalMaterial Tungstate = new MetalMaterial(191, "tungstate", "Tungstate", 0x373223, DULL, of(new MaterialStack(Tungsten, 1), new MaterialStack(Lithium, 2), new MaterialStack(Oxygen, 4)), GENERATE_ORE, null, 2500);
    public static MetalMaterial Ultimet = new MetalMaterial(192, "ultimet", "Ultimet", 0xB4B4E6, SHINY, of(new MaterialStack(Cobalt, 5), new MaterialStack(Chrome, 2), new MaterialStack(Nickel, 1), new MaterialStack(Molybdenum, 1)), EXT2_METAL, null, 9.0F, 4, 2048, 2700);
    public static DustMaterial Uraninite = new DustMaterial(193, "uraninite", "Uraninite", 0x232323, METALLIC, of(new MaterialStack(Uranium, 1), new MaterialStack(Oxygen, 2)), 0);
    public static DustMaterial Uvarovite = new DustMaterial(194, "uvarovite", "Uvarovite", 0xB4FFB4, DIAMOND, of(new MaterialStack(Calcium, 3), new MaterialStack(Chrome, 2), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 12)), 0);
    public static MetalMaterial VanadiumGallium = new MetalMaterial(195, "vanadium_gallium", "Vanadium-Gallium", 0x80808C, SHINY, of(new MaterialStack(Vanadium, 3), new MaterialStack(Gallium, 1)), 0, null, 4500);
    public static SolidMaterial Wood = new SolidMaterial(196, "wood", "Wood", 0x643200, WOOD, of(new MaterialStack(Carbon, 1), new MaterialStack(Oxygen, 1), new MaterialStack(Hydrogen, 1)), STD_SOLID, null, 2.0F, 0, 16);
    public static MetalMaterial WroughtIron = new MetalMaterial(197, "wrought_iron", "Wrought Iron", 0xC8B4B4, METALLIC, of(new MaterialStack(Iron, 1)), EXT2_METAL, null, 6.0F, 2, 384);
    public static DustMaterial Wulfenite = new DustMaterial(198, "wulfenite", "Wulfenite", 0xFF8000, DULL, of(new MaterialStack(Lead, 1), new MaterialStack(Molybdenum, 1), new MaterialStack(Oxygen, 4)), GENERATE_ORE);
    public static DustMaterial YellowLimonite = new DustMaterial(199, "yellow_limonite", "Yellow Limonite", 0xC8C800, METALLIC, of(new MaterialStack(Iron, 1), new MaterialStack(Hydrogen, 1), new MaterialStack(Oxygen, 2)), GENERATE_ORE);
    public static MetalMaterial YttriumBariumCuprate = new MetalMaterial(200, "yttrium_barium_cuprate", "Yttrium Barium Cuprate", 0x504046, METALLIC, of(new MaterialStack(Yttrium, 1), new MaterialStack(Barium, 2), new MaterialStack(Copper, 3), new MaterialStack(Oxygen, 7)), EXT_METAL, null, 4500);
    public static SolidMaterial NetherQuartz = new SolidMaterial(201, "nether_quartz", "Nether Quartz", 0xE6D2D2, QUARTZ, of(), STD_SOLID, null, 1.0F, 1, 32);
    public static SolidMaterial CertusQuartz = new SolidMaterial(202, "certus_quartz", "Certus Quartz", 0xD2D2E6, QUARTZ, of(), STD_SOLID, null, 5.0F, 1, 32);
    public static SolidMaterial Quartzite = new SolidMaterial(203, "quartzite", "Quartzite", 0xD2E6D2, QUARTZ, of(), 0);
    public static SolidMaterial Graphite = new SolidMaterial(204, "graphite", "Graphite", 0x808080, DULL, of(), GENERATE_ORE, null, 5.0F, 2, 32);
    public static SolidMaterial Graphene = new SolidMaterial(205, "graphene", "Graphene", 0x808080, DULL, of(), 0, null, 6.0F, 1, 32);
    public static GemMaterial Jasper = new GemMaterial(206, "jasper", "Jasper", 0xC85050, EMERALD, of(), STD_GEM);
    public static MetalMaterial Osmiridium = new MetalMaterial(207, "osmiridium", "Osmiridium", 0x6464FF, METALLIC, of(new MaterialStack(Iridium, 3), new MaterialStack(Osmium, 1)), EXT2_METAL, null,	7.0F, 3, 1600, 2500);

    public static Material FreshWater = new Material(-1, FLUID, 		1.0F, 0, 0, 16, 0, 0, 255, 0, "freshWater", "Fresh Water", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeBlue, 0)
    public static Material IronCompressed = new Material(-1, METALLIC, 7.0F, 96, 1, 1|2|64|128, 128, 128, 128, 0, "iron_compressed", "Compressed Iron", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeGray, 2)
    public static Material SaltWater = new Material(-1, FLUID, 		1.0F, 0, 0, 16, 0, 0, 255, 0, "salt_water", "Salt Water", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeBlue, 0)
    public static Material AluminiumBrass = new Material(-1, METALLIC, 6.0F, 64, 2, 1|2|64, 255, 255, 255, 0, "aluminium_brass", "Aluminium Brass", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeYellow);

    /**
     * Second Degree Compounds
     */
    public static SolidMaterial WoodSealed = new SolidMaterial(208, "wood_sealed", "Sealed Wood", 0x502800, WOOD, of(new MaterialStack(Wood, 1)), STD_SOLID, null, 3.0F, 0, 24);
    public static GemMaterial Glass = new GemMaterial(209, "glass", "Glass", 0xFFFFFF, GLASS, of(new MaterialStack(SiliconDioxide, 1)), GENERATE_PLATE | GENERATE_LENSE);
    public static DustMaterial Perlite = new DustMaterial(210, "perlite", "Perlite", 0x1E141E, DULL, of(new MaterialStack(Obsidian, 2), new MaterialStack(Water, 1)), 0);
    public static DustMaterial Borax = new DustMaterial(210, "borax", "Borax", 0xFFFFFF, FINE, of(new MaterialStack(Sodium, 2), new MaterialStack(Boron, 4), new MaterialStack(Water, 10), new MaterialStack(Oxygen, 7)), 0);
    public static RoughMaterial Lignite = new RoughMaterial(211, "lignite", "Lignite Coal", 0x644646, LIGNITE, of(new MaterialStack(Carbon, 2), new MaterialStack(Water, 4), new MaterialStack(DarkAsh, 1)), GENERATE_ORE);
    public static GemMaterial Olivine = new GemMaterial(212, "olivine", "Olivine", 0x96FF96, RUBY, of(new MaterialStack(Magnesium, 2), new MaterialStack(Iron, 1), new MaterialStack(SiliconDioxide, 2)), STD_GEM, 7.0F, 2, 256);
    public static GemMaterial Opal = new GemMaterial(213, "opal", "Opal", 0x0000FF, OPAL, of(new MaterialStack(SiliconDioxide, 1)), STD_GEM, 7.0F, 2, 256);
    public static GemMaterial Amethyst = new GemMaterial(214, "amethyst", "Amethyst", 0xD232D2, FLINT, of(new MaterialStack(SiliconDioxide, 4), new MaterialStack(Iron, 1)), STD_GEM, 7.0F, 3, 256);
    public static DustMaterial Redstone = new DustMaterial(215, "redstone", "Redstone", 0xC80000, ROUGH, of(new MaterialStack(Silicon, 1), new MaterialStack(Pyrite, 5), new MaterialStack(Ruby, 1), new MaterialStack(Mercury, 3)), GENERATE_ORE);
	public static GemMaterial Lapis = new GemMaterial(216, "lapis", "Lapis", 0x4646DC, LAPIS, of(new MaterialStack(Lazurite, 12), new MaterialStack(Sodalite, 2), new MaterialStack(Pyrite, 1), new MaterialStack(Calcite, 1)), STD_GEM);
    public static DustMaterial Blaze = new DustMaterial(217, "blaze", "Blaze", 0xFFC800, POWDER, of(new MaterialStack(DarkAsh, 1), new MaterialStack(Sulfur, 1)), 0);
    public static GemMaterial EnderPearl = new GemMaterial(218, "ender_pearl", "Enderpearl", 0x6CDCC8, SHINY, of(new MaterialStack(Beryllium, 1), new MaterialStack(Potassium, 4), new MaterialStack(Nitrogen, 5)), GENERATE_PLATE | GENERATE_LENSE, null, 1.0F, 1, 16);
    public static GemMaterial EnderEye = new GemMaterial(219, "ender_eye", "Endereye", 0xFAE600, SHINY, of(new MaterialStack(EnderPearl, 1), new MaterialStack(Blaze, 1)), GENERATE_PLATE | GENERATE_LENSE, null, 1.0F, 1, 16);
    public static SolidMaterial Flint = new SolidMaterial(220, "flint", "Flint", 0x002040, FLINT, of(new MaterialStack(SiliconDioxide, 1)), 0, null, 2.5F, 1, 64);
    public static DustMaterial Diatomite = new DustMaterial(221, "diatomite", "Diatomite", 0xE1E1E1, DULL, of(new MaterialStack(Flint, 8), new MaterialStack(BandedIron, 1), new MaterialStack(Sapphire, 1)), 0);
    public static DustMaterial VolcanicAsh = new DustMaterial(222, "volcanic_ash", "Volcanic Ashes", 0x3C3232, FLINT, of(new MaterialStack(Flint, 6), new MaterialStack(Iron, 1), new MaterialStack(Magnesium, 1)), 0);
    public static RoughMaterial Niter = new RoughMaterial(223, "niter", "Niter", 0xFFC8C8, FLINT, of(new MaterialStack(Saltpeter, 1)), 0);
    public static DustMaterial Pyrotheum = new DustMaterial(224, "pyrotheum", "Pyrotheum", 0xFF8000, FIERY, of(new MaterialStack(Coal, 1), new MaterialStack(Redstone, 1), new MaterialStack(Blaze, 1)), 0);
    public static DustMaterial HydratedCoal = new DustMaterial(225, "hydrated_coal", "Hydrated Coal", 0x464664, ROUGH, of(new MaterialStack(Coal, 8), new MaterialStack(Water, 1)), 0);
    public static GemMaterial Apatite = new GemMaterial(226, "apatite", "Apatite", 0xC8C8FF, DIAMOND, of(new MaterialStack(Calcium, 5), new MaterialStack(Phosphate, 3), new MaterialStack(Chlorine, 1)), GENERATE_ORE);

    public static Material Alumite = new Material(-1, METALLIC, 		1.5F, 64, 0, 1|2|64, 255, 255, 255, 0, "alumite", "Alumite", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyePink, 2)
    public static Material Manyullyn = new Material(-1, METALLIC, 		1.5F, 64, 0, 1|2|64, 255, 255, 255, 0, "manyullyn", "Manyullyn", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyePurple, 2)

    public static MetalMaterial SterlingSilver = new MetalMaterial(227, "sterling_silver", "Sterling Silver", 0xFADCE1, SHINY, of(new MaterialStack(Copper, 1), new MaterialStack(Silver, 4)), EXT2_METAL, null, 13.0F, 2, 128, 1700);
    public static MetalMaterial RoseGold = new MetalMaterial(228, "rose_gold", "Rose Gold", 0xFFE61E, SHINY, of(new MaterialStack(Copper, 1), new MaterialStack(Gold, 4)), EXT2_METAL, null, 14.0F, 2, 128, 1600);
    public static MetalMaterial BlackBronze = new MetalMaterial(229, "black_bronze", "Black Bronze", 0x64327D, DULL, of(new MaterialStack(Gold, 1), new MaterialStack(Silver, 1), new MaterialStack(Copper, 3)), EXT2_METAL, null, 12.0F, 2, 256, 2000);
    public static MetalMaterial BismuthBronze = new MetalMaterial(230, "bismuth_bronze", "Bismuth Bronze", 0x647D7D, DULL, of(new MaterialStack(Bismuth, 1), new MaterialStack(Zinc, 1), new MaterialStack(Copper, 3)), EXT2_METAL, null, 8.0F, 2, 256, 1100);
    public static MetalMaterial BlackSteel = new MetalMaterial(231, "black_steel", "Black Steel", 0x646464, METALLIC, of(new MaterialStack(Nickel, 1), new MaterialStack(BlackBronze, 1), new MaterialStack(Steel, 3)), EXT_METAL, null, 6.5F, 2, 768, 1200);
    public static MetalMaterial RedSteel = new MetalMaterial(232, "red_steel", "Red Steel", 0x8C6464, METALLIC, of(new MaterialStack(SterlingSilver, 1), new MaterialStack(BismuthBronze, 1), new MaterialStack(Steel, 2), new MaterialStack(BlackSteel, 4)), EXT_METAL, null, 7.0F, 2, 896, 1300);
    public static MetalMaterial BlueSteel = new MetalMaterial(233, "blue_steel", "Blue Steel", 0x64648C, METALLIC, of(new MaterialStack(RoseGold, 1), new MaterialStack(Brass, 1), new MaterialStack(Steel, 2), new MaterialStack(BlackSteel, 4)), EXT_METAL, null, 7.5F, 2, 1024, 1400);
    public static MetalMaterial DamascusSteel = new MetalMaterial(234, "damascus_steel", "Damascus Steel", 0x6E6E6E, METALLIC, of(new MaterialStack(Steel, 1)), EXT_METAL, null, 8.0F, 2, 1280, 1500);
    public static MetalMaterial TungstenSteel = new MetalMaterial(235, "tungsten_steel", "Tungstensteel", 0x6464A0, METALLIC, of(new MaterialStack(Steel, 1), new MaterialStack(Tungsten, 1)), EXT2_METAL, null, 8.0F, 4, 2560, 3000);
    public static FluidMaterial NitroFuel = new FluidMaterial(236, "nitro_fuel", "Nitro-Diesel", 0xC8FF00, FLUID, of(new MaterialStack(Glyceryl, 1), new MaterialStack(Fuel, 4)), 0);
    public static MetalMaterial RedAlloy = new MetalMaterial(237, "red_alloy", "Red Alloy", 0xC80000, DULL, of(new MaterialStack(Metal, 1), new MaterialStack(Redstone, 4)), GENERATE_PLATE | GENERATE_FINE_WIRE);
    public static MetalMaterial CobaltBrass = new MetalMaterial(238, "cobalt_brass", "Cobalt Brass", 0xB4B4A0, METALLIC, of(new MaterialStack(Brass, 7), new MaterialStack(Aluminium, 1), new MaterialStack(Cobalt, 1)), EXT2_METAL, null, 8.0F, 2, 256);
    public static RoughMaterial Phosphorus = new RoughMaterial(239, "phosphorus", "Phosphorus", 0xFFFF00, FLINT, of(new MaterialStack(Calcium, 3), new MaterialStack(Phosphate, 2)), GENERATE_ORE);
    public static DustMaterial Basalt = new DustMaterial(240, "basalt", "Basalt", 0x1E1414, ROUGH, of(new MaterialStack(Olivine, 1), new MaterialStack(Calcite, 3), new MaterialStack(Flint, 8), new MaterialStack(DarkAsh, 4)), 0);
    public static SolidMaterial Andesite = new SolidMaterial(241, "andesite", "Andesite", 0xBEBEBE, ROUGH, of(), 0, null, 4.0F, 1, 32);
    public static SolidMaterial Diorite = new SolidMaterial(242, "diorite", "Diorite", 0xFFFFFF, ROUGH, of(), 0, null, 4.0F, 1, 32);
    public static GemMaterial GarnetRed = new GemMaterial(243, "garnet_red", "Red Garnet", 0xC85050, RUBY, of(new MaterialStack(Pyrope, 3), new MaterialStack(Almandine, 5), new MaterialStack(Spessartine, 8)), STD_SOLID | GENERATE_LENSE, null, 7.0F, 2, 128);
    public static GemMaterial GarnetYellow = new GemMaterial(244, "garnet_yellow", "Yellow Garnet", 0xC8C850, RUBY, of(new MaterialStack(Andradite, 5), new MaterialStack(Grossular, 8), new MaterialStack(Uvarovite, 3)), STD_SOLID | GENERATE_LENSE, null, 7.0F, 2, 128);
    public static DustMaterial Marble = new DustMaterial(245, "marble", "Marble", 0xC8C8C8, FINE, of(new MaterialStack(Magnesium, 1), new MaterialStack(Calcite, 7)), 0);
    public static DustMaterial Sugar = new DustMaterial(246, "sugar", "Sugar", 0xFAFAFA, FINE, of(new MaterialStack(Carbon, 2), new MaterialStack(Water, 5), new MaterialStack(Oxygen, 25)), 0);
    public static GemMaterial Vinteum = new GemMaterial(247, "vinteum", "Vinteum", 0x64C8FF, EMERALD, of(), STD_GEM, 10.0F, 3, 128);
    public static DustMaterial Redrock = new DustMaterial(248, "redrock", "Redrock", 0xFF5032, ROUGH, of(new MaterialStack(Calcite, 2), new MaterialStack(Flint, 1), new MaterialStack(Clay, 1)), 0);
    public static DustMaterial PotassiumFeldspar = new DustMaterial(249, "potassium_feldspar", "Potassium Feldspar", 0x782828, FINE, of(new MaterialStack(Potassium, 1), new MaterialStack(Aluminium, 1), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 8)), 0);
    public static DustMaterial Biotite = new DustMaterial(250, "biotite", "Biotite", 0x141E14, METALLIC, of(new MaterialStack(Potassium, 1), new MaterialStack(Magnesium, 3), new MaterialStack(Aluminium, 3), new MaterialStack(Fluorine, 2), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 10)), 0);
    public static DustMaterial GraniteBlack = new DustMaterial(251, "granite_black", "Black Granite", 0x0A0A0A, ROUGH, of(new MaterialStack(SiliconDioxide, 4), new MaterialStack(Biotite, 1)), 0);
    public static DustMaterial GraniteRed = new DustMaterial(252, "granite_red", "Red Granite", 0xFF0080, ROUGH, of(new MaterialStack(Aluminium, 2), new MaterialStack(PotassiumFeldspar, 1), new MaterialStack(Oxygen, 3)), 0);
    public static DustMaterial Chrysotile = new DustMaterial(253, "chrysotile", "Chrysotile", 0x6E8C6E, DULL, of(new MaterialStack(Asbestos, 1)), 0);
    public static DustMaterial Realgar = new DustMaterial(254, "realgar", "Realgar", 0x8C6464, DULL, of(new MaterialStack(Arsenic, 4), new MaterialStack(Sulfur, 4)), 0);
    public static DustMaterial VanadiumMagnetite = new DustMaterial(255, "vanadium_magnetite", "Vanadium Magnetite", 0x23233C, METALLIC, of(new MaterialStack(Magnetite, 1), new MaterialStack(Vanadium, 1)), GENERATE_ORE);
    public static DustMaterial BasalticMineralSand = new DustMaterial(266, "basaltic_mineral_sand", "Basaltic Mineral Sand", 0x283228, SAND, of(new MaterialStack(Magnetite, 1), new MaterialStack(Basalt, 1)), 0);
    public static DustMaterial GraniticMineralSand = new DustMaterial(267, "granitic_mineral_sand", "Granitic Mineral Sand", 0x283C3C, SAND, of(new MaterialStack(Magnetite, 1), new MaterialStack(GraniteBlack, 1)), 0);
    public static DustMaterial GarnetSand = new DustMaterial(268, "garnet_sand", "Garnet Sand", 0xC86400, SAND, of(new MaterialStack(GarnetRed, 1), new MaterialStack(GarnetYellow, 1)), 0);
    public static DustMaterial QuartzSand = new DustMaterial(269, "quartz_sand", "Quartz Sand", 0xC8C8C8, SAND, of(new MaterialStack(CertusQuartz, 1), new MaterialStack(Quartzite, 1)), 0);
    public static DustMaterial Bastnasite = new DustMaterial(270, "bastnasite", "Bastnasite", 0xC86E2D, FINE, of(new MaterialStack(Cerium, 1), new MaterialStack(Carbon, 1), new MaterialStack(Fluorine, 1), new MaterialStack(Oxygen, 3)), GENERATE_ORE);
    public static DustMaterial Pentlandite = new DustMaterial(271, "pentlandite", "Pentlandite", 0xA59605, DULL, of(new MaterialStack(Nickel, 9), new MaterialStack(Sulfur, 8)), GENERATE_ORE);
    public static DustMaterial Spodumene = new DustMaterial(272, "spodumene", "Spodumene", 0xBEAAAA, DULL, of(new MaterialStack(Lithium, 1), new MaterialStack(Aluminium, 1), new MaterialStack(Silicon, 2), new MaterialStack(Oxygen, 6)), GENERATE_ORE);
    public static DustMaterial Pollucite = new DustMaterial(273, "pollucite", "Pollucite", 0xF0D2D2, DULL, of(new MaterialStack(Caesium, 2), new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 4), new MaterialStack(Water, 2), new MaterialStack(Oxygen, 12)), 0);
    public static DustMaterial Tantalite = new DustMaterial(274, "tantalite", "Tantalite", 0x915028, METALLIC, of(new MaterialStack(Manganese, 1), new MaterialStack(Tantalum, 2), new MaterialStack(Oxygen, 6)), GENERATE_ORE);
    public static DustMaterial Lepidolite = new DustMaterial(274, "lepidolite", "Lepidolite", 0xF0328C, FINE, of(new MaterialStack(Potassium, 1), new MaterialStack(Lithium, 3), new MaterialStack(Aluminium, 4), new MaterialStack(Fluorine, 2), new MaterialStack(Oxygen, 10)), GENERATE_ORE);
    public static DustMaterial Glauconite = new DustMaterial(275, "glauconite", "Glauconite", 0x82B43C, DULL, of(new MaterialStack(Potassium, 1), new MaterialStack(Magnesium, 2), new MaterialStack(Aluminium, 4), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 12)), GENERATE_ORE);
    public static DustMaterial GlauconiteSand = new DustMaterial(276, "glauconite_sand", "Glauconite Sand", 0x82B43C, DULL, of(new MaterialStack(Potassium, 1), new MaterialStack(Magnesium, 2), new MaterialStack(Aluminium, 4), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 12)), 0);
    public static DustMaterial Vermiculite = new DustMaterial(277, "vermiculite", "Vermiculite", 0xC8B40F, METALLIC, of(new MaterialStack(Iron, 3), new MaterialStack(Aluminium, 4), new MaterialStack(Silicon, 4), new MaterialStack(Hydrogen, 2), new MaterialStack(Water, 4), new MaterialStack(Oxygen, 12)), 0);
    public static DustMaterial Bentonite = new DustMaterial(278, "bentonite", "Bentonite", 0xF5D7D2, ROUGH, of(new MaterialStack(Sodium, 1), new MaterialStack(Magnesium, 6), new MaterialStack(Silicon, 12), new MaterialStack(Hydrogen, 6), new MaterialStack(Water, 5), new MaterialStack(Oxygen, 36)), GENERATE_ORE);
    public static DustMaterial FullersEarth = new DustMaterial(279, "fullers_earth", "Fullers Earth", 0xA0A078, FINE, of(new MaterialStack(Magnesium, 1), new MaterialStack(Silicon, 4), new MaterialStack(Hydrogen, 1), new MaterialStack(Water, 4), new MaterialStack(Oxygen, 11)), 0);
    public static DustMaterial Pitchblende = new DustMaterial(280, "pitchblende", "Pitchblende", 0xC8D200, DULL, of(new MaterialStack(Uraninite, 3), new MaterialStack(Thorium, 1), new MaterialStack(Lead, 1)), GENERATE_ORE);
    public static GemMaterial Monazite = new GemMaterial(281, "monazite", "Monazite", 0x324632, DIAMOND, of(new MaterialStack(RareEarth, 1), new MaterialStack(Phosphate, 1)), GENERATE_ORE);
    public static DustMaterial Malachite = new DustMaterial(282, "malachite", "Malachite", 0x055F05, DULL, of(new MaterialStack(Copper, 2), new MaterialStack(Carbon, 1), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 5)), GENERATE_ORE);
    public static DustMaterial Mirabilite = new DustMaterial(283, "mirabilite", "Mirabilite", 0xF0FAD2, DULL, of(new MaterialStack(Sodium, 2), new MaterialStack(Sulfur, 1), new MaterialStack(Water, 10), new MaterialStack(Oxygen, 4)), 0);
    public static DustMaterial Mica = new DustMaterial(284, "mica", "Mica", 0xC3C3CD, FINE, of(new MaterialStack(Potassium, 1), new MaterialStack(Aluminium, 3), new MaterialStack(Silicon, 3), new MaterialStack(Fluorine, 2), new MaterialStack(Oxygen, 10)), 0);
    public static DustMaterial Trona = new DustMaterial(285, "trona", "Trona", 0x87875F, METALLIC, of(new MaterialStack(Sodium, 3), new MaterialStack(Carbon, 2), new MaterialStack(Hydrogen, 1), new MaterialStack(Water, 2), new MaterialStack(Oxygen, 6)), 0);
    public static DustMaterial Barite = new DustMaterial(286, "barite", "Barite", 0xE6EBFF, DULL, of(new MaterialStack(Barium, 1), new MaterialStack(Sulfur, 1), new MaterialStack(Oxygen, 4)), GENERATE_ORE);
    public static DustMaterial Gypsum = new DustMaterial(287, "gypsum", "Gypsum", 0xE6E6FA, DULL, of(new MaterialStack(Calcium, 1), new MaterialStack(Sulfur, 1), new MaterialStack(Water, 2), new MaterialStack(Oxygen, 4)), 0);
    public static DustMaterial Alunite = new DustMaterial(288, "alunite", "Alunite", 0xE1B441, METALLIC, of(new MaterialStack(Potassium, 1), new MaterialStack(Aluminium, 3), new MaterialStack(Silicon, 2), new MaterialStack(Hydrogen, 6), new MaterialStack(Oxygen, 14)), 0);
    public static DustMaterial Dolomite = new DustMaterial(289, "dolomite", "Dolomite", 0xE1CDCD, FLINT, of(new MaterialStack(Calcium, 1), new MaterialStack(Magnesium, 1), new MaterialStack(Carbon, 2), new MaterialStack(Oxygen, 6)), 0);
    public static DustMaterial Wollastonite = new DustMaterial(290, "wollastonite", "Wollastonite", 0xF0F0F0, DULL, of(new MaterialStack(Calcium, 1), new MaterialStack(Silicon, 1), new MaterialStack(Oxygen, 3)), 0);
    public static DustMaterial Zeolite = new DustMaterial(291, "zeolite", "Zeolite", 0xF0E6E6, DULL, of(new MaterialStack(Sodium, 1), new MaterialStack(Calcium, 4), new MaterialStack(Silicon, 27), new MaterialStack(Aluminium, 9), new MaterialStack(Water, 28), new MaterialStack(Oxygen, 72)), 0);
    public static DustMaterial Kyanite = new DustMaterial(292, "kyanite", "Kyanite", 0x6E6EFA, FLINT, of(new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 1), new MaterialStack(Oxygen, 5)), 0);
    public static DustMaterial Kaolinite = new DustMaterial(293, "kaolinite", "Kaolinite", 0xF5EBEB, DULL, of(new MaterialStack(Aluminium, 2), new MaterialStack(Silicon, 2), new MaterialStack(Hydrogen, 4), new MaterialStack(Oxygen, 9)), 0);
    public static DustMaterial Talc = new DustMaterial(294, "talc", "Talc", 0x5AB45A, DULL, of(new MaterialStack(Magnesium, 3), new MaterialStack(Silicon, 4), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 12)), GENERATE_ORE);
    public static DustMaterial Soapstone = new DustMaterial(295, "soapstone", "Soapstone", 0x5F915F, DULL, of(new MaterialStack(Magnesium, 3), new MaterialStack(Silicon, 4), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 12)), GENERATE_ORE);
    public static DustMaterial Concrete = new DustMaterial(296, "concrete", "Concrete", 0x646464, ROUGH, of(new MaterialStack(Stone, 1)), 0);
    public static MetalMaterial IronMagnetic = new MetalMaterial(297, "iron_magnetic", "Magnetic Iron", 0xC8C8C8, MAGNETIC, of(new MaterialStack(Iron, 1)), EXT2_METAL, null, 6.0F, 2, 256);
    public static MetalMaterial SteelMagnetic = new MetalMaterial(298, "steel_magnetic", "Magnetic Steel", 0x808080, MAGNETIC, of(new MaterialStack(Steel, 1)), EXT2_METAL, null, 6.0F, 2, 512, 1000);
    public static MetalMaterial NeodymiumMagnetic = new MetalMaterial(299, "neodymium_magnetic", "Magnetic Neodymium", 0x646464, MAGNETIC, of(new MaterialStack(Neodymium, 1)), EXT2_METAL, null, 7.0F, 2, 512, 1297);
    public static MetalMaterial TungstenCarbide = new MetalMaterial(300, "tungsten_carbide", "Tungstencarbide", 0x330066, METALLIC, of(new MaterialStack(Tungsten, 1)), EXT2_METAL, null, 14.0F, 4, 1280, 2460);
    public static MetalMaterial VanadiumSteel = new MetalMaterial(301, "vanadium_steel", "Vanadiumsteel", 0xC0C0C0, METALLIC, of(new MaterialStack(Vanadium, 1), new MaterialStack(Chrome, 1), new MaterialStack(Steel, 7)), EXT2_METAL, null, 3.0F, 3, 1920, 1453);
    public static MetalMaterial HSSG = new MetalMaterial(302, "hssg", "HSS-G", 0x999900, METALLIC, of(new MaterialStack(TungstenSteel, 5), new MaterialStack(Chrome, 1), new MaterialStack(Molybdenum, 2), new MaterialStack(Vanadium, 1)), EXT2_METAL, null, 10.0F, 3, 4000, 4500);
    public static MetalMaterial HSSE = new MetalMaterial(303, "hsse", "HSS-E", 0x336600, METALLIC, of(new MaterialStack(HSSG, 6), new MaterialStack(Cobalt, 1), new MaterialStack(Manganese, 1), new MaterialStack(Silicon, 1)), EXT2_METAL, null, 10.0F, 4, 5120, 5400);
    public static MetalMaterial HSSS = new MetalMaterial(304, "hsss", "HSS-S", 0x660033, METALLIC, of(new MaterialStack(HSSG, 6), new MaterialStack(Iridium, 2), new MaterialStack(Osmium, 1)), EXT2_METAL, null, 14.0F, 4, 3000, 5400);

    /**
     * The "Random Material" ones.
     */
    public static Material AnyCopper = new MarkerMaterial("any_copper", "AnyCopper");
    public static Material AnyBronze = new MarkerMaterial("any_bronze", "AnyBronze");
    public static Material AnyIron = new MarkerMaterial("any_iron", "AnyIron");

    /**
     * Clear matter materials
     */
    public static Material Antimatter = new Material(-1, NONE, 	1.0F, 0, 0, 0, 255, 255, 255, 0, "antimatter", "Antimatter", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyePink)
    public static Material UUAmplifier = new Material(721, FLUID, 	1.0F, 0, 1, 16, 96, 0, 128, 0, "uuamplifier", "UU-Amplifier", 0, 0, -1, 0, false, false, 10, 1, 1, Dyes.dyePink);
    public static Material UUMatter = new Material(703, FLUID, 	1.0F, 0, 1, 16, 128, 0, 196, 0, "uumatter", "UU-Matter", 0, 0, -1, 0, false, false, 10, 1, 1, Dyes.dyePink);

    /**
     * Not possible to determine exact Components
     */
    public static Material Sand = new Material(-1, NONE, 			1.0F, 0, 1, 0, 255, 255, 255, 0, "sand", "Sand", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeYellow);
    public static Material ConstructionFoam = new Material(854, DULL, 1.0F, 0, 2, 1 |16, 128, 128, 128, 0, "construction_foam", "Construction Foam", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeGray);
    public static Material BioFuel = new Material(705, FLUID, 		1.0F, 0, 0, 16, 255, 128, 0, 0, "bio_fuel", "Biofuel", 0, 6, -1, 0, false, false, 1, 1, 1, Dyes.dyeOrange);
    public static Material Biomass = new Material(704, FLUID, 		1.0F, 0, 0, 16, 0, 255, 0, 0, "biomass", "Biomass", 3, 8, -1, 0, false, false, 1, 1, 1, Dyes.dyeGreen);
    public static Material Creosote = new Material(712, FLUID, 	1.0F, 0, 0, 16, 128, 64, 0, 0, "creosote", "Creosote", 3, 8, -1, 0, false, false, 1, 1, 1, Dyes.dyeBrown);
    public static Material Ethanol = new Material(706, FLUID, 		1.0F, 0, 0, 16, 255, 128, 0, 0, "ethanol", "Ethanol", 0, 128, -1, 0, false, false, 1, 1, 1, Dyes.dyePurple);
    public static Material Fuel = new Material(708, FLUID, 		1.0F, 0, 0, 16, 255, 255, 0, 0, "fuel", "Diesel", 0, 128, -1, 0, false, false, 1, 1, 1, Dyes.dyeYellow);
    public static Material Glue = new Material(726, FLUID, 		1.0F, 0, 0, 16, 200, 196, 0, 0, "glue", "Glue", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeOrange)
    public static Material Gunpowder = new Material(800, DULL, 	1.0F, 0, 0, 1, 128, 128, 128, 0, "gunpowder", "Gunpowder", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeGray)
    public static Material Leather = new Material(-1, ROUGH, 		1.0F, 0, 0, 1, 150, 150, 80, 127, "leather", "Leather", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeOrange);
    public static Material Lubricant = new Material(724, FLUID, 	1.0F, 0, 0, 16, 255, 196, 0, 0, "lubricant", "Lubricant", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeOrange)
    public static Material McGuffium239 = new Material(999, FLUID, 1.0F, 0, 0, 16, 200, 50, 150, 0, "mc_guffium239", "Mc Guffium 239", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyePink)
    public static Material Oil = new Material(707, FLUID, 			1.0F, 0, 0, 16, 10, 10, 10, 0, "oil", "Oil", 3, 16, -1, 0, false, false, 1, 1, 1, Dyes.dyeBlack);
    public static Material Oilsands = new Material(878, NONE, 		1.0F, 0, 1, 1|8 , 10, 10, 10, 0, "oilsands", "Oilsands", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes._NULL);
    public static Material Paper = new Material(879, PAPER, 		1.0F, 0, 0, 1, 250, 250, 250, 0, "paper", "Paper", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeWhite)
    public static Material RareEarth = new Material(891, FINE, 	1.0F, 0, 0, 1, 128, 128, 100, 0, "rare_earth", "Rare Earth", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeGray)
    public static Material SeedOil = new Material(713, FLUID,		1.0F, 0, 0, 16, 196, 255, 0, 0, "seed_oil", "Seed Oil", 3, 2, -1, 0, false, false, 1, 1, 1, Dyes.dyeLime)
    public static Material Stone = new Material(299, ROUGH, 		4.0F, 32, 1, 1|64|128, 205, 205, 205, 0, "stone", "Stone", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Lava = new Material(700, FLUID, 		1.0F, 0, 1, 16, 255, 64, 0, 0, "lava", "Lava", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeOrange);
    public static Material Glowstone = new Material(811, SHINY, 	1.0F, 0, 1, 1 |16, 255, 255, 0, 0, "glowstone", "Glowstone", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeYellow)
    public static Material NetherStar = new Material(506, NETHERSTAR,1.0F, 5120, 4, 1|4|64, 255, 255, 255, 0, "nether_star", "Nether Star", 5, 50000, -1, 0, false, false, 15, 1, 1, Dyes.dyeWhite);
    public static Material Endstone = new Material(808, DULL, 			1.0F, 0, 1, 1, 255, 255, 255, 0, "endstone", "Endstone", 0, 0, -1, 0, false, false, 0, 1, 1, Dyes.dyeYellow);
    public static Material Netherrack = new Material(807, DULL, 		1.0F, 0, 0, 1, 200, 0, 0, 0, "netherrack", "Netherrack", 0, 0, -1, 0, false, false, 0, 1, 1, Dyes.dyeRed);
    public static Material SoulSand = new Material(-1, DULL, 			1.0F, 0, 0, 1, 255, 255, 255, 0, "soulsand", "Soulsand", 0, 0, -1, 0, false, false, 0, 1, 1, Dyes.dyeBrown);

    /**
     * Startrek materials
     */
    public static Material Naquadah = new Material(324, METALLIC, 	6.0F, 1280, 4, 1|2|8|16|64, 50, 50, 50, 0, "naquadah", "Naquadah", 0, 0, 5400, 5400, true, false, 10, 1, 1, Dyes.dyeBlack)
    public static Material NaquadahAlloy = new Material(325, METALLIC,8.0F, 5120, 5, 1|2|64|128, 40, 40, 40, 0, "naquadah_alloy", "Naquadah Alloy", 0, 0, 7200, 7200, true, false, 10, 1, 1, Dyes.dyeBlack)
    public static Material NaquadahEnriched = new Material(326, METALLIC,6.0F, 1280, 4, 1|2|8|16|64, 50, 50, 50, 0, "naquadah_enriched", "Enriched Naquadah", 0, 0, 4500, 4500, true, false, 15, 1, 1, Dyes.dyeBlack)
    public static Material Naquadria = new Material(327, SHINY, 	1.0F, 512, 4, 1|2|8|16|64, 30, 30, 30, 0, "naquadria", "Naquadria", 0, 0, 9000, 9000, true, false, 20, 1, 1, Dyes.dyeBlack)
    public static Material Tritanium = new Material(329, METALLIC,20.0F, 10240, 6, 1|2|64, 255, 255, 255, 0, "tritanium", "Tritanium", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeWhite)
    public static Material Duranium = new Material(328, METALLIC, 16.0F, 5120, 5, 1|2|64, 255, 255, 255, 0, "duranium", "Duranium", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray);

    /**
     * Actual food
     */
    public static Material Cheese = new Material(894, FINE, 		1.0F, 0, 0, 1, 255, 255, 0, 0, "cheese", "Cheese", 0, 0, 320, 0, false, false, 1, 1, 1, Dyes.dyeYellow);
    public static Material Chili = new Material(895, FINE, 		1.0F, 0, 0, 1, 200, 0, 0, 0, "chili", "Chili", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeRed);
    public static Material Chocolate = new Material(886, FINE, 	1.0F, 0, 0, 1, 190, 95, 0, 0, "chocolate", "Chocolate", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeBrown);
    public static Material MeatRaw = new Material(892, FINE, 		1.0F, 0, 0, 1, 255, 100, 100, 0, "meat_raw", "Raw Meat", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyePink);
    public static Material MeatCooked = new Material(893, FINE, 	1.0F, 0, 0, 1, 150, 60, 20, 0, "meat_cooked", "Cooked Meat", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyePink);
    public static Material Milk = new Material(885, FINE, 			1.0F, 0, 0, 1 |16, 254, 254, 254, 0, "milk", "Milk", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeWhite)
    public static Material FryingOilHot = new Material(727, FLUID, 1.0F, 0, 0, 16, 200, 196, 0, 0, "frying_oil_hot", "Hot Frying Oil", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeOrange)
    public static Material Honey = new Material(725, FLUID, 		1.0F, 0, 0, 16, 210, 200, 0, 0, "honey", "Honey", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeYellow);
    public static Material FishOil = new Material(711, FLUID, 		1.0F, 0, 0, 16, 255, 196, 0, 0, "fish_oil", "Fish Oil", 3, 2, -1, 0, false, false, 1, 1, 1, Dyes.dyeYellow)
    public static Material Cocoa = new Material(887, FINE, 		1.0F, 0, 0, 1, 190, 95, 0, 0, "cocoa", "Cocoa", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeBrown);
    public static Material Coffee = new Material(888, FINE, 		1.0F, 0, 0, 1, 150, 75, 0, 0, "coffee", "Coffee", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeBrown);


    /**
     * Circuitry, Batteries and other Technical things
     * To be exact, it's their tags. OrePrefix is type of thing, Material is tier of it
     */
    public static Material Primitive = new Material(-1, NONE, 		1.0F, 0, 0, 0, 255, 255, 255, 0, "primitive", "Primitive", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Basic = new Material(-1, NONE, 			1.0F, 0, 0, 0, 255, 255, 255, 0, "basic", "Basic", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Good = new Material(-1, NONE, 			1.0F, 0, 0, 0, 255, 255, 255, 0, "good", "Good", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Advanced = new Material(-1, NONE, 		1.0F, 0, 0, 0, 255, 255, 255, 0, "advanced", "Advanced", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Data = new Material(-1, NONE, 			1.0F, 0, 0, 0, 255, 255, 255, 0, "data", "Data", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Elite = new Material(-1, NONE, 			1.0F, 0, 0, 0, 255, 255, 255, 0, "elite", "Elite", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Master = new Material(-1, NONE, 		1.0F, 0, 0, 0, 255, 255, 255, 0, "master", "Master", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Ultimate = new Material(-1, NONE, 		1.0F, 0, 0, 0, 255, 255, 255, 0, "ultimate", "Ultimate", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Superconductor = new Material(-1, NONE, 1.0F, 0, 0, 0, 255, 255, 255, 0, "superconductor", "Superconductor", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray)
    public static Material Infinite = new Material(-1, NONE, 		1.0F, 0, 0, 0, 255, 255, 255, 0, "infinite", "Infinite", 0, 0, -1, 0, false, false, 1, 1, 1, Dyes.dyeLightGray);

    static {
        initSubTags();
        Iron					.mOreReRegistrations.add(AnyIron	);
        PigIron					.mOreReRegistrations.add(AnyIron	);
        WroughtIron				.mOreReRegistrations.add(AnyIron	);

        Copper					.mOreReRegistrations.add(AnyCopper	);
        AnnealedCopper			.mOreReRegistrations.add(AnyCopper	);

        Bronze					.mOreReRegistrations.add(AnyBronze	);

        WoodSealed				.setMaceratingInto(Wood				);

        NeodymiumMagnetic		.setSmeltingInto(Neodymium			).setMaceratingInto(Neodymium		).setArcSmeltingInto(Neodymium			);
        SteelMagnetic			.setSmeltingInto(Steel				).setMaceratingInto(Steel			).setArcSmeltingInto(Steel				);
        Iron					.setSmeltingInto(Iron				).setMaceratingInto(Iron			).setArcSmeltingInto(WroughtIron		);
        AnyIron					.setSmeltingInto(Iron				).setMaceratingInto(Iron			).setArcSmeltingInto(WroughtIron		);
        PigIron					.setSmeltingInto(Iron				).setMaceratingInto(Iron			).setArcSmeltingInto(WroughtIron		);
        WroughtIron				.setSmeltingInto(Iron				).setMaceratingInto(Iron			).setArcSmeltingInto(WroughtIron		);
        IronMagnetic			.setSmeltingInto(Iron				).setMaceratingInto(Iron			).setArcSmeltingInto(WroughtIron		);
        Copper					.setSmeltingInto(Copper				).setMaceratingInto(Copper			).setArcSmeltingInto(AnnealedCopper		);
        AnyCopper				.setSmeltingInto(Copper				).setMaceratingInto(Copper			).setArcSmeltingInto(AnnealedCopper		);
        AnnealedCopper			.setSmeltingInto(Copper				).setMaceratingInto(Copper			).setArcSmeltingInto(AnnealedCopper		);
        MeatRaw					.setSmeltingInto(MeatCooked			);
        Sand					.setSmeltingInto(Glass				);
        Ice						.setSmeltingInto(Water				);
        Snow					.setSmeltingInto(Water				);

        Mercury					.add(SubTag.SMELTING_TO_GEM);
        Cinnabar				.setDirectSmelting(Mercury		).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT).add(SubTag.SMELTING_TO_GEM);
        Tetrahedrite			.setDirectSmelting(Copper		).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        Chalcopyrite			.setDirectSmelting(Copper		).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        Malachite				.setDirectSmelting(Copper		).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        Pentlandite				.setDirectSmelting(Nickel		).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        Sphalerite				.setDirectSmelting(Zinc			).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        Pyrite					.setDirectSmelting(Iron			).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        BasalticMineralSand		.setDirectSmelting(Iron			).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        GraniticMineralSand		.setDirectSmelting(Iron			).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        YellowLimonite			.setDirectSmelting(Iron			).add(SubTag.INDUCTIONSMELTING_LOW_OUTPUT);
        BrownLimonite			.setDirectSmelting(Iron			);
        BandedIron				.setDirectSmelting(Iron			);
        Cassiterite				.setDirectSmelting(Tin			);
        CassiteriteSand			.setDirectSmelting(Tin			);
        Chromite				.setDirectSmelting(Chrome		);
        Garnierite				.setDirectSmelting(Nickel		);
        Cobaltite				.setDirectSmelting(Cobalt		);
        Stibnite				.setDirectSmelting(Antimony		);
        Cooperite				.setDirectSmelting(Platinum		);
        Pyrolusite				.setDirectSmelting(Manganese	);
        Magnesite				.setDirectSmelting(Magnesium	);
        Molybdenite				.setDirectSmelting(Molybdenum	);

        Salt					.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        RockSalt				.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        Scheelite				.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        Tungstate				.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        Cassiterite				.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        CassiteriteSand			.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        NetherQuartz			.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        CertusQuartz			.setOreMultiplier( 2).setSmeltingMultiplier( 2);
        Phosphorus				.setOreMultiplier( 3).setSmeltingMultiplier( 3);
        Saltpeter				.setOreMultiplier( 4).setSmeltingMultiplier( 4);
        Apatite					.setOreMultiplier( 4).setSmeltingMultiplier( 4).setByProductMultiplier(2);
        Redstone				.setOreMultiplier( 5).setSmeltingMultiplier( 5);
        Glowstone				.setOreMultiplier( 5).setSmeltingMultiplier( 5);
        Lapis					.setOreMultiplier( 6).setSmeltingMultiplier( 6).setByProductMultiplier(4);
        Sodalite				.setOreMultiplier( 6).setSmeltingMultiplier( 6).setByProductMultiplier(4);
        Lazurite				.setOreMultiplier( 6).setSmeltingMultiplier( 6).setByProductMultiplier(4);
        Monazite				.setOreMultiplier( 8).setSmeltingMultiplier( 8).setByProductMultiplier(2);

        Plastic					.setEnchantmentForTools(Enchantments.KNOCKBACK, 1);
        Rubber					.setEnchantmentForTools(Enchantments.KNOCKBACK, 2);

        Vinteum					.setEnchantmentForTools(Enchantments.FORTUNE, 1);

        Flint					.setEnchantmentForTools(Enchantments.FIRE_ASPECT, 1);
        Pyrotheum				.setEnchantmentForTools(Enchantments.FIRE_ASPECT, 3);
        Blaze					.setEnchantmentForTools(Enchantments.FIRE_ASPECT, 3);

        EnderPearl				.setEnchantmentForTools(Enchantments.SILK_TOUCH, 1);
        NetherStar				.setEnchantmentForTools(Enchantments.SILK_TOUCH, 1);

        BlackBronze				.setEnchantmentForTools(Enchantments.SMITE, 2);
        Gold					.setEnchantmentForTools(Enchantments.SMITE, 3);
        RoseGold				.setEnchantmentForTools(Enchantments.SMITE, 4);
        Platinum				.setEnchantmentForTools(Enchantments.SMITE, 5);

        Lead					.setEnchantmentForTools(Enchantments.BANE_OF_ARTHROPODS, 2);
        Nickel					.setEnchantmentForTools(Enchantments.BANE_OF_ARTHROPODS, 2);
        Invar					.setEnchantmentForTools(Enchantments.BANE_OF_ARTHROPODS, 3);
        Antimony				.setEnchantmentForTools(Enchantments.BANE_OF_ARTHROPODS, 3);
        BatteryAlloy			.setEnchantmentForTools(Enchantments.BANE_OF_ARTHROPODS, 4);
        Bismuth					.setEnchantmentForTools(Enchantments.BANE_OF_ARTHROPODS, 4);
        BismuthBronze			.setEnchantmentForTools(Enchantments.BANE_OF_ARTHROPODS, 5);

        Iron					.setEnchantmentForTools(Enchantments.SHARPNESS, 1);
        Bronze					.setEnchantmentForTools(Enchantments.SHARPNESS, 1);
        Brass					.setEnchantmentForTools(Enchantments.SHARPNESS, 2);
        Steel					.setEnchantmentForTools(Enchantments.SHARPNESS, 2);
        WroughtIron				.setEnchantmentForTools(Enchantments.SHARPNESS, 2);
        StainlessSteel			.setEnchantmentForTools(Enchantments.SHARPNESS, 3);
        BlackSteel				.setEnchantmentForTools(Enchantments.SHARPNESS, 4);
        RedSteel				.setEnchantmentForTools(Enchantments.SHARPNESS, 4);
        BlueSteel				.setEnchantmentForTools(Enchantments.SHARPNESS, 5);
        DamascusSteel			.setEnchantmentForTools(Enchantments.SHARPNESS, 5);
        TungstenCarbide			.setEnchantmentForTools(Enchantments.SHARPNESS, 5);
        HSSE					.setEnchantmentForTools(Enchantments.SHARPNESS, 5);
        HSSG					.setEnchantmentForTools(Enchantments.SHARPNESS, 4);
        HSSS					.setEnchantmentForTools(Enchantments.SHARPNESS, 5);

        FryingOilHot			.setHeatDamage(1.0F);
        Lava					.setHeatDamage(3.0F);
        Pyrotheum				.setHeatDamage(5.0F);

        Chalcopyrite			.addOreByProducts(Pyrite				, Cobalt				, Cadmium				, Gold			);
        Sphalerite				.addOreByProducts(GarnetYellow			, Cadmium				, Gallium				, Zinc			);
        GlauconiteSand			.addOreByProducts(Sodium				, Aluminium				, Iron					);
        Glauconite				.addOreByProducts(Sodium				, Aluminium				, Iron					);
        Vermiculite				.addOreByProducts(Iron					, Aluminium				, Magnesium				);
        FullersEarth			.addOreByProducts(Aluminium				, Silicon				, Magnesium				);
        Bentonite				.addOreByProducts(Aluminium				, Calcium				, Magnesium				);
        Uraninite				.addOreByProducts(Uranium				, Thorium				, Uranium235			);
        Pitchblende				.addOreByProducts(Thorium				, Uranium				, Lead					);
        Galena					.addOreByProducts(Sulfur				, Silver				, Lead					);
        Lapis					.addOreByProducts(Lazurite				, Sodalite				, Pyrite				);
        Pyrite					.addOreByProducts(Sulfur				, Phosphorus			, Iron					);
        Copper					.addOreByProducts(Cobalt				, Gold					, Nickel				);
        Nickel					.addOreByProducts(Cobalt				, Platinum				, Iron					);
        GarnetRed				.addOreByProducts(Spessartine			, Pyrope				, Almandine				);
        GarnetYellow			.addOreByProducts(Andradite				, Grossular				, Uvarovite				);
        Cooperite				.addOreByProducts(Palladium				, Nickel				, Iridium				);
        Cinnabar				.addOreByProducts(Redstone				, Sulfur				, Glowstone				);
        Tantalite				.addOreByProducts(Manganese				, Niobium				, Tantalum				);
        Pollucite				.addOreByProducts(Caesium				, Aluminium				, Rubidium				);
        Chrysotile				.addOreByProducts(Asbestos				, Silicon				, Magnesium				);
        Asbestos				.addOreByProducts(Asbestos				, Silicon				, Magnesium				);
        Pentlandite				.addOreByProducts(Iron					, Sulfur				, Cobalt				);
        Uranium					.addOreByProducts(Lead					, Uranium235			, Thorium				);
        Scheelite				.addOreByProducts(Manganese				, Molybdenum			, Calcium				);
        Tungstate				.addOreByProducts(Manganese				, Silver				, Lithium				);
        Bauxite					.addOreByProducts(Grossular				, Rutile				, Gallium				);
        QuartzSand				.addOreByProducts(CertusQuartz			, Quartzite				, Barite				);
        Quartzite				.addOreByProducts(CertusQuartz			, Barite				);
        CertusQuartz			.addOreByProducts(Quartzite				, Barite				);
        Redstone				.addOreByProducts(Cinnabar				, RareEarth				, Glowstone				);
        Monazite				.addOreByProducts(Thorium				, Neodymium				, RareEarth				);
        Malachite				.addOreByProducts(Copper				, BrownLimonite			, Calcite				);
        YellowLimonite			.addOreByProducts(Nickel				, BrownLimonite			, Cobalt				);
        BrownLimonite			.addOreByProducts(Malachite				, YellowLimonite		);
        Neodymium				.addOreByProducts(Monazite				, RareEarth				);
        Bastnasite				.addOreByProducts(Neodymium				, RareEarth				);
        Glowstone				.addOreByProducts(Redstone				, Gold					);
        Zinc					.addOreByProducts(Tin					, Gallium				);
        Tungsten				.addOreByProducts(Manganese				, Molybdenum			);
        Diatomite				.addOreByProducts(BandedIron			, Sapphire				);
        Iron					.addOreByProducts(Nickel				, Tin					);
        Lepidolite				.addOreByProducts(Lithium				, Caesium				);
        Gold					.addOreByProducts(Copper				, Nickel				);
        Tin						.addOreByProducts(Iron					, Zinc					);
        Antimony				.addOreByProducts(Zinc					, Iron					);
        Silver					.addOreByProducts(Lead					, Sulfur				);
        Lead					.addOreByProducts(Silver				, Sulfur				);
        Thorium					.addOreByProducts(Uranium				, Lead					);
        Plutonium				.addOreByProducts(Uranium				, Lead					);
        Electrum				.addOreByProducts(Gold					, Silver				);
        Bronze					.addOreByProducts(Copper				, Tin					);
        Brass					.addOreByProducts(Copper				, Zinc					);
        Coal					.addOreByProducts(Lignite				, Thorium				);
        Ilmenite				.addOreByProducts(Iron					, Rutile				);
        Manganese				.addOreByProducts(Chrome				, Iron					);
        Sapphire				.addOreByProducts(Aluminium				, GreenSapphire			);
        GreenSapphire			.addOreByProducts(Aluminium				, Sapphire				);
        Platinum				.addOreByProducts(Nickel				, Iridium				);
        Emerald					.addOreByProducts(Beryllium				, Aluminium				);
        Olivine					.addOreByProducts(Pyrope				, Magnesium				);
        Chrome					.addOreByProducts(Iron					, Magnesium				);
        Chromite				.addOreByProducts(Iron					, Magnesium				);
        Tetrahedrite			.addOreByProducts(Antimony				, Zinc					);
        GarnetSand				.addOreByProducts(GarnetRed				, GarnetYellow			);
        Magnetite				.addOreByProducts(Iron					, Gold					);
        GraniticMineralSand		.addOreByProducts(GraniteBlack			, Magnetite				);
        BasalticMineralSand		.addOreByProducts(Basalt				, Magnetite				);
        Basalt					.addOreByProducts(Olivine				, DarkAsh				);
        VanadiumMagnetite		.addOreByProducts(Magnetite				, Vanadium				);
        Lazurite				.addOreByProducts(Sodalite				, Lapis					);
        Sodalite				.addOreByProducts(Lazurite				, Lapis					);
        Spodumene				.addOreByProducts(Aluminium				, Lithium				);
        Ruby					.addOreByProducts(Chrome				, GarnetRed				);
        Phosphorus				.addOreByProducts(Apatite				, Phosphate				);
        Iridium					.addOreByProducts(Platinum				, Osmium				);
        Pyrope					.addOreByProducts(GarnetRed				, Magnesium				);
        Almandine				.addOreByProducts(GarnetRed				, Aluminium				);
        Spessartine				.addOreByProducts(GarnetRed				, Manganese				);
        Andradite				.addOreByProducts(GarnetYellow			, Iron					);
        Grossular				.addOreByProducts(GarnetYellow			, Calcium				);
        Uvarovite				.addOreByProducts(GarnetYellow			, Chrome				);
        Calcite					.addOreByProducts(Andradite				, Malachite				);
        NaquadahEnriched		.addOreByProducts(Naquadah				, Naquadria				);
        Naquadah				.addOreByProducts(NaquadahEnriched		);
        Pyrolusite				.addOreByProducts(Manganese				);
        Molybdenite				.addOreByProducts(Molybdenum			);
        Stibnite				.addOreByProducts(Antimony				);
        Garnierite				.addOreByProducts(Nickel				);
        Lignite					.addOreByProducts(Coal					);
        Diamond					.addOreByProducts(Graphite				);
        Beryllium				.addOreByProducts(Emerald				);
        Apatite					.addOreByProducts(Phosphorus			);
        Magnesite				.addOreByProducts(Magnesium				);
        NetherQuartz			.addOreByProducts(Netherrack			);
        PigIron					.addOreByProducts(Iron					);
        Steel					.addOreByProducts(Iron					);
        Graphite				.addOreByProducts(Carbon				);
        Netherrack				.addOreByProducts(Sulfur				);
        Flint					.addOreByProducts(Obsidian				);
        Cobaltite				.addOreByProducts(Cobalt				);
        Cobalt					.addOreByProducts(Cobaltite				);
        Sulfur					.addOreByProducts(Sulfur				);
        Saltpeter				.addOreByProducts(Saltpeter				);
        Endstone				.addOreByProducts(Helium_3				);
        Osmium					.addOreByProducts(Iridium				);
        Magnesium				.addOreByProducts(Olivine				);
        Aluminium				.addOreByProducts(Bauxite				);
        Titanium				.addOreByProducts(Almandine				);
        Obsidian				.addOreByProducts(Olivine				);
        Ash						.addOreByProducts(Carbon				);
        DarkAsh					.addOreByProducts(Carbon				);
        Redrock					.addOreByProducts(Clay					);
        Marble					.addOreByProducts(Calcite				);
        Clay					.addOreByProducts(Clay					);
        Cassiterite				.addOreByProducts(Tin					);
        CassiteriteSand			.addOreByProducts(Tin					);
        GraniteBlack			.addOreByProducts(Biotite				);
        GraniteRed				.addOreByProducts(PotassiumFeldspar		);
        Phosphate				.addOreByProducts(Phosphor				);
        Phosphor				.addOreByProducts(Phosphate				);
        Tanzanite				.addOreByProducts(Opal					);
        Opal					.addOreByProducts(Tanzanite				);
        Amethyst				.addOreByProducts(Amethyst				);
        Topaz					.addOreByProducts(BlueTopaz				);
        BlueTopaz				.addOreByProducts(Topaz					);
        Niter					.addOreByProducts(Saltpeter				);
        Vinteum					.addOreByProducts(Vinteum				);
        Neutronium				.addOreByProducts(Neutronium			);
        Lithium					.addOreByProducts(Lithium				);
        Silicon					.addOreByProducts(SiliconDioxide		);
        Salt					.addOreByProducts(RockSalt				);
        RockSalt				.addOreByProducts(Salt					);
        Andesite                .addOreByProducts(Basalt                );
        Diorite                 .addOreByProducts(NetherQuartz          );

        Glue.mChemicalFormula = "No Horses were harmed for the Production";
        UUAmplifier.mChemicalFormula = "Accelerates the Mass Fabricator";
        WoodSealed.mChemicalFormula = "";
        Wood.mChemicalFormula = "";
        NaquadahEnriched.mChemicalFormula = "Nq+";
        Naquadah.mChemicalFormula = "Nq";
        Naquadria.mChemicalFormula = "NqX";
    }

    private static void initSubTags() {
        SubTag.ELECTROMAGNETIC_SEPERATION_NEODYMIUM.addTo(Bastnasite, Monazite);
        SubTag.ELECTROMAGNETIC_SEPERATION_GOLD.addTo(Magnetite, VanadiumMagnetite, BasalticMineralSand, GraniticMineralSand);
        SubTag.ELECTROMAGNETIC_SEPERATION_IRON.addTo(YellowLimonite, BrownLimonite, Pyrite, BandedIron, Nickel, Vermiculite, Glauconite, GlauconiteSand, Pentlandite, Tin, Antimony, Ilmenite, Manganese, Chrome, Chromite, Andradite);
        SubTag.BLASTFURNACE_CALCITE_DOUBLE.addTo(Pyrite, YellowLimonite, BasalticMineralSand, GraniticMineralSand);
        SubTag.BLASTFURNACE_CALCITE_TRIPLE.addTo(Iron, PigIron, WroughtIron, BrownLimonite);
        SubTag.WASHING_MERCURY.addTo(Gold, Silver, Osmium, Platinum, Cooperite);
        SubTag.WASHING_SODIUMPERSULFATE.addTo(Zinc, Nickel, Copper, Cobalt, Cobaltite, Tetrahedrite);
        SubTag.METAL.addTo(AnyIron, AnyCopper, AnyBronze, Aluminium, Americium, Antimony, Beryllium, Bismuth, Caesium, Cerium, Chrome, Cobalt, Copper, Dysprosium, Erbium, Europium, Gadolinium, Gallium, Gold,
                Holmium, Indium, Iridium, Iron, Lanthanum, Lead, Lutetium, Magnesium, Manganese, Mercury, Niobium, Molybdenum, Neodymium, Neutronium, Nickel, Osmium, Palladium, Platinum, Plutonium, Plutonium241,
                Praseodymium, Promethium, Rubidium, Samarium, Scandium, Silicon, Silver, Tantalum, Tellurium, Terbium, Thorium, Thulium, Tin, Titanium, Tungsten, Uranium, Uranium235, Vanadium, Ytterbium, Yttrium,
                Zinc, TinAlloy, Duranium, Naquadah, NaquadahAlloy, NaquadahEnriched, Naquadria, Tritanium, AluminiumBrass, Osmiridium, AnnealedCopper, BatteryAlloy, Brass, Bronze, ChromiumDioxide, Cupronickel,
                Electrum, Invar, IronCompressed, Kanthal, Magnalium, Nichrome, NiobiumNitride, NiobiumTitanium, PigIron, SolderingAlloy, StainlessSteel, Steel, Ultimet, VanadiumGallium, WroughtIron,
                YttriumBariumCuprate, Alumite, Manyullyn, SterlingSilver, RoseGold, BlackBronze, BismuthBronze, BlackSteel, RedSteel, BlueSteel, DamascusSteel,
                TungstenSteel, BlueAlloy, RedAlloy, CobaltBrass, IronMagnetic, SteelMagnetic, NeodymiumMagnetic, HSSG, HSSE, HSSS, TungstenCarbide,
                VanadiumSteel);

        SubTag.FOOD.addTo(MeatRaw, MeatCooked, Ice, Water, Salt, Chili, Cocoa, Cheese, Coffee, Chocolate, Milk, Honey, FryingOilHot, FishOil, SeedOil, Sugar, FreshWater);

        Wood.add(SubTag.WOOD, SubTag.FLAMMABLE, SubTag.NO_SMELTING, SubTag.NO_SMASHING);
        WoodSealed.add(SubTag.WOOD, SubTag.FLAMMABLE, SubTag.NO_SMELTING, SubTag.NO_SMASHING, SubTag.NO_WORKING);

        MeatRaw.add(SubTag.NO_SMASHING);
        MeatCooked.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Snow.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.NO_RECYCLING);
        Ice.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.NO_RECYCLING);
        Water.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.NO_RECYCLING);
        Sulfur.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.FLAMMABLE);
        Saltpeter.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.FLAMMABLE);
        Graphite.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.FLAMMABLE, SubTag.NO_SMELTING);

        Paper.add(SubTag.FLAMMABLE, SubTag.NO_SMELTING, SubTag.NO_SMASHING, SubTag.MORTAR_GRINDABLE, SubTag.PAPER);
        Coal.add(SubTag.FLAMMABLE, SubTag.NO_SMELTING, SubTag.NO_SMASHING, SubTag.MORTAR_GRINDABLE);
        Charcoal.add(SubTag.FLAMMABLE, SubTag.NO_SMELTING, SubTag.NO_SMASHING, SubTag.MORTAR_GRINDABLE);
        Lignite.add(SubTag.FLAMMABLE, SubTag.NO_SMELTING, SubTag.NO_SMASHING, SubTag.MORTAR_GRINDABLE);

        Rubber.add(SubTag.FLAMMABLE, SubTag.NO_SMASHING, SubTag.BOUNCY, SubTag.STRETCHY);
        Plastic.add(SubTag.FLAMMABLE, SubTag.NO_SMASHING, SubTag.BOUNCY);
        Silicone.add(SubTag.FLAMMABLE, SubTag.NO_SMASHING, SubTag.BOUNCY, SubTag.STRETCHY);

        Gunpowder.add(SubTag.FLAMMABLE, SubTag.EXPLOSIVE, SubTag.NO_SMELTING, SubTag.NO_SMASHING);
        Glyceryl.add(SubTag.FLAMMABLE, SubTag.EXPLOSIVE, SubTag.NO_SMELTING, SubTag.NO_SMASHING);
        NitroFuel.add(SubTag.FLAMMABLE, SubTag.EXPLOSIVE, SubTag.NO_SMELTING, SubTag.NO_SMASHING);
        NitroCarbon.add(SubTag.FLAMMABLE, SubTag.EXPLOSIVE, SubTag.NO_SMELTING, SubTag.NO_SMASHING);

        Lead.add(SubTag.MORTAR_GRINDABLE, SubTag.SOLDERING_MATERIAL, SubTag.SOLDERING_MATERIAL_BAD);
        Tin.add(SubTag.MORTAR_GRINDABLE, SubTag.SOLDERING_MATERIAL);
        SolderingAlloy.add(SubTag.MORTAR_GRINDABLE, SubTag.SOLDERING_MATERIAL, SubTag.SOLDERING_MATERIAL_GOOD);

        Cheese.add(SubTag.SMELTING_TO_FLUID);
        Sugar.add(SubTag.SMELTING_TO_FLUID);

        Concrete.add(SubTag.STONE, SubTag.NO_SMASHING, SubTag.SMELTING_TO_FLUID);
        ConstructionFoam.add(SubTag.STONE, SubTag.NO_SMASHING, SubTag.EXPLOSIVE, SubTag.NO_SMELTING);
        Redstone.add(SubTag.STONE, SubTag.NO_SMASHING, SubTag.UNBURNABLE, SubTag.SMELTING_TO_FLUID, SubTag.PULVERIZING_CINNABAR);
        Glowstone.add(SubTag.STONE, SubTag.NO_SMASHING, SubTag.UNBURNABLE, SubTag.SMELTING_TO_FLUID);
        Netherrack.add(SubTag.STONE, SubTag.NO_SMASHING, SubTag.UNBURNABLE, SubTag.FLAMMABLE);
        Stone.add(SubTag.STONE, SubTag.NO_SMASHING, SubTag.NO_RECYCLING);
        Endstone.add(SubTag.STONE, SubTag.NO_SMASHING);
        Marble.add(SubTag.STONE, SubTag.NO_SMASHING);
        Basalt.add(SubTag.STONE, SubTag.NO_SMASHING);
        Redrock.add(SubTag.STONE, SubTag.NO_SMASHING);
        Obsidian.add(SubTag.STONE, SubTag.NO_SMASHING);
        Flint.add(SubTag.STONE, SubTag.NO_SMASHING, SubTag.MORTAR_GRINDABLE);
        GraniteRed.add(SubTag.STONE, SubTag.NO_SMASHING);
        GraniteBlack.add(SubTag.STONE, SubTag.NO_SMASHING);
        Salt.add(SubTag.STONE, SubTag.NO_SMASHING);
        RockSalt.add(SubTag.STONE, SubTag.NO_SMASHING);
        Andesite.add(SubTag.STONE, SubTag.NO_SMASHING);
        Diorite.add(SubTag.STONE, SubTag.NO_SMASHING);

        Sand.add(SubTag.NO_RECYCLING);

        Gold.add(SubTag.MORTAR_GRINDABLE);
        Silver.add(SubTag.MORTAR_GRINDABLE);
        Iron.add(SubTag.MORTAR_GRINDABLE);
        IronMagnetic.add(SubTag.MORTAR_GRINDABLE);
        Steel.add(SubTag.MORTAR_GRINDABLE);
        SteelMagnetic.add(SubTag.MORTAR_GRINDABLE);
        Zinc.add(SubTag.MORTAR_GRINDABLE);
        Antimony.add(SubTag.MORTAR_GRINDABLE);
        Copper.add(SubTag.MORTAR_GRINDABLE);
        AnnealedCopper.add(SubTag.MORTAR_GRINDABLE);
        Bronze.add(SubTag.MORTAR_GRINDABLE);
        Nickel.add(SubTag.MORTAR_GRINDABLE);
        Invar.add(SubTag.MORTAR_GRINDABLE);
        Brass.add(SubTag.MORTAR_GRINDABLE);
        WroughtIron.add(SubTag.MORTAR_GRINDABLE);
        Electrum.add(SubTag.MORTAR_GRINDABLE);
        Clay.add(SubTag.MORTAR_GRINDABLE);

        Glass.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_RECYCLING, SubTag.SMELTING_TO_FLUID);
        Diamond.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.FLAMMABLE);
        Emerald.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Amethyst.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Tanzanite.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Topaz.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        BlueTopaz.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        GreenSapphire.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Sapphire.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Ruby.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Opal.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Olivine.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Jasper.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        GarnetRed.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        GarnetYellow.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Niter.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Apatite.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE);
        Lapis.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE);
        Sodalite.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE);
        Lazurite.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE);
        Monazite.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE);
        Quartzite.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE, SubTag.QUARTZ);
        SiliconDioxide.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE, SubTag.QUARTZ);
        NetherQuartz.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE, SubTag.QUARTZ);
        CertusQuartz.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.CRYSTALLISABLE, SubTag.QUARTZ);
        Phosphorus.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.FLAMMABLE, SubTag.EXPLOSIVE);
        Phosphate.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.FLAMMABLE, SubTag.EXPLOSIVE);
        Vinteum.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.MAGICAL, SubTag.UNBURNABLE);
        NetherStar.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.MAGICAL, SubTag.UNBURNABLE);
        EnderPearl.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.MAGICAL, SubTag.PEARL);
        EnderEye.add(SubTag.CRYSTAL, SubTag.NO_SMASHING, SubTag.NO_SMELTING, SubTag.MAGICAL, SubTag.PEARL);
        Magic.add(SubTag.CRYSTAL, SubTag.MAGICAL, SubTag.UNBURNABLE);
        Blaze.add(SubTag.MAGICAL, SubTag.NO_SMELTING, SubTag.SMELTING_TO_FLUID, SubTag.MORTAR_GRINDABLE, SubTag.UNBURNABLE, SubTag.BURNING);

        Primitive.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Basic.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Good.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Advanced.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Data.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Elite.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Master.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Ultimate.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Superconductor.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
        Infinite.add(SubTag.NO_SMASHING, SubTag.NO_SMELTING);
    }

}
