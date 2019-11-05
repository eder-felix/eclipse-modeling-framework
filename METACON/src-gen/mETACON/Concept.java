/**
 */
package mETACON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mETACON.Concept#getVis <em>Vis</em>}</li>
 *   <li>{@link mETACON.Concept#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link mETACON.Concept#getOwnedAction <em>Owned Action</em>}</li>
 * </ul>
 *
 * @see mETACON.METACONPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends Element {
	/**
	 * Returns the value of the '<em><b>Vis</b></em>' attribute.
	 * The literals are from the enumeration {@link mETACON.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vis</em>' attribute.
	 * @see mETACON.Visibility
	 * @see #setVis(Visibility)
	 * @see mETACON.METACONPackage#getConcept_Vis()
	 * @model
	 * @generated
	 */
	Visibility getVis();

	/**
	 * Sets the value of the '{@link mETACON.Concept#getVis <em>Vis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vis</em>' attribute.
	 * @see mETACON.Visibility
	 * @see #getVis()
	 * @generated
	 */
	void setVis(Visibility value);

	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' containment reference list.
	 * The list contents are of type {@link mETACON.Property}.
	 * It is bidirectional and its opposite is '{@link mETACON.Property#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property</em>' containment reference list.
	 * @see mETACON.METACONPackage#getConcept_OwnedProperty()
	 * @see mETACON.Property#getConcept
	 * @model opposite="concept" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedProperty();

	/**
	 * Returns the value of the '<em><b>Owned Action</b></em>' containment reference list.
	 * The list contents are of type {@link mETACON.Action}.
	 * It is bidirectional and its opposite is '{@link mETACON.Action#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Action</em>' containment reference list.
	 * @see mETACON.METACONPackage#getConcept_OwnedAction()
	 * @see mETACON.Action#getConcept
	 * @model opposite="concept" containment="true"
	 * @generated
	 */
	EList<Action> getOwnedAction();

} // Concept
