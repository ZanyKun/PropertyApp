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
@DiscriminatorValue("Residental")
@Component
public class ReBuildingType extends BuildingInfo{
	String reBuildingType;			//Apartment/Flat/BuilderFloor, Residential Land, House/Villa, Others
	
	String propertyList;			//Sell, Rent, Paying Guest: Residential
	String apartmentType;			//Studio, Residential, Serviced Apartments, Independent
	String houseType;				//Independent, Farm House
	
	int balconyNum;					//# of balconies (No balconies for commercial spaces)
}