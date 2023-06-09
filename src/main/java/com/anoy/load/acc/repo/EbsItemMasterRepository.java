package com.anoy.load.acc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anoy.load.acc.model.EbsItemMasterEntity;

@Repository
public interface EbsItemMasterRepository extends JpaRepository<EbsItemMasterEntity, String>{

}
