package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.UpperMassage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpperMassageRepository extends JpaRepository<UpperMassage,Integer> {

}
