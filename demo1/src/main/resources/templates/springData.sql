/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : spring

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-02-02 15:51:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for learn_resource
-- ----------------------------
DROP TABLE IF EXISTS `learn_resource`;
CREATE TABLE `learn_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `title` varchar(100) DEFAULT NULL COMMENT '描述',
  `url` varchar(100) DEFAULT NULL COMMENT '地址链接',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1034 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of learn_resource
-- ----------------------------
INSERT INTO `learn_resource` VALUES ('999', '官方参考文档', 'Spring Boot Reference Guide', 'https://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/');
INSERT INTO `learn_resource` VALUES ('1000', '官方SpriongBoot例子', '官方SpriongBoot例子', 'https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples');
INSERT INTO `learn_resource` VALUES ('1001', 'Alan博客', 'Spring Boot干货系列', 'https://alan-js.github.io/');
INSERT INTO `learn_resource` VALUES ('1031', '知乎', 'spring boot要如何学习？', 'https://www.zhihu.com/question/53729800');
INSERT INTO `learn_resource` VALUES ('1032', 'spring官网', 'spring官网jar', 'http://start.spring.io/');
INSERT INTO `learn_resource` VALUES ('1033', '泥瓦匠', 'springboot 实现 Restful 服务', 'https://www.bysocket.com/?p=1627');
