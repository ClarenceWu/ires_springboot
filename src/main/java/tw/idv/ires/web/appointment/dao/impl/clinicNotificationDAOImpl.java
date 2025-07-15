package tw.idv.ires.web.appointment.dao.impl;

import java.util.List;

import jakarta.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import tw.idv.ires.web.appointment.dao.clinicNotificationDAO;
import tw.idv.ires.web.appointment.entity.Notification;

@Repository
public class clinicNotificationDAOImpl implements clinicNotificationDAO {
    @PersistenceContext
    private Session session;

    // 目前用patientId先代替clinic_id，待clinic有通知的資料後，再 hql 裡的內容
    @Override
    public List<Notification> findByClinicId(int clinic_id) {
        String hql = "SELECT n FROM Notification n WHERE n.patient.patientId = :pid ORDER BY n.sentDatetime DESC";
        return session.createQuery(hql, Notification.class).setParameter("pid", clinic_id).getResultList();
    }

    @Override
    public List<Object[]> selectNotificationMsgByClinicId(int clinic_id) {
        String sql = """
        SELECT a.appointment_id, p.name, n.message, n.notification_type, n.read_status, 
               DATE_FORMAT(n.sent_datetime, '%Y/%m/%d')
        FROM notification n
        LEFT JOIN patient p ON n.patient_id = p.patient_id
        LEFT JOIN appointment a ON n.appointment_id = a.appointment_id
        WHERE n.notification_type NOT IN ('預約結束通知', 'appointment')
          AND n.read_status = 0
          AND a.clinic_id = :clinic_id
        ORDER BY n.sent_datetime DESC
        """;

        List<Object[]> result = session.createNativeQuery(sql)
                .setParameter("clinic_id", clinic_id)
                .getResultList();

        return result;
    }

    @Override
    public int updateReadStatus(String appointment_id) {
        final StringBuilder hql = new StringBuilder().append("UPDATE Notification n SET n.readStatus = true ");

        hql.append("WHERE n.appointment.appointmentId = :appointment_id");

        return session.createQuery(hql.toString()).setParameter("appointment_id", appointment_id).executeUpdate();

    }
}
