package acres.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import acres.dto.ComBuildingType;
import acres.dto.ReBuildingType;
import acres.dto.UserInfo;
import acres.service.BuildingService;

@Controller
public class RegisterBuildingController {
	
	@Autowired BuildingService buildRep;
	
	@PostMapping("/insert_property.test")
	public ModelAndView registerBuilding(HttpServletRequest request, @ModelAttribute ReBuildingType residentialInfo, @ModelAttribute ComBuildingType commercialInfo, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		UserInfo user = (UserInfo) request.getAttribute("currentUser");
//		float rent = Float.parseFloat(request.getParameter("expectedRent"));
//		float price = Float.parseFloat(request.getParameter("expectedPrice"));
//		residentialInfo.setExpectedRent(rent);
//		residentialInfo.setExpectedPrice(price);
//		commercialInfo.setExpectedRent(rent);
//		commercialInfo.setExpectedPrice(price);
		
		String propertyType = request.getParameter("listingType");
		
		if(session.getAttribute("currentUser") == null) {
			mv.setViewName("buildingForm");
			mv.addObject("error", "Please log in to successfully list a property");
		}
		else {
			
			if(propertyType == null) {
				mv.setViewName("buildingForm");
				mv.addObject("error", "<p>No information has been provided</p>");
			}
			else if(propertyType.equals("Residential")) {
					residentialInfo.setUser(user);
					buildRep.insertResidentialBuilding(residentialInfo);
					session.setAttribute("residentialInfo", residentialInfo);
					mv.setViewName("listingComplete");
			}
			else if(propertyType.equals("Commercial")) {
					commercialInfo.setUser(user);
					buildRep.insertCommercialBuilding(commercialInfo);
					session.setAttribute("commercialInfo", commercialInfo);
					mv.setViewName("listingComplete");
			}
		}
		
		return mv;
	}
	
	@GetMapping("/list_property.test")
	public ModelAndView getBuildingForm() {
		return new ModelAndView("buildingForm");
	}
}
