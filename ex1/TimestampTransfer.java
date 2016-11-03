package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//new一个scanner的输入变量
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//自定义时间的输入
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//自定义时间的输出
		while (scanner.hasNext()){
			String line = scanner.nextLine();//读取输入数据，将值传给line
			Date lineDate = null;//初始化Data,并附空值
			long lineTimestamp;//定义一个整形的时间戳
			try {
				lineDate = inputFormat.parse(line);//解析line日期字符串，并赋值给linedate
				lineTimestamp = lineDate.getTime();//格式转换成时间戳
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);//输出形式
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//打印异常信息
			}
		}
	}
}
