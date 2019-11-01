/**
 */
package mETACON.impl;

import java.util.Collection;

import mETACON.Concept;
import mETACON.METACONPackage;
import mETACON.Property;
import mETACON.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mETACON.impl.ConceptImpl#getVis <em>Vis</em>}</li>
 *   <li>{@link mETACON.impl.ConceptImpl#getOwnedProperty <em>Owned Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptImpl extends ElementImpl implements Concept {
	/**
	 * The default value of the '{@link #getVis() <em>Vis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVis()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VIS_EDEFAULT = Visibility.CP_PUBLIC;

	/**
	 * The cached value of the '{@link #getVis() <em>Vis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVis()
	 * @generated
	 * @ordered
	 */
	protected Visibility vis = VIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedProperty() <em>Owned Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return METACONPackage.Literals.CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVis() {
		return vis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVis(Visibility newVis) {
		Visibility oldVis = vis;
		vis = newVis == null ? VIS_EDEFAULT : newVis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, METACONPackage.CONCEPT__VIS, oldVis, vis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedProperty() {
		if (ownedProperty == null) {
			ownedProperty = new EObjectContainmentWithInverseEList<Property>(Property.class, this,
					METACONPackage.CONCEPT__OWNED_PROPERTY, METACONPackage.PROPERTY__CONCEPT);
		}
		return ownedProperty;
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
		case METACONPackage.CONCEPT__OWNED_PROPERTY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedProperty()).basicAdd(otherEnd, msgs);
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
		case METACONPackage.CONCEPT__OWNED_PROPERTY:
			return ((InternalEList<?>) getOwnedProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case METACONPackage.CONCEPT__VIS:
			return getVis();
		case METACONPackage.CONCEPT__OWNED_PROPERTY:
			return getOwnedProperty();
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
		case METACONPackage.CONCEPT__VIS:
			setVis((Visibility) newValue);
			return;
		case METACONPackage.CONCEPT__OWNED_PROPERTY:
			getOwnedProperty().clear();
			getOwnedProperty().addAll((Collection<? extends Property>) newValue);
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
		case METACONPackage.CONCEPT__VIS:
			setVis(VIS_EDEFAULT);
			return;
		case METACONPackage.CONCEPT__OWNED_PROPERTY:
			getOwnedProperty().clear();
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
		case METACONPackage.CONCEPT__VIS:
			return vis != VIS_EDEFAULT;
		case METACONPackage.CONCEPT__OWNED_PROPERTY:
			return ownedProperty != null && !ownedProperty.isEmpty();
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
		result.append(" (vis: ");
		result.append(vis);
		result.append(')');
		return result.toString();
	}

} //ConceptImpl
