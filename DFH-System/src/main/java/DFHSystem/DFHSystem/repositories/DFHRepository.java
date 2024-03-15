package DFHSystem.DFHSystem.repositories;

import DFHSystem.DFHSystem.entities.DFHUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DFHRepository extends JpaRepository<DFHUser,Long> {
        DFHUser findFirstByDobAndPhoneNumber(String dob, String phoneNumber);
    }

