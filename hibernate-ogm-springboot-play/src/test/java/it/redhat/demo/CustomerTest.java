package it.redhat.demo;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {

	@Autowired
	private CustomerNoSQLRepository repo;

	@Test
	public void gogogo() {
		List<Customer> all = repo.findAll();
		assertEquals( Collections.emptyList(), all );
	}

}
