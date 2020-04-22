package acres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import acres.dto.BuildingInfo;
import acres.dto.ComBuildingType;
import acres.dto.ReBuildingType;

@Controller
public class RegisterBuildingController {
	@PostMapping("building.test")
	public ModelAndView registerBuilding(@ModelAttribute ReBuildingType residentialInfo) {
		ModelAndView mv = new ModelAndView("buildingForm");
		System.out.println(residentialInfo.getApartmentType());
		System.out.println(residentialInfo.getAddress());
		
		return mv;
	}
	
	@GetMapping("building.test")
	public ModelAndView getBuildingForm() {
		return new ModelAndView("buildingForm");
	}
}
