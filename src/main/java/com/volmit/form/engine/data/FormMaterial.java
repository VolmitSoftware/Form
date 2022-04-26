package com.volmit.form.engine.data;

import com.volmit.form.engine.annotation.Forma;
import lombok.Data;
import lombok.NoArgsConstructor;

@Forma.Tooltip("Represents a material that describes how blocks behave")
@Data
@NoArgsConstructor
public class FormMaterial {
    @Forma.Tooltip("Can any block that uses this material burn or not")
    private boolean canBurn = false;

    @Forma.Tooltip("How do blocks that use this material behave with pistons")
    private FormPistonBehavior pistonBehavior = FormPistonBehavior.PUSHED;

    @Forma.Tooltip("The sound played when blocks are placed")
    @Forma.AutoCompleteSound
    private String placeSound = "block.stone.place";

    @Forma.Tooltip("The sound played when blocks are broken")
    @Forma.AutoCompleteSound
    private String breakSound = "block.stone.break";

    @Forma.Tooltip("The sound played when blocks are stepped on")
    @Forma.AutoCompleteSound
    private String stepSound = "block.stone.step";

    @Forma.Tooltip("The sound played when blocks are hit (while digging)")
    @Forma.AutoCompleteSound
    private String hitSound = "block.stone.hit";

    @Forma.Tooltip("The sound played when blocks are landed on (falling onto)")
    @Forma.AutoCompleteSound
    private String fallSound = "block.stone.fall";
}
