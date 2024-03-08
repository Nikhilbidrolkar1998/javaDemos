package org.doctoreapp.model;

public enum Specialization {
    ORTH("ORTHOPEDIC"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNAEC("GYNAECOLOGIST"),
    NEURO("NEUROLOGIST"),
    DERMA("DERMATOLOGIST");

    private String speciality;

    Specialization(String speciality) {
        this.speciality = speciality;
    }
    public String getSpeciality(){
        return speciality;
    }
}
