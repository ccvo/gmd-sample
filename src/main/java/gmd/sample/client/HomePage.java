package gmd.sample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HomePage extends Composite {

	interface Binder extends UiBinder<Widget, HomePage> {
	}
	private static Binder uiBinder = GWT.create(Binder.class);

	public HomePage() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}