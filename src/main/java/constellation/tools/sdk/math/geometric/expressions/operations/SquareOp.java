package constellation.tools.sdk.math.geometric.expressions.operations;

import constellation.tools.sdk.math.geometric.expressions.Scope;
import constellation.tools.sdk.math.geometric.expressions.ValueReference;

/**
 * Square Function
 * @author lawrence.daniels@gmail.com
 */
public class SquareOp implements ValueReference {
	private final ValueReference argument;
	
	/** 
	 * Creates a new Square function instance
	 * @param argument the given function {@link ValueReference argument}
	 */
	public SquareOp( final ValueReference argument ) {
		this.argument = argument;
	}

	/* 
	 * (non-Javadoc)
	 * @see constellation.math.geometric.equations.ValueReference#evaluate(constellation.math.geometric.equations.EquationContext)
	 */
	public Double evaluate( final Scope scope ) {
		// evaluate the value reference
		final Double value = argument.evaluate( scope );
		
		// evaluate the square
		return ( value != null ) ? Math.sqrt( value ) : null;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return String.format( "(%s)^2", argument );
	}

}