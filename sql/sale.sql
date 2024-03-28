
CREATE TABLE sale.`product`(
 `id` int auto_INCREMENT not null PRIMARY KEY,
 `name` varchar(64) NOT NULL,
 `stock` decimal(16,4) DEFAULT 0,
 `unit` varchar(16) DEFAULT '',
 `price` decimal(12,4) DEFAULT 0,
 `create_time` timestamp,
 `creator_id` int,
 `update_time` timestamp,
 `updater_id` int
) engine=innodb DEFAULT charset = 'utf8mb4'