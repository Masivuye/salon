package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.ImportSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportSupplierRepository extends JpaRepository<ImportSupplier,Integer> {

}
