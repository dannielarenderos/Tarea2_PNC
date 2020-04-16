package com.uca.capas.ejemplo.controller;
import javax.servlet.http.HttpServletRequest;
import java.time.*; 
import java.time.DayOfWeek; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/ejemplo")
	public @ResponseBody String ejemplo() {
		String nombre = " Danniela", apellido = " Renderos", carne = "00087717", carrera="Ingeniería en Informática", anio = "4 año";
		
return "Nombre: " +  nombre + "\n" + "Apellido: " + apellido + "\n" + "Carné: " + carne + "\n" + "Carrera: " + carrera + "\n" + "Año: " + anio;
		

	}
	

	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer param = Integer.parseInt(request.getParameter("dia"));
		Integer param2 = Integer.parseInt(request.getParameter("meses"));
		Integer param3 = Integer.parseInt(request.getParameter("anio"));

				LocalDate localDate 
					= LocalDate.of(param3, 
								param2, param); 

				DayOfWeek dayOfWeek 
					= DayOfWeek.from(localDate); 

				
				String dia = dayOfWeek.name().toString();
		
		return "Dia de la semana: " + dia + " el dia " + param + " mes: " + param2 + " anio: " + param3 ;
	}
}
