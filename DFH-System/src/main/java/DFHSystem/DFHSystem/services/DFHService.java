package DFHSystem.DFHSystem.services;

import DFHSystem.DFHSystem.dto.DFHGetUserRequest;
import DFHSystem.DFHSystem.entities.DFHUser;
import DFHSystem.DFHSystem.exceptions.GenericException;

import java.util.List;

public interface DFHService {

    DFHUser createDFHUser(DFHUser dfhUser);
    List<DFHUser> getAllDFHUser();
    DFHUser getDFHUserById(Long id);
    DFHUser updateDFHUser(Long id, DFHUser updatedDFHUser);
    void deleteDFHUser(Long id);

    DFHUser getDFHUser(DFHGetUserRequest dfhGetUserRequest) throws GenericException;
}
