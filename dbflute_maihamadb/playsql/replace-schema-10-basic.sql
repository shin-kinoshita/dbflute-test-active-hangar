
create table MEMBER(
    MEMBER_ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
    MEMBER_NAME VARCHAR(200) NOT NULL,
    MEMBER_ACCOUNT VARCHAR(50) NOT NULL,
    MEMBER_STATUS_CODE CHAR(3) NOT NULL,
    FORMALIZED_DATETIME DATETIME,
    BIRTHDATE DATE,
    BIRTH_CODE DATE,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);


create table MEMBER_ADDRESS(
    MEMBER_ADDRESS_ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
    MEMBER_ID INTEGER NOT NULL,
    VALID_BEGIN_DATE DATE NOT NULL,
    VALID_END_DATE DATE NOT NULL,
    ADDRESS VARCHAR(200) NOT NULL,
    BIRTH_CODE INTEGER,
    REGION_ID INTEGER NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);


create table MEMBER_FOLLOWING(
    MEMBER_FOLLOWING_ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
    MY_MEMBER_ID INTEGER NOT NULL,
    YOUR_MEMBER_ID INTEGER NOT NULL,
    FOLLOW_DATETIME DATETIME NOT NULL
);


create table MEMBER_LOGIN(
    MEMBER_LOGIN_ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
    MEMBER_ID INTEGER NOT NULL,
    LOGIN_DATETIME DATETIME NOT NULL,
    MOBILE_LOGIN_FLG INTEGER NOT NULL,
    LOGIN_MEMBER_STATUS_CODE CHAR(3) NOT NULL
);


create table MEMBER_SECURITY(
    MEMBER_ID INTEGER NOT NULL PRIMARY KEY,
    LOGIN_PASSWORD VARCHAR(100) NOT NULL,
    REMINDER_QUESTION VARCHAR(50) NOT NULL,
    REMINDER_ANSWER VARCHAR(50) NOT NULL,
    REMINDER_USE_COUNT INTEGER NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);


create table MEMBER_SERVICE(
    MEMBER_SERVICE_ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
    MEMBER_ID INTEGER NOT NULL,
    SERVICE_POINT_COUNT INTEGER NOT NULL,
    SERVICE_RANK_CODE CHAR(3) NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);


create table MEMBER_WITHDRAWAL(
    MEMBER_ID INTEGER NOT NULL PRIMARY KEY,
    WITHDRAWAL_REASON_CODE CHAR(3),
    WITHDRAWAL_REASON_INPUT_TEXT TEXT,
    WITHDRAWAL_DATETIME DATETIME NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL
);


create table PURCHASE(
    PURCHASE_ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
    MEMBER_ID INTEGER NOT NULL,
    PRODUCT_ID INTEGER NOT NULL,
    PURCHASE_DATETIME DATETIME NOT NULL,
    PURCHASE_COUNT INTEGER NOT NULL,
    PURCHASE_PRICE INTEGER NOT NULL,
    PAYMENT_COMPLETE_FLG INTEGER NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);


create table PURCHASE_PAYMENT(
    PURCHASE_PAYMENT_ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
    PURCHASE_ID BIGINT NOT NULL,
    PAYMENT_AMOUNT DECIMAL(10,2) NOT NULL,
    PAYMENT_DATETIME DATETIME NOT NULL,
    PAYMENT_METHOD_CODE CHAR(3) NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL
);


create table PRODUCT(
    PRODUCT_ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
    PRODUCT_NAME VARCHAR(50) NOT NULL,
    PRODUCT_HANDLE_CODE VARCHAR(100) NOT NULL,
    PRODUCT_CATEGORY_CODE CHAR(3) NOT NULL,
    PRODUCT_STATUS_CODE CHAR(3) NOT NULL,
    REGULAR_PRICE INTEGER NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);


create table PRODUCT_CATEGORY(
    PRODUCT_CATEGORY_CODE CHAR(3) NOT NULL PRIMARY KEY,
    PRODUCT_CATEGORY_NAME VARCHAR(50) NOT NULL,
    PARENT_CATEGORY_CODE CHAR(3)
);


create table PRODUCT_STATUS(
    PRODUCT_STATUS_CODE CHAR(3) NOT NULL PRIMARY KEY,
    PRODUCT_STATUS_NAME VARCHAR(50) NOT NULL,
    DISPLAY_ORDER INTEGER NOT NULL
);


create table REGION(
    REGION_ID INTEGER NOT NULL PRIMARY KEY,
    REGION_NAME VARCHAR(50) NOT NULL
);


create table SERVICE_RANK(
    SERVICE_RANK_CODE CHAR(3) NOT NULL PRIMARY KEY,
    SERVICE_RANK_NAME VARCHAR(50) NOT NULL,
    SERVICE_POINT_INCIDENCE NUMERIC(5, 3) NOT NULL,
    NEW_ACCEPTABLE_FLG INTEGER NOT NULL,
    DESCRIPTION VARCHAR(200) NOT NULL,
    DISPLAY_ORDER INTEGER NOT NULL
);


create table MEMBER_STATUS(
    MEMBER_STATUS_CODE CHAR(3) NOT NULL PRIMARY KEY,
    MEMBER_STATUS_NAME VARCHAR(50) NOT NULL,
    DESCRIPTION VARCHAR(200) NOT NULL,
    DISPLAY_ORDER INTEGER NOT NULL
);


create table WITHDRAWAL_REASON(
    WITHDRAWAL_REASON_CODE CHAR(3) NOT NULL PRIMARY KEY,
    WITHDRAWAL_REASON_TEXT TEXT NOT NULL,
    DISPLAY_ORDER INTEGER NOT NULL
);


alter table MEMBER add constraint FK_MEMBER_MEMBER_STATUS 
    foreign key (MEMBER_STATUS_CODE) references MEMBER_STATUS (MEMBER_STATUS_CODE);

alter table MEMBER_ADDRESS add constraint FK_MEMBER_ADDRESS_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_ADDRESS add constraint FK_MEMBER_ADDRESS_REGION 
    foreign key (REGION_ID) references REGION (REGION_ID);

alter table MEMBER_FOLLOWING add constraint FK_MEMBER_FOLLOWING_MY_MEMBER 
    foreign key (MY_MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_FOLLOWING add constraint FK_MEMBER_FOLLOWING_YOUR_MEMBER 
    foreign key (YOUR_MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_LOGIN add constraint FK_MEMBER_LOGIN_MEMBER_STATUS 
    foreign key (LOGIN_MEMBER_STATUS_CODE) references MEMBER_STATUS (MEMBER_STATUS_CODE);

alter table MEMBER_LOGIN add constraint FK_MEMBER_LOGIN_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_SERVICE add constraint FK_MEMBER_SERVICE_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_SERVICE add constraint FK_MEMBER_SERVICE_SERVICE_RANK_CODE 
    foreign key (SERVICE_RANK_CODE) references SERVICE_RANK (SERVICE_RANK_CODE);

alter table MEMBER_SECURITY add constraint FK_MEMBER_SECURITY_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_WITHDRAWAL add constraint FK_MEMBER_WITHDRAWAL_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_WITHDRAWAL add constraint FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON 
    foreign key (WITHDRAWAL_REASON_CODE) references WITHDRAWAL_REASON (WITHDRAWAL_REASON_CODE);

alter table PURCHASE add constraint FK_PURCHASE_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table PURCHASE add constraint FK_PURCHASE_PRODUCT 
    foreign key (PRODUCT_ID) references PRODUCT (PRODUCT_ID);

alter table PURCHASE_PAYMENT add constraint FK_PURCHASE_PAYMENT_PURCHASE 
    foreign key (PURCHASE_ID) references PURCHASE (PURCHASE_ID);

alter table PRODUCT add constraint FK_PRODUCT_PRODUCT_CATEGORY 
    foreign key (PRODUCT_CATEGORY_CODE) references PRODUCT_CATEGORY (PRODUCT_CATEGORY_CODE);

alter table PRODUCT add constraint FK_PRODUCT_PRODUCT_STATUS 
    foreign key (PRODUCT_STATUS_CODE) references PRODUCT_STATUS (PRODUCT_STATUS_CODE);

alter table PRODUCT_CATEGORY add constraint FK_PRODUCT_CATEGORY_PARENT 
    foreign key (PARENT_CATEGORY_CODE) references PRODUCT_CATEGORY (PRODUCT_CATEGORY_CODE);


alter table MEMBER add constraint UQ_MEMBER_MEMBER_ACCOUNT UNIQUE (MEMBER_ACCOUNT);
alter table MEMBER_ADDRESS add constraint UQ_MEMBER_ADDRESS UNIQUE (MEMBER_ID, VALID_BEGIN_DATE);
alter table MEMBER_FOLLOWING add constraint UQ_MEMBER_FOLLOWING UNIQUE (MY_MEMBER_ID, YOUR_MEMBER_ID);
alter table MEMBER_LOGIN add constraint UQ_MEMBER_LOGIN UNIQUE (MEMBER_ID, LOGIN_DATETIME);
alter table MEMBER_SERVICE add constraint UQ_MEMBER_SERVICE UNIQUE (MEMBER_ID);
alter table PURCHASE add constraint UQ_PURCHASE UNIQUE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME);
alter table PRODUCT add constraint UQ_PRODUCT_PRODUCT_HANDLE_CODE UNIQUE (PRODUCT_HANDLE_CODE);
alter table MEMBER_STATUS add constraint UQ_MEMBER_STATUS_DISPLAY_ORDER UNIQUE (DISPLAY_ORDER);
alter table PRODUCT_STATUS add constraint UQ_PRODUCT_STATUS_DISPLAY_ORDER UNIQUE (DISPLAY_ORDER);
alter table SERVICE_RANK add constraint UQ_SERVICE_RANK_DISPLAY_ORDER UNIQUE (DISPLAY_ORDER);
alter table WITHDRAWAL_REASON add constraint UQ_WITHDRAWAL_REASON_DISPLAY_ORDER UNIQUE (DISPLAY_ORDER);


create index IX_MEMBER_MEMBER_NAME on MEMBER(MEMBER_NAME);
create index IX_MEMBER_FORMALIZED_DATETIME on MEMBER(FORMALIZED_DATETIME);
create index IX_MEMBER_FOLLOWING_UNIQUE_REVERSE on MEMBER_FOLLOWING(YOUR_MEMBER_ID, MY_MEMBER_ID);
create index IX_MEMBER_FOLLOWING_FOLLOW_DATETIME on MEMBER_FOLLOWING(FOLLOW_DATETIME);
create index IX_MEMBER_LOGIN_DATETIME on MEMBER_LOGIN(LOGIN_DATETIME);
create index IX_MEMBER_SERVICE_POINT_COUNT on MEMBER_SERVICE(SERVICE_POINT_COUNT);
create index IX_PURCHASE_PRODUCT_DATETIME on PURCHASE(PRODUCT_ID, PURCHASE_DATETIME);
create index IX_PURCHASE_DATETIME_MEMBER on PURCHASE(PURCHASE_DATETIME, MEMBER_ID);
create index IX_PURCHASE_PRICE on PURCHASE(PURCHASE_PRICE);
create index IX_PURCHASE_PAYMENT_DATETIME on PURCHASE_PAYMENT(PAYMENT_DATETIME, PAYMENT_AMOUNT);
create index IX_PRODUCT_PRODUCT_NAME on PRODUCT(PRODUCT_NAME);
