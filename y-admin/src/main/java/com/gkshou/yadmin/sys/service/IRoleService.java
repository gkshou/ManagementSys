package com.gkshou.yadmin.sys.service;

import com.gkshou.yadmin.sys.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gukang
 * @since 2023-04-07
 */
public interface IRoleService extends IService<Role> {

    void addRole(Role role);

    Role getRoleById(Integer id);

    void updateRole(Role role);

    void delectRoleById(Integer id);
}
