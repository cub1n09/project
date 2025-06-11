package com.example.client;

import com.example.client.gui.ClickGUI;
import com.example.client.module.ModuleManager;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid = "forgeclient", name = "Forge Client", version = "1.0")
public class ClientMod {

    public static boolean showGUI = false;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModuleManager.init();
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onRenderOverlay(RenderGameOverlayEvent.Text event) {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            showGUI = !showGUI;
        }
        if (showGUI) {
            ClickGUI.render();
        }
    }
}
