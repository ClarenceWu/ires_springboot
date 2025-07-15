package tw.idv.ires.web.appointment.service.impl;

import java.util.Date;
import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.idv.ires.web.appointment.dao.reservequeryDAO;
import tw.idv.ires.web.appointment.entity.Appointment;
import tw.idv.ires.web.appointment.service.reservequeryService;

@Service
@Transactional
public class reservequeryServiceImpl implements reservequeryService {

    @Autowired
    private reservequeryDAO reservequeryDAO;

    @Override
    public List<Object[]> getAppointmentsByclinicid_doctorid_DateAndPeriod(int clinic_id, int doctor_id, Date dateS, Date dateE, int timePeriod) {
        return reservequeryDAO.findByclinicid_doctorid_DateAndPeriod(clinic_id, doctor_id, dateS, dateE, timePeriod);
    }

}