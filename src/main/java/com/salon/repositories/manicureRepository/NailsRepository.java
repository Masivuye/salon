package com.salon.repositories.manicureRepository;

import com.salon.domain.manicure.Nails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NailsRepository extends JpaRepository<Nails,String>  {

}
