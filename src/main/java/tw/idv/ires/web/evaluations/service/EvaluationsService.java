package tw.idv.ires.web.evaluations.service;

import java.util.List;

import tw.idv.ires.web.evaluations.entity.Evaluations;

public interface EvaluationsService {
	List<Evaluations> getEvaluationsByClinicId(Integer clinicId);
	Integer addComment(Evaluations evaluations);
}
