### mysql 계정 만들기
```
    create database db_memo;
    create user user_memo@localhost identified by '1234';
    grant all privileges on db_memo.* to user_memo@localhost;
```

### tables
```
drop table if exists memo;
create table db_memo.memo
(
    idx      int auto_increment comment '인덱스'
        primary key,
    contents text null comment '내용'
)
    comment '메모';
```