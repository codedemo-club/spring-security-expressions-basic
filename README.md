# spring-security-expressions-basic
http://www.codedemo.club/spring-security-expressions-basic/
# 使用说明
大部分方法的验证放在了单元测试部分。验证功能时请查看单元测试相关代码。

## 内置用户
系统内置了两个用户：
用户名: admin  密码：admin 角色：ADMIN
用户名：user 密码：user 角色：USER

## 注意事项
测试http请求建议使用专门的http请求工具：idea自带的有Http Client或Http Request，或者第三方如postman，或者使用curl等命令行工具。

不推荐使用浏览器进行测试：由于浏览器再刷新时会自动记忆认证的头信息，所以一旦用户登录成功，便**无法退出或切换用户**
如果你习惯了浏览器测试，那么临时的解决方法是：1. 退出再重新打开浏览器。2. 重新启动后台应用。

