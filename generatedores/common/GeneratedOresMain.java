package mods.generatedores.common;
//matt is awesome

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "generatedores", name = "Generated Ores", version = "0.01 Pre-Alpha")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class GeneratedOresMain {
    
    @Instance("generatedores")
    public static GeneratedOresMain instance;

    @SidedProxy(clientSide="mods.generatedores.client.GeneratedOresClientProxy", serverSide="mods.generatedores.common.GeneratedOresCommonProxy")
    public static GeneratedOresCommonProxy proxy;

    public static BlockMundaneOre mundaneore;
    public static BlockMagicOre magicore;
    public static BlockRareOre rareore;
    public static BlockLegendaryOre legendaryore;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Init
    public void load(FMLInitializationEvent event) {
        mundaneore = new BlockMundaneOre(540, Material.rock, 25F, 25F, Block.soundMetalFootstep, "Mundane Ore", "pickaxe", 0);
        magicore = new BlockMagicOre(541, Material.rock, 25F, 25F, Block.soundMetalFootstep, "Magic Ore", "pickaxe", 1);
        rareore = new BlockRareOre(542, Material.rock, 25F, 25F, Block.soundMetalFootstep, "Rare Ore", "pickaxe", 2);
        legendaryore = new BlockLegendaryOre(543, Material.rock, 25F, 25F, Block.soundMetalFootstep, "Legendary Ore", "pickaxe", 3);

        MinecraftForge.setBlockHarvestLevel(mundaneore, mundaneore.harvesttool, mundaneore.harvestlevel);
        MinecraftForge.setBlockHarvestLevel(magicore, magicore.harvesttool, magicore.harvestlevel);
        MinecraftForge.setBlockHarvestLevel(rareore, rareore.harvesttool, rareore.harvestlevel);
        MinecraftForge.setBlockHarvestLevel(legendaryore, legendaryore.harvesttool, legendaryore.harvestlevel);

        GameRegistry.registerBlock(mundaneore, "mundaneore");
        GameRegistry.registerBlock(magicore, "magicore");
        GameRegistry.registerBlock(rareore, "rareore");
        GameRegistry.registerBlock(legendaryore, "legendaryore");

        LanguageRegistry.addName(mundaneore, mundaneore.name);
        LanguageRegistry.addName(magicore, magicore.name);
        LanguageRegistry.addName(rareore, rareore.name);
        LanguageRegistry.addName(legendaryore, legendaryore.name);
        
        GameRegistry.registerWorldGenerator(new GeneratedBlockWorldGenerator());
    }

    @PostInit
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
