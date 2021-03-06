package com.werner.store.repository;

import com.werner.store.domain.Shipment;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

	Page<Shipment> findAllByInvoiceOrderCustomerUserLogin(String login, Pageable pageable);

	Shipment findOneByIdAndInvoiceOrderCustomerUserLogin(Long id, String login);

}
