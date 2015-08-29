/*
 * Copyright (C) 2015 WrightArchitectural
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package markup;

/**
 *
 * @author WrightArchitectural
 */
public class LineItem {
    // Declare instance variables
    private double liInitialValue;
    private double percentValue;
    private double multiplier;
    private double markValue;
    private double liMarked;
    
    // Default constructor
    public LineItem()
    {
        liInitialValue = 0.0;
        percentValue = 0.0;
        multiplier = 0.0;
        markValue = 0.0;
        liMarked = 0.0;
    }
    
    // Overloaded constructor
    public LineItem( double olLIInitialValue, double olPercentValue )
    {
        setLIInitialValue( olLIInitialValue );
        setPercentValue( olPercentValue );
    }
    
    // Accessor methods
    public double getLIInitialValue()
    {
        return liInitialValue;
    }
    
    public double getPercentValue()
    {
        return percentValue;
    }
    
    public double getMultiplier()
    {
        return multiplier;
    }
    
    public double getMarkValue()
    {
        return markValue;
    }
    
    public double getLIMarked()
    {
        return liMarked;
    }
    
    // Mutator methods
    public void setLIInitialValue( double newLIInitialValue )
    {
        liInitialValue = newLIInitialValue;
    }
    
    public void setPercentValue( double newPercentValue )
    {
        percentValue = newPercentValue;
    }
    
    public void setMultiplier( double newMultiplier )
    {
        multiplier = newMultiplier;
    }
    
    public void setMarkValue( double newMarkValue )
    {
        markValue = newMarkValue;
    }
    
    public void setLIMarked( double newLIMarked )
    {
        liMarked = newLIMarked;
    }
    
    // toString() method

    /**
     *
     * @return
     */
        @Override
    public String toString()
    {
        return "Line item initial value: " + getLIInitialValue()
                + "; Percent value: " + getPercentValue()
                + "; Multiplier: " + getMultiplier()
                + "; Mark up amount: " + getMarkValue()
                + "; Marked line item: " + getLIMarked();
    }
    
    // Calc method
    public double markupCalc()
    {
        multiplier = percentValue / 100;
        markValue = liInitialValue * multiplier;
        liMarked = markValue + liInitialValue;
        
        return liMarked;
    }
}
