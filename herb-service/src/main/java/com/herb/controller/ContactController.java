package com.herb.controller;

import com.herb.mbg.api.CommonPage;
import com.herb.mbg.api.CommonResult;
import com.herb.service.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qianhan on 2021-09-19
 */
@Controller
@Api(tags = "ContactController", value = "客户联系")
@RequestMapping("/contact")
public class ContactController {

    @Resource
    private ContactService contactService;

    @ApiOperation("新增")
    @PostMapping
    @ResponseBody
    public CommonResult<Void> add(@RequestBody Contact contact) {
        contactService.add(contact);
        return CommonResult.success();
    }

    @ApiOperation("分页列表查询")
    @PostMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Contact>> list(@RequestParam(value = "name") String name,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Contact> list = contactService.list(name, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

}
