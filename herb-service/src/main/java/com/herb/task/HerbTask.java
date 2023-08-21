package com.herb.task;

import com.herb.service.PriceService;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

public class HerbTask {

    @Resource
    private PriceService priceService;

    /**
     * 每天凌晨执行一次
     */
    @Scheduled(cron = "0 0 1 * * ?")
    public void priceSave() {
        priceService.save();
    }
}
