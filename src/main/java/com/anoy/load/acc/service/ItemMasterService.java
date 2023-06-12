package com.anoy.load.acc.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anoy.load.acc.exception.ItemMasterServiceException;
import com.anoy.load.acc.model.EbsItemMasterEntity;
import com.anoy.load.acc.repo.EbsItemMasterRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItemMasterService {
	
	@Autowired
	EbsItemMasterRepository ebsItemMasterRepository;
	
	public Optional<EbsItemMasterEntity> getEbsDetails(String itemNumber) throws ItemMasterServiceException{
		return Optional.ofNullable(ebsItemMasterRepository.findById(itemNumber).orElseThrow(()-> new ItemMasterServiceException("Unable to fetch record from the service database")));
	}

}
