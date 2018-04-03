package com.nespresso.sofa.recruitment.navalbattles.batteau;

import java.util.Arrays;
import java.util.Comparator;

public final class Ship implements Comparable<Ship>
{
	private final int hull;
	private final int canon;
	private final int mast;
	
	public Ship(int hull, int canon, int mast)
	{
		this.hull = hull;
		this.canon = canon;
		this.mast = mast;
	}
	
	public Ship (Ship[] ships)
	{
		this(Arrays.stream(ships).mapToInt(Ship::getHull).sum(), Arrays.stream(ships).mapToInt(Ship::getCanon).sum(), Arrays.stream(ships).mapToInt(Ship::getMast).sum());
	}
	
	public int getHull()
	{
		return hull;
	}

	public int getCanon()
	{
		return canon;
	}

	public int getMast()
	{
		return mast;
	}

	@Override
	public int compareTo(Ship other)
	{
		return Comparator.comparing(Ship::getCanon).thenComparing(Ship::getHull).thenComparing(Ship::getMast).compare(this, other);
	}
}
