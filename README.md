# iMooc

## 技术栈
### 前端
+ vue.js前端组件
+ ElementUI组件模板
+ axios前后端通信

### 后端：
+ Springboot
+ Mybatis 数据持久层
+ Mybatis Generator 逆向工程pojo和mapper

## todo:
- [x] 数据库设计
- [x] 登录和拦截（前端+后端）
- [ ] 学生线的前端组件+后端业务
- [ ] 教师线的前端+后端

## 解决问题：
1. 用户（权限分为教师、学生、管理员）的表如何划分？
+ 解决：
  + 分为四张表：user、student、teacher、admin
  + user表的主键id作为外键给其他表作主键
  + 因为user表(id\pwd\role)只用于登录模块，student和teacher同构，用于修改展示具体用户信息。


## 开发进度
6.3 建库，登录模块  
6.2 确认技术选型，弃用generator  
5.50-6.1 需求分析，前端模型和数据库大致设计

