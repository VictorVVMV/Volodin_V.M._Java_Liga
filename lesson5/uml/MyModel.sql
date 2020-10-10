create table school(
    id integer not null primary key,
    name varchar(255) not null,
    address varchar(255) not null
);

comment on column school.name
is 'Название школы';

create table subjects (
    id integer not null primary key,
    name varchar(255) not null,
    teacher_id integer not null references teachers(id)
);

comment on column subjects.name
is 'Название предмета';

comment on column subjects.teacher
is 'Преподаватель';

create table teachers(
    id integer not null primary key,
    name varchar(255) not null,
    subject_id integer not null references subjects(id),
    school_id integer not null references school(id)
);

comment on column teacher.subject
is 'Предмет';

create table students(
    id integer not null primary key,
    name varchar(255) not null,
    age integer not null,
    gender varchar(255) not null,
    subject_id integer not null references subjects(id),
    school_id integer not null references school(id)
);

comment on column students.gender
is 'Пол';