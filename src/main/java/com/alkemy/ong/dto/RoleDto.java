package com.alkemy.ong.dto;

import com.alkemy.ong.security.dto.UserRegisterRequest;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@RequiredArgsConstructor
public class RoleDto {
    @Schema(name = "id", example = "1", type = "Long", description = "id: autogenerated", hidden = true)
    private Long id;
    @Schema(name = "name",type = "String", example = "USER", description = "name: cannot allow null")
    @NotNull(message = "The name cannot be empty")
    private String name;
    @Schema(name = "description", type = "String", nullable = true, example = "A user can only make use of the methods allowed for users",description = "description: describes the permissions for the role")
    private String description;
    @Schema(name = "createdDate", type = "LocalDateTime", nullable = true, example = "2021-04-06T10:35:17.000",description = "description : creation date")
    private LocalDateTime createdDate;
    @Schema(name = "users", type = "List", nullable = true, example = "(Luciano,Andres,Micaela)",description = "description : list of users")
    private List<UserRegisterRequest> users;
    @Schema(name = "modifiedDate", type = "LocalDateTime", nullable = true, example = "2021-07-05T10:35:17.000",description = "description : modified date")
    private LocalDateTime modifiedDate;
}
