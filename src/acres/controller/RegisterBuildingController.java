package acres.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import acres.dto.ComBuildingType;
import acres.dto.ReBuildingType;
import acres.service.BuildingService;

@Controller
public class RegisterBuildingController {
	
	@Autowired BuildingService buildRep;
	
	@PostMapping("building.test")
	public ModelAndView registerBuilding(@Valid @ModelAttribute ReBuildingType residentialInfo, BindingResult resResult, @Valid @ModelAttribute ComBuildingType commercialInfo, BindingResult comResult, @Valid @RequestParam String listingType) {
		ModelAndView mv = new ModelAndView();
		if(listingType.equals("Residential")) {
			if(resResult.hasErrors()) {
				mv.setViewName("buildingForm");
				mv.addObject("error", "<p>Residential Information was not provided thoroughly</p>");
			}
			else {
				buildRep.insertResidentialBuilding(residentialInfo);
				mv.setViewName("listingComplete");
			}
		}
		else if(listingType.equals("Commercial")) {
			if(comResult.hasErrors()) {
				mv.setViewName("buildingForm");
				mv.addObject("error", "<p>Commercial Information was not provided thoroughly</p>");
			}
			else {
				buildRep.insertCommercialBuilding(commercialInfo);
				mv.setViewName("listingComplete");
			}
		}
		else{
			mv.setViewName("buildingForm");
			mv.addObject("error", "<p>No information has been provided</p>");
		}
		
		return mv;
	}
	
	@GetMapping("building.test")
	public ModelAndView getBuildingForm() {
		return new ModelAndView("buildingForm");
	}
}
