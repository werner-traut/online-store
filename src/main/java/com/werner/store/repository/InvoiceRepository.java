package com.werner.store.repository;

import com.werner.store.domain.Invoice;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Invoice entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

	Page<Invoice> findAllByOrderCustomerUserLogin(String login, Pageable pageable);

	Invoice findOneByIdAndOrderCustomerUserLogin(Long id, String login);

}
