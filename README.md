# javaStudy
java基础学习
#git提交步骤
1.新建一个本地仓库，其实也就是新建一个文件夹。最简单的创建方式就是直接在桌面鼠标右键，新建文件夹(test)，然后进去该文件夹。鼠标右键，打开git -> Git Bash Here -> git init。执行命令后目录下创建一个.git文件夹。

git init
2.既然待添加，下一步自然就是添加了，如何添加，git add + 需要添加的文件名 或者git add --all 将所有的文件全部添加，我这里是git add test.txt，然后再次git status 查看状态，可以发现test.txt变成了绿色，这时候文件就已经添加到本地仓库了

git add test.txt
3.添加之后，最后提交就行，git commit -m “修改说明”。-m后面添加的是对本次操作的说明，加入你修改了代码或者重新上传了什么东西都做个简单说明，别人看了就知道是怎么回事了。然后再次git status查看状态，如下，已经添加成功：

git commit -m "第一次提交"
4.git remote add origin git@github com:leiphp/awesome-python3-webapp.git
5.执行完后，如果没有异常，等待执行完就上传成功了，中间可能会让你输入Username和Password，你只要输入github的账号和密码就行了。但是在这一步很多人执行会报错，报类似failed to push some refs to......的错误，那是因为本地代码目录缺失README.md文件。我们只需要先

通过如下命令进行代码合并【注：pull=fetch+merge]

git pull --rebase origin master

6.此时再执行语句 git push -u origin master即可完成代码上传到github

git push -u origin master
