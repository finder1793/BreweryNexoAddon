package dev.jsinco;

import com.dre.brewery.recipe.PluginItem;
import com.nexomc.nexo.api.NexoItems;
import org.bukkit.inventory.ItemStack;

public class NexoPluginItem extends PluginItem {
    @Override
    public boolean matches(ItemStack itemStack) {
        if (!IAOraxenAddon.isUsingNexo()) {
            return false;
        }

        final String itemId = NexoItems.getIdByItem(itemStack);
        if (itemId == null) {
            return false;
        }
        return itemId.equals(this.getItemId());
    }
}
