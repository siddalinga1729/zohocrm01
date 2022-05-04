package com.zohocrm01.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm01.entites.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
//inheritance is done here
}
