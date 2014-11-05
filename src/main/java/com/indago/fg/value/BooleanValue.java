/**
 * 
 */
package com.indago.fg.value;

import com.indago.fg.domain.BooleanDomain;

/**
 * @author jug
 */
public class BooleanValue implements Value< Boolean, BooleanDomain > {

	private final BooleanDomain domain;
	private Boolean value;

	public BooleanValue( final Boolean value ) {
		this.domain = new BooleanDomain();
		this.value = value;
	}

	/**
	 * @see com.indago.fg.util.Typed#getType()
	 */
	@Override
	public BooleanDomain getType() {
		return domain;
	}

	/**
	 * @see com.indago.fg.value.Value#get()
	 */
	@Override
	public Boolean get() {
		return value;
	}

	/**
	 * @see com.indago.fg.value.Value#getAsIndex()
	 */
	@Override
	public int getAsIndex() {
		return ( value.booleanValue() ) ? 1 : 0;
	}

	/**
	 * @see com.indago.fg.value.Value#set()
	 */
	@Override
	public void set( final Boolean value ) {
		this.value = value;
	}

	/**
	 * @see com.indago.fg.value.Value#setAsIndex(int)
	 */
	@Override
	public void setAsIndex( final int index ) {
		if ( index == 1 ) {
			this.set( Boolean.TRUE );
		} else {
			this.set( Boolean.FALSE );
		}
	}

}