package acres.dao;

import java.util.List;

import acres.dto.BuildingInfo;
import acres.dto.ComBuildingType;
import acres.dto.ReBuildingType;

public interface BuildingRepository {
	public boolean insertBuilding(BuildingInfo b);
	public boolean updateBuilding(BuildingInfo b);
	public boolean deleteBuilding(BuildingInfo b);
	public ReBuildingType getBuilding(ReBuildingType b);
	public ComBuildingType getBuilding(ComBuildingType b);
	public List<BuildingInfo> getAllBuildings();
	public List<ReBuildingType> getAllResidentialBuildings();
	public List<ComBuildingType> getAllCommercialBuildings();
	public List<BuildingInfo> getBuildingsBySearch(String city, String state, String propertyType, String buildingType, String listingType, double minArea, double maxArea, float minBudget, float maxBudget);
}
