package com.pyg.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pyg.manager.service.BrandService;
import com.pyg.pojo.TbBrand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controller + ResponseBody + RESTFUL
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference(timeout = 100000000,retries = 2)
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        List<TbBrand> list = brandService.findAll();
        return list;
    }

}
