package tw.idv.ires.web.major.dao;

import java.util.List;

import tw.idv.ires.web.clinic.entity.Clinic;
import tw.idv.ires.web.major.entity.ClinicMajor;
import tw.idv.ires.web.major.entity.Major;

public interface ClinicMajorDao {
    List<Clinic> findClinicsByMajorIdOrAll(Integer majorId);

    List<Major> findMajorByClinicsId(Integer clinicId);

    int insert(ClinicMajor clinicMajor);

    int update(ClinicMajor clinicMajor);

    int deleteByClinicId(Integer clinicId);
}

