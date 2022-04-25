package com.volmit.form.engine.registry;

import java.util.ArrayList;
import java.util.List;

public class Registrar  {
    private final Registry<Registry<?>> masterRegistry;

    public Registrar()
    {
        masterRegistry = new Registry<>();
    }

    public List<Registered<Registry<?>>> getRegistries()
    {
        return masterRegistry.getRegisteredObjects();
    }

    public <T> Registry<T> getRegistry(Class<T> type)
    {
        Registry<?> r = masterRegistry.getRegisteredObject(type.getCanonicalName());

        if(r == null)
        {
            r = new Registry<T>();
            masterRegistry.register(type.getCanonicalName(), r);
        }

        return (Registry<T>) r;
    }

    public <T> T getRegisteredObject(Class<T> type, String key)
    {
        return getRegistry(type).getRegisteredObject(key);
    }

    public <T> void registerObject(String key, T object)
    {
        ((Registry<T>)getRegistry(object.getClass())).register(key, object);
    }
}
