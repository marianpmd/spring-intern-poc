--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3
-- Dumped by pg_dump version 13.1

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
-- Data for Name: character; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."character" VALUES
	(1, 'name1', 'lastname1', 12),
	(2, 'name2', 'lastname2', 13);


--
-- Data for Name: ability; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.ability VALUES
	(1, 'ability1', 1),
	(2, 'ability11', 1),
	(3, 'ability2', 2),
	(4, 'ability22', 2);


--
-- Data for Name: databasechangelog; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.databasechangelog VALUES
	('20210721-001', 'mpetrica', 'liquibase/20210721-episode-changelog.xml', '2021-07-21 15:36:31.328731', 1, 'EXECUTED', '8:1b00489c49cfbeec64a9b2e39fe306b3', 'createTable tableName=EPISODE', '', NULL, '4.3.5', NULL, NULL, '6870991063'),
	('20210721-001', 'mpetrica', 'liquibase/20210721-character-changelog.xml', '2021-07-21 15:49:12.286676', 2, 'EXECUTED', '8:cd4e710bdaac068c4bf78cb748f89e66', 'createTable tableName=CHARACTER', '', NULL, '4.3.5', NULL, NULL, '6871752070'),
	('20210721-001', 'mpetrica', 'liquibase/20210721-ability-changelog.xml', '2021-07-21 15:54:42.319507', 3, 'EXECUTED', '8:363611144d5d05f1d9cbd3c49d7a1afe', 'createTable tableName=ABILITY', '', NULL, '4.3.5', NULL, NULL, '6872081965'),
	('20210721-006', 'mpetrica', 'liquibase/20210721-ability-changelog.xml', '2021-07-21 16:20:05.693739', 4, 'EXECUTED', '8:f0c9468e8a709ea4414051657ac9eb3f', 'modifyDataType columnName=CHARACTER_FK, tableName=ABILITY', '', NULL, '4.3.5', NULL, NULL, '6873605133'),
	('20210721-004', 'mpetrica', 'liquibase/20210721-ability-changelog.xml', '2021-07-21 16:20:05.732958', 5, 'EXECUTED', '8:0c121714da9a6c0ebb349e0155f9c3b8', 'addForeignKeyConstraint baseTableName=ABILITY, constraintName=characterIdFK, referencedTableName=CHARACTER', '', NULL, '4.3.5', NULL, NULL, '6873605133'),
	('20210721-001', 'mpetrica', 'liquibase/20210721-trivia-changelog.xml', '2021-07-22 09:20:49.68413', 6, 'EXECUTED', '8:e12df165f0d248d99357968b7ea224d3', 'createTable tableName=TRIVIA', '', NULL, '4.3.5', NULL, NULL, '6934849450'),
	('20210722-001', 'mpetrica', 'liquibase/20210721-episode-changelog.xml', '2021-07-22 10:46:34.940613', 7, 'EXECUTED', '8:310e9c44e410884b9073676a95f1aff7', 'renameColumn newColumnName=RELEASE_DATE, oldColumnName=RELEASE_DARE, tableName=EPISODE', '', NULL, '4.3.5', NULL, NULL, '6939994773');


--
-- Data for Name: databasechangeloglock; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.databasechangeloglock VALUES
	(1, false, NULL, NULL);


--
-- Data for Name: episode; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.episode VALUES
	(1, '1', '2021-07-21 00:00:00', '2021-07-21 00:00:00', 'platform1', 'country1'),
	(2, '2', '2021-07-22 00:00:00', '2021-07-22 00:00:00', 'platform2', 'country2'),
	(4, '3', '2021-07-21 00:00:00', '2021-07-21 00:00:00', 'platform1', 'country2'),
	(5, '3', '2021-07-21 00:00:00', '2021-07-21 00:00:00', 'platform1', 'country2'),
	(6, '3', '2021-07-21 00:00:00', '2021-07-21 00:00:00', 'platform1', 'country2');


--
-- Data for Name: trivia; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Name: ability_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ability_id_seq', 1, false);


--
-- Name: character_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.character_id_seq', 1, false);


--
-- Name: episode_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.episode_id_seq', 6, true);


--
-- Name: trivia_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.trivia_id_seq', 1, false);


--
-- PostgreSQL database dump complete
--

