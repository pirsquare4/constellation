package constellation.thirdparty.formats.iges.processors.x100;

import constellation.model.GeometricModel;
import constellation.model.formats.ModelFormatException;
import constellation.thirdparty.formats.iges.IGESModel;
import constellation.thirdparty.formats.iges.elements.IGES_D;
import constellation.thirdparty.formats.iges.elements.IGES_P;
import constellation.thirdparty.formats.iges.entities.IGESEntity;
import constellation.thirdparty.formats.iges.entities.IGESFauxEntity;
import constellation.thirdparty.formats.iges.processors.IGESAbstractEntityProcessor;

/** 
 * Represents an IGES Parametric Spline Curve
 * @author lawrence.daniels@gmail.com
 */
public class IGES112_ParametricSplineCurveProcessor extends IGESAbstractEntityProcessor {
	
	/** 
	 * {@inheritDoc}
	 */
	public IGESEntity evaluate( final GeometricModel cxModel, IGESModel igesModel, final IGES_D entry, final IGES_P params ) 
	throws ModelFormatException {
		logger.info( String.format( "Parametric Spline Curve: params = %s", params.toString() ) );
		// TODO implement this function
		return new IGESFauxEntity();
	}

}