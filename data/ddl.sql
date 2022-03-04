
DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    user_id           BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    id                VARCHAR(512) NOT NULL,
    name              VARCHAR(512) NOT NULL,
    password          VARCHAR(512) NOT NULL,
--     partner_client_id VARCHAR(512) NULL,

    PRIMARY KEY (user_id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
