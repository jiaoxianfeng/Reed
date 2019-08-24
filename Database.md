# 数据库使用MongoDB

## 游客(Visitor)

* 游客编号(Id)               64-bit Integer


## 注册用户(User)

* 注册用户编号(Id)           64-bit Integer
* 账号(Account)              String
* 密码(Password)             String
* 昵称(UserName)             String
* 自我介绍(SelfIntroduction) String
* 注册时间(JoinTime)         Timestamp
* 头像(ProfilePicture)       GridFS(备选) 

##   书籍(Book)

- 书名(bookName)     String
- 作者(author)     String
- 出版社(publisher)     String
- 出品人(chupin)     String
- 副标题(subtitle)     String
- 原标题(originalTitle)     String
- 出版日期(publishingYear)     Date
- isbn(ISBN)     String
- 价格(price)     String
- 译者(translator)     String