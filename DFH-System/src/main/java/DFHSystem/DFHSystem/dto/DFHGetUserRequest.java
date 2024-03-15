package DFHSystem.DFHSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DFHGetUserRequest {
    private String dob;
    private String phoneNumber;
}
