package acres.service;

import acres.dto.ComBuildingType;
import acres.dto.ReBuildingType;

public interface BuildingService {
	boolean insertResidentialBuilding(ReBuildingType r);
	boolean insertCommercialBuilding(ComBuildingType c);
}
