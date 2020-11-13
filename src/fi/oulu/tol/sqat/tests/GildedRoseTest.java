package fi.oulu.tol.sqat.tests;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;

@SuppressWarnings("static-access")
public class GildedRoseTest {
	
	@Test
	public void GildedRoseTest_ConstructAndCallMain()
	{
		GildedRose gr = new GildedRose();
		gr.main(null);
	}
	
	@Test
	public void GildedRoseTest_CallUpdateQuality10Times()
	{
		GildedRose gr = new GildedRose();
		gr.main(null);
		for (int i = 0; i < 10; i++)
		{
			gr.updateQuality();
		}
	}
	
	@Test
	public void GildedRoseTestr_CallUpdateQuality15Times()
	{
		GildedRose gr = new GildedRose();
		gr.main(null);
		for (int i = 0; i < 15; i++)
		{
			gr.updateQuality();
		}
	}
}
