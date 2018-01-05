package net.minecraft.src;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.HashMap;
import java.util.Random;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.src.mcreator_gingy;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class Gingy {
    public static int mobid = 0;
    public static Gingy instance = new Gingy();

    public void load() {
    
    }
    
    @SideOnly(value=Side.CLIENT)
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(Entitygingy.class, new RenderLiving(new ModelGingy(), 0.0F){
            public void RenderLiving(ModelBase p_i1262_1_, float p_i1262_2_){
    		this.setRenderPassModel(p_i1262_1_);
    	}
    	protected void renderModel(EntityLivingBase p_77036_1_, float p_77036_2_, float p_77036_3_, float p_77036_4_, float p_77036_5_, float p_77036_6_, float p_77036_7_)
        {
    		ModelShrek2 model = new ModelShrek2();
    		this.bindEntityTexture(p_77036_1_);
    		model.render(p_77036_1_, p_77036_2_, p_77036_3_, p_77036_4_, p_77036_5_, p_77036_6_, p_77036_7_);
    		model.setLivingAnimations(p_77036_1_, p_77036_2_, p_77036_3_, p_77036_4_);
        }
      protected ResourceLocation getEntityTexture(Entity par1Entity)
      {
        return new ResourceLocation("Gingy.png");
      }
        });
    }

    public void serverLoad(FMLServerStartingEvent event) {
    }

    public void preInit(FMLPreInitializationEvent event) {
        int entityID;
        mobid = entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(Entitygingy.class, "gingy", entityID);
        EntityRegistry.registerModEntity(Entitygingy.class, "gingy", entityID, shrekcraft2.instance, 64, 1, true);
        EntityList.field_75627_a.put(entityID, new EntityList.EntityEggInfo(entityID, 10053120, 10040319));
        EntityRegistry.addSpawn(Entitygingy.class, 3, 1, 5, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76771_b, BiomeGenBase.field_76772_c, BiomeGenBase.field_76769_d, BiomeGenBase.field_76770_e, BiomeGenBase.field_76767_f, BiomeGenBase.field_76768_g, BiomeGenBase.field_76780_h, BiomeGenBase.field_76781_i, BiomeGenBase.field_76776_l, BiomeGenBase.field_76777_m, BiomeGenBase.field_76774_n, BiomeGenBase.field_76775_o, BiomeGenBase.field_76789_p, BiomeGenBase.field_76788_q, BiomeGenBase.field_76787_r, BiomeGenBase.field_76786_s, BiomeGenBase.field_76785_t, BiomeGenBase.field_76784_u, BiomeGenBase.field_76783_v, BiomeGenBase.field_76782_w, BiomeGenBase.field_76792_x, BiomeGenBase.field_150574_L, BiomeGenBase.field_150575_M, BiomeGenBase.field_150576_N, BiomeGenBase.field_150577_O, BiomeGenBase.field_150583_P, BiomeGenBase.field_150582_Q, BiomeGenBase.field_150585_R, BiomeGenBase.field_150584_S, BiomeGenBase.field_150579_T, BiomeGenBase.field_150578_U, BiomeGenBase.field_150581_V, BiomeGenBase.field_150580_W, BiomeGenBase.field_150588_X, BiomeGenBase.field_150587_Y, BiomeGenBase.field_150589_Z, BiomeGenBase.field_150607_aa, BiomeGenBase.field_150608_ab});
    }
}
