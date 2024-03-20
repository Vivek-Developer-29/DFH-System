package DFHSystem.DFHSystem.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericException extends Exception {
    private static final long serialVersionUID = 1L;

    private String message;

}
