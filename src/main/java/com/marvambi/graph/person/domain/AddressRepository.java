package com.marvambi.graph.person.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    List<Address> findByPersonId(Integer personId);
}
