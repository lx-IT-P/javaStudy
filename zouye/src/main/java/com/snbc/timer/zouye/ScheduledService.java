package com.snbc.timer.zouye;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @className TimerTask.java
 * @funciton  timer实现定时任务
 * @author liuxiang2
 * @CreatedTime: 2019年8月29日 下午1:16:26
 * @version V1.0
 * @copyright SNBC 2019
 */
@Slf4j
@Component
public class ScheduledService {

private Logger log = LoggerFactory.getLogger(ScheduledService.class);

    @Scheduled(cron = "0/5 * * * * *")
    public void scheduled(){
        log.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
    @Scheduled(fixedRate = 5000)
    public void scheduled1() {
        log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
    }
    @Scheduled(fixedDelay = 5000)
    public void scheduled2() {
        log.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
    }
}

