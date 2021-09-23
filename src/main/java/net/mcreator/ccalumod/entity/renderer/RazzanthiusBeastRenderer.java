package net.mcreator.ccalumod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.ccalumod.entity.RazzanthiusBeastEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RazzanthiusBeastRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RazzanthiusBeastEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ccalumod:textures/razzanthiusbeast.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer LeftBackLeg;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer RightBackLeg;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer LeftFrontLeg;
		private final ModelRenderer cube_r6;
		private final ModelRenderer RightFrontLeg;
		private final ModelRenderer cube_r7;
		private final ModelRenderer Tail;
		private final ModelRenderer Head;
		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -6.0F, 8.0F, 5.0F, 12.0F, 0.0F, false);
			LeftBackLeg = new ModelRenderer(this);
			LeftBackLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftBackLeg.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(16, 22).addBox(-4.0F, -2.0F, 4.2F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftBackLeg.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(14, 27).addBox(-4.0F, -3.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			RightBackLeg = new ModelRenderer(this);
			RightBackLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightBackLeg.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(16, 17).addBox(2.0F, -2.0F, 4.2F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightBackLeg.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(24, 17).addBox(2.0F, -3.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			LeftFrontLeg = new ModelRenderer(this);
			LeftFrontLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			LeftFrontLeg.setTextureOffset(0, 5).addBox(-4.0F, -3.0F, -5.87F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			LeftFrontLeg.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(8, 25).addBox(-4.0F, -4.0F, -6.1F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			RightFrontLeg = new ModelRenderer(this);
			RightFrontLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
			RightFrontLeg.setTextureOffset(0, 0).addBox(2.0F, -3.0F, -5.87F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightFrontLeg.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(0, 25).addBox(2.0F, -4.0F, -6.1F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Tail = new ModelRenderer(this);
			Tail.setRotationPoint(0.0F, 24.0F, 0.0F);
			Tail.setTextureOffset(24, 24).addBox(-1.0F, -7.0F, 6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 24.0F, 0.0F);
			Head.setTextureOffset(22, 20).addBox(-1.0F, -8.0F, -7.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(0, 17).addBox(-2.0F, -9.0F, -10.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(28, 6).addBox(-1.0F, -7.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(28, 3).addBox(-3.0F, -10.0F, -9.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(28, 0).addBox(1.0F, -10.0F, -9.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftBackLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			RightBackLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftFrontLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			RightFrontLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			Tail.render(matrixStack, buffer, packedLight, packedOverlay);
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftFrontLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.LeftBackLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightFrontLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.RightBackLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Tail.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
