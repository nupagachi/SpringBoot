package com.example.demo;

import com.example.demo.controller.SinhVienCtrl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author pc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    SinhVienCtrl ctrl;
	@Test
	public void contextLoads() {
            ctrl.getAll();
	}

}
