package com.snbc.timer.zouye;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @className TestQuartz.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月31日 上午8:52:01
 * @version V1.0
 * @copyright SNBC 2019
 */

public class TestQuartz extends QuartzJobBean {
    /**
     * 执行定时任务
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("quartz task "+new Date());
    }
}

