/**
 */
package mETACON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mETACON.Action#getConcept <em>Concept</em>}</li>
 *   <li>{@link mETACON.Action#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link mETACON.Action#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 *
 * @see mETACON.METACONPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Element {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mETACON.Concept#getOwnedAction <em>Owned Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' container reference.
	 * @see #setConcept(Concept)
	 * @see mETACON.METACONPackage#getAction_Concept()
	 * @see mETACON.Concept#getOwnedAction
	 * @model opposite="ownedAction" transient="false"
	 * @generated
	 */
	Concept getConcept();

	/**
	 * Sets the value of the '{@link mETACON.Action#getConcept <em>Concept</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' container reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(Concept value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see mETACON.METACONPackage#getAction_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link mETACON.Action#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Input Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link mETACON.Parameter}.
	 * It is bidirectional and its opposite is '{@link mETACON.Parameter#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter</em>' containment reference list.
	 * @see mETACON.METACONPackage#getAction_InputParameter()
	 * @see mETACON.Parameter#getAction
	 * @model opposite="action" containment="true"
	 * @generated
	 */
	EList<Parameter> getInputParameter();

} // Action
