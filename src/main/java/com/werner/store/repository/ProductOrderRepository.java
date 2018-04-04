package com.werner.store.repository;

import com.werner.store.domain.ProductOrder;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the ProductOrder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

	Page<ProductOrder> findAllByCustomerUserLogin(String login, Pageable pageable);

	ProductOrder findOneByIdAndCustomerUserLogin(Long id, String login);

}
