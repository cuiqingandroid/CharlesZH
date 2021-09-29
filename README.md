本工程通过修改字节码实现charles汉化，目前最新的Charles仅部分支持语言包，所以大部分汉化工作都是通过直接修改字节码实现。



汉化步骤

## 1. 依赖环境
`JRE11`及以上

## 2. 运行
使用命令`java -jar charlesZh.jar`或双击`charlesZh.jar`

## 3. 替换charles.jar
替换charles安装目录下lib里面的charles为刚刚的`origin_charles.jar`

## 4. 已知问题
1. 会影响charles web服务

**注意：**
1. 在替换charles.jar之前，做好备份，以免打不开
2. 本项目只做charles汉化，不包含破解，还请支持正版，[购买连接](https://www.charlesproxy.com/buy/)

# TODO
- [ ] 支持多语言
- [ ] 支持语言切换
- [ ] 支持插件开发