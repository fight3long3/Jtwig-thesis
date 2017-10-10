/**
 * Class <code>PersonBean</code>.
 */
public class PersonBean implements java.io.Serializable {
    private String name;
    private boolean deceased;
 
    /** No-arg constructor (takes no arguments). */
    public PersonBean() {}
 
    /**
     * Property <code>name</code> (note capitalization) readable/writable.
     */
    public String getName() {
        return this.name;
    }
 
    /**
     * Setter for property <code>name</code>.
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }
 
    /**
     * Getter for property "deceased"
     * Different syntax for a boolean field (is vs. get)
     */
    public boolean isDeceased() {
        return this.deceased;
    }
 
    /**
     * Setter for property <code>deceased</code>.
     * @param deceased
     */
    public void setDeceased(final boolean deceased) {
        this.deceased = deceased;
    }
}