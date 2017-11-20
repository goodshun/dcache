package com.lds.dcache.service;

import java.util.List;

public interface EhcacheService<T> {
    /**
     * 使用ID查询用户
     *
     * @param id
     * @return
     */
    public T findUserById(long id);

    /**
     * 查询所有用户
     *
     * @return
     */
    public List<T> findAllUser();


    /**
     * 更新或新增用户信息
     *
     * @param user
     */
    public void saveAndFlush(T user);

    /**
     * 通过ID删除一个用户
     *
     * @param id
     */
    public void deleteUserById(long id);
}
