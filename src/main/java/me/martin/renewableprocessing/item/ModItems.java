package me.martin.renewableprocessing.item;

import me.martin.renewableprocessing.CreateRenewableProcessing;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateRenewableProcessing.MODID);

    public static final DeferredItem<Item> ASH = ITEMS.registerSimpleItem("ash");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
