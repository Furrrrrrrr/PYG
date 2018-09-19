package com.pyg.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pyg.manager.service.BrandService;
import com.pyg.mapper.BrandMapper;
import com.pyg.pojo.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;


    @Override
    public List<TbBrand> findAll() {
        return brandMapper.findAll();
    }
}
