INSERT INTO member (id, name, membership_start_date, duration_months, membership_type, address, email, phone)
VALUES (1, 'Jack Sparrow', '2025-06-06', 12, 'Premium', '123 Port Street', 'JackSparrow@example.com', '1234567890');

INSERT INTO tournament (id, entry_fee, cash_prize, start_date, end_date, location)
VALUES (1, 10.99, 1000.00, '2025-06-15', '2025-06-20', 'ABC Golf Greens');

INSERT INTO tournament_member (tournament_id, member_id)
VALUES (1, 1);