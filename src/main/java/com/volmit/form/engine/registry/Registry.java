package com.volmit.form.engine.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registry<T> {
    private final Map<String, Registered<T>> registered;

    public Registry()
    {
        this.registered = new HashMap<>();
    }

    public void register(String key, T object)
    {
        if(registered.containsKey(key))
        {
            throw new RuntimeException("Key " + key + " Already registered!");
        }

        registered.put(key, new Registered<>(key, object, this));
    }

    public List<Registered<T>> getRegisteredObjects()
    {
        return new ArrayList<>(registered.values());
    }

    public T getRegisteredObject(String key)
    {
        Registered<T> t = registered.get(key);

        if(t != null)
        {
            return t.getObject();
        }

        return null;
    }
}
