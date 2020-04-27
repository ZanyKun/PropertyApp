package acres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acres.dao.BuildingRepository;
import acres.dto.BuildingInfo;
import acres.dto.ComBuildingType;
import acres.dto.ReBuildingType;

@Service
public class BuildingServiceImpl implements BuildingService{
	
	@Autowired BuildingRepository buildRep;
	
	@Override
	public boolean insertResidentialBuilding(ReBuildingType r) {
		return buildRep.insertBuilding(r);
	}

	@Override
	public boolean insertCommercialBuilding(ComBuildingType c) {
		return buildRep.insertBuilding(c);
	}

	@Override
	public List<BuildingInfo> retrieveAllBuildings() {
		return buildRep.getAllBuildings();
	}
	
}
