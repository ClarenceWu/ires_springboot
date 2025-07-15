package tw.idv.ires.web.major.service;

import java.util.List;

import tw.idv.ires.web.major.entity.Major;

public interface MajorService {
    List<Major> findAllMajor();

    Major findById(Integer majorId);

}
