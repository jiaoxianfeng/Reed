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

