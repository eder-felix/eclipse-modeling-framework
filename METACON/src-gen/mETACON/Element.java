/**
 */
package mETACON;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mETACON.Element#getName <em>Name</em>}</li>
 *   <li>{@link mETACON.Element#getDictionary <em>Dictionary</em>}</li>
 * </ul>
 *
 * @see mETACON.METACONPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mETACON.METACONPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mETACON.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mETACON.Dictionary#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' container reference.
	 * @see #setDictionary(Dictionary)
	 * @see mETACON.METACONPackage#getElement_Dictionary()
	 * @see mETACON.Dictionary#getElement
	 * @model opposite="element" transient="false"
	 * @generated
	 */
	Dictionary getDictionary();

	/**
	 * Sets the value of the '{@link mETACON.Element#getDictionary <em>Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' container reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(Dictionary value);

} // Element
