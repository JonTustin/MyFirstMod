package net.tuscon.myfirstmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tuscon.myfirstmod.MyFirstMod;

@Mod.EventBusSubscriber(modid = MyFirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModesTabs {
    public static CreativeModeTab MOD_TAB;

    @SubscribeEvent
    public static void  registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        MOD_TAB = event.registerCreativeModeTab(new ResourceLocation(MyFirstMod.MOD_ID, "mod_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.mod_tab")));
    }
}
