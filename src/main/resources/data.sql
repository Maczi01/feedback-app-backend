insert into users (id, email)
values (1, 'mati@mati.pl'),
       (2, 'mati@mati.pl'),
       (3, 'mati@mati.pl');

insert into category (id, name, description)
values (1, 'ELECTRONICS', 'agd, rtv and other electro stuff'),
       (2, 'HOME', 'Things for kitchen, bathroom, garden'),
       (3, 'SPORT', 'balls, sport wears, accessories');

insert into product (id, name, grade)
values (1, 'laptop', 5),
       (2, 'chair', 4),
       (3, 'ball', 3);

insert into feedback (id, title, description, date, user_id, product_id)
values (1, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 1, 1),
       (2, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 2, 2),
       (3, 'best laptop', 'solid laptop, best ever', '2017-10-08 15:00:00', 3, 3);