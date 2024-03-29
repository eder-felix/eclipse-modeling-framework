/**
 */
package mETACON;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mETACON.METACONFactory
 * @model kind="package"
 * @generated
 */
public interface METACONPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mETACON";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mETACON";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mETACON";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	METACONPackage eINSTANCE = mETACON.impl.METACONPackageImpl.init();

	/**
	 * The meta object id for the '{@link mETACON.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.impl.ElementImpl
	 * @see mETACON.impl.METACONPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DICTIONARY = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mETACON.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.impl.ConceptImpl
	 * @see mETACON.impl.METACONPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__DICTIONARY = ELEMENT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Vis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__VIS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__OWNED_PROPERTY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__OWNED_ACTION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mETACON.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.impl.PropertyImpl
	 * @see mETACON.impl.METACONPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DICTIONARY = ELEMENT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONCEPT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mETACON.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.impl.DictionaryImpl
	 * @see mETACON.impl.METACONPackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__DICTIONARY = ELEMENT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mETACON.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.impl.ActionImpl
	 * @see mETACON.impl.METACONPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DICTIONARY = ELEMENT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONCEPT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_PARAMETER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mETACON.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.impl.ParameterImpl
	 * @see mETACON.impl.METACONPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DICTIONARY = ELEMENT__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ACTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mETACON.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.Visibility
	 * @see mETACON.impl.METACONPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 6;

	/**
	 * The meta object id for the '{@link mETACON.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mETACON.Direction
	 * @see mETACON.impl.METACONPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 7;

	/**
	 * Returns the meta object for class '{@link mETACON.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see mETACON.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link mETACON.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mETACON.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link mETACON.Element#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dictionary</em>'.
	 * @see mETACON.Element#getDictionary()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Dictionary();

	/**
	 * Returns the meta object for class '{@link mETACON.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see mETACON.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the attribute '{@link mETACON.Concept#getVis <em>Vis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vis</em>'.
	 * @see mETACON.Concept#getVis()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Vis();

	/**
	 * Returns the meta object for the containment reference list '{@link mETACON.Concept#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property</em>'.
	 * @see mETACON.Concept#getOwnedProperty()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_OwnedProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link mETACON.Concept#getOwnedAction <em>Owned Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Action</em>'.
	 * @see mETACON.Concept#getOwnedAction()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_OwnedAction();

	/**
	 * Returns the meta object for class '{@link mETACON.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see mETACON.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link mETACON.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mETACON.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link mETACON.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mETACON.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the container reference '{@link mETACON.Property#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Concept</em>'.
	 * @see mETACON.Property#getConcept()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Concept();

	/**
	 * Returns the meta object for class '{@link mETACON.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see mETACON.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link mETACON.Dictionary#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see mETACON.Dictionary#getElement()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Element();

	/**
	 * Returns the meta object for class '{@link mETACON.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see mETACON.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the container reference '{@link mETACON.Action#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Concept</em>'.
	 * @see mETACON.Action#getConcept()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Concept();

	/**
	 * Returns the meta object for the containment reference list '{@link mETACON.Action#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see mETACON.Action#getOwnedParameter()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_OwnedParameter();

	/**
	 * Returns the meta object for class '{@link mETACON.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see mETACON.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link mETACON.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mETACON.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the container reference '{@link mETACON.Parameter#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Action</em>'.
	 * @see mETACON.Parameter#getAction()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Action();

	/**
	 * Returns the meta object for the attribute '{@link mETACON.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see mETACON.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for enum '{@link mETACON.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see mETACON.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link mETACON.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see mETACON.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	METACONFactory getMETACONFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mETACON.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.impl.ElementImpl
		 * @see mETACON.impl.METACONPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__DICTIONARY = eINSTANCE.getElement_Dictionary();

		/**
		 * The meta object literal for the '{@link mETACON.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.impl.ConceptImpl
		 * @see mETACON.impl.METACONPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Vis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__VIS = eINSTANCE.getConcept_Vis();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__OWNED_PROPERTY = eINSTANCE.getConcept_OwnedProperty();

		/**
		 * The meta object literal for the '<em><b>Owned Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__OWNED_ACTION = eINSTANCE.getConcept_OwnedAction();

		/**
		 * The meta object literal for the '{@link mETACON.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.impl.PropertyImpl
		 * @see mETACON.impl.METACONPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CONCEPT = eINSTANCE.getProperty_Concept();

		/**
		 * The meta object literal for the '{@link mETACON.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.impl.DictionaryImpl
		 * @see mETACON.impl.METACONPackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__ELEMENT = eINSTANCE.getDictionary_Element();

		/**
		 * The meta object literal for the '{@link mETACON.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.impl.ActionImpl
		 * @see mETACON.impl.METACONPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONCEPT = eINSTANCE.getAction_Concept();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OWNED_PARAMETER = eINSTANCE.getAction_OwnedParameter();

		/**
		 * The meta object literal for the '{@link mETACON.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.impl.ParameterImpl
		 * @see mETACON.impl.METACONPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__ACTION = eINSTANCE.getParameter_Action();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

		/**
		 * The meta object literal for the '{@link mETACON.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.Visibility
		 * @see mETACON.impl.METACONPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link mETACON.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mETACON.Direction
		 * @see mETACON.impl.METACONPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //METACONPackage
