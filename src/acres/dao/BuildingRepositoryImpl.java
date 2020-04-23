package acres.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import acres.dto.BuildingInfo;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository{
	
	@Autowired SessionFactory sf;
	
	@Override
	public boolean insertBuilding(BuildingInfo b) {
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(b);
		s.getTransaction().commit();
		return true;
	}

	@Override
	public boolean updateBuilding(BuildingInfo b) {
		Session s = sf.openSession();
		s.beginTransaction();
		s.update(b);
		s.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteBuilding(BuildingInfo b) {
		Session s = sf.openSession();
		s.beginTransaction();
		s.delete(b);
		s.getTransaction().commit();
		return true;
	}

	@Override
	public BuildingInfo getBuilding(int buildingId) {
		Session s = sf.openSession();
		s.beginTransaction();
		BuildingInfo building = s.get(BuildingInfo.class, buildingId);
		return building;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BuildingInfo> getAllBuildings(BuildingInfo b, List<String> filters) {
		Session s = sf.openSession();
		s.beginTransaction();
		Criteria cr = s.createCriteria(BuildingInfo.class);
		cr.setFirstResult(1);
		cr.setMaxResults(10);
		if(!filters.isEmpty()) {
			
		}
		return cr.list();
	}
	
}
