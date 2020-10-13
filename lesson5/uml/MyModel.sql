create table schools(
    id integer not null primary key,
    name varchar(255) not null,
    address varchar(255) not null
);

comment on column schools.id
is 'ID школы';

comment on column schools.name
is 'Название школы';

comment on column schools.address
is 'Адрес школы';

create table subjects (
    id integer not null primary key,
    name varchar(255) not null
);

comment on column subjects.id
is 'ID предмета';

comment on column subjects.name
is 'Название предмета';

create table teachers(
    id integer not null primary key,
    name varchar(255) not null,
    age integer not null,
    gender varchar(255) not null
);

comment on column teachers.id
is 'ID учителя';

comment on column teachers.name
is 'ФИО учителя';

comment on column teachers.age
is 'Возраст учителя';

comment on column teachers.gender
is 'Пол';

create table students(
    id integer not null primary key,
    name varchar(255) not null,
    age integer not null,
    gender varchar(255) not null
);

comment on column students.id
is 'ID студента';

comment on column students.name
is 'ФИО студента';

comment on column students.age
is 'Возраст студента';

comment on column students.gender
is 'Пол';

create table school_students (
	school_id not null references schools(id),
	student_id not null references students(id)
);

comment on column school_students.school_id
is 'ID школы';

comment on column school_students.student_id
is 'ID студента';

create table school_teachers (
	school_id not null references schools(id),
	teacher_id not null references teachers(id)
);

comment on column school_teachers.school_id
is 'ID школы';

comment on column school_teachers.teacher_id
is 'ID учителя';

create table subjects_teachers (
	subject_id not null references subjects(id),
	teacher_id not null references teachers(id)
);

comment on column subjects_teachers.subject_id
is 'ID предмета';

comment on column subjects_teachers.teacher_id
is 'ID учителя';

create table students_subjects (
	student_id not null references students(id),
	subject_id not null references subjects(id)
);

comment on column students_subjects.student_id
is 'ID студента';

comment on column students_subjects.subject_id
is 'ID предмета';