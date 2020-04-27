package acres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import acres.dto.BuildingInfo;
import acres.service.BuildingService;

@Controller
public class SearchBuildingController {
	@Autowired BuildingService buildService;
	
	@GetMapping("/list_properties.test")
	public ModelAndView getAllProperties() {
		ModelAndView mv = new ModelAndView("properties");
		List<BuildingInfo> buildings = buildService.retrieveAllBuildings();
		mv.addObject("buildings", buildings);
		return mv;
	}
	
	@PostMapping("/property_details.test")
	public ModelAndView getBuildingDetails() {
		ModelAndView mv = new ModelAndView();
		
		return mv;
	}
}
