package acres.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import acres.dto.BuildingInfo;
import acres.dto.ComBuildingType;
import acres.dto.ReBuildingType;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository{
	
	@Autowired SessionFactory sf;
	
	@Override
	public boolean insertBuilding(BuildingInfo b) {
		try (Session s = sf.openSession()){
			s.beginTransaction();
			s.save(b);
			s.getTransaction().commit();
			return true;
		}catch(HibernateException e){
			return false;
		}
	}

	@Override
	public boolean updateBuilding(BuildingInfo b) {
		try(Session s = sf.openSession()){
			s.beginTransaction();
			s.update(b);
			s.getTransaction().commit();
			return true;
		}catch(HibernateException e) {
			return false;
		}
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
	public ReBuildingType getBuilding(ReBuildingType b) {
		Session s = sf.openSession();
		s.beginTransaction();
		ReBuildingType building = s.get(ReBuildingType.class, b.getBuildingId());
		return building;
	}
	
	@Override
	public ComBuildingType getBuilding(ComBuildingType b) {
		Session s = sf.openSession();
		s.beginTransaction();
		ComBuildingType building = s.get(ComBuildingType.class, b.getBuildingId());
		return building;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<BuildingInfo> getAllBuildings() {
		Session s = sf.openSession();
		s.beginTransaction();
		Criteria cr = s.createCriteria(BuildingInfo.class);
		cr.setFirstResult(1);
		cr.setMaxResults(6);
		return cr.list();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ReBuildingType> getAllResidentialBuildings() {
		Session s = sf.openSession();
		s.beginTransaction();
		Criteria cr = s.createCriteria(ReBuildingType.class);
		cr.setFirstResult(1);
		cr.setMaxResults(6);
		return cr.list();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ComBuildingType> getAllCommercialBuildings() {
		Session s = sf.openSession();
		s.beginTransaction();
		Criteria cr = s.createCriteria(ComBuildingType.class);
		cr.setFirstResult(1);
		cr.setMaxResults(6);
		return cr.list();
	}

	@Override
	public List<BuildingInfo> getBuildingsBySearch() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
