package itemtransformhelper;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.world.World;

/**
 * User: The Grey Ghost
 * Date: 26/01/2015
 * ItemCamera is very simple item used to activate the ItemCameraTransforms override when it is held in the hotbar.
 * See the Notes.
 */
public class ItemCamera extends Item
{
  public ItemCamera()
  {
    this.setMaxStackSize(1);
    this.setCreativeTab(StartupCommon.tabITH);
  }

  // adds 'tooltip' text
  @SideOnly(Side.CLIENT)
  @SuppressWarnings({ "unchecked", "rawtypes" })
  @Override
  public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
    tooltip.add("1) Place the camera in your hotbar");
    tooltip.add("2) Hold an item in your hand");
    tooltip.add("3) Use the cursor keys to ");
    tooltip.add("   modify the item transform.");
  }
}
