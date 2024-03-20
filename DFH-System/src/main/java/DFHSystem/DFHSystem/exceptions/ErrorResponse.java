package DFHSystem.DFHSystem.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ErrorResponse {

        private final String status = "error";
        private final String data = null;
        private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }
}


