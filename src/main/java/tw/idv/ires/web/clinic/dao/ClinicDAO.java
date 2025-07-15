package tw.idv.ires.web.clinic.dao;

import tw.idv.ires.web.clinic.entity.CallNumber;
import tw.idv.ires.web.clinic.entity.Clinic;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import tw.idv.ires.core.dao.CoreDao;

public interface ClinicDAO extends CoreDao<Clinic, Integer> {
    int updatePsd(Clinic clinic);

    Integer findClinicIdByAgencyId(String agencyId);

    Clinic selectById(int clinic_id);

    List<Clinic> getClinicByAccount(String clinic_account);

    Optional<CallNumber> findCallNumber(Integer clinicId, Integer doctorId, Integer timePeriod, LocalDate date);

    CallNumber save(CallNumber callNumber);

    List<CallNumber> findCallNumbersByClinicIdAndDate(Integer clinicId, LocalDate date);

    CallNumber findByClinicDoctorDate(Integer clinicId, Integer doctorId, LocalDate date);
}