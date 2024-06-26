package DFHSystem.DFHSystem.controllers;

import DFHSystem.DFHSystem.dto.DFHGetUserRequest;
import DFHSystem.DFHSystem.dto.DFHGetUserResponse;
import DFHSystem.DFHSystem.entities.DFHUser;
import DFHSystem.DFHSystem.exceptions.GenericException;
import DFHSystem.DFHSystem.services.DFHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dfhSystem")
public class DFHController {

    @Autowired
    private DFHService dfhService;

    //http://localhost:8081/api/dfhSystem
    @PostMapping
    public DFHUser createDFHUser(@RequestBody DFHUser dfhUser) {
        return dfhService.createDFHUser(dfhUser);
    }

    //http://localhost:8081/api/dfhSystem
    @GetMapping
    public List<DFHUser> getAllDFHUser(){
        return dfhService.getAllDFHUser();
    }

    //http://localhost:8081/api/dfhSystem/{dfhUserId}
    @GetMapping("/{dfhUserId}")
    public DFHUser getDFHUserById(@PathVariable Long id){
        return dfhService.getDFHUserById(id);
    }

    //http://localhost:8081/api/dfhSystem/{dfhUserId}
    @PutMapping("/{dfhUserid}")
    public DFHUser updateDFHUser(@PathVariable Long id, @RequestBody DFHUser updatedDFHUser){
        return dfhService.updateDFHUser(id, updatedDFHUser);
    }

    //http://localhost:8081/api/dfhSystem/{dfhUserId}
    @DeleteMapping("/{dfhUserid}")
    public void deleteDFHUser(@PathVariable Long id){
        dfhService.deleteDFHUser(id);
    }

    //http://localhost:8081/api/dfhSystem/validate-user
    @PostMapping("/validate-user")
    public DFHGetUserResponse DFHUser(@RequestBody DFHGetUserRequest dfhGetUserRequest) throws GenericException {
        if(dfhGetUserRequest.getDob().equalsIgnoreCase("") ||
                dfhGetUserRequest.getPhoneNumber().equalsIgnoreCase("") ||
                dfhGetUserRequest.getPhoneNumber().length()!=12
        )
            throw new GenericException("Invalid Phone Number or Date Of Birth");
        final DFHUser dfhUser = dfhService.getDFHUser(dfhGetUserRequest);
        return new DFHGetUserResponse(dfhUser.getId(),dfhUser.getPhoneNumber(), dfhUser.getDob(),dfhUser.getName(),dfhUser.getEmail());

    }
}
