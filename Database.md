# 数据库使用MongoDB

## 游客(Visitor)

* 游客编号(id)               ObjectId


## 注册用户(User)

* 注册用户编号(id)           ObjectId
* 账号(account)              String
* 密码(password)             String
* 昵称(username)             String
* 自我介绍(introduction)     String
* 注册时间(joinTime)         Date
* 性别(gender) 				 String
* 头像(profilePicture)       GridFS(备选)


##   书籍(Book)

- 书名(bookName)             String
- 作者(author)               String
- 出版社(publisher)          String
- 出品人(chupin)             String
- 副标题(subtitle)           String
- 原标题(originalTitle)      String
- 出版日期(publishingYear)   Date
- isbn(ISBN)                 String
- 价格(price)                String
- 译者(translator)           String


## 帖子(Posting)

* 帖子编号(id)               ObjectId
* 标题(title)                String
* 作者账户(account)          String
* 内容(cnotent)              String
* 发布时间(postTime)         Date


## 赞(Like)

* 赞编号(id) 				 ObjectId
* 点赞者账户(account) 		 String
* 被点赞帖子编号(postingId)  String
* 点赞时间(likeTime) 		 Date

## 电影

```
 电影id  id;          String    
 电影名  filmName;    String    
 导演    director;    String  
 编剧    screenplay;  String
 演员    starring;    String
 电影类型 type;        String
 出品地区 region;      String
 语言    language;    String
 上映日期 date;        String
 电影长度 length;      String
 又名    AKA;         String
 简介    intro;       String
 评分    score;       int[5]
```

## 音乐

```
 音乐id   id;         String
 表演者   performers;   String
 音乐名   musicName;   String
 类型     type;   String
 体裁     genre;  String
 出品日期  date;  String
 音乐     num;   int
 专辑序列号 barCode;   String
 简介      intro;   String
 专辑条目   trackes;   String
 评分      score;  int[5]
```

## 评论

```
评论ID    ObjectId id;  
发布人Id  String replyerId; 
内容      String content;
发布日期   Date date;
发布板块Id String placeId;  //发布的Id，可以是书籍，影音 ，帖子，音乐
```

## 组队(Team)

* 组队编号(id) 	             ObjectId
* 团队成员账户(account)      String
* 团队成员权限(power)        String
* 团队创建时间(createTime)   Date
