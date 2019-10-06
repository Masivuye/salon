package com.salon.repositories.hairRepository;

import com.salon.domain.hair.GirlsHair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GirlsHairRepository extends JpaRepository<GirlsHair,String>{

}
