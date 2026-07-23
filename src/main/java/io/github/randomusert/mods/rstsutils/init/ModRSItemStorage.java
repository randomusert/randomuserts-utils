package io.github.randomusert.mods.rstsutils.init;

import io.github.randomusert.mods.rstsutils.RandomusertSUtils;
import io.github.randomusert.mods.rstsutils.api.storage.CustomItemstorageVariant;
import io.github.randomusert.mods.rstsutils.api.storage.CustomStorageDiskVariant;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModRSItemStorage {

    public static final Map<CustomItemstorageVariant, Item> ITEM_STORAGE_PART = new HashMap<>();
    public static final Map<CustomItemstorageVariant, Item> ITEM_DISK = new HashMap<>();

    static {
        for (var variant : CustomItemstorageVariant.values()) {
            ITEM_STORAGE_PART.put(variant, register("storagepart_" + variant.getName(), Item::new, new Item.Properties()));
            ITEM_DISK.put(variant,
                    register("disk_" + variant.getName(), properties -> new CustomStorageDiskVariant(variant, properties), new Item.Properties()));
        }
    }

    //public static final Item SUSPICIOUS_SUBSTANCE = register("suspicious_substance", Item::new, new Item.Properties());

    private static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(RandomusertSUtils.MOD_ID, name));

        // Create the item instance.
        T item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
    }
}
