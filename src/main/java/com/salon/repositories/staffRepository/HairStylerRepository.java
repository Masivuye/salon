package com.salon.repositories.staffRepository;

import com.salon.domain.staff.HairStyler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HairStylerRepository extends JpaRepository<HairStyler,Integer> {

}
