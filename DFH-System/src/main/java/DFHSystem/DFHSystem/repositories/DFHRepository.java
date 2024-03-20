package DFHSystem.DFHSystem.repositories;

import DFHSystem.DFHSystem.entities.DFHUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DFHRepository extends JpaRepository<DFHUser,Long> {
        Optional<DFHUser> findFirstByDobAndPhoneNumber(String dob, String phoneNumber);
    }

