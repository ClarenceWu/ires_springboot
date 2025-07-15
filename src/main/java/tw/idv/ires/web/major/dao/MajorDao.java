package tw.idv.ires.web.major.dao;

import java.util.List;

import tw.idv.ires.web.major.entity.Major;

public interface MajorDao {
    List<Major> selectAll();

    Major selectMajorById(Integer majorId);
}
