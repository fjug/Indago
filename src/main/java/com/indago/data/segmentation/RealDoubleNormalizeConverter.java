/**
 *
 */
package com.indago.data.segmentation;

import net.imglib2.converter.Converter;
import net.imglib2.type.numeric.RealType;
import net.imglib2.type.numeric.real.DoubleType;
import net.imglib2.type.numeric.real.FloatType;

/**
 * Converts any {@link RealType} to a {@link FloatType} and divides by the
 * given number.
 * 
 * If the input type is complex, it loses the imaginary part without complaining
 * further.
 * 
 * @author Jug
 */
public class RealDoubleNormalizeConverter< R extends RealType< R > > implements Converter< R, DoubleType > {

	double num;

	public RealDoubleNormalizeConverter( final double num ) {
		this.num = num;
	}

	@Override
	public void convert( final R input, final DoubleType output ) {
		output.set( input.getRealFloat() / num );
	}
}
