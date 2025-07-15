package tw.idv.ires.web.clinic.service;

import java.util.Map;

import tw.idv.ires.web.clinic.entity.Clinic;

public interface ClinicInfoService {

    int editClinic(Clinic editedClinic);

    int editBusinessHours(Clinic editedClinic);

    Clinic getClinicById(Integer clinicId);

    Map<String, String> getOpenPeriod(Integer clinicId);

}