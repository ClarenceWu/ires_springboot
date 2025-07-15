package tw.idv.ires.web.patient.service;

import java.util.List;

import tw.idv.ires.web.patient.entity.Patient;

import java.util.Map;

public interface PatientService {

    Patient register(Patient patient);

    Patient login(Patient patient);

    Patient findById(int patientId);

    void updatePatient(Patient patient);

    Patient edit(Patient reqPatient);

    List<Patient> clinicSearch(String name, String birthday, String phone);

    Map<String, Object> getReservedPatientsWithKeyword(Integer clinicId, String keyword, int page, int pageSize);

    Patient findByPhone(String phone);

    int clinicEditPatientNotes(int patientId, String newNotes);

    boolean checkIn(Patient patient, String code);
}
