/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : adp

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-08-28 15:37:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) DEFAULT NULL COMMENT '排序',
  `pid` int(11) DEFAULT NULL COMMENT '父部门id',
  `pids` varchar(255) DEFAULT NULL COMMENT '父级ids',
  `simplename` varchar(45) DEFAULT NULL COMMENT '简称',
  `fullname` varchar(255) DEFAULT NULL COMMENT '全称',
  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
  `version` int(11) DEFAULT NULL COMMENT '版本（乐观锁保留字段）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of sys_dept
-- ----------------------------

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) DEFAULT NULL COMMENT '排序',
  `pid` int(11) DEFAULT NULL COMMENT '父级字典',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
  `code` varchar(255) DEFAULT NULL COMMENT '值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='字典表';

-- ----------------------------
-- Records of sys_dict
-- ----------------------------

-- ----------------------------
-- Table structure for sys_expense
-- ----------------------------
DROP TABLE IF EXISTS `sys_expense`;
CREATE TABLE `sys_expense` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `money` decimal(20,2) DEFAULT NULL COMMENT '报销金额',
  `desc` varchar(255) DEFAULT '' COMMENT '描述',
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `state` int(11) DEFAULT NULL COMMENT '状态: 1.待提交  2:待审核   3.审核通过 4:驳回',
  `userid` int(11) DEFAULT NULL COMMENT '用户id',
  `processId` varchar(255) DEFAULT NULL COMMENT '流程定义id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='报销表';

-- ----------------------------
-- Records of sys_expense
-- ----------------------------

-- ----------------------------
-- Table structure for sys_jarinfo
-- ----------------------------
DROP TABLE IF EXISTS `sys_jarinfo`;
CREATE TABLE `sys_jarinfo` (
  `cpid` varchar(255) NOT NULL,
  `sid` varchar(255) NOT NULL,
  `version_core` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `result` varchar(255) NOT NULL,
  `code` varchar(255) NOT NULL,
  `md5` varchar(255) NOT NULL,
  `add_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `channel_tag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cpid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Jar信息表';

-- ----------------------------
-- Records of sys_jarinfo
-- ----------------------------

-- ----------------------------
-- Table structure for sys_login_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_login_log`;
CREATE TABLE `sys_login_log` (
  `id` int(65) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `logname` varchar(255) DEFAULT NULL COMMENT '日志名称',
  `userid` int(65) DEFAULT NULL COMMENT '管理员id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `succeed` varchar(255) DEFAULT NULL COMMENT '是否执行成功',
  `message` text COMMENT '具体消息',
  `ip` varchar(255) DEFAULT NULL COMMENT '登录ip',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录记录';

-- ----------------------------
-- Records of sys_login_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `code` varchar(255) DEFAULT NULL COMMENT '菜单编号',
  `pcode` varchar(255) DEFAULT NULL COMMENT '菜单父编号',
  `pcodes` varchar(255) DEFAULT NULL COMMENT '当前菜单的所有父菜单编号',
  `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `icon` varchar(255) DEFAULT NULL COMMENT '菜单图标',
  `url` varchar(255) DEFAULT NULL COMMENT 'url地址',
  `num` int(65) DEFAULT NULL COMMENT '菜单排序号',
  `levels` int(65) DEFAULT NULL COMMENT '菜单层级',
  `ismenu` int(11) DEFAULT NULL COMMENT '是否是菜单（1：是  0：不是）',
  `tips` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` int(65) DEFAULT NULL COMMENT '菜单状态 :  1:启用   0:不启用',
  `isopen` int(11) DEFAULT NULL COMMENT '是否打开:    1:打开   0:不打开',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `sys_notice`;
CREATE TABLE `sys_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `content` text COMMENT '内容',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `creater` int(11) DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通知表';

-- ----------------------------
-- Records of sys_notice
-- ----------------------------

-- ----------------------------
-- Table structure for sys_operation_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_operation_log`;
CREATE TABLE `sys_operation_log` (
  `id` int(65) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `logtype` varchar(255) DEFAULT NULL COMMENT '日志类型',
  `logname` varchar(255) DEFAULT NULL COMMENT '日志名称',
  `userid` int(65) DEFAULT NULL COMMENT '用户id',
  `classname` varchar(255) DEFAULT NULL COMMENT '类名称',
  `method` text COMMENT '方法名称',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `succeed` varchar(255) DEFAULT NULL COMMENT '是否成功',
  `message` text COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志';

-- ----------------------------
-- Records of sys_operation_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_partner_manual_data
-- ----------------------------
DROP TABLE IF EXISTS `sys_partner_manual_data`;
CREATE TABLE `sys_partner_manual_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录序号',
  `cpid` varchar(50) NOT NULL COMMENT '渠道cpid',
  `sid` varchar(50) NOT NULL COMMENT '项目号',
  `cpType` varchar(10) NOT NULL COMMENT '分成方式；cps,cpa',
  `cpsRate` float DEFAULT NULL COMMENT 'cps分成比例',
  `cpsTotal` float DEFAULT NULL COMMENT 'cps总价',
  `cpaPrice` float DEFAULT NULL COMMENT 'cpa单价',
  `cpaCount` int(11) DEFAULT NULL COMMENT 'cpa数量',
  `dataDate` date DEFAULT NULL COMMENT '数据日期',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '录入时间',
  `userId` int(11) DEFAULT NULL COMMENT '录入人',
  `isCpaPrice` int(1) unsigned DEFAULT '1' COMMENT '是否展示CPA单价',
  `moneytype` int(1) DEFAULT '0' COMMENT '货币类型（0为元，1为美元）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='渠道手工数据表';

-- ----------------------------
-- Records of sys_partner_manual_data
-- ----------------------------

-- ----------------------------
-- Table structure for sys_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_relation`;
CREATE TABLE `sys_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `menuid` bigint(11) DEFAULT NULL COMMENT '菜单id',
  `roleid` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色和菜单关联表';

-- ----------------------------
-- Records of sys_relation
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) DEFAULT NULL COMMENT '序号',
  `pid` int(11) DEFAULT NULL COMMENT '父角色id',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `deptid` int(11) DEFAULT NULL COMMENT '部门名称',
  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
  `version` int(11) DEFAULT NULL COMMENT '保留字段(暂时没用）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `account` varchar(45) DEFAULT NULL COMMENT '账号',
  `password` varchar(45) DEFAULT NULL COMMENT '密码',
  `salt` varchar(45) DEFAULT NULL COMMENT 'md5密码盐',
  `name` varchar(45) DEFAULT NULL COMMENT '名字',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `sex` int(11) DEFAULT NULL COMMENT '性别（1：男 2：女）',
  `email` varchar(45) DEFAULT NULL COMMENT '电子邮件',
  `phone` varchar(45) DEFAULT NULL COMMENT '电话',
  `roleid` varchar(255) DEFAULT NULL COMMENT '角色id',
  `deptid` int(11) DEFAULT NULL COMMENT '部门id',
  `status` int(11) DEFAULT NULL COMMENT '状态(1：启用  2：冻结  3：删除）',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `version` int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Table structure for sys_wake_up
-- ----------------------------
DROP TABLE IF EXISTS `sys_wake_up`;
CREATE TABLE `sys_wake_up` (
  `cpid` varchar(50) NOT NULL,
  `deeplink` varchar(255) DEFAULT NULL,
  `gmt_create` date DEFAULT NULL,
  `gmt_modified` date DEFAULT NULL,
  PRIMARY KEY (`cpid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='唤醒DeepLink表';

-- ----------------------------
-- Records of sys_wake_up
-- ----------------------------
