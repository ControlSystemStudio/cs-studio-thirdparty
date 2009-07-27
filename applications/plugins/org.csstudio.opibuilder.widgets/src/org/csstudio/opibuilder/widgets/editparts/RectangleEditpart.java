package org.csstudio.opibuilder.widgets.editparts;

import org.csstudio.opibuilder.editparts.AbstractWidgetEditPart;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;

public class RectangleEditpart extends AbstractWidgetEditPart {

	
	@Override
	protected IFigure createFigure() {
		IFigure figure = new RectangleFigure();
		return figure;
	}	
	

	@Override
	protected void registerPropertyChangeHandlers() {

	}


}
