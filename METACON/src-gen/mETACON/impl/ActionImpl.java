/**
 */
package mETACON.impl;

import java.util.Collection;

import mETACON.Action;
import mETACON.Concept;
import mETACON.METACONPackage;
import mETACON.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mETACON.impl.ActionImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link mETACON.impl.ActionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link mETACON.impl.ActionImpl#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends ElementImpl implements Action {
	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputParameter() <em>Input Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> inputParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return METACONPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concept getConcept() {
		if (eContainerFeatureID() != METACONPackage.ACTION__CONCEPT)
			return null;
		return (Concept) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcept(Concept newConcept, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newConcept, METACONPackage.ACTION__CONCEPT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcept(Concept newConcept) {
		if (newConcept != eInternalContainer()
				|| (eContainerFeatureID() != METACONPackage.ACTION__CONCEPT && newConcept != null)) {
			if (EcoreUtil.isAncestor(this, newConcept))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcept != null)
				msgs = ((InternalEObject) newConcept).eInverseAdd(this, METACONPackage.CONCEPT__OWNED_ACTION,
						Concept.class, msgs);
			msgs = basicSetConcept(newConcept, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, METACONPackage.ACTION__CONCEPT, newConcept,
					newConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, METACONPackage.ACTION__RETURN_TYPE, oldReturnType,
					returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getInputParameter() {
		if (inputParameter == null) {
			inputParameter = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this,
					METACONPackage.ACTION__INPUT_PARAMETER, METACONPackage.PARAMETER__ACTION);
		}
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case METACONPackage.ACTION__CONCEPT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetConcept((Concept) otherEnd, msgs);
		case METACONPackage.ACTION__INPUT_PARAMETER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputParameter()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case METACONPackage.ACTION__CONCEPT:
			return basicSetConcept(null, msgs);
		case METACONPackage.ACTION__INPUT_PARAMETER:
			return ((InternalEList<?>) getInputParameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case METACONPackage.ACTION__CONCEPT:
			return eInternalContainer().eInverseRemove(this, METACONPackage.CONCEPT__OWNED_ACTION, Concept.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case METACONPackage.ACTION__CONCEPT:
			return getConcept();
		case METACONPackage.ACTION__RETURN_TYPE:
			return getReturnType();
		case METACONPackage.ACTION__INPUT_PARAMETER:
			return getInputParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case METACONPackage.ACTION__CONCEPT:
			setConcept((Concept) newValue);
			return;
		case METACONPackage.ACTION__RETURN_TYPE:
			setReturnType((String) newValue);
			return;
		case METACONPackage.ACTION__INPUT_PARAMETER:
			getInputParameter().clear();
			getInputParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case METACONPackage.ACTION__CONCEPT:
			setConcept((Concept) null);
			return;
		case METACONPackage.ACTION__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case METACONPackage.ACTION__INPUT_PARAMETER:
			getInputParameter().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case METACONPackage.ACTION__CONCEPT:
			return getConcept() != null;
		case METACONPackage.ACTION__RETURN_TYPE:
			return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
		case METACONPackage.ACTION__INPUT_PARAMETER:
			return inputParameter != null && !inputParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (returnType: ");
		result.append(returnType);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
