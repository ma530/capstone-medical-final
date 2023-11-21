package com.project.staragile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicureController {

@Autowired
MedicureService doctorService;

@GetMapping("/hello")
public String sayHello() {
	return "Hello from Doctor Shubham";
}

@GetMapping("/createDoctor")
public Doctor createDoctor() {
	return doctorService.createDoctor();
}
	
@PostMapping("/registerDoctor")
public Doctor registerDoctor(@RequestBody Doctor doctor) {
	return doctorService.registerDoctor(doctor);
}

@GetMapping("/searchDoctor/{doctorRegistrationId}")
public Doctor getDoctor(@PathVariable String doctorRegistrationId) {
	return doctorService.getDoctorDetails(doctorRegistrationId);
}

@PutMapping("/updateDoctor/{doctorRegistrationId}")
public Doctor updateDoctor(@PathVariable String doctorRegistrationId, @RequestBody Doctor doctorName) {
    return doctorService.updateDoctor(doctorRegistrationId,doctorName);
}
	
@DeleteMapping("/deletePolicy/{doctorRegistrationId}")
public String deletePolicy(@PathVariable String doctorRegistrationId) {
    return doctorService.deleteById(doctorRegistrationId);
}

}
