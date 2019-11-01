/**
 */
package mETACON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mETACON.Dictionary#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see mETACON.METACONPackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends Element {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link mETACON.Element}.
	 * It is bidirectional and its opposite is '{@link mETACON.Element#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see mETACON.METACONPackage#getDictionary_Element()
	 * @see mETACON.Element#getDictionary
	 * @model opposite="dictionary" containment="true"
	 * @generated
	 */
	EList<Element> getElement();

} // Dictionary
