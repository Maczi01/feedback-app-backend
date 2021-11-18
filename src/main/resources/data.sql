insert into users (id, email)
values (1, 'mati@mati.pl'),
       (2, 'mati@mati.pl'),
       (3, 'mati@mati.pl');

insert into product (id, name, grade)
values (1, 'Laptop', 5),
       (2, 'Chair', 4),
       (3, 'Ball', 3),
       (4, 'Cup', 3),
       (5, 'Toaster', 2),
       (6, 'Table', 3),
       (7, 'Shoes', 2),
       (8, 'Keyboard', 3),
       (9, 'Bike', 4),
       (10, 'Tyres', 3),
       (11, 'Carpet', 1),
       (12, 'Desk', 5),
       (13, 'Coffee Maker', 1),
       (14, 'Door', 1),
       (15, 'TV', 2);

insert into category (id, name, description)
values (1, 'ELECTRONICS', 'agd, rtv and other electro stuff'),
       (2, 'HOME', 'Things for kitchen, bathroom, garden'),
       (3, 'SPORT', 'Things for sports');

insert into feedback (id, title, description, date, user_id, product_id)
values (1, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 1, 1),
    (2, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 2, 2),
    (3, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 3, 3);

insert into PRODUCT_CATEGORIES (product_id, categories_id)
values (1,1),
       (1,2),
       (2,3),
       (3,3);
