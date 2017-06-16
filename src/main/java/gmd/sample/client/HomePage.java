package gmd.sample.client;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SuggestOracle;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.addins.client.autocomplete.MaterialAutoComplete;
import gwt.material.design.client.ui.MaterialDatePicker;

public class HomePage extends Composite {

	interface Binder extends UiBinder<Widget, HomePage> {
	}
	private static Binder uiBinder = GWT.create(Binder.class);

	@UiField
	MaterialAutoComplete autoCompleteField;
	@UiField
	MaterialDatePicker dateField;
	
	public HomePage() {
		initWidget(uiBinder.createAndBindUi(this));
		dateField.setValue(new Date());
		UserSuggestion suggestions = new UserSuggestion();
		autoCompleteField.setSuggestions(suggestions);
	}

	private class UserSuggestion extends SuggestOracle {

		@Override
		public void requestSuggestions(Request request, Callback callback) {
			// TODO Auto-generated method stub
		}
	}
}