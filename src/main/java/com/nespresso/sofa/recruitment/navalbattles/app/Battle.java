package com.nespresso.sofa.recruitment.navalbattles.app;

import java.util.Arrays;

import com.nespresso.sofa.recruitment.navalbattles.batteau.Ship;

public final class Battle
{
	private Ship[] ships1, ships2;
	
	public Battle side (final Ship... ships)
	{
		ships1 = ships;
		return this;
	}
	
	public Battle against (final Ship... ships)
	{
		ships2 = ships;
		return this;
	}
	
	public boolean isInTheWinningSide (final Ship ship)
	{
		if (new Ship(ships1).compareTo(new Ship(ships2)) >= 0)
		{
			return Arrays.asList(ships1).contains(ship);
		}
		
		return Arrays.asList(ships2).contains(ship);
	}
}
