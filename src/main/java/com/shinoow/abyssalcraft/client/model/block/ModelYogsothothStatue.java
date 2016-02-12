/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2016 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelYogsothothStatue extends ModelBase
{

	ModelRenderer base;
	ModelRenderer body;
	ModelRenderer tentacle1;
	ModelRenderer tentacle2;
	ModelRenderer tentacle3;
	ModelRenderer tentacle4;
	ModelRenderer tentacle5;
	ModelRenderer tentacle6;
	ModelRenderer tentacle7;
	ModelRenderer blob1;
	ModelRenderer blob2;
	ModelRenderer blob3;
	ModelRenderer blob4;
	ModelRenderer blob5;
	ModelRenderer blob6;
	ModelRenderer blob7;
	ModelRenderer blob8;
	ModelRenderer blob9;
	ModelRenderer blob10;
	ModelRenderer blob11;
	ModelRenderer blob12;
	ModelRenderer blob13;
	ModelRenderer blob14;
	ModelRenderer blob15;
	ModelRenderer blob16;
	ModelRenderer bob17;
	ModelRenderer blob18;
	ModelRenderer blob19;
	ModelRenderer blob20;
	ModelRenderer blob21;
	ModelRenderer blob22;
	ModelRenderer blob23;
	ModelRenderer blob24;
	ModelRenderer blob25;
	ModelRenderer blob26;
	ModelRenderer blob27;
	ModelRenderer blob28;
	ModelRenderer blob29;
	ModelRenderer blob30;
	ModelRenderer blob31;
	ModelRenderer blob32;
	ModelRenderer blob33;
	ModelRenderer blob34;
	ModelRenderer blob35;
	ModelRenderer blob36;
	ModelRenderer blob37;

	public ModelYogsothothStatue()
	{
		textureWidth = 64;
		textureHeight = 32;

		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 8, 6, 8);
		base.setRotationPoint(-4F, 18F, -4F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		body = new ModelRenderer(this, 32, 0);
		body.addBox(0F, 0F, 0F, 4, 8, 4);
		body.setRotationPoint(-2F, 10F, -2F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		tentacle1 = new ModelRenderer(this, 0, 14);
		tentacle1.addBox(0F, 0F, 0F, 1, 1, 4);
		tentacle1.setRotationPoint(2F, 12F, -1F);
		tentacle1.setTextureSize(64, 32);
		tentacle1.mirror = true;
		setRotation(tentacle1, -0.4461433F, 0F, 0F);
		tentacle2 = new ModelRenderer(this, 0, 14);
		tentacle2.addBox(0F, 0F, 0F, 6, 1, 1);
		tentacle2.setRotationPoint(-2.7F, 16.2F, 2F);
		tentacle2.setTextureSize(64, 32);
		tentacle2.mirror = true;
		setRotation(tentacle2, 0F, 0F, -0.4461411F);
		tentacle3 = new ModelRenderer(this, 0, 14);
		tentacle3.addBox(0F, 0F, 0F, 1, 1, 3);
		tentacle3.setRotationPoint(-3F, 17.5F, -0.2F);
		tentacle3.setTextureSize(64, 32);
		tentacle3.mirror = true;
		setRotation(tentacle3, 0.4461411F, 0F, 0F);
		tentacle4 = new ModelRenderer(this, 0, 14);
		tentacle4.addBox(0F, 0F, 0F, 3, 1, 1);
		tentacle4.setRotationPoint(-3F, 14F, -3F);
		tentacle4.setTextureSize(64, 32);
		tentacle4.mirror = true;
		setRotation(tentacle4, 0F, 0F, -0.4461411F);
		tentacle5 = new ModelRenderer(this, 0, 14);
		tentacle5.addBox(0F, 0F, 0F, 1, 1, 4);
		tentacle5.setRotationPoint(-3F, 14F, -2.5F);
		tentacle5.setTextureSize(64, 32);
		tentacle5.mirror = true;
		setRotation(tentacle5, -0.4461411F, 0F, 0F);
		tentacle6 = new ModelRenderer(this, 0, 14);
		tentacle6.addBox(0F, 0F, 0F, 3, 1, 1);
		tentacle6.setRotationPoint(-2F, 18F, -3F);
		tentacle6.setTextureSize(64, 32);
		tentacle6.mirror = true;
		setRotation(tentacle6, 0F, 0F, -0.6320364F);
		tentacle7 = new ModelRenderer(this, 0, 14);
		tentacle7.addBox(0F, 0F, 0F, 1, 4, 1);
		tentacle7.setRotationPoint(2F, 14.5F, -1.5F);
		tentacle7.setTextureSize(64, 32);
		tentacle7.mirror = true;
		setRotation(tentacle7, -0.4089647F, 0.6320364F, 0F);
		blob1 = new ModelRenderer(this, 0, 0);
		blob1.addBox(0F, 0F, 0F, 2, 2, 2);
		blob1.setRotationPoint(-1F, 8F, -1F);
		blob1.setTextureSize(64, 32);
		blob1.mirror = true;
		setRotation(blob1, -0.4833219F, 0F, 0.7807508F);
		blob2 = new ModelRenderer(this, 0, 0);
		blob2.addBox(0F, 0F, 0F, 2, 2, 2);
		blob2.setRotationPoint(0F, 9F, 0F);
		blob2.setTextureSize(64, 32);
		blob2.mirror = true;
		setRotation(blob2, 0.5948578F, 0F, 0.5948578F);
		blob3 = new ModelRenderer(this, 0, 0);
		blob3.addBox(0F, 0F, 0F, 2, 2, 2);
		blob3.setRotationPoint(0F, 8F, -1F);
		blob3.setTextureSize(64, 32);
		blob3.mirror = true;
		setRotation(blob3, -0.669215F, 0F, -0.0743572F);
		blob4 = new ModelRenderer(this, 0, 0);
		blob4.addBox(0F, 0F, 0F, 2, 2, 2);
		blob4.setRotationPoint(-1F, 10F, 0F);
		blob4.setTextureSize(64, 32);
		blob4.mirror = true;
		setRotation(blob4, 0.6320364F, -0.6320364F, 0F);
		blob5 = new ModelRenderer(this, 0, 0);
		blob5.addBox(0F, 0F, 0F, 2, 2, 2);
		blob5.setRotationPoint(-2F, 10F, -1F);
		blob5.setTextureSize(64, 32);
		blob5.mirror = true;
		setRotation(blob5, 0F, 0.3717861F, 1.226894F);
		blob6 = new ModelRenderer(this, 0, 0);
		blob6.addBox(0F, 0F, 0F, 2, 2, 2);
		blob6.setRotationPoint(-3F, 11F, -1F);
		blob6.setTextureSize(64, 32);
		blob6.mirror = true;
		setRotation(blob6, 0F, 1.041001F, -0.7435722F);
		blob7 = new ModelRenderer(this, 0, 0);
		blob7.addBox(0F, 0F, 0F, 2, 2, 2);
		blob7.setRotationPoint(0F, 12F, -4F);
		blob7.setTextureSize(64, 32);
		blob7.mirror = true;
		setRotation(blob7, 0.8551081F, 0F, -0.6320364F);
		blob8 = new ModelRenderer(this, 0, 0);
		blob8.addBox(0F, 0F, 0F, 2, 2, 2);
		blob8.setRotationPoint(1.5F, 10F, -2F);
		blob8.setTextureSize(64, 32);
		blob8.mirror = true;
		setRotation(blob8, 0F, 0.4810499F, 0.7807508F);
		blob9 = new ModelRenderer(this, 0, 0);
		blob9.addBox(0F, 0F, 0F, 2, 2, 2);
		blob9.setRotationPoint(0.5F, 12F, 1F);
		blob9.setTextureSize(64, 32);
		blob9.mirror = true;
		setRotation(blob9, 0.7435722F, 0.669215F, -0.669215F);
		blob10 = new ModelRenderer(this, 0, 0);
		blob10.addBox(0F, 0F, 0F, 2, 2, 2);
		blob10.setRotationPoint(-1F, 10F, 1F);
		blob10.setTextureSize(64, 32);
		blob10.mirror = true;
		setRotation(blob10, 0F, -0.3717861F, 0.7063936F);
		blob11 = new ModelRenderer(this, 0, 0);
		blob11.addBox(0F, 0F, 0F, 1, 1, 1);
		blob11.setRotationPoint(-3F, 13F, 1F);
		blob11.setTextureSize(64, 32);
		blob11.mirror = true;
		setRotation(blob11, 0.3717861F, 0F, -0.3346075F);
		blob12 = new ModelRenderer(this, 0, 0);
		blob12.addBox(0F, 0F, 0F, 1, 1, 1);
		blob12.setRotationPoint(-2.5F, 13F, 0F);
		blob12.setTextureSize(64, 32);
		blob12.mirror = true;
		setRotation(blob12, 0F, -0.5205006F, 0.2602503F);
		blob13 = new ModelRenderer(this, 0, 0);
		blob13.addBox(0F, 0F, 0F, 1, 1, 1);
		blob13.setRotationPoint(-3F, 13F, -1F);
		blob13.setTextureSize(64, 32);
		blob13.mirror = true;
		setRotation(blob13, 0F, 0.7807508F, -0.5205006F);
		blob14 = new ModelRenderer(this, 0, 0);
		blob14.addBox(0F, 0F, 0F, 1, 1, 1);
		blob14.setRotationPoint(-2F, 12.5F, -3F);
		blob14.setTextureSize(64, 32);
		blob14.mirror = true;
		setRotation(blob14, 0.7807508F, 0.4089647F, 0F);
		blob15 = new ModelRenderer(this, 0, 0);
		blob15.addBox(0F, 0F, 0F, 1, 1, 1);
		blob15.setRotationPoint(0F, 12F, 2F);
		blob15.setTextureSize(64, 32);
		blob15.mirror = true;
		setRotation(blob15, 0.7435722F, 0F, -0.2974289F);
		blob16 = new ModelRenderer(this, 0, 0);
		blob16.addBox(0F, 0F, 0F, 1, 1, 1);
		blob16.setRotationPoint(1.5F, 12.5F, 2F);
		blob16.setTextureSize(64, 32);
		blob16.mirror = true;
		setRotation(blob16, 0F, -0.3346075F, 0.5576792F);
		bob17 = new ModelRenderer(this, 0, 0);
		bob17.addBox(0F, 0F, 0F, 1, 1, 1);
		bob17.setRotationPoint(0F, 13F, 2F);
		bob17.setTextureSize(64, 32);
		bob17.mirror = true;
		setRotation(bob17, 0.4089647F, -0.4089647F, 0F);
		blob18 = new ModelRenderer(this, 0, 0);
		blob18.addBox(0F, 0F, 0F, 1, 1, 1);
		blob18.setRotationPoint(-2F, 13F, 2.5F);
		blob18.setTextureSize(64, 32);
		blob18.mirror = true;
		setRotation(blob18, -0.8922867F, 0F, -0.5576792F);
		blob19 = new ModelRenderer(this, 0, 0);
		blob19.addBox(0F, 0F, 0F, 1, 1, 1);
		blob19.setRotationPoint(-1.5F, 14F, 2F);
		blob19.setTextureSize(64, 32);
		blob19.mirror = true;
		setRotation(blob19, 0F, 0.3346075F, -0.3346075F);
		blob20 = new ModelRenderer(this, 0, 0);
		blob20.addBox(0F, 0F, 0F, 1, 1, 1);
		blob20.setRotationPoint(-2.5F, 15F, 1.5F);
		blob20.setTextureSize(64, 32);
		blob20.mirror = true;
		setRotation(blob20, 0.4461433F, 0F, -0.4461433F);
		blob21 = new ModelRenderer(this, 0, 0);
		blob21.addBox(0F, 0F, 0F, 1, 1, 1);
		blob21.setRotationPoint(-2F, 15F, 0F);
		blob21.setTextureSize(64, 32);
		blob21.mirror = true;
		setRotation(blob21, 0F, -1.003822F, -0.6320364F);
		blob22 = new ModelRenderer(this, 0, 0);
		blob22.addBox(0F, 0F, 0F, 1, 1, 1);
		blob22.setRotationPoint(-3F, 16F, 0F);
		blob22.setTextureSize(64, 32);
		blob22.mirror = true;
		setRotation(blob22, -0.5205006F, 0.9666439F, 0F);
		blob23 = new ModelRenderer(this, 0, 0);
		blob23.addBox(0F, 0F, 0F, 1, 1, 1);
		blob23.setRotationPoint(-2F, 16F, -2F);
		blob23.setTextureSize(64, 32);
		blob23.mirror = true;
		setRotation(blob23, -0.2602503F, 0F, 0.5205006F);
		blob24 = new ModelRenderer(this, 0, 0);
		blob24.addBox(0F, 0F, 0F, 1, 1, 1);
		blob24.setRotationPoint(-1F, 14.5F, -2.5F);
		blob24.setTextureSize(64, 32);
		blob24.mirror = true;
		setRotation(blob24, -0.4833219F, 0F, 0.669215F);
		blob25 = new ModelRenderer(this, 0, 0);
		blob25.addBox(0F, 0F, 0F, 1, 1, 1);
		blob25.setRotationPoint(0F, 14F, -2F);
		blob25.setTextureSize(64, 32);
		blob25.mirror = true;
		setRotation(blob25, 0F, 0.8551081F, -0.7435722F);
		blob26 = new ModelRenderer(this, 0, 0);
		blob26.addBox(0F, 0F, 0F, 1, 1, 1);
		blob26.setRotationPoint(0.5F, 15F, -2.5F);
		blob26.setTextureSize(64, 32);
		blob26.mirror = true;
		setRotation(blob26, 0F, 0.2974289F, 0.3346075F);
		blob27 = new ModelRenderer(this, 0, 0);
		blob27.addBox(0F, 0F, 0F, 1, 1, 1);
		blob27.setRotationPoint(1.5F, 13F, -1.5F);
		blob27.setTextureSize(64, 32);
		blob27.mirror = true;
		setRotation(blob27, -0.2974289F, 0.5576792F, 0F);
		blob28 = new ModelRenderer(this, 0, 0);
		blob28.addBox(0F, 0F, 0F, 1, 1, 1);
		blob28.setRotationPoint(-2.5F, 13.5F, -1F);
		blob28.setTextureSize(64, 32);
		blob28.mirror = true;
		setRotation(blob28, 0F, -0.5576792F, 0.5948578F);
		blob29 = new ModelRenderer(this, 0, 0);
		blob29.addBox(0F, 0F, 0F, 1, 1, 1);
		blob29.setRotationPoint(1.5F, 14F, 0F);
		blob29.setTextureSize(64, 32);
		blob29.mirror = true;
		setRotation(blob29, -0.9666439F, 0F, -0.3717861F);
		blob30 = new ModelRenderer(this, 0, 0);
		blob30.addBox(0F, 0F, 0F, 1, 1, 1);
		blob30.setRotationPoint(1.5F, 15F, 1F);
		blob30.setTextureSize(64, 32);
		blob30.mirror = true;
		setRotation(blob30, 0.3346075F, 0.7435722F, 0F);
		blob31 = new ModelRenderer(this, 0, 0);
		blob31.addBox(0F, 0F, 0F, 1, 1, 1);
		blob31.setRotationPoint(1.5F, 16F, 0F);
		blob31.setTextureSize(64, 32);
		blob31.mirror = true;
		setRotation(blob31, 0F, 0.8922867F, -0.5205006F);
		blob32 = new ModelRenderer(this, 0, 0);
		blob32.addBox(0F, 0F, 0F, 1, 1, 1);
		blob32.setRotationPoint(2F, 17.5F, -2F);
		blob32.setTextureSize(64, 32);
		blob32.mirror = true;
		setRotation(blob32, 0.6320364F, -0.4089647F, 0F);
		blob33 = new ModelRenderer(this, 0, 0);
		blob33.addBox(0F, 0F, 0F, 1, 1, 1);
		blob33.setRotationPoint(1.5F, 17F, 0F);
		blob33.setTextureSize(64, 32);
		blob33.mirror = true;
		setRotation(blob33, 0.3346075F, 0F, -0.4461433F);
		blob34 = new ModelRenderer(this, 0, 0);
		blob34.addBox(0F, 0F, 0F, 1, 1, 1);
		blob34.setRotationPoint(2F, 16.5F, 2F);
		blob34.setTextureSize(64, 32);
		blob34.mirror = true;
		setRotation(blob34, -0.7807508F, 0F, 0.7435722F);
		blob35 = new ModelRenderer(this, 0, 0);
		blob35.addBox(0F, 0F, 0F, 1, 1, 1);
		blob35.setRotationPoint(0F, 16.5F, 2F);
		blob35.setTextureSize(64, 32);
		blob35.mirror = true;
		setRotation(blob35, 0F, 0.5205006F, 0.4833219F);
		blob36 = new ModelRenderer(this, 0, 0);
		blob36.addBox(0F, 0F, 0F, 1, 1, 1);
		blob36.setRotationPoint(-1F, 17F, 1.5F);
		blob36.setTextureSize(64, 32);
		blob36.mirror = true;
		setRotation(blob36, 0.4461433F, -0.7063936F, 0F);
		blob37 = new ModelRenderer(this, 0, 0);
		blob37.addBox(0F, 0F, 0F, 1, 1, 1);
		blob37.setRotationPoint(1F, 15.5F, 2F);
		blob37.setTextureSize(64, 32);
		blob37.mirror = true;
		setRotation(blob37, 0F, 0.4461433F, 0.5576792F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		base.render(f5);
		body.render(f5);
		tentacle1.render(f5);
		tentacle2.render(f5);
		tentacle3.render(f5);
		tentacle4.render(f5);
		tentacle5.render(f5);
		tentacle6.render(f5);
		tentacle7.render(f5);
		blob1.render(f5);
		blob2.render(f5);
		blob3.render(f5);
		blob4.render(f5);
		blob5.render(f5);
		blob6.render(f5);
		blob7.render(f5);
		blob8.render(f5);
		blob9.render(f5);
		blob10.render(f5);
		blob11.render(f5);
		blob12.render(f5);
		blob13.render(f5);
		blob14.render(f5);
		blob15.render(f5);
		blob16.render(f5);
		bob17.render(f5);
		blob18.render(f5);
		blob19.render(f5);
		blob20.render(f5);
		blob21.render(f5);
		blob22.render(f5);
		blob23.render(f5);
		blob24.render(f5);
		blob25.render(f5);
		blob26.render(f5);
		blob27.render(f5);
		blob28.render(f5);
		blob29.render(f5);
		blob30.render(f5);
		blob31.render(f5);
		blob32.render(f5);
		blob33.render(f5);
		blob34.render(f5);
		blob35.render(f5);
		blob36.render(f5);
		blob37.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}