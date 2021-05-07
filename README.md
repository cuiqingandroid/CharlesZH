本工程通过修改字节码实现charles汉化，由于Charles原生没有语言包，所有的语言都在字节码的常量。

汉化步骤

## 1. 下载代码
`git@github.com:cuiqingandroid/CharlesTranslator.git`

## 2. 生成对应版本的字节码和资源文件
2.1 修改Main函数里的版本号、版本保存路径和原始charles.jar路径（建议拷贝charles目录文件到此工程）
2.2 运行Main里面的main方法，生成对应的字节码和资源文件

## 3 重打包charles.jar
使用命令
```
cd version
jar -uvf origin_charles.jar .
```

## 4. 替换charles.jar
替换charles安装目录下lib里面的charles为刚刚的`origin_charles.jar`

**注意：**
1. 在替换charles.jar之前，做好备份，以免打不开
2. 本项目只做charles汉化，不包含破解，还请支持正版，[购买连接](https://www.charlesproxy.com/buy/)

# TODO
- [ ] 汉化所有英文
- [ ] 所有中文修改使用`javassist`修改
- [ ] 支持多语言
- [ ] 支持语言切换
- [ ] 支持插件开发