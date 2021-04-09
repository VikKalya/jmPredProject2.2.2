package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;
import service.ServiceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/Car")
	public String loopListExample(@RequestParam(value = "countCa", required = false) String counCa, Model model) {
		ServiceCar service = new ServiceCar();
		Car mazda = new Car(1L,"mazda", "x5");
		Car bmw = new Car(2L,"bmw", "x5");
		Car mersedec = new Car(3L,"mersedec", "c");
		Car toy = new Car(4L,"toyotta", "mark2");
		Car maz = new Car(5L,"maz", "x5");

		List<Car> listCar = new ArrayList<Car>();

		listCar.add(toy);
		listCar.add(mazda);
		listCar.add(bmw);
		listCar.add(mersedec);
		listCar.add(maz);
        if (counCa == null || Integer.valueOf(counCa) >= 5) {
			model.addAttribute("people", listCar);
			return "indexcar";
		} else {
			model.addAttribute("people", service.getCarCount(listCar, Integer.valueOf(counCa)));
			return "indexcar";
		}
	}
}