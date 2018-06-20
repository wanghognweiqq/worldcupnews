/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : worldcupnews

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-06-19 14:56:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `time`
-- ----------------------------
DROP TABLE IF EXISTS `time`;
CREATE TABLE `time` (
  `time_id` int(11) NOT NULL AUTO_INCREMENT,
  `time_time` varchar(20) DEFAULT NULL,
  `time_team1` varchar(20) DEFAULT NULL,
  `time_team2` varchar(20) DEFAULT NULL,
  `time_score1` varchar(20) DEFAULT NULL,
  `time_score2` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`time_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of time
-- ----------------------------
INSERT INTO `time` VALUES ('1', '18-06-14 23:00', '俄罗斯', '沙特阿拉伯', '5', '0');
INSERT INTO `time` VALUES ('2', '18-06-15 20:00', '埃及', '乌拉圭', '0', '1');
INSERT INTO `time` VALUES ('3', '18-06-15 23:00', '摩洛哥', '伊朗', '0', '1');
INSERT INTO `time` VALUES ('4', '18-06-16 02:00', '葡萄牙', '西班牙', '3', '3');
INSERT INTO `time` VALUES ('5', '18-06-16 18:00', '法国', '澳大利亚', '2', '1');
INSERT INTO `time` VALUES ('6', '18-06-16 21:00', '阿根廷', '冰岛', '1', '1');
INSERT INTO `time` VALUES ('7', '18-06-17 00:00', '秘鲁', '丹麦', '0', '1');
INSERT INTO `time` VALUES ('8', '18-06-17 03:00', '克罗地亚', '尼日利亚', '2', '0');
INSERT INTO `time` VALUES ('9', '18-06-17 20:00', '哥斯达黎加', '塞尔维亚', '0', '1');
INSERT INTO `time` VALUES ('10', '18-06-17 23:00', '德国', '墨西哥', '0', '1');
INSERT INTO `time` VALUES ('11', '18-06-18 02:00', '巴西', '瑞士', '1', '1');
INSERT INTO `time` VALUES ('12', '18-06-18 20:00', '瑞典', '韩国', '1', '0');
INSERT INTO `time` VALUES ('13', '18-06-18 23:00', '比利时', '巴拿马', '3', '0');
INSERT INTO `time` VALUES ('14', '18-06-19 02:00', '突尼斯', '英格兰', '1', '2');
INSERT INTO `time` VALUES ('15', '18-06-19 20:00', '哥伦比亚', '日本', '', '');
INSERT INTO `time` VALUES ('16', '18-06-19 23:00', '波兰', '塞内加尔', '', '');
INSERT INTO `time` VALUES ('17', '18-06-20 02:00', '俄罗斯', '埃及', '', '');
INSERT INTO `time` VALUES ('18', '18-06-20 20:00', '葡萄牙', '摩洛哥', '', '');
INSERT INTO `time` VALUES ('19', '18-06-20 23:00', '乌拉圭', '沙特阿拉伯', '', '');
INSERT INTO `time` VALUES ('20', '18-06-21 02:00', '伊朗', '西班牙', '', '');
INSERT INTO `time` VALUES ('21', '18-06-21 20:00', '丹麦', '澳大利亚', '', '');
INSERT INTO `time` VALUES ('22', '18-06-21 23:00', '法国', '秘鲁', '', '');
INSERT INTO `time` VALUES ('23', '18-06-22 02:00', '阿根廷', '克罗地亚', '', '');
INSERT INTO `time` VALUES ('24', '18-06-22 20:00', '巴西', '哥斯达黎加', '', '');
INSERT INTO `time` VALUES ('25', '18-06-22 23:00', '尼日利亚', '冰岛', '', '');
INSERT INTO `time` VALUES ('26', '18-06-23 02:00', '塞尔维亚', '瑞士', '', '');
INSERT INTO `time` VALUES ('27', '18-06-23 20:00', '比利时', '突尼斯', '', '');
INSERT INTO `time` VALUES ('28', '18-06-23 23:00', '韩国', '墨西哥', '', '');
INSERT INTO `time` VALUES ('29', '18-06-24 02:00', '德国', '瑞典', '', '');
INSERT INTO `time` VALUES ('30', '18-06-24 20:00', '英格兰', '巴拿马', '', '');
INSERT INTO `time` VALUES ('31', '18-06-24 23:00', '日本', '塞内加尔', '', '');
INSERT INTO `time` VALUES ('32', '18-06-25 02:00', '波兰', '哥伦比亚', '', '');
INSERT INTO `time` VALUES ('33', '18-06-25 22:00', '乌拉圭', '俄罗斯', '', '');
INSERT INTO `time` VALUES ('34', '18-06-25 22:00', '沙特阿拉伯', '埃及', '', '');
INSERT INTO `time` VALUES ('35', '18-06-26 02:00', '西班牙', '摩洛哥', '', '');
INSERT INTO `time` VALUES ('36', '18-06-26 02:00', '伊朗', '葡萄牙', '', '');
INSERT INTO `time` VALUES ('37', '18-06-26 22:00', '丹麦', '法国', '', '');
INSERT INTO `time` VALUES ('38', '18-06-26 22:00', '澳大利亚', '秘鲁', '', '');
INSERT INTO `time` VALUES ('39', '18-06-27 02:00', '冰岛', '克罗地亚', '', '');
INSERT INTO `time` VALUES ('40', '18-06-27 02:00', '尼日利亚', '阿根廷', '', '');
INSERT INTO `time` VALUES ('41', '18-06-27 22:00', '墨西哥', '瑞典', '', '');
INSERT INTO `time` VALUES ('42', '18-06-27 22:00', '韩国', '德国', '', '');
INSERT INTO `time` VALUES ('43', '18-06-28 02:00', '塞尔维亚', '巴西', '', '');
INSERT INTO `time` VALUES ('44', '18-06-28 02:00', '瑞士', '哥斯达黎加', '', '');
INSERT INTO `time` VALUES ('45', '18-06-28 22:00', '塞内加尔', '哥伦比亚', '', '');
INSERT INTO `time` VALUES ('46', '18-06-28 22:00', '日本', '波兰', '', '');
INSERT INTO `time` VALUES ('47', '18-06-29 02:00', '英格兰', '比利时', '', '');
INSERT INTO `time` VALUES ('48', '18-06-29 02:00', '巴拿马', '突尼斯', '', '');
