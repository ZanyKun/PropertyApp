package acres.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "listing_type")
@Component
public class BuildingInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int buildingId;
	
	//For all options
	String address;					//House Number and Street Name	(required)
	String city;					//								(required)
	String state;				//									(required)
	String projectName;				//								(Not required)
	boolean hideAddress;			//True to hide address from buyers, false to show
	String description;				//Description for building
	
	//For all options minus balconyNum for Commercial buildings
	double plotArea;				//Total measured area where property stands (Required)
	String areaUnit;				// sq.ft, sq. yards, sq. m, acres
	String washroomNum;				//# of bathrooms
	
	String ownership;				//For commercial buildings: Freehold, leasehold, Power of Attorney, Cooperative Society
	
	String availability;			//Under Construction, Ready to Move, New Construction
	String possessionBy;			//Time til ownership
	String ageOfProperty;			//For Ready to Move: 0-1 year old, 2-3 year old etc...
	
	float expectedRent;				//For rent/lease
	float expectePrice;				//For sell
	
	
	@ManyToOne
	@JoinColumn(name = "building_Id")
	UserInfo user;
}
