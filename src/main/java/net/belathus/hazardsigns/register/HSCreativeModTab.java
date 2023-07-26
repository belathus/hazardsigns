package net.belathus.hazardsigns.register;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class HSCreativeModTab {
    public static final CreativeModeTab HAZARDSIGNS_TAB = new CreativeModeTab("hazardsignstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(HSBlocks.HAZARD_BLOCK.get());
        }
    };
}
