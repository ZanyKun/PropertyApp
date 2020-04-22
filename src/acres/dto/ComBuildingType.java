package acres.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("Commercial")
@Component
public class ComBuildingType extends BuildingInfo{
	String comBuildingType;			//Offices, Retail, Land, Industry Storage, Hospitality, Others
	
	String propertyList;			//Sell, Rent/Lease: Commercial
	String officeType;				//Commercial, Office in IT Park, Office in Business Park, Business Center, Time Share
	String retailType;				//Commercial Shop, Commercial Showroom, Space in retail mall
	String landType;				//Commercial Land, Agricultural Land, Industrial Lands
	String industryType;			//Factory, Manufacturing
	String storageType;				//Ware House, Cold Storage
	String hospitalityType;			//Hotel/Resorts, Guest-house/Banquet halls
	boolean multipleProperty;		//Option for all commercial options
}
