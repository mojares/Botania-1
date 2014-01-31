/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jan 31, 2014, 3:03:04 PM (GMT)]
 */
package vazkii.botania.api.mana;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import vazkii.botania.api.internal.IManaBurst;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Have an Item implement this to be counted as a lens for the mana spreader.
 */
public interface ILens {
	
	@SideOnly(Side.CLIENT)
	public int getLensColor(ItemStack stack);
	
	/**
	 * Called when a mana spreader that has this focus shoots a burst. This is where
	 * you change the properties of the burst.
	 */
	public void apply(ItemStack stack, BurstProperties props);
	
	/**
	 * Called when a mana burst fired from a mana spreader with this focus collides against
	 * any block. This is called after the collision is handled.
	 */
	public void collideBurst(IManaBurst burst, MovingObjectPosition pos, boolean isManaBlock, ItemStack stack);
	
	/**
	 * Called when a mana burst fired from a mana spreader with this focus is updated.
	 * This is called before the update is handled.
	 */
	public void updateBurst(IManaBurst burst, ItemStack stack);
	
}
