package br.com.vinicius.api.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class StandardError {

    private LocalDate timestamp;
    private Integer status;
    private String error;
    private String path;
}
