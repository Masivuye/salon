package com.salon.repositories.hairRepository;


import com.salon.domain.hair.Promotions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionsRepository extends JpaRepository<Promotions,Integer> {

}
