package com.zohocrm01.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm01.entites.Billing;
@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {

}
