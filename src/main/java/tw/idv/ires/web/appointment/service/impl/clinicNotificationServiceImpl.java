package tw.idv.ires.web.appointment.service.impl;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.idv.ires.web.appointment.dao.clinicNotificationDAO;
import tw.idv.ires.web.appointment.entity.Notification;
import tw.idv.ires.web.appointment.service.clinicNotificationService;

@Service
@Transactional
public class clinicNotificationServiceImpl implements clinicNotificationService {

    @Autowired
    private clinicNotificationDAO clinicNotificationDAO;

    @Override
    public List<Notification> findByClinicId(int clinic_id) {
        return clinicNotificationDAO.findByClinicId(clinic_id);
    }

    @Override
    public List<Object[]> selectNotificationMsgByClinicId(int clinic_id) {
        return clinicNotificationDAO.selectNotificationMsgByClinicId(clinic_id);
    }

    @Override
    public int updateReadStatus(String appointment_id) {
        return clinicNotificationDAO.updateReadStatus(appointment_id);
    }

}
