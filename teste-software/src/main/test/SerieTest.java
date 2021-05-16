package main.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import main.Serie;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class SerieTest {

	@Test
	void testCompute_serie() {
		ArrayList<Double> response = Serie.compute_serie(1.0f,8.0f,1.0f);
		Assert.assertTrue(response.size() == 8);
	}
}
