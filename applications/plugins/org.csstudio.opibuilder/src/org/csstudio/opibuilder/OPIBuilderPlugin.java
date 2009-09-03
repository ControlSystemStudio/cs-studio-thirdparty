package org.csstudio.opibuilder;

import org.csstudio.opibuilder.script.ScriptService;
import org.csstudio.opibuilder.util.ResourceUtil;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class OPIBuilderPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.csstudio.opibuilder";
	
	/**
	 * The ID of the widget extension point.
	 */
	public static final String EXTPOINT_WIDGET = PLUGIN_ID + ".widget"; //$NON-NLS-1$
	
	
	public static final String OPI_FILE_EXTENSION = "opi";

	// The shared instance
	private static OPIBuilderPlugin plugin;
	
	
	/**
	 * The constructor
	 */
	public OPIBuilderPlugin() {
		plugin = this;
	}



	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OPIBuilderPlugin getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ScriptService.getInstance();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		ScriptService.getInstance().exit();
		ResourceUtil.disposeResources();
		
	}


}
