package tw.idv.ires.web.appointment.service;

import java.util.Date;
import java.util.List;

import tw.idv.ires.web.appointment.entity.Appointment;

public interface reservequeryService {
    List<Object[]> getAppointmentsByclinicid_doctorid_DateAndPeriod(int clinic_id, int doctor_id, Date dateS, Date dateE,
                                                                    int timePeriod);
}
