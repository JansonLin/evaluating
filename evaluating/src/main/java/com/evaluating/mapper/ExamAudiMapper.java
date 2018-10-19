package com.evaluating.mapper;

import com.evaluating.model.ExamAudi;
import com.evaluating.model.ExamAudiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamAudiMapper {
    int countByExample(ExamAudiExample example);

    int deleteByExample(ExamAudiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamAudi record);

    int insertSelective(ExamAudi record);

    List<ExamAudi> selectByExample(ExamAudiExample example);

    ExamAudi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamAudi record, @Param("example") ExamAudiExample example);

    int updateByExample(@Param("record") ExamAudi record, @Param("example") ExamAudiExample example);

    int updateByPrimaryKeySelective(ExamAudi record);

    int updateByPrimaryKey(ExamAudi record);
}