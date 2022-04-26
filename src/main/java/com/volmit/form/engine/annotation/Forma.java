package com.volmit.form.engine.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface Forma {
    @Retention(RetentionPolicy.RUNTIME)
    @interface Tooltip {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface AutoCompleteSound { }

    @Retention(RetentionPolicy.RUNTIME)
    @interface AutoCompleteMaterial { }

    @Retention(RetentionPolicy.RUNTIME)
    @interface AutoCompleteItem { }

    @Retention(RetentionPolicy.RUNTIME)
    @interface AutoCompleteBlock { }

    @Retention(RetentionPolicy.RUNTIME)
    @interface ListType {
        Class<?> value();
    }
}
