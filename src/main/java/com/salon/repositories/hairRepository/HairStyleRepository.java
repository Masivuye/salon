package com.salon.repositories.hairRepository;

import com.salon.domain.hair.HairStyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairStyleRepository extends JpaRepository<HairStyle,String> {

}
