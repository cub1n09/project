package com.example.client.gui;

import com.example.client.module.Module;
import com.example.client.module.ModuleManager;
import net.minecraft.client.Minecraft;

public class ClickGUI {
    public static void render() {
        Minecraft mc = Minecraft.getMinecraft();
        int y = 20;
        for (Module module : ModuleManager.getModules()) {
            mc.fontRendererObj.drawStringWithShadow(module.getName() + ": " + (module.isEnabled() ? "ON" : "OFF"), 20, y, module.isEnabled() ? 0x00FF00 : 0xFF0000);
            y += 10;
        }
    }
}
