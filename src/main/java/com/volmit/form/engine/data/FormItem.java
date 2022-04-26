package com.volmit.form.engine.data;

import com.volmit.form.engine.annotation.Forma;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FormItem {
    @Forma.Tooltip("The maximum ammount of items this stack can hold")
    private int maxStackSize = 64;

    @Forma.Tooltip("The maximum durability this tool can have. Must have a stack size of 1. Disable by setting max durability to -1.")
    private int maxDurability = -1;

    @Forma.Tooltip("The unlocalized name for this tool. You can define the name via lang.")
    private String unlocalizedName;
}
