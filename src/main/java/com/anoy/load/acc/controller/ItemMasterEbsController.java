package com.anoy.load.acc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anoy.load.acc.model.EbsItemMasterEntity;
import com.anoy.load.acc.service.ItemMasterService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api")
public class ItemMasterEbsController {
	
	@Autowired
	ItemMasterService itemMasterService;

	
	@GetMapping(path = "/{itemNumber}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<EbsItemMasterEntity>> getEbsItemMasterDetails(@PathVariable("itemNumber") String itemNumber){
		Optional<EbsItemMasterEntity> ebsItemMaster = itemMasterService.getEbsDetails(itemNumber);
			return new ResponseEntity<Optional<EbsItemMasterEntity>>(ebsItemMaster,HttpStatus.OK);
		
	}

}
