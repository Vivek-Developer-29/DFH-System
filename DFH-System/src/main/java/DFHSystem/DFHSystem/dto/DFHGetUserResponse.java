package DFHSystem.DFHSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DFHGetUserResponse {
    private Long id;
    private String phoneNumber;
    private String dob;
    private String name;
    private String email;
}
