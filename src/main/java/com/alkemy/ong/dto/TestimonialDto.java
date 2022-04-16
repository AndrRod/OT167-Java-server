package com.alkemy.ong.dto;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
public class TestimonialDto {
    @Schema(name = "id", example = "1", type = "integer", nullable = false, description = "id: autogenerated", hidden = true)
    private Long id;

    @Schema(name = "name", example = "Agostina Suarez", nullable = false, description = "name: cannot allow null")
    @NotNull(message = "The name cannot be empty")
    private String name;

    @Schema(name = "image", type = "String", example = "ImageUrl", nullable = true, description = "image: cannot allow null")
    private String image;

    @Schema(name = "content", type = "String", nullable = true, example = "I love this ONG")
    @NotNull(message = "The content cannot be empty")
    private String content;
}
