package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class CarsController {

	private CarServiceImp carServiceImp;

	public CarsController(CarServiceImp carServiceImp) {
		this.carServiceImp = carServiceImp;
	}

	@GetMapping(value = "/cars")
	public String carPage(@RequestParam(value = "count", required = false) Integer count,
						  Model model) {

		count = (count == null || count > 5 || count < 0) ? 5 : count;

		model.addAttribute("carsForShow", carServiceImp.listCarsFromRequest(count));

		return "cars";
	}
	
}