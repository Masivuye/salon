package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.Manicure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManicureRepository extends  JpaRepository<Manicure,String>{

}
