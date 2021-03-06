package com.forsrc.core.web.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.forsrc.core.base.dao.impl.BaseDaoImpl;
import com.forsrc.core.web.user.dao.UserRoleDao;
import com.forsrc.core.web.user.dao.mapper.UserRoleMapper;
import com.forsrc.pojo.UserRole;

@Repository
public class UserRoleDaoImpl extends BaseDaoImpl<UserRole, Long> implements UserRoleDao {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public Class<UserRole> getEntityClass() {
        return UserRole.class;
    }

    @Override
    public List<UserRole> findByUserId(Long userId) {
        //Query query = entityManager.createNamedQuery("sql_user_role_findByUserId", getEntityClass());
        //query.setParameter("userId", userId);
        //return query.getResultList();
        return this.userRoleMapper.findByUserId(userId);
    }
}
