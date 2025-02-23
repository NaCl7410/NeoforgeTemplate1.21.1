package net.salt.neoforgetemplate.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.salt.neoforgetemplate.NeoforgeTemplate;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoforgeTemplate.MODID);

    /*
    associated files include:
    models/item/.json
    textures/item/.png
    lang/en_us.json entry
    */

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEBUG_WAND = ITEMS.register("debug_wand",
            () -> new DebugWandItem(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
