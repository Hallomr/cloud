/*
 Navicat Premium Data Transfer

 Source Server         : localhost_5432
 Source Server Type    : PostgreSQL
 Source Server Version : 100011
 Source Host           : localhost:5432
 Source Catalog        : mp
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 100011
 File Encoding         : 65001

 Date: 21/05/2022 17:50:24
*/


-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."user_info";
CREATE TABLE "public"."user_info" (
  "id" int8 NOT NULL DEFAULT nextval('users_id_seq1'::regclass),
  "password" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "username" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "status" int2 NOT NULL,
  "create_time" timestamp(6) NOT NULL,
  "update_time" timestamp(6),
  "content" jsonb
)
;
COMMENT ON COLUMN "public"."user_info"."id" IS '主键id';
COMMENT ON COLUMN "public"."user_info"."password" IS '用户密码';
COMMENT ON COLUMN "public"."user_info"."username" IS '用户名';
COMMENT ON COLUMN "public"."user_info"."status" IS '状态 1启用 0 停用';
COMMENT ON COLUMN "public"."user_info"."create_time" IS '创建时间';
COMMENT ON COLUMN "public"."user_info"."update_time" IS '更新时间';
COMMENT ON COLUMN "public"."user_info"."content" IS '相关内容';

-- ----------------------------
-- Primary Key structure for table user_info
-- ----------------------------
ALTER TABLE "public"."user_info" ADD CONSTRAINT "users_pkey" PRIMARY KEY ("id");
