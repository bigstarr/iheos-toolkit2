package gov.nist.toolkit.desktop.client.tools.AbstractTool;

import com.google.gwt.user.client.ui.Composite;

import javax.inject.Inject;

/**
 *
 */
public class ToolModule {
//    private static final TkGinInjector INJECTOR = TkGinInjector.INSTANCE;
//
//    private ToolPanel v = INJECTOR.getToolPanel();
//
//    private ToolPresenter p = INJECTOR.getToolPresenter();

    @Inject
    private ToolPanel v;

    @Inject
    private ToolPresenter p;

    @Inject
    public ToolModule() {
        assert(false);
        assert(v != null);
        assert(p != null);
        p.init(v);
    }

    public Composite widget() {
        assert(v != null);
        return v;
    }

}