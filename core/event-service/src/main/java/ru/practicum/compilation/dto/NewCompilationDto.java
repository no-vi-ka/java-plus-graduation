package ru.practicum.compilation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewCompilationDto {
    private Boolean pinned = false;
    @NotBlank
    @Size(min = 1, max = 50, message = "Length of title must be more than 0 and less than 51.")
    private String title;
    private Set<Long> events;
}
