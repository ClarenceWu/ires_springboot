package tw.idv.ires.web.doctor.dao;

import java.util.List;

import tw.idv.ires.core.dao.CoreDao;
import tw.idv.ires.web.doctor.entity.Schedule;

public interface ScheduleDao extends CoreDao<Schedule, Integer> {

    public List<Schedule> selectByDoctorId(Integer doctorId);

}
