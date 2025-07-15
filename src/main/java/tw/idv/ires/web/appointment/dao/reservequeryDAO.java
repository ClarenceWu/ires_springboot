package tw.idv.ires.web.appointment.dao;

import tw.idv.ires.core.dao.CoreDao;
import tw.idv.ires.web.appointment.entity.Appointment;

import java.util.Date;
import java.util.List;

//此檔案可以合在 AppointmentDAO
public interface reservequeryDAO extends CoreDao<Appointment, String> {
    List<Object[]> findByclinicid_doctorid_DateAndPeriod(int clinic_id, int doctor_id, Date dateS, Date dateE, int timePeriod);
}
