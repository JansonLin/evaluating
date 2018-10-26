package com.evaluating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.evaluating.mapper.ExamMapper;
import com.evaluating.model.Exam;
import com.evaluating.model.Place;
import com.evaluating.model.Room;
import com.evaluating.model.require.ResponseData;
import com.evaluating.service.ExamService;

/**
 * 考试管理Controller，报名，审核，成绩录入等均在这个controller内解决
 */
@Controller
@RequestMapping("exam")
public class ExamController {
	
	private ExamService examService;
	/**
	 * 录入考试信息
	 */
	@RequestMapping("toAddExam")
	public String toAddExam() {
		return "admin/exam/add_exam";
	}
	public ResponseData addExam(Exam exam) {
		examService.addExam(exam);
		return null;
	}
	@RequestMapping("toaddPlace")
	public ModelAndView toaddPlace(Place place) {
		ModelAndView model = new ModelAndView();
		model.setViewName("admin/exam/add_place");
		return model;
	}
	@RequestMapping("addPlace")
	public ResponseData addPlace(Place place) {
		return null;
	}
	@RequestMapping("toAddRoom")
	public String toAddRoom(Place place) {
		return "admin/exam/add_room";
	}
	@RequestMapping("addRoom")
	public ResponseData addRoom(Room room) {
		return null;
	}
	/**
	 * 在线报名
	 */
	
	/**
	 * 生成准考证
	 */
	
	/**
	 * 审核考生资格
	 */
	
	/**
	 * 查询审核状态
	 */
	
	/**
	 * 录入考试成绩
	 */
}
