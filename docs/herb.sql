CREATE TABLE `herb` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(64) DEFAULT NULL COMMENT '药材名称',
    `herb_type` bigint(20) DEFAULT NULL COMMENT '药材类型',
    `images` varchar(500) DEFAULT NULL COMMENT '图片',
    `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='中药类型';

CREATE TABLE `herb_info` (
     `id` bigint(20) NOT NULL AUTO_INCREMENT,
     `herb_id` bigint(20) DEFAULT NULL COMMENT '药材ID',
     `type` varchar(64) DEFAULT NULL COMMENT '信息类型',
     `images` varchar(500) DEFAULT NULL COMMENT '图片',
     `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
     `video` varchar(500) DEFAULT NULL COMMENT '视频',
     `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
     `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='中药信息';

CREATE TABLE `herb_type` (
     `id` bigint(20) NOT NULL AUTO_INCREMENT,
     `name` varchar(64) DEFAULT NULL COMMENT '名称',
     `images` varchar(500) DEFAULT NULL COMMENT '图片',
     `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '描述',
     `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
     `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='中药类型';

CREATE TABLE `info` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `type` varchar(16) DEFAULT NULL COMMENT '类型',
    `content` varchar(500) DEFAULT NULL COMMENT '内容',
    `images` varchar(500) DEFAULT NULL COMMENT '图片',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='信息表';

CREATE TABLE `manager` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `name` varchar(64) DEFAULT NULL COMMENT '名称',
   `phone` varchar(16) DEFAULT NULL COMMENT '电话',
   `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
   `status` int(1) DEFAULT '1' COMMENT '用户启用状态：0->禁用；1->启用',
   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';

CREATE TABLE `user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `login_name` varchar(64) DEFAULT NULL COMMENT '登录名',
    `user_name` varchar(64) DEFAULT NULL COMMENT '用户名',
    `password` varchar(255) DEFAULT NULL COMMENT '密码',
    `icon` varchar(500) DEFAULT NULL COMMENT '头像',
    `status` int(1) DEFAULT '1' COMMENT '帐号启用状态：0->禁用；1->启用',
    `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
    `remark` varchar(500) DEFAULT NULL COMMENT '备注信息',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `weather` (
   `id` bigint(20) NOT NULL AUTO_INCREMENT,
   `rainfall` varchar(8) DEFAULT NULL COMMENT '雨量',
   `temperature` varchar(8) DEFAULT NULL COMMENT '温度',
   `humidity` varchar(8) DEFAULT NULL COMMENT '湿度',
   `dew_temperature` varchar(8) DEFAULT NULL COMMENT '露点温度',
   `light_intensity` varchar(8) DEFAULT NULL COMMENT '光照强度',
   `record_time` datetime DEFAULT NULL COMMENT '记录时间',
   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='温度表';

