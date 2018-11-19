package com.evaluating.mapper;

import com.evaluating.model.ExamAudi;
import com.evaluating.model.ExamAudiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamAudiMapper {
    int countByExample(ExamAudiExample example);

    int deleteByExample(ExamAudiExample example);

    int insert(ExamAudi record);

    int insertSelective(ExamAudi record);

    List<ExamAudi> selectByExample(ExamAudiExample example);

    int updateByExampleSelective(@Param("record") ExamAudi record, @Param("example") ExamAudiExample example);

    int updateByExample(@Param("record") ExamAudi record, @Param("example") ExamAudiExample example);
}