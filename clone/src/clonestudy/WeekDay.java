package clonestudy;

/**
 * @className WeekDay.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月7日 上午8:35:23
 * @version V1.0
 * @copyright SNBC 2011
 */
public class WeekDay{
public static void main(String[] args) {
	Day day = Day.FRI;
	String day1 = day.getInfo();
	System.out.println(day1);
	}
}
enum Day {
	MON {

		@Override
		public String getInfo() {

			return "星期一";
		}

	},
	TUE {
		@Override
		public String getInfo() {

			return "星期二";
		}
	},
	WED {
		@Override
		public String getInfo() {

			return "星期三";
		}
	},
	THU {
		@Override
		public String getInfo() {

			return "星期四";
		}
	},
	FRI {
		@Override
		public String getInfo() {

			return "星期五";
		}
	},
	SAT {
		@Override
		public String getInfo() {

			return "星期六";
		}
	},
	SUN {
		@Override
		public String getInfo() {

			return "星期天";
		}
	};

	public abstract String getInfo();
}
