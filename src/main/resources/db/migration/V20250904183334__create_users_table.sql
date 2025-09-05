CREATE TABLE users
(
    id           UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    fio          VARCHAR(256) NOT NULL,
    phone_number VARCHAR(12) UNIQUE,
    avatar       text,
    role_uuid      uuid         NOT NULL,
    CONSTRAINT fk_user_role FOREIGN KEY (role_uuid)
        REFERENCES roles (uuid)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);