package com.volmit.form.engine.data;

import com.volmit.form.engine.annotation.Forma;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FormBlock {
    @Forma.Tooltip("Represents a list of possible block drops & chances when broken")
    @Forma.ListType(FormBlockDrop.class)
    private List<FormBlockDrop> drops;

    @Forma.Tooltip("Represents this block's material. You can either use vanilla materials or create your own.")
    @Forma.AutoCompleteMaterial
    private String material;
}
