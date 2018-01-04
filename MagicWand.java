package shrekcraft2;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import java.util.Random;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.RegistryNamespaced;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.mcreator_magicOrb;
import net.minecraft.src.mcreator_magicWand;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;

public class MagicWand
{
  public MagicWand() {
  }
  
  public void load()
  {
    GameRegistry.addRecipe(new ItemStack(block, 1), new Object[] { "X1X", "X4X", "X7X", Character.valueOf('1'), new ItemStack(mcreator_magicOrb.block, 1), Character.valueOf('4'), new ItemStack(Items.field_151045_i, 1), Character.valueOf('7'), new ItemStack(Items.field_151055_y, 1) });
  }
  
  public void registerRenderers() {}
  
  public void generateNether(World world, Random random, int chunkX, int chunkZ) {}
  
  public void generateSurface(World world, Random random, int chunkX, int chunkZ) {}
  
  public int addFuel(ItemStack fuel) { return 0; }
  
  public void serverLoad(FMLServerStartingEvent event) {}
  
  public void preInit(FMLPreInitializationEvent event) {}
  
  public static Item block = new mcreator_magicWand.Projectile();
  static { 
        Item.itemRegistry.getObject(429, "magicWand", block); 
  }
  public static MagicWand instance = new MagicWand();
	

    static class Projectile extends Item {
   		public mcreator_magicWand.ItemgGUN() {
        	this.setMaxDamage(100);
        	this.setMaxStackSize(1);
        	this.setFull3D();
        	this.setUnlocalizedName("magicWand");
        	this.setTextureName("Magic Wand");
        	this.setCreativeTab(Tab.tab);
    	}

    	//public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        //	return 72000;
    	//}

    	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, final EntityPlayer par3EntityPlayer) {
        	boolean flag;
        	boolean bl = flag = par3EntityPlayer.field_71075_bZ.field_75098_d || EnchantmentHelper.func_77506_a((int)Enchantment.field_77342_w.field_77352_x, (ItemStack)par1ItemStack) > 0;
        	if (flag || par3EntityPlayer.field_71071_by.func_146028_b(mcreator_magicOrb.block)) {
            	float f = 1.5f;
            	EntityArrow entityarrow = new EntityArrow(par2World, (EntityLivingBase)par3EntityPlayer, f * 2.0f){

                	public void func_70100_b_(EntityPlayer entitiy) {
                    		super.func_70100_b_(entitiy);
                    		int i = MathHelper.func_76128_c((double)(this.field_70121_D.field_72340_a + 0.001));
                    		int j = MathHelper.func_76128_c((double)(this.field_70121_D.field_72338_b + 0.001));
                   		int k = MathHelper.func_76128_c((double)(this.field_70121_D.field_72339_c + 0.001));
                    		World world = this.field_70170_p;
                	}

                	public void func_70071_h_() {
                    	super.func_70071_h_();
                    	int i = MathHelper.func_76128_c((double)(this.field_70121_D.field_72340_a + 0.001));
                    	int j = MathHelper.func_76128_c((double)(this.field_70121_D.field_72338_b + 0.001));
                    	int k = MathHelper.func_76128_c((double)(this.field_70121_D.field_72339_c + 0.001));
                    	World world = this.field_70170_p;
                    	EntityPlayer entity = par3EntityPlayer;
                    	if (this.field_70170_p.func_147439_a(i, j, k) != Blocks.field_150350_a || this.field_70170_p.func_147439_a(i, j - 1, k) != Blocks.field_150350_a || this.field_70170_p.func_147439_a(i, j + 1, k) != Blocks.field_150350_a || this.field_70170_p.func_147439_a(i + 1, j, k) != Blocks.field_150350_a || this.field_70170_p.func_147439_a(i - 1, j, k) != Blocks.field_150350_a || this.field_70170_p.func_147439_a(i, j, k + 1) != Blocks.field_150350_a || this.field_70170_p.func_147439_a(i, j, k - 1) != Blocks.field_150350_a) {
                        	world.func_72838_d((Entity)new EntityLightningBolt(world, (double)i, (double)j, (double)k));
                       		this.func_70076_C();
                    	}
                	}
            	};
            	entityarrow.func_70243_d(false);
            	entityarrow.func_70239_b(5.0);
            	entityarrow.func_70240_a(5);
            	par1ItemStack.func_77972_a(1, (EntityLivingBase)par3EntityPlayer);
            	par2World.func_72956_a((Entity)par3EntityPlayer, "random.bow", 1.0f, 1.0f / (field_77697_d.nextFloat() * 0.4f + 1.2f) + f * 0.5f);
            	if (flag) {
                	entityarrow.field_70251_a = 2;
            	} else {
                	par3EntityPlayer.field_71071_by.func_146026_a(mcreator_magicOrb.block);
            	}
            	if (!par2World.field_72995_K) {
                	par2World.func_72838_d((Entity)entityarrow);
            	}
            	World world = par2World;
            	EntityPlayer entity = par3EntityPlayer;
            	int i = (int)entity.field_70165_t;
            	int j = (int)entity.field_70163_u;
            	int k = (int)entity.field_70161_v;
        	}
        	return par1ItemStack;
    	}

    	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        	return EnumAction.bow;
    	}

	}
}
