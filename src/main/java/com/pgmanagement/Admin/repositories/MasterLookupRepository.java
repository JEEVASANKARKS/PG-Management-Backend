package com.pgmanagement.Admin.repositories;

import com.pgmanagement.Admin.model.MasterLookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterLookupRepository extends JpaRepository<MasterLookup, Long> {
    List<MasterLookup> findByCategory(String category);
}
