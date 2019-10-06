package com.salon.repositories.ordersRepository;

import com.salon.domain.orders.LocalSuppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalSupplierRepository extends JpaRepository<LocalSuppliers,Integer>{

}
