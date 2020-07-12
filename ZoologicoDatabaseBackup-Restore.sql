--
-- PostgreSQL database dump
--

-- Dumped from database version 10.12
-- Dumped by pg_dump version 10.12

-- Started on 2020-07-11 21:54:46

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2799 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 16590)
-- Name: animales; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.animales (
    especie character varying(20) NOT NULL,
    habitat character varying(20),
    cantidad integer
);


ALTER TABLE public.animales OWNER TO postgres;

--
-- TOC entry 2791 (class 0 OID 16590)
-- Dependencies: 196
-- Data for Name: animales; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.animales (especie, habitat, cantidad) FROM stdin;
pez	agua salada	5
delfin	agua dulce	1
tiburon	agua dulce	1
aguila	desierto	1
loro	selva	1
tucan	selva	1
cerdo	granja	1
elefante	sabana	1
jirafa	sabana	1
leon	sabana	1
axolotl	Lagunas	1
mono	selva	2
gorilla	selva	2
\.


--
-- TOC entry 2669 (class 2606 OID 16594)
-- Name: animales animales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.animales
    ADD CONSTRAINT animales_pkey PRIMARY KEY (especie);


-- Completed on 2020-07-11 21:54:47

--
-- PostgreSQL database dump complete
--

