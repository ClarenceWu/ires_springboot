package tw.idv.ires.web.appointment.service;

import java.util.List;

import tw.idv.ires.web.appointment.entity.Notification;

public interface clinicNotificationService {
    List<Notification> findByClinicId(int clinic_id);

    List<Object[]> selectNotificationMsgByClinicId(int clinic_id);

    int updateReadStatus(String appointment_id);

}
