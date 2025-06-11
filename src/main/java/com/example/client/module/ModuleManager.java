package com.example.client.module;

import com.example.client.module.stubs.ExampleModule;
import com.example.client.module.stubs.ExampleModule2;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    private static final List<Module> modules = new ArrayList<>();

    public static void init() {
        modules.add(new ExampleModule());
        modules.add(new ExampleModule2());
    }

    public static List<Module> getModules() {
        return modules;
    }
}
