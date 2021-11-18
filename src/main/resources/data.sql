insert into users (id, email)
values (1, 'mati@mati.pl'),
       (2, 'mati@mati.pl'),
       (3, 'mati@mati.pl');

insert into product (id, name, grade)
values (1, 'Laptop', 5),
       (2, 'Chair', 4),
       (3, 'Ball', 3),
       (4, 'Cup,', 3),
       (5, 'Toaster,', 2),
       (6, 'Table', 3),
       (7, 'Shoes', 2),
       (8, 'Keyboard', 3);

insert into category (id, name, description, product_id)
values (1, 'ELECTRONICS', 'agd, rtv and other electro stuff', 1),
       (2, 'HOME', 'Things for kitchen, bathroom, garden', 1),
       (3, 'SPORT', 'balls, sport wears, accessories', 2);

insert into feedback (id, title, description, date, user_id, product_id)
values (1, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 1, 1),
       (2, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 2, 2),
       (3, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 3, 3);