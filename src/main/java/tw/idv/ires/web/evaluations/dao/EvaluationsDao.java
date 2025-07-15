package tw.idv.ires.web.evaluations.dao;

import java.util.List;

import tw.idv.ires.core.dao.CoreDao;
import tw.idv.ires.web.evaluations.entity.Evaluations;

public interface EvaluationsDao extends CoreDao<Evaluations, Integer> {
    List<Evaluations> findEvaluationsByClinicId(Integer clinicId);
}
