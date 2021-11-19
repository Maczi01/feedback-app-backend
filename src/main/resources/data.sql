insert into users (id, email)
values (1, 'mati@mati.pl'),
       (2, 'mati@mati.pl'),
       (3, 'mati@mati.pl');

insert into product (id, name, averageGrade)
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

insert into feedback (id, title, description, date, grade, user_id, product_id)
values (1, 'Best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00',2, 1, 1),
       (2, 'Good chair', 'Office chair in cheap price, I recommend for players', '2019-05-11 18:56:07',3, 1, 2),
       (3, 'Comfortable shoes', 'Good for running outside', '2021-01-09 08:51:11',3, 2, 7),
       (4, 'Worst carper!', 'Very bad quality, hard to clean it', '2020-06-22 11:31:16',0, 1, 11),
       (5, 'Coffee maker for everyone', 'Nice coffee, but grinder too loud', '2018-04-08 17:44:03',5, 3, 13);

insert into PRODUCT_CATEGORIES (product_id, categories_id)
values (1,1),
       (1,2),
       (2,3),
       (3,3);
