package com.salon.repositories.staffRepository;

import com.salon.domain.staff.Cleaners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanersRepository extends JpaRepository<Cleaners,Integer>  {

}
