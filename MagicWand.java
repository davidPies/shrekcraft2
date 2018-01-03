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
        Item.field_150901_e.func_148756_a(429, "magicWand", block); 
  }
  public static MagicWand instance = new MagicWand();
  
  
}
