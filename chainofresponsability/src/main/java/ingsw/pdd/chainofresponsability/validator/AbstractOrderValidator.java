package ingsw.pdd.chainofresponsability.validator;

import java.util.ArrayList;
import java.util.List;
import ingsw.pdd.chainofresponsability.domain.order.AbstractOrder;

public abstract class AbstractOrderValidator {

	protected List<AbstractOrderValidator> validators = new ArrayList<AbstractOrderValidator>();

	public abstract void validate(AbstractOrder order) throws ValidationException;

	public void addValidator(AbstractOrderValidator validator) {
		validators.add(validator);
	}
}