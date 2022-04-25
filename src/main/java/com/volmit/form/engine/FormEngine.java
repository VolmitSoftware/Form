package com.volmit.form.engine;

import com.volmit.form.engine.registry.Registrar;
import lombok.Data;

@Data
public class FormEngine {
    private final Registrar registrar;

    public FormEngine()
    {
        this.registrar = new Registrar();
    }
}
