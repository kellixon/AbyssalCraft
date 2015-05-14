/**
 * AbyssalCraft
 * Copyright 2012-2015 Shinoow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shinoow.abyssalcraft.common.items;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.shinoow.abyssalcraft.AbyssalCraft;

public class ItemAbyssalniteCShovel extends ItemACShovel {

	public ItemAbyssalniteCShovel(ToolMaterial mat, String name) {
		super(mat, name, 8, EnumChatFormatting.AQUA);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add(StatCollector.translateToLocal("tooltip.cshovel.1"));
		l.add(StatCollector.translateToLocal("tooltip.cshovel.2"));
	}

	@Override
	public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3){ //Called when an item is right clicked on a block
		if(w.getBlock(x, y, z) == Blocks.sand){
			w.setBlock(x, y, z, Blocks.soul_sand);
			is.damageItem(80, player);
		}
		else if(w.getBlock(x, y, z) == Blocks.soul_sand){
			w.setBlock(x, y, z, Blocks.sand);
			is.damageItem(50, player);
		}
		else if(w.getBlock(x, y, z) == Blocks.dirt){
			w.setBlock(x, y, z, Blocks.gravel);
			is.damageItem(30, player);
		}
		else if(w.getBlock(x, y, z) == Blocks.gravel){
			w.setBlock(x, y, z, Blocks.dirt);
			is.damageItem(30, player);
		}
		else if(w.getBlock(x, y, z) == Blocks.grass){
			w.setBlock(x, y, z, AbyssalCraft.Darkgrass);
			is.damageItem(40, player);
		}
		else if(w.getBlock(x, y, z) == AbyssalCraft.Darkgrass){
			w.setBlock(x, y, z, AbyssalCraft.dreadgrass);
			is.damageItem(40, player);
		}
		else if(w.getBlock(x, y, z) == AbyssalCraft.dreadgrass){
			w.setBlock(x, y, z, Blocks.grass);
			is.damageItem(40, player);
		}
		return false;
	}
}