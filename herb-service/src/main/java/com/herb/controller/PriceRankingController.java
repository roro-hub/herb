package com.herb.controller;

import com.herb.common.api.CommonResult;
import com.herb.mbg.model.PriceRanking;
import com.herb.service.PriceRankingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "PriceRankingController", value = "价格浮动信息")
@RequestMapping("/priceRanking")
public class PriceRankingController {

    @Resource
    private PriceRankingService priceRankingService;

    @ApiOperation("今日价格浮动数据")
    @PostMapping("/today")
    @ResponseBody
    public CommonResult<List<PriceRanking>> today(@RequestParam(value = "names", required = false) List<String> names) {
        List<PriceRanking> list = priceRankingService.today(names);
        return CommonResult.success(list);
    }
}
