package DFHSystem.DFHSystem.services.impl;

import DFHSystem.DFHSystem.configs.DFHRestTemplateConfig;
import DFHSystem.DFHSystem.dto.DFHGetUserRequest;
import DFHSystem.DFHSystem.entities.DFHUser;
import DFHSystem.DFHSystem.repositories.DFHRepository;
import DFHSystem.DFHSystem.services.DFHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class DFHServiceImpl implements DFHService {
    @Autowired
    private DFHRepository dfhRepository;

    @Autowired
    private DFHRestTemplateConfig dfhRestTemplateConfig;

    @Override
    public DFHUser createDFHUser(DFHUser dfhUser) {
        dfhRepository.save(dfhUser);
        return dfhUser;
    }

    @Override
    public List<DFHUser> getAllDFHUser() {
        return dfhRepository.findAll();
    }

    @Override
    public DFHUser getDFHUserById(Long id) {
        return dfhRepository.findById(id).orElse(null);
    }

    @Override
    public DFHUser updateDFHUser(Long id, DFHUser updatedDFHUser) {
        updatedDFHUser.setId(id);
        return dfhRepository.save(updatedDFHUser);
    }

    @Override
    public void deleteDFHUser(Long id) {
        dfhRepository.deleteById(id);
    }

    @Override
    public DFHUser getDFHUser(DFHGetUserRequest dfhGetUserRequest) {
        return dfhRepository.findFirstByDobAndPhoneNumber(dfhGetUserRequest.getDob(), dfhGetUserRequest.getPhoneNumber());
    }

}
