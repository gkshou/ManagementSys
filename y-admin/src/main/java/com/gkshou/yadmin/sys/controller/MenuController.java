package com.gkshou.yadmin.sys.controller;

import com.gkshou.yadmin.common.vo.Result;
import com.gkshou.yadmin.sys.entity.Menu;
import com.gkshou.yadmin.sys.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gukang
 * @since 2023-04-07
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService menuService;


    @ApiOperation("查询所有菜单数据")
    @GetMapping
    public Result<List<Menu>> getAllMenu(){

        List<Menu> menuList = menuService.getAllMenu();

        return Result.success(menuList);
    }
}
