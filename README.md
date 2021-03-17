本工程通过修改字节码实现charles汉化，由于Charles原生没有语言包，所有的语言都在字节码的常量。

汉化步骤

## Step1
下载代码`git@github.com:cuiqingandroid/CharlesTranslator.git`

## Step2
找到对应Charles版本目录字节码文件

## Step3
使用压缩软件打开Charles安装目录的charles.jar,使用工程里的.class文件替换对应的class文件，替换Charles安装目录的charles.jar，重新打包Charles

**注意：**
1. 在替换charles.jar之前，做好备份，以免打不开
2. 本项目只做charles汉化，不包含破解，还请支持正版，[购买连接](https://www.charlesproxy.com/buy/)