/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50549
 Source Host           : localhost:3306
 Source Schema         : poi

 Target Server Type    : MySQL
 Target Server Version : 50549
 File Encoding         : 65001

 Date: 20/05/2022 14:55:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `parent_id` int(11) NULL DEFAULT NULL COMMENT '上级部门id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (0, '一级部门', NULL);
INSERT INTO `department` VALUES (1, '部门2', 0);
INSERT INTO `department` VALUES (2, '部门3', 0);
INSERT INTO `department` VALUES (3, '部门21', 1);

-- ----------------------------
-- Table structure for route
-- ----------------------------
DROP TABLE IF EXISTS `route`;
CREATE TABLE `route`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `service_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务编号',
  `service_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务名称',
  `service_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '服务地址',
  `service_type` int(255) NULL DEFAULT NULL COMMENT '服务类型',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of route
-- ----------------------------
INSERT INTO `route` VALUES (1, '666', '祖安', '电信一区', 1, '2019-12-19 11:43:02');

-- ----------------------------
-- Table structure for t_data_user_depart
-- ----------------------------
DROP TABLE IF EXISTS `t_data_user_depart`;
CREATE TABLE `t_data_user_depart`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `depart_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_data_user_depart
-- ----------------------------
INSERT INTO `t_data_user_depart` VALUES (1, 1, 1);
INSERT INTO `t_data_user_depart` VALUES (2, 1, 2);
INSERT INTO `t_data_user_depart` VALUES (3, 2, 3);
INSERT INTO `t_data_user_depart` VALUES (4, 2, 1);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL COMMENT '主键id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, '用户1');
INSERT INTO `t_user` VALUES (2, '用户2');

SET FOREIGN_KEY_CHECKS = 1;
