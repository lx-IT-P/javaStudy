package com.snbc.timer.zouye;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className QuartzJobBean.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月31日 上午8:53:36
 * @version V1.0
 * @copyright SNBC 2019
 */
@Configuration
public class QuartzConfig {
	@Bean
	public JobDetail teatQuartzDetail() {
		return JobBuilder.newJob(TestQuartz.class).withIdentity("testQuartz").storeDurably().build();
	}

	@Bean
	public Trigger testQuartzTrigger() {
		SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10) // 设置时间周期单位秒
				.repeatForever();
		CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 27 17 * * ?");
		return TriggerBuilder.newTrigger().forJob(teatQuartzDetail()).withIdentity("testQuartz")
				.withSchedule(cronScheduleBuilder).build();
	}
}

