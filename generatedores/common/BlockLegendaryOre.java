package mods.generatedores.common;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLegendaryOre extends Block {
    public String harvesttool;
    public int harvestlevel;

    public BlockLegendaryOre(int par1, Material material, float hardness, float resistance, StepSound stepsound, String name, String harvesttool, int harvestlevel) {
        super(par1, material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setResistance(resistance);
        this.setStepSound(stepsound);
        this.setHardness(hardness);
        this.setUnlocalizedName(name);
        this.harvesttool = harvesttool;
        this.harvestlevel = harvestlevel;
    }
    @Override
    public void registerIcons(IconRegister reg){
    	this.blockIcon = reg.registerIcon("generatedores:Legendary_minecraft_block");
    }
}
