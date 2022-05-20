package com.example.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.business.mapper.RouteMapper;
import com.example.business.service.RouteService;
import com.example.core.model.business.Route;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl extends ServiceImpl<RouteMapper,Route> implements RouteService {
}
