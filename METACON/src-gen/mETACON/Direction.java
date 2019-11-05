/**
 */
package mETACON;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mETACON.METACONPackage#getDirection()
 * @model
 * @generated
 */
public enum Direction implements Enumerator {
	/**
	 * The '<em><b>Cin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIN_VALUE
	 * @generated
	 * @ordered
	 */
	CIN(0, "c_in", "c_in"),

	/**
	 * The '<em><b>Cout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUT_VALUE
	 * @generated
	 * @ordered
	 */
	COUT(1, "c_out", "c_out"),

	/**
	 * The '<em><b>Cinout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CINOUT_VALUE
	 * @generated
	 * @ordered
	 */
	CINOUT(2, "c_inout", "c_inout"),

	/**
	 * The '<em><b>Creturn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRETURN_VALUE
	 * @generated
	 * @ordered
	 */
	CRETURN(3, "c_return", "c_return");

	/**
	 * The '<em><b>Cin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIN
	 * @model name="c_in"
	 * @generated
	 * @ordered
	 */
	public static final int CIN_VALUE = 0;

	/**
	 * The '<em><b>Cout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUT
	 * @model name="c_out"
	 * @generated
	 * @ordered
	 */
	public static final int COUT_VALUE = 1;

	/**
	 * The '<em><b>Cinout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CINOUT
	 * @model name="c_inout"
	 * @generated
	 * @ordered
	 */
	public static final int CINOUT_VALUE = 2;

	/**
	 * The '<em><b>Creturn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRETURN
	 * @model name="c_return"
	 * @generated
	 * @ordered
	 */
	public static final int CRETURN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Direction[] VALUES_ARRAY = new Direction[] { CIN, COUT, CINOUT, CRETURN, };

	/**
	 * A public read-only list of all the '<em><b>Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Direction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Direction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Direction get(int value) {
		switch (value) {
		case CIN_VALUE:
			return CIN;
		case COUT_VALUE:
			return COUT;
		case CINOUT_VALUE:
			return CINOUT;
		case CRETURN_VALUE:
			return CRETURN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Direction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Direction
