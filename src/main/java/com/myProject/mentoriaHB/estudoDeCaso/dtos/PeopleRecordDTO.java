package com.myProject.mentoriaHB.estudoDeCaso.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PeopleRecordDTO(@NotBlank String name, @NotBlank String surname, @NotNull int age) {
}
