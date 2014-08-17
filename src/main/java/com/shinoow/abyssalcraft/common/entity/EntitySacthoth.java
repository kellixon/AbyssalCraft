/**AbyssalCraft
 *Copyright 2012-2014 Shinoow
 *
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 */
package com.shinoow.abyssalcraft.common.entity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.shinoow.abyssalcraft.AbyssalCraft;

public class EntitySacthoth extends EntityMob implements IBossDisplayData {

	public EntitySacthoth(World par1World) {
		super(par1World);
		setSize(1.5F, 4.0F);
		tasks.addTask(0, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.35D, true));
		tasks.addTask(1, new EntityAIMoveTowardsRestriction(this, 0.35D));
		tasks.addTask(2, new EntityAIWander(this, 0.35D));
		tasks.addTask(3, new EntityAILookIdle(this));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		ignoreFrustumCheck = true;
	}

	@Override
	public String getCommandSenderName()
	{
		return EnumChatFormatting.DARK_RED + StatCollector.translateToLocalFormatted("entity.abyssalcraft.shadowboss.name");
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		// Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
		// Follow Range - default 32.0D - min 0.0D - max 2048.0D
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(128.0D);
		// Knockback Resistance - default 0.0D - min 0.0D - max 1.0D
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.4D);
		// Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.799D);
		// Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15.0D);
	}

	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected boolean canDespawn()
	{
		return false;
	}

	@Override
	public boolean attackEntityAsMob(Entity par1Entity) {

		if (super.attackEntityAsMob(par1Entity))
			if (par1Entity instanceof EntityLivingBase)
				((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 60));
		return hasAttacked;
	}

	@Override
	protected float getSoundPitch()
	{
		return rand.nextFloat() - rand.nextFloat() * 0.2F + 0.6F;
	}

	@Override
	protected String getLivingSound()
	{
		return "mob.blaze.breathe";
	}

	@Override
	protected String getHurtSound()
	{
		return "mob.blaze.hit";
	}

	@Override
	protected String getDeathSound()
	{
		return "mob.blaze.death";
	}

	@Override
	protected float getSoundVolume()
	{
		return 5.0F;
	}

	@Override
	protected Item getDropItem()
	{
		return AbyssalCraft.OC;

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void onLivingUpdate()
	{
		for (int i = 0; i < 2; ++i)
			worldObj.spawnParticle("largesmoke", posX + (rand.nextDouble() - 0.5D) * width, posY + rand.nextDouble() * height, posZ + (rand.nextDouble() - 0.5D) * width, 0.0D, 0.0D, 0.0D);

		List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(30.0D, 30.0D, 30.0D));
		if (list != null)
			for (int k2 = 0; k2 < list.size(); k2++) {
				Entity entity = (Entity)list.get(k2);
				if (entity instanceof EntityPlayer && !entity.isDead)
					((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 40));
			}
		super.onLivingUpdate();
	}
}