package org.doctoreapp.repository;

import org.doctoreapp.exception.DoctorNotFoundException;
import org.doctoreapp.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);
    Doctor findById(int doctorId);

    List<Doctor> findAll();
    List<Doctor> Speciality(String speciality);
    List<Doctor> findBySpecialityAndExp(String speciality,int experience) throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndLesFees(String speciality,double fees) throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndRatings(String speciality,int rating) throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndNameContains(String speciality,String doctorName) throws DoctorNotFoundException;
}
