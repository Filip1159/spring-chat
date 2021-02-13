--liquibase formatted sql
--changeset filip:6
create table messages (
    message_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    conversation_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    content varchar(100) NOT NULL,
    was_read TINYINT(1),
    foreign key (conversation_id) references conversations(conversation_id),
    foreign key (user_id) references users(user_id)
)