package com.example.client.module;

public abstract class Module {
    private final String name;
    private boolean enabled;

    public Module(String name) {
        this.name = name;
        this.enabled = false;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void toggle() {
        enabled = !enabled;
    }

    public abstract void onUpdate();
}
