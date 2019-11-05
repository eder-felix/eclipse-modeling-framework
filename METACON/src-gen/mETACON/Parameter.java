/**
 */
package mETACON;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mETACON.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link mETACON.Parameter#getAction <em>Action</em>}</li>
 *   <li>{@link mETACON.Parameter#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see mETACON.METACONPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mETACON.METACONPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mETACON.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mETACON.Action#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' container reference.
	 * @see #setAction(Action)
	 * @see mETACON.METACONPackage#getParameter_Action()
	 * @see mETACON.Action#getOwnedParameter
	 * @model opposite="ownedParameter" transient="false"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link mETACON.Parameter#getAction <em>Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' container reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link mETACON.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see mETACON.Direction
	 * @see #setDirection(Direction)
	 * @see mETACON.METACONPackage#getParameter_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link mETACON.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see mETACON.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Parameter
