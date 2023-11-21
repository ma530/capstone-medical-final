package com.project.staragile;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicureService {
	
	@Autowired
	MedicureRepository doctorRepository;
	
	public Doctor registerDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
		}

	public Doctor createDoctor() {
		Doctor doctor = new Doctor("MP1110","Shubham","Neurologist","15 Years");
		return doctorRepository.save(doctor);
	}

	public Doctor getDoctorDetails(String doctorRegistrationId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorRegistrationId).get();
	}
	
	public Doctor registerDummyDoctor() {
		Doctor doctor = new Doctor("MP1110","Shubham","Neurologist","15 Years");
		return doctor;
	}
	
	public String sayHello() {
		return "Hello from Doctor Shubham";
	}

	public Doctor updateDoctor(String doctorRegistrationId, Doctor doctorName) {
		Doctor doctor = getDoctorDetails(doctorRegistrationId);
		 if (Objects.nonNull(doctor) ) {
			 doctor.setDoctorName(doctorName.getDoctorName());
			 doctorRepository.save(doctor);
			 return doctor;
		 }
		return null;
	}

	public String deleteById(String doctorRegistrationId) {
		Doctor doctor = getDoctorDetails(doctorRegistrationId);
		  if (Objects.nonNull(doctor) ) {
			  doctorRepository.delete(doctor);
			  return "Successfully Deleted";
		  }
			return "Deletion Failed";
	}

}
