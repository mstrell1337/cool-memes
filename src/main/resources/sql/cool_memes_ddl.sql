-- DDL

CREATE DATABASE memes;
USE memes;

CREATE TABLE tags (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    tag_timestamp INTEGER,
    tag_name TEXT
);

CREATE TABLE posts (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    post_timestamp INTEGER,
    post_name TEXT,
    post_descr TEXT,
    post_type_info TEXT,
    post_platform_id INTEGER,
    post_src_id INTEGER,
    post_link TEXT
);

CREATE TABLE snapshots (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    snapshot_timestamp INTEGER,
    snapshot_name TEXT,
	snapshot_descr TEXT,
	snapshot_platform_id INTEGER,
	snapshot_post_id INTEGER,
	snapshot_type_id INTEGER,
	snapshot_views_count INTEGER,
	snapshot_likes_count INTEGER,
	snapshot_dislikes_count INTEGER,
	snapshot_reposts_count INTEGER,
	snapshot_comments_count INTEGER,
	snapshot_link TEXT
);

CREATE TABLE memes (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    meme_timestamp INTEGER,
    meme_name TEXT,
	meme_descr TEXT,
	meme_type_info TEXT,
	meme_category TEXT,
	meme_home INTEGER,
	meme_popularity INTEGER
);

CREATE TABLE memes_to_posts (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
	meme_id INTEGER,
    post_id INTEGER
);

CREATE TABLE posts_to_snapshots (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
	post_id INTEGER,
    snapshot_id INTEGER
);

CREATE TABLE platforms_to_posts (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
	platform_id INTEGER,
    post_id INTEGER
);

CREATE TABLE tags_to_posts (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    tag_id INTEGER,
	post_id INTEGER
);

CREATE TABLE tags_to_snapshots (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    tag_id INTEGER,
	snapshot_id INTEGER
);

CREATE TABLE tags_to_memes (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    tag_id INTEGER,
	meme_id INTEGER
);

CREATE TABLE tags_to_snapshots (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    tag_id INTEGER,
	snapshot_id INTEGER
);

CREATE TABLE snapshot_to_srcs (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    snapshot_id INTEGER,
	src TEXT
);

CREATE TABLE langs_to_platforms (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    lang TEXT
);

CREATE TABLE countries_to_memes (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    country TEXT
);

CREATE TABLE langs_to_memes (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    country TEXT
);
