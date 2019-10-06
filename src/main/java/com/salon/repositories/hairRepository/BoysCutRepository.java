package com.salon.repositories.hairRepository;

import com.salon.domain.hair.BoysCut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoysCutRepository extends JpaRepository<BoysCut,String> {

}
