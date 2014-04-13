package com.Ix.ShutUp;
import com.badlogic.gdx.utils.Array;

public class LogLine {
	private String date;
	private String time;
	private float value1;
	private float value2;
	private float value3;
	private float value4;
	private float value5;
	private float value6;
	private float value7;
	private float value8;
	private float value9;
	private float value10;
	private float value11;
	private float value12;
	private float value13;
	private float value14;
	
	public LogLine(String date, String time, Array<Float> values)
	{
		for(int i = 0; i < values.size; i++)
		{
			switch(i)
			{
			case 1:
				value1 = values.get(i);
				break;
			case 2:
				value2 = values.get(i);
				break;
			case 3:
				value3 = values.get(i);
				break;
			case 4:
				value4 = values.get(i);
				break;
			case 5:
				value5 = values.get(i);
				break;
			case 6:
				value6 = values.get(i);
				break;
			case 7:
				value7 = values.get(i);
				break;
			case 8:
				value8 = values.get(i);
				break;
			case 9:
				value9 = values.get(i);
				break;
			case 10:
				value10 = values.get(i);
				break;
			case 11:
				value11 = values.get(i);
				break;
			case 12:
				value12 = values.get(i);
				break;
			case 13:
				value13 = values.get(i);
				break;
			case 14:
				value14 = values.get(i);
				break;
			}
		}
	}
	
	public String toString()
	{
		return date +  " " + time + " " + value1 + " " + value2 + " " + value3 + " " + value4 + " " + value5 + " " + value6 + " " + value7 + " " + value8 + " " + value9 + " " + value10 + " " + value11 + " " + value12 + " " + value13 + " " + value14;
	}
	
	public float getNoice()
	{
		return value2;
	}
}