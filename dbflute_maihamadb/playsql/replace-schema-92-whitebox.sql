
-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of fixed-only biz-one-to-one
-- = = = = = = = = = =/
CREATE TABLE WHITE_DATE_TERM (
	DATE_TERM_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	DATE_TERM_VALUE VARCHAR(200) NOT NULL,
	BEGIN_DATE DATE NOT NULL,
	END_DATE DATE NOT NULL
);

-- /= = = = = = = = = = = = = =
-- for the test of tsv loading
-- = = = = = = = = = =/
CREATE TABLE WHITE_TSV_LOADING (
	TSV_LOADING_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	TSV_LOADING_NAME VARCHAR(200) NOT NULL,
	LOADING_COUNT INTEGER NOT NULL,
	LOADING_DATE DATE NOT NULL,
	BEGIN_DATETIME DATETIME NOT NULL,
	END_DATETIME DATETIME,
	DONE_FLG BOOLEAN NOT NULL
);
