/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.5.20 : Database - travel
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`travel` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `travel`;

/*Table structure for table `airlines` */

DROP TABLE IF EXISTS `airlines`;

CREATE TABLE `airlines` (
  `AID` int(11) NOT NULL AUTO_INCREMENT,
  `AirlineName` varchar(50) DEFAULT NULL COMMENT '航空公司名称',
  PRIMARY KEY (`AID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `airlines` */

insert  into `airlines`(`AID`,`AirlineName`) values 
(1,'东方航空'),
(2,'南方航空'),
(3,'春秋航空'),
(4,'中国国航');

/*Table structure for table `comments` */

DROP TABLE IF EXISTS `comments`;

CREATE TABLE `comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `hotelid` int(11) DEFAULT NULL COMMENT '酒店id',
  `hotelname` varchar(50) DEFAULT NULL COMMENT '酒店名',
  `cleanscore` int(11) DEFAULT NULL COMMENT '卫生评分',
  `locationscore` int(11) DEFAULT NULL COMMENT '位置评分',
  `servicescore` int(11) DEFAULT NULL COMMENT '服务评分',
  `FacilitiesScore` int(11) DEFAULT NULL COMMENT '设施评分',
  `commentinfo` varchar(500) DEFAULT NULL COMMENT '点评内容',
  `totalscore` int(11) DEFAULT NULL COMMENT '总得分',
  `createby` int(11) DEFAULT NULL COMMENT '创建者',
  `createdate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyby` int(11) DEFAULT NULL COMMENT '修改者',
  `modifydate` datetime DEFAULT NULL COMMENT '修改时间',
  `orderno` varchar(20) DEFAULT NULL COMMENT '订单编号',
  `commentsImg` varchar(100) DEFAULT NULL COMMENT '评论图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `comments` */

insert  into `comments`(`id`,`hotelid`,`hotelname`,`cleanscore`,`locationscore`,`servicescore`,`FacilitiesScore`,`commentinfo`,`totalscore`,`createby`,`createdate`,`modifyby`,`modifydate`,`orderno`,`commentsImg`) values 
(1,1,'北京大饭店',1,1,1,1,'111是否是vs v方便德国法国发过的覆盖覆盖不到公司发给分啊不是德国法国',13,1,'2018-11-17 22:20:42',1,'2018-11-17 22:20:42','11111',NULL),
(2,1,'北京大饭店',NULL,NULL,NULL,NULL,'dddd',NULL,1,'2018-11-17 23:36:11',NULL,NULL,'11111111',NULL),
(3,1,'北京大饭店',NULL,NULL,NULL,NULL,'test',NULL,1,'2018-11-17 23:38:15',NULL,NULL,'11111111',NULL),
(4,1,'北京大饭店',NULL,NULL,NULL,NULL,'特殊她22',NULL,1,'2018-11-17 23:39:50',NULL,NULL,'11111111',NULL),
(5,1,'北京大饭店',NULL,NULL,NULL,NULL,'我在测试',NULL,1,'2018-11-18 00:42:46',NULL,NULL,'11111111',NULL),
(6,1,'北京大饭店',NULL,NULL,NULL,NULL,'111',NULL,1,'2018-11-18 00:44:32',NULL,NULL,'11111111',NULL),
(7,1,'北京大饭店',NULL,NULL,NULL,NULL,'444',NULL,1,'2018-11-18 00:46:06',NULL,NULL,'11111111',NULL),
(8,1,'北京大饭店',NULL,NULL,NULL,NULL,'6666',NULL,1,'2018-11-18 00:48:21',NULL,NULL,'11111111',NULL),
(9,1,'北京大饭店',NULL,NULL,NULL,NULL,'aaaaa',NULL,1,'2018-11-18 00:49:36',NULL,NULL,'11111111',NULL),
(10,1,'北京大饭店',NULL,NULL,NULL,NULL,'zzzz',NULL,1,'2018-11-18 00:50:30',NULL,NULL,'11111111',NULL),
(11,2,'上海大饭店',NULL,NULL,NULL,NULL,'qqqq',NULL,1,'2018-11-18 00:51:19',NULL,NULL,'22222222',NULL),
(12,2,'上海大饭店',NULL,NULL,NULL,NULL,'qqqq',NULL,1,'2018-11-18 00:51:45',NULL,NULL,'22222222',NULL),
(13,3,'武汉大饭店',NULL,NULL,NULL,NULL,'safdsfds',NULL,1,'2018-11-18 00:52:21',NULL,NULL,'33333333',NULL),
(14,1,'北京大饭店',NULL,NULL,NULL,NULL,'test   now',NULL,1,'2018-11-18 19:57:03',NULL,NULL,'11111111',NULL),
(15,1,'北京大饭店',NULL,NULL,NULL,NULL,'hzrshtdj',NULL,1,'2018-11-18 22:37:00',NULL,NULL,'11111111',NULL),
(16,1,'北京大饭店',NULL,NULL,NULL,NULL,'1111111111111111111111111111111111',NULL,1,'2018-11-18 22:39:28',NULL,NULL,'11111111',NULL),
(17,1,'北京大饭店',NULL,NULL,NULL,NULL,'222222222222222222222222222222',NULL,1,'2018-11-18 22:41:32',NULL,NULL,'11111111',NULL),
(18,1,'北京大饭店',NULL,NULL,NULL,NULL,'333333333333333333333333',NULL,1,'2018-11-18 22:42:59',NULL,NULL,'11111111',NULL),
(19,2,'上海大饭店',NULL,NULL,NULL,NULL,'测试分页内容',NULL,1,'2018-11-19 23:13:32',NULL,NULL,'22222222',NULL),
(20,1,'北京大饭店',NULL,NULL,NULL,NULL,'test上传图片',NULL,1,'2018-11-19 23:53:13',NULL,NULL,'11111111','/LoveTravel/statics/uploadfiles/13971676828sunny.jpg'),
(21,1,'北京大饭店',3,4,5,5,'测试图片上传第二次',NULL,1,'2018-11-19 23:59:36',NULL,NULL,'11111111','/LoveTravel/statics/uploadfiles/1542643176613sunny.jpg'),
(28,2,'上海大饭店',5,5,5,5,'啊方法FG',NULL,1,'2018-11-26 14:57:14',NULL,NULL,'22222222','/LoveTravel/statics/uploadfiles/154321543493013971676828.jpg'),
(29,2,'上海大饭店',4,3,3,5,'KKK',NULL,1,'2018-11-26 15:18:25',NULL,NULL,'22222222','/LoveTravel/statics/uploadfiles/154321670513613971676828.jpg'),
(30,2,'上海大饭店',NULL,NULL,NULL,NULL,'阿斯顿',NULL,1,'2018-11-26 15:22:49',NULL,NULL,'22222222',NULL),
(31,2,'上海大饭店',5,4,5,4,'DZBB',NULL,1,'2018-12-01 22:18:01',NULL,NULL,'22222222','/LoveTravel/statics/uploadfiles/154367388131513971676828.jpg'),
(32,2,'上海大饭店',5,5,5,5,'答复',NULL,1,'2018-12-01 22:30:52',NULL,NULL,'22222222','/LoveTravel/statics/uploadfiles/154367465272413971676828.jpg');

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `contactName` varchar(50) DEFAULT NULL COMMENT '联系人名称',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `idCard` varchar(20) DEFAULT NULL COMMENT '身份证号码',
  `passport` varchar(20) DEFAULT NULL COMMENT '护照号码',
  `createBy` int(11) DEFAULT NULL COMMENT '创建者',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyBy` int(11) DEFAULT NULL COMMENT '修改者',
  `modifyDate` datetime DEFAULT NULL COMMENT '修改时间',
  `temp` varchar(50) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `contact` */

insert  into `contact`(`id`,`contactName`,`phone`,`idCard`,`passport`,`createBy`,`createDate`,`modifyBy`,`modifyDate`,`temp`) values 
(1,'sunny','1364899218',NULL,'G12345678',1,'2018-11-17 18:37:37',NULL,NULL,NULL),
(2,'aaa','1364899218','420116199110154444','G12345678',1,'2018-11-17 18:37:59',NULL,NULL,NULL),
(3,'sss','1364899218','420116199110154444','G12345678',1,'2018-11-17 18:38:15',NULL,NULL,NULL),
(6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(7,'77777','13967676666',NULL,'G12345678',1,'2018-11-25 23:54:07',NULL,NULL,NULL),
(8,'666666','13967676666',NULL,'G12345678',1,'2018-11-26 09:31:06',NULL,NULL,NULL),
(9,'顶顶顶','13967676666',NULL,'G12345678',1,'2018-11-26 15:16:42',NULL,NULL,NULL);

/*Table structure for table `flight` */

DROP TABLE IF EXISTS `flight`;

CREATE TABLE `flight` (
  `FID` varchar(50) NOT NULL COMMENT '航班编号',
  `LID` varchar(50) DEFAULT NULL COMMENT '航线编号',
  `leaveTime` varchar(50) DEFAULT NULL COMMENT '起飞时间',
  `arriveTime` varchar(50) DEFAULT NULL COMMENT '到达时间',
  `totalTime` double DEFAULT NULL COMMENT '飞行时间',
  `seatsLeave` int(11) DEFAULT NULL COMMENT '剩余座位数',
  `AID` int(11) DEFAULT NULL COMMENT '航空公司',
  `timeId` int(11) DEFAULT NULL COMMENT '时间序号',
  PRIMARY KEY (`FID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flight` */

insert  into `flight`(`FID`,`LID`,`leaveTime`,`arriveTime`,`totalTime`,`seatsLeave`,`AID`,`timeId`) values 
('CA101','1','9:00','12:00',3,48,1,2),
('CA102','1','14:00','16:00',2,50,1,4),
('CA103','1','19:00','21:00',2,50,1,5),
('CA104','1','22:00','24:00',2,50,1,6),
('CA201','2','8:30','10:00',1.5,50,1,1),
('CA301','3','7:00','10:00',3,50,1,1),
('DA1001','10','7:00','8:30',1.5,50,3,1),
('DA601','6','7:00','8:30',1.5,50,3,1),
('DA701','7','7:00','8:30',1.5,50,3,1),
('DA801','8','7:00','8:30',1.5,50,3,1),
('DA901','9','7:00','8:30',1.5,50,3,1),
('FA101','19','12:00','13:30',1.5,50,2,1),
('ZA101','1','8:00','11:00',3,50,2,1),
('ZA102','1','13:00','15:00',2,50,2,3),
('ZA201','2','21:00','23:30',1.5,50,2,2),
('ZA401','4','7:00','9:00',2,50,2,1),
('ZA501','5','12:00','13:30',1.5,50,2,1),
('ZA502','20','12:00','13:30',1.5,50,2,1);

/*Table structure for table `flightorder` */

DROP TABLE IF EXISTS `flightorder`;

CREATE TABLE `flightorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `fid` varchar(50) DEFAULT NULL COMMENT '航班号',
  `leaveDate` varchar(50) DEFAULT NULL COMMENT '航班日期',
  `leaveCity` varchar(50) DEFAULT NULL COMMENT '起飞城市',
  `arriveCity` varchar(50) DEFAULT NULL COMMENT '到达城市',
  `leaveTime` varchar(50) DEFAULT NULL COMMENT '起飞时间',
  `arriveTime` varchar(50) DEFAULT NULL COMMENT '到达时间',
  `leaveAirport` varchar(50) DEFAULT NULL COMMENT '起飞机场',
  `price` varchar(11) DEFAULT NULL COMMENT '机票价格',
  `arriveAirport` varchar(50) DEFAULT NULL COMMENT '到达机场',
  `contactName` varchar(50) DEFAULT NULL COMMENT '乘机人姓名',
  `cardNo` varchar(50) DEFAULT NULL COMMENT '乘机人证件号',
  `phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `flightorder` */

insert  into `flightorder`(`id`,`fid`,`leaveDate`,`leaveCity`,`arriveCity`,`leaveTime`,`arriveTime`,`leaveAirport`,`price`,`arriveAirport`,`contactName`,`cardNo`,`phone`) values 
(5,'CA101','2018-12-01','上海','北京','9:00','12:00','虹桥机场',NULL,'首都机场','666666','G12345678','13967676666'),
(6,'CA101','2018-12-01','上海','北京','9:00','12:00','虹桥机场',NULL,'首都机场','666666','G12345678','13967676666'),
(20,'CA101','2018-12-02','上海','北京','9:00','12:00','虹桥机场','310','首都机场','888','G12345678','13967676666'),
(21,'CA101','2018-12-02','上海','北京','9:00','12:00','虹桥机场','310','首都机场','77777','G12345678','13967676666'),
(22,'CA101','2018-12-02','上海','北京','9:00','12:00','虹桥机场','280','首都机场','666666','G12345678','13967676666');

/*Table structure for table `hotelorder` */

DROP TABLE IF EXISTS `hotelorder`;

CREATE TABLE `hotelorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `orderno` varchar(20) DEFAULT NULL COMMENT '订单编号',
  `resname` varchar(50) DEFAULT NULL COMMENT '预订名称',
  `hotelname` varchar(50) DEFAULT NULL COMMENT '酒店名',
  `hotelinfo` varchar(500) DEFAULT NULL COMMENT '酒店简介',
  `hotelpic` varchar(200) DEFAULT NULL COMMENT '酒店图片',
  `checkInDate` varchar(50) DEFAULT NULL COMMENT '入住时间',
  `checkOutDate` varchar(50) DEFAULT NULL COMMENT '退房时间',
  `totaldays` int(11) DEFAULT NULL COMMENT '总天数',
  `orderprice` int(11) DEFAULT NULL COMMENT '总价格',
  `orderstatus` int(11) DEFAULT NULL COMMENT '订单状态',
  `hoteladdress` varchar(100) DEFAULT NULL COMMENT '酒店地址',
  `createby` int(11) DEFAULT NULL COMMENT '创建者',
  `createdate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyby` int(11) DEFAULT NULL COMMENT '修改者',
  `modifydate` datetime DEFAULT NULL COMMENT '修改时间',
  `userId` int(11) DEFAULT NULL COMMENT '用户id,关联用户表id',
  `hotelId` int(11) DEFAULT NULL COMMENT '酒店id,关联酒店表id',
  `payStatus` int(11) DEFAULT NULL COMMENT '支付状态,关联支付状态表id',
  `commentStatus` int(11) DEFAULT NULL COMMENT '评论状态，关联评论表id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `hotelorder` */

insert  into `hotelorder`(`id`,`orderno`,`resname`,`hotelname`,`hotelinfo`,`hotelpic`,`checkInDate`,`checkOutDate`,`totaldays`,`orderprice`,`orderstatus`,`hoteladdress`,`createby`,`createdate`,`modifyby`,`modifydate`,`userId`,`hotelId`,`payStatus`,`commentStatus`) values 
(2,'22222222','peter','上海大饭店','上海最高的五星级酒店之一','/LoveTravel/statics/images/img/hotel279174_01_xxx1213.jpg','2018-11-01','2018-11-02',1,1200,2,'上海路1号',1,'2018-10-24 18:27:16',NULL,NULL,1,2,NULL,NULL);

/*Table structure for table `line` */

DROP TABLE IF EXISTS `line`;

CREATE TABLE `line` (
  `LID` int(11) NOT NULL AUTO_INCREMENT COMMENT '航班号',
  `leaveCity` varchar(11) DEFAULT NULL COMMENT '起飞城市',
  `arriveCity` varchar(50) DEFAULT NULL COMMENT '到达城市',
  `leaveAirport` varchar(50) DEFAULT NULL COMMENT '起飞机场',
  `arriveAirport` varchar(50) DEFAULT NULL COMMENT '到达机场',
  `lineType` varchar(50) DEFAULT NULL COMMENT '航线类型',
  PRIMARY KEY (`LID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `line` */

insert  into `line`(`LID`,`leaveCity`,`arriveCity`,`leaveAirport`,`arriveAirport`,`lineType`) values 
(1,'上海','北京','虹桥机场','首都机场','国内'),
(2,'上海','武汉','浦东机场','天河机场','国内'),
(3,'上海','新加坡','虹桥机场','新加坡机场','国际'),
(4,'上海','香港','浦东机场','香港机场','国际'),
(5,'香港','新加坡','香港机场','新加坡机场','国际'),
(6,'香港','马尼拉','香港机场','马尼拉机场','国际'),
(7,'香港','武汉','香港机场','天河机场','国内'),
(8,'武汉','上海','天河机场','浦东机场','国内'),
(9,'武汉','香港','天河机场','香港机场','国际'),
(10,'武汉','北京','天河机场','首都机场','国内'),
(11,'武汉','新加坡','天河机场','新加坡机场','国际'),
(12,'北京','上海','首都机场','浦东机场','国内'),
(13,'北京','武汉','首都机场','天河机场','国内'),
(14,'北京','香港','首都机场','香港机场','国际'),
(15,'北京','新加坡','首都机场','新加坡机场','国际'),
(16,'新加坡','香港','新加坡机场','香港机场','国际'),
(17,'新加坡','上海','新加坡机场','浦东机场','国内'),
(18,'新加坡','武汉','新加坡机场','天河机场','国内'),
(19,'上海','北京','浦东机场','首都机场','国内'),
(20,'上海','北京','浦东机场','南苑机场','国内'),
(21,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `orderstatus` */

DROP TABLE IF EXISTS `orderstatus`;

CREATE TABLE `orderstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `status` varchar(50) DEFAULT NULL COMMENT '订单状态',
  `createby` int(11) DEFAULT NULL COMMENT '创建者',
  `createdate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyby` int(11) DEFAULT NULL COMMENT '修改者',
  `modifydate` datetime DEFAULT NULL COMMENT '修改时间',
  `temp1` varchar(50) DEFAULT NULL COMMENT '备用',
  `temp2` varchar(50) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `orderstatus` */

insert  into `orderstatus`(`id`,`status`,`createby`,`createdate`,`modifyby`,`modifydate`,`temp1`,`temp2`) values 
(1,'已预定',NULL,NULL,NULL,NULL,NULL,NULL),
(2,'已完成',NULL,NULL,NULL,NULL,NULL,NULL),
(3,'已取消',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `plane` */

DROP TABLE IF EXISTS `plane`;

CREATE TABLE `plane` (
  `PID` int(11) DEFAULT NULL COMMENT '飞机编号',
  `seats_num` int(11) DEFAULT NULL COMMENT '座位数',
  `AID` int(11) DEFAULT NULL COMMENT '所属航空公司'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `plane` */

insert  into `plane`(`PID`,`seats_num`,`AID`) values 
(1,50,1),
(2,50,2),
(3,50,3),
(4,50,4);

/*Table structure for table `price` */

DROP TABLE IF EXISTS `price`;

CREATE TABLE `price` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `flightID` varchar(50) DEFAULT NULL COMMENT '航班号',
  `dateNo` int(11) DEFAULT NULL COMMENT '日期',
  `price` int(50) DEFAULT NULL COMMENT '价格',
  `discount` double(4,1) DEFAULT NULL COMMENT '折扣',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

/*Data for the table `price` */

insert  into `price`(`id`,`flightID`,`dateNo`,`price`,`discount`) values 
(1,'CA101',1,250,0.4),
(2,'CA101',2,200,0.4),
(3,'CA101',3,300,0.4),
(4,'CA101',4,400,0.4),
(5,'CA101',5,500,0.4),
(6,'CA101',6,600,0.4),
(7,'CA101',7,700,0.4),
(8,'CA101',8,800,0.4),
(9,'CA101',9,900,0.4),
(10,'CA101',10,266,0.4),
(11,'CA101',11,200,0.4),
(12,'CA101',12,300,0.4),
(13,'CA101',13,400,0.4),
(14,'CA101',14,222,0.4),
(15,'CA101',15,333,0.4),
(16,'CA101',16,221,0.4),
(17,'CA101',17,342,0.4),
(18,'CA101',18,346,0.4),
(19,'CA101',19,456,0.4),
(20,'CA101',20,347,0.4),
(21,'CA101',21,458,0.4),
(22,'CA101',22,546,0.4),
(23,'CA101',23,574,0.1),
(24,'CA101',24,765,0.4),
(25,'CA101',25,876,0.4),
(26,'CA101',26,456,0.4),
(27,'CA101',27,235,0.4),
(28,'CA101',28,678,0.4),
(29,'CA101',29,398,0.4),
(30,'CA101',30,866,0.4),
(31,'CA101',31,788,0.4),
(32,'CA102',1,455,0.4),
(33,'CA102',2,553,0.4),
(34,'CA102',3,556,0.4),
(35,'CA102',4,234,0.4),
(36,'CA102',5,256,0.4),
(37,'CA102',6,345,0.4),
(38,'CA102',7,456,0.4),
(39,'CA102',8,567,0.4),
(40,'CA102',9,678,0.4),
(41,'CA102',10,765,0.4),
(42,'CA102',11,654,0.4),
(43,'ZA101',12,573,0.4),
(44,'ZA101',13,867,0.4),
(45,'ZA101',14,457,0.4),
(46,'ZA101',15,865,0.4),
(47,'ZA101',16,456,0.4),
(48,'ZA101',17,567,0.4),
(49,'ZA101',18,357,0.4),
(50,'ZA101',19,567,0.4),
(51,'ZA101',20,876,0.4),
(52,'ZA101',21,564,0.4),
(53,'ZA101',22,864,0.4),
(54,'ZA101',23,457,0.4),
(55,'ZA101',24,567,0.4),
(56,'ZA101',25,357,0.4),
(57,'ZA101',26,567,0.4),
(58,'ZA101',27,564,0.4),
(59,'ZA101',28,745,0.4),
(60,'ZA101',29,356,0.4),
(61,'ZA101',30,456,0.4),
(62,'ZA101',31,345,0.4);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `rolename` varchar(20) DEFAULT NULL COMMENT '角色名',
  `createby` int(11) DEFAULT NULL COMMENT '创建者',
  `createdate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyby` int(11) DEFAULT NULL COMMENT '修改者',
  `modifydate` datetime DEFAULT NULL COMMENT '修改时间',
  `temp1` varchar(50) DEFAULT NULL COMMENT '备用',
  `temp2` varchar(50) DEFAULT NULL COMMENT '备用',
  `temp3` varchar(50) DEFAULT NULL COMMENT '备用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`rolename`,`createby`,`createdate`,`modifyby`,`modifydate`,`temp1`,`temp2`,`temp3`) values 
(1,'黄金会员',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(2,'企业会员',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(3,'超级管理员',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `ticketpromotion` */

DROP TABLE IF EXISTS `ticketpromotion`;

CREATE TABLE `ticketpromotion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ticketDiscount` double DEFAULT NULL COMMENT '机票折扣',
  `endorseDiscount` double DEFAULT NULL COMMENT '改签费用比例',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `ticketpromotion` */

insert  into `ticketpromotion`(`id`,`ticketDiscount`,`endorseDiscount`) values 
(1,0.56,0.9),
(2,0.62,0.8),
(3,0.93,0),
(4,1,0);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `userpassword` varchar(20) DEFAULT NULL COMMENT '用户密码',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `roleID` int(11) DEFAULT NULL COMMENT '角色id,关联角色表主键id',
  `createby` int(11) DEFAULT NULL COMMENT '创建者',
  `createdate` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyby` int(11) DEFAULT NULL COMMENT '修改者',
  `modifydate` datetime DEFAULT NULL COMMENT '修改时间',
  `photoName` varchar(50) DEFAULT NULL COMMENT '修改日期',
  `photoRealPath` varchar(200) DEFAULT NULL COMMENT '头像绝对路径',
  `photoOldName` varchar(50) DEFAULT NULL COMMENT '头像名',
  `temp3` varchar(100) DEFAULT NULL COMMENT '备用',
  `photoPath` varchar(200) DEFAULT NULL COMMENT '头像相对路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`userpassword`,`phone`,`email`,`roleID`,`createby`,`createdate`,`modifyby`,`modifydate`,`photoName`,`photoRealPath`,`photoOldName`,`temp3`,`photoPath`) values 
(1,'2343','s123456','13971676828','1374899218@qq.com',1,1,'2018-11-17 17:53:41',1,'2018-12-01 22:54:37',NULL,NULL,NULL,NULL,'');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
