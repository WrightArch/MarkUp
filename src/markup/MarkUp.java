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

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author WrightArchitectural
 */
public class MarkUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare, instanciate LineItem object & variables
        LineItem li0;
        double initialValue;
        double percent;
        
        // Formating objects
        DecimalFormat currencyFormat = new DecimalFormat( "$ #,#00.00" );
        
        // CL inputs
        Scanner scan = new Scanner( System.in );
        System.out.println( "Line Item MarkUp Utility" );
        System.out.println( "--------------------------------------" );
        
        System.out.println( "Please enter initial line item cost > " );
        initialValue = scan.nextDouble();
        System.out.println( "Line initial value: " + currencyFormat.format( initialValue ) );
        
        System.out.println( "Please enter percent markup > " );
        percent = scan.nextDouble();
        System.out.println( "Percent markup: " + percent + " %");
        
        // Applciation logic
        li0 = new LineItem( initialValue, percent );
        li0.markupCalc();
        
        // CL outputs
        System.out.println( "--------------------------------------" );
        System.out.println( "Line item marked: " + currencyFormat.format( li0.getLIMarked() ) );

    }
    
}
