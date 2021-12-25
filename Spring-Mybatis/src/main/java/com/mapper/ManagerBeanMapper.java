package com.mapper;

import com.bean.ManagerBean;
import com.bean.ManagerBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerBeanMapper {
    int countByExample(ManagerBeanExample example);

    int deleteByExample(ManagerBeanExample example);

    int deleteByPrimaryKey(String managerid);

    int insert(ManagerBean record);

    int insertSelective(ManagerBean record);

    List<ManagerBean> selectByExample(ManagerBeanExample example);

    ManagerBean selectByPrimaryKey(String managerid);

    int updateByExampleSelective(@Param("record") ManagerBean record, @Param("example") ManagerBeanExample example);

    int updateByExample(@Param("record") ManagerBean record, @Param("example") ManagerBeanExample example);

    int updateByPrimaryKeySelective(ManagerBean record);

    int updateByPrimaryKey(ManagerBean record);
}