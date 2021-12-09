CREATE TABLE IF NOT EXISTS public.yorum
(
    id numeric(19,0) NOT NULL,
    comment character(500) NOT NULL,
    comment_date timestamp with time zone NOT NULL DEFAULT CURRENT_DATE,
    product_id bigint,
    user_id bigint,
    CONSTRAINT comment_pkey PRIMARY KEY (id),
    CONSTRAINT fk_comment_product_id FOREIGN KEY (product_id)
        REFERENCES public.urun (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_comment_user_id FOREIGN KEY (user_id)
        REFERENCES public.kullanici (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)