package miscsubbin.generatedores.common;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMundaneOre extends Block {
    public String name;
    public String harvesttool;
    public int harvestlevel;

    public BlockMundaneOre(int par1, Material material, float hardness, float resistance, StepSound stepsound, String name, String harvesttool, int harvestlevel) {
        super(par1, material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setResistance(resistance);
        this.setStepSound(stepsound);
        this.name = name;
        this.harvesttool = harvesttool;
        this.harvestlevel = harvestlevel;
    }
}
