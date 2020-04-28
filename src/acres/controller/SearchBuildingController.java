package acres.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import acres.dto.BuildingInfo;
import acres.service.BuildingService;

@Controller
public class SearchBuildingController {
	@Autowired BuildingService buildService;
	
	@GetMapping("list_properties.test")
	public ModelAndView getAllProperties() {
		ModelAndView mv = new ModelAndView("properties");
		List<BuildingInfo> buildings = buildService.retrieveAllBuildings();
		System.out.println(buildings);
		mv.addObject("buildings", buildings);
		return mv;
	}
	
	@PostMapping("property_details.test")
	public ModelAndView getBuildingDetails() {
		ModelAndView mv = new ModelAndView();
		
		return mv;
	}
	
	@PostMapping("advance_search.test")
	public ModelAndView getBuildingsBySearch(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("properties");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String propertyType = request.getParameter("propertyType");
		String buildingType = request.getParameter("buildingType");
		String listingType = request.getParameter("listingType");
		double minArea = 0, maxArea = 0; float minBudget = 0, maxBudget = 0;
		if(!(request.getParameter("minArea").equals(""))) {
			minArea = Double.parseDouble(request.getParameter("minArea"));
		}
		if(!(request.getParameter("maxArea").equals(""))) {
			maxArea = Double.parseDouble(request.getParameter("maxArea"));
		}
		if(!(request.getParameter("minBudget").equals(""))) {
			minBudget = Float.parseFloat(request.getParameter("minBudget"));
		}
		if(!(request.getParameter("maxBudget").equals(""))) {
			maxBudget = Float.parseFloat(request.getParameter("maxBudget"));
		} 
		
		List<BuildingInfo> retBuildings = buildService.retrieveBuildingsBySearch(city, state, propertyType, buildingType, listingType, minArea, maxArea, minBudget, maxBudget);
		
		mv.addObject("buildings", retBuildings);
		return mv;
	}
}
