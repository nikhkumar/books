

CREATE TABLE public.author
(
    id integer NOT NULL,
    f_name character(30),
    l_name character(30),
    country character(30),
    PRIMARY KEY (id)
);


INSERT INTO public.author(id, country, f_name, l_name) VALUES (1, 'IN', 'Arvind', 'Adiga');
INSERT INTO public.author(id, country, f_name, l_name) VALUES (2, 'IN', 'Chetan', 'Bhagat');
INSERT INTO public.author(id, country, f_name, l_name) VALUES (3, 'IN', 'Robin', 'Sharma');
INSERT INTO public.author(id, country, f_name, l_name) VALUES (4, 'US', 'Jeffery', 'Archer');
INSERT INTO public.author(id, country, f_name, l_name) VALUES (5, 'US', 'Steve', 'Jobs');	

CREATE TABLE public.books
(
    isbn integer NOT NULL,
    title character(255) NOT NULL,
    publish_year character(30),
    genre character(30),
    author_id integer,
    PRIMARY KEY (isbn),
    FOREIGN KEY (author_id)
        REFERENCES public.author (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);


INSERT INTO public.books(isbn, genere, publish_year, title, author_id) VALUES (111, 'FICTION', 'July, 2020', 'This is the First Book', 1);
INSERT INTO public.books(isbn, genere, publish_year, title, author_id) VALUES (112, 'FICTION', 'Jan, 2020', '5 Points someone', 2);
INSERT INTO public.books(isbn, genere, publish_year, title, author_id) VALUES (113, 'FICTION', 'Aug, 2019', 'Monk Who Sold His Ferrari', 3);
INSERT INTO public.books(isbn, genere, publish_year, title, author_id) VALUES (114, 'NONFICTION', 'Dec, 2019', 'Two States', 2);
INSERT INTO public.books(isbn, genere, publish_year, title, author_id) VALUES (115, 'NONFICTION', 'Feb, 2018', 'Intersteller', 1);
INSERT INTO public.books(isbn, genere, publish_year, title, author_id) VALUES (116, 'NONFICTION', 'Mar, 2017', 'Stay Hungry Stay Foolish', 5);	
	