CREATE TABLE IF NOT EXISTS public.kullanici
(
    id numeric(19,0) NOT NULL,
    name character(50) COLLATE NOT NULL,
    surname character(50) COLLATE NOT NULL,
    email character(50) COLLATE NOT NULL,
    phone character(15) COLLATE NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id)
)
