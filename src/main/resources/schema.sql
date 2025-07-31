-- CREATE all tables
CREATE TABLE tournament (
    id INT PRIMARY KEY,
    entry_fee DECIMAL,
    cash_prize DECIMAL,
    start_date DATE,
    end_date DATE,
    location VARCHAR(255)
);

CREATE TABLE member (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    membership_start_date DATE,
    duration_months INT,
    membership_type VARCHAR(255),
    address VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(15)
);

CREATE TABLE tournament_member (
    tournament_id INT,
    member_id INT,
    PRIMARY KEY (tournament_id, member_id),
    FOREIGN KEY (tournament_id) REFERENCES tournament(id),
    FOREIGN KEY (member_id) REFERENCES member(id)
);
