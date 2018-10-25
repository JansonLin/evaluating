/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : exam

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-10-23 13:41:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for exam_card
-- ----------------------------
DROP TABLE IF EXISTS `exam_card`;
CREATE TABLE `exam_card` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `ec_code` varchar(50) DEFAULT '' COMMENT '准考证号',
  `ec_place` varchar(100) DEFAULT '' COMMENT '考试地点',
  `ec_room` varchar(50) DEFAULT '' COMMENT '考场',
  `ec_seat` varchar(20) DEFAULT '' COMMENT '座位号',
  `ea_stu_name` varchar(50) DEFAULT '' COMMENT '考生姓名',
  `ea_stu_id` int(20) DEFAULT NULL COMMENT '考生id',
  `ea_user_id` int(20) DEFAULT NULL COMMENT '考生对应用户id',
  `ea_time` datetime DEFAULT NULL COMMENT '考试时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_card
-- ----------------------------

-- ----------------------------
-- Table structure for e_exam
-- ----------------------------
DROP TABLE IF EXISTS `e_exam`;
CREATE TABLE `e_exam` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `e_name` varchar(50) DEFAULT '' COMMENT '考试的名称',
  `e_count` int(10) DEFAULT NULL COMMENT '可容纳考试人数',
  `e_time` datetime DEFAULT NULL COMMENT '考试时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_exam
-- ----------------------------

-- ----------------------------
-- Table structure for e_exam_audi
-- ----------------------------
DROP TABLE IF EXISTS `e_exam_audi`;
CREATE TABLE `e_exam_audi` (
  `id` int(20) NOT NULL,
  `exam_id` int(20) DEFAULT NULL,
  `exam_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '考试的名称',
  `ea_org_id` int(20) DEFAULT NULL COMMENT '直属单位id',
  `ea_org_name` varchar(50) DEFAULT '' COMMENT '直属单位名',
  `ea_work_id` int(20) DEFAULT NULL COMMENT '应聘岗位id',
  `ea_work_name` varchar(50) DEFAULT '' COMMENT '应聘岗位',
  `ea_atudent_id` int(20) DEFAULT NULL COMMENT '考生id，关联考生表',
  `exam_card_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '准考证号',
  `ea_enter_date` datetime DEFAULT NULL COMMENT '报名时间',
  `ea_auditor_id` int(20) DEFAULT NULL COMMENT '审核人id',
  `ea_audi_status` int(5) DEFAULT NULL COMMENT '审核状态1审核中，2审核通过，3审核不通过',
  `ea_reason` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '审核未通过原因',
  `ea_status` int(5) DEFAULT NULL COMMENT '考试状态1未考试，2已考试',
  `ea_score` int(5) DEFAULT NULL COMMENT '考试成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_exam_audi
-- ----------------------------

-- ----------------------------
-- Table structure for e_menu
-- ----------------------------
DROP TABLE IF EXISTS `e_menu`;
CREATE TABLE `e_menu` (
  `id` int(20) NOT NULL,
  `m_name` varchar(50) DEFAULT '' COMMENT '菜单名称',
  `m_url` varchar(50) DEFAULT '' COMMENT '菜单地址',
  `m_info` varchar(255) DEFAULT '' COMMENT '菜单信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_menu
-- ----------------------------

-- ----------------------------
-- Table structure for e_place
-- ----------------------------
DROP TABLE IF EXISTS `e_place`;
CREATE TABLE `e_place` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(100) DEFAULT '' COMMENT '考点信息',
  `e_count` int(10) DEFAULT NULL COMMENT '考点可容纳人数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_place
-- ----------------------------

-- ----------------------------
-- Table structure for e_role
-- ----------------------------
DROP TABLE IF EXISTS `e_role`;
CREATE TABLE `e_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(50) DEFAULT '' COMMENT '角色名称',
  `r_code` varchar(50) DEFAULT '' COMMENT '角色编号',
  `r_info` varchar(255) DEFAULT '' COMMENT '角色信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_role
-- ----------------------------

-- ----------------------------
-- Table structure for e_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `e_role_menu`;
CREATE TABLE `e_role_menu` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `role_id` int(20) DEFAULT NULL COMMENT '角色id',
  `menu_id` int(20) DEFAULT NULL COMMENT '菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for e_role_user
-- ----------------------------
DROP TABLE IF EXISTS `e_role_user`;
CREATE TABLE `e_role_user` (
  `id` int(20) NOT NULL,
  `role_id` int(20) DEFAULT NULL COMMENT '角色id',
  `user_id` int(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_role_user
-- ----------------------------

-- ----------------------------
-- Table structure for e_room
-- ----------------------------
DROP TABLE IF EXISTS `e_room`;
CREATE TABLE `e_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(50) DEFAULT '' COMMENT '考场信息',
  `r_count` int(10) DEFAULT NULL COMMENT '可容纳考生数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_room
-- ----------------------------

-- ----------------------------
-- Table structure for e_student
-- ----------------------------
DROP TABLE IF EXISTS `e_student`;
CREATE TABLE `e_student` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '姓名',
  `s_sex` int(5) DEFAULT NULL COMMENT '性别',
  `s_birthday` date DEFAULT NULL COMMENT '出生年月',
  `s_ethnic` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '民族',
  `s_jiguan` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '籍贯',
  `s_hukou` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '户口所在地',
  `s_political` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '政治面貌',
  `s_education` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学历',
  `s_degree` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学位',
  `s_school` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学校',
  `s_major` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业',
  `user_id` int(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_student
-- ----------------------------

-- ----------------------------
-- Table structure for e_user
-- ----------------------------
DROP TABLE IF EXISTS `e_user`;
CREATE TABLE `e_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(50) DEFAULT '' COMMENT '用户名',
  `u_password` varchar(50) DEFAULT '' COMMENT '用户密码',
  `u_email` varchar(50) DEFAULT '' COMMENT '用户邮箱',
  `u_phone` varchar(50) DEFAULT '' COMMENT '用户手机',
  `u_rname` varchar(50) DEFAULT '' COMMENT '真实姓名',
  `u_card_no` varchar(20) DEFAULT '' COMMENT '身份证号',
  `u_sex` int(2) DEFAULT NULL COMMENT '性别1男，0 女 2 保密',
  `u_birthday` date DEFAULT NULL COMMENT '生日',
  `u_jiguan` varchar(255) DEFAULT '' COMMENT '籍贯',
  `u_hukou` varchar(255) DEFAULT '' COMMENT '户口所在地',
  `u_political` varchar(50) DEFAULT '' COMMENT '政治面貌',
  `u_education` varchar(50) DEFAULT '' COMMENT '学历',
  `u_degree` varchar(50) DEFAULT '' COMMENT '学位',
  `u_major` varchar(50) DEFAULT '' COMMENT '学位',
  `u_school` varchar(50) DEFAULT '' COMMENT '毕业院校',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_user
-- ----------------------------
