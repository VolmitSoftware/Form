package com.volmit.form.engine.data;

import com.volmit.form.engine.annotation.Forma;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FormBlockDrop {
    @Forma.AutoCompleteItem
    @Forma.Tooltip("The item to use for this drop")
    private String item;

    @Forma.Tooltip("The min amount of items to drop.")
    private int minCount = 1;

    @Forma.Tooltip("The max amount of items to drop.")
    private int maxCount = 1;

    @Forma.Tooltip("The chance from 0 to 1 this item will drop anything at all.")
    private double chance = 1;
}
