package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.FullMassage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FullMassageRepository extends JpaRepository<FullMassage,Integer> {

}
