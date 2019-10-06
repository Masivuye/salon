package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.Massage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MassageRepository extends JpaRepository<Massage,Integer> {

}
