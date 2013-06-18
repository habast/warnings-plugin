package hudson.plugins.warnings;

import hudson.model.AbstractBuild;

import hudson.plugins.analysis.core.AbstractHealthDescriptor;
import hudson.plugins.analysis.core.AbstractResultAction;
import hudson.plugins.analysis.core.BuildResult;
import hudson.plugins.analysis.core.PluginDescriptor;

/**
 * FIXME: Document type WarningsResultTotal.
 *
 * @author Ulli Hafner
 */
public class WarningsResultTotal extends AbstractResultAction<BuildResult>{

    /**
     * Creates a new instance of {@link WarningsResultTotal}.
     * @param owner
     * @param healthDescriptor
     */
    public WarningsResultTotal(final AbstractBuild<?, ?> owner, final AbstractHealthDescriptor healthDescriptor) {
        super(owner, healthDescriptor);
        // FIXME Auto-generated constructor stub
    }

    /** {@inheritDoc} */
    public String getDisplayName() {
        // FIXME Auto-generated method stub
        return null;
    }

    /** {@inheritDoc} */
    @Override
    protected PluginDescriptor getDescriptor() {
        // FIXME Auto-generated method stub
        return null;
    }

}

