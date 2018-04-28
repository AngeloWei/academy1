drop table if EXISTS tb_class_collection;
CREATE TABLE "public"."tb_class_collection" (
"id" serial4 NOT NULL,
"title" varchar(255) COLLATE "default" DEFAULT NULL::character varying NOT NULL,
"grade" varchar(16) COLLATE "default" DEFAULT 0,
"deleted" bool DEFAULT false,
"flag_id" int4,
"channel" varchar(20) COLLATE "default" DEFAULT 'cncloud'::character varying,
"created" timestamptz(0) DEFAULT now(),
"updated" timestamptz(0) DEFAULT now(),

CONSTRAINT "tb_class_collection_pkey" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE)
;

COMMENT ON TABLE "public"."tb_class_collection" IS '课程集信息';

COMMENT ON COLUMN "public"."tb_class_collection"."grade" IS '0为普通，1为新手，2为大咖专场';

drop table if exists tb_class_info;
CREATE TABLE "public"."tb_class_info" (
"id" serial4 NOT NULL,
"status" int2 DEFAULT 1,
"title" varchar(100) COLLATE "default",
"free" bool,
"price" int4,
"descript" text COLLATE "default",
"apply_num" int4,
"store_num" int4,
"flag_id" int4,
"collection_id" int4,
"isTop" bool,
"pic_url" varchar(255) COLLATE "default",
"vedio1_url" varchar(255) COLLATE "default",
"vedio2_url" varchar(255) COLLATE "default",
"score" float4,
"teacher_id" int4,
"created" timestamptz(0) DEFAULT now(),
"updated" timestamptz(0) DEFAULT now(),
"channel" varchar(20) COLLATE "default" DEFAULT 'cncloud'::character varying,
CONSTRAINT "tb_class_info_pkey" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE)
;

COMMENT ON COLUMN "public"."tb_class_info"."status" IS '1：正常 2.下架';

COMMENT ON COLUMN "public"."tb_class_info"."title" IS '视频标题';

COMMENT ON COLUMN "public"."tb_class_info"."free" IS '是否免费';

COMMENT ON COLUMN "public"."tb_class_info"."price" IS '课程价格';

COMMENT ON COLUMN "public"."tb_class_info"."descript" IS '课程描述';

COMMENT ON COLUMN "public"."tb_class_info"."apply_num" IS '购买量';

COMMENT ON COLUMN "public"."tb_class_info"."store_num" IS '收藏量';

COMMENT ON COLUMN "public"."tb_class_info"."flag_id" IS '标签';

COMMENT ON COLUMN "public"."tb_class_info"."collection_id" IS '视频集';

COMMENT ON COLUMN "public"."tb_class_info"."isTop" IS '是否置顶';

COMMENT ON COLUMN "public"."tb_class_info"."pic_url" IS '视频封面图';

COMMENT ON COLUMN "public"."tb_class_info"."vedio1_url" IS '试看视频';

COMMENT ON COLUMN "public"."tb_class_info"."vedio2_url" IS '整个视频';

COMMENT ON COLUMN "public"."tb_class_info"."score" IS '课程得分';

COMMENT ON COLUMN "public"."tb_class_info"."teacher_id" IS '教师id';

COMMENT ON COLUMN "public"."tb_class_info"."channel" IS '所属渠道';


drop table if exists tb_flag;
CREATE TABLE "public"."tb_flag" (
"id" serial4 NOT NULL,
"name" varchar(20) COLLATE "default",
"status" int2 DEFAULT 0,
"sequence" int2 NOT NULL,
"created" timestamptz(0) DEFAULT now(),
"updated" timestamptz(0) DEFAULT now(),
CONSTRAINT "tb_flag_pkey" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE)
;
ALTER SEQUENCE tb_flag_id_seq RESTART WITH 100;

COMMENT ON COLUMN "public"."tb_flag"."id" IS '从100开始自增，为了slideshow 表的id类型统一';

COMMENT ON COLUMN "public"."tb_flag"."name" IS '标签名';

COMMENT ON COLUMN "public"."tb_flag"."status" IS '0:正常 1：下架';

COMMENT ON COLUMN "public"."tb_flag"."sequence" IS '序号，大优先极高';


drop table if exists tb_order;

CREATE TABLE "public"."tb_order" (
"id" serial4 not null,
"order_id" varchar(30) COLLATE "default" NOT NULL,
"user_id" varchar(32) COLLATE "default",
"class_id" int4,
"price" int4,
"payment" int4,
"status" int2,
"channe" varchar(20) COLLATE "default",
"coupon_id" varchar(50) COLLATE "default",
"discount" int4,
"created" timestamptz(0) DEFAULT now(),
"updated" timestamptz(0) DEFAULT now(),
"pay_type" int2,
CONSTRAINT "tb_order_pkey" PRIMARY KEY ("order_id")
)
WITH (OIDS=FALSE)
;

COMMENT ON COLUMN "public"."tb_order"."class_id" IS '课程id';

COMMENT ON COLUMN "public"."tb_order"."price" IS '订单价格';

COMMENT ON COLUMN "public"."tb_order"."payment" IS '实际支付金额';

COMMENT ON COLUMN "public"."tb_order"."status" IS '0:未支付1：支付成功 2：支付失败';

COMMENT ON COLUMN "public"."tb_order"."channe" IS '渠道';

COMMENT ON COLUMN "public"."tb_order"."coupon_id" IS '优惠券id';

COMMENT ON COLUMN "public"."tb_order"."discount" IS '优惠金额';

COMMENT ON COLUMN "public"."tb_order"."pay_type" IS '支付方式';
--tb_slideshow
drop table if exists tb_slideshow;
CREATE TABLE "public"."tb_slideshow" (
"flag_id" int4 NOT NULL,
"status" bool DEFAULT true,
"pic_url" varchar(200) COLLATE "default",
"url" varchar(200) COLLATE "default",
"title" varchar(255) COLLATE "default",
"created" timestamptz(0) DEFAULT now(),
"updated" timestamptz(0) DEFAULT now(),
CONSTRAINT "tb_slideshow_pkey" PRIMARY KEY ("flag_id")
)
WITH (OIDS=FALSE)
;

COMMENT ON COLUMN "public"."tb_slideshow"."flag_id" IS '标签id,1为新手入门，2为大咖专场';

COMMENT ON COLUMN "public"."tb_slideshow"."status" IS '是否上架';

drop table if exists tb_teacher;
CREATE TABLE "public"."tb_teacher" (
"id" serial4 NOT NULL,
"name" varchar(20) COLLATE "default",
"class_num" int4,
"stu_num" int4,
"description" varchar(1000) COLLATE "default",
"photo_url" varchar(255) COLLATE "default",
"channel" varchar(200) COLLATE "default",
CONSTRAINT "tb_teacher_pkey" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE)
;


COMMENT ON COLUMN "public"."tb_teacher"."name" IS '教师名';

COMMENT ON COLUMN "public"."tb_teacher"."class_num" IS '课程数';

COMMENT ON COLUMN "public"."tb_teacher"."stu_num" IS '收藏和购买总人数';

COMMENT ON COLUMN "public"."tb_teacher"."description" IS '介绍';

COMMENT ON COLUMN "public"."tb_teacher"."photo_url" IS '头像';

drop table if exists tb_user_class;
CREATE TABLE "public"."tb_user_class" (
"user_id" varchar(30) COLLATE "default" NOT NULL,
"class_id" int4 NOT NULL,
"channel" varchar(200) COLLATE "default",
"payed" bool,
"type" int2,
"price" int4,
"created" timestamptz(0) DEFAULT now(),
"updated" timestamptz(0) DEFAULT now()
)
WITH (OIDS=FALSE)
;

COMMENT ON COLUMN "public"."tb_user_class"."payed" IS '是否购买';

COMMENT ON COLUMN "public"."tb_user_class"."type" IS '0:收藏记录 1：报名记录';

drop table if exists tb_user_discuss;
CREATE TABLE "public"."tb_user_discuss" (
"user_id" varchar(30) COLLATE "default" NOT NULL,
"class_id" int4 NOT NULL,
"score" int2,
"discuss" text COLLATE "default",
"create" timestamptz(6) DEFAULT now()
)
WITH (OIDS=FALSE)
;

COMMENT ON COLUMN "public"."tb_user_discuss"."score" IS '得分';

COMMENT ON COLUMN "public"."tb_user_discuss"."discuss" IS '建议内容';

drop table if exists tb_user_serggest;
create table "public"."tb_user_serggest"(
	"user_id" VARCHAR(30) COLLATE "default" not null,
	"nick" VARCHAR(30) COLLATE "default" ,
	"phone" VARCHAR(20) COLLATE "default",
	"content" TEXT COLLATE "default"
)
WITH (OIDS=FALSE);

drop table if exists tb_user_info;
CREATE TABLE "public"."tb_user_info" (
"user_id" varchar(30) COLLATE "default" NOT NULL,
"account" varchar(50) COLLATE "default",
"pwd" varchar(255) COLLATE "default",
"nick" varchar(255) COLLATE "default",
"channel" varchar(255) COLLATE "default",
"phone" varchar(20) COLLATE "default",
"picture_ulr" varchar(255) COLLATE "default",
"created" timestamptz(0),
"updated" timestamptz(0),
CONSTRAINT "tb_user_info_pkey" PRIMARY KEY ("user_id")
)
WITH (OIDS=FALSE)
;


COMMENT ON COLUMN "public"."tb_user_info"."user_id" IS '根据channel生成唯一id';

COMMENT ON COLUMN "public"."tb_user_info"."account" IS '用户名';

COMMENT ON COLUMN "public"."tb_user_info"."phone" IS '手机号，一个手机号对应多个userid';


drop table if exists tb_user_third;

CREATE TABLE "public"."tb_user_third" (
"id" serial4 NOT NULL,
"user_id" varchar(30) COLLATE "default" NOT NULL,
"third_token" varchar(200) COLLATE "default",
"type" int2,
"channel" varchar(20) COLLATE "default",
"created" timestamptz(0),
"updated" timestamptz(0),
CONSTRAINT "tb_user_third_pkey" PRIMARY KEY ("id")
)
WITH (OIDS=FALSE)
;


