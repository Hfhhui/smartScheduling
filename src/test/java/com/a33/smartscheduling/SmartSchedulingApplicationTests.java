package com.a33.smartscheduling;

import com.a33.smartscheduling.sys.entity.Emp;
import com.a33.smartscheduling.sys.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SmartSchedulingApplicationTests {

    @Resource
    private EmpMapper empMapper;

    @Test
    void contextLoads() {
        List<Emp> emps = empMapper.selectList(null);
        emps.forEach(System.out::println);
    }


}
