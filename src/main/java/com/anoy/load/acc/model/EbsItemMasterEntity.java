package com.anoy.load.acc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ebs_data_migration")
public class EbsItemMasterEntity {
@Id
private String itemId;
private String itemStore;
private String itemLocation;
private Double itemPrice;
private String itemStatus;
private String itemType;
private String postalCode;
private String managerName;
private String managerPhone;
private String ownership;
}
