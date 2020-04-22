package acres.dao;

import java.util.List;

import acres.dto.BuildingInfo;

public interface BuildingRepository {
	public boolean insertBuilding(BuildingInfo b);
	public boolean updateBuilding(BuildingInfo b);
	public boolean deleteBuilding(BuildingInfo b);
	public BuildingInfo getBuilding(int buildingId);
	public List<BuildingInfo> getAllBuildings(BuildingInfo b, List<String> filters);
}
