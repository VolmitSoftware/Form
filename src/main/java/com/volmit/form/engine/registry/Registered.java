package com.volmit.form.engine.registry;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Registered<T> {
    private final String key;
    private final T object;
    private final Registry<T> registry;
}
